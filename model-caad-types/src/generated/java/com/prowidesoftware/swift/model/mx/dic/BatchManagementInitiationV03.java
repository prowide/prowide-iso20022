
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The BatchManagementInitiation message can be initiated by any party and received by any party (acquirer, agent or issuer) connected to a network.
 * 
 * This message provides flow control information enabling a series of messages in batches and batches in collections to start, end or require checkpoints during the flow.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchManagementInitiationV03", propOrder = {
    "hdr",
    "btchMgmtTp",
    "othrBtchMgmtTp",
    "colltnId",
    "btchId",
    "colltnSz",
    "orgnlColltnId",
    "orgnlBtchId",
    "nbOfBtchsInColltn",
    "nbOfMsgs",
    "rmngMsgsInColltn",
    "msgSeqNb",
    "colltnIdList",
    "btchIdList",
    "chckptId",
    "colltnChcksm",
    "btchChcksm",
    "reqAck",
    "msgsBfrAck",
    "postvAck",
    "conttn",
    "orgtr",
    "sndr",
    "rcvr",
    "dstn",
    "prgrmm",
    "sysTracAudtNb",
    "trnsmssnDtTm",
    "rtrvlRefNb",
    "lifeCyclId",
    "crrctn",
    "jursdctn",
    "sttlmSvc",
    "rcncltn",
    "orgnlRspnCd",
    "addtlData",
    "prcgRslt",
    "prtctdData",
    "splmtryData",
    "sctyTrlr"
})
public class BatchManagementInitiationV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header71 hdr;
    @XmlElement(name = "BtchMgmtTp", required = true)
    @XmlSchemaType(name = "string")
    protected BatchManagementType2Code btchMgmtTp;
    @XmlElement(name = "OthrBtchMgmtTp")
    protected String othrBtchMgmtTp;
    @XmlElement(name = "ColltnId")
    protected String colltnId;
    @XmlElement(name = "BtchId")
    protected String btchId;
    @XmlElement(name = "ColltnSz")
    protected BigDecimal colltnSz;
    @XmlElement(name = "OrgnlColltnId")
    protected String orgnlColltnId;
    @XmlElement(name = "OrgnlBtchId")
    protected String orgnlBtchId;
    @XmlElement(name = "NbOfBtchsInColltn")
    protected BigDecimal nbOfBtchsInColltn;
    @XmlElement(name = "NbOfMsgs")
    protected BigDecimal nbOfMsgs;
    @XmlElement(name = "RmngMsgsInColltn")
    protected BigDecimal rmngMsgsInColltn;
    @XmlElement(name = "MsgSeqNb")
    protected String msgSeqNb;
    @XmlElement(name = "ColltnIdList")
    protected List<String> colltnIdList;
    @XmlElement(name = "BtchIdList")
    protected List<String> btchIdList;
    @XmlElement(name = "ChckptId")
    protected String chckptId;
    @XmlElement(name = "ColltnChcksm")
    protected byte[] colltnChcksm;
    @XmlElement(name = "BtchChcksm")
    protected byte[] btchChcksm;
    @XmlElement(name = "ReqAck")
    protected Boolean reqAck;
    @XmlElement(name = "MsgsBfrAck")
    protected BigDecimal msgsBfrAck;
    @XmlElement(name = "PostvAck")
    protected Boolean postvAck;
    @XmlElement(name = "Conttn")
    protected Boolean conttn;
    @XmlElement(name = "Orgtr")
    protected PartyIdentification286 orgtr;
    @XmlElement(name = "Sndr")
    protected PartyIdentification286 sndr;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification286 rcvr;
    @XmlElement(name = "Dstn")
    protected PartyIdentification286 dstn;
    @XmlElement(name = "Prgrmm")
    protected List<ProgrammeMode5> prgrmm;
    @XmlElement(name = "SysTracAudtNb")
    protected String sysTracAudtNb;
    @XmlElement(name = "TrnsmssnDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime trnsmssnDtTm;
    @XmlElement(name = "RtrvlRefNb")
    protected String rtrvlRefNb;
    @XmlElement(name = "LifeCyclId")
    protected String lifeCyclId;
    @XmlElement(name = "Crrctn")
    protected CorrectionIdentification1 crrctn;
    @XmlElement(name = "Jursdctn")
    protected Jurisdiction2 jursdctn;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService6 sttlmSvc;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation4 rcncltn;
    @XmlElement(name = "OrgnlRspnCd")
    protected String orgnlRspnCd;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData2> addtlData;
    @XmlElement(name = "PrcgRslt")
    protected ProcessingResult26 prcgRslt;
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
    public BatchManagementInitiationV03 setHdr(Header71 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the btchMgmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link BatchManagementType2Code }
     *     
     */
    public BatchManagementType2Code getBtchMgmtTp() {
        return btchMgmtTp;
    }

    /**
     * Sets the value of the btchMgmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchManagementType2Code }
     *     
     */
    public BatchManagementInitiationV03 setBtchMgmtTp(BatchManagementType2Code value) {
        this.btchMgmtTp = value;
        return this;
    }

    /**
     * Gets the value of the othrBtchMgmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrBtchMgmtTp() {
        return othrBtchMgmtTp;
    }

    /**
     * Sets the value of the othrBtchMgmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BatchManagementInitiationV03 setOthrBtchMgmtTp(String value) {
        this.othrBtchMgmtTp = value;
        return this;
    }

    /**
     * Gets the value of the colltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColltnId() {
        return colltnId;
    }

    /**
     * Sets the value of the colltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BatchManagementInitiationV03 setColltnId(String value) {
        this.colltnId = value;
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
    public BatchManagementInitiationV03 setBtchId(String value) {
        this.btchId = value;
        return this;
    }

    /**
     * Gets the value of the colltnSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getColltnSz() {
        return colltnSz;
    }

    /**
     * Sets the value of the colltnSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BatchManagementInitiationV03 setColltnSz(BigDecimal value) {
        this.colltnSz = value;
        return this;
    }

    /**
     * Gets the value of the orgnlColltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlColltnId() {
        return orgnlColltnId;
    }

    /**
     * Sets the value of the orgnlColltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BatchManagementInitiationV03 setOrgnlColltnId(String value) {
        this.orgnlColltnId = value;
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
    public BatchManagementInitiationV03 setOrgnlBtchId(String value) {
        this.orgnlBtchId = value;
        return this;
    }

    /**
     * Gets the value of the nbOfBtchsInColltn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfBtchsInColltn() {
        return nbOfBtchsInColltn;
    }

    /**
     * Sets the value of the nbOfBtchsInColltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BatchManagementInitiationV03 setNbOfBtchsInColltn(BigDecimal value) {
        this.nbOfBtchsInColltn = value;
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
    public BatchManagementInitiationV03 setNbOfMsgs(BigDecimal value) {
        this.nbOfMsgs = value;
        return this;
    }

    /**
     * Gets the value of the rmngMsgsInColltn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRmngMsgsInColltn() {
        return rmngMsgsInColltn;
    }

    /**
     * Sets the value of the rmngMsgsInColltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BatchManagementInitiationV03 setRmngMsgsInColltn(BigDecimal value) {
        this.rmngMsgsInColltn = value;
        return this;
    }

    /**
     * Gets the value of the msgSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSeqNb() {
        return msgSeqNb;
    }

    /**
     * Sets the value of the msgSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BatchManagementInitiationV03 setMsgSeqNb(String value) {
        this.msgSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the colltnIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the colltnIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColltnIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the colltnIdList property.
     */
    public List<String> getColltnIdList() {
        if (colltnIdList == null) {
            colltnIdList = new ArrayList<>();
        }
        return this.colltnIdList;
    }

    /**
     * Gets the value of the btchIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the btchIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBtchIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the btchIdList property.
     */
    public List<String> getBtchIdList() {
        if (btchIdList == null) {
            btchIdList = new ArrayList<>();
        }
        return this.btchIdList;
    }

    /**
     * Gets the value of the chckptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckptId() {
        return chckptId;
    }

    /**
     * Sets the value of the chckptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BatchManagementInitiationV03 setChckptId(String value) {
        this.chckptId = value;
        return this;
    }

    /**
     * Gets the value of the colltnChcksm property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getColltnChcksm() {
        return colltnChcksm;
    }

    /**
     * Sets the value of the colltnChcksm property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public BatchManagementInitiationV03 setColltnChcksm(byte[] value) {
        this.colltnChcksm = value;
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
    public BatchManagementInitiationV03 setBtchChcksm(byte[] value) {
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
    public BatchManagementInitiationV03 setReqAck(Boolean value) {
        this.reqAck = value;
        return this;
    }

    /**
     * Gets the value of the msgsBfrAck property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMsgsBfrAck() {
        return msgsBfrAck;
    }

    /**
     * Sets the value of the msgsBfrAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BatchManagementInitiationV03 setMsgsBfrAck(BigDecimal value) {
        this.msgsBfrAck = value;
        return this;
    }

    /**
     * Gets the value of the postvAck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostvAck() {
        return postvAck;
    }

    /**
     * Sets the value of the postvAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BatchManagementInitiationV03 setPostvAck(Boolean value) {
        this.postvAck = value;
        return this;
    }

    /**
     * Gets the value of the conttn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConttn() {
        return conttn;
    }

    /**
     * Sets the value of the conttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BatchManagementInitiationV03 setConttn(Boolean value) {
        this.conttn = value;
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
    public BatchManagementInitiationV03 setOrgtr(PartyIdentification286 value) {
        this.orgtr = value;
        return this;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification286 }
     *     
     */
    public PartyIdentification286 getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification286 }
     *     
     */
    public BatchManagementInitiationV03 setSndr(PartyIdentification286 value) {
        this.sndr = value;
        return this;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification286 }
     *     
     */
    public PartyIdentification286 getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification286 }
     *     
     */
    public BatchManagementInitiationV03 setRcvr(PartyIdentification286 value) {
        this.rcvr = value;
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
    public BatchManagementInitiationV03 setDstn(PartyIdentification286 value) {
        this.dstn = value;
        return this;
    }

    /**
     * Gets the value of the prgrmm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prgrmm property.
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
     * @return
     *     The value of the prgrmm property.
     */
    public List<ProgrammeMode5> getPrgrmm() {
        if (prgrmm == null) {
            prgrmm = new ArrayList<>();
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
    public BatchManagementInitiationV03 setSysTracAudtNb(String value) {
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
    public OffsetDateTime getTrnsmssnDtTm() {
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
    public BatchManagementInitiationV03 setTrnsmssnDtTm(OffsetDateTime value) {
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
    public BatchManagementInitiationV03 setRtrvlRefNb(String value) {
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
    public BatchManagementInitiationV03 setLifeCyclId(String value) {
        this.lifeCyclId = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionIdentification1 }
     *     
     */
    public CorrectionIdentification1 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionIdentification1 }
     *     
     */
    public BatchManagementInitiationV03 setCrrctn(CorrectionIdentification1 value) {
        this.crrctn = value;
        return this;
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
    public BatchManagementInitiationV03 setJursdctn(Jurisdiction2 value) {
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
    public BatchManagementInitiationV03 setSttlmSvc(SettlementService6 value) {
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
    public BatchManagementInitiationV03 setRcncltn(Reconciliation4 value) {
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
    public BatchManagementInitiationV03 setOrgnlRspnCd(String value) {
        this.orgnlRspnCd = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
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
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData2> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

    /**
     * Gets the value of the prcgRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResult26 }
     *     
     */
    public ProcessingResult26 getPrcgRslt() {
        return prcgRslt;
    }

    /**
     * Sets the value of the prcgRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResult26 }
     *     
     */
    public BatchManagementInitiationV03 setPrcgRslt(ProcessingResult26 value) {
        this.prcgRslt = value;
        return this;
    }

    /**
     * Gets the value of the prtctdData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtctdData property.
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
     * @return
     *     The value of the prtctdData property.
     */
    public List<ProtectedData2> getPrtctdData() {
        if (prtctdData == null) {
            prtctdData = new ArrayList<>();
        }
        return this.prtctdData;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public BatchManagementInitiationV03 setSctyTrlr(ContentInformationType41 value) {
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
     * Adds a new item to the colltnIdList list.
     * @see #getColltnIdList()
     * 
     */
    public BatchManagementInitiationV03 addColltnIdList(String colltnIdList) {
        getColltnIdList().add(colltnIdList);
        return this;
    }

    /**
     * Adds a new item to the btchIdList list.
     * @see #getBtchIdList()
     * 
     */
    public BatchManagementInitiationV03 addBtchIdList(String btchIdList) {
        getBtchIdList().add(btchIdList);
        return this;
    }

    /**
     * Adds a new item to the prgrmm list.
     * @see #getPrgrmm()
     * 
     */
    public BatchManagementInitiationV03 addPrgrmm(ProgrammeMode5 prgrmm) {
        getPrgrmm().add(prgrmm);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public BatchManagementInitiationV03 addAddtlData(AdditionalData2 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

    /**
     * Adds a new item to the prtctdData list.
     * @see #getPrtctdData()
     * 
     */
    public BatchManagementInitiationV03 addPrtctdData(ProtectedData2 prtctdData) {
        getPrtctdData().add(prtctdData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public BatchManagementInitiationV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
