
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
 * Parties used for acting parties that apply either to the whole message or to individual sides.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmationParties6", propOrder = {
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
public class ConfirmationParties6 {

    @XmlElement(name = "Buyr")
    protected ConfirmationPartyDetails7 buyr;
    @XmlElement(name = "Brrwr")
    protected ConfirmationPartyDetails7 brrwr;
    @XmlElement(name = "Sellr")
    protected ConfirmationPartyDetails7 sellr;
    @XmlElement(name = "Lndr")
    protected ConfirmationPartyDetails7 lndr;
    @XmlElement(name = "BrkrOfCdt")
    protected ConfirmationPartyDetails8 brkrOfCdt;
    @XmlElement(name = "IntrdcgFirm")
    protected ConfirmationPartyDetails8 intrdcgFirm;
    @XmlElement(name = "StepInFirm")
    protected ConfirmationPartyDetails8 stepInFirm;
    @XmlElement(name = "StepOutFirm")
    protected ConfirmationPartyDetails8 stepOutFirm;
    @XmlElement(name = "ClrFirm")
    protected ConfirmationPartyDetails9 clrFirm;
    @XmlElement(name = "ExctgBrkr")
    protected ConfirmationPartyDetails9 exctgBrkr;
    @XmlElement(name = "CMUPty")
    protected ConfirmationPartyDetails8 cmuPty;
    @XmlElement(name = "CMUCtrPty")
    protected ConfirmationPartyDetails8 cmuCtrPty;
    @XmlElement(name = "AffrmgPty")
    protected ConfirmationPartyDetails8 affrmgPty;
    @XmlElement(name = "TradBnfcryPty")
    protected ConfirmationPartyDetails10 tradBnfcryPty;

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails7 }
     *     
     */
    public ConfirmationPartyDetails7 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails7 }
     *     
     */
    public ConfirmationParties6 setBuyr(ConfirmationPartyDetails7 value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the brrwr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails7 }
     *     
     */
    public ConfirmationPartyDetails7 getBrrwr() {
        return brrwr;
    }

    /**
     * Sets the value of the brrwr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails7 }
     *     
     */
    public ConfirmationParties6 setBrrwr(ConfirmationPartyDetails7 value) {
        this.brrwr = value;
        return this;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails7 }
     *     
     */
    public ConfirmationPartyDetails7 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails7 }
     *     
     */
    public ConfirmationParties6 setSellr(ConfirmationPartyDetails7 value) {
        this.sellr = value;
        return this;
    }

    /**
     * Gets the value of the lndr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails7 }
     *     
     */
    public ConfirmationPartyDetails7 getLndr() {
        return lndr;
    }

    /**
     * Sets the value of the lndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails7 }
     *     
     */
    public ConfirmationParties6 setLndr(ConfirmationPartyDetails7 value) {
        this.lndr = value;
        return this;
    }

    /**
     * Gets the value of the brkrOfCdt property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails8 }
     *     
     */
    public ConfirmationPartyDetails8 getBrkrOfCdt() {
        return brkrOfCdt;
    }

    /**
     * Sets the value of the brkrOfCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails8 }
     *     
     */
    public ConfirmationParties6 setBrkrOfCdt(ConfirmationPartyDetails8 value) {
        this.brkrOfCdt = value;
        return this;
    }

    /**
     * Gets the value of the intrdcgFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails8 }
     *     
     */
    public ConfirmationPartyDetails8 getIntrdcgFirm() {
        return intrdcgFirm;
    }

    /**
     * Sets the value of the intrdcgFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails8 }
     *     
     */
    public ConfirmationParties6 setIntrdcgFirm(ConfirmationPartyDetails8 value) {
        this.intrdcgFirm = value;
        return this;
    }

    /**
     * Gets the value of the stepInFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails8 }
     *     
     */
    public ConfirmationPartyDetails8 getStepInFirm() {
        return stepInFirm;
    }

    /**
     * Sets the value of the stepInFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails8 }
     *     
     */
    public ConfirmationParties6 setStepInFirm(ConfirmationPartyDetails8 value) {
        this.stepInFirm = value;
        return this;
    }

    /**
     * Gets the value of the stepOutFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails8 }
     *     
     */
    public ConfirmationPartyDetails8 getStepOutFirm() {
        return stepOutFirm;
    }

    /**
     * Sets the value of the stepOutFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails8 }
     *     
     */
    public ConfirmationParties6 setStepOutFirm(ConfirmationPartyDetails8 value) {
        this.stepOutFirm = value;
        return this;
    }

    /**
     * Gets the value of the clrFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails9 }
     *     
     */
    public ConfirmationPartyDetails9 getClrFirm() {
        return clrFirm;
    }

    /**
     * Sets the value of the clrFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails9 }
     *     
     */
    public ConfirmationParties6 setClrFirm(ConfirmationPartyDetails9 value) {
        this.clrFirm = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails9 }
     *     
     */
    public ConfirmationPartyDetails9 getExctgBrkr() {
        return exctgBrkr;
    }

    /**
     * Sets the value of the exctgBrkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails9 }
     *     
     */
    public ConfirmationParties6 setExctgBrkr(ConfirmationPartyDetails9 value) {
        this.exctgBrkr = value;
        return this;
    }

    /**
     * Gets the value of the cmuPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails8 }
     *     
     */
    public ConfirmationPartyDetails8 getCMUPty() {
        return cmuPty;
    }

    /**
     * Sets the value of the cmuPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails8 }
     *     
     */
    public ConfirmationParties6 setCMUPty(ConfirmationPartyDetails8 value) {
        this.cmuPty = value;
        return this;
    }

    /**
     * Gets the value of the cmuCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails8 }
     *     
     */
    public ConfirmationPartyDetails8 getCMUCtrPty() {
        return cmuCtrPty;
    }

    /**
     * Sets the value of the cmuCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails8 }
     *     
     */
    public ConfirmationParties6 setCMUCtrPty(ConfirmationPartyDetails8 value) {
        this.cmuCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the affrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails8 }
     *     
     */
    public ConfirmationPartyDetails8 getAffrmgPty() {
        return affrmgPty;
    }

    /**
     * Sets the value of the affrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails8 }
     *     
     */
    public ConfirmationParties6 setAffrmgPty(ConfirmationPartyDetails8 value) {
        this.affrmgPty = value;
        return this;
    }

    /**
     * Gets the value of the tradBnfcryPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails10 }
     *     
     */
    public ConfirmationPartyDetails10 getTradBnfcryPty() {
        return tradBnfcryPty;
    }

    /**
     * Sets the value of the tradBnfcryPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails10 }
     *     
     */
    public ConfirmationParties6 setTradBnfcryPty(ConfirmationPartyDetails10 value) {
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
