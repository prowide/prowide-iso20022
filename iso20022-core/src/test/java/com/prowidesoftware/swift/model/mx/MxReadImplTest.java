/*
 * Copyright (c) 2016-2018 Prowide Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of private license agreements
 * between Prowide Inc. and its commercial customers and partners.
 */
package com.prowidesoftware.swift.model.mx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

import com.prowidesoftware.swift.io.parser.MxParserTest;
import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.model.mx.dic.AccountCriteria1Choice;
import com.prowidesoftware.swift.model.mx.dic.AccountCriteria5;
import com.prowidesoftware.swift.model.mx.dic.AccountQuery1;
import com.prowidesoftware.swift.model.mx.dic.CashAccountReturnCriteria3;
import com.prowidesoftware.swift.model.mx.dic.GetAccountV05;
import com.prowidesoftware.swift.model.mx.dic.GroupHeader32;
import com.prowidesoftware.swift.model.mx.dic.PartyIdentification32;
import com.prowidesoftware.swift.model.mx.dic.QueryType2Code;
import com.prowidesoftware.swift.model.mx.dic.RejectReason1Code;
import com.prowidesoftware.swift.model.mx.dic.RequestType1Code;
import com.prowidesoftware.swift.model.mx.sys.MxXsys00200101;
import com.prowidesoftware.swift.utils.Lib;

public class MxReadImplTest {

	@Test
	public void testPacs002_With_CDATA() throws IOException {
		final String xml = Lib.readResource("pacs.002-CDATA.xml");
		MxPacs00200103 mx = (MxPacs00200103) MxReadImpl.parse(MxPacs00200103.class, xml, MxPacs00200103._classes);

		//System.out.println(mx.message());
		assertNotNull(mx);
		assertEquals("0c070cd114934bf398e6a16d81b2d129", mx.getFIToFIPmtStsRpt().getGrpHdr().getMsgId());
		assertEquals("UNKNOWN", mx.getFIToFIPmtStsRpt().getOrgnlGrpInfAndSts().getOrgnlMsgId());

		assertNotNull(mx.getAppHdr());
		assertNotNull(mx.getAppHdr().from());
		assertEquals("11de568fd1754cb7b2fbbb3dd238ff16", mx.getAppHdr().reference());
		BusinessAppHdrV01 appHeader = (BusinessAppHdrV01) mx.getAppHdr();
		assertEquals(appHeader.getFr().getFIId().getFinInstnId().getBICFI(), "TKZHCHZ0");
	}

	@Test
	public void testPacs002_With_CDATA_ReadInstance() throws IOException {
		String xml = Lib.readResource("pacs.002-CDATA.xml");
		MxPacs00200103 mx = (MxPacs00200103) new MxReadImpl().read(MxPacs00200103.class, xml, MxPacs00200103._classes);
		assertNotNull(mx);
		assertNotNull(mx.getAppHdr());
		assertEquals("11de568fd1754cb7b2fbbb3dd238ff16", mx.getAppHdr().reference());
		assertEquals("UNKNOWN", mx.getFIToFIPmtStsRpt().getOrgnlGrpInfAndSts().getOrgnlMsgId());
	}



	@Test
	public void testPacs002_With_CDATA_And_Multiple_Namespace() throws IOException {
		final String xml = Lib.readResource("pacs.002-CDATA-multiple-namespace.xml");
		MxPacs00200103 mx = (MxPacs00200103) MxReadImpl.parse(MxPacs00200103.class, xml, MxPacs00200103._classes);

		//System.out.println(mx.message());
		assertNotNull(mx);
		assertEquals("0c070cd114934bf398e6a16d81b2d129", mx.getFIToFIPmtStsRpt().getGrpHdr().getMsgId());

		assertNull(mx.getAppHdr());
	}
	
	@Test
	public void testPacs002_With_CDATA_And_NameSpace_Whit_NO_Prefix() throws IOException {
		final String xml = Lib.readResource("pacs.002-CDATA-namespace-noprefix.xml");
		MxPacs00200103 mx = (MxPacs00200103) MxReadImpl.parse(MxPacs00200103.class, xml, MxPacs00200103._classes);
		
		assertNotNull(mx);
		assertEquals("0c070cd114934bf398e6a16d81b2d129", mx.getFIToFIPmtStsRpt().getGrpHdr().getMsgId());

		assertNull(mx.getAppHdr());
	}

	@Test
	public void testPacs002_With_CDATA_And_NO_NameSpace() throws IOException {
		final String xml = Lib.readResource("pacs.002-CDATA-nonamespace.xml");
		MxPacs00200103 mx = (MxPacs00200103) MxReadImpl.parse(MxPacs00200103.class, xml, MxPacs00200103._classes);
		
		assertNotNull(mx);
		assertEquals("0c070cd114934bf398e6a16d81b2d129", mx.getFIToFIPmtStsRpt().getGrpHdr().getMsgId());

		assertNull(mx.getAppHdr());
	}
	
	@Test
	public void testPacs002_With_CDATA_And_Document_Wrapper() throws IOException {
		final String xml = Lib.readResource("pacs.002-CDATA-with-documentWrapper.xml");
		MxPacs00200103 mx = (MxPacs00200103) MxReadImpl.parse(MxPacs00200103.class, xml, MxPacs00200103._classes);
		
		assertNotNull(mx);
		assertEquals("0c070cd114934bf398e6a16d81b2d129", mx.getFIToFIPmtStsRpt().getGrpHdr().getMsgId());

		assertNull(mx.getAppHdr());
	}
	
