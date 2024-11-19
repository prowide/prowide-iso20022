
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
 * Compares information related to both sides of a contract valuation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationMatchingCriteria1", propOrder = {
    "ctrctVal",
    "tp"
})
public class ValuationMatchingCriteria1 {

    @XmlElement(name = "CtrctVal")
    protected CompareAmountAndDirection3 ctrctVal;
    @XmlElement(name = "Tp")
    protected CompareValuationType1 tp;

    /**
     * Gets the value of the ctrctVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public CompareAmountAndDirection3 getCtrctVal() {
        return ctrctVal;
    }

    /**
     * Sets the value of the ctrctVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public ValuationMatchingCriteria1 setCtrctVal(CompareAmountAndDirection3 value) {
        this.ctrctVal = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareValuationType1 }
     *     
     */
    public CompareValuationType1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareValuationType1 }
     *     
     */
    public ValuationMatchingCriteria1 setTp(CompareValuationType1 value) {
        this.tp = value;
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
