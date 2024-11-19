
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
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
 * Data elements contained in the original message.
 * ISO 8583:1987 bit 90 and ISO 8583 1993/2003 bit 56.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalDataElements1", propOrder = {
    "msgClss",
    "txTp",
    "acqrrId",
    "sndrId",
    "lclDtTm",
    "tmZone",
    "txRef",
    "trnsmssnDtTm",
    "sysTracAudtNb",
    "rtrvlRefNb",
    "lifeCyclSpprt",
    "lifeCyclTracIdData",
    "lifeCyclTracIdMssng",
    "acqrrRefData",
    "acqrrRefNb",
    "cardIssrRefData"
})
public class OriginalDataElements1 {

    @XmlElement(name = "MsgClss")
    @XmlSchemaType(name = "string")
    protected MessageClass1Code msgClss;
    @XmlElement(name = "TxTp")
    protected String txTp;
    @XmlElement(name = "AcqrrId")
    protected String acqrrId;
    @XmlElement(name = "SndrId")
    protected String sndrId;
    @XmlElement(name = "LclDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime lclDtTm;
    @XmlElement(name = "TmZone")
    protected String tmZone;
    @XmlElement(name = "TxRef")
    protected String txRef;
    @XmlElement(name = "TrnsmssnDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime trnsmssnDtTm;
    @XmlElement(name = "SysTracAudtNb")
    protected String sysTracAudtNb;
    @XmlElement(name = "RtrvlRefNb", required = true)
    protected String rtrvlRefNb;
    @XmlElement(name = "LifeCyclSpprt")
    @XmlSchemaType(name = "string")
    protected LifeCycleSupport1Code lifeCyclSpprt;
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
     * Gets the value of the msgClss property.
     * 
     * @return
     *     possible object is
     *     {@link MessageClass1Code }
     *     
     */
    public MessageClass1Code getMsgClss() {
        return msgClss;
    }

    /**
     * Sets the value of the msgClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageClass1Code }
     *     
     */
    public OriginalDataElements1 setMsgClss(MessageClass1Code value) {
        this.msgClss = value;
        return this;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalDataElements1 setTxTp(String value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the acqrrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrId() {
        return acqrrId;
    }

    /**
     * Sets the value of the acqrrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalDataElements1 setAcqrrId(String value) {
        this.acqrrId = value;
        return this;
    }

    /**
     * Gets the value of the sndrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrId() {
        return sndrId;
    }

    /**
     * Sets the value of the sndrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalDataElements1 setSndrId(String value) {
        this.sndrId = value;
        return this;
    }

    /**
     * Gets the value of the lclDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getLclDtTm() {
        return lclDtTm;
    }

    /**
     * Sets the value of the lclDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalDataElements1 setLclDtTm(OffsetDateTime value) {
        this.lclDtTm = value;
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
    public OriginalDataElements1 setTmZone(String value) {
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
    public OriginalDataElements1 setTxRef(String value) {
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
    public OriginalDataElements1 setTrnsmssnDtTm(OffsetDateTime value) {
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
    public OriginalDataElements1 setSysTracAudtNb(String value) {
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
    public OriginalDataElements1 setRtrvlRefNb(String value) {
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
    public OriginalDataElements1 setLifeCyclSpprt(LifeCycleSupport1Code value) {
        this.lifeCyclSpprt = value;
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
    public OriginalDataElements1 setLifeCyclTracIdData(TransactionLifeCycleIdentification1 value) {
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
    public OriginalDataElements1 setLifeCyclTracIdMssng(String value) {
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
    public OriginalDataElements1 setAcqrrRefData(String value) {
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
    public OriginalDataElements1 setAcqrrRefNb(String value) {
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
    public OriginalDataElements1 setCardIssrRefData(String value) {
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
