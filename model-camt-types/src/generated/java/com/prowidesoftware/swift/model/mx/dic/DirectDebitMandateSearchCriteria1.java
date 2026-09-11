
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
 * Defines the criteria used to search for calendar data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitMandateSearchCriteria1", propOrder = {
    "cdtr",
    "cshAcct",
    "drctDbtMndtRef",
    "svc"
})
public class DirectDebitMandateSearchCriteria1 {

    @XmlElement(name = "Cdtr")
    protected SystemPartyIdentification8 cdtr;
    @XmlElement(name = "CshAcct")
    protected AccountIdentification4Choice cshAcct;
    @XmlElement(name = "DrctDbtMndtRef")
    protected String drctDbtMndtRef;
    @XmlElement(name = "Svc")
    protected SystemAndCurrency1 svc;

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public DirectDebitMandateSearchCriteria1 setCdtr(SystemPartyIdentification8 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public DirectDebitMandateSearchCriteria1 setCshAcct(AccountIdentification4Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the drctDbtMndtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrctDbtMndtRef() {
        return drctDbtMndtRef;
    }

    /**
     * Sets the value of the drctDbtMndtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DirectDebitMandateSearchCriteria1 setDrctDbtMndtRef(String value) {
        this.drctDbtMndtRef = value;
        return this;
    }

    /**
     * Gets the value of the svc property.
     * 
     * @return
     *     possible object is
     *     {@link SystemAndCurrency1 }
     *     
     */
    public SystemAndCurrency1 getSvc() {
        return svc;
    }

    /**
     * Sets the value of the svc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemAndCurrency1 }
     *     
     */
    public DirectDebitMandateSearchCriteria1 setSvc(SystemAndCurrency1 value) {
        this.svc = value;
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
