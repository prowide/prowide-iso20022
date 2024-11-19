
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
@XmlType(name = "CashParties12", propOrder = {
    "cdtr",
    "cdtrAgt",
    "mktClmCtrPty"
})
public class CashParties12 {

    @XmlElement(name = "Cdtr")
    protected PartyIdentificationAndAccount57 cdtr;
    @XmlElement(name = "CdtrAgt")
    protected PartyIdentificationAndAccount58 cdtrAgt;
    @XmlElement(name = "MktClmCtrPty")
    protected PartyIdentificationAndAccount57 mktClmCtrPty;

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount57 }
     *     
     */
    public PartyIdentificationAndAccount57 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount57 }
     *     
     */
    public CashParties12 setCdtr(PartyIdentificationAndAccount57 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount58 }
     *     
     */
    public PartyIdentificationAndAccount58 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount58 }
     *     
     */
    public CashParties12 setCdtrAgt(PartyIdentificationAndAccount58 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the mktClmCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount57 }
     *     
     */
    public PartyIdentificationAndAccount57 getMktClmCtrPty() {
        return mktClmCtrPty;
    }

    /**
     * Sets the value of the mktClmCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount57 }
     *     
     */
    public CashParties12 setMktClmCtrPty(PartyIdentificationAndAccount57 value) {
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
