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

/**
 * Enumeration of the envelope types use when serializing an MX message into an XML.
 * <p>
 * The envelope is the root structure used to bind an AppHdr and Document into a single XML.
 * This is used in the {@link MxWriteConfiguration} to customize the XML serialization.
 *
 * @since 9.5.0
 */
public enum EnvelopeType {
    /**
     * The envelope is a SWIFT "Envelope"
     */
    SWIFT("Envelope", "urn:swift:xsd:envelope", null),
    /**
     * The envelope is an ISO 20022 "BizMsgEnvlp"
     */
    BME_V1("BizMsgEnvlp", "urn:iso:std:iso:20022:tech:xsd:nvlp.001.001.01", "env"),
    /**
     * The envelope is an ISO 20022 "BizMsgEnvlp"
     */
    BME_V2("BizMsgEnvlp", "urn:iso:std:iso:20022:tech:xsd:nvlp.001.001.02", "env"),
    /**
     * The envelope is a custom structure, with default root element "RequestPayload"
     */
    CUSTOM("RequestPayload", null, null);

    private final String rootElement;
    private final String namespace;
    private final String prefix;

    EnvelopeType(String rootElement, String namespace, String prefix) {
        this.rootElement = rootElement;
        this.namespace = namespace;
        this.prefix = prefix;
    }

    public String rootElement() {
        return rootElement;
    }

    public String namespace() {
        return namespace;
    }

    public String prefix() {
        return prefix;
    }
}
