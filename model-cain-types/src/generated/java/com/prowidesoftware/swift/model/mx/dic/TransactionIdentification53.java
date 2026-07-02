
package com.prowidesoftware.swift.model.mx.dic;

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
 * Identification of the transaction
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionIdentification53", propOrder = {
    "purchsIdrTp",
    "othrPurchsIdrTp",
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
    "acqrrRefData",
    "acqrrRefNb",
    "issrRefData",
    "assoctdDataRef"
})
public class TransactionIdentification53 {

    @XmlElement(name = "PurchsIdrTp")
    @XmlSchemaType(name = "string")
    protected PurchaseIdentifierType2Code purchsIdrTp;
    @XmlElement(name = "OthrPurchsIdrTp")
    protected String othrPurchsIdrTp;
    @XmlElement(name = "PurchsIdr")
    protected String purchsIdr;
    @XmlElement(name = "TrnsmssnDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar trnsmssnDtTm;
    @XmlElement(name = "SysTracAudtNb", required = true)
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
    @XmlElement(name = "AcqrrRefData")
    protected String acqrrRefData;
    @XmlElement(name = "AcqrrRefNb")
    protected String acqrrRefNb;
    @XmlElement(name = "IssrRefData")
    protected String issrRefData;
    @XmlElement(name = "AssoctdDataRef")
    protected String assoctdDataRef;

    /**
     * Gets the value of the purchsIdrTp property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseIdentifierType2Code }
     *     
     */
    public PurchaseIdentifierType2Code getPurchsIdrTp() {
        return purchsIdrTp;
    }

    /**
     * Sets the value of the purchsIdrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseIdentifierType2Code }
     *     
     */
    public TransactionIdentification53 setPurchsIdrTp(PurchaseIdentifierType2Code value) {
        this.purchsIdrTp = value;
        return this;
    }

    /**
     * Gets the value of the othrPurchsIdrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPurchsIdrTp() {
        return othrPurchsIdrTp;
    }

    /**
     * Sets the value of the othrPurchsIdrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification53 setOthrPurchsIdrTp(String value) {
        this.othrPurchsIdrTp = value;
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
    public TransactionIdentification53 setPurchsIdr(String value) {
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
    public TransactionIdentification53 setTrnsmssnDtTm(XMLGregorianCalendar value) {
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
    public TransactionIdentification53 setSysTracAudtNb(String value) {
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
    public TransactionIdentification53 setRtrvlRefNb(String value) {
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
    public TransactionIdentification53 setLifeCyclSpprt(LifeCycleSupport1Code value) {
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
    public TransactionIdentification53 setLifeCyclId(String value) {
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
    public TransactionIdentification53 setAuthstnSeqNb(String value) {
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
    public TransactionIdentification53 setPresntmntSeqNb(String value) {
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
    public TransactionIdentification53 setPresntmntSeqCnt(String value) {
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
    public TransactionIdentification53 setAuthntcnTkn(String value) {
        this.authntcnTkn = value;
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
    public TransactionIdentification53 setAcqrrRefData(String value) {
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
    public TransactionIdentification53 setAcqrrRefNb(String value) {
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
    public TransactionIdentification53 setIssrRefData(String value) {
        this.issrRefData = value;
        return this;
    }

    /**
     * Gets the value of the assoctdDataRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssoctdDataRef() {
        return assoctdDataRef;
    }

    /**
     * Sets the value of the assoctdDataRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification53 setAssoctdDataRef(String value) {
        this.assoctdDataRef = value;
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