	@Test
	public void testPacs002_With_CDATA_And_Header() throws IOException {
		final String xml = Lib.readResource("pacs.002-CDATA-with-header.xml");

		MxPacs00200103 mx = (MxPacs00200103) MxReadImpl.parse(MxPacs00200103.class, xml, MxPacs00200103._classes);
		assertNotNull(mx);
		assertEquals("0c070cd114934bf398e6a16d81b2d129", mx.getFIToFIPmtStsRpt().getGrpHdr().getMsgId());

		assertNotNull(mx.getAppHdr());
		LegacyAppHdr ah = (LegacyAppHdr) mx.getAppHdr();
		assertEquals("11308917", ah.getMsgRef());
	}

	final String camtSample = "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
			+ "    <Doc:GetAcct>\n"
			+ "        <Doc:MsgId>\n"
			+ "            <Doc:Id>ABCDEFGHIJKLMNOPQRST123456789012345</Doc:Id>\n"
			+ "        </Doc:MsgId>\n"
			+ "        <Doc:ReqTp>\n"
			+ "            <Doc:PmtCtrl>RT01</Doc:PmtCtrl>\n"
			+ "        </Doc:ReqTp>\n"
			+ "        <Doc:AcctQryDef>\n"
			+ "            <Doc:QryTp>ALLL</Doc:QryTp>\n"
			+ "            <Doc:AcctCrit>\n"
			+ "                <Doc:QryNm>ABCDEFGHIJKLMNOPQRST123456789012345</Doc:QryNm>\n"
			+ "            </Doc:AcctCrit>\n"
			+ "        </Doc:AcctQryDef>\n"
			+ "    </Doc:GetAcct>\n"
			+ "</Doc:Document>\n";
	
    @Test
    public void testReadStringAbstractMXStringClassArrayDevelopment() {
		MxCamt00300104 mx = (MxCamt00300104) new MxReadImpl().read(MxCamt00300104.class, camtSample, MxCamt00300104._classes);
		//System.out.println(mx);
		assertCamtSample(mx);
    }

    @Test
    public void testReadStringWithWrapper() {
    	final String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
        		+ "<message>\n"
        		//+ "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\"><From></From></h:AppHdr>"
        		+ camtSample
        		+ "</message>";
    	//System.out.println(xml);
    	MxCamt00300104 mx = (MxCamt00300104) new MxReadImpl().read(MxCamt00300104.class, xml, MxCamt00300104._classes);
    	assertCamtSample(mx);
		//System.out.println(mx);
    }

    @Test
    public void testReadStringWithWrapperAndHeader() {
    	final String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
        		+ "<message>\n"
        		+ MxParserTest.sampleBAH
        		+ camtSample
        		+ "</message>";
    	//System.out.println(xml);
    	MxCamt00300104 mx = (MxCamt00300104) new MxReadImpl().read(MxCamt00300104.class, xml, MxCamt00300104._classes);
    	assertCamtSample(mx);
    	assertSampleBusinessApplicationHeader(mx.getAppHdr());
    	//System.out.println(mx);
    }
    
    private void assertCamtSample(final MxCamt00300104 mx) {
		assertNotNull(mx);
		assertEquals("ABCDEFGHIJKLMNOPQRST123456789012345", mx.getGetAcct().getMsgId().getId());
		assertEquals(RequestType1Code.RT_01, mx.getGetAcct().getReqTp().getPmtCtrl());
		assertEquals(QueryType2Code.ALLL, mx.getGetAcct().getAcctQryDef().getQryTp());
		assertEquals("ABCDEFGHIJKLMNOPQRST123456789012345", mx.getGetAcct().getAcctQryDef().getAcctCrit().getQryNm());    	
    }

    @Test
    public void testReadNamspaceSingleQuote() {    	
    	final String xml = "<Document xmlns='urn:iso:std:iso:20022:tech:xsd:catm.004.001.02' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>"
    			+ "	<TermnlMgmtRjctn>"
    			+ "		<Hdr>"
    			+ "			<DwnldTrf>false</DwnldTrf>"
    			+ "			<FrmtVrsn>asdfsd</FrmtVrsn>"
    			+ "			<CreDtTm>2016-09-17T10:55:10</CreDtTm>"
    			+ "		</Hdr>"
    			+ "		<Rjct>"
    			+ "			<RjctRsn>VERS</RjctRsn>"
    			+ "		</Rjct>"
    			+ "	</TermnlMgmtRjctn>"
    			+ "</Document>";
    	MxCatm00400102 mx = (MxCatm00400102) new MxReadImpl().read(MxCatm00400102.class, xml, MxCatm00400102._classes);
    	assertNotNull(mx);
    	assertEquals(RejectReason1Code.VERS, mx.getTermnlMgmtRjctn().getRjct().getRjctRsn());
    }

    @Test
    public void testReadNamspaceSingleQuote2() {
    	final String xml = "<message>"
    			+ "<AppHdr xmlns='urn:iso:std:iso:20022:tech:xsd:head.001.001.01' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>"
    			+ "	<Fr><FIId><FinInstnId><BICFI>BNANAOLUXXX</BICFI></FinInstnId></FIId></Fr>"
    			+ "	<To><FIId><FinInstnId><BICFI>CIYUCNBAFUZ</BICFI></FinInstnId></FIId></To>"
    			+ "	<BizMsgIdr>asdfsd</BizMsgIdr>"
    			+ "	<MsgDefIdr>catm.004.001.02</MsgDefIdr>"
    			+ "	<CreDt>2016-09-16T22:34:48Z</CreDt>"
    			+ "</AppHdr>"
    			+ "<Document xmlns='urn:iso:std:iso:20022:tech:xsd:catm.004.001.02' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>"
    			+ "	<TermnlMgmtRjctn>"
    			+ "		<Hdr>"
    			+ "			<DwnldTrf>false</DwnldTrf>"
    			+ "			<FrmtVrsn>asdfsd</FrmtVrsn>"
    			+ "			<CreDtTm>2016-09-17T10:55:10</CreDtTm>"
    			+ "		</Hdr>"
    			+ "		<Rjct>"
    			+ "			<RjctRsn>VERS</RjctRsn>"
    			+ "		</Rjct>"
    			+ "	</TermnlMgmtRjctn>"
    			+ "</Document>"
    			+ "</message>";
    	MxCatm00400102 mx = (MxCatm00400102) new MxReadImpl().read(MxCatm00400102.class, xml, MxCatm00400102._classes);
    	assertNotNull(mx);
    	assertNotNull(mx.getAppHdr());
    	assertEquals("BNANAOLUXXX", mx.getAppHdr().from());
    	assertEquals(RejectReason1Code.VERS, mx.getTermnlMgmtRjctn().getRjct().getRjctRsn());
    }

