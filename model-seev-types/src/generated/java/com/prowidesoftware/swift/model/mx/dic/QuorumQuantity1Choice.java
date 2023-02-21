
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
 * Choice of quorum quantity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuorumQuantity1Choice", propOrder = {
    "qrmQty",
    "qrmQtyPctg"
})
public class QuorumQuantity1Choice {

    @XmlElement(name = "QrmQty")
    protected String qrmQty;
    @XmlElement(name = "QrmQtyPctg")
    protected BigDecimal qrmQtyPctg;

    /**
     * Gets the value of the qrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrmQty() {
        return qrmQty;
    }

    /**
     * Sets the value of the qrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QuorumQuantity1Choice setQrmQty(String value) {
        this.qrmQty = value;
        return this;
    }

    /**
     * Gets the value of the qrmQtyPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQrmQtyPctg() {
        return qrmQtyPctg;
    }

    /**
     * Sets the value of the qrmQtyPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public QuorumQuantity1Choice setQrmQtyPctg(BigDecimal value) {
        this.qrmQtyPctg = value;
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
