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

import static org.junit.jupiter.api.Assertions.*;

import com.prowidesoftware.swift.model.MxBusinessProcess;
import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.model.SettlementInfo;
import com.prowidesoftware.swift.model.SettlementMethod;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import java.util.List;
import java.util.Optional;
import javax.xml.stream.XMLStreamException;
import org.junit.jupiter.api.Test;

public class MxParseUtilsTest {

    final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>"
            + "<Saa:DataPDU xmlns:Saa=\"urn:swift:saa:xsd:saa.2.0\" xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwInt=\"urn:swift:snl:ns.SwInt\" xmlns:SwGbl=\"urn:swift:snl:ns.SwGbl\" xmlns:SwSec=\"urn:swift:snl:ns.SwSec\">"
            + "  <Saa:Revision>2.0.10</Saa:Revision>"
            + "  <Saa:Header>"
            + "    <Saa:Message>"
            + "      <Saa:SenderReference>OYYYXXX33XXX009$2411012329271</Saa:SenderReference>"
            + "      <Saa:MessageIdentifier>pacs.009.001.08</Saa:MessageIdentifier>"
            + "      <Saa:Format>MX</Saa:Format>"
            + "      <Saa:SubFormat>Output</Saa:SubFormat>"
            + "      <Saa:Sender>"
            + "        <Saa:DN>ou=xxx,o=yyyxxx33,o=swift</Saa:DN>"
            + "        <Saa:FullName>"
            + "          <Saa:X1>YYYXXX33XXX</Saa:X1>"
            + "          <Saa:X2>xxx</Saa:X2>"
            + "        </Saa:FullName>"
            + "      </Saa:Sender>"
            + "      <Saa:Receiver>"
            + "        <Saa:DN>ou=xxx,o=fooozz33,o=swift</Saa:DN>"
            + "        <Saa:FullName>"
            + "          <Saa:X1>FOOOZZ33XXX</Saa:X1>"
            + "          <Saa:X2>xxx</Saa:X2>"
            + "        </Saa:FullName>"
            + "      </Saa:Receiver>"
            + "      <Saa:InterfaceInfo>"
            + "        <Saa:MessageCreator>SWIFTNetInterface</Saa:MessageCreator>"
            + "        <Saa:MessageContext>Original</Saa:MessageContext>"
            + "        <Saa:MessageNature>Financial</Saa:MessageNature>"
            + "        <Saa:Sumid>1234567890</Saa:Sumid>"
            + "        <Saa:ServiceURI>mp/mx/_ImGiIFKDEeyXX57HMRFmxw</Saa:ServiceURI>"
            + "        <Saa:MessageTypeURI>mp/mx/_ImGiIFKDEeyXX57HMRFmxw/_XC3TJV9CEeyfdsiuljUhuQ</Saa:MessageTypeURI>"
            + "      </Saa:InterfaceInfo>"
            + "      <Saa:NetworkInfo>"
            + "        <Saa:Priority>Normal</Saa:Priority>"
            + "        <Saa:IsPossibleDuplicate>false</Saa:IsPossibleDuplicate>"
            + "        <Saa:Service>swift.finplus!pf</Saa:Service>"
            + "        <Saa:Network>SWIFTNet</Saa:Network>"
            + "        <Saa:SessionNr>005000</Saa:SessionNr>"
            + "        <Saa:SeqNr>000000043</Saa:SeqNr>"
            + "        <Saa:SWIFTNetNetworkInfo>"
            + "          <Saa:RequestType>pacs.009.001.08</Saa:RequestType>"
            + "          <Saa:RequestSubtype>swift.cbprplus.02</Saa:RequestSubtype>"
            + "          <Saa:SWIFTRef>swi99998-2024-11-01T21:11:43.0016.645274Z</Saa:SWIFTRef>"
            + "          <Saa:SNLRef>SNL99998-2024-11-01T21:11:43.0016.575278Z</Saa:SNLRef>"
            + "          <Saa:Reference>46ce8123-2844-4e86-afd0-438af82edc9e</Saa:Reference>"
            + "          <Saa:SnFQueueName>fooous33_finplusfut!p</Saa:SnFQueueName>"
            + "          <Saa:SnFInputTime>0301:2024-11-01T21:11:44</Saa:SnFInputTime>"
            + "          <Saa:SnFDeliveryTime>2024-11-01T21:11:44Z</Saa:SnFDeliveryTime>"
            + "          <Saa:ValidationDescriptor>"
            + "            <SwInt:ValResult>Success</SwInt:ValResult>"
            + "          </Saa:ValidationDescriptor>"
            + "        </Saa:SWIFTNetNetworkInfo>"
            + "      </Saa:NetworkInfo>"
            + "      <Saa:SecurityInfo>"
            + "        <Saa:SWIFTNetSecurityInfo>"
            + "          <Saa:SignatureResult>Success</Saa:SignatureResult>"
            + "          <Saa:SignatureValue>"
            + "            <SwSec:Signature>"
            + "              <SwSec:SignedInfo>"
            + "                <Sw:Reference>"
            + "                  <Sw:DigestValue>+W40vLwrVvZFJQzh0CiojwvLz074pkMqWr7oV5VlTaE=</Sw:DigestValue>"
            + "                </Sw:Reference>"
            + "              </SwSec:SignedInfo>"
            + "              <SwSec:SignatureValue>PEMF@Proc-Type: 4,MIC-ONLY"
            + "Content-Domain: RFC822"
            + "EntrustFile-Version: 2.0"
            + "Originator-DN: cn=%51,cn=test,ou=transaction-signing,ou=transactionmanager,o=swift,o=swift"
            + "Orig-SN: 0987654321"
            + "MIC-Info: SHA256, RSA,"
            + " Ps/3auXoST3Y1S2EJ5swNkMS3gyfcVXH8rHnbo7uvimFX1NHd1R+AHsyejuih6Tx"
            + " tRMX99SXFIkQu6VjRd7+r7NZ2zEoBVmb5T+pd3/OmrWd+LvtN6uvIyuPq3hTgz0t"
            + " 9bbVrX3y1M98DkIiskXvD88haiUkSVonWuMIk++bwrithF9EXF/f5O5L+3NFoTte"
            + " zZk+0qDdTxaVcj5TRTg9TH1a6UyHg58FpiWaBtlHPdkLIK5d4JCtU8oy92/sjFuz"
            + " VJVs3ytyVI5oj/xa/VhFE4mYZELhLzrGK2iHdyP9fl4PIEO3TE+l06661/uQVg1s"
            + " ndL8QMegjsAVCImtGQokag=="
            + "</SwSec:SignatureValue>"
            + "              <SwSec:KeyInfo>"
            + "                <SwSec:SignDN>cn=%51,cn=test,ou=transaction-signing,ou=transactionmanager,o=swift,o=swift</SwSec:SignDN>"
            + "                <SwSec:CertPolicyId>1.3.21.6.3.10.200.4</SwSec:CertPolicyId>"
            + "              </SwSec:KeyInfo>"
            + "              <SwSec:Manifest>"
            + "                <Sw:Reference>"
            + "                  <Sw:DigestRef>TRD</Sw:DigestRef>"
            + "                  <Sw:DigestValue>DWH/7ilKAtPS9bspbpgbdJQF8OrXzDFnp/eD3XBDiVQ=</Sw:DigestValue>"
            + "                </Sw:Reference>"
            + "                <Sw:Reference>"
            + "                  <Sw:DigestRef>Sw.IARequestHeader</Sw:DigestRef>"
            + "                  <Sw:DigestValue>vWsVhqcTYK2CsPw4rTKHHjuOvQuqRYQ71ER7HqRiX64=</Sw:DigestValue>"
            + "                </Sw:Reference>"
            + "                <Sw:Reference>"
            + "                  <Sw:DigestRef>Sw.RequestPayload and RND</Sw:DigestRef>"
            + "                  <Sw:DigestValue>C8tpELidZPb1ccAn1ndPytmX1qKwg1V+JQhtjlfIESY=</Sw:DigestValue>"
            + "                </Sw:Reference>"
            + "              </SwSec:Manifest>"
            + "              <Sw:Object>"
            + "                <Sw:RND>UyolRk1TZFlATm8nTjYoK0g2cls=</Sw:RND>"
            + "              </Sw:Object>"
            + "            </SwSec:Signature>"
            + "            <SwSec:Signature>"
            + "              <SwSec:SignedInfo>"
            + "                <Sw:Reference>"
            + "                  <Sw:DigestValue>BnGorhNY5vlKv3bwChyHxJiEXYRtsMszPsYXadiIsF4=</Sw:DigestValue>"
            + "                </Sw:Reference>"
            + "              </SwSec:SignedInfo>"
            + "              <SwSec:SignatureValue>PEMF@Proc-Type: 4,MIC-ONLY"
            + "Content-Domain: RFC822"
            + "EntrustFile-Version: 2.0"
            + "Originator-DN: cn=%6,cn=sfm,o=swift,o=swift"
            + "Orig-SN: 1710047991"
            + "MIC-Info: SHA256, RSA,"
            + " rlY3rtAnjwukxQaGQEtwPOAtdAbndJFinqCZ/XUyG+yF5MDj8fpl53kCoGrAwgTC"
            + " CKzzc8+VWyf3tJCUsT1LwHoaY6wI7wyzdauY1sbxevSPqdPR+LdZqa+pn+w0o1GE"
            + " 2tXjFzO0uVN/RJWKrwDUTdyk2hft69qb2UyXSYKDr1DLtOqPucP90SipbY/p/cK0"
            + " 3pM0i687yizRlj/AyioIafCYpMkmwv9pd4y31AHHAzBidosAl8DOH23EFDr6nr+V"
            + " SveapXDyM0HbF7yO9TPKaegHYN29QKbEeEwuGYcl3Jkf09nly63c14nv+Ennx+yJ"
            + " ekbqgp3j1s7KjxpxKn1wzg=="
            + "</SwSec:SignatureValue>"
            + "              <SwSec:KeyInfo>"
            + "                <SwSec:SignDN>cn=%6,cn=sfm,o=swift,o=swift</SwSec:SignDN>"
            + "                <SwSec:CertPolicyId>1.3.21.6.3.10.100.3</SwSec:CertPolicyId>"
            + "              </SwSec:KeyInfo>"
            + "              <SwSec:Manifest>"
            + "                <Sw:Reference>"
            + "                  <Sw:DigestRef>TRD</Sw:DigestRef>"
            + "                  <Sw:DigestValue>DWH/7ilKAtPS9bspbpgbdJQF8OrXzDFnp/eD3XBDiVQ=</Sw:DigestValue>"
            + "                </Sw:Reference>"
            + "                <Sw:Reference>"
            + "                  <Sw:DigestRef>Sw.IARequestHeader</Sw:DigestRef>"
            + "                  <Sw:DigestValue>vWsVhqcTYK2CsPw4rTKHHjuOvQuqRYQ71ER7HqRiX64=</Sw:DigestValue>"
            + "                </Sw:Reference>"
            + "                <Sw:Reference>"
            + "                  <Sw:DigestRef>Sw.RequestPayload and RND</Sw:DigestRef>"
            + "                  <Sw:DigestValue>C8tpELidZPb1ccAn1ndPytmX1qKwg1V+JQhtjlfIESY=</Sw:DigestValue>"
            + "                </Sw:Reference>"
            + "                <Sw:Reference>"
            + "                  <Sw:DigestRef>Translated MT</Sw:DigestRef>"
            + "                  <Sw:DigestValue>FwpUmfkFHrRM4uilgM07fa8NsFmWe/0gYd5eKE3OTlQ=</Sw:DigestValue>"
            + "                </Sw:Reference>"
            + "              </SwSec:Manifest>"
            + "              <Sw:Object>"
            + "                <Sw:RND>UyolRk1TZFlATm8nTjYoK0g2cls=</Sw:RND>"
            + "              </Sw:Object>"
            + "            </SwSec:Signature>"
            + "          </Saa:SignatureValue>"
            + "        </Saa:SWIFTNetSecurityInfo>"
            + "      </Saa:SecurityInfo>"
            + "      <Saa:ExpiryDateTime>20241102204844</Saa:ExpiryDateTime>"
            + "    </Saa:Message>"
            + "  </Saa:Header>"
            + "  <Saa:Body>"
            + "    <head:AppHdr xmlns:head=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\">"
            + "      <head:Fr>"
            + "        <head:FIId>"
            + "          <head:FinInstnId>"
            + "            <head:BICFI>YYYXXX30XXX</head:BICFI>"
            + "          </head:FinInstnId>"
            + "        </head:FIId>"
            + "      </head:Fr>"
            + "      <head:To>"
            + "        <head:FIId>"
            + "          <head:FinInstnId>"
            + "            <head:BICFI>FOOOZZ30XXX</head:BICFI>"
            + "          </head:FinInstnId>"
            + "        </head:FIId>"
            + "      </head:To>"
            + "      <head:BizMsgIdr>MID/5506.0/a9689</head:BizMsgIdr>"
            + "      <head:MsgDefIdr>pacs.009.001.08</head:MsgDefIdr>"
            + "      <head:BizSvc>swift.cbprplus.02</head:BizSvc>"
            + "      <head:CreDt>2024-11-01T22:11:15.532+01:00</head:CreDt>"
            + "    </head:AppHdr>"
            + "    <pacs:Document xmlns:pacs=\"urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08\">"
            + "      <pacs:FICdtTrf>"
            + "        <pacs:GrpHdr>"
            + "          <pacs:MsgId>MID/5506.0/a9689</pacs:MsgId>"
            + "          <pacs:CreDtTm>2024-11-01T22:11:15.532+01:00</pacs:CreDtTm>"
            + "          <pacs:NbOfTxs>1</pacs:NbOfTxs>"
            + "          <pacs:SttlmInf>"
            + "            <pacs:SttlmMtd>INGA</pacs:SttlmMtd>"
            + "          </pacs:SttlmInf>"
            + "        </pacs:GrpHdr>"
            + "        <pacs:CdtTrfTxInf>"
            + "          <pacs:PmtId>"
            + "            <pacs:InstrId>IID/5506.0/a9689</pacs:InstrId>"
            + "            <pacs:EndToEndId>E2E/5506.0/7f159</pacs:EndToEndId>"
            + "            <pacs:UETR>2f093ecf-6129-486e-befd-1f9840c0c740</pacs:UETR>"
            + "          </pacs:PmtId>"
            + "          <pacs:PmtTpInf>"
            + "            <pacs:SvcLvl>"
            + "              <pacs:Cd>G004</pacs:Cd>"
            + "            </pacs:SvcLvl>"
            + "          </pacs:PmtTpInf>"
            + "          <pacs:IntrBkSttlmAmt Ccy=\"EUR\">1000.0</pacs:IntrBkSttlmAmt>"
            + "          <pacs:IntrBkSttlmDt>2024-11-01</pacs:IntrBkSttlmDt>"
            + "          <pacs:InstgAgt>"
            + "            <pacs:FinInstnId>"
            + "              <pacs:BICFI>YYYXXX30XXX</pacs:BICFI>"
            + "            </pacs:FinInstnId>"
            + "          </pacs:InstgAgt>"
            + "          <pacs:InstdAgt>"
            + "            <pacs:FinInstnId>"
            + "              <pacs:BICFI>FOOOZZ30XXX</pacs:BICFI>"
            + "            </pacs:FinInstnId>"
            + "          </pacs:InstdAgt>"
            + "          <pacs:Dbtr>"
            + "            <pacs:FinInstnId>"
            + "              <pacs:BICFI>YYYABEB0XXX</pacs:BICFI>"
            + "              <pacs:Nm>Default Bank</pacs:Nm>"
            + "              <pacs:PstlAdr>"
            + "                <pacs:AdrLine>Sample address</pacs:AdrLine>"
            + "              </pacs:PstlAdr>"
            + "            </pacs:FinInstnId>"
            + "          </pacs:Dbtr>"
            + "          <pacs:DbtrAgt>"
            + "            <pacs:FinInstnId>"
            + "              <pacs:BICFI>YYYXXX30XXX</pacs:BICFI>"
            + "            </pacs:FinInstnId>"
            + "          </pacs:DbtrAgt>"
            + "          <pacs:CdtrAgt>"
            + "            <pacs:FinInstnId>"
            + "              <pacs:BICFI>FOOOZZ30XXX</pacs:BICFI>"
            + "            </pacs:FinInstnId>"
            + "          </pacs:CdtrAgt>"
            + "          <pacs:Cdtr>"
            + "            <pacs:FinInstnId>"
            + "              <pacs:BICFI>YYYCBEB0XXX</pacs:BICFI>"
            + "              <pacs:Nm>Ganymede Bank</pacs:Nm>"
            + "              <pacs:PstlAdr>"
            + "                <pacs:AdrLine>Avenue des Consons, 214 b40</pacs:AdrLine>"
            + "                <pacs:AdrLine>1214 Brussels</pacs:AdrLine>"
            + "                <pacs:AdrLine>Belgium</pacs:AdrLine>"
            + "              </pacs:PstlAdr>"
            + "            </pacs:FinInstnId>"
            + "          </pacs:Cdtr>"
            + "        </pacs:CdtTrfTxInf>"
            + "      </pacs:FICdtTrf>"
            + "    </pacs:Document>"
            + "    <!-- {1:F01FOOOZZ30XXXX0000000000}{2:O2021711241101YYYXXX30XXXX00000000002411011711N}{3:{111:004}{121:2f093ecf-6359-486e-befd-1f9840c0c740}}{4:^~:20:IID/7706.0/a9689^~:21:E2E/7706.0/7f159^~:32A:241101EUR1000,^~:52A:YYYABEB0XXX^~:57A:FOOOZZ30XXX^~:58A:YYYCBEB0XXX^~:72:/INS/YYYXXX30XXX^~-}{5:{CHK:A87C6AB16C39}{TNG:}} -->"
            + "    <!-- TranslationResult=TROK -->"
            + "    <!-- TranslationInfo version 1.0.0.1 -->"
            + "  </Saa:Body>"
            + "</Saa:DataPDU>";

