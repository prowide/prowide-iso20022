
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
 * The KeyExchangeResponse message is sent by any party to any party (acquirer, agent or issuer) in response to a KeyExchangeInitiation message.
 * 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyExchangeResponseV04", propOrder = {
    "hdr",
    "keyXchgFctn",
    "othrKeyXchgFctn",
    "msgRsn",
    "altrnMsgRsn",
    "prgrmm",
    "sysTracAudtNb",
    "trnsmssnDtTm",
    "rtrvlRefNb",
    "lifeCyclId",
    "keyXchgTp",
    "othrKeyXchgTp",
    "keyXchgData",
    "jursdctn",
    "sttlmSvc",
    "addtlFee",
    "rcncltn",
    "addtlData",
    "orgnlRspnCd",
    "prcgRslt",
    "prtctdData",
    "splmtryData",
    "sctyTrlr"
})
public class KeyExchangeResponseV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header71 hdr;
    @XmlElement(name = "KeyXchgFctn", required = true)
    @XmlSchemaType(name = "string")
    protected CardServiceType5Code keyXchgFctn;
    @XmlElement(name = "OthrKeyXchgFctn")
    protected String othrKeyXchgFctn;
    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "Prgrmm")
    protected ProgrammeMode5 prgrmm;
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
    @XmlElement(name = "KeyXchgTp")
    @XmlSchemaType(name = "string")
    protected KeyType1Code keyXchgTp;
    @XmlElement(name = "OthrKeyXchgTp")
    protected String othrKeyXchgTp;
    @XmlElement(name = "KeyXchgData")
    protected KeyExchangeData1 keyXchgData;
    @XmlElement(name = "Jursdctn")
    protected Jurisdiction2 jursdctn;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService6 sttlmSvc;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee3> addtlFee;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation4 rcncltn;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData2> addtlData;
    @XmlElement(name = "OrgnlRspnCd")
    protected String orgnlRspnCd;
    @XmlElement(name = "PrcgRslt", required = true)
    protected ProcessingResult23 prcgRslt;
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
    public KeyExchangeResponseV04 setHdr(Header71 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the keyXchgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link CardServiceType5Code }
     *     
     */
    public CardServiceType5Code getKeyXchgFctn() {
        return keyXchgFctn;
    }

    /**
     * Sets the value of the keyXchgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardServiceType5Code }
     *     
     */
    public KeyExchangeResponseV04 setKeyXchgFctn(CardServiceType5Code value) {
        this.keyXchgFctn = value;
        return this;
    }

    /**
     * Gets the value of the othrKeyXchgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrKeyXchgFctn() {
        return othrKeyXchgFctn;
    }

    /**
     * Sets the value of the othrKeyXchgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public KeyExchangeResponseV04 setOthrKeyXchgFctn(String value) {
        this.othrKeyXchgFctn = value;
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
     * Gets the value of the prgrmm property.
     * 
     * @return
     *     possible object is
     *     {@link ProgrammeMode5 }
     *     
     */
    public ProgrammeMode5 getPrgrmm() {
        return prgrmm;
    }

    /**
     * Sets the value of the prgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgrammeMode5 }
     *     
     */
    public KeyExchangeResponseV04 setPrgrmm(ProgrammeMode5 value) {
        this.prgrmm = value;
        return this;
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
    public KeyExchangeResponseV04 setSysTracAudtNb(String value) {
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
    public KeyExchangeResponseV04 setTrnsmssnDtTm(OffsetDateTime value) {
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
    public KeyExchangeResponseV04 setRtrvlRefNb(String value) {
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
    public KeyExchangeResponseV04 setLifeCyclId(String value) {
        this.lifeCyclId = value;
        return this;
    }

    /**
     * Gets the value of the keyXchgTp property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType1Code }
     *     
     */
    public KeyType1Code getKeyXchgTp() {
        return keyXchgTp;
    }

    /**
     * Sets the value of the keyXchgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType1Code }
     *     
     */
    public KeyExchangeResponseV04 setKeyXchgTp(KeyType1Code value) {
        this.keyXchgTp = value;
        return this;
    }

    /**
     * Gets the value of the othrKeyXchgTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrKeyXchgTp() {
        return othrKeyXchgTp;
    }

    /**
     * Sets the value of the othrKeyXchgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public KeyExchangeResponseV04 setOthrKeyXchgTp(String value) {
        this.othrKeyXchgTp = value;
        return this;
    }

    /**
     * Gets the value of the keyXchgData property.
     * 
     * @return
     *     possible object is
     *     {@link KeyExchangeData1 }
     *     
     */
    public KeyExchangeData1 getKeyXchgData() {
        return keyXchgData;
    }

    /**
     * Sets the value of the keyXchgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExchangeData1 }
     *     
     */
    public KeyExchangeResponseV04 setKeyXchgData(KeyExchangeData1 value) {
        this.keyXchgData = value;
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
    public KeyExchangeResponseV04 setJursdctn(Jurisdiction2 value) {
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
    public KeyExchangeResponseV04 setSttlmSvc(SettlementService6 value) {
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
     * {@link AdditionalFee3 }
     * 
     * 
     * @return
     *     The value of the addtlFee property.
     */
    public List<AdditionalFee3> getAddtlFee() {
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
    public KeyExchangeResponseV04 setRcncltn(Reconciliation4 value) {
        this.rcncltn = value;
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
    public KeyExchangeResponseV04 setOrgnlRspnCd(String value) {
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
    public KeyExchangeResponseV04 setPrcgRslt(ProcessingResult23 value) {
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
    public KeyExchangeResponseV04 setSctyTrlr(ContentInformationType41 value) {
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
     * Adds a new item to the msgRsn list.
     * @see #getMsgRsn()
     * 
     */
    public KeyExchangeResponseV04 addMsgRsn(String msgRsn) {
        getMsgRsn().add(msgRsn);
        return this;
    }

    /**
     * Adds a new item to the altrnMsgRsn list.
     * @see #getAltrnMsgRsn()
     * 
     */
    public KeyExchangeResponseV04 addAltrnMsgRsn(String altrnMsgRsn) {
        getAltrnMsgRsn().add(altrnMsgRsn);
        return this;
    }

    /**
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public KeyExchangeResponseV04 addAddtlFee(AdditionalFee3 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public KeyExchangeResponseV04 addAddtlData(AdditionalData2 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

    /**
     * Adds a new item to the prtctdData list.
     * @see #getPrtctdData()
     * 
     */
    public KeyExchangeResponseV04 addPrtctdData(ProtectedData2 prtctdData) {
        getPrtctdData().add(prtctdData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public KeyExchangeResponseV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
