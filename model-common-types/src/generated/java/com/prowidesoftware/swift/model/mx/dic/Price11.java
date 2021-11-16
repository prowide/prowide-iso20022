
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
 * Type and information about a price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price11", propOrder = {
    "tp",
    "val"
})
public class Price11 {

    @XmlElement(name = "Tp", required = true)
    protected YieldedOrValueType2Choice tp;
    @XmlElement(name = "Val", required = true)
    protected PriceRateOrAmount1Choice val;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link YieldedOrValueType2Choice }
     *     
     */
    public YieldedOrValueType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldedOrValueType2Choice }
     *     
     */
    public Price11 setTp(YieldedOrValueType2Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmount1Choice }
     *     
     */
    public PriceRateOrAmount1Choice getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmount1Choice }
     *     
     */
    public Price11 setVal(PriceRateOrAmount1Choice value) {
        this.val = value;
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
