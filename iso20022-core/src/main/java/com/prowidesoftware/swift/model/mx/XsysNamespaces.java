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

/**
 * Specific prefixes for SNL namespaces used in Mx system messages
 *
 * @since 7.9.3
 */
enum XsysNamespaces {
    DOC("nsDoc", "urn:swift:snl:ns.Doc"),
    SW("Sw", "urn:swift:snl:ns.Sw"),
    SWGBL("SwGbl", "urn:swift:snl:ns.SwGbl"),
    SWINT("SwInt", "urn:swift:snl:ns.SwInt"),
    SWSEC("SwSec", "urn:swift:snl:ns.SwSec");

    private String prefix;
    private String namespaceURI;

    XsysNamespaces(final String prefix, final String namespaceURI) {
        this.prefix = prefix;
        this.namespaceURI = namespaceURI;
    }

    /**
     * @return specific mapped prefix for the namespace or null if none matched
     */
    static String prefix(final String namespaceURI) {
        for (XsysNamespaces n : XsysNamespaces.values()) {
            if (n.namespaceURI().equals(namespaceURI)) {
                return n.prefix();
            }
        }
        return null;
    }

    /**
     * @return specific mapped prefix for the namespace or null if none matched
     */
    static String namespaceURI(final String prefix) {
        for (XsysNamespaces n : XsysNamespaces.values()) {
            if (n.prefix().equals(prefix)) {
                return n.namespaceURI();
            }
        }
        return null;
    }

    String namespaceURI() {
        return this.namespaceURI;
    }

    String prefix() {
        return this.prefix;
    }

}