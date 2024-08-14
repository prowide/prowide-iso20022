
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the value, type and source of price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price6", propOrder = {
    "rateOrAmt",
    "tp",
    "src"
})
public class Price6 {

    @XmlElement(name = "RateOrAmt", required = true)
    protected PriceRateOrAmountChoice rateOrAmt;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfPrice13Code tp;
    @XmlElement(name = "Src", required = true)
    @XmlSchemaType(name = "string")
    protected PriceSource2Code src;

    /**
     * Gets the value of the rateOrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmountChoice }
     *     
     */
    public PriceRateOrAmountChoice getRateOrAmt() {
        return rateOrAmt;
    }

    /**
     * Sets the value of the rateOrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmountChoice }
     *     
     */
    public Price6 setRateOrAmt(PriceRateOrAmountChoice value) {
        this.rateOrAmt = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice13Code }
     *     
     */
    public TypeOfPrice13Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice13Code }
     *     
     */
    public Price6 setTp(TypeOfPrice13Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSource2Code }
     *     
     */
    public PriceSource2Code getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSource2Code }
     *     
     */
    public Price6 setSrc(PriceSource2Code value) {
        this.src = value;
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
