
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
 * Describes the time-out consequences.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeOutResult2", propOrder = {
    "txFutrSts"
})
public class TimeOutResult2 {

    @XmlElement(name = "TxFutrSts", required = true)
    protected TransactionStatus5 txFutrSts;

    /**
     * Gets the value of the txFutrSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus5 }
     *     
     */
    public TransactionStatus5 getTxFutrSts() {
        return txFutrSts;
    }

    /**
     * Sets the value of the txFutrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus5 }
     *     
     */
    public TimeOutResult2 setTxFutrSts(TransactionStatus5 value) {
        this.txFutrSts = value;
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
