
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
@XmlType(name = "ConfirmationParties7", propOrder = {
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
public class ConfirmationParties7 {

    @XmlElement(name = "Buyr")
    protected ConfirmationPartyDetails12 buyr;
    @XmlElement(name = "Brrwr")
    protected ConfirmationPartyDetails12 brrwr;
    @XmlElement(name = "Sellr")
    protected ConfirmationPartyDetails12 sellr;
    @XmlElement(name = "Lndr")
    protected ConfirmationPartyDetails12 lndr;
    @XmlElement(name = "BrkrOfCdt")
    protected ConfirmationPartyDetails11 brkrOfCdt;
    @XmlElement(name = "IntrdcgFirm")
    protected ConfirmationPartyDetails11 intrdcgFirm;
    @XmlElement(name = "StepInFirm")
    protected ConfirmationPartyDetails11 stepInFirm;
    @XmlElement(name = "StepOutFirm")
    protected ConfirmationPartyDetails11 stepOutFirm;
    @XmlElement(name = "ClrFirm")
    protected ConfirmationPartyDetails13 clrFirm;
    @XmlElement(name = "ExctgBrkr")
    protected ConfirmationPartyDetails13 exctgBrkr;
    @XmlElement(name = "CMUPty")
    protected ConfirmationPartyDetails11 cmuPty;
    @XmlElement(name = "CMUCtrPty")
    protected ConfirmationPartyDetails11 cmuCtrPty;
    @XmlElement(name = "AffrmgPty")
    protected ConfirmationPartyDetails11 affrmgPty;
    @XmlElement(name = "TradBnfcryPty")
    protected ConfirmationPartyDetails14 tradBnfcryPty;

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public ConfirmationPartyDetails12 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public ConfirmationParties7 setBuyr(ConfirmationPartyDetails12 value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the brrwr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public ConfirmationPartyDetails12 getBrrwr() {
        return brrwr;
    }

    /**
     * Sets the value of the brrwr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public ConfirmationParties7 setBrrwr(ConfirmationPartyDetails12 value) {
        this.brrwr = value;
        return this;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public ConfirmationPartyDetails12 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public ConfirmationParties7 setSellr(ConfirmationPartyDetails12 value) {
        this.sellr = value;
        return this;
    }

    /**
     * Gets the value of the lndr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public ConfirmationPartyDetails12 getLndr() {
        return lndr;
    }

    /**
     * Sets the value of the lndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public ConfirmationParties7 setLndr(ConfirmationPartyDetails12 value) {
        this.lndr = value;
        return this;
    }

    /**
     * Gets the value of the brkrOfCdt property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationPartyDetails11 getBrkrOfCdt() {
        return brkrOfCdt;
    }

    /**
     * Sets the value of the brkrOfCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationParties7 setBrkrOfCdt(ConfirmationPartyDetails11 value) {
        this.brkrOfCdt = value;
        return this;
    }

    /**
     * Gets the value of the intrdcgFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationPartyDetails11 getIntrdcgFirm() {
        return intrdcgFirm;
    }

    /**
     * Sets the value of the intrdcgFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationParties7 setIntrdcgFirm(ConfirmationPartyDetails11 value) {
        this.intrdcgFirm = value;
        return this;
    }

    /**
     * Gets the value of the stepInFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationPartyDetails11 getStepInFirm() {
        return stepInFirm;
    }

    /**
     * Sets the value of the stepInFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationParties7 setStepInFirm(ConfirmationPartyDetails11 value) {
        this.stepInFirm = value;
        return this;
    }

    /**
     * Gets the value of the stepOutFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationPartyDetails11 getStepOutFirm() {
        return stepOutFirm;
    }

    /**
     * Sets the value of the stepOutFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationParties7 setStepOutFirm(ConfirmationPartyDetails11 value) {
        this.stepOutFirm = value;
        return this;
    }

    /**
     * Gets the value of the clrFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails13 }
     *     
     */
    public ConfirmationPartyDetails13 getClrFirm() {
        return clrFirm;
    }

    /**
     * Sets the value of the clrFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails13 }
     *     
     */
    public ConfirmationParties7 setClrFirm(ConfirmationPartyDetails13 value) {
        this.clrFirm = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails13 }
     *     
     */
    public ConfirmationPartyDetails13 getExctgBrkr() {
        return exctgBrkr;
    }

    /**
     * Sets the value of the exctgBrkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails13 }
     *     
     */
    public ConfirmationParties7 setExctgBrkr(ConfirmationPartyDetails13 value) {
        this.exctgBrkr = value;
        return this;
    }

    /**
     * Gets the value of the cmuPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationPartyDetails11 getCMUPty() {
        return cmuPty;
    }

    /**
     * Sets the value of the cmuPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationParties7 setCMUPty(ConfirmationPartyDetails11 value) {
        this.cmuPty = value;
        return this;
    }

    /**
     * Gets the value of the cmuCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationPartyDetails11 getCMUCtrPty() {
        return cmuCtrPty;
    }

    /**
     * Sets the value of the cmuCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationParties7 setCMUCtrPty(ConfirmationPartyDetails11 value) {
        this.cmuCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the affrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationPartyDetails11 getAffrmgPty() {
        return affrmgPty;
    }

    /**
     * Sets the value of the affrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationParties7 setAffrmgPty(ConfirmationPartyDetails11 value) {
        this.affrmgPty = value;
        return this;
    }

    /**
     * Gets the value of the tradBnfcryPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public ConfirmationPartyDetails14 getTradBnfcryPty() {
        return tradBnfcryPty;
    }

    /**
     * Sets the value of the tradBnfcryPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public ConfirmationParties7 setTradBnfcryPty(ConfirmationPartyDetails14 value) {
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
