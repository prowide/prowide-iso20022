
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
 * Information on interest rates related to the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRate6", propOrder = {
    "amt",
    "intrstRate"
})
public class InterestRate6 {

    @XmlElement(name = "Amt", required = true)
    protected AmountAndDirection53 amt;
    @XmlElement(name = "IntrstRate", required = true)
    protected InterestRate27Choice intrstRate;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public InterestRate6 setAmt(AmountAndDirection53 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate27Choice }
     *     
     */
    public InterestRate27Choice getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate27Choice }
     *     
     */
    public InterestRate6 setIntrstRate(InterestRate27Choice value) {
        this.intrstRate = value;
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
