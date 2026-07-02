
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
 * Describes the time-out consequences.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeOutResult1", propOrder = {
    "txFutrSts",
    "tmOutEvt"
})
public class TimeOutResult1 {

    @XmlElement(name = "TxFutrSts", required = true)
    protected TransactionStatus2 txFutrSts;
    @XmlElement(name = "TmOutEvt")
    protected TimeOutEvent1 tmOutEvt;

    /**
     * Gets the value of the txFutrSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus2 }
     *     
     */
    public TransactionStatus2 getTxFutrSts() {
        return txFutrSts;
    }

    /**
     * Sets the value of the txFutrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus2 }
     *     
     */
    public TimeOutResult1 setTxFutrSts(TransactionStatus2 value) {
        this.txFutrSts = value;
        return this;
    }

    /**
     * Gets the value of the tmOutEvt property.
     * 
     * @return
     *     possible object is
     *     {@link TimeOutEvent1 }
     *     
     */
    public TimeOutEvent1 getTmOutEvt() {
        return tmOutEvt;
    }

    /**
     * Sets the value of the tmOutEvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeOutEvent1 }
     *     
     */
    public TimeOutResult1 setTmOutEvt(TimeOutEvent1 value) {
        this.tmOutEvt = value;
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
