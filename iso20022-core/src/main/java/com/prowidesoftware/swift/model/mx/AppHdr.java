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

import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;

/**
 * The business header is an optional part of the payload of an ISO 20022 message, and contains general information
 * that is relevant to the business applications that process the message.
 *
 * <p>When the header is used, its AppHdr element is a sibling of the Document element containing the specific message
 * type content. The parent wrapper structure that holds the AppHdr and Document is implementation/network specific
 * and not part of the scope of this model and parser.
 * <p>
 * As for the AppHdr there are at the moment two main specifications:
 * <ul>
 * <li>The ISO 20022 business application header such as the head.001.001.01.</li>
 * <li>The legacy application header originally defined by SWIFT: $ahV10</li>
 * </ul>
 * <p>
 * This interface exports shared information applicable to all header implementations (legacy and ISO based).
 *
 * @since 9.0.1
 */
public interface AppHdr {
    String HEADER_LOCALNAME = "AppHdr";

    /**
     * Gets the header sender form the "Fr" element.
     *
     * <p>The From element is used for the identification of the sender, whether as a BIC, a name and address, a
     * proprietary identification or a Uniform Resource Identifier (URI).
     *
     * @return the sender BIC code or null if the element is not found
     */
    String from();

    /**
     * Gets the header receiver form the "To" element.
     *
     * <p>The To element is used for identification of the receiver, whether as a BIC, a name and address, a
     * proprietary identification or a Uniform Resource Identifier (URI).
     *
     * @return the receiver BIC code or null if the element is not found
     */
    String to();

    /**
     * Gets the message reference from the "BizMsgIdr" (BAH) or "MsgRef" (AH) element.
     *
     * @return the message reference from the header or null if the element is not found
     */
    String reference();

    /**
     * Gets the message name from the "MsgDefIdr" (BAH) or "MsgName" (AH) element.
     *
     * @return the message name from the header or null if the element is not found
     */
    String messageName();

    /**
     * Gets the service name from the "BizSvc" (BAH) or "SvcName" (AH) element.
     *
     * @return the service name from the header or null if the element is not found
     */
    String serviceName();

    /**
     * Gets the duplicate flag from the "PssblDplct" (BAH) or "Dup" (AH) element
     *
     * @return true if the element is present, false otherwise
     */
    boolean duplicate();

    /**
     * Gets the message creation date from the "CreDate" (BAH) or "CrDate" (AH) element.
     *
     * @return found date or null if the element is not found
     */
    XMLGregorianCalendar creationDate();

    /**
     * Sets the creation date in the header object with current moment in UTC time zone.
     *
     * @param overwrite if true, the creation date will always be set overwriting any previous value;
     *                  if false it will be set only if it is not already set
     */
    void setCreationDate(boolean overwrite);

    /**
     * Get this header as an XML string.
     * <p>The implementation uses {@link #xml(MxWriteParams)} with no prefix and no XML declaration.
     *
     * @return header serialized into XML string or null in case of unexpected error
     */
    default String xml() {
        return xml(new MxWriteParams());
    }

    /**
     * Get this header as an XML string.
     *
     * @param params not null marshalling parameters
     * @return header serialized into XML string or null in case of unexpected error
     * @since 9.2.6
     */
    String xml(MxWriteParams params);

    /**
     * Gets the header as an Element object.
     */
    Element element();

    /**
     * Gets the specific namespace of the header
     *
     * @return default implementation returns null
     * @since 9.1.7
     */
    default String namespace() {
        return null;
    }
}
