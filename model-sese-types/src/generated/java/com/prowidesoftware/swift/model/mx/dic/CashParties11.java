
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
 * Payment processes required to transfer cash from the debtor to the creditor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashParties11", propOrder = {
    "dbtr",
    "dbtrAgt",
    "cdtr",
    "cdtrAgt"
})
public class CashParties11 {

    @XmlElement(name = "Dbtr")
    protected PartyIdentificationAndAccount53 dbtr;
    @XmlElement(name = "DbtrAgt")
    protected PartyIdentificationAndAccount55 dbtrAgt;
    @XmlElement(name = "Cdtr")
    protected PartyIdentificationAndAccount53 cdtr;
    @XmlElement(name = "CdtrAgt")
    protected PartyIdentificationAndAccount55 cdtrAgt;

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount53 }
     *     
     */
    public PartyIdentificationAndAccount53 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount53 }
     *     
     */
    public CashParties11 setDbtr(PartyIdentificationAndAccount53 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount55 }
     *     
     */
    public PartyIdentificationAndAccount55 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount55 }
     *     
     */
    public CashParties11 setDbtrAgt(PartyIdentificationAndAccount55 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount53 }
     *     
     */
    public PartyIdentificationAndAccount53 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount53 }
     *     
     */
    public CashParties11 setCdtr(PartyIdentificationAndAccount53 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount55 }
     *     
     */
    public PartyIdentificationAndAccount55 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount55 }
     *     
     */
    public CashParties11 setCdtrAgt(PartyIdentificationAndAccount55 value) {
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
