
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
 * Unique identifier of an account, as assigned by the account servicer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentification1Choice", propOrder = {
    "iban",
    "bban",
    "upic",
    "dmstAcct"
})
public class AccountIdentification1Choice {

    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "BBAN")
    protected String bban;
    @XmlElement(name = "UPIC")
    protected String upic;
    @XmlElement(name = "DmstAcct")
    protected SimpleIdentificationInformation dmstAcct;

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
    public AccountIdentification1Choice setIBAN(String value) {
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
    public AccountIdentification1Choice setBBAN(String value) {
        this.bban = value;
        return this;
    }

    /**
     * Gets the value of the upic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPIC() {
        return upic;
    }

    /**
     * Sets the value of the upic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountIdentification1Choice setUPIC(String value) {
        this.upic = value;
        return this;
    }

    /**
     * Gets the value of the dmstAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public SimpleIdentificationInformation getDmstAcct() {
        return dmstAcct;
    }

    /**
     * Sets the value of the dmstAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public AccountIdentification1Choice setDmstAcct(SimpleIdentificationInformation value) {
        this.dmstAcct = value;
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
