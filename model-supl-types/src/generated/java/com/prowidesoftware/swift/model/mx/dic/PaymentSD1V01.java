
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
 * Supplementary data for payment message definitions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSD1V01", propOrder = {
    "cardRmtInf"
})
public class PaymentSD1V01 {

    @XmlElement(name = "CardRmtInf", required = true)
    protected TransactionData1 cardRmtInf;

    /**
     * Gets the value of the cardRmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionData1 }
     *     
     */
    public TransactionData1 getCardRmtInf() {
        return cardRmtInf;
    }

    /**
     * Sets the value of the cardRmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionData1 }
     *     
     */
    public PaymentSD1V01 setCardRmtInf(TransactionData1 value) {
        this.cardRmtInf = value;
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
