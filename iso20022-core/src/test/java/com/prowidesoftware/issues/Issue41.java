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

import com.prowidesoftware.swift.model.mx.sys.MxXsys00300101;
import com.prowidesoftware.swift.model.mx.sys.dic.SwAny;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Element;

/**
 * https://github.com/prowide/prowide-iso20022/issues/41
 *
 * <p>{@code ThirdPartyRefusalReason} in xsys.003.001.01 is of type {@code SwAny}, which is bound to
 * {@code @XmlAnyElement List<Element>}: it captures child <b>elements</b>, never plain text. The issue
 * reported the field with text content ({@code <Sw:ThirdPartyRefusalReason>ABCD</...>}); such text has
 * no place in the model and is therefore not captured (see {@link #textContentIsNotCapturedByDesign()}).
 * Child element content, which previously was dropped by the namespace filter, is now captured (see
 * {@link #childElementContentIsCaptured()}).
 */
public class Issue41 {

    /**
     * The payload exactly as posted in the issue: a 4-character text in {@code ThirdPartyRefusalReason}.
     * {@code SwAny.any} is a {@code List<Element>}, so the text cannot be bound; the list stays empty.
     * This is a model/schema characteristic (the type only allows child elements), not a parser bug.
     */
    @Test
    public void textContentIsNotCapturedByDesign() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:xsys.003.001.01\" xmlns:Sw=\"urn:swift:snl:ns.Sw\">"
                + "  <Doc:xsys.003.001.01>"
                + "    <Doc:AuthstnRfslNtfctn>"
                + "      <Sw:SnFRef>swi00001</Sw:SnFRef>"
                + "      <Sw:ThirdPartyRefusalReason>ABCD</Sw:ThirdPartyRefusalReason>"
                + "    </Doc:AuthstnRfslNtfctn>"
                + "  </Doc:xsys.003.001.01>"
                + "</Doc:Document>";

        MxXsys00300101 mx = MxXsys00300101.parse(xml);
        assertThat(mx).isNotNull();

        SwAny swAny = mx.getXsys00300101().getAuthstnRfslNtfctn().getThirdPartyRefusalReason();
        assertThat(swAny).isNotNull();
        assertThat(swAny.getAny()).isEmpty();
    }

    /**
     * Realistic xsd:any usage: {@code ThirdPartyRefusalReason} carries a child element. A
     * foreign-namespace child was previously dropped by the namespace filter; it is now captured as a
     * {@link org.w3c.dom.Element}.
     */
    @Test
    public void childElementContentIsCaptured() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:xsys.003.001.01\" xmlns:Sw=\"urn:swift:snl:ns.Sw\">"
                + "  <Doc:xsys.003.001.01>"
                + "    <Doc:AuthstnRfslNtfctn>"
                + "      <Sw:SnFRef>swi00001</Sw:SnFRef>"
                + "      <Sw:ThirdPartyRefusalReason>"
                + "        <Rsn xmlns=\"urn:example:refusal\">ABCD</Rsn>"
                + "      </Sw:ThirdPartyRefusalReason>"
                + "    </Doc:AuthstnRfslNtfctn>"
                + "  </Doc:xsys.003.001.01>"
                + "</Doc:Document>";

        MxXsys00300101 mx = MxXsys00300101.parse(xml);
        assertThat(mx).isNotNull();

        SwAny swAny = mx.getXsys00300101().getAuthstnRfslNtfctn().getThirdPartyRefusalReason();
        assertThat(swAny).isNotNull();
        List<Element> any = swAny.getAny();
        assertThat(any).hasSize(1);
        assertThat(any.get(0).getLocalName()).isEqualTo("Rsn");
        assertThat(any.get(0).getNamespaceURI()).isEqualTo("urn:example:refusal");
        assertThat(any.get(0).getTextContent().trim()).isEqualTo("ABCD");
    }
}
