
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
 * Position/transaction reporting under EMIR regulation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReport12Choice", propOrder = {
    "pos",
    "tx"
})
public class TradeReport12Choice {

    @XmlElement(name = "Pos")
    protected TradePositionReport7Choice pos;
    @XmlElement(name = "Tx")
    protected TradeTransactionReport8Choice tx;

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link TradePositionReport7Choice }
     *     
     */
    public TradePositionReport7Choice getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePositionReport7Choice }
     *     
     */
    public TradeReport12Choice setPos(TradePositionReport7Choice value) {
        this.pos = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionReport8Choice }
     *     
     */
    public TradeTransactionReport8Choice getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionReport8Choice }
     *     
     */
    public TradeReport12Choice setTx(TradeTransactionReport8Choice value) {
        this.tx = value;
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
