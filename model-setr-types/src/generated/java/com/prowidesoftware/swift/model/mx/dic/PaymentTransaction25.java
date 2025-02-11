
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
 * Payment processes required to transfer cash from the debtor to the creditor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction25", propOrder = {
    "cshInOrOut"
})
public class PaymentTransaction25 {

    @XmlElement(name = "CshInOrOut")
    protected CashInOrOut5Choice cshInOrOut;

    /**
     * Gets the value of the cshInOrOut property.
     * 
     * @return
     *     possible object is
     *     {@link CashInOrOut5Choice }
     *     
     */
    public CashInOrOut5Choice getCshInOrOut() {
        return cshInOrOut;
    }

    /**
     * Sets the value of the cshInOrOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashInOrOut5Choice }
     *     
     */
    public PaymentTransaction25 setCshInOrOut(CashInOrOut5Choice value) {
        this.cshInOrOut = value;
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
