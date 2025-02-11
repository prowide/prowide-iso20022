
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
 * Specifies cash parties in the framework of a corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashParties5", propOrder = {
    "cdtr",
    "cdtrAgt",
    "mktClmCtrPty"
})
public class CashParties5 {

    @XmlElement(name = "Cdtr")
    protected PartyIdentificationAndAccount23 cdtr;
    @XmlElement(name = "CdtrAgt")
    protected PartyIdentificationAndAccount24 cdtrAgt;
    @XmlElement(name = "MktClmCtrPty")
    protected PartyIdentificationAndAccount23 mktClmCtrPty;

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount23 }
     *     
     */
    public PartyIdentificationAndAccount23 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount23 }
     *     
     */
    public CashParties5 setCdtr(PartyIdentificationAndAccount23 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount24 }
     *     
     */
    public PartyIdentificationAndAccount24 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount24 }
     *     
     */
    public CashParties5 setCdtrAgt(PartyIdentificationAndAccount24 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the mktClmCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount23 }
     *     
     */
    public PartyIdentificationAndAccount23 getMktClmCtrPty() {
        return mktClmCtrPty;
    }

    /**
     * Sets the value of the mktClmCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount23 }
     *     
     */
    public CashParties5 setMktClmCtrPty(PartyIdentificationAndAccount23 value) {
        this.mktClmCtrPty = value;
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