    String xml_pacs_008_001_01 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
            + "<Document xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://www.six-interbank-clearing.com/de/pacs.028.001.01.chsepa.02\" xsi:schemaLocation=\"http://www.six-interbank-clearing.com/de/pacs.028.001.01.chsepa.02 pacs.028.001.01.chsepa.02.xsd\">"
            + "  <FIToFIPmtStsReq>"
            + "    <GrpHdr>"
            + "      <MsgId>MSGID-pacs028-20190529-1</MsgId>"
            + "      <CreDtTm>2019-05-29T09:30:47Z</CreDtTm>"
            + "      <InstgAgt>"
            + "        <FinInstnId>"
            + "          <BICFI>FOOICHBBXXX</BICFI>"
            + "        </FinInstnId>"
            + "      </InstgAgt>"
            + "      <InstdAgt>"
            + "        <FinInstnId>"
            + "          <BICFI>FOOTDEFFXXX</BICFI>"
            + "        </FinInstnId>"
            + "      </InstdAgt>"
            + "    </GrpHdr>"
            + "    <OrgnlGrpInf>"
            + "      <OrgnlMsgId>MSGID-camt056-20190522-2-SEPA</OrgnlMsgId>"
            + "      <OrgnlMsgNmId>camt.056.001.01</OrgnlMsgNmId>"
            + "    </OrgnlGrpInf>"
            + "    <TxInf>"
            + "      <StsReqId>STSREQID-pacs028StatusReqId4713</StsReqId>"
            + "      <OrgnlInstrId>XCORW-xzng943XzmxvoRwIvu5287</OrgnlInstrId>"
            + "      <OrgnlEndToEndId>1234567891</OrgnlEndToEndId>"
            + "      <OrgnlTxId>79809477-7-9998</OrgnlTxId>"
            + "      <OrgnlTxRef>"
            + "        <SttlmInf>"
            + "          <SttlmMtd>INDA</SttlmMtd>"
            + "          <ClrSys>"
            + "            <Prtry>ABE</Prtry>"
            + "          </ClrSys>"
            + "        </SttlmInf>"
            + "        <PmtTpInf>"
            + "          <SvcLvl>"
            + "            <Cd>SEPA</Cd>"
            + "          </SvcLvl>"
            + "        </PmtTpInf>"
            + "        <Dbtr>"
            + "          <Nm>Horlogerie du Joux, Mueller et Cie.</Nm>"
            + "        </Dbtr>"
            + "        <DbtrAcct>"
            + "          <Id>"
            + "            <IBAN>CH5598064001234567890</IBAN>"
            + "          </Id>"
            + "        </DbtrAcct>"
            + "        <DbtrAgt>"
            + "          <FinInstnId>"
            + "            <BICFI>FOOICHBBXXX</BICFI>"
            + "          </FinInstnId>"
            + "        </DbtrAgt>"
            + "        <CdtrAgt>"
            + "          <FinInstnId>"
            + "            <BICFI>FOOYDEFFXXX</BICFI>"
            + "          </FinInstnId>"
            + "        </CdtrAgt>"
            + "        <Cdtr>"
            + "          <Nm>Uhrengrosshandel Buxtehude, Peter Maier und Co.</Nm>"
            + "        </Cdtr>"
            + "        <CdtrAcct>"
            + "          <Id>"
            + "            <IBAN>DE47100100001234567890</IBAN>"
            + "          </Id>"
            + "        </CdtrAcct>"
            + "      </OrgnlTxRef>"
            + "    </TxInf>"
            + "  </FIToFIPmtStsReq>"
            + "</Document>";

