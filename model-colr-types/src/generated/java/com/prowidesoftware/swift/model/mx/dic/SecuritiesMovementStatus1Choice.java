
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
 * Provides the status of thesecurities movement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesMovementStatus1Choice", propOrder = {
    "amt",
    "csh",
    "ccy",
    "excld",
    "futr",
    "pdg",
    "mnlyAccptd",
    "elgblty",
    "tax",
    "wait"
})
public class SecuritiesMovementStatus1Choice {

    @XmlElement(name = "Amt")
    protected ProprietaryReason4 amt;
    @XmlElement(name = "Csh")
    protected ProprietaryReason4 csh;
    @XmlElement(name = "Ccy")
    protected ProprietaryReason4 ccy;
    @XmlElement(name = "Excld")
    protected ProprietaryReason4 excld;
    @XmlElement(name = "Futr")
    protected ProprietaryReason4 futr;
    @XmlElement(name = "Pdg")
    protected ProprietaryReason4 pdg;
    @XmlElement(name = "MnlyAccptd")
    protected ProprietaryReason4 mnlyAccptd;
    @XmlElement(name = "Elgblty")
    protected ProprietaryReason4 elgblty;
    @XmlElement(name = "Tax")
    protected ProprietaryReason4 tax;
    @XmlElement(name = "Wait")
    protected ProprietaryReason4 wait;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public SecuritiesMovementStatus1Choice setAmt(ProprietaryReason4 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the csh property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getCsh() {
        return csh;
    }

    /**
     * Sets the value of the csh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public SecuritiesMovementStatus1Choice setCsh(ProprietaryReason4 value) {
        this.csh = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public SecuritiesMovementStatus1Choice setCcy(ProprietaryReason4 value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the excld property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getExcld() {
        return excld;
    }

    /**
     * Sets the value of the excld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public SecuritiesMovementStatus1Choice setExcld(ProprietaryReason4 value) {
        this.excld = value;
        return this;
    }

    /**
     * Gets the value of the futr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getFutr() {
        return futr;
    }

    /**
     * Sets the value of the futr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public SecuritiesMovementStatus1Choice setFutr(ProprietaryReason4 value) {
        this.futr = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public SecuritiesMovementStatus1Choice setPdg(ProprietaryReason4 value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the mnlyAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getMnlyAccptd() {
        return mnlyAccptd;
    }

    /**
     * Sets the value of the mnlyAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public SecuritiesMovementStatus1Choice setMnlyAccptd(ProprietaryReason4 value) {
        this.mnlyAccptd = value;
        return this;
    }

    /**
     * Gets the value of the elgblty property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getElgblty() {
        return elgblty;
    }

    /**
     * Sets the value of the elgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public SecuritiesMovementStatus1Choice setElgblty(ProprietaryReason4 value) {
        this.elgblty = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public SecuritiesMovementStatus1Choice setTax(ProprietaryReason4 value) {
        this.tax = value;
        return this;
    }

    /**
     * Gets the value of the wait property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getWait() {
        return wait;
    }

    /**
     * Sets the value of the wait property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public SecuritiesMovementStatus1Choice setWait(ProprietaryReason4 value) {
        this.wait = value;
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
