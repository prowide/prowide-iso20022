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

import java.io.Reader;
import java.io.StringReader;

/**
 * The lenient view of an MX payload: the content with undeclared AppHdr/Document prefixes already stripped, plus
 * the position where a synthetic {@code <RequestPayload>} wrapper must be virtually inserted when the payload has
 * sibling AppHdr and Document root elements (see {@link MxParseUtils#normalizeLenientPayload(String)}).
 *
 * <p>The wrapper is never materialized into a new String by the {@code reader()} methods: consumers parse through a
 * {@link ConcatReader} composing the prolog, the wrapper tags and the original payload characters, avoiding a
 * payload-sized allocation on the file-format path. Each call returns a fresh single-use Reader over the same
 * backing String.
 *
 * @since 10.3.10
 */
final class LenientPayload {
    static final String WRAP_OPEN = "<RequestPayload>";
    static final String WRAP_CLOSE = "</RequestPayload>";

    private final String xml;
    private final int wrapPos;

    /**
     * @param xml     the payload with undeclared prefixes already stripped, NOT wrapped
     * @param wrapPos offset where the wrapper open tag must be inserted (end of the prolog), or -1 when no wrap is
     *                needed
     */
    LenientPayload(String xml, int wrapPos) {
        this.xml = xml;
        this.wrapPos = wrapPos;
    }

    /**
     * The stripped, unwrapped content; safe for scanners that only visit the first root element (AppHdr namespace
     * or element detection, header tag lookups).
     */
    String xml() {
        return xml;
    }

    boolean needsWrap() {
        return wrapPos >= 0;
    }

    /**
     * Fresh reader over the virtually wrapped content, byte-per-byte equivalent to parsing
     * {@link #materialize()}; the payload characters are not copied.
     */
    Reader reader() {
        if (wrapPos < 0) {
            return new StringReader(xml);
        }
        return reader(xml.substring(0, wrapPos));
    }

    /**
     * Same as {@link #reader()} but with the XML declaration fixed by
     * {@link MxParseUtils#makeXmlLenient(String)}, for consumers that parse leniently (header parsing and
     * metadata scanners). The declaration lives in the prolog, so on the wrapped path only that small segment is
     * rewritten, never the payload.
     */
    Reader lenientReader() {
        if (wrapPos < 0) {
            return new StringReader(MxParseUtils.makeXmlLenient(xml));
        }
        return reader(MxParseUtils.makeXmlLenient(xml.substring(0, wrapPos)));
    }

    private Reader reader(String prolog) {
        return new ConcatReader(
                new String[] {prolog, WRAP_OPEN, xml, WRAP_CLOSE},
                new int[] {0, 0, wrapPos, 0},
                new int[] {prolog.length(), WRAP_OPEN.length(), xml.length(), WRAP_CLOSE.length()});
    }

    /**
     * Materializes the normalized content as a String; used only by the String-based public API
     * ({@link MxParseUtils#normalizeLenientPayload(String)}), internal consumers use the readers.
     */
    String materialize() {
        if (wrapPos < 0) {
            return xml;
        }
        return xml.substring(0, wrapPos) + WRAP_OPEN + xml.substring(wrapPos) + WRAP_CLOSE;
    }
}
