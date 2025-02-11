
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
 * Payment processes required to transfer cash from the debtor to the creditor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashParties6", propOrder = {
    "dbtr",
    "dbtrAgt",
    "cdtr",
    "cdtrAgt"
})
public class CashParties6 {

    @XmlElement(name = "Dbtr")
    protected PartyIdentificationAndAccount80 dbtr;
    @XmlElement(name = "DbtrAgt")
    protected PartyIdentificationAndAccount80 dbtrAgt;
    @XmlElement(name = "Cdtr")
    protected PartyIdentificationAndAccount80 cdtr;
    @XmlElement(name = "CdtrAgt")
    protected PartyIdentificationAndAccount80 cdtrAgt;

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount80 }
     *     
     */
    public PartyIdentificationAndAccount80 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount80 }
     *     
     */
    public CashParties6 setDbtr(PartyIdentificationAndAccount80 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount80 }
     *     
     */
    public PartyIdentificationAndAccount80 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount80 }
     *     
     */
    public CashParties6 setDbtrAgt(PartyIdentificationAndAccount80 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount80 }
     *     
     */
    public PartyIdentificationAndAccount80 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount80 }
     *     
     */
    public CashParties6 setCdtr(PartyIdentificationAndAccount80 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount80 }
     *     
     */
    public PartyIdentificationAndAccount80 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount80 }
     *     
     */
    public CashParties6 setCdtrAgt(PartyIdentificationAndAccount80 value) {
        this.cdtrAgt = value;
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