    @Test
    public void testIdentifyMessage_01() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    @Test
    public void testIdentifyMessage_02() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Foo:Document xmlns:Foo=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    @Test
    public void testIdentifyMessage_03() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"></Doc:Document>";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    @Test
    public void testIdentifyMessage_04() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    @Test
    public void testIdentifyMessage_05() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    @Test
    public void testIdentifyMessage_06() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:swift.eni$camt.003.001.04\"></Doc:Document>";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    void assertMxId(MxId id) {
        assertNotNull(id, "detected id is null");
        assertEquals(MxBusinessProcess.camt, id.getBusinessProcess());
        assertEquals("003", id.getFunctionality());
        assertEquals("001", id.getVariant());
        assertEquals("04", id.getVersion());
    }

    /**
     * Test that external entities feature is disabled in the XML parsing to avoid XXE (external entity injection)
     * <p>This one is not affected by XXE because it only reads and returns the MxId and entity cannot be used in the
     * XML namespace.
     */
    @Test
    public void testXxeDisabledInDetectMessage() {
        final String xml = "<!DOCTYPE foo [ <!ENTITY xxe SYSTEM \"file:///etc/passwd\" >]>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:swift.eni$camt.003.001.04\">&xxe;</Doc:Document>";
        Optional<MxId> id = MxParseUtils.identifyMessage(xml);
        assertTrue(id.isPresent());
    }

