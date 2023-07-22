package com.prowidesoftware.swift.model.mx;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SupplementaryDataUtilsTest {

    final String customerXml = "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:seev.031.002.11\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" +
            "  <CorpActnNtfctn>" +
            "    <NtfctnGnlInf>" +
            "      <NtfctnTp>NEWN</NtfctnTp>" +
            "      <PrcgSts>" +
            "        <Cd>" +
            "          <EvtCmpltnsSts>PEND</EvtCmpltnsSts>" +
            "          <EvtConfSts>UNCONF</EvtConfSts>" +
            "        </Cd>" +
            "      </PrcgSts>" +
            "    </NtfctnGnlInf>" +
            "    <PrvsNtfctnId>" +
            "      <Id>9876543210</Id>" +
            "    </PrvsNtfctnId>" +
            "    <CorpActnGnlInf>" +
            "      <CorpActnEvtId>987654321</CorpActnEvtId>" +
            "      <OffclCorpActnEvtId>US987654321</OffclCorpActnEvtId>" +
            "      <EvtPrcgTp>" +
            "        <Cd>AMEN</Cd>" +
            "      </EvtPrcgTp>" +
            "      <EvtTp>" +
            "        <Cd>DIVI</Cd>" +
            "      </EvtTp>" +
            "      <MndtryVlntryEvtTp>" +
            "        <Cd>MAND</Cd>" +
            "      </MndtryVlntryEvtTp>" +
            "      <UndrlygScty>" +
            "        <FinInstrmId>" +
            "          <OthrId>" +
            "            <Id>09876A543</Id>" +
            "            <Tp>" +
            "              <Cd>SEDL</Cd>" +
            "            </Tp>" +
            "          </OthrId>" +
            "          <Desc>MUTUAL FUND XYZ</Desc>" +
            "        </FinInstrmId>" +
            "        <ClssfctnTp>" +
            "          <ClssfctnFinInstrm>MUTFD</ClssfctnFinInstrm>" +
            "        </ClssfctnTp>" +
            "      </UndrlygScty>" +
            "    </CorpActnGnlInf>" +
            "    <AcctDtls>" +
            "      <ForAllAccts>" +
            "        <IdCd>ABCD</IdCd>" +
            "      </ForAllAccts>" +
            "    </AcctDtls>" +
            "    <CorpActnDtls>" +
            "      <DtDtls>" +
            "        <PmtDt>" +
            "          <DtCd>" +
            "            <Cd>UNKN</Cd>" +
            "          </DtCd>" +
            "        </PmtDt>" +
            "      </DtDtls>" +
            "      <AddtlInf>" +
            "        <Offerr>" +
            "          <AddtlInf>FUND XYZ OFFERING</AddtlInf>" +
            "        </Offerr>" +
            "      </AddtlInf>" +
            "    </CorpActnDtls>" +
            "    <CorpActnOptnDtls>" +
            "      <OptnNb>003</OptnNb>" +
            "      <OptnTp>" +
            "        <Cd>UNIT</Cd>" +
            "      </OptnTp>" +
            "      <OptnFeatrs>" +
            "        <Cd>DEFR</Cd>" +
            "      </OptnFeatrs>" +
            "      <DfltPrcgOrStgInstr>" +
            "        <DfltOptnInd>true</DfltOptnInd>" +
            "      </DfltPrcgOrStgInstr>" +
            "      <WdrwlAllwdInd>false</WdrwlAllwdInd>" +
            "      <FinInstrmId>" +
            "        <OthrId>" +
            "          <Id>012345678</Id>" +
            "          <Tp>" +
            "            <Prtry>ZZ</Prtry>" +
            "          </Tp>" +
            "        </OthrId>" +
            "        <Desc>XYZ INVESTMENT FUND</Desc>" +
            "      </FinInstrmId>" +
            "      <DtDtls>" +
            "        <MktDdln>" +
            "          <Dt>" +
            "            <DtTm>2023-01-01T00:00:00-05:00</DtTm>" +
            "          </Dt>" +
            "        </MktDdln>" +
            "        <RspnDdln>" +
            "          <Dt>" +
            "            <DtTm>2023-01-02T00:00:00-05:00</DtTm>" +
            "          </Dt>" +
            "        </RspnDdln>" +
            "      </DtDtls>" +
            "      <PrdDtls>" +
            "        <ActnPrd>" +
            "          <Prd>" +
            "            <StartDt>" +
            "              <Dt>" +
            "                <Dt>2022-12-31</Dt>" +
            "              </Dt>" +
            "            </StartDt>" +
            "            <EndDt>" +
            "              <NotSpcfdDt>UNKN</NotSpcfdDt>" +
            "            </EndDt>" +
            "          </Prd>" +
            "        </ActnPrd>" +
            "        <RvcbltyPrd>" +
            "          <Prd>" +
            "            <StartDt>" +
            "              <NotSpcfdDt>UNKN</NotSpcfdDt>" +
            "            </StartDt>" +
            "            <EndDt>" +
            "              <Dt>" +
            "                <DtTm>2023-01-02T00:00:00-05:00</DtTm>" +
            "              </Dt>" +
            "            </EndDt>" +
            "          </Prd>" +
            "        </RvcbltyPrd>" +
            "        <AcctSvcrRvcbltyPrd>" +
            "          <Prd>" +
            "            <StartDt>" +
            "              <NotSpcfdDt>UNKN</NotSpcfdDt>" +
            "            </StartDt>" +
            "            <EndDt>" +
            "              <Dt>" +
            "                <DtTm>2023-01-02T00:00:00-05:00</DtTm>" +
            "              </Dt>" +
            "            </EndDt>" +
            "          </Prd>" +
            "        </AcctSvcrRvcbltyPrd>" +
            "      </PrdDtls>" +
            "      <AddtlInf>" +
            "        <NrrtvVrsn>" +
            "          <Lang>fr</Lang>" +
            "          <AddtlInf>NET ASSET VALUE PER SHARE</AddtlInf>" +
            "        </NrrtvVrsn>" +
            "      </AddtlInf>" +
            "    </CorpActnOptnDtls>" +
            "    <CorpActnOptnDtls>" +
            "      <OptnNb>100</OptnNb>" +
            "      <OptnTp>" +
            "        <Cd>STOK</Cd>" +
            "      </OptnTp>" +
            "      <OptnFeatrs>" +
            "        <Cd>DEFL</Cd>" +
            "      </OptnFeatrs>" +
            "      <DfltPrcgOrStgInstr>" +
            "        <DfltOptnInd>false</DfltOptnInd>" +
            "      </DfltPrcgOrStgInstr>" +
            "    </CorpActnOptnDtls>" +
            "    <AddtlInf>" +
            "      <AddtlTxt>" +
            "        <Lang>fr</Lang>" +
            "        <UpdDt>2023-01-01</UpdDt>" +
            "      </AddtlTxt>" +
            "    </AddtlInf>" +
            "    <IssrAgt>" +
            "      <NmAndAdr>" +
            "        <Nm>INVESTMENT AGENT XYZ</Nm>" +
            "      </NmAndAdr>" +
            "    </IssrAgt>" +
            "    <InfAgt>" +
            "      <NmAndAdr>" +
            "        <Nm>FINANCIAL SERVICES ABC</Nm>" +
            "      </NmAndAdr>" +
            "    </InfAgt>" +
            "    <SplmtryData>" +
            "      <Envlp>" +
            "        <Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:supl.001.001.13\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" +
            "          <DTCCCANOCSDDataSD1>" +
            "            <NtfctnGnlInf>" +
            "              <PlcAndNm>/Document/CorpActnNtfctn/NtfctnGnlInf</PlcAndNm>" +
            "              <CretDtAndTm>2023-01-01T12:34:56</CretDtAndTm>" +
            "              <UpdDtAndTm>2023-01-01T15:00:00</UpdDtAndTm>" +
            "            </NtfctnGnlInf>" +
            "            <CorpActnGnlInf>" +
            "              <PlcAndNm>/Document/CorpActnNtfctn/CorpActnGnlInf</PlcAndNm>" +
            "              <SubEvtTp>MODI</SubEvtTp>" +
            "              <InstrMsggElgbltyFlg>true</InstrMsggElgbltyFlg>" +
            "              <AsstSvcrPrcgFlg>false</AsstSvcrPrcgFlg>" +
            "            </CorpActnGnlInf>" +
            "            <UndrlygScty>" +
            "              <PlcAndNm>/Document/CorpActnNtfctn/CorpActnGnlInf/UndrlygScty</PlcAndNm>" +
            "              <DTCAsstClss>MUFO</DTCAsstClss>" +
            "              <DTCAsstTp>S111</DTCAsstTp>" +
            "              <DIVANNSctyDesc>MUTUAL FUND XYZ DESCRIPTION</DIVANNSctyDesc>" +
            "            </UndrlygScty>" +
            "            <CorpActnDtls>" +
            "              <PlcAndNm>/Document/CorpActnNtfctn/CorpActnDtls</PlcAndNm>" +
            "              <DTCAutomtdOfferPrgm>OFFL</DTCAutomtdOfferPrgm>" +
            "              <RDPRefNb>C52000091876A54300000000000000222</RDPRefNb>" +
            "            </CorpActnDtls>" +
            "            <OptnDtls>" +
            "              <PlcAndNm>/Document/CorpActnNtfctn/CorpActnOptnDtls[1]</PlcAndNm>" +
            "              <DfltOptnFlg>true</DfltOptnFlg>" +
            "              <FullCondFlg>true</FullCondFlg>" +
            "              <RDPRefNb>C52000091876A54300000000000000222</RDPRefNb>" +
            "            </OptnDtls>" +
            "            <Agt>" +
            "              <PlcAndNm>/Document/CorpActnNtfctn/IssrAgt/NmAndAdr</PlcAndNm>" +
            "              <AgtId>1000000001</AgtId>" +
            "              <AgtAdr>" +
            "                <StrtNm>1234 INVESTMENT AVENUE</StrtNm>" +
            "                <PstCd>56789</PstCd>" +
            "                <TwnNm>INVESTMENT TOWN</TwnNm>" +
            "                <CtrySubDvsn>INVESTMENT STATE</CtrySubDvsn>" +
            "                <Ctry>INVESTMENT COUNTRY</Ctry>" +
            "              </AgtAdr>" +
            "            </Agt>" +
            "            <Agt>" +
            "              <PlcAndNm>/Document/CorpActnNtfctn/InfAgt/NmAndAdr</PlcAndNm>" +
            "              <AgtId>2000000001</AgtId>" +
            "              <AgtAdr>" +
            "                <StrtNm>5678 FINANCIAL BOULEVARD, SUITE 1000</StrtNm>" +
            "                <PstCd>98765</PstCd>" +
            "                <TwnNm>FINANCIAL CITY</TwnNm>" +
            "                <CtrySubDvsn>FINANCIAL STATE</CtrySubDvsn>" +
            "                <Ctry>FINANCIAL COUNTRY</Ctry>" +
            "              </AgtAdr>" +
            "            </Agt>" +
            "          </DTCCCANOCSDDataSD1>" +
            "        </Document>" +
            "      </Envlp>" +
            "    </SplmtryData>" +
            "  </CorpActnNtfctn>" +
            "</Document>";


    @Test
    void extract() {
        // extract all SplmtryData elements from the customer XML using Java xml api
        List<String> extract = SupplementaryDataUtils.extract(customerXml);
        System.out.println("Supplementary data:");
        for (String suplementaryData : extract) {
            assertTrue(suplementaryData.contains("DTCCCANOCSDDataSD1"));
        }
    }


    @Test
    void testExtractSingleSplmtryData() {
        String xmlData = "<root><SplmtryData><Data1>Value1</Data1></SplmtryData></root>";
        List<String> extractedData = SupplementaryDataUtils.extract(xmlData);
        assertEquals(1, extractedData.size());
        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><SplmtryData><Data1>Value1</Data1></SplmtryData>", extractedData.get(0));
    }

    @Test
    void testExtractMultipleSplmtryData() {
        String xmlData = "<root><SplmtryData><Data1>Value1</Data1></SplmtryData><SplmtryData><Data2>Value2</Data2></SplmtryData></root>";
        List<String> extractedData = SupplementaryDataUtils.extract(xmlData);
        assertEquals(2, extractedData.size());
        assertTrue(extractedData.get(0).contains("<SplmtryData><Data1>Value1</Data1></SplmtryData>"));
        assertTrue(extractedData.get(1).contains("<SplmtryData><Data2>Value2</Data2></SplmtryData>"));
    }

    @Test
    void testExtractNestedSplmtryData() {
        String xmlData = "<root><SplmtryData><Data1>Value1</Data1><SplmtryData><Data2>Value2</Data2></SplmtryData></SplmtryData></root>";
        List<String> extractedData = SupplementaryDataUtils.extract(xmlData);
        assertEquals(2, extractedData.size());
        assertTrue(extractedData.get(0).contains("<SplmtryData><Data1>Value1</Data1></SplmtryData>"));
        assertTrue(extractedData.get(1).contains("<SplmtryData><Data2>Value2</Data2></SplmtryData>"));
    }

    @Test
    void testExtractNoSplmtryData() {
        String xmlData = "<root><Data>Value</Data></root>";
        List<String> extractedData = SupplementaryDataUtils.extract(xmlData);
        assertTrue(extractedData.isEmpty());
    }

    @Test
    void testExtractEmptyXml() {
        String xmlData = "";
        List<String> extractedData = SupplementaryDataUtils.extract(xmlData);
        assertTrue(extractedData.isEmpty());
    }

    @Test
    void testExtractNullXml() {
        List<String> extractedData = SupplementaryDataUtils.extract(null);
        assertTrue(extractedData.isEmpty());
    }
}