
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
 * Details related to the local undertaking.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Undertaking11", propOrder = {
    "newUdrtkgAmt",
    "newXpryDtls",
    "newBnfcry",
    "newUdrtkgTermsAndConds",
    "dlvryChanl"
})
public class Undertaking11 {

    @XmlElement(name = "NewUdrtkgAmt")
    protected UndertakingAmount2 newUdrtkgAmt;
    @XmlElement(name = "NewXpryDtls")
    protected ExpiryDetails1 newXpryDtls;
    @XmlElement(name = "NewBnfcry")
    protected PartyIdentification43 newBnfcry;
    @XmlElement(name = "NewUdrtkgTermsAndConds")
    protected Narrative1 newUdrtkgTermsAndConds;
    @XmlElement(name = "DlvryChanl")
    protected CommunicationChannel1 dlvryChanl;

    /**
     * Gets the value of the newUdrtkgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public UndertakingAmount2 getNewUdrtkgAmt() {
        return newUdrtkgAmt;
    }

    /**
     * Sets the value of the newUdrtkgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public Undertaking11 setNewUdrtkgAmt(UndertakingAmount2 value) {
        this.newUdrtkgAmt = value;
        return this;
    }

    /**
     * Gets the value of the newXpryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public ExpiryDetails1 getNewXpryDtls() {
        return newXpryDtls;
    }

    /**
     * Sets the value of the newXpryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public Undertaking11 setNewXpryDtls(ExpiryDetails1 value) {
        this.newXpryDtls = value;
        return this;
    }

    /**
     * Gets the value of the newBnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getNewBnfcry() {
        return newBnfcry;
    }

    /**
     * Sets the value of the newBnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Undertaking11 setNewBnfcry(PartyIdentification43 value) {
        this.newBnfcry = value;
        return this;
    }

    /**
     * Gets the value of the newUdrtkgTermsAndConds property.
     * 
     * @return
     *     possible object is
     *     {@link Narrative1 }
     *     
     */
    public Narrative1 getNewUdrtkgTermsAndConds() {
        return newUdrtkgTermsAndConds;
    }

    /**
     * Sets the value of the newUdrtkgTermsAndConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Narrative1 }
     *     
     */
    public Undertaking11 setNewUdrtkgTermsAndConds(Narrative1 value) {
        this.newUdrtkgTermsAndConds = value;
        return this;
    }

    /**
     * Gets the value of the dlvryChanl property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationChannel1 }
     *     
     */
    public CommunicationChannel1 getDlvryChanl() {
        return dlvryChanl;
    }

    /**
     * Sets the value of the dlvryChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationChannel1 }
     *     
     */
    public Undertaking11 setDlvryChanl(CommunicationChannel1 value) {
        this.dlvryChanl = value;
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
