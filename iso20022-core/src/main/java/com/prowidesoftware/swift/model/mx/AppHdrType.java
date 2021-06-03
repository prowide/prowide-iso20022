/*
 * Copyright 2006-2021 Prowide
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

import org.apache.commons.lang3.StringUtils;

/**
 * @since 9.1.2
 */
public enum AppHdrType {
    LEGACY(LegacyAppHdr.NAMESPACE, LegacyAppHdr.class),
    BAH_V1(BusinessAppHdrV01.NAMESPACE, BusinessAppHdrV01.class),
    BAH_V2(BusinessAppHdrV02.NAMESPACE, BusinessAppHdrV02.class);

    private String namespace;
    private Class headerClass;

    AppHdrType(String namespace, Class headerClass) {
        this.namespace = namespace;
        this.headerClass = headerClass;
    }

    /**
     * @param namespace of the Header
     * @return a Class of the Header Implementation
     * @since 9.1.7
     */
    public static Class of(String namespace) {
        if (StringUtils.isNotBlank(namespace)) {
            for (AppHdrType appHdrType : AppHdrType.values()) {
                if (appHdrType.getNamespace().equals(namespace)) {
                    return appHdrType.headerClass;
                }
            }
        }
        return LegacyAppHdr.class;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public Class getHeaderClass() {
        return this.headerClass;
    }

}