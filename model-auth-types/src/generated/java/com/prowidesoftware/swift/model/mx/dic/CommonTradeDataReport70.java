
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
 * Information related to contract and transaction details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonTradeDataReport70", propOrder = {
    "ctrctData",
    "txData",
    "ctrctMod"
})
public class CommonTradeDataReport70 {

    @XmlElement(name = "CtrctData")
    protected ContractType14 ctrctData;
    @XmlElement(name = "TxData", required = true)
    protected TradeTransaction49 txData;
    @XmlElement(name = "CtrctMod")
    protected ContractModification9 ctrctMod;

    /**
     * Gets the value of the ctrctData property.
     * 
     * @return
     *     possible object is
     *     {@link ContractType14 }
     *     
     */
    public ContractType14 getCtrctData() {
        return ctrctData;
    }

    /**
     * Sets the value of the ctrctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType14 }
     *     
     */
    public CommonTradeDataReport70 setCtrctData(ContractType14 value) {
        this.ctrctData = value;
        return this;
    }

    /**
     * Gets the value of the txData property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransaction49 }
     *     
     */
    public TradeTransaction49 getTxData() {
        return txData;
    }

    /**
     * Sets the value of the txData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransaction49 }
     *     
     */
    public CommonTradeDataReport70 setTxData(TradeTransaction49 value) {
        this.txData = value;
        return this;
    }

    /**
     * Gets the value of the ctrctMod property.
     * 
     * @return
     *     possible object is
     *     {@link ContractModification9 }
     *     
     */
    public ContractModification9 getCtrctMod() {
        return ctrctMod;
    }

    /**
     * Sets the value of the ctrctMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractModification9 }
     *     
     */
    public CommonTradeDataReport70 setCtrctMod(ContractModification9 value) {
        this.ctrctMod = value;
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
