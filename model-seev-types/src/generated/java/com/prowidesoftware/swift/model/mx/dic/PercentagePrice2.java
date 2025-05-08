
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Price expressed as a percentage price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentagePrice2", propOrder = {
    "pctgPricTp",
    "pricVal"
})
public class PercentagePrice2 {

    @XmlElement(name = "PctgPricTp", required = true)
    @XmlSchemaType(name = "string")
    protected PriceRateType3Code pctgPricTp;
    @XmlElement(name = "PricVal", required = true)
    protected BigDecimal pricVal;

    /**
     * Gets the value of the pctgPricTp property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateType3Code }
     *     
     */
    public PriceRateType3Code getPctgPricTp() {
        return pctgPricTp;
    }

    /**
     * Sets the value of the pctgPricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateType3Code }
     *     
     */
    public PercentagePrice2 setPctgPricTp(PriceRateType3Code value) {
        this.pctgPricTp = value;
        return this;
    }

    /**
     * Gets the value of the pricVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricVal() {
        return pricVal;
    }

    /**
     * Sets the value of the pricVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PercentagePrice2 setPricVal(BigDecimal value) {
        this.pricVal = value;
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
