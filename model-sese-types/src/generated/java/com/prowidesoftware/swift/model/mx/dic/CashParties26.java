
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
@XmlType(name = "CashParties26", propOrder = {
    "dbtr",
    "dbtrAgt",
    "cdtr",
    "cdtrAgt",
    "intrmy"
})
public class CashParties26 {

    @XmlElement(name = "Dbtr")
    protected PartyIdentificationAndAccount111 dbtr;
    @XmlElement(name = "DbtrAgt")
    protected PartyIdentificationAndAccount112 dbtrAgt;
    @XmlElement(name = "Cdtr")
    protected PartyIdentificationAndAccount111 cdtr;
    @XmlElement(name = "CdtrAgt")
    protected PartyIdentificationAndAccount112 cdtrAgt;
    @XmlElement(name = "Intrmy")
    protected PartyIdentificationAndAccount112 intrmy;

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount111 }
     *     
     */
    public PartyIdentificationAndAccount111 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount111 }
     *     
     */
    public CashParties26 setDbtr(PartyIdentificationAndAccount111 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount112 }
     *     
     */
    public PartyIdentificationAndAccount112 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount112 }
     *     
     */
    public CashParties26 setDbtrAgt(PartyIdentificationAndAccount112 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount111 }
     *     
     */
    public PartyIdentificationAndAccount111 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount111 }
     *     
     */
    public CashParties26 setCdtr(PartyIdentificationAndAccount111 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount112 }
     *     
     */
    public PartyIdentificationAndAccount112 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount112 }
     *     
     */
    public CashParties26 setCdtrAgt(PartyIdentificationAndAccount112 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount112 }
     *     
     */
    public PartyIdentificationAndAccount112 getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount112 }
     *     
     */
    public CashParties26 setIntrmy(PartyIdentificationAndAccount112 value) {
        this.intrmy = value;
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
