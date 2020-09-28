
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
 * Specifies cash parties in the framework of a corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashParties34", propOrder = {
    "cdtr",
    "cdtrAgt",
    "mktClmCtrPty"
})
public class CashParties34 {

    @XmlElement(name = "Cdtr")
    protected PartyIdentificationAndAccount162 cdtr;
    @XmlElement(name = "CdtrAgt")
    protected PartyIdentificationAndAccount172 cdtrAgt;
    @XmlElement(name = "MktClmCtrPty")
    protected PartyIdentificationAndAccount162 mktClmCtrPty;

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount162 }
     *     
     */
    public PartyIdentificationAndAccount162 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount162 }
     *     
     */
    public CashParties34 setCdtr(PartyIdentificationAndAccount162 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount172 }
     *     
     */
    public PartyIdentificationAndAccount172 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount172 }
     *     
     */
    public CashParties34 setCdtrAgt(PartyIdentificationAndAccount172 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the mktClmCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount162 }
     *     
     */
    public PartyIdentificationAndAccount162 getMktClmCtrPty() {
        return mktClmCtrPty;
    }

    /**
     * Sets the value of the mktClmCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount162 }
     *     
     */
    public CashParties34 setMktClmCtrPty(PartyIdentificationAndAccount162 value) {
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
