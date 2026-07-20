
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between E-money token settlement quantity and network fee quantity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity83Choice", propOrder = {
    "elctrncMnyTknSttlmQty",
    "ntwkFeeQty"
})
public class Quantity83Choice {

    @XmlElement(name = "ElctrncMnyTknSttlmQty")
    protected BigDecimal elctrncMnyTknSttlmQty;
    @XmlElement(name = "NtwkFeeQty")
    protected BigDecimal ntwkFeeQty;

    /**
     * Gets the value of the elctrncMnyTknSttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElctrncMnyTknSttlmQty() {
        return elctrncMnyTknSttlmQty;
    }

    /**
     * Sets the value of the elctrncMnyTknSttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Quantity83Choice setElctrncMnyTknSttlmQty(BigDecimal value) {
        this.elctrncMnyTknSttlmQty = value;
        return this;
    }

    /**
     * Gets the value of the ntwkFeeQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNtwkFeeQty() {
        return ntwkFeeQty;
    }

    /**
     * Sets the value of the ntwkFeeQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Quantity83Choice setNtwkFeeQty(BigDecimal value) {
        this.ntwkFeeQty = value;
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
