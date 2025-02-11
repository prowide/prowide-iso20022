
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
 * Data specific to cash and related fields used as a collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashCompare1", propOrder = {
    "val",
    "hrcutOrMrgn"
})
public class CashCompare1 {

    @XmlElement(name = "Val", required = true)
    protected CompareAmountAndDirection1 val;
    @XmlElement(name = "HrcutOrMrgn", required = true)
    protected ComparePercentageRate2 hrcutOrMrgn;

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection1 }
     *     
     */
    public CompareAmountAndDirection1 getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection1 }
     *     
     */
    public CashCompare1 setVal(CompareAmountAndDirection1 value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the hrcutOrMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate2 }
     *     
     */
    public ComparePercentageRate2 getHrcutOrMrgn() {
        return hrcutOrMrgn;
    }

    /**
     * Sets the value of the hrcutOrMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate2 }
     *     
     */
    public CashCompare1 setHrcutOrMrgn(ComparePercentageRate2 value) {
        this.hrcutOrMrgn = value;
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
