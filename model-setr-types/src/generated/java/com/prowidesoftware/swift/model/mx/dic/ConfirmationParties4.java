
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "ConfirmationParties4", propOrder = {
    "invstr",
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
    "affrmgPty",
    "tradBnfcryPty"
})
public class ConfirmationParties4 {

    @XmlElement(name = "Invstr")
    protected List<PartyIdentificationAndAccount79> invstr;
    @XmlElement(name = "Buyr")
    protected ConfirmationPartyDetails2 buyr;
    @XmlElement(name = "Brrwr")
    protected ConfirmationPartyDetails2 brrwr;
    @XmlElement(name = "Sellr")
    protected ConfirmationPartyDetails2 sellr;
    @XmlElement(name = "Lndr")
    protected ConfirmationPartyDetails2 lndr;
    @XmlElement(name = "BrkrOfCdt")
    protected ConfirmationPartyDetails3 brkrOfCdt;
    @XmlElement(name = "IntrdcgFirm")
    protected ConfirmationPartyDetails3 intrdcgFirm;
    @XmlElement(name = "StepInFirm")
    protected ConfirmationPartyDetails1 stepInFirm;
    @XmlElement(name = "StepOutFirm")
    protected ConfirmationPartyDetails1 stepOutFirm;
    @XmlElement(name = "ClrFirm")
    protected ConfirmationPartyDetails6 clrFirm;
    @XmlElement(name = "ExctgBrkr")
    protected ConfirmationPartyDetails6 exctgBrkr;
    @XmlElement(name = "AffrmgPty")
    protected ConfirmationPartyDetails3 affrmgPty;
    @XmlElement(name = "TradBnfcryPty")
    protected ConfirmationPartyDetails3 tradBnfcryPty;

    /**
     * Gets the value of the invstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationAndAccount79 }
     * 
     * 
     * @return
     *     The value of the invstr property.
     */
    public List<PartyIdentificationAndAccount79> getInvstr() {
        if (invstr == null) {
            invstr = new ArrayList<>();
        }
        return this.invstr;
    }

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
    public ConfirmationParties4 setBuyr(ConfirmationPartyDetails2 value) {
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
    public ConfirmationParties4 setBrrwr(ConfirmationPartyDetails2 value) {
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
    public ConfirmationParties4 setSellr(ConfirmationPartyDetails2 value) {
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
    public ConfirmationParties4 setLndr(ConfirmationPartyDetails2 value) {
        this.lndr = value;
        return this;
    }

    /**
     * Gets the value of the brkrOfCdt property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails3 }
     *     
     */
    public ConfirmationPartyDetails3 getBrkrOfCdt() {
        return brkrOfCdt;
    }

    /**
     * Sets the value of the brkrOfCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails3 }
     *     
     */
    public ConfirmationParties4 setBrkrOfCdt(ConfirmationPartyDetails3 value) {
        this.brkrOfCdt = value;
        return this;
    }

    /**
     * Gets the value of the intrdcgFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails3 }
     *     
     */
    public ConfirmationPartyDetails3 getIntrdcgFirm() {
        return intrdcgFirm;
    }

    /**
     * Sets the value of the intrdcgFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails3 }
     *     
     */
    public ConfirmationParties4 setIntrdcgFirm(ConfirmationPartyDetails3 value) {
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
    public ConfirmationParties4 setStepInFirm(ConfirmationPartyDetails1 value) {
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
    public ConfirmationParties4 setStepOutFirm(ConfirmationPartyDetails1 value) {
        this.stepOutFirm = value;
        return this;
    }

    /**
     * Gets the value of the clrFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails6 }
     *     
     */
    public ConfirmationPartyDetails6 getClrFirm() {
        return clrFirm;
    }

    /**
     * Sets the value of the clrFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails6 }
     *     
     */
    public ConfirmationParties4 setClrFirm(ConfirmationPartyDetails6 value) {
        this.clrFirm = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails6 }
     *     
     */
    public ConfirmationPartyDetails6 getExctgBrkr() {
        return exctgBrkr;
    }

    /**
     * Sets the value of the exctgBrkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails6 }
     *     
     */
    public ConfirmationParties4 setExctgBrkr(ConfirmationPartyDetails6 value) {
        this.exctgBrkr = value;
        return this;
    }

    /**
     * Gets the value of the affrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails3 }
     *     
     */
    public ConfirmationPartyDetails3 getAffrmgPty() {
        return affrmgPty;
    }

    /**
     * Sets the value of the affrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails3 }
     *     
     */
    public ConfirmationParties4 setAffrmgPty(ConfirmationPartyDetails3 value) {
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
    public ConfirmationParties4 setTradBnfcryPty(ConfirmationPartyDetails3 value) {
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

    /**
     * Adds a new item to the invstr list.
     * @see #getInvstr()
     * 
     */
    public ConfirmationParties4 addInvstr(PartyIdentificationAndAccount79 invstr) {
        getInvstr().add(invstr);
        return this;
    }

}
