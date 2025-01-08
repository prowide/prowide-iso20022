
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
 * Information needed due to regulatory and statutory requirements.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRegulatoryReporting2", propOrder = {
    "cd",
    "amt",
    "inf"
})
public class StructuredRegulatoryReporting2 {

    @XmlElement(name = "Cd")
    protected String cd;
    @XmlElement(name = "Amt")
    protected CurrencyAndAmount amt;
    @XmlElement(name = "Inf")
    protected String inf;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StructuredRegulatoryReporting2 setCd(String value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public StructuredRegulatoryReporting2 setAmt(CurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the inf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInf() {
        return inf;
    }

    /**
     * Sets the value of the inf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StructuredRegulatoryReporting2 setInf(String value) {
        this.inf = value;
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
