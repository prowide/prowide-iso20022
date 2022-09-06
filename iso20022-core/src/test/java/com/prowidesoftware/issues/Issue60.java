/*
 * Copyright 2006-2022 Prowide
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

import com.prowidesoftware.swift.model.mx.MinimumEscapeHandler;
import com.prowidesoftware.swift.model.mx.MxPain00100103;
import com.prowidesoftware.swift.model.mx.MxSese02400110;
import com.prowidesoftware.swift.model.mx.MxWriteConfiguration;
import com.prowidesoftware.swift.model.mx.dic.CustomerCreditTransferInitiationV03;
import com.prowidesoftware.swift.model.mx.dic.GroupHeader32;
import com.prowidesoftware.swift.model.mx.dic.PartyIdentification32;
import com.prowidesoftware.swift.model.mx.dic.PaymentInstructionInformation3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://github.com/prowide/prowide-iso20022/issues/60
 */
public class Issue60 {

    @Test
    public void test() {

        String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<DataPDU xmlns=\"urn:swift:saa:xsd:saa.2.0\">\n" +
                "    <Body>\n" +
                "        <AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">\n" +
                "            <Fr>\n" +
                "                <FIId>\n" +
                "                    <FinInstnId>\n" +
                "                        <BICFI>DCVBCOBOXXX</BICFI> <!--BIC de la entidad que envía el mensaje-->\n" +
                "                        <Othr>\n" +
                "                            <Id>DCVBCOBOXXX</Id> <!--BIC del DCV-->\n" +
                "                        </Othr>\n" +
                "                    </FinInstnId>\n" +
                "                </FIId>\n" +
                "            </Fr>\n" +
                "            <To>\n" +
                "                <FIId>\n" +
                "                    <FinInstnId>\n" +
                "                        <BICFI>IMF1COBOXXX</BICFI> <!--BIC de la entidad que recibe el mensaje-->\n" +
                "                        <Othr>\n" +
                "                            <Id>DCVBCOBOXXX</Id> <!--BIC del DCV-->\n" +
                "                        </Othr>\n" +
                "                    </FinInstnId>\n" +
                "                </FIId>\n" +
                "            </To>\n" +
                "            <BizMsgIdr>20200818X0000121</BizMsgIdr> <!--ID del mensaje-->\n" +
                "            <MsgDefIdr>sese.024.001.10</MsgDefIdr> <!--Tipo de mensaje enviado-->\n" +
                "            <CreDt><!--2020-08-18T09:08:30Z--></CreDt> <!--Fecha y hora de creación del mensaje-->\n" +
                "        </AppHdr>\n" +
                "        <Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:sese.024.001.10\">\n" +
                "            <SctiesSttlmTxStsAdvc>\n" +
                "                <TxId>\n" +
                "                    <AcctOwnrTxId>115</AcctOwnrTxId><!--Referencia de transacción informada en el tag TxId del mensaje sese.023-->\n" +
                "                    <AcctSvcrTxId>20200818T00052360</AcctSvcrTxId><!--Referencia única de la transacción en el DCV-->\n" +
                "                </TxId>\n" +
                "                <MtchgSts>\n" +
                "                    <Mtchd>MACH</Mtchd><!--Indicador de que la transacción se encuentra emparejada-->\n" +
                "                </MtchgSts>\n" +
                "                <TxDtls>\n" +
                "                    <TradDt>\n" +
                "                        <Dt>\n" +
                "                            <DtTm>2020-08-18T08:01:30</DtTm><!--Fecha y hora de negociación informada en el mensaje sese.023-->\n" +
                "                        </Dt>\n" +
                "                    </TradDt>\n" +
                "                </TxDtls>\n" +
                "            </SctiesSttlmTxStsAdvc>\n" +
                "        </Document>\n" +
                "    </Body>\n" +
                "</DataPDU>";
        MxSese02400110 mx = MxSese02400110.parse(xml);
        assertNotNull(mx.toJson());
    }

}
