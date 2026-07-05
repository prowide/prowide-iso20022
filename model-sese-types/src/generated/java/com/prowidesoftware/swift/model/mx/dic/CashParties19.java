
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
@XmlType(name = "CashParties19", propOrder = {
    "dbtr",
    "dbtrAgt",
    "cdtr",
    "cdtrAgt",
    "intrmy"
})
public class CashParties19 {

    @XmlElement(name = "Dbtr")
    protected PartyIdentificationAndAccount64 dbtr;
    @XmlElement(name = "DbtrAgt")
    protected PartyIdentificationAndAccount60 dbtrAgt;
    @XmlElement(name = "Cdtr")
    protected PartyIdentificationAndAccount64 cdtr;
    @XmlElement(name = "CdtrAgt")
    protected PartyIdentificationAndAccount60 cdtrAgt;
    @XmlElement(name = "Intrmy")
    protected PartyIdentificationAndAccount60 intrmy;

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount64 }
     *     
     */
    public PartyIdentificationAndAccount64 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount64 }
     *     
     */
    public CashParties19 setDbtr(PartyIdentificationAndAccount64 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount60 }
     *     
     */
    public PartyIdentificationAndAccount60 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount60 }
     *     
     */
    public CashParties19 setDbtrAgt(PartyIdentificationAndAccount60 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount64 }
     *     
     */
    public PartyIdentificationAndAccount64 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount64 }
     *     
     */
    public CashParties19 setCdtr(PartyIdentificationAndAccount64 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount60 }
     *     
     */
    public PartyIdentificationAndAccount60 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount60 }
     *     
     */
    public CashParties19 setCdtrAgt(PartyIdentificationAndAccount60 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount60 }
     *     
     */
    public PartyIdentificationAndAccount60 getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount60 }
     *     
     */
    public CashParties19 setIntrmy(PartyIdentificationAndAccount60 value) {
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