	public static void assertSampleBusinessApplicationHeader(final AppHdr bh) {
		assertNotNull(bh);
		BusinessAppHdrV01 bah = (BusinessAppHdrV01) bh;
		assertNotNull(bah);
		/*
		* From
		*/
		assertNotNull(bah.getFr());
		assertNotNull(bah.getFr().getFIId());
		assertNotNull(bah.getFr().getFIId().getFinInstnId());
		assertEquals("FOOCUS3NXXX", bah.getFr().getFIId().getFinInstnId().getBICFI());
		assertEquals("T2S", bah.getFr().getFIId().getFinInstnId().getClrSysMmbId().getClrSysId().getPrtry());
		assertEquals("ADMNUSERLUXCSDT1", bah.getFr().getFIId().getFinInstnId().getClrSysMmbId().getMmbId());
		/*
		* To
		*/
		assertNotNull(bah.getTo());
		assertNotNull(bah.getTo().getFIId());
		assertNotNull(bah.getTo().getFIId().getFinInstnId());
		assertEquals("ABICUS33", bah.getTo().getFIId().getFinInstnId().getBICFI());
		assertEquals("AARBDE5W100", bah.getTo().getFIId().getFinInstnId().getOthr().getId());
		/*
		* Reference, date, etc
		*/
		assertEquals("2012111915360885", bah.getBizMsgIdr());
		assertEquals("seev.031.002.03", bah.getMsgDefIdr());
		assertEquals("CSD", bah.getBizSvc());
		assertNotNull(bah.getCreDt());
		assertEquals(2015, bah.getCreDt().getYear());
		assertEquals(8, bah.getCreDt().getMonth());
	}

	@Test
	public void readMxCreated() {
		final MxCamt00300105 mx = new MxCamt00300105();

		final CashAccountReturnCriteria3 carc3 = new CashAccountReturnCriteria3();
		carc3.setAcctOwnrInd(true);
		carc3.setAcctSvcrInd(false);
		carc3.setStgOrdrInd(true);

		final AccountCriteria5 ac5 = new AccountCriteria5();
		ac5.setNewQryNm("hello world");
		ac5.setRtrCrit(carc3);

		final AccountCriteria1Choice ac1c = new AccountCriteria1Choice();
		ac1c.setQryNm("foo hello world");
		ac1c.setNewCrit(ac5);

		final AccountQuery1 aq1 = new AccountQuery1();
		aq1.setAcctCrit(ac1c);

		final GetAccountV05 gav5 = new GetAccountV05();
		gav5.setAcctQryDef(aq1);

		mx.setGetAcct(gav5);

		final String xml = mx.message();

		//System.out.println("XML1: "+xml);
		//AbstractMX._forma = 1;

		final AbstractMX read = new MxReadImpl().read(MxCamt00300105.class, xml, MxCamt00300105._classes);
		assertNotNull("read object null ", read);
		assertTrue(read instanceof MxCamt00300105);
		final MxCamt00300105 mx2 = (MxCamt00300105) read;
		//System.out.println("Read: "+mx2);
		assertEquals(mx, mx2);
	}

	final static String xml1 =
			"<?xml version=\"1.0\" encoding=\"UTF-8\"?><Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.05\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
					"   <Doc:GetAcct>\n" +
					"       <Doc:MsgHdr>\n" +
					"       <Doc:MsgId>12345</Doc:MsgId>\n" +
					"       <Doc:ReqTp>\n" +
					"           <Doc:PmtCtrl>RT02</Doc:PmtCtrl>\n" +
					"       </Doc:ReqTp>\n" +
					"       </Doc:MsgHdr>\n" +
					"       <Doc:AcctQryDef>\n" +
					"           <Doc:QryTp>MODF</Doc:QryTp>\n" +
					"           <Doc:AcctCrit>\n" +
					"               <Doc:QryNm>12345 78901234567890123456789012345</Doc:QryNm>\n" +
					"           </Doc:AcctCrit>\n" +
					"       </Doc:AcctQryDef>\n" +
					"   </Doc:GetAcct>\n" +
					"</Doc:Document>";

	private void assertXml1(AbstractMX read) {
		assertNotNull("read object null ", read);
		assertTrue(read instanceof MxCamt00300105);
		final MxCamt00300105 mx2 = (MxCamt00300105) read;
		final GetAccountV05 getGetAcct = mx2.getGetAcct();
		assertNotNull("getGetAcct is null", getGetAcct);
		assertNotNull(getGetAcct.getMsgHdr());
		final String msgId = getGetAcct.getMsgHdr().getMsgId();
		assertEquals("12345", msgId);
		assertNotNull(getGetAcct.getAcctQryDef());
		assertNotNull(getGetAcct.getAcctQryDef().getQryTp());
		assertEquals("MODF", getGetAcct.getAcctQryDef().getQryTp().value());
	}

	@Test
	public void readMxXmlString() {
		assertXml1(new MxReadImpl().read(MxCamt00300105.class, xml1,  MxCamt00300105._classes));
	}

	@Test
	public void readMxXmlStringReflection() {
		assertXml1(new MxReadImpl().read(xml1, new MxId("camt.003.001.05")));
	}

