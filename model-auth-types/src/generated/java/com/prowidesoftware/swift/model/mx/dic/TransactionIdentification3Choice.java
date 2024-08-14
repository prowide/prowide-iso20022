
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
 * Provides transaction type and identification information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionIdentification3Choice", propOrder = {
    "tx",
    "mrgnRptg",
    "collReuse"
})
public class TransactionIdentification3Choice {

    @XmlElement(name = "Tx")
    protected TradeTransactionIdentification20 tx;
    @XmlElement(name = "MrgnRptg")
    protected TradeTransactionIdentification16 mrgnRptg;
    @XmlElement(name = "CollReuse")
    protected TradeTransactionIdentification17 collReuse;

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionIdentification20 }
     *     
     */
    public TradeTransactionIdentification20 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionIdentification20 }
     *     
     */
    public TransactionIdentification3Choice setTx(TradeTransactionIdentification20 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the mrgnRptg property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionIdentification16 }
     *     
     */
    public TradeTransactionIdentification16 getMrgnRptg() {
        return mrgnRptg;
    }

    /**
     * Sets the value of the mrgnRptg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionIdentification16 }
     *     
     */
    public TransactionIdentification3Choice setMrgnRptg(TradeTransactionIdentification16 value) {
        this.mrgnRptg = value;
        return this;
    }

    /**
     * Gets the value of the collReuse property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionIdentification17 }
     *     
     */
    public TradeTransactionIdentification17 getCollReuse() {
        return collReuse;
    }

    /**
     * Sets the value of the collReuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionIdentification17 }
     *     
     */
    public TransactionIdentification3Choice setCollReuse(TradeTransactionIdentification17 value) {
        this.collReuse = value;
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
