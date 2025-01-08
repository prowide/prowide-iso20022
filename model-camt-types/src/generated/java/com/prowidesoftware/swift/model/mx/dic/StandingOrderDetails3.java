
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Instruction given by a party that has explicit authority to instruct a debit on the account, ie, either the debit account owner or originating party, to a first agent, to process cash transfers at specified intervals during an implicit or explicit period of time. A standing order is given once and is valid for an open or closed period of time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderDetails3", propOrder = {
    "amt",
    "cdtDbtInd",
    "ref",
    "frqcy",
    "vldtyPrd",
    "assoctdPoolAcct"
})
public class StandingOrderDetails3 {

    @XmlElement(name = "Amt", required = true)
    protected AmountChoice amt;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "Frqcy")
    @XmlSchemaType(name = "string")
    protected Frequency2Code frqcy;
    @XmlElement(name = "VldtyPrd")
    protected DatePeriodDetails1 vldtyPrd;
    @XmlElement(name = "AssoctdPoolAcct")
    protected AccountIdentification1Choice assoctdPoolAcct;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountChoice }
     *     
     */
    public AmountChoice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountChoice }
     *     
     */
    public StandingOrderDetails3 setAmt(AmountChoice value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public StandingOrderDetails3 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StandingOrderDetails3 setRef(String value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency2Code }
     *     
     */
    public Frequency2Code getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency2Code }
     *     
     */
    public StandingOrderDetails3 setFrqcy(Frequency2Code value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the vldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodDetails1 }
     *     
     */
    public DatePeriodDetails1 getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Sets the value of the vldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodDetails1 }
     *     
     */
    public StandingOrderDetails3 setVldtyPrd(DatePeriodDetails1 value) {
        this.vldtyPrd = value;
        return this;
    }

    /**
     * Gets the value of the assoctdPoolAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public AccountIdentification1Choice getAssoctdPoolAcct() {
        return assoctdPoolAcct;
    }

    /**
     * Sets the value of the assoctdPoolAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public StandingOrderDetails3 setAssoctdPoolAcct(AccountIdentification1Choice value) {
        this.assoctdPoolAcct = value;
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
