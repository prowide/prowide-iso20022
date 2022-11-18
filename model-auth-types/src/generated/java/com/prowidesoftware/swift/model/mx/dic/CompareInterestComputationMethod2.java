
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
 * Specifies two values to compare for the method used to compute accruing interest of a financial instrument
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompareInterestComputationMethod2", propOrder = {
    "val1",
    "val2"
})
public class CompareInterestComputationMethod2 {

    @XmlElement(name = "Val1")
    protected InterestComputationMethodFormat6Choice val1;
    @XmlElement(name = "Val2")
    protected InterestComputationMethodFormat6Choice val2;

    /**
     * Gets the value of the val1 property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat6Choice }
     *     
     */
    public InterestComputationMethodFormat6Choice getVal1() {
        return val1;
    }

    /**
     * Sets the value of the val1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat6Choice }
     *     
     */
    public CompareInterestComputationMethod2 setVal1(InterestComputationMethodFormat6Choice value) {
        this.val1 = value;
        return this;
    }

    /**
     * Gets the value of the val2 property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat6Choice }
     *     
     */
    public InterestComputationMethodFormat6Choice getVal2() {
        return val2;
    }

    /**
     * Sets the value of the val2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat6Choice }
     *     
     */
    public CompareInterestComputationMethod2 setVal2(InterestComputationMethodFormat6Choice value) {
        this.val2 = value;
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
