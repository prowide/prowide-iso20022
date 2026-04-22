
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
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
 * Identification of the original transaction
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalTransactionIdentification2", propOrder = {
    "lclDt",
    "lclTm",
    "tmZone",
    "purchsIdrTp",
    "purchsIdr",
    "trnsmssnDtTm",
    "sysTracAudtNb",
    "rtrvlRefNb",
    "lifeCyclSpprt",
    "lifeCyclId",
    "authstnSeqNb",
    "presntmntSeqNb",
    "presntmntSeqCnt",
    "authntcnTkn",
    "lifeCyclIdMssng",
    "acqrrRefData",
    "acqrrRefNb",
    "issrRefData"
})
public class OriginalTransactionIdentification2 {

    @XmlElement(name = "LclDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate lclDt;
    @XmlElement(name = "LclTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime lclTm;
    @XmlElement(name = "TmZone")
    protected String tmZone;
    @XmlElement(name = "PurchsIdrTp")
    @XmlSchemaType(name = "string")
    protected PurchaseIdentifierType3Code purchsIdrTp;
    @XmlElement(name = "PurchsIdr")
    protected String purchsIdr;
    @XmlElement(name = "TrnsmssnDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime trnsmssnDtTm;
    @XmlElement(name = "SysTracAudtNb")
    protected String sysTracAudtNb;
    @XmlElement(name = "RtrvlRefNb")
    protected String rtrvlRefNb;
    @XmlElement(name = "LifeCyclSpprt")
    @XmlSchemaType(name = "string")
    protected LifeCycleSupport1Code lifeCyclSpprt;
    @XmlElement(name = "LifeCyclId")
    protected String lifeCyclId;
    @XmlElement(name = "AuthstnSeqNb")
    protected String authstnSeqNb;
    @XmlElement(name = "PresntmntSeqNb")
    protected String presntmntSeqNb;
    @XmlElement(name = "PresntmntSeqCnt")
    protected String presntmntSeqCnt;
    @XmlElement(name = "AuthntcnTkn")
    protected String authntcnTkn;
    @XmlElement(name = "LifeCyclIdMssng")
    protected String lifeCyclIdMssng;
    @XmlElement(name = "AcqrrRefData")
    protected String acqrrRefData;
    @XmlElement(name = "AcqrrRefNb")
    protected String acqrrRefNb;
    @XmlElement(name = "IssrRefData")
    protected String issrRefData;

    /**
     * Gets the value of the lclDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getLclDt() {
        return lclDt;
    }

    /**
     * Sets the value of the lclDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionIdentification2 setLclDt(LocalDate value) {
        this.lclDt = value;
        return this;
    }

    /**
     * Gets the value of the lclTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getLclTm() {
        return lclTm;
    }

    /**
     * Sets the value of the lclTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionIdentification2 setLclTm(OffsetTime value) {
        this.lclTm = value;
        return this;
    }

    /**
     * Gets the value of the tmZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmZone() {
        return tmZone;
    }

    /**
     * Sets the value of the tmZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionIdentification2 setTmZone(String value) {
        this.tmZone = value;
        return this;
    }

    /**
     * Gets the value of the purchsIdrTp property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseIdentifierType3Code }
     *     
     */
    public PurchaseIdentifierType3Code getPurchsIdrTp() {
        return purchsIdrTp;
    }

    /**
     * Sets the value of the purchsIdrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseIdentifierType3Code }
     *     
     */
    public OriginalTransactionIdentification2 setPurchsIdrTp(PurchaseIdentifierType3Code value) {
        this.purchsIdrTp = value;
        return this;
    }

    /**
     * Gets the value of the purchsIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchsIdr() {
        return purchsIdr;
    }

    /**
     * Sets the value of the purchsIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionIdentification2 setPurchsIdr(String value) {
        this.purchsIdr = value;
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
    public OriginalTransactionIdentification2 setTrnsmssnDtTm(OffsetDateTime value) {
        this.trnsmssnDtTm = value;
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
    public OriginalTransactionIdentification2 setSysTracAudtNb(String value) {
        this.sysTracAudtNb = value;
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
    public OriginalTransactionIdentification2 setRtrvlRefNb(String value) {
        this.rtrvlRefNb = value;
        return this;
    }

    /**
     * Gets the value of the lifeCyclSpprt property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleSupport1Code }
     *     
     */
    public LifeCycleSupport1Code getLifeCyclSpprt() {
        return lifeCyclSpprt;
    }

    /**
     * Sets the value of the lifeCyclSpprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleSupport1Code }
     *     
     */
    public OriginalTransactionIdentification2 setLifeCyclSpprt(LifeCycleSupport1Code value) {
        this.lifeCyclSpprt = value;
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
    public OriginalTransactionIdentification2 setLifeCyclId(String value) {
        this.lifeCyclId = value;
        return this;
    }

    /**
     * Gets the value of the authstnSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthstnSeqNb() {
        return authstnSeqNb;
    }

    /**
     * Sets the value of the authstnSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionIdentification2 setAuthstnSeqNb(String value) {
        this.authstnSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the presntmntSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresntmntSeqNb() {
        return presntmntSeqNb;
    }

    /**
     * Sets the value of the presntmntSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionIdentification2 setPresntmntSeqNb(String value) {
        this.presntmntSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the presntmntSeqCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresntmntSeqCnt() {
        return presntmntSeqCnt;
    }

    /**
     * Sets the value of the presntmntSeqCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionIdentification2 setPresntmntSeqCnt(String value) {
        this.presntmntSeqCnt = value;
        return this;
    }

    /**
     * Gets the value of the authntcnTkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnTkn() {
        return authntcnTkn;
    }

    /**
     * Sets the value of the authntcnTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionIdentification2 setAuthntcnTkn(String value) {
        this.authntcnTkn = value;
        return this;
    }

    /**
     * Gets the value of the lifeCyclIdMssng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCyclIdMssng() {
        return lifeCyclIdMssng;
    }

    /**
     * Sets the value of the lifeCyclIdMssng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionIdentification2 setLifeCyclIdMssng(String value) {
        this.lifeCyclIdMssng = value;
        return this;
    }

    /**
     * Gets the value of the acqrrRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrRefData() {
        return acqrrRefData;
    }

    /**
     * Sets the value of the acqrrRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionIdentification2 setAcqrrRefData(String value) {
        this.acqrrRefData = value;
        return this;
    }

    /**
     * Gets the value of the acqrrRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrRefNb() {
        return acqrrRefNb;
    }

    /**
     * Sets the value of the acqrrRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionIdentification2 setAcqrrRefNb(String value) {
        this.acqrrRefNb = value;
        return this;
    }

    /**
     * Gets the value of the issrRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrRefData() {
        return issrRefData;
    }

    /**
     * Sets the value of the issrRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalTransactionIdentification2 setIssrRefData(String value) {
        this.issrRefData = value;
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

}