	@Test
	public void readMxXmlStringReflectionAutodetect() {
		assertXml1(new MxReadImpl().read(xml1, null));
	}

	@Test
	public void readMxXmlStringStaticParse() {
		assertXml1(MxCamt00300105.parse(xml1));
	}

	@Test
	public void readMxXmlSampleStaticFromFile() throws IOException {
		final AbstractMX read = AbstractMX.parse(Lib.readResource("camt.003.001.04.xml"), null);
		assertNotNull("read object null ", read);
		assertTrue(read instanceof MxCamt00300104);
		final MxCamt00300104 mx = (MxCamt00300104) read;
		//System.out.println(ToStringBuilder.reflectionToString(mx));
		assertNotNull(mx);
		assertNotNull(mx.getGetAcct());
		assertEquals("ABCDEFGHIJKLMNOPQRST123456789012345", mx.getGetAcct().getMsgId().getId());
	}

	@Test
	public void readMxXmlSampleMxPain00100102() throws IOException {
		final String xml = Lib.readResource("pacs.008.001.07.xml");
		//System.out.println(xml);
		assertNotNull(xml);
		final MxPacs00800107 mx = (MxPacs00800107) new MxReadImpl().read(MxPacs00800107.class, xml, MxPacs00800107._classes);
		//System.out.println(ToStringBuilder.reflectionToString(mx));
		assertNotNull(mx);
		assertNotNull(mx.getFIToFICstmrCdtTrf());
		assertNotNull("123452342", mx.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getPmtId().getTxId());
		//System.out.println(mx);
	}

	@Test
	public void readMxXmlSampleMxCamt00300104() throws IOException {
		final String xml = Lib.readResource("camt.003.001.04.xml");
		//System.out.println(xml);
		assertNotNull(xml);
		final MxCamt00300104 mx = MxCamt00300104.parse(xml);
		//System.out.println(ToStringBuilder.reflectionToString(mx));
		assertNotNull(mx);
		assertNotNull(mx.getGetAcct());
		assertEquals("ABCDEFGHIJKLMNOPQRST123456789012345", mx.getGetAcct().getMsgId().getId());
	}

	String _MxCamt00300104Meta = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

	String _MxCamt00300104Document = "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.99\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n";

	String _MxCamt00300104Content = "<Doc:GetAcct>\n" +
			"    <Doc:MsgId>\n" +
			"        <Doc:Id>ABCDEFGHIJKLMNOPQRST123456789012345</Doc:Id>\n" +
			"    </Doc:MsgId>\n" +
			"    <Doc:ReqTp>\n" +
			"        <Doc:PmtCtrl>RT01</Doc:PmtCtrl>\n" +
			"    </Doc:ReqTp>\n" +
			"    <Doc:AcctQryDef>\n" +
			"        <Doc:QryTp>ALLL</Doc:QryTp>\n" +
			"        <Doc:AcctCrit>\n" +
			"            <Doc:QryNm>ABCDEFGHIJKLMNOPQRST123456789012345</Doc:QryNm>\n" +
			"        </Doc:AcctCrit>\n" +
			"    </Doc:AcctQryDef>\n" +
			"</Doc:GetAcct>\n";

	String _MXPortion = "<Doc:PstlAdr>\n" +
			"	<Doc:AdrTp>MLTO</Doc:AdrTp>\n" +
			"	<Doc:AdrLine>sdfsddsfghsbvbgeotgv;:=sdrfq;qskderjvcvc;=v=dgfpqsjf</Doc:AdrLine>\n" +
			"	<Doc:StrtNm>sdfsddsfghsbvbgeotgv;:=sdrfq;qskderjvcvc;=v=dgfpqsjf</Doc:StrtNm>\n" +
			"	<Doc:BldgNb>htyrde2q5e8iuhrc</Doc:BldgNb>\n" +
			"	<Doc:PstCd>htyrde2q5e8iuhrc</Doc:PstCd>\n" +
			"	<Doc:TwnNm>j*98jh9 i98juhfgu7j;[_+^%trcxie$ )u</Doc:TwnNm>\n" +
			"	<Doc:CtrySubDvsn>j*98jh9 i98juhfgu7j;[_+^%trcxie$ )u</Doc:CtrySubDvsn>\n" +
			"	<Doc:Ctry>NL</Doc:Ctry>\n" +
			"</Doc:PstlAdr>\n";

	@Test
	public void readMxXmlSampleMxCamt00300104_2() {
		final String xml = _MxCamt00300104Meta + _MxCamt00300104Document + _MxCamt00300104Content + "</Doc:Document>";
		final MxCamt00300104 mx = MxCamt00300104.parse(xml);
		//System.out.println(ToStringBuilder.reflectionToString(mx));
		assertNotNull(mx);
		assertNotNull(mx.getGetAcct());
		assertEquals("ABCDEFGHIJKLMNOPQRST123456789012345", mx.getGetAcct().getMsgId().getId());
	}

	/**
	 * The XML is well formed, header is ok, but business tags content are from another MX type.
	 * Expected to read OK anyway.
	 */
	@Test
	public void readMxXmlSampleMxCamt00300104_wrongTags() {
		final String xml = _MxCamt00300104Meta + _MxCamt00300104Document + _MXPortion + "</Doc:Document>";
		//System.out.println(xml);
		final MxCamt00300104 mx = MxCamt00300104.parse(xml);
		//System.out.println(ToStringBuilder.reflectionToString(mx));
		assertNotNull(mx);
		assertNull(mx.getGetAcct());
	}

