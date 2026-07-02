
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The BatchTransferResponse message is sent by any party to any party (acquirer, agent or issuer) in response to a BatchTransferInitiation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchTransferResponseV03", propOrder = {
    "hdr",
    "btchId",
    "orgnlBtchId",
    "nbOfMsgs",
    "btchChcksm",
    "reqAck",
    "orgtr",
    "dstn",
    "prgrmm",
    "sysTracAudtNb",
    "trnsmssnDtTm",
    "rtrvlRefNb",
    "lifeCyclId",
    "clrBtchData",
    "clrCtrlTtls",
    "agtData",
    "rcrd",
    "jursdctn",
    "sttlmSvc",
    "rcncltn",
    "orgnlRspnCd",
    "prcgRslt",
    "addtlData",
    "prtctdData",
    "splmtryData",
    "sctyTrlr"
})
public class BatchTransferResponseV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header71 hdr;
    @XmlElement(name = "BtchId")
    protected String btchId;
    @XmlElement(name = "OrgnlBtchId")
    protected String orgnlBtchId;
    @XmlElement(name = "NbOfMsgs")
    protected BigDecimal nbOfMsgs;
    @XmlElement(name = "BtchChcksm")
    protected byte[] btchChcksm;
    @XmlElement(name = "ReqAck")
    protected Boolean reqAck;
    @XmlElement(name = "Orgtr")
    protected PartyIdentification286 orgtr;
    @XmlElement(name = "Dstn")
    protected PartyIdentification286 dstn;
    @XmlElement(name = "Prgrmm")
    protected List<ProgrammeMode5> prgrmm;
    @XmlElement(name = "SysTracAudtNb")
    protected String sysTracAudtNb;
    @XmlElement(name = "TrnsmssnDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar trnsmssnDtTm;
    @XmlElement(name = "RtrvlRefNb")
    protected String rtrvlRefNb;
    @XmlElement(name = "LifeCyclId")
    protected String lifeCyclId;
    @XmlElement(name = "ClrBtchData")
    protected List<ClearingBatchData3> clrBtchData;
    @XmlElement(name = "ClrCtrlTtls")
    protected ClearingControlTotals3 clrCtrlTtls;
    @XmlElement(name = "AgtData")
    protected List<AdditionalInformation21> agtData;
    @XmlElement(name = "Rcrd")
    protected List<Record3> rcrd;
    @XmlElement(name = "Jursdctn")
    protected Jurisdiction2 jursdctn;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService6 sttlmSvc;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation4 rcncltn;
    @XmlElement(name = "OrgnlRspnCd")
    protected String orgnlRspnCd;
    @XmlElement(name = "PrcgRslt", required = true)
    protected ProcessingResult23 prcgRslt;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData2> addtlData;
    @XmlElement(name = "PrtctdData")
    protected List<ProtectedData2> prtctdData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType41 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header71 }
     *     
     */
    public Header71 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header71 }
     *     
     */
    public BatchTransferResponseV03 setHdr(Header71 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the btchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBtchId() {
        return btchId;
    }

    /**
     * Sets the value of the btchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BatchTransferResponseV03 setBtchId(String value) {
        this.btchId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlBtchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlBtchId() {
        return orgnlBtchId;
    }

    /**
     * Sets the value of the orgnlBtchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BatchTransferResponseV03 setOrgnlBtchId(String value) {
        this.orgnlBtchId = value;
        return this;
    }

    /**
     * Gets the value of the nbOfMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfMsgs() {
        return nbOfMsgs;
    }

    /**
     * Sets the value of the nbOfMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BatchTransferResponseV03 setNbOfMsgs(BigDecimal value) {
        this.nbOfMsgs = value;
        return this;
    }

    /**
     * Gets the value of the btchChcksm property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBtchChcksm() {
        return btchChcksm;
    }

    /**
     * Sets the value of the btchChcksm property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public BatchTransferResponseV03 setBtchChcksm(byte[] value) {
        this.btchChcksm = value;
        return this;
    }

    /**
     * Gets the value of the reqAck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqAck() {
        return reqAck;
    }

    /**
     * Sets the value of the reqAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BatchTransferResponseV03 setReqAck(Boolean value) {
        this.reqAck = value;
        return this;
    }

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification286 }
     *     
     */
    public PartyIdentification286 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification286 }
     *     
     */
    public BatchTransferResponseV03 setOrgtr(PartyIdentification286 value) {
        this.orgtr = value;
        return this;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification286 }
     *     
     */
    public PartyIdentification286 getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification286 }
     *     
     */
    public BatchTransferResponseV03 setDstn(PartyIdentification286 value) {
        this.dstn = value;
        return this;
    }

    /**
     * Gets the value of the prgrmm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prgrmm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrgrmm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgrammeMode5 }
     * 
     * 
     */
    public List<ProgrammeMode5> getPrgrmm() {
        if (prgrmm == null) {
            prgrmm = new ArrayList<ProgrammeMode5>();
        }
        return this.prgrmm;
    }

    /**
     * Gets the value of the sysTracAudtNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysTracAudtNb() {
        return sysTracAudtNb;
    }

    /**
     * Sets the value of the sysTracAudtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BatchTransferResponseV03 setSysTracAudtNb(String value) {
        this.sysTracAudtNb = value;
        return this;
    }

    /**
     * Gets the value of the trnsmssnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTrnsmssnDtTm() {
        return trnsmssnDtTm;
    }

    /**
     * Sets the value of the trnsmssnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BatchTransferResponseV03 setTrnsmssnDtTm(XMLGregorianCalendar value) {
        this.trnsmssnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the rtrvlRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtrvlRefNb() {
        return rtrvlRefNb;
    }

    /**
     * Sets the value of the rtrvlRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BatchTransferResponseV03 setRtrvlRefNb(String value) {
        this.rtrvlRefNb = value;
        return this;
    }

    /**
     * Gets the value of the lifeCyclId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCyclId() {
        return lifeCyclId;
    }

    /**
     * Sets the value of the lifeCyclId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BatchTransferResponseV03 setLifeCyclId(String value) {
        this.lifeCyclId = value;
        return this;
    }

    /**
     * Gets the value of the clrBtchData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clrBtchData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClrBtchData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearingBatchData3 }
     * 
     * 
     */
    public List<ClearingBatchData3> getClrBtchData() {
        if (clrBtchData == null) {
            clrBtchData = new ArrayList<ClearingBatchData3>();
        }
        return this.clrBtchData;
    }

    /**
     * Gets the value of the clrCtrlTtls property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingControlTotals3 }
     *     
     */
    public ClearingControlTotals3 getClrCtrlTtls() {
        return clrCtrlTtls;
    }

    /**
     * Sets the value of the clrCtrlTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingControlTotals3 }
     *     
     */
    public BatchTransferResponseV03 setClrCtrlTtls(ClearingControlTotals3 value) {
        this.clrCtrlTtls = value;
        return this;
    }

    /**
     * Gets the value of the agtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation21 }
     * 
     * 
     */
    public List<AdditionalInformation21> getAgtData() {
        if (agtData == null) {
            agtData = new ArrayList<AdditionalInformation21>();
        }
        return this.agtData;
    }

    /**
     * Gets the value of the rcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Record3 }
     * 
     * 
     */
    public List<Record3> getRcrd() {
        if (rcrd == null) {
            rcrd = new ArrayList<Record3>();
        }
        return this.rcrd;
    }

    /**
     * Gets the value of the jursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link Jurisdiction2 }
     *     
     */
    public Jurisdiction2 getJursdctn() {
        return jursdctn;
    }

    /**
     * Sets the value of the jursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jurisdiction2 }
     *     
     */
    public BatchTransferResponseV03 setJursdctn(Jurisdiction2 value) {
        this.jursdctn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSvc property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementService6 }
     *     
     */
    public SettlementService6 getSttlmSvc() {
        return sttlmSvc;
    }

    /**
     * Sets the value of the sttlmSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementService6 }
     *     
     */
    public BatchTransferResponseV03 setSttlmSvc(SettlementService6 value) {
        this.sttlmSvc = value;
        return this;
    }

    /**
     * Gets the value of the rcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link Reconciliation4 }
     *     
     */
    public Reconciliation4 getRcncltn() {
        return rcncltn;
    }

    /**
     * Sets the value of the rcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reconciliation4 }
     *     
     */
    public BatchTransferResponseV03 setRcncltn(Reconciliation4 value) {
        this.rcncltn = value;
        return this;
    }

    /**
     * Gets the value of the orgnlRspnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlRspnCd() {
        return orgnlRspnCd;
    }

    /**
     * Sets the value of the orgnlRspnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BatchTransferResponseV03 setOrgnlRspnCd(String value) {
        this.orgnlRspnCd = value;
        return this;
    }

    /**
     * Gets the value of the prcgRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResult23 }
     *     
     */
    public ProcessingResult23 getPrcgRslt() {
        return prcgRslt;
    }

    /**
     * Sets the value of the prcgRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResult23 }
     *     
     */
    public BatchTransferResponseV03 setPrcgRslt(ProcessingResult23 value) {
        this.prcgRslt = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData2 }
     * 
     * 
     */
    public List<AdditionalData2> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData2>();
        }
        return this.addtlData;
    }

    /**
     * Gets the value of the prtctdData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtctdData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtctdData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtectedData2 }
     * 
     * 
     */
    public List<ProtectedData2> getPrtctdData() {
        if (prtctdData == null) {
            prtctdData = new ArrayList<ProtectedData2>();
        }
        return this.prtctdData;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType41 }
     *     
     */
    public ContentInformationType41 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType41 }
     *     
     */
    public BatchTransferResponseV03 setSctyTrlr(ContentInformationType41 value) {
        this.sctyTrlr = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the prgrmm list.
     * @see #getPrgrmm()
     * 
     */
    public BatchTransferResponseV03 addPrgrmm(ProgrammeMode5 prgrmm) {
        getPrgrmm().add(prgrmm);
        return this;
    }

    /**
     * Adds a new item to the clrBtchData list.
     * @see #getClrBtchData()
     * 
     */
    public BatchTransferResponseV03 addClrBtchData(ClearingBatchData3 clrBtchData) {
        getClrBtchData().add(clrBtchData);
        return this;
    }

    /**
     * Adds a new item to the agtData list.
     * @see #getAgtData()
     * 
     */
    public BatchTransferResponseV03 addAgtData(AdditionalInformation21 agtData) {
        getAgtData().add(agtData);
        return this;
    }

    /**
     * Adds a new item to the rcrd list.
     * @see #getRcrd()
     * 
     */
    public BatchTransferResponseV03 addRcrd(Record3 rcrd) {
        getRcrd().add(rcrd);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public BatchTransferResponseV03 addAddtlData(AdditionalData2 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

    /**
     * Adds a new item to the prtctdData list.
     * @see #getPrtctdData()
     * 
     */
    public BatchTransferResponseV03 addPrtctdData(ProtectedData2 prtctdData) {
        getPrtctdData().add(prtctdData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public BatchTransferResponseV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
