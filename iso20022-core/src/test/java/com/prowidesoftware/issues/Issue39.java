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

import com.prowidesoftware.swift.model.mx.MxAdmi00700101;
import com.prowidesoftware.swift.model.mx.dic.SupplementaryDataEnvelope1;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Element;

/**
 * https://github.com/prowide/prowide-iso20022/issues/39
 *
 * <p>Parsing an admi.007.001.01 message dropped the {@code SplmtryData/Envlp} content. The
 * {@code <Document>} declares a default namespace, so {@code <FromBOData>} (un-prefixed) belongs to the
 * message main namespace; the wildcard content is now captured as a {@link org.w3c.dom.Element}.
 */
public class Issue39 {

    // Payload as posted in the issue.
    private static final String XML = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n"
            + "<Body>\n"
            + "    <AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">\n"
            + "        <Fr>\n"
            + "            <FIId>\n"
            + "                <FinInstnId>\n"
            + "                    <BICFI>XXXXXXXXXXX</BICFI>\n"
            + "                </FinInstnId>\n"
            + "            </FIId>\n"
            + "        </Fr>\n"
            + "        <To>\n"
            + "            <FIId>\n"
            + "                <FinInstnId>\n"
            + "                    <BICFI>XXXXXXXXXXX</BICFI>\n"
            + "                </FinInstnId>\n"
            + "            </FIId>\n"
            + "        </To>\n"
            + "        <BizMsgIdr>XXXXXXX</BizMsgIdr>\n"
            + "        <MsgDefIdr>admi.007.001.01</MsgDefIdr>\n"
            + "        <CreDt>2022-01-11T15:02:09Z</CreDt>\n"
            + "    </AppHdr>\n"
            + "    <Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:admi.007.001.01\">\n"
            + "        <RctAck>\n"
            + "            <MsgId>\n"
            + "                <MsgId>XXXXXXX</MsgId>\n"
            + "            </MsgId>\n"
            + "            <Rpt>\n"
            + "                <RltdRef>\n"
            + "                    <Ref>XXXXXX</Ref>\n"
            + "                </RltdRef>\n"
            + "                <ReqHdlg>\n"
            + "                    <StsCd>ACKT</StsCd>\n"
            + "                    <Desc>CR50</Desc>\n"
            + "                </ReqHdlg>\n"
            + "            </Rpt>\n"
            + "            <SplmtryData>\n"
            + "                <Envlp>\n"
            + "                    <FromBOData>TOTO</FromBOData>\n"
            + "                </Envlp>\n"
            + "            </SplmtryData>\n"
            + "        </RctAck>\n"
            + "    </Document>\n"
            + "</Body>";

    @Test
    public void test() {
        MxAdmi00700101 mx = MxAdmi00700101.parse(XML);
        assertThat(mx).isNotNull();
        assertThat(mx.getRctAck().getRpt().get(0).getReqHdlg().getStsCd()).isEqualTo("ACKT");

        SupplementaryDataEnvelope1 envlp =
                mx.getRctAck().getSplmtryData().get(0).getEnvlp();
        Element any = (Element) envlp.getAny();
        assertThat(any).isNotNull();
        assertThat(any.getLocalName()).isEqualTo("FromBOData");
        assertThat(any.getTextContent().trim()).isEqualTo("TOTO");
    }
}