	/**
	 * The XML is well formed, header is ok, but business tags content are a mix between the expected MX and another one.
	 * Expected to read OK anyway the corresponding tags, ignoring the rest.
	 */
	@Test
	public void readMxXmlSampleMxCamt00300104_mixedMXsTags() {
		final String xml = _MxCamt00300104Meta + _MxCamt00300104Document + _MxCamt00300104Content + _MXPortion + "</Doc:Document>";
		//System.out.println(xml);
		final MxCamt00300104 mx = MxCamt00300104.parse(xml);
		//System.out.println(ToStringBuilder.reflectionToString(mx));
		assertNotNull(mx);
		assertNotNull(mx.getGetAcct());
	}

	/**
	 * The XML is well formed, header is ok, but business tags content are a mix between the expected MX and another one.
	 * Expected to read OK anyway the corresponding tags, ignoring the rest.
	 */
	@Test
	public void readMxXmlSampleMxCamt00300104_mixedMXsTags2() {
		final String xml = _MxCamt00300104Meta + _MxCamt00300104Document + _MXPortion + _MxCamt00300104Content + "</Doc:Document>";
		//System.out.println(xml);
		final MxCamt00300104 mx = MxCamt00300104.parse(xml);
		//System.out.println(ToStringBuilder.reflectionToString(mx));
		assertNotNull(mx);
		assertNotNull(mx.getGetAcct());
	}

	/**
	 * The XML is well formed, header is ok, but business tags content are a mix between the expected MX and another one.
	 * Expected to read OK anyway the corresponding tags, ignoring the rest.
	 */
	@Test
	public void readMxXmlSampleMxCamt00300104_mixedMXsTags3() {
		final String xml = _MxCamt00300104Meta + _MxCamt00300104Document + _MXPortion + _MxCamt00300104Content + _MXPortion + "</Doc:Document>";
		//System.out.println(xml);
		final MxCamt00300104 mx = MxCamt00300104.parse(xml);
		//System.out.println(ToStringBuilder.reflectionToString(mx));
		assertNotNull(mx);
		assertNotNull(mx.getGetAcct());
	}

	/**
	 * Th XML is missing the xml metadata tag. Expected to read ok anyway.
	 */
	@Test
	public void readMxXmlSampleMxCamt00300104_missignMetadata() {
		final String xml = _MxCamt00300104Document + _MxCamt00300104Content + "</Doc:Document>";
		//System.out.println(xml);
		final MxCamt00300104 mx = MxCamt00300104.parse(xml);
		//System.out.println(ToStringBuilder.reflectionToString(mx));
		assertNotNull(mx);
	}

	/**
	 * Read is expected to fail because of not well formed XML.
	 */
	@Test(expected=RuntimeException.class)
	public void readMxXmlSampleMxCamt00300104_missignClosingTag() {
		final String xml = _MxCamt00300104Meta + _MxCamt00300104Document + _MxCamt00300104Content;
		//System.out.println(xml);
		MxCamt00300104.parse(xml);
	}

	/**
	 * Read is expected to fail because of malformed xml
	 */
	@Test
	public void readMalformedXMl() {
		assertNull(MxCamt00300104.parse("<very></bad>"));
	}

	/**
	 * Read is expected to fail because of empty xml
	 */
	@Test(expected=IllegalArgumentException.class)
	public void readEmpty() {
		MxCamt00300104.parse("");
	}

	/**
	 * Read is expected to fail because of null xml
	 */
	@Test(expected = IllegalArgumentException.class )
	public void readNull() {
		MxCamt00300104.parse((String)null);
	}

	/**
	 * Read and write gregorian calendar time date
	 */
	@Test
	public void readDateTime() {
		final String xml =
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
						"<Doc:Document xmlns:Doc=\"urn:swift:xsd:pacs.008.001.02\">\n" +
						"	<Doc:FIToFICstmrCdtTrf>\n" +
						"		<Doc:CdtTrfTxInf>\n" +
						"	         <Doc:SttlmTmIndctn>\n"+
						"	            <Doc:DbtDtTm>2015-11-19T12:13:14.000-02:00</Doc:DbtDtTm>\n" +
						"	         </Doc:SttlmTmIndctn>\n"+
						"	      </Doc:CdtTrfTxInf>\n"+
						"	   </Doc:FIToFICstmrCdtTrf>\n"+
						"	</Doc:Document>";
		final MxPacs00800102 mx = MxPacs00800102.parse(xml);
		//System.out.println(mx.message());
		assertNotNull(mx.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmIndctn());
		assertNotNull(mx.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmIndctn().getDbtDtTm());
	}

	@Test
	public void testrReadFxtr() {
		final String xml = "<Document>"
				+ "<FXTradInstr>"
				+ "	<TradInf>"
				+ "		<TradDt>20130103</TradDt>"
				+ "		<OrgtrRef>12345</OrgtrRef>"
				+ "		<CmonRef>BEBEB00632CRESZ0</CmonRef>"
				+ "		<OprTp>NEWT</OprTp>"
				+ "	</TradInf>"
				+ "	<TradgSdId>"
				+ "		<SubmitgPty>"
				+ "			<AnyBIC><AnyBIC>CRESCHZ0AXXX</AnyBIC></AnyBIC>"
				+ "		</SubmitgPty>"
				+ "		<TradPty>"
				+ "			<AnyBIC><AnyBIC>/NAME/FUND/LEIC/A123456789BCDEFGHJ02|TESTBEVT</AnyBIC></AnyBIC>"
				+ "		</TradPty>"
				+ "	</TradgSdId>"
				+ "	<CtrPtySdId>"
				+ "		<SubmitgPty>"
				+ "			<AnyBIC><AnyBIC>CRESCHZ0AXXX</AnyBIC></AnyBIC>"
				+ "		</SubmitgPty>"
				+ "		<TradPty>"
				+ "			<AnyBIC><AnyBIC>/NAME/FUND/LEIC/A123456789BCDEFGHJ02|TESTCHVT</AnyBIC></AnyBIC>"
				+ "		</TradPty>"
				+ "	</CtrPtySdId>"
				+ "	<TradAmts>"
				+ "		<TradgSdBuyAmt>IDR1548000000.</TradgSdBuyAmt>"
				+ "		<TradgSdSellAmt>USD171427.37</TradgSdSellAmt>"
				+ "		<SttlmDt>20130103</SttlmDt>"
				+ "	</TradAmts>"
				+ "	<AgrdRate>"
				+ "		<XchgRate>9030.0632</XchgRate>"
				+ "	</AgrdRate>"
				+ "	<CtrPtySdSttlmInstrs>"
				+ "		<RcvgAgt>"
				+ "			<AnyBIC><AnyBIC>TESTUSVT</AnyBIC></AnyBIC>"
				+ "		</RcvgAgt>"
				+ "	</CtrPtySdSttlmInstrs>"
				+ "</FXTradInstr>"
				+ "</Document>";

		final MxFxtr01400103 mx = MxFxtr01400103.parse(xml);
		//System.out.println(mx.message());
		assertNotNull(mx);
		assertNotNull(mx.getFXTradInstr());
		assertNotNull(mx.getFXTradInstr().getTradInf());
		assertNotNull(mx.getFXTradInstr().getTradInf().getTradDt());
	}

