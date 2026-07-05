
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
@XmlType(name = "ConfirmationParties3", propOrder = {
    "affrmgPty",
    "buyr",
    "brrwr",
    "sellr",
    "lndr",
    "tradBnfcryPty"
})
public class ConfirmationParties3 {

    @XmlElement(name = "AffrmgPty", required = true)
    protected ConfirmationPartyDetails4 affrmgPty;
    @XmlElement(name = "Buyr")
    protected ConfirmationPartyDetails2 buyr;
    @XmlElement(name = "Brrwr")
    protected ConfirmationPartyDetails2 brrwr;
    @XmlElement(name = "Sellr")
    protected ConfirmationPartyDetails2 sellr;
    @XmlElement(name = "Lndr")
    protected ConfirmationPartyDetails2 lndr;
    @XmlElement(name = "TradBnfcryPty")
    protected ConfirmationPartyDetails3 tradBnfcryPty;

    /**
     * Gets the value of the affrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails4 }
     *     
     */
    public ConfirmationPartyDetails4 getAffrmgPty() {
        return affrmgPty;
    }

    /**
     * Sets the value of the affrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails4 }
     *     
     */
    public ConfirmationParties3 setAffrmgPty(ConfirmationPartyDetails4 value) {
        this.affrmgPty = value;
        return this;
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
    public ConfirmationParties3 setBuyr(ConfirmationPartyDetails2 value) {
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
    public ConfirmationParties3 setBrrwr(ConfirmationPartyDetails2 value) {
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
    public ConfirmationParties3 setSellr(ConfirmationPartyDetails2 value) {
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
    public ConfirmationParties3 setLndr(ConfirmationPartyDetails2 value) {
        this.lndr = value;
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
    public ConfirmationParties3 setTradBnfcryPty(ConfirmationPartyDetails3 value) {
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
