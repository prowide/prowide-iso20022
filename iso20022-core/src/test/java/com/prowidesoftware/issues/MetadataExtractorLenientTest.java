package com.prowidesoftware.issues;

import static org.junit.jupiter.api.Assertions.fail;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://github.com/prowide/prowide-iso20022/issues/24
 */
public class MetadataExtractorLenientTest {

    public static final String ERROR_MESSAGE = "Error";
    public static final String EX_MESSAGE = "Exception";
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalErr = System.err;
    String xmlLower = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n";
    String xmlUpper = "<?XML version=\"1.0\" encoding=\"UTF-8\" ?>\n";
    String xmlCamel = "<?Xml version=\"1.0\" encoding=\"UTF-8\" ?>\n";
    String xmlMixed = "<?Xml version=\"1.0\" encoding=\"UTF-8\" ?>\n";
    String xml = "<RequestPayload>\n"
            + "<h:AppHdr xmlns:h=\"urn:swift:xsd:$ahV10\">\n"
            + "    <h:From>\n"
            + "        <h:Type>BIC</h:Type>\n"
            + "        <h:Id>FBNINGL0XXX</h:Id>\n"
            + "    </h:From>\n"
            + "    <h:To>\n"
            + "        <h:Type>BIC</h:Type>\n"
            + "        <h:Id>BKTRUS33XXX</h:Id>\n"
            + "     </h:To>\n"
            + "     <h:MsgName>pacs.008.001.08</h:MsgName>\n"
            + "     <h:MsgRef>DNXTF4122100041</h:MsgRef>\n"
            + "     <h:CrDate>2022-05-05T06:07:14Z</h:CrDate>\n"
            + "</h:AppHdr>\n"
            + "<Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08\">\n"
            + "    <Doc:FIToFICstmrCdtTrf>\n"
            + "        <Doc:GrpHdr>\n"
            + "            <Doc:MsgId>DNXTF4122100041</Doc:MsgId>\n"
            + "            <Doc:CreDtTm>2022-05-05T06:07:14Z</Doc:CreDtTm>\n"
            + "            <Doc:NbOfTxs>1</Doc:NbOfTxs>\n"
            + "            <Doc:SttlmInf>\n"
            + "                <Doc:SttlmMtd>INDA</Doc:SttlmMtd>\n"
            + "                <Doc:SttlmAcct>\n"
            + "                    <Doc:Id>\n"
            + "                        <Doc:Othr>\n"
            + "                            <Doc:Id>04435001</Doc:Id>\n"
            + "                        </Doc:Othr>\n"
            + "                    </Doc:Id>\n"
            + "                </Doc:SttlmAcct>\n"
            + "            </Doc:SttlmInf>\n"
            + "            <Doc:InstgAgt>\n"
            + "                <Doc:FinInstnId>\n"
            + "                    <Doc:BICFI>FBNINGL0XXX</Doc:BICFI>\n"
            + "                </Doc:FinInstnId>\n"
            + "            </Doc:InstgAgt>\n"
            + "            <Doc:InstdAgt>\n"
            + "                <Doc:FinInstnId>\n"
            + "                    <Doc:BICFI>BKTRUS33XXX</Doc:BICFI>\n"
            + "                </Doc:FinInstnId>\n"
            + "            </Doc:InstdAgt>\n"
            + "        </Doc:GrpHdr>\n"
            + "        <Doc:CdtTrfTxInf>\n"
            + "            <Doc:PmtId>\n"
            + "                <Doc:InstrId>DNXTF4122100041</Doc:InstrId>\n"
            + "                <Doc:EndToEndId>DNXTF4122100041</Doc:EndToEndId>\n"
            + "                <Doc:TxId>DNXTF4122100041</Doc:TxId>\n"
            + "            </Doc:PmtId>\n"
            + "            <Doc:IntrBkSttlmAmt Ccy=\"USD\">56000.0</Doc:IntrBkSttlmAmt>\n"
            + "            <Doc:IntrBkSttlmDt>2022-05-05</Doc:IntrBkSttlmDt>\n"
            + "            <Doc:InstdAmt Ccy=\"USD\">56000.0</Doc:InstdAmt>\n"
            + "            <Doc:ChrgBr>DEBT</Doc:ChrgBr>\n"
            + "            <Doc:Dbtr>\n"
            + "                <Doc:Nm>PREMIER FEED MILLS COLTD</Doc:Nm>\n"
            + "                <Doc:PstlAdr>\n"
            + "                    <Doc:AdrLine>1 GOLDEN PENNY PLACE, WHARF ROAD,</Doc:AdrLine>\n"
            + "                    <Doc:AdrLine>APAPA LAGOS</Doc:AdrLine>\n"
            + "                </Doc:PstlAdr>\n"
            + "            </Doc:Dbtr>\n"
            + "            <Doc:DbtrAcct>\n"
            + "                <Doc:Id>\n"
            + "                    <Doc:Othr>\n"
            + "                        <Doc:Id>2028766092</Doc:Id>\n"
            + "                    </Doc:Othr>\n"
            + "                </Doc:Id>\n"
            + "            </Doc:DbtrAcct>\n"
            + "            <Doc:DbtrAgt>\n"
            + "                <Doc:FinInstnId>\n"
            + "                    <Doc:BICFI>FBNINGLA</Doc:BICFI>\n"
            + "                </Doc:FinInstnId>\n"
            + "            </Doc:DbtrAgt>\n"
            + "            <Doc:CdtrAgt>\n"
            + "                <Doc:FinInstnId>\n"
            + "                    <Doc:BICFI>BELGRU21</Doc:BICFI>\n"
            + "                </Doc:FinInstnId>\n"
            + "            </Doc:CdtrAgt>\n"
            + "            <Doc:Cdtr>\n"
            + "                <Doc:Nm>TEST</Doc:Nm>\n"
            + "                <Doc:PstlAdr>\n"
            + "                    <Doc:AdrLine>TEST</Doc:AdrLine>\n"
            + "                </Doc:PstlAdr>\n"
            + "            </Doc:Cdtr>\n"
            + "            <Doc:CdtrAcct>\n"
            + "                <Doc:Id>\n"
            + "                    <Doc:Othr>\n"
            + "                        <Doc:Id>TEST</Doc:Id>\n"
            + "                    </Doc:Othr>\n"
            + "                </Doc:Id>\n"
            + "            </Doc:CdtrAcct>\n"
            + "            <Doc:RmtInf>\n"
            + "                <Doc:Ustrd>AGRICULTURAL SECTOR</Doc:Ustrd>\n"
            + "            </Doc:RmtInf>\n"
            + "        </Doc:CdtTrfTxInf>\n"
            + "    </Doc:FIToFICstmrCdtTrf>\n"
            + "</Doc:Document>\n"
            + "</RequestPayload>";

    @BeforeEach
    public void setUpStreams() {
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setErr(originalErr);
    }

    @Test
    void test() {
        new MxSwiftMessage(xmlLower + xml);
        validate();
    }

    private void validate() {
        System.out.println(errContent);
        if (errContent.toString().contains(ERROR_MESSAGE)
                || errContent.toString().contains(EX_MESSAGE)) {
            fail();
        }
    }

    @Test
    void testCamel() {
        new MxSwiftMessage(xmlCamel + xml);
        validate();
    }

    @Test
    void testMixed() {
        new MxSwiftMessage(xmlMixed + xml);
        validate();
    }

    @Test
    void testUpper() {
        new MxSwiftMessage(xmlUpper + xml);
        validate();
    }
}
