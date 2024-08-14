
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
 * Parties used for acting parties that apply either to the whole message or to individual sides.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmationParties2", propOrder = {
    "buyr",
    "brrwr",
    "sellr",
    "lndr",
    "brkrOfCdt",
    "intrdcgFirm",
    "stepInFirm",
    "stepOutFirm",
    "clrFirm",
    "exctgBrkr",
    "cmuPty",
    "cmuCtrPty",
    "affrmgPty",
    "tradBnfcryPty"
})
public class ConfirmationParties2 {

    @XmlElement(name = "Buyr")
    protected ConfirmationPartyDetails2 buyr;
    @XmlElement(name = "Brrwr")
    protected ConfirmationPartyDetails2 brrwr;
    @XmlElement(name = "Sellr")
    protected ConfirmationPartyDetails2 sellr;
    @XmlElement(name = "Lndr")
    protected ConfirmationPartyDetails2 lndr;
    @XmlElement(name = "BrkrOfCdt")
    protected ConfirmationPartyDetails1 brkrOfCdt;
    @XmlElement(name = "IntrdcgFirm")
    protected ConfirmationPartyDetails1 intrdcgFirm;
    @XmlElement(name = "StepInFirm")
    protected ConfirmationPartyDetails1 stepInFirm;
    @XmlElement(name = "StepOutFirm")
    protected ConfirmationPartyDetails1 stepOutFirm;
    @XmlElement(name = "ClrFirm")
    protected ConfirmationPartyDetails5 clrFirm;
    @XmlElement(name = "ExctgBrkr")
    protected ConfirmationPartyDetails5 exctgBrkr;
    @XmlElement(name = "CMUPty")
    protected ConfirmationPartyDetails1 cmuPty;
    @XmlElement(name = "CMUCtrPty")
    protected ConfirmationPartyDetails1 cmuCtrPty;
    @XmlElement(name = "AffrmgPty")
    protected ConfirmationPartyDetails1 affrmgPty;
    @XmlElement(name = "TradBnfcryPty")
    protected ConfirmationPartyDetails3 tradBnfcryPty;

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails2 }
     *     
     */
    public ConfirmationPartyDetails2 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails2 }
     *     
     */
    public ConfirmationParties2 setBuyr(ConfirmationPartyDetails2 value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the brrwr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails2 }
     *     
     */
    public ConfirmationPartyDetails2 getBrrwr() {
        return brrwr;
    }

    /**
     * Sets the value of the brrwr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails2 }
     *     
     */
    public ConfirmationParties2 setBrrwr(ConfirmationPartyDetails2 value) {
        this.brrwr = value;
        return this;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails2 }
     *     
     */
    public ConfirmationPartyDetails2 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails2 }
     *     
     */
    public ConfirmationParties2 setSellr(ConfirmationPartyDetails2 value) {
        this.sellr = value;
        return this;
    }

    /**
     * Gets the value of the lndr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails2 }
     *     
     */
    public ConfirmationPartyDetails2 getLndr() {
        return lndr;
    }

    /**
     * Sets the value of the lndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails2 }
     *     
     */
    public ConfirmationParties2 setLndr(ConfirmationPartyDetails2 value) {
        this.lndr = value;
        return this;
    }

    /**
     * Gets the value of the brkrOfCdt property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails1 }
     *     
     */
    public ConfirmationPartyDetails1 getBrkrOfCdt() {
        return brkrOfCdt;
    }

    /**
     * Sets the value of the brkrOfCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails1 }
     *     
     */
    public ConfirmationParties2 setBrkrOfCdt(ConfirmationPartyDetails1 value) {
        this.brkrOfCdt = value;
        return this;
    }

    /**
     * Gets the value of the intrdcgFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails1 }
     *     
     */
    public ConfirmationPartyDetails1 getIntrdcgFirm() {
        return intrdcgFirm;
    }

    /**
     * Sets the value of the intrdcgFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails1 }
     *     
     */
    public ConfirmationParties2 setIntrdcgFirm(ConfirmationPartyDetails1 value) {
        this.intrdcgFirm = value;
        return this;
    }

    /**
     * Gets the value of the stepInFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails1 }
     *     
     */
    public ConfirmationPartyDetails1 getStepInFirm() {
        return stepInFirm;
    }

    /**
     * Sets the value of the stepInFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails1 }
     *     
     */
    public ConfirmationParties2 setStepInFirm(ConfirmationPartyDetails1 value) {
        this.stepInFirm = value;
        return this;
    }

    /**
     * Gets the value of the stepOutFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails1 }
     *     
     */
    public ConfirmationPartyDetails1 getStepOutFirm() {
        return stepOutFirm;
    }

    /**
     * Sets the value of the stepOutFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails1 }
     *     
     */
    public ConfirmationParties2 setStepOutFirm(ConfirmationPartyDetails1 value) {
        this.stepOutFirm = value;
        return this;
    }

    /**
     * Gets the value of the clrFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails5 }
     *     
     */
    public ConfirmationPartyDetails5 getClrFirm() {
        return clrFirm;
    }

    /**
     * Sets the value of the clrFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails5 }
     *     
     */
    public ConfirmationParties2 setClrFirm(ConfirmationPartyDetails5 value) {
        this.clrFirm = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails5 }
     *     
     */
    public ConfirmationPartyDetails5 getExctgBrkr() {
        return exctgBrkr;
    }

    /**
     * Sets the value of the exctgBrkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails5 }
     *     
     */
    public ConfirmationParties2 setExctgBrkr(ConfirmationPartyDetails5 value) {
        this.exctgBrkr = value;
        return this;
    }

    /**
     * Gets the value of the cmuPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails1 }
     *     
     */
    public ConfirmationPartyDetails1 getCMUPty() {
        return cmuPty;
    }

    /**
     * Sets the value of the cmuPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails1 }
     *     
     */
    public ConfirmationParties2 setCMUPty(ConfirmationPartyDetails1 value) {
        this.cmuPty = value;
        return this;
    }

    /**
     * Gets the value of the cmuCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails1 }
     *     
     */
    public ConfirmationPartyDetails1 getCMUCtrPty() {
        return cmuCtrPty;
    }

    /**
     * Sets the value of the cmuCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails1 }
     *     
     */
    public ConfirmationParties2 setCMUCtrPty(ConfirmationPartyDetails1 value) {
        this.cmuCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the affrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails1 }
     *     
     */
    public ConfirmationPartyDetails1 getAffrmgPty() {
        return affrmgPty;
    }

    /**
     * Sets the value of the affrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails1 }
     *     
     */
    public ConfirmationParties2 setAffrmgPty(ConfirmationPartyDetails1 value) {
        this.affrmgPty = value;
        return this;
    }

    /**
     * Gets the value of the tradBnfcryPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails3 }
     *     
     */
    public ConfirmationPartyDetails3 getTradBnfcryPty() {
        return tradBnfcryPty;
    }

    /**
     * Sets the value of the tradBnfcryPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails3 }
     *     
     */
    public ConfirmationParties2 setTradBnfcryPty(ConfirmationPartyDetails3 value) {
        this.tradBnfcryPty = value;
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