	@Test
	public void tesDocumentNoHeader() {
		final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
				"<message>" +
				"<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.05\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
				"   <Doc:GetAcct>\n" +
				"       <Doc:MsgHdr>\n" +
				"       <Doc:MsgId>12345</Doc:MsgId>\n" +
				"       <Doc:ReqTp>\n" +
				"           <Doc:PmtCtrl>RT02</Doc:PmtCtrl>\n" +
				"       </Doc:ReqTp>\n" +
				"       </Doc:MsgHdr>\n" +
				"       <Doc:AcctQryDef>\n" +
				"           <Doc:QryTp>MODF</Doc:QryTp>\n" +
				"           <Doc:AcctCrit>\n" +
				"               <Doc:QryNm>12345 78901234567890123456789012345</Doc:QryNm>\n" +
				"           </Doc:AcctCrit>\n" +
				"       </Doc:AcctQryDef>\n" +
				"   </Doc:GetAcct>\n" +
				"</Doc:Document>" +
				"</message>";
		MxCamt00300105 mx = MxCamt00300105.parse(xml);
		assertNotNull("parsed message is null", mx);
		//System.out.println(mx.message());
		assertNotNull(mx.getGetAcct());
		assertNull(mx.getAppHdr());
	}

	@Test
	public void testMxWithHeader() {
		final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
				"<message>"+
				"<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"> "+
				"<Fr>"+
				"	<FIId>"+
				"		<FinInstnId>"+
				"			<BICFI>FOOCUS3NXXX</BICFI>"+
				"			<ClrSysMmbId>"+
				"				<ClrSysId>"+
				"					<Prtry>T2S</Prtry>"+
				"				</ClrSysId>"+
				"				<MmbId>ADMNUSERLUXCSDT1</MmbId>"+
				"			</ClrSysMmbId>"+
				"			<Othr>"+
				"				<Id>FOOTXE2SXXX</Id>"+
				"			</Othr> "+
				"		</FinInstnId> "+
				"	</FIId> "+
				"</Fr> "+
				"<To> "+
				"	<FIId>"+
				"		<FinInstnId>"+
				"			<BICFI>ABICUS33</BICFI>"+
				"			<Othr>"+
				"				<Id>AARBDE5W100</Id>"+
				"			</Othr>"+
				"		</FinInstnId> "+
				"	</FIId> "+
				"</To> "+
				"<BizMsgIdr>2012111915360885</BizMsgIdr>"+
				"<MsgDefIdr>seev.031.002.03</MsgDefIdr> "+
				"<BizSvc>CSD</BizSvc> "+
				"<CreDt>2015-08-27T08:59:00Z</CreDt>"+
				"</AppHdr> "+
				"<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.05\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
				"   <Doc:GetAcct>\n" +
				"       <Doc:MsgHdr>\n" +
				"       <Doc:MsgId>12345</Doc:MsgId>\n" +
				"       <Doc:ReqTp>\n" +
				"           <Doc:PmtCtrl>RT02</Doc:PmtCtrl>\n" +
				"       </Doc:ReqTp>\n" +
				"       </Doc:MsgHdr>\n" +
				"       <Doc:AcctQryDef>\n" +
				"           <Doc:QryTp>MODF</Doc:QryTp>\n" +
				"           <Doc:AcctCrit>\n" +
				"               <Doc:QryNm>12345 78901234567890123456789012345</Doc:QryNm>\n" +
				"           </Doc:AcctCrit>\n" +
				"       </Doc:AcctQryDef>\n" +
				"   </Doc:GetAcct>\n" +
				"</Doc:Document>" +
				"</message>";
		MxCamt00300105 mx = MxCamt00300105.parse(xml);
		assertNotNull("parsed message is null", mx);
		//System.out.println(mx.message());
		assertNotNull(mx.getAppHdr());
		assertEquals("2012111915360885", mx.getAppHdr().reference());
		assertNotNull(mx.getGetAcct());
		assertEquals("12345", mx.getGetAcct().getMsgHdr().getMsgId());

		// deprecated API test
		assertNotNull(mx.getAppHdr());
		assertEquals("2012111915360885", mx.getAppHdr().reference());
		assertNotNull(mx.getGetAcct());
		assertEquals("12345", mx.getGetAcct().getMsgHdr().getMsgId());
	}

