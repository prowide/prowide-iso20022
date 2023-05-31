
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "ConfirmationParties9", propOrder = {
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
public class ConfirmationParties9 {

    @XmlElement(name = "Invstr")
    protected List<PartyIdentificationAndAccount220> invstr;
    @XmlElement(name = "Buyr")
    protected ConfirmationPartyDetails12 buyr;
    @XmlElement(name = "Brrwr")
    protected ConfirmationPartyDetails12 brrwr;
    @XmlElement(name = "Sellr")
    protected ConfirmationPartyDetails12 sellr;
    @XmlElement(name = "Lndr")
    protected ConfirmationPartyDetails12 lndr;
    @XmlElement(name = "BrkrOfCdt")
    protected ConfirmationPartyDetails14 brkrOfCdt;
    @XmlElement(name = "IntrdcgFirm")
    protected ConfirmationPartyDetails14 intrdcgFirm;
    @XmlElement(name = "StepInFirm")
    protected ConfirmationPartyDetails11 stepInFirm;
    @XmlElement(name = "StepOutFirm")
    protected ConfirmationPartyDetails11 stepOutFirm;
    @XmlElement(name = "ClrFirm")
    protected ConfirmationPartyDetails16 clrFirm;
    @XmlElement(name = "ExctgBrkr")
    protected ConfirmationPartyDetails16 exctgBrkr;
    @XmlElement(name = "AffrmgPty")
    protected ConfirmationPartyDetails14 affrmgPty;
    @XmlElement(name = "TradBnfcryPty")
    protected ConfirmationPartyDetails14 tradBnfcryPty;

    /**
     * Gets the value of the invstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invstr property.
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
     * {@link PartyIdentificationAndAccount220 }
     * 
     * 
     */
    public List<PartyIdentificationAndAccount220> getInvstr() {
        if (invstr == null) {
            invstr = new ArrayList<PartyIdentificationAndAccount220>();
        }
        return this.invstr;
    }

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
    public ConfirmationParties9 setBuyr(ConfirmationPartyDetails12 value) {
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
    public ConfirmationParties9 setBrrwr(ConfirmationPartyDetails12 value) {
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
    public ConfirmationParties9 setSellr(ConfirmationPartyDetails12 value) {
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
    public ConfirmationParties9 setLndr(ConfirmationPartyDetails12 value) {
        this.lndr = value;
        return this;
    }

    /**
     * Gets the value of the brkrOfCdt property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public ConfirmationPartyDetails14 getBrkrOfCdt() {
        return brkrOfCdt;
    }

    /**
     * Sets the value of the brkrOfCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public ConfirmationParties9 setBrkrOfCdt(ConfirmationPartyDetails14 value) {
        this.brkrOfCdt = value;
        return this;
    }

    /**
     * Gets the value of the intrdcgFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public ConfirmationPartyDetails14 getIntrdcgFirm() {
        return intrdcgFirm;
    }

    /**
     * Sets the value of the intrdcgFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public ConfirmationParties9 setIntrdcgFirm(ConfirmationPartyDetails14 value) {
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
    public ConfirmationParties9 setStepInFirm(ConfirmationPartyDetails11 value) {
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
    public ConfirmationParties9 setStepOutFirm(ConfirmationPartyDetails11 value) {
        this.stepOutFirm = value;
        return this;
    }

    /**
     * Gets the value of the clrFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails16 }
     *     
     */
    public ConfirmationPartyDetails16 getClrFirm() {
        return clrFirm;
    }

    /**
     * Sets the value of the clrFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails16 }
     *     
     */
    public ConfirmationParties9 setClrFirm(ConfirmationPartyDetails16 value) {
        this.clrFirm = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails16 }
     *     
     */
    public ConfirmationPartyDetails16 getExctgBrkr() {
        return exctgBrkr;
    }

    /**
     * Sets the value of the exctgBrkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails16 }
     *     
     */
    public ConfirmationParties9 setExctgBrkr(ConfirmationPartyDetails16 value) {
        this.exctgBrkr = value;
        return this;
    }

    /**
     * Gets the value of the affrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public ConfirmationPartyDetails14 getAffrmgPty() {
        return affrmgPty;
    }

    /**
     * Sets the value of the affrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public ConfirmationParties9 setAffrmgPty(ConfirmationPartyDetails14 value) {
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
    public ConfirmationParties9 setTradBnfcryPty(ConfirmationPartyDetails14 value) {
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
    public ConfirmationParties9 addInvstr(PartyIdentificationAndAccount220 invstr) {
        getInvstr().add(invstr);
        return this;
    }

}
