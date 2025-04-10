
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Ratio expressed as a quotient of quantities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityToQuantityRatio1", propOrder = {
    "qty1",
    "qty2"
})
public class QuantityToQuantityRatio1 {

    @XmlElement(name = "Qty1", required = true)
    protected BigDecimal qty1;
    @XmlElement(name = "Qty2", required = true)
    protected BigDecimal qty2;

    /**
     * Gets the value of the qty1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty1() {
        return qty1;
    }

    /**
     * Sets the value of the qty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public QuantityToQuantityRatio1 setQty1(BigDecimal value) {
        this.qty1 = value;
        return this;
    }

    /**
     * Gets the value of the qty2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty2() {
        return qty2;
    }

    /**
     * Sets the value of the qty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public QuantityToQuantityRatio1 setQty2(BigDecimal value) {
        this.qty2 = value;
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
