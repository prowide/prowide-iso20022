
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional information such as the contribution account identification or the requirement amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contribution1", propOrder = {
    "acct",
    "reqrdAmt",
    "incrCvrgAmt",
    "nonClrMmb"
})
public class Contribution1 {

    @XmlElement(name = "Acct")
    protected AccountIdentification4Choice acct;
    @XmlElement(name = "ReqrdAmt", required = true)
    protected ActiveCurrencyAndAmount reqrdAmt;
    @XmlElement(name = "IncrCvrgAmt")
    protected ActiveCurrencyAndAmount incrCvrgAmt;
    @XmlElement(name = "NonClrMmb")
    protected PartyIdentificationAndAccount31 nonClrMmb;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public Contribution1 setAcct(AccountIdentification4Choice value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the reqrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getReqrdAmt() {
        return reqrdAmt;
    }

    /**
     * Sets the value of the reqrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Contribution1 setReqrdAmt(ActiveCurrencyAndAmount value) {
        this.reqrdAmt = value;
        return this;
    }

    /**
     * Gets the value of the incrCvrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIncrCvrgAmt() {
        return incrCvrgAmt;
    }

    /**
     * Sets the value of the incrCvrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Contribution1 setIncrCvrgAmt(ActiveCurrencyAndAmount value) {
        this.incrCvrgAmt = value;
        return this;
    }

    /**
     * Gets the value of the nonClrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public PartyIdentificationAndAccount31 getNonClrMmb() {
        return nonClrMmb;
    }

    /**
     * Sets the value of the nonClrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public Contribution1 setNonClrMmb(PartyIdentificationAndAccount31 value) {
        this.nonClrMmb = value;
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
