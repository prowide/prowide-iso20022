
package com.prowidesoftware.swift.model.mx.dic;

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
 * The SettlementReportingInitiation message is usually sent by an agent (processor, clearing or settlement agent) to an acquirer, agent or issuer to inform about financial totals already settled or to be settled issued as an outcome of the clearing process.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementReportingInitiationV04", propOrder = {
    "hdr",
    "sttlmInstn",
    "orgtr",
    "sndr",
    "rcvr",
    "dstn",
    "fi",
    "othrInstn",
    "prgrmm",
    "sysTracAudtNb",
    "trnsmssnDtTm",
    "rtrvlRefNb",
    "lifeCyclId",
    "sttlmRptTp",
    "msgRsn",
    "altrnMsgRsn",
    "acqrrSttlmTtls",
    "issrSttlmTtls",
    "othrSttlmTtls",
    "ttlSttlmAmt",
    "fndsTrfAmt",
    "jursdctn",
    "sttlmSvc",
    "addtlFee",
    "rcncltn",
    "txDesc",
    "prtctdData",
    "prvtData",
    "ntlData",
    "sctyTrlr"
})
public class SettlementReportingInitiationV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header72 hdr;
    @XmlElement(name = "SttlmInstn")
    protected SettlementInstitutionData1 sttlmInstn;
    @XmlElement(name = "Orgtr")
    protected OriginatorData2 orgtr;
    @XmlElement(name = "Sndr")
    protected SenderData1 sndr;
    @XmlElement(name = "Rcvr")
    protected ReceiverData1 rcvr;
    @XmlElement(name = "Dstn")
    protected DestinationData1 dstn;
    @XmlElement(name = "FI")
    protected FinancialInstitutionData1 fi;
    @XmlElement(name = "OthrInstn")
    protected FinancialInstitutionData1 othrInstn;
    @XmlElement(name = "Prgrmm")
    protected List<ProgrammeMode6> prgrmm;
    @XmlElement(name = "SysTracAudtNb", required = true)
    protected String sysTracAudtNb;
    @XmlElement(name = "TrnsmssnDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime trnsmssnDtTm;
    @XmlElement(name = "RtrvlRefNb")
    protected String rtrvlRefNb;
    @XmlElement(name = "LifeCyclId")
    protected String lifeCyclId;
    @XmlElement(name = "SttlmRptTp", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementReportType2Code sttlmRptTp;
    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "AcqrrSttlmTtls")
    protected SettlementCategoryTotal3 acqrrSttlmTtls;
    @XmlElement(name = "IssrSttlmTtls")
    protected SettlementCategoryTotal3 issrSttlmTtls;
    @XmlElement(name = "OthrSttlmTtls")
    protected SettlementCategoryTotal3 othrSttlmTtls;
    @XmlElement(name = "TtlSttlmAmt")
    protected SettlementCategoryTotal3 ttlSttlmAmt;
    @XmlElement(name = "FndsTrfAmt")
    protected Amount17 fndsTrfAmt;
    @XmlElement(name = "Jursdctn")
    protected Jurisdiction2 jursdctn;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService7 sttlmSvc;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee4> addtlFee;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation5 rcncltn;
    @XmlElement(name = "TxDesc")
    protected String txDesc;
    @XmlElement(name = "PrtctdData")
    protected List<EncryptedData2> prtctdData;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType41 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header72 }
     *     
     */
    public Header72 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header72 }
     *     
     */
    public SettlementReportingInitiationV04 setHdr(Header72 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the sttlmInstn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstitutionData1 }
     *     
     */
    public SettlementInstitutionData1 getSttlmInstn() {
        return sttlmInstn;
    }

    /**
     * Sets the value of the sttlmInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstitutionData1 }
     *     
     */
    public SettlementReportingInitiationV04 setSttlmInstn(SettlementInstitutionData1 value) {
        this.sttlmInstn = value;
        return this;
    }

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorData2 }
     *     
     */
    public OriginatorData2 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorData2 }
     *     
     */
    public SettlementReportingInitiationV04 setOrgtr(OriginatorData2 value) {
        this.orgtr = value;
        return this;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link SenderData1 }
     *     
     */
    public SenderData1 getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderData1 }
     *     
     */
    public SettlementReportingInitiationV04 setSndr(SenderData1 value) {
        this.sndr = value;
        return this;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverData1 }
     *     
     */
    public ReceiverData1 getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverData1 }
     *     
     */
    public SettlementReportingInitiationV04 setRcvr(ReceiverData1 value) {
        this.rcvr = value;
        return this;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationData1 }
     *     
     */
    public DestinationData1 getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationData1 }
     *     
     */
    public SettlementReportingInitiationV04 setDstn(DestinationData1 value) {
        this.dstn = value;
        return this;
    }

    /**
     * Gets the value of the fi property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionData1 }
     *     
     */
    public FinancialInstitutionData1 getFI() {
        return fi;
    }

    /**
     * Sets the value of the fi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionData1 }
     *     
     */
    public SettlementReportingInitiationV04 setFI(FinancialInstitutionData1 value) {
        this.fi = value;
        return this;
    }

    /**
     * Gets the value of the othrInstn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionData1 }
     *     
     */
    public FinancialInstitutionData1 getOthrInstn() {
        return othrInstn;
    }

    /**
     * Sets the value of the othrInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionData1 }
     *     
     */
    public SettlementReportingInitiationV04 setOthrInstn(FinancialInstitutionData1 value) {
        this.othrInstn = value;
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
     * {@link ProgrammeMode6 }
     * 
     * 
     * @return
     *     The value of the prgrmm property.
     */
    public List<ProgrammeMode6> getPrgrmm() {
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
    public SettlementReportingInitiationV04 setSysTracAudtNb(String value) {
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
    public SettlementReportingInitiationV04 setTrnsmssnDtTm(OffsetDateTime value) {
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
    public SettlementReportingInitiationV04 setRtrvlRefNb(String value) {
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
    public SettlementReportingInitiationV04 setLifeCyclId(String value) {
        this.lifeCyclId = value;
        return this;
    }

    /**
     * Gets the value of the sttlmRptTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementReportType2Code }
     *     
     */
    public SettlementReportType2Code getSttlmRptTp() {
        return sttlmRptTp;
    }

    /**
     * Sets the value of the sttlmRptTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementReportType2Code }
     *     
     */
    public SettlementReportingInitiationV04 setSttlmRptTp(SettlementReportType2Code value) {
        this.sttlmRptTp = value;
        return this;
    }

    /**
     * Gets the value of the msgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the msgRsn property.
     */
    public List<String> getMsgRsn() {
        if (msgRsn == null) {
            msgRsn = new ArrayList<>();
        }
        return this.msgRsn;
    }

    /**
     * Gets the value of the altrnMsgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the altrnMsgRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrnMsgRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the altrnMsgRsn property.
     */
    public List<String> getAltrnMsgRsn() {
        if (altrnMsgRsn == null) {
            altrnMsgRsn = new ArrayList<>();
        }
        return this.altrnMsgRsn;
    }

    /**
     * Gets the value of the acqrrSttlmTtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal3 }
     *     
     */
    public SettlementCategoryTotal3 getAcqrrSttlmTtls() {
        return acqrrSttlmTtls;
    }

    /**
     * Sets the value of the acqrrSttlmTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal3 }
     *     
     */
    public SettlementReportingInitiationV04 setAcqrrSttlmTtls(SettlementCategoryTotal3 value) {
        this.acqrrSttlmTtls = value;
        return this;
    }

    /**
     * Gets the value of the issrSttlmTtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal3 }
     *     
     */
    public SettlementCategoryTotal3 getIssrSttlmTtls() {
        return issrSttlmTtls;
    }

    /**
     * Sets the value of the issrSttlmTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal3 }
     *     
     */
    public SettlementReportingInitiationV04 setIssrSttlmTtls(SettlementCategoryTotal3 value) {
        this.issrSttlmTtls = value;
        return this;
    }

    /**
     * Gets the value of the othrSttlmTtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal3 }
     *     
     */
    public SettlementCategoryTotal3 getOthrSttlmTtls() {
        return othrSttlmTtls;
    }

    /**
     * Sets the value of the othrSttlmTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal3 }
     *     
     */
    public SettlementReportingInitiationV04 setOthrSttlmTtls(SettlementCategoryTotal3 value) {
        this.othrSttlmTtls = value;
        return this;
    }

    /**
     * Gets the value of the ttlSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal3 }
     *     
     */
    public SettlementCategoryTotal3 getTtlSttlmAmt() {
        return ttlSttlmAmt;
    }

    /**
     * Sets the value of the ttlSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal3 }
     *     
     */
    public SettlementReportingInitiationV04 setTtlSttlmAmt(SettlementCategoryTotal3 value) {
        this.ttlSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the fndsTrfAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getFndsTrfAmt() {
        return fndsTrfAmt;
    }

    /**
     * Sets the value of the fndsTrfAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public SettlementReportingInitiationV04 setFndsTrfAmt(Amount17 value) {
        this.fndsTrfAmt = value;
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
    public SettlementReportingInitiationV04 setJursdctn(Jurisdiction2 value) {
        this.jursdctn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSvc property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementService7 }
     *     
     */
    public SettlementService7 getSttlmSvc() {
        return sttlmSvc;
    }

    /**
     * Sets the value of the sttlmSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementService7 }
     *     
     */
    public SettlementReportingInitiationV04 setSttlmSvc(SettlementService7 value) {
        this.sttlmSvc = value;
        return this;
    }

    /**
     * Gets the value of the addtlFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFee4 }
     * 
     * 
     * @return
     *     The value of the addtlFee property.
     */
    public List<AdditionalFee4> getAddtlFee() {
        if (addtlFee == null) {
            addtlFee = new ArrayList<>();
        }
        return this.addtlFee;
    }

    /**
     * Gets the value of the rcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link Reconciliation5 }
     *     
     */
    public Reconciliation5 getRcncltn() {
        return rcncltn;
    }

    /**
     * Sets the value of the rcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reconciliation5 }
     *     
     */
    public SettlementReportingInitiationV04 setRcncltn(Reconciliation5 value) {
        this.rcncltn = value;
        return this;
    }

    /**
     * Gets the value of the txDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxDesc() {
        return txDesc;
    }

    /**
     * Sets the value of the txDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementReportingInitiationV04 setTxDesc(String value) {
        this.txDesc = value;
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
     * {@link EncryptedData2 }
     * 
     * 
     * @return
     *     The value of the prtctdData property.
     */
    public List<EncryptedData2> getPrtctdData() {
        if (prtctdData == null) {
            prtctdData = new ArrayList<>();
        }
        return this.prtctdData;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
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
    public SettlementReportingInitiationV04 setSctyTrlr(ContentInformationType41 value) {
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
    public SettlementReportingInitiationV04 addPrgrmm(ProgrammeMode6 prgrmm) {
        getPrgrmm().add(prgrmm);
        return this;
    }

    /**
     * Adds a new item to the msgRsn list.
     * @see #getMsgRsn()
     * 
     */
    public SettlementReportingInitiationV04 addMsgRsn(String msgRsn) {
        getMsgRsn().add(msgRsn);
        return this;
    }

    /**
     * Adds a new item to the altrnMsgRsn list.
     * @see #getAltrnMsgRsn()
     * 
     */
    public SettlementReportingInitiationV04 addAltrnMsgRsn(String altrnMsgRsn) {
        getAltrnMsgRsn().add(altrnMsgRsn);
        return this;
    }

    /**
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public SettlementReportingInitiationV04 addAddtlFee(AdditionalFee4 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the prtctdData list.
     * @see #getPrtctdData()
     * 
     */
    public SettlementReportingInitiationV04 addPrtctdData(EncryptedData2 prtctdData) {
        getPrtctdData().add(prtctdData);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public SettlementReportingInitiationV04 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public SettlementReportingInitiationV04 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
