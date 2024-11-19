
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
 * Cash settlement chain parties and accounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashParties24", propOrder = {
    "cdtr",
    "cdtrAgt",
    "intrmy",
    "intrmy2"
})
public class CashParties24 {

    @XmlElement(name = "Cdtr", required = true)
    protected PartyIdentificationAndAccount96 cdtr;
    @XmlElement(name = "CdtrAgt", required = true)
    protected PartyIdentificationAndAccount97 cdtrAgt;
    @XmlElement(name = "Intrmy")
    protected PartyIdentificationAndAccount97 intrmy;
    @XmlElement(name = "Intrmy2")
    protected PartyIdentificationAndAccount97 intrmy2;

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount96 }
     *     
     */
    public PartyIdentificationAndAccount96 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount96 }
     *     
     */
    public CashParties24 setCdtr(PartyIdentificationAndAccount96 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount97 }
     *     
     */
    public PartyIdentificationAndAccount97 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount97 }
     *     
     */
    public CashParties24 setCdtrAgt(PartyIdentificationAndAccount97 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount97 }
     *     
     */
    public PartyIdentificationAndAccount97 getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount97 }
     *     
     */
    public CashParties24 setIntrmy(PartyIdentificationAndAccount97 value) {
        this.intrmy = value;
        return this;
    }

    /**
     * Gets the value of the intrmy2 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount97 }
     *     
     */
    public PartyIdentificationAndAccount97 getIntrmy2() {
        return intrmy2;
    }

    /**
     * Sets the value of the intrmy2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount97 }
     *     
     */
    public CashParties24 setIntrmy2(PartyIdentificationAndAccount97 value) {
        this.intrmy2 = value;
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
