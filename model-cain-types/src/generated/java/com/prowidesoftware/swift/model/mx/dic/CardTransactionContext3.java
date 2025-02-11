
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
 * Context in which the card transaction is performed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransactionContext3", propOrder = {
    "txCntxt"
})
public class CardTransactionContext3 {

    @XmlElement(name = "TxCntxt", required = true)
    protected CardTransactionContext4 txCntxt;

    /**
     * Gets the value of the txCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransactionContext4 }
     *     
     */
    public CardTransactionContext4 getTxCntxt() {
        return txCntxt;
    }

    /**
     * Sets the value of the txCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransactionContext4 }
     *     
     */
    public CardTransactionContext3 setTxCntxt(CardTransactionContext4 value) {
        this.txCntxt = value;
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
