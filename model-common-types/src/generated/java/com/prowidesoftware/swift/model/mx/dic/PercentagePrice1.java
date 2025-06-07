
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Price expressed as a percentage price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentagePrice1", propOrder = {
    "pctgPricTp",
    "pricVal"
})
public class PercentagePrice1 {

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
    public PercentagePrice1 setPctgPricTp(PriceRateType3Code value) {
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
    public PercentagePrice1 setPricVal(BigDecimal value) {
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
