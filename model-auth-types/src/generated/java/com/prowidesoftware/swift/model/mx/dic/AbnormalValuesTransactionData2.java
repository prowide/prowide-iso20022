
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
 * Detailed information about derivatives that were received on the day of generation of the report with action type ‘New’, ‘Position component’, ‘Modification’ or ‘Correction’ whose notional amount is greater than a threshold for that class of derivatives.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbnormalValuesTransactionData2", propOrder = {
    "txId",
    "ntnlAmt",
    "ntnlQty"
})
public class AbnormalValuesTransactionData2 {

    @XmlElement(name = "TxId", required = true)
    protected TradeTransactionIdentification24 txId;
    @XmlElement(name = "NtnlAmt")
    protected NotionalAmountLegs5 ntnlAmt;
    @XmlElement(name = "NtnlQty")
    protected NotionalQuantityLegs5 ntnlQty;

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
    public AbnormalValuesTransactionData2 setTxId(TradeTransactionIdentification24 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the ntnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmountLegs5 }
     *     
     */
    public NotionalAmountLegs5 getNtnlAmt() {
        return ntnlAmt;
    }

    /**
     * Sets the value of the ntnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmountLegs5 }
     *     
     */
    public AbnormalValuesTransactionData2 setNtnlAmt(NotionalAmountLegs5 value) {
        this.ntnlAmt = value;
        return this;
    }

    /**
     * Gets the value of the ntnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalQuantityLegs5 }
     *     
     */
    public NotionalQuantityLegs5 getNtnlQty() {
        return ntnlQty;
    }

    /**
     * Sets the value of the ntnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalQuantityLegs5 }
     *     
     */
    public AbnormalValuesTransactionData2 setNtnlQty(NotionalQuantityLegs5 value) {
        this.ntnlQty = value;
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
