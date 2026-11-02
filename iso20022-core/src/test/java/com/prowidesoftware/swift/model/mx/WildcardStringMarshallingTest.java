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

import static org.assertj.core.api.Assertions.assertThat;

import com.prowidesoftware.swift.model.mx.dic.SupplementaryDataEnvelope1;
import com.prowidesoftware.swift.utils.Lib;
import java.io.StringWriter;
import java.util.Collections;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Element;

/**
 * Serialization of a message whose {@code @XmlAnyElement} wildcard content is the raw XML {@link String} written by
 * {@code toJson()}, as left by any JSON reader other than {@code AbstractMX.fromJson} (an application mapper, a deep
 * copy). JAXB cannot marshal such a String, so the writers restore it to a DOM element and retry (PW-3610).
 */
class WildcardStringMarshallingTest {

    private static final String SAMPLE = "issues/11/samplemsg.002.001.08-SplmtryData_with_namespace.xml";

    @Test
    void documentWithStringEnvelope_isMarshalled() throws Exception {
        MxPacs00200108 mx = MxPacs00200108.parse(Lib.readResource(SAMPLE));
        SupplementaryDataEnvelope1 envelope = envelope(mx);
        envelope.setAny(toXml((Element) envelope.getAny()));

        String document = mx.document();

        assertThat(document).isNotNull().contains("InstrForCdtrAcct").contains("RsdntSts");
        assertThat(document).doesNotContain("&lt;");
        assertThat(envelope.getAny()).isInstanceOf(Element.class);
    }

    @Test
    void headerWithStringSignature_isMarshalled() throws Exception {
        MxPacs00200108 mx = MxPacs00200108.parse(Lib.readResource(SAMPLE));
        BusinessAppHdrV01 header = (BusinessAppHdrV01) mx.getAppHdr();
        header.getSgntr().setAny(toXml((Element) header.getSgntr().getAny()));

        assertThat(header.xml()).isNotNull().contains("Signature").doesNotContain("&lt;");
        assertThat(header.getSgntr().getAny()).isInstanceOf(Element.class);
    }

    @Test
    void messageWithStringEnvelopeAndSignature_isMarshalled() throws Exception {
        MxPacs00200108 mx = MxPacs00200108.parse(Lib.readResource(SAMPLE));
        SupplementaryDataEnvelope1 envelope = envelope(mx);
        envelope.setAny(toXml((Element) envelope.getAny()));
        BusinessAppHdrV01 header = (BusinessAppHdrV01) mx.getAppHdr();
        header.getSgntr().setAny(toXml((Element) header.getSgntr().getAny()));

        String message = mx.message();

        assertThat(message).isNotNull().contains("AppHdr").contains("Signature").contains("InstrForCdtrAcct");
        assertThat(message).doesNotContain("&lt;");
    }

    @Test
    void elementOfStringEnvelope_isBuilt() throws Exception {
        MxPacs00200108 mx = MxPacs00200108.parse(Lib.readResource(SAMPLE));
        SupplementaryDataEnvelope1 envelope = envelope(mx);
        envelope.setAny(toXml((Element) envelope.getAny()));

        assertThat(mx.element()).isNotNull();
        assertThat(envelope.getAny()).isInstanceOf(Element.class);
    }

    @Test
    void wildcardThatCannotBeRepaired_stillFails() throws Exception {
        MxPacs00200108 mx = MxPacs00200108.parse(Lib.readResource(SAMPLE));
        envelope(mx).setAny(Collections.singletonMap("key", "value"));

        assertThat(mx.document()).isNull();
    }

    @Test
    void wildcardWithNonXmlString_returnsNullAsBefore() throws Exception {
        MxPacs00200108 mx = MxPacs00200108.parse(Lib.readResource(SAMPLE));
        envelope(mx).setAny("plain text, not xml");
        BusinessAppHdrV01 header = (BusinessAppHdrV01) mx.getAppHdr();
        header.getSgntr().setAny("plain text, not xml");

        // the repair cannot parse the string: the writers must keep returning null instead of leaking the parse error
        assertThat(mx.document()).isNull();
        assertThat(header.xml()).isNull();
        assertThat(header.element()).isNull();
        assertThat(mx.element()).isNull();
        assertThat(envelope(mx).getAny()).isEqualTo("plain text, not xml");
    }

    private static SupplementaryDataEnvelope1 envelope(MxPacs00200108 mx) {
        return mx.getFIToFIPmtStsRpt()
                .getTxInfAndSts()
                .get(0)
                .getSplmtryData()
                .get(0)
                .getEnvlp();
    }

    private static String toXml(Element element) throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        StringWriter xml = new StringWriter();
        transformer.transform(new DOMSource(element), new StreamResult(xml));
        return xml.toString();
    }
}
