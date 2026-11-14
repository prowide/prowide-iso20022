/*
 * Copyright 2006-2026 Prowide
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.MxNode;

/**
 * Scope in which the {@link DefaultMxMetadataStrategy} builds the generic node tree of a message once and reuses it
 * for every metadata it extracts (reference, amount, value date and both checksums), instead of rebuilding it on
 * each call.
 *
 * <p>The scope is bound to the current thread and keyed by the message instance: the tree is reused for the same
 * {@link AbstractMX} object, so the model must not be modified while the scope is open. It is opened by
 * {@code MxSwiftMessage} around the metadata extraction and closed right after it; outside a scope every strategy
 * call reads the model again.
 *
 * <pre>
 * try (MxMetadataScope scope = MxMetadataScope.open()) {
 *     strategy.reference(mx);
 *     strategy.checksum(mx);
 * }
 * </pre>
 *
 * <p>Internal class, not part of the public API contract.
 *
 * @since 10.4.1
 */
public final class MxMetadataScope implements AutoCloseable {
    private static final ThreadLocal<MxMetadataScope> CURRENT = new ThreadLocal<>();

    private final MxMetadataScope outer;

    /** the message whose trees are cached, compared by identity */
    private AbstractMX message;

    private MxNode documentNode;
    private boolean documentNodeBuilt;
    private String headerCanonical;
    private boolean headerCanonicalBuilt;

    private MxMetadataScope(MxMetadataScope outer) {
        this.outer = outer;
    }

    /**
     * Opens a scope on the current thread; it must be closed by the same thread, preferably with try-with-resources.
     * Scopes can be nested, the inner one is used until closed.
     */
    public static MxMetadataScope open() {
        final MxMetadataScope scope = new MxMetadataScope(CURRENT.get());
        CURRENT.set(scope);
        return scope;
    }

    @Override
    public void close() {
        if (outer != null) {
            CURRENT.set(outer);
        } else {
            CURRENT.remove();
        }
        message = null;
        documentNode = null;
        headerCanonical = null;
    }

    /**
     * @return the scope open on the current thread, or null
     */
    static MxMetadataScope current() {
        return CURRENT.get();
    }

    /**
     * The cached Document tree of the message, built with the given supplier on first use.
     */
    MxNode documentNode(AbstractMX mx, java.util.function.Function<AbstractMX, MxNode> builder) {
        bindTo(mx);
        if (!documentNodeBuilt) {
            documentNode = builder.apply(mx);
            documentNodeBuilt = true;
        }
        return documentNode;
    }

    /**
     * The cached canonical form of the message header, built with the given supplier on first use (null when the
     * message has no header or it cannot be serialized).
     */
    String headerCanonical(AbstractMX mx, java.util.function.Function<AbstractMX, String> builder) {
        bindTo(mx);
        if (!headerCanonicalBuilt) {
            headerCanonical = builder.apply(mx);
            headerCanonicalBuilt = true;
        }
        return headerCanonical;
    }

    private void bindTo(AbstractMX mx) {
        if (message != mx) {
            message = mx;
            documentNode = null;
            documentNodeBuilt = false;
            headerCanonical = null;
            headerCanonicalBuilt = false;
        }
    }
}
