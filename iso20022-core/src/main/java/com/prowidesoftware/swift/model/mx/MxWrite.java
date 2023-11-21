/*
 * Copyright 2006-2023 Prowide
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

import com.prowidesoftware.deprecation.DeprecationUtils;
import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;

/**
 * @deprecated use the {@link MxWriteImpl} directly
 */
@Deprecated
@ProwideDeprecated(phase3 = TargetYear.SRU2024)
public interface MxWrite {

    /**
     * @deprecated use {@link MxWriteImpl#write(String, AbstractMX, Class[], MxWriteParams)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase4 = TargetYear.SRU2024)
    String message(
            String namespace, AbstractMX obj, Class[] classes, final String prefix, boolean includeXMLDeclaration);

    /**
     * @deprecated use {@link MxWriteImpl#write(String, AbstractMX, Class[], MxWriteParams)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2024)
    default String message(
            String namespace,
            AbstractMX obj,
            Class[] classes,
            final String prefix,
            boolean includeXMLDeclaration,
            EscapeHandler escapeHandler) {
        DeprecationUtils.phase2(
                AbstractMX.class,
                "message(String, AbstractMX, Class[], String, boolean, EscapeHandler)",
                "Use MxWriteImpl.write(String, AbstractMX, Class[], MxWriteParams) instead");
        return message(namespace, obj, classes, prefix, includeXMLDeclaration, null);
    }
}
