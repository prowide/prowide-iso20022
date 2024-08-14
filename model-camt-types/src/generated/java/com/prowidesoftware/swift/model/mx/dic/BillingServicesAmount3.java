
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
 * Taxable service charge amount conversions to host currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingServicesAmount3", propOrder = {
    "srcAmt",
    "hstAmt"
})
public class BillingServicesAmount3 {

    @XmlElement(name = "SrcAmt", required = true)
    protected AmountAndDirection34 srcAmt;
    @XmlElement(name = "HstAmt", required = true)
    protected AmountAndDirection34 hstAmt;

    /**
     * Gets the value of the srcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getSrcAmt() {
        return srcAmt;
    }

    /**
     * Sets the value of the srcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingServicesAmount3 setSrcAmt(AmountAndDirection34 value) {
        this.srcAmt = value;
        return this;
    }

    /**
     * Gets the value of the hstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getHstAmt() {
        return hstAmt;
    }

    /**
     * Sets the value of the hstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingServicesAmount3 setHstAmt(AmountAndDirection34 value) {
        this.hstAmt = value;
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