	/**
	 * The content is an MX valid message with some additional content that whould be ignored
	 */
	@Test
	public void testParseMxWithAdditionalContent() {
		String xml = "<Document xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns=\"urn:iso:std:iso:20022:tech:xsd:pain.001.001.03\">\n" +
				"\t<CstmrCdtTrfInitn>\n" +

				// this Header element is not MX compliant nad should be silently ignored
				"\t\t<Header>\n" +
				"\t\t\t<UniqueID>URGP3225</UniqueID>\n" +
				"\t\t\t<CreDtTm>2018-01-15T17:30:33.4878001+02:00</CreDtTm>\n" +
				"\t\t\t<Authstn>\n" +
				"\t\t\t\t<Prtry>P</Prtry>\n" +
				"\t\t\t</Authstn>\n" +
				"\t\t\t<count>1</count>\n" +
				"\t\t\t<SUM>1000.00</SUM>\n" +
				"\t\t\t<InitgPty>\n" +
				"\t\t\t\t<Nm>ABCCBC</Nm>\n" +
				"\t\t\t\t<PstlAdr>\n" +
				"\t\t\t\t\t<Ctry>KW</Ctry>\n" +
				"\t\t\t\t\t<AdrLine>KW</AdrLine>\n" +
				"\t\t\t\t</PstlAdr>\n" +
				"\t\t\t\t<Id>\n" +
				"\t\t\t\t\t<OrgId>\n" +
				"\t\t\t\t\t\t<Othr>\n" +
				"\t\t\t\t\t\t\t<Id>ABBB</Id>\n" +
				"\t\t\t\t\t\t</Othr>\n" +
				"\t\t\t\t\t</OrgId>\n" +
				"\t\t\t\t</Id>\n" +
				"\t\t\t</InitgPty>\n" +
				"\t\t</Header>\n" +

				"\t\t<PmtInf>\n" +
				"\t\t\t<PmtInfId>3225</PmtInfId>\n" +
				"\t\t\t<PmtMtd>TRF</PmtMtd>\n" +
				"\t\t\t<PmtTpInf>\n" +
				"\t\t\t\t<SvcLvl>\n" +
				"\t\t\t\t\t<Prtry>1</Prtry>\n" +
				"\t\t\t\t</SvcLvl>\n" +
				"\t\t\t\t<CtgyPurp>\n" +
				"\t\t\t\t\t<Cd>BEN</Cd>\n" +
				"\t\t\t\t</CtgyPurp>\n" +
				"\t\t\t</PmtTpInf>\n" +
				"\t\t\t<ReqdExctnDt>2018-01-23</ReqdExctnDt>\n" +
				"\t\t\t<!-- <ReqdExctnDt>2018-01-15T17:30:33.4878001+02:00</ReqdExctnDt> -->\n" +
				"\t\t\t<Dbtr>\n" +
				"\t\t\t\t<Nm>ABCCBC</Nm>\n" +
				"\t\t\t\t<PstlAdr>\n" +
				"\t\t\t\t\t<Ctry>KW</Ctry>\n" +
				"\t\t\t\t</PstlAdr>\n" +
				"\t\t\t</Dbtr>\n" +
				"\t\t\t<DbtrAcct>\n" +
				"\t\t\t\t<Id>\n" +
				"\t\t\t\t\t<IBAN>dfdsfdsfdsfds</IBAN>\n" +
				"\t\t\t\t</Id>\n" +
				"\t\t\t</DbtrAcct>\n" +
				"\t\t\t<DbtrAgt>\n" +
				"\t\t\t\t<FinInstnId>\n" +
				"\t\t\t\t\t<BIC>GULBKWKWXXX</BIC>\n" +
				"\t\t\t\t\t<PstlAdr>\n" +
				"\t\t\t\t\t\t<Ctry>KW</Ctry>\n" +
				"\t\t\t\t\t</PstlAdr>\n" +
				"\t\t\t\t</FinInstnId>\n" +
				"\t\t\t</DbtrAgt>\n" +
				"\t\t\t<CdtTrfTxInf>\n" +
				"\t\t\t\t<PmtId>\n" +
				"\t\t\t\t\t<InstrId>TR3397</InstrId>\n" +
				"\t\t\t\t\t<EndToEndId>TR3397</EndToEndId>\n" +
				"\t\t\t\t</PmtId>\n" +
				"\t\t\t\t<Amt>\n" +
				"\t\t\t\t\t<InstdAmt Ccy=\"KWD\">10.00</InstdAmt>\n" +
				"\t\t\t\t</Amt>\n" +
				"\t\t\t\t<ChrgBr>CRED</ChrgBr>\n" +
				"\t\t\t\t<CdtrAgt>\n" +
				"\t\t\t\t\t<FinInstnId>\n" +
				"\t\t\t\t\t\t<BIC>SOTTFRPPXXX</BIC>\n" +
				"\t\t\t\t\t\t<PstlAdr>\n" +
				"\t\t\t\t\t\t\t<Ctry>FR</Ctry>\n" +
				"\t\t\t\t\t\t\t<AdrLine>France</AdrLine>\n" +
				"\t\t\t\t\t\t</PstlAdr>\n" +
				"\t\t\t\t\t</FinInstnId>\n" +
				"\t\t\t\t</CdtrAgt>\n" +
				"\t\t\t\t<Cdtr>\n" +
				"\t\t\t\t\t<Nm>DECATHLON CAMPUS</Nm>\n" +
				"\t\t\t\t\t<PstlAdr>\n" +
				"\t\t\t\t\t\t<Ctry>FR</Ctry>\n" +
				"\t\t\t\t\t</PstlAdr>\n" +
				"\t\t\t\t</Cdtr>\n" +
				"\t\t\t\t<CdtrAcct>\n" +
				"\t\t\t\t\t<Id>\n" +
				"\t\t\t\t\t\t<IBAN>IN7630003011000002055047274</IBAN>\n" +
				"\t\t\t\t\t</Id>\n" +
				"\t\t\t\t</CdtrAcct>\n" +
				"\t\t\t\t<InstrForDbtrAgt>//GDS</InstrForDbtrAgt>\n" +
				"\t\t\t\t<RltdRmtInf>\n" +
				"\t\t\t\t\t<RmtLctnMtd>EMAL</RmtLctnMtd>\n" +
				"\t\t\t\t\t<RmtLctnElctrncAdr>test@test.com</RmtLctnElctrncAdr>\n" +
				"\t\t\t\t</RltdRmtInf>\n" +
				"\t\t\t\t<RmtInf>\n" +
				"\t\t\t\t\t<Ustrd>Remittance Info</Ustrd>\n" +
				"\t\t\t\t</RmtInf>\n" +
				"\t\t\t</CdtTrfTxInf>\n" +
				"\t\t</PmtInf>\n" +
				"\t</CstmrCdtTrfInitn>\n" +
				"</Document>";
		MxPain00100103 mx = MxPain00100103.parse(xml);
		assertNotNull(mx);
		assertEquals("3225", mx.getCstmrCdtTrfInitn().getPmtInf().get(0).getPmtInfId());
		mx.getCstmrCdtTrfInitn().setGrpHdr(new GroupHeader32());
		mx.getCstmrCdtTrfInitn().getGrpHdr().setInitgPty(new PartyIdentification32());
	}

