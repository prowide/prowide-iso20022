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
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Element;

/**
 * Regression coverage for the AnyTagParsing issues (#39, #41, #43, PWUS-18): xsd:any wildcard content
 * (SplmtryData/Envlp payloads and signature envelopes) must be captured as org.w3c.dom.Element on parse,
 * preserved on XML round-trip, and serialized/restored through JSON instead of being dropped.
 */
class WildcardAnyParsingTest {

    /** Foreign-namespace SplmtryData/Envlp payload must be captured as a DOM Element (PWUS-18). */
    @Test
    void capturesForeignNamespaceSupplementaryData() throws IOException {
        MxPacs00200108 mx =
                MxPacs00200108.parse(Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_with_namespace.xml"));

        Element any = (Element) envelope(mx).getAny();
        assertThat(any).isNotNull();
        assertThat(any.getLocalName()).isEqualTo("InstrForCdtrAcct");
        assertThat(any.getNamespaceURI()).isEqualTo("foo");
        assertThat(any.getElementsByTagNameNS("foo", "RsdntSts").getLength()).isEqualTo(1);
    }

    /** No-namespace wildcard content must be captured too (#39). */
    @Test
    void capturesNoNamespaceSupplementaryData() throws IOException {
        MxPacs00200108 mx =
                MxPacs00200108.parse(Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_no_prefix.xml"));

        Element any = (Element) envelope(mx).getAny();
        assertThat(any).isNotNull();
        assertThat(any.getLocalName()).isEqualTo("InstrForCdtrAcct");
    }

    /** Namespaced signature envelope in the header must be captured (#43). */
    @Test
    void capturesSignatureEnvelope() throws IOException {
        MxPacs00200108 mx =
                MxPacs00200108.parse(Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_with_namespace.xml"));

        BusinessAppHdrV01 h = (BusinessAppHdrV01) mx.getAppHdr();
        Element sgntr = (Element) h.getSgntr().getAny();
        assertThat(sgntr).isNotNull();
        assertThat(sgntr.getLocalName()).isEqualTo("Signature");
        assertThat(sgntr.getNamespaceURI()).isEqualTo("http://www.w3.org/2000/09/xmldsig#");
    }

    /** XML -> model -> XML round-trip preserves the wildcard payload. */
    @Test
    void xmlRoundTripPreservesWildcard() throws IOException {
        MxPacs00200108 mx =
                MxPacs00200108.parse(Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_with_namespace.xml"));

        String xml = mx.message();
        assertThat(xml).contains("InstrForCdtrAcct").contains("RsdntSts").contains("foo");
    }

    /** toJson emits the wildcard content (not {}), and fromJson restores it as a DOM Element. */
    @Test
    void jsonRoundTripPreservesWildcard() throws IOException {
        MxPacs00200108 mx =
                MxPacs00200108.parse(Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_with_namespace.xml"));

        String json = mx.toJson();
        assertThat(json).contains("InstrForCdtrAcct");
        assertThat(json).doesNotContain("\"any\": {}");

        MxPacs00200108 restored = MxPacs00200108.fromJson(json);
        Element any = (Element) envelope(restored).getAny();
        assertThat(any).isNotNull();
        assertThat(any.getLocalName()).isEqualTo("InstrForCdtrAcct");

        // the restored Element must re-marshal back to XML (a String would be escaped, not an element)
        assertThat(restored.message()).contains("InstrForCdtrAcct").contains("RsdntSts");
    }

    private static SupplementaryDataEnvelope1 envelope(MxPacs00200108 mx) {
        return mx.getFIToFIPmtStsRpt()
                .getTxInfAndSts()
                .get(0)
                .getSplmtryData()
                .get(0)
                .getEnvlp();
    }
}
