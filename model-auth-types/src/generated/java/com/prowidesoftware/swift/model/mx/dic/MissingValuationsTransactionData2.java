
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
 * Detailed information about the outstanding derivatives for which no valuation or outdated valuation has been reported.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingValuationsTransactionData2", propOrder = {
    "txId",
    "valtnAmt",
    "valtnTmStmp"
})
public class MissingValuationsTransactionData2 {

    @XmlElement(name = "TxId", required = true)
    protected TradeTransactionIdentification24 txId;
    @XmlElement(name = "ValtnAmt")
    protected AmountAndDirection106 valtnAmt;
    @XmlElement(name = "ValtnTmStmp")
    protected DateAndDateTime2Choice valtnTmStmp;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionIdentification24 }
     *     
     */
    public TradeTransactionIdentification24 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionIdentification24 }
     *     
     */
    public MissingValuationsTransactionData2 setTxId(TradeTransactionIdentification24 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the valtnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public AmountAndDirection106 getValtnAmt() {
        return valtnAmt;
    }

    /**
     * Sets the value of the valtnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public MissingValuationsTransactionData2 setValtnAmt(AmountAndDirection106 value) {
        this.valtnAmt = value;
        return this;
    }

    /**
     * Gets the value of the valtnTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValtnTmStmp() {
        return valtnTmStmp;
    }

    /**
     * Sets the value of the valtnTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public MissingValuationsTransactionData2 setValtnTmStmp(DateAndDateTime2Choice value) {
        this.valtnTmStmp = value;
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