	@Test
	public void testMxXsys00200101() {
		String xml = "<Doc:Document xmlns:Doc=\"urn:swift:xsd:xsys.002.001.01\"\n" +
				"    xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwSec=\"urn:swift:snl:ns.SwSec\"\n" +
				"    xmlns:SwInt=\"urn:swift:snl:ns.SwInt\">\n" +
				"    <Doc:xsys.002.001.01>\n" +
				"        <Doc:AuthstnNtfctn>\n" +
				"            <Sw:SnFRef>091203BANKBEBBAXXX2222123456</Sw:SnFRef>\n" +
				"            <SwInt:RequestHeader>\n" +
				"                <SwInt:Requestor>o=carbvec0,o=swift</SwInt:Requestor>\n" +
				"                <SwInt:Responder>o=abcdusaa,o=swift</SwInt:Responder>\n" +
				"                <SwInt:Service>TGT</SwInt:Service>\n" +
				"                <SwInt:RequestRef>MUR111222333</SwInt:RequestRef>\n" +
				"            </SwInt:RequestHeader>\n" +
				"        </Doc:AuthstnNtfctn>\n" +
				"    </Doc:xsys.002.001.01>\n" +
				"</Doc:Document>";
		MxXsys00200101 mx = (MxXsys00200101) MxReadImpl.parse(MxXsys00200101.class, xml, MxXsys00200101._classes);
		//System.out.println(mx.message());
		assertNotNull(mx);
		assertEquals("091203BANKBEBBAXXX2222123456", mx.getXsys00200101().getAuthstnNtfctn().getSnFRef());
	}

	/**
	 * Test that external entities feature is disabled in the XML parsing to avoid XXE (external entity injection)
	 */
	//@Test
	public void testXxeDisabled() {
		final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
				"<!DOCTYPE foo [ <!ENTITY xxe SYSTEM \"file:///etc/passwd\" >]>"+
				"<message>"+
				"<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"> "+
				"<Fr>"+
				"	<FIId>"+
				"		<FinInstnId>"+
				"			<BICFI>FOOCUS3NXXX</BICFI>"+
				"			<Othr>"+
				"				<Id>&xxe;</Id>"+
				"			</Othr> "+
				"		</FinInstnId> "+
				"	</FIId> "+
				"</Fr> "+
				"</AppHdr> "+
				"<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.05\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
				"   <Doc:GetAcct>\n" +
				"       <Doc:MsgHdr>\n" +
				"       <Doc:MsgId>&xxe;</Doc:MsgId>\n" +
				"       </Doc:MsgHdr>\n" +
				"   </Doc:GetAcct>\n" +
				"</Doc:Document>" +
				"</message>";
		MxCamt00300105 mx = MxCamt00300105.parse(xml);
		assertNull(mx);
	}

	/**
	 * Test that external entities feature is disabled in the XML parsing to avoid XXE (external entity injection)
	 */
	//@Test
	public void testXxeDisabled2() {
		final String xml = "<!DOCTYPE foo [ <!ENTITY xxe SYSTEM \"file:///etc/passwd\" >]>"
				+"<message>"
				+ "<AppHdr xmlns='urn:iso:std:iso:20022:tech:xsd:head.001.001.01' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>"
				+ "	<Fr><FIId><FinInstnId><BICFI>BNANAOLUXXX</BICFI></FinInstnId></FIId></Fr>"
				+ "	<To><FIId><FinInstnId><BICFI>CIYUCNBAFUZ</BICFI></FinInstnId></FIId></To>"
				+ "	<BizMsgIdr>&xxe;</BizMsgIdr>"
				+ "	<MsgDefIdr>catm.004.001.02</MsgDefIdr>"
				+ "	<CreDt>2016-09-16T22:34:48Z</CreDt>"
				+ "</AppHdr>"
				+ "<Document xmlns='urn:iso:std:iso:20022:tech:xsd:catm.004.001.02' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>"
				+ "	<TermnlMgmtRjctn>"
				+ "		<Hdr>"
				+ "			<DwnldTrf>false</DwnldTrf>"
				+ "			<FrmtVrsn>&xxe;</FrmtVrsn>"
				+ "			<CreDtTm>2016-09-17T10:55:10</CreDtTm>"
				+ "		</Hdr>"
				+ "	</TermnlMgmtRjctn>"
				+ "</Document>"
				+ "</message>";
		MxCatm00400102 mx = (MxCatm00400102) new MxReadImpl().read(MxCatm00400102.class, xml, MxCatm00400102._classes);
		assertNull(mx);
	}

}
