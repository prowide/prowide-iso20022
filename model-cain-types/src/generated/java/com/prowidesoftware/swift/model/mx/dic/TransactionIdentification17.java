
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
 * Identification of the transaction for network management.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionIdentification17", propOrder = {
    "lclDt",
    "lclTm",
    "tmZone",
    "txRef",
    "trnsmssnDtTm",
    "sysTracAudtNb",
    "rtrvlRefNb",
    "lifeCyclSpprtInd",
    "lifeCyclTracIdData",
    "lifeCyclTracIdMssng",
    "acqrrRefData",
    "acqrrRefNb",
    "cardIssrRefData"
})
public class TransactionIdentification17 {

    @XmlElement(name = "LclDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate lclDt;
    @XmlElement(name = "LclTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime lclTm;
    @XmlElement(name = "TmZone")
    protected String tmZone;
    @XmlElement(name = "TxRef")
    protected String txRef;
    @XmlElement(name = "TrnsmssnDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime trnsmssnDtTm;
    @XmlElement(name = "SysTracAudtNb", required = true)
    protected String sysTracAudtNb;
    @XmlElement(name = "RtrvlRefNb", required = true)
    protected String rtrvlRefNb;
    @XmlElement(name = "LifeCyclSpprtInd")
    protected String lifeCyclSpprtInd;
    @XmlElement(name = "LifeCyclTracIdData")
    protected TransactionLifeCycleIdentification1 lifeCyclTracIdData;
    @XmlElement(name = "LifeCyclTracIdMssng")
    protected String lifeCyclTracIdMssng;
    @XmlElement(name = "AcqrrRefData")
    protected String acqrrRefData;
    @XmlElement(name = "AcqrrRefNb")
    protected String acqrrRefNb;
    @XmlElement(name = "CardIssrRefData")
    protected String cardIssrRefData;

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
    public TransactionIdentification17 setLclDt(LocalDate value) {
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
    public TransactionIdentification17 setLclTm(OffsetTime value) {
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
    public TransactionIdentification17 setTmZone(String value) {
        this.tmZone = value;
        return this;
    }

    /**
     * Gets the value of the txRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxRef() {
        return txRef;
    }

    /**
     * Sets the value of the txRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification17 setTxRef(String value) {
        this.txRef = value;
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
    public TransactionIdentification17 setTrnsmssnDtTm(OffsetDateTime value) {
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
    public TransactionIdentification17 setSysTracAudtNb(String value) {
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
    public TransactionIdentification17 setRtrvlRefNb(String value) {
        this.rtrvlRefNb = value;
        return this;
    }

    /**
     * Gets the value of the lifeCyclSpprtInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCyclSpprtInd() {
        return lifeCyclSpprtInd;
    }

    /**
     * Sets the value of the lifeCyclSpprtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification17 setLifeCyclSpprtInd(String value) {
        this.lifeCyclSpprtInd = value;
        return this;
    }

    /**
     * Gets the value of the lifeCyclTracIdData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionLifeCycleIdentification1 }
     *     
     */
    public TransactionLifeCycleIdentification1 getLifeCyclTracIdData() {
        return lifeCyclTracIdData;
    }

    /**
     * Sets the value of the lifeCyclTracIdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionLifeCycleIdentification1 }
     *     
     */
    public TransactionIdentification17 setLifeCyclTracIdData(TransactionLifeCycleIdentification1 value) {
        this.lifeCyclTracIdData = value;
        return this;
    }

    /**
     * Gets the value of the lifeCyclTracIdMssng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCyclTracIdMssng() {
        return lifeCyclTracIdMssng;
    }

    /**
     * Sets the value of the lifeCyclTracIdMssng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification17 setLifeCyclTracIdMssng(String value) {
        this.lifeCyclTracIdMssng = value;
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
    public TransactionIdentification17 setAcqrrRefData(String value) {
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
    public TransactionIdentification17 setAcqrrRefNb(String value) {
        this.acqrrRefNb = value;
        return this;
    }

    /**
     * Gets the value of the cardIssrRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssrRefData() {
        return cardIssrRefData;
    }

    /**
     * Sets the value of the cardIssrRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification17 setCardIssrRefData(String value) {
        this.cardIssrRefData = value;
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
