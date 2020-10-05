/*
 * Copyright (c) 2016-2018 Prowide Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of private license agreements
 * between Prowide Inc. and its commercial customers and partners.
 */
package com.prowidesoftware.swift.model.mx;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.prowidesoftware.swift.model.MxId;

/**
 * Test for the Mx parser API in the base {@link AbstractMX} class
 * 
 * @since 9.0
 */
public class AbstractMXTest {
	
	@Test
	public void testMx() {
		final String xml = 
				"		<Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:fxtr.014.001.02\" xmlns:xsi=\"{http://www.w3.org/2000/xmlns/}Doc\">\n"+
				"			<Doc:FXTradInstr>\n"+
				"				<Doc:TradInf>\n"+
				"					<Doc:OrgtrRef>QCOUCN</Doc:OrgtrRef>\n"+
				"					<Doc:CmonRef>ABCB334209XYZB33</Doc:CmonRef>\n"+
				"					<Doc:OprTp>CANC</Doc:OprTp>\n"+
				"				</Doc:TradInf>\n"+
				"			</Doc:FXTradInstr>\n"+
				"		</Doc:Document>";
		
		/*
		 * class parser call
		 */
		MxFxtr01400102 mx = MxFxtr01400102.parse(xml);
		assertNotNull(mx);
		assertNull(mx.getAppHdr());
		assertNotNull(mx.getFXTradInstr());
		assertEquals("QCOUCN", mx.getFXTradInstr().getTradInf().getOrgtrRef());
		
		/*
		 * Mx parser call
		 */
		MxFxtr01400102 mx2 = (MxFxtr01400102) AbstractMX.parse(xml, new MxId("fxtr", "014", "001", "02"));
		assertNotNull(mx2);
		assertNull(mx2.getAppHdr());
		assertNotNull(mx2.getFXTradInstr());
		assertEquals("QCOUCN", mx2.getFXTradInstr().getTradInf().getOrgtrRef());
		
		/*
		 * Mx parser call (no id)
		 */
		MxFxtr01400102 mx3 = (MxFxtr01400102) AbstractMX.parse(xml, null);
		assertNotNull(mx3);
		assertNull(mx3.getAppHdr());
		assertNotNull(mx3.getFXTradInstr());
		assertEquals("QCOUCN", mx3.getFXTradInstr().getTradInf().getOrgtrRef());
	}
	
	@Test
	public void testMxExtraNS() {
		String xml2 = 
				"<Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:fxtr.014.001.02\" xmlns:SwMsg=\"urn:swift:snl:ns.SwMsg\" xmlns:xsi=\"{http://www.w3.org/2000/xmlns/}Doc\">\n"+
				"	<Doc:FXTradInstr>\n"+
				"		<Doc:TradInf>\n"+
				"			<Doc:OrgtrRef>QCOUCN</Doc:OrgtrRef>\n"+
				"			<Doc:CmonRef>ABCB334209XYZB33</Doc:CmonRef>\n"+
				"			<Doc:OprTp>CANC</Doc:OprTp>\n"+
				"		</Doc:TradInf>\n"+
				"	</Doc:FXTradInstr>\n"+
				"</Doc:Document>";
		MxFxtr01400102 mx = (MxFxtr01400102) AbstractMX.parse(xml2, null);
		assertNotNull(mx);
		assertNull(mx.getAppHdr());
		assertNotNull(mx.getFXTradInstr());
		assertEquals("QCOUCN", mx.getFXTradInstr().getTradInf().getOrgtrRef());
	}

	@Test
	public void testParseXsys() {
		String xml = "<Doc:Document xmlns:Doc=\"urn:swift:xsd:xsys.011.001.02\" xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwInt=\"urn:swift:snl:ns.SwInt\" xmlns:SwGbl=\"urn:swift:snl:ns.SwGbl\">\n" +
				"        <Doc:xsys.011.001.02>\n" +
				"          <Doc:DlvryNtfctn>\n" +
				"            <Sw:SnFRef>swf00000-2020-07-28T15:11:11.123456Z</Sw:SnFRef>\n" +
				"            <Sw:SnFRefType>InterAct</Sw:SnFRefType>\n" +
				"            <Sw:AcceptStatus>Accepted</Sw:AcceptStatus>\n" +
				"            <Sw:DeliveryTime>2020-07-28T15:11:08Z</Sw:DeliveryTime>\n" +
				"            <Sw:AckSwiftTime>2020-07-28T15:11:08Z</Sw:AckSwiftTime>\n" +
				"            <Sw:FileRequestHeader>\n" +
				"                 <SwInt:Requestor>cn=gtxdev,o=rtbsgb2l,o=swift</SwInt:Requestor>\n" +
				"                 <SwInt:Responder>cn=gtxdev,o=rtbsgb2l,o=swift</SwInt:Responder>\n" +
				"                 <SwInt:Service>swift.finplus!pc</SwInt:Service>\n" +
				"                 <SwInt:RequestType>seev.047.001.01</SwInt:RequestType>\n" +
				"                 <SwInt:Priority>Normal</SwInt:Priority>\n" +
				"                 <SwInt:RequestRef>FOO123456</SwInt:RequestRef>\n" +
				"            </Sw:FileRequestHeader>\n" +
				"            <Doc:Xtnsn>\n" +
				"              <Doc:PlcAndNm>PlaceAndName</Doc:PlcAndNm>\n" +
				"              <Doc:XtnsnEnvlp>XtnsnEnvlp</Doc:XtnsnEnvlp>\n" +
				"            </Doc:Xtnsn>\n" +
				"          </Doc:DlvryNtfctn>\n" +
				"        </Doc:xsys.011.001.02>\n" +
				"      </Doc:Document>";
		AbstractMX mx = AbstractMX.parse(xml);
	}
	
}
