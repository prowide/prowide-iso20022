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
package com.prowidesoftware.issues;

import static org.assertj.core.api.Assertions.assertThat;

import com.prowidesoftware.swift.model.mx.BusinessAppHdrV01;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Element;

/**
 * https://github.com/prowide/prowide-iso20022/issues/43
 *
 * <p>Parsing a BusinessAppHdrV01 whose {@code Sgntr/SignatureEnvelope} wildcard element is declared with a
 * default (un-prefixed) foreign namespace ({@code xmlns="http://www.w3.org/2000/09/xmldsig#"}) left the
 * {@code any} field null. The reporter noted it worked with a prefixed namespace declaration but not with a
 * default one. The signature envelope is now captured as a {@link org.w3c.dom.Element}.
 */
public class Issue43 {

    @Test
    public void test() {
        // Header reproducing the issue: schemaLocation present, signature in a default foreign namespace.
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<AppHdr xsi:schemaLocation=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01 head.001.001.01.xsd\""
                + "        xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\""
                + "        xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
                + "  <Fr><FIId><FinInstnId><BICFI>AAAAUS00</BICFI></FinInstnId></FIId></Fr>"
                + "  <To><FIId><FinInstnId><BICFI>BBBBUS00</BICFI></FinInstnId></FIId></To>"
                + "  <BizMsgIdr>X</BizMsgIdr>"
                + "  <MsgDefIdr>pacs.008.001.03</MsgDefIdr>"
                + "  <CreDt>2022-01-11T15:02:09Z</CreDt>"
                + "  <Sgntr>"
                + "    <XMLSgntrs xmlns=\"http://www.w3.org/2000/09/xmldsig#\">"
                + "      <SignatureValue>abc</SignatureValue>"
                + "    </XMLSgntrs>"
                + "  </Sgntr>"
                + "</AppHdr>";

        BusinessAppHdrV01 h = BusinessAppHdrV01.parse(xml);
        assertThat(h).isNotNull();
        assertThat(h.getSgntr()).isNotNull();

        Element any = (Element) h.getSgntr().getAny();
        assertThat(any).isNotNull();
        assertThat(any.getLocalName()).isEqualTo("XMLSgntrs");
        assertThat(any.getNamespaceURI()).isEqualTo("http://www.w3.org/2000/09/xmldsig#");
    }
}