    @Test
    public void testIdentifyMessage_FromBAH() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Message>"
                + "<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
                + "<Fr> "
                + "	<FIId>"
                + "		<FinInstnId>"
                + "			<BICFI>FOOCUS3NXXX</BICFI>"
                + "			<ClrSysMmbId>"
                + "				<ClrSysId>"
                + "					<Prtry>T2S</Prtry>"
                + "				</ClrSysId>"
                + "				<MmbId>ADMNUSERLUXCSDT1</MmbId>"
                + "			</ClrSysMmbId>"
                + "			<Othr>"
                + "				<Id>FOOTXE2SXXX</Id>"
                + "				</Othr> "
                + "		</FinInstnId> "
                + "	</FIId> "
                + "</Fr> "
                + "<To> "
                + "	<FIId>"
                + "		<FinInstnId>"
                + "			<BICFI>ABICUS33</BICFI>"
                + "			<Othr>"
                + "				<Id>AARBDE5W100</Id>"
                + "			</Othr>"
                + "		</FinInstnId> "
                + "	</FIId> "
                + "</To> "
                + "<BizMsgIdr>2012111915360885</BizMsgIdr>"
                + "<MsgDefIdr>seev.031.002.03</MsgDefIdr> "
                + "<BizSvc>CSD</BizSvc> "
                + "<CreDt>2015-08-27T08:59:00Z</CreDt>"
                + "</AppHdr>"
                + "<Document></Document>"
                + "</Message>";
        MxId id = MxParseUtils.identifyMessage(xml).orElse(null);
        assertNotNull(id);
        assertEquals("seev.031.002.03", id.id());
        assertEquals("CSD", id.getBusinessService().orElse(null));
    }

    @Test
    public void testIdentifyMessage_LegacyBAH() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Message>"
                + "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">" + "   <h:Fr>"
                + "      <h:FIId>"
                + "         <h:FinInstnId>"
                + "            <h:Nm>Not available</h:Nm>"
                + "         </h:FinInstnId>"
                + "      </h:FIId>"
                + "   </h:Fr>"
                + "   <h:To>"
                + "      <h:FIId>"
                + "         <h:FinInstnId>"
                + "            <h:Nm>Not available</h:Nm>"
                + "         </h:FinInstnId>"
                + "      </h:FIId>"
                + "   </h:To>"
                + "   <h:BizMsgIdr>AAAAAAAAAA222222</h:BizMsgIdr>"
                + "   <h:MsgDefIdr>seev.037.002.02</h:MsgDefIdr>"
                + "   <h:CreDt>2017-08-08T16:58:01Z</h:CreDt>"
                + "</h:AppHdr>"
                + "<Document></Document>"
                + "</Message>";
        MxId id = MxParseUtils.identifyMessage(xml).orElse(null);
        assertNotNull(id);
        assertEquals("seev.037.002.02", id.id());
    }

    @Test
    public void testParseComments() {
        List<String> strings = MxParseUtils.parseComments(xml);
        assertEquals(3, strings.size());
        assertEquals(
                "{1:F01FOOOZZ30XXXX0000000000}{2:O2021711241101YYYXXX30XXXX00000000002411011711N}{3:{111:004}{121:2f093ecf-6359-486e-befd-1f9840c0c740}}{4:^~:20:IID/7706.0/a9689^~:21:E2E/7706.0/7f159^~:32A:241101EUR1000,^~:52A:YYYABEB0XXX^~:57A:FOOOZZ30XXX^~:58A:YYYCBEB0XXX^~:72:/INS/YYYXXX30XXX^~-}{5:{CHK:A87C6AB16C39}{TNG:}}",
                strings.get(0));
        assertEquals("TranslationResult=TROK", strings.get(1));
        assertEquals("TranslationInfo version 1.0.0.1", strings.get(2));
    }

    @Test
    public void testParseCommentsStartsWith() {
        List<String> strings = MxParseUtils.parseCommentsStartsWith(xml, "{1:F0");
        assertEquals(1, strings.size());
        assertEquals(
                "{1:F01FOOOZZ30XXXX0000000000}{2:O2021711241101YYYXXX30XXXX00000000002411011711N}{3:{111:004}{121:2f093ecf-6359-486e-befd-1f9840c0c740}}{4:^~:20:IID/7706.0/a9689^~:21:E2E/7706.0/7f159^~:32A:241101EUR1000,^~:52A:YYYABEB0XXX^~:57A:FOOOZZ30XXX^~:58A:YYYCBEB0XXX^~:72:/INS/YYYXXX30XXX^~-}{5:{CHK:A87C6AB16C39}{TNG:}}",
                strings.get(0));
    }

    @Test
    public void testParseCommentsContains() {
        List<String> strings = MxParseUtils.parseCommentsContains(xml, "TROK");
        assertEquals(1, strings.size());
        assertEquals("TranslationResult=TROK", strings.get(0));
    }

    @Test
    public void testParseMtFromMultiFormatMessage() {
        Optional<AbstractMT> abstractMT = MxParseUtils.parseMtFromMultiformatMessage(xml);
        assertTrue(abstractMT.isPresent());
        assertEquals("FOOOZZ30XXXX", abstractMT.get().getReceiver());
        assertEquals("YYYXXX30XXXX", abstractMT.get().getSender());
        assertEquals(
                "/INS/YYYXXX30XXX",
                abstractMT
                        .get()
                        .getSwiftMessage()
                        .getBlock4()
                        .getFieldByName("72")
                        .getValue());
    }

    @Test
    void identifySettlementMethodCLRG() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Message>"
                + "    <SwIntRef:Request xmlns:SwIntRef=\"urn:swift:snl:ns.SwInt\">"
                + "        <SwIntRef:RequestControl/><SwIntRef:RequestHeader>"
                + "            <SwIntRef:Requestor>ou=xxx,o=irvtdefx,o=swift</SwIntRef:Requestor>"
                + "            <SwIntRef:Responder>cn=rtgs,o=xxxtxepm,o=swift</SwIntRef:Responder>"
                + "            <SwIntRef:Service>esmig.t2.iast!pu</SwIntRef:Service>"
                + "            <SwIntRef:RequestType>pacs.009.001.08</SwIntRef:RequestType>"
                + "        </SwIntRef:RequestHeader>"
                + "    </SwIntRef:Request>"
                + "    <AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">"
                + "        <Fr>"
                + "            <FIId>"
                + "                <FinInstnId>"
                + "                    <BICFI>FOOGDEFXXXX</BICFI>"
                + "                    <ClrSysMmbId>"
                + "                        <MmbId>DEFOOGDEFXXXX</MmbId>"
                + "                    </ClrSysMmbId>"
                + "                </FinInstnId>"
                + "            </FIId>"
                + "        </Fr>"
                + "        <To>"
                + "            <FIId>"
                + "                <FinInstnId>"
                + "                    <BICFI>FOOVFRPPXXX</BICFI>"
                + "                </FinInstnId>"
                + "            </FIId>"
                + "        </To>"
                + "        <BizMsgIdr>VKS7695859976572</BizMsgIdr>"
                + "        <MsgDefIdr>pacs.009.001.08CORE</MsgDefIdr>"
                + "        <BizSvc>cbn.rtgs.01</BizSvc>"
                + "        <CreDt>2023-04-14T12:31:30.236Z</CreDt>"
                + "    </AppHdr>"
                + "    <Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08\">"
                + "        <FICdtTrf>"
                + "            <GrpHdr>"
                + "                <MsgId>NONREF</MsgId>"
                + "                <CreDtTm>2023-04-14T12:31:30+00:00</CreDtTm>"
                + "                <NbOfTxs>1</NbOfTxs>"
                + "                <SttlmInf>"
                + "                    <SttlmMtd>CLRG</SttlmMtd>"
                + "                    <ClrSys>"
                + "                        <Cd>TGT</Cd>"
                + "                    </ClrSys>"
                + "                </SttlmInf>"
                + "            </GrpHdr>"
                + "            <CdtTrfTxInf>"
                + "                <PmtId>"
                + "                    <InstrId>VKS7695859976572</InstrId>"
                + "                    <EndToEndId>YMBNK991G7GX51X</EndToEndId>"
                + "                    <UETR>33087b8e-2dfb-40b5-a432-769585867545</UETR>"
                + "                </PmtId>"
                + "                <PmtTpInf>"
                + "                    <SvcLvl>"
                + "                        <Cd>G004</Cd>"
                + "                    </SvcLvl>"
                + "                    <CtgyPurp>"
                + "                        <Cd>SUPP</Cd>"
                + "                    </CtgyPurp>"
                + "                </PmtTpInf>"
                + "                <IntrBkSttlmAmt Ccy=\"EUR\">1000.00</IntrBkSttlmAmt>"
                + "                <IntrBkSttlmDt>2023-04-14</IntrBkSttlmDt>"
                + "                <PrvsInstgAgt1>"
                + "                    <FinInstnId>"
                + "                        <BICFI>FOOUFR21XXX</BICFI>"
                + "                    </FinInstnId>"
                + "                </PrvsInstgAgt1>"
                + "                <InstgAgt>"
                + "                    <FinInstnId>"
                + "                        <BICFI>FOOGDEFXXXX</BICFI>"
                + "                    </FinInstnId>"
                + "                </InstgAgt>"
                + "                <InstdAgt>"
                + "                    <FinInstnId>"
                + "                        <BICFI>FOOVFRPPXXX</BICFI>"
                + "                    </FinInstnId>"
                + "                </InstdAgt>"
                + "                <Dbtr>"
                + "                    <FinInstnId>"
                + "                        <BICFI>FOOWDK22XXX</BICFI>"
                + "                        <Nm>ARBEJDSMARKEDETS TILLAEGSPENSION</Nm>"
                + "                        <PstlAdr>"
                + "                            <PstCd>3400</PstCd>"
                + "                            <TwnNm>REGION HOVEDSTADEN</TwnNm>"
                + "                            <Ctry>DK</Ctry>"
                + "                        </PstlAdr>"
                + "                    </FinInstnId>"
                + "                </Dbtr>"
                + "                <DbtrAgt>"
                + "                    <FinInstnId>"
                + "                        <BICFI>FOOGBEBBXXX</BICFI>"
                + "                        <Nm>THE BANK OF NEW YORK MELLON SA/NV</Nm>"
                + "                        <PstlAdr>"
                + "                            <PstCd>1000</PstCd>"
                + "                            <TwnNm>BRUXELLES-CAPITALE</TwnNm>"
                + "                            <Ctry>BE</Ctry>"
                + "                        </PstlAdr>"
                + "                    </FinInstnId>"
                + "                </DbtrAgt>"
                + "                <CdtrAgt>"
                + "                    <FinInstnId>"
                + "                        <BICFI>FOOVGB2LLON</BICFI>"
                + "                        <Nm>SOCIETE GENERALE</Nm>"
                + "                        <PstlAdr>"
                + "                            <PstCd>E14 4SG</PstCd>"
                + "                            <TwnNm>GREATER LONDON</TwnNm>"
                + "                            <Ctry>GB</Ctry>"
                + "                        </PstlAdr>"
                + "                    </FinInstnId>"
                + "                </CdtrAgt>"
                + "                <Cdtr>"
                + "                    <FinInstnId>"
                + "                        <BICFI>FOOVNL2AXXX</BICFI>"
                + "                        <Nm>SOCIETE GENERALE</Nm>"
                + "                        <PstlAdr>"
                + "                            <PstCd>1096 HA</PstCd>"
                + "                            <TwnNm>NOORD-HOLLAND</TwnNm>"
                + "                            <Ctry>NL</Ctry>"
                + "                        </PstlAdr>"
                + "                    </FinInstnId>"
                + "                </Cdtr>"
                + "            </CdtTrfTxInf>"
                + "        </FICdtTrf>"
                + "    </Document>"
                + "</Message>";
        MxId id = MxParseUtils.identifyMessage(xml).orElse(null);
        assertNotNull(id);
        assertEquals("pacs.009.001.08", id.id());
        assertEquals("cbn.rtgs.01", id.getBusinessService().orElse(null));
        Optional<SettlementInfo> settlementInfo = MxParseUtils.getSettlementInfo(xml);
        assertTrue(settlementInfo.isPresent());
        assertEquals(SettlementMethod.CLRG, settlementInfo.get().getSettlementMethod());
        assertEquals("TGT", settlementInfo.get().getClearingSystemCode());
    }

    @Test
    void identifySettlementMethodINDA() {
        MxId id = MxParseUtils.identifyMessage(xml_pacs_008_001_01).orElse(null);
        assertNotNull(id);
        assertEquals("pacs.028.001.01", id.id());
        assertFalse(id.getBusinessService().isPresent());
        Optional<SettlementInfo> settlementInfo = MxParseUtils.getSettlementInfo(xml_pacs_008_001_01);
        assertTrue(settlementInfo.isPresent());
        assertEquals(SettlementMethod.INDA, settlementInfo.get().getSettlementMethod());
        assertEquals("SEPA", settlementInfo.get().getClearingSystemCode());
    }

    @Test
    void testFindFieldValueByTags() throws XMLStreamException {

        MxId id = MxParseUtils.identifyMessage(xml_pacs_008_001_01).orElse(null);
        assertNotNull(id);
        assertEquals("pacs.028.001.01", id.id());

        assertEquals(
                "MSGID-pacs028-20190529-1",
                MxParseUtils.findByTags(xml_pacs_008_001_01, "FIToFIPmtStsReq", "GrpHdr", "MsgId")
                        .orElse(null));

        assertEquals(
                "FOOICHBBXXX",
                MxParseUtils.findByTags(xml_pacs_008_001_01, "FIToFIPmtStsReq", "GrpHdr", "InstgAgt", "BICFI")
                        .orElse(null));

        assertEquals(
                "INDA",
                MxParseUtils.findByTags(
                                xml_pacs_008_001_01, "FIToFIPmtStsReq", "TxInf", "OrgnlTxRef", "SttlmInf", "SttlmMtd")
                        .orElse(null));

        assertEquals(
                "ABE",
                MxParseUtils.findByTags(
                                xml_pacs_008_001_01, "FIToFIPmtStsReq", "OrgnlTxRef", "SttlmInf", "ClrSys", "Prtry")
                        .orElse(null));

        assertEquals(
                "DE47100100001234567890",
                MxParseUtils.findByTags(
                                xml_pacs_008_001_01, "FIToFIPmtStsReq", "TxInf", "OrgnlTxRef", "CdtrAcct", "Id", "IBAN")
                        .orElse(null));

        assertFalse(MxParseUtils.findByTags(xml_pacs_008_001_01, "FIToFIPmtStsReq", "TxInf", "Id", "Foo", "IBAN")
                .isPresent());
    }

    @Test
    void testFindFieldValueByAbsolutePathPacs() throws XMLStreamException {

        MxId id = MxParseUtils.identifyMessage(xml_pacs_008_001_01).orElse(null);
        assertNotNull(id);
        assertEquals("pacs.028.001.01", id.id());

        assertEquals(
                "MSGID-pacs028-20190529-1",
                MxParseUtils.findByPath(xml_pacs_008_001_01, "/Document/FIToFIPmtStsReq/GrpHdr/MsgId")
                        .orElse(null));

        assertEquals(
                "FOOICHBBXXX",
                MxParseUtils.findByPath(
                                xml_pacs_008_001_01, "/Document/FIToFIPmtStsReq/GrpHdr/InstgAgt/FinInstnId/BICFI")
                        .orElse(null));

        assertEquals(
                "INDA",
                MxParseUtils.findByPath(
                                xml_pacs_008_001_01, "/Document/FIToFIPmtStsReq/TxInf/OrgnlTxRef/SttlmInf/SttlmMtd")
                        .orElse(null));

        assertEquals(
                "ABE",
                MxParseUtils.findByPath(
                                xml_pacs_008_001_01, "/Document/FIToFIPmtStsReq/TxInf/OrgnlTxRef/SttlmInf/ClrSys/Prtry")
                        .orElse(null));

        assertEquals(
                "DE47100100001234567890",
                MxParseUtils.findByPath(
                                xml_pacs_008_001_01, "/Document/FIToFIPmtStsReq/TxInf/OrgnlTxRef/CdtrAcct/Id/IBAN")
                        .orElse(null));

        assertFalse(MxParseUtils.findByPath(xml_pacs_008_001_01, "/Document/FIToFIPmtStsReq/TxInf/Id/Foo/IBAN")
                .isPresent());
    }

    @Test
    void testFindFieldValueByRelativePathPacs() throws XMLStreamException {

        MxId id = MxParseUtils.identifyMessage(xml_pacs_008_001_01).orElse(null);
        assertNotNull(id);
        assertEquals("pacs.028.001.01", id.id());

        assertEquals(
                "MSGID-pacs028-20190529-1",
                MxParseUtils.findByPath(xml_pacs_008_001_01, "//FIToFIPmtStsReq/GrpHdr/MsgId")
                        .orElse(null));

        assertEquals(
                "FOOICHBBXXX",
                MxParseUtils.findByPath(xml_pacs_008_001_01, "//BICFI").orElse(null));

        assertEquals(
                "INDA",
                MxParseUtils.findByPath(xml_pacs_008_001_01, "//OrgnlTxRef/SttlmInf/SttlmMtd")
                        .orElse(null));

        assertEquals(
                "ABE",
                MxParseUtils.findByPath(xml_pacs_008_001_01, "//TxInf/OrgnlTxRef/SttlmInf/ClrSys/Prtry")
                        .orElse(null));

        assertEquals(
                "DE47100100001234567890",
                MxParseUtils.findByPath(xml_pacs_008_001_01, "//CdtrAcct/Id/IBAN")
                        .orElse(null));

        assertEquals(
                "CH5598064001234567890",
                MxParseUtils.findByPath(xml_pacs_008_001_01, "//DbtrAcct/Id/IBAN")
                        .orElse(null));

        assertFalse(MxParseUtils.findByPath(xml_pacs_008_001_01, "//FIToFIPmtStsReq/TxInf/Id/Foo/IBAN")
                .isPresent());
    }

    @Test
    void testFindFieldValueByAbsolutePathCamt() throws XMLStreamException {

        String xml_camt_053_001_12 = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + "<Message>\n"
                + "<head:AppHdr xmlns:head=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.04\">\n"
                + "    <head:Fr>\n"
                + "        <head:FIId>\n"
                + "            <head:FinInstnId>\n"
                + "                <head:BICFI>FOOBAR22XXX</head:BICFI>\n"
                + "            </head:FinInstnId>\n"
                + "        </head:FIId>\n"
                + "    </head:Fr>\n"
                + "    <head:To>\n"
                + "        <head:FIId>\n"
                + "            <head:FinInstnId>\n"
                + "                <head:BICFI>ABNABRSPBHE</head:BICFI>\n"
                + "            </head:FinInstnId>\n"
                + "        </head:FIId>\n"
                + "    </head:To>\n"
                + "    <head:BizMsgIdr>asdfasdsdd</head:BizMsgIdr>\n"
                + "    <head:MsgDefIdr>camt.053.001.12</head:MsgDefIdr>\n"
                + "    <head:CreDt>2024-12-09T09:45:41-03:00</head:CreDt>\n"
                + "    <head:BizPrcgDt>2024-12-09T09:45:41-03:00</head:BizPrcgDt>\n"
                + "</head:AppHdr>\n"
                + "<camt:Document xmlns:camt=\"urn:iso:std:iso:20022:tech:xsd:camt.053.001.12\">\n"
                + "    <camt:BkToCstmrStmt>\n"
                + "        <camt:GrpHdr>\n"
                + "            <camt:MsgId>asdfasd</camt:MsgId>\n"
                + "            <camt:CreDtTm>2024-12-09T09:36:46-03:00</camt:CreDtTm>\n"
                + "            <camt:MsgPgntn>\n"
                + "                <camt:PgNb>1234</camt:PgNb>\n"
                + "                <camt:LastPgInd>false</camt:LastPgInd>\n"
                + "            </camt:MsgPgntn>\n"
                + "        </camt:GrpHdr>\n"
                + "        <camt:Stmt>\n"
                + "            <camt:Id>asdfasdf</camt:Id>\n"
                + "            <camt:ElctrncSeqNb>2233</camt:ElctrncSeqNb>\n"
                + "            <camt:LglSeqNb>2445</camt:LglSeqNb>\n"
                + "            <camt:Acct>\n"
                + "                <camt:Ccy>USD</camt:Ccy>\n"
                + "                <camt:Nm>asdff</camt:Nm>\n"
                + "                <camt:Prxy>\n"
                + "                    <camt:Tp>\n"
                + "                        <camt:Cd>TELE</camt:Cd>\n"
                + "                    </camt:Tp>\n"
                + "                    <camt:Id>23423</camt:Id>\n"
                + "                </camt:Prxy>\n"
                + "            </camt:Acct>\n"
                + "            <camt:Bal>\n"
                + "                <camt:Tp>\n"
                + "                    <camt:CdOrPrtry>\n"
                + "                        <camt:Cd>FWAV</camt:Cd>\n"
                + "                    </camt:CdOrPrtry>\n"
                + "                </camt:Tp>\n"
                + "                <camt:Amt Ccy=\"USD\">2323</camt:Amt>\n"
                + "                <camt:CdtDbtInd>CRDT</camt:CdtDbtInd>\n"
                + "                <camt:Dt>\n"
                + "                    <camt:Dt>2024-12-10</camt:Dt>\n"
                + "                </camt:Dt>\n"
                + "            </camt:Bal>\n"
                + "        </camt:Stmt>\n"
                + "    </camt:BkToCstmrStmt>\n"
                + "</camt:Document>\n"
                + "</Message>";

        MxId id = MxParseUtils.identifyMessage(xml_camt_053_001_12).orElse(null);
        assertNotNull(id);
        assertEquals("camt.053.001.12", id.id());

        assertEquals(
                "FOOBAR22XXX",
                MxParseUtils.findByPath(xml_camt_053_001_12, "/AppHdr/Fr/FIId/FinInstnId/BICFI")
                        .orElse(null));

        assertEquals(
                "2024-12-09T09:45:41-03:00",
                MxParseUtils.findByPath(xml_camt_053_001_12, "/AppHdr/BizPrcgDt")
                        .orElse(null));

        assertEquals(
                "1234",
                MxParseUtils.findByPath(xml_camt_053_001_12, "/Document/BkToCstmrStmt/GrpHdr/MsgPgntn/PgNb")
                        .orElse(null));

        assertEquals(
                "false",
                MxParseUtils.findByPath(xml_camt_053_001_12, "/Document/BkToCstmrStmt/GrpHdr/MsgPgntn/LastPgInd")
                        .orElse(null));

        assertFalse(MxParseUtils.findByPath(xml_camt_053_001_12, "/Document/FIToFIPmtStsReq/TxInf/Id/Foo/IBAN")
                .isPresent());
    }

    @Test
    void testFindFieldValueByRelativePathCamt() throws XMLStreamException {

        String xml_camt_053_001_12 = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + "<Message>\n"
                + "<head:AppHdr xmlns:head=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.04\">\n"
                + "    <head:Fr>\n"
                + "        <head:FIId>\n"
                + "            <head:FinInstnId>\n"
                + "                <head:BICFI>FOOBAR22XXX</head:BICFI>\n"
                + "            </head:FinInstnId>\n"
                + "        </head:FIId>\n"
                + "    </head:Fr>\n"
                + "    <head:To>\n"
                + "        <head:FIId>\n"
                + "            <head:FinInstnId>\n"
                + "                <head:BICFI>ABNABRSPBHE</head:BICFI>\n"
                + "            </head:FinInstnId>\n"
                + "        </head:FIId>\n"
                + "    </head:To>\n"
                + "    <head:BizMsgIdr>asdfasdsdd</head:BizMsgIdr>\n"
                + "    <head:MsgDefIdr>camt.053.001.12</head:MsgDefIdr>\n"
                + "    <head:CreDt>2024-12-09T09:45:41-03:00</head:CreDt>\n"
                + "    <head:BizPrcgDt>2024-12-09T09:45:41-03:00</head:BizPrcgDt>\n"
                + "</head:AppHdr>\n"
                + "<camt:Document xmlns:camt=\"urn:iso:std:iso:20022:tech:xsd:camt.053.001.12\">\n"
                + "    <camt:BkToCstmrStmt>\n"
                + "        <camt:GrpHdr>\n"
                + "            <camt:MsgId>asdfasd</camt:MsgId>\n"
                + "            <camt:CreDtTm>2024-12-09T09:36:46-03:00</camt:CreDtTm>\n"
                + "            <camt:MsgPgntn>\n"
                + "                <camt:PgNb>1234</camt:PgNb>\n"
                + "                <camt:LastPgInd>false</camt:LastPgInd>\n"
                + "            </camt:MsgPgntn>\n"
                + "        </camt:GrpHdr>\n"
                + "        <camt:Stmt>\n"
                + "            <camt:Id>asdfasdf</camt:Id>\n"
                + "            <camt:ElctrncSeqNb>2233</camt:ElctrncSeqNb>\n"
                + "            <camt:LglSeqNb>2445</camt:LglSeqNb>\n"
                + "            <camt:Acct>\n"
                + "                <camt:Ccy>USD</camt:Ccy>\n"
                + "                <camt:Nm>asdff</camt:Nm>\n"
                + "                <camt:Prxy>\n"
                + "                    <camt:Tp>\n"
                + "                        <camt:Cd>TELE</camt:Cd>\n"
                + "                    </camt:Tp>\n"
                + "                    <camt:Id>23423</camt:Id>\n"
                + "                </camt:Prxy>\n"
                + "            </camt:Acct>\n"
                + "            <camt:Bal>\n"
                + "                <camt:Tp>\n"
                + "                    <camt:CdOrPrtry>\n"
                + "                        <camt:Cd>FWAV</camt:Cd>\n"
                + "                    </camt:CdOrPrtry>\n"
                + "                </camt:Tp>\n"
                + "                <camt:Amt Ccy=\"USD\">2323</camt:Amt>\n"
                + "                <camt:CdtDbtInd>CRDT</camt:CdtDbtInd>\n"
                + "                <camt:Dt>\n"
                + "                    <camt:Dt>2024-12-10</camt:Dt>\n"
                + "                </camt:Dt>\n"
                + "            </camt:Bal>\n"
                + "        </camt:Stmt>\n"
                + "    </camt:BkToCstmrStmt>\n"
                + "</camt:Document>\n"
                + "</Message>";

        MxId id = MxParseUtils.identifyMessage(xml_camt_053_001_12).orElse(null);
        assertNotNull(id);
        assertEquals("camt.053.001.12", id.id());

        assertEquals(
                "FOOBAR22XXX",
                MxParseUtils.findByPath(xml_camt_053_001_12, "//FinInstnId/BICFI")
                        .orElse(null));

        assertEquals(
                "2024-12-09T09:45:41-03:00",
                MxParseUtils.findByPath(xml_camt_053_001_12, "//BizPrcgDt").orElse(null));

        assertEquals(
                "1234",
                MxParseUtils.findByPath(xml_camt_053_001_12, "//GrpHdr/MsgPgntn/PgNb")
                        .orElse(null));

        assertEquals(
                "false",
                MxParseUtils.findByPath(xml_camt_053_001_12, "//MsgPgntn/LastPgInd")
                        .orElse(null));

        assertFalse(
                MxParseUtils.findByPath(xml_camt_053_001_12, "//Id/Foo/IBAN").isPresent());
    }

    @Test
    void testFindElementsEmptyParams() {
        String xml_camt_053_001_12 = "";
        assertThrows(
                IllegalArgumentException.class,
                () -> MxParseUtils.findByPath(xml_camt_053_001_12, "//FinInstnId/BICFI"));
    }

    @Test
    void testFindElementsPassingWrongTargetPathExpression() {
        assertThrows(
                IllegalArgumentException.class,
                () -> MxParseUtils.findByPath(xml_pacs_008_001_01, "/Document//FinInstnId/BICFI)"));
    }

    @Test
    void testFindElementsPassingNullParams() {
        assertThrows(NullPointerException.class, () -> MxParseUtils.findByPath(xml_pacs_008_001_01, null));
    }

    @Test
    public void testElementExists_01() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Payload><Document xmlns=\"urn:swift:xsd:camt.003.001.04\"></Document></Payload>";
        assertTrue(MxParseUtils.elementExists(xml, "Document"));
        assertFalse(MxParseUtils.elementExists(xml, "Foo"));
    }

    @Test
    public void testElementExists_02() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<message>"
                + "<AppHdr xmlns:h=\"urn:swift:xsd:$ahV10\"><From></From></AppHdr>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>"
                + "</message>";
        assertTrue(MxParseUtils.elementExists(xml, "AppHdr"));
        assertTrue(MxParseUtils.elementExists(xml, "Document"));
        assertTrue(MxParseUtils.elementExists(xml, "message"));
        assertFalse(MxParseUtils.elementExists(xml, "Foo"));
    }

    @Test
    public void testFindByTagNarrative() {
        final String xml =
                "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.01\">\n" + "    <FIToFICstmrCdtTrf>\n"
                        + "        <CdtTrfTxInf>\n"
                        + "            <RmtInf>\n"
                        + "                <Ustrd>This is a multiline\n"
                        + "narrative text that\n"
                        + "spans multiple lines\n"
                        + "within the XML tag.</Ustrd>\n"
                        + "            </RmtInf>\n"
                        + "        </CdtTrfTxInf>\n"
                        + "    </FIToFICstmrCdtTrf>\n"
                        + "</Document>";
        assertEquals(
                "This is a multiline\nnarrative text that\nspans multiple lines\nwithin the XML tag.",
                MxParseUtils.findByPath(xml, "//RmtInf/Ustrd").orElse(null));
        assertEquals(
                "This is a multiline\nnarrative text that\nspans multiple lines\nwithin the XML tag.",
                MxParseUtils.findByTags(xml, "CdtTrfTxInf", "Ustrd").orElse(null));
    }

    @Test
    void testFindIntermediateNode() {
        assertFalse(MxParseUtils.findByPath(xml_pacs_008_001_01, "//FIToFIPmtStsReq/GrpHdr")
                .isPresent());
        assertFalse(MxParseUtils.findByTags(xml_pacs_008_001_01, "FIToFIPmtStsReq", "GrpHdr")
                .isPresent());
    }
}
