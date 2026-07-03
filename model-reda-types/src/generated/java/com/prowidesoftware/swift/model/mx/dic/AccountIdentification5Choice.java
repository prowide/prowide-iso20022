
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
 * Unique identifier of an account, as assigned by the account servicer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentification5Choice", propOrder = {
    "iban",
    "bban",
    "dmstAcct",
    "dpstryAcct"
})
public class AccountIdentification5Choice {

    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "BBAN")
    protected String bban;
    @XmlElement(name = "DmstAcct")
    protected String dmstAcct;
    @XmlElement(name = "DpstryAcct")
    protected String dpstryAcct;

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountIdentification5Choice setIBAN(String value) {
        this.iban = value;
        return this;
    }

    /**
     * Gets the value of the bban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBAN() {
        return bban;
    }

    /**
     * Sets the value of the bban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountIdentification5Choice setBBAN(String value) {
        this.bban = value;
        return this;
    }

    /**
     * Gets the value of the dmstAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmstAcct() {
        return dmstAcct;
    }

    /**
     * Sets the value of the dmstAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountIdentification5Choice setDmstAcct(String value) {
        this.dmstAcct = value;
        return this;
    }

    /**
     * Gets the value of the dpstryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpstryAcct() {
        return dpstryAcct;
    }

    /**
     * Sets the value of the dpstryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountIdentification5Choice setDpstryAcct(String value) {
        this.dpstryAcct = value;
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
