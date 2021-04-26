/*
 * Copyright 2006-2021 Prowide
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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @since 9.0.1
 */
public class BusinessAppHdrV02Test {

    @Test
    public void testParseNoNamespace() {
        final String xml = "<AppHdr>" +
                "   <Fr>" +
                "      <FIId>" +
                "         <FinInstnId>" +
                "            <Nm>Not available</Nm>" +
                "         </FinInstnId>" +
                "      </FIId>" +
                "   </Fr>" +
                "   <To>" +
                "      <FIId>" +
                "         <FinInstnId>" +
                "            <Nm>Not available</Nm>" +
                "         </FinInstnId>" +
                "      </FIId>" +
                "   </To>" +
                "   <BizMsgIdr>AAAAAAAAAA222222</BizMsgIdr>" +
                "   <MsgDefIdr>seev.037.002.02</MsgDefIdr>" +
                "   <MktPrctc>" +
                "       <Regy>FOO</Regy>" +
                "       <Id>BAR</Id>·+" +
                "   </MktPrctc>" +
                "   <CreDt>2017-08-08T16:58:01Z</CreDt>" +
                "</AppHdr>";
        BusinessAppHdrV02 h = BusinessAppHdrV02.parse(xml);
        assertNotNull(h);
        //System.out.println(h.xml());
        assertEquals("Not available", h.getFr().getFIId().getFinInstnId().getNm());
        assertEquals("Not available", h.getTo().getFIId().getFinInstnId().getNm());
        assertEquals("AAAAAAAAAA222222", h.getBizMsgIdr());
        assertEquals("seev.037.002.02", h.getMsgDefIdr());
        assertEquals("FOO", h.getMktPrctc().getRegy());
        assertEquals("BAR", h.getMktPrctc().getId());
        assertNotNull(h.getCreDt());
    }

    @Test
    public void testParseNoPrefix() {
        final String xml = "<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\">" +
                "   <Fr>" +
                "      <FIId>" +
                "         <FinInstnId>" +
                "            <Nm>Not available</Nm>" +
                "         </FinInstnId>" +
                "      </FIId>" +
                "   </Fr>" +
                "   <To>" +
                "      <FIId>" +
                "         <FinInstnId>" +
                "            <Nm>Not available</Nm>" +
                "         </FinInstnId>" +
                "      </FIId>" +
                "   </To>" +
                "   <BizMsgIdr>AAAAAAAAAA222222</BizMsgIdr>" +
                "   <MsgDefIdr>seev.037.002.02</MsgDefIdr>" +
                "   <MktPrctc>" +
                "       <Regy>FOO</Regy>" +
                "       <Id>BAR</Id>·+" +
                "   </MktPrctc>" +
                "   <CreDt>2017-08-08T16:58:01Z</CreDt>" +
                "</AppHdr>";
        BusinessAppHdrV02 h = BusinessAppHdrV02.parse(xml);
        assertNotNull(h);
        //System.out.println(h.xml());
        assertEquals("Not available", h.getFr().getFIId().getFinInstnId().getNm());
        assertEquals("Not available", h.getTo().getFIId().getFinInstnId().getNm());
        assertEquals("AAAAAAAAAA222222", h.getBizMsgIdr());
        assertEquals("seev.037.002.02", h.getMsgDefIdr());
        assertEquals("FOO", h.getMktPrctc().getRegy());
        assertEquals("BAR", h.getMktPrctc().getId());
        assertNotNull(h.getCreDt());
    }

    @Test
    public void testParseWithPrefix() {
        final String xml = "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\">" +
                "   <h:Fr>" +
                "      <h:FIId>" +
                "         <h:FinInstnId>" +
                "            <h:Nm>Not available</h:Nm>" +
                "         </h:FinInstnId>" +
                "      </h:FIId>" +
                "   </h:Fr>" +
                "   <h:To>" +
                "      <h:FIId>" +
                "         <h:FinInstnId>" +
                "            <h:Nm>Not available</h:Nm>" +
                "         </h:FinInstnId>" +
                "      </h:FIId>" +
                "   </h:To>" +
                "   <h:BizMsgIdr>AAAAAAAAAA222222</h:BizMsgIdr>" +
                "   <h:MsgDefIdr>seev.037.002.02</h:MsgDefIdr>" +
                "   <h:MktPrctc>" +
                "       <h:Regy>FOO</h:Regy>" +
                "       <h:Id>BAR</h:Id>·+" +
                "   </h:MktPrctc>" +
                "   <h:CreDt>2017-08-08T16:58:01Z</h:CreDt>" +
                "</h:AppHdr>";
        BusinessAppHdrV02 h = BusinessAppHdrV02.parse(xml);
        assertNotNull(h);
        //System.out.println(h.xml());
        assertEquals("Not available", h.getFr().getFIId().getFinInstnId().getNm());
        assertEquals("Not available", h.getTo().getFIId().getFinInstnId().getNm());
        assertEquals("AAAAAAAAAA222222", h.getBizMsgIdr());
        assertEquals("seev.037.002.02", h.getMsgDefIdr());
        assertEquals("FOO", h.getMktPrctc().getRegy());
        assertEquals("BAR", h.getMktPrctc().getId());
        assertNotNull(h.getCreDt());
    }

    @Test
    public void testParseWithWrapper() {
        final String xml =
                "<foo><bar>" +
                        "<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\">" +
                        "   <Fr>" +
                        "      <FIId>" +
                        "         <FinInstnId>" +
                        "            <Nm>Not available</Nm>" +
                        "         </FinInstnId>" +
                        "      </FIId>" +
                        "   </Fr>" +
                        "   <To>" +
                        "      <FIId>" +
                        "         <FinInstnId>" +
                        "            <Nm>Not available</Nm>" +
                        "         </FinInstnId>" +
                        "      </FIId>" +
                        "   </To>" +
                        "   <BizMsgIdr>AAAAAAAAAA222222</BizMsgIdr>" +
                        "   <MsgDefIdr>seev.037.002.02</MsgDefIdr>" +
                        "   <MktPrctc>" +
                        "       <Regy>FOO</Regy>" +
                        "       <Id>BAR</Id>·+" +
                        "   </MktPrctc>" +
                        "   <CreDt>2017-08-08T16:58:01Z</CreDt>" +
                        "</AppHdr>" +
                        "</bar></foo>";
        BusinessAppHdrV02 h = BusinessAppHdrV02.parse(xml);
        assertNotNull(h);
        //System.out.println(h.xml());
        assertEquals("Not available", h.getFr().getFIId().getFinInstnId().getNm());
        assertEquals("Not available", h.getTo().getFIId().getFinInstnId().getNm());
        assertEquals("AAAAAAAAAA222222", h.getBizMsgIdr());
        assertEquals("seev.037.002.02", h.getMsgDefIdr());
        assertEquals("FOO", h.getMktPrctc().getRegy());
        assertEquals("BAR", h.getMktPrctc().getId());
        assertNotNull(h.getCreDt());
    }

}
