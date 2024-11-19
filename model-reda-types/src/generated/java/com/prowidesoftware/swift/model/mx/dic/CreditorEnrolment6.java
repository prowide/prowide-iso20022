
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the attributes of the creditor used for a creditor enrolment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorEnrolment6", propOrder = {
    "enrlmnt",
    "cdtrTradgNm",
    "cdtr",
    "ultmtCdtr",
    "mrchntCtgyCd",
    "cdtrLogo"
})
public class CreditorEnrolment6 {

    @XmlElement(name = "Enrlmnt")
    protected CreditorServiceEnrolment1 enrlmnt;
    @XmlElement(name = "CdtrTradgNm")
    protected String cdtrTradgNm;
    @XmlElement(name = "Cdtr", required = true)
    protected RTPPartyIdentification2 cdtr;
    @XmlElement(name = "UltmtCdtr")
    protected RTPPartyIdentification2 ultmtCdtr;
    @XmlElement(name = "MrchntCtgyCd")
    protected String mrchntCtgyCd;
    @XmlElement(name = "CdtrLogo")
    protected byte[] cdtrLogo;

    /**
     * Gets the value of the enrlmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorServiceEnrolment1 }
     *     
     */
    public CreditorServiceEnrolment1 getEnrlmnt() {
        return enrlmnt;
    }

    /**
     * Sets the value of the enrlmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorServiceEnrolment1 }
     *     
     */
    public CreditorEnrolment6 setEnrlmnt(CreditorServiceEnrolment1 value) {
        this.enrlmnt = value;
        return this;
    }

    /**
     * Gets the value of the cdtrTradgNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrTradgNm() {
        return cdtrTradgNm;
    }

    /**
     * Sets the value of the cdtrTradgNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditorEnrolment6 setCdtrTradgNm(String value) {
        this.cdtrTradgNm = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public RTPPartyIdentification2 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public CreditorEnrolment6 setCdtr(RTPPartyIdentification2 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public RTPPartyIdentification2 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTPPartyIdentification2 }
     *     
     */
    public CreditorEnrolment6 setUltmtCdtr(RTPPartyIdentification2 value) {
        this.ultmtCdtr = value;
        return this;
    }

    /**
     * Gets the value of the mrchntCtgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntCtgyCd() {
        return mrchntCtgyCd;
    }

    /**
     * Sets the value of the mrchntCtgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditorEnrolment6 setMrchntCtgyCd(String value) {
        this.mrchntCtgyCd = value;
        return this;
    }

    /**
     * Gets the value of the cdtrLogo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCdtrLogo() {
        return cdtrLogo;
    }

    /**
     * Sets the value of the cdtrLogo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CreditorEnrolment6 setCdtrLogo(byte[] value) {
        this.cdtrLogo = value;
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
