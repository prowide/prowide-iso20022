
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
 * Choice between a type of discount or a type of charge.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountOrChargeType1Choice", propOrder = {
    "chrgTp",
    "dscntTp"
})
public class DiscountOrChargeType1Choice {

    @XmlElement(name = "ChrgTp")
    protected ChargeTypeFormat3Choice chrgTp;
    @XmlElement(name = "DscntTp")
    protected DiscountTypeFormat1Choice dscntTp;

    /**
     * Gets the value of the chrgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeTypeFormat3Choice }
     *     
     */
    public ChargeTypeFormat3Choice getChrgTp() {
        return chrgTp;
    }

    /**
     * Sets the value of the chrgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeTypeFormat3Choice }
     *     
     */
    public DiscountOrChargeType1Choice setChrgTp(ChargeTypeFormat3Choice value) {
        this.chrgTp = value;
        return this;
    }

    /**
     * Gets the value of the dscntTp property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountTypeFormat1Choice }
     *     
     */
    public DiscountTypeFormat1Choice getDscntTp() {
        return dscntTp;
    }

    /**
     * Sets the value of the dscntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountTypeFormat1Choice }
     *     
     */
    public DiscountOrChargeType1Choice setDscntTp(DiscountTypeFormat1Choice value) {
        this.dscntTp = value;
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
