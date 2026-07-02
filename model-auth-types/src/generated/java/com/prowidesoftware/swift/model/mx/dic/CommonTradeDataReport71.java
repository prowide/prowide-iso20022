
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
 * Information related to contract and transaction details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonTradeDataReport71", propOrder = {
    "ctrctData",
    "txData"
})
public class CommonTradeDataReport71 {

    @XmlElement(name = "CtrctData")
    protected ContractType15 ctrctData;
    @XmlElement(name = "TxData", required = true)
    protected TradeTransaction50 txData;

    /**
     * Gets the value of the ctrctData property.
     * 
     * @return
     *     possible object is
     *     {@link ContractType15 }
     *     
     */
    public ContractType15 getCtrctData() {
        return ctrctData;
    }

    /**
     * Sets the value of the ctrctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType15 }
     *     
     */
    public CommonTradeDataReport71 setCtrctData(ContractType15 value) {
        this.ctrctData = value;
        return this;
    }

    /**
     * Gets the value of the txData property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransaction50 }
     *     
     */
    public TradeTransaction50 getTxData() {
        return txData;
    }

    /**
     * Sets the value of the txData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransaction50 }
     *     
     */
    public CommonTradeDataReport71 setTxData(TradeTransaction50 value) {
        this.txData = value;
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
