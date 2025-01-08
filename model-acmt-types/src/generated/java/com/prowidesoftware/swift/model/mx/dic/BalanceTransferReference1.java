
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
 * Reference to enable the receiving account servicer to reconcile the payment with the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceTransferReference1", propOrder = {
    "balTrfRef"
})
public class BalanceTransferReference1 {

    @XmlElement(name = "BalTrfRef", required = true)
    protected String balTrfRef;

    /**
     * Gets the value of the balTrfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalTrfRef() {
        return balTrfRef;
    }

    /**
     * Sets the value of the balTrfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BalanceTransferReference1 setBalTrfRef(String value) {
        this.balTrfRef = value;
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
