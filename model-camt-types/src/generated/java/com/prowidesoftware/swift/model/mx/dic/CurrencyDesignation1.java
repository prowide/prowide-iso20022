
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about the designation of a currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyDesignation1", propOrder = {
    "ccyDsgnt",
    "lctn",
    "addtlInf"
})
public class CurrencyDesignation1 {

    @XmlElement(name = "CcyDsgnt")
    @XmlSchemaType(name = "string")
    protected CurrencyDesignation1Code ccyDsgnt;
    @XmlElement(name = "Lctn")
    protected String lctn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the ccyDsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDesignation1Code }
     *     
     */
    public CurrencyDesignation1Code getCcyDsgnt() {
        return ccyDsgnt;
    }

    /**
     * Sets the value of the ccyDsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDesignation1Code }
     *     
     */
    public CurrencyDesignation1 setCcyDsgnt(CurrencyDesignation1Code value) {
        this.ccyDsgnt = value;
        return this;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctn() {
        return lctn;
    }

    /**
     * Sets the value of the lctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyDesignation1 setLctn(String value) {
        this.lctn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyDesignation1 setAddtlInf(String value) {
        this.addtlInf = value;
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
