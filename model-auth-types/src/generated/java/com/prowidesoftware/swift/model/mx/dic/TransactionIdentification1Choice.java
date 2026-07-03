
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
 * Provides transaction type and identification information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionIdentification1Choice", propOrder = {
    "tx",
    "mrgnRptg",
    "collReuse"
})
public class TransactionIdentification1Choice {

    @XmlElement(name = "Tx")
    protected TradeTransactionIdentification4 tx;
    @XmlElement(name = "MrgnRptg")
    protected TradeTransactionIdentification8 mrgnRptg;
    @XmlElement(name = "CollReuse")
    protected TradeTransactionIdentification9 collReuse;

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionIdentification4 }
     *     
     */
    public TradeTransactionIdentification4 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionIdentification4 }
     *     
     */
    public TransactionIdentification1Choice setTx(TradeTransactionIdentification4 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the mrgnRptg property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionIdentification8 }
     *     
     */
    public TradeTransactionIdentification8 getMrgnRptg() {
        return mrgnRptg;
    }

    /**
     * Sets the value of the mrgnRptg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionIdentification8 }
     *     
     */
    public TransactionIdentification1Choice setMrgnRptg(TradeTransactionIdentification8 value) {
        this.mrgnRptg = value;
        return this;
    }

    /**
     * Gets the value of the collReuse property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionIdentification9 }
     *     
     */
    public TradeTransactionIdentification9 getCollReuse() {
        return collReuse;
    }

    /**
     * Sets the value of the collReuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionIdentification9 }
     *     
     */
    public TransactionIdentification1Choice setCollReuse(TradeTransactionIdentification9 value) {
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
