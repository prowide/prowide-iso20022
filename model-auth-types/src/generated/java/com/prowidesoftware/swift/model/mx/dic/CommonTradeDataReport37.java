
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
@XmlType(name = "CommonTradeDataReport37", propOrder = {
    "ctrctData",
    "txData",
    "actnTpDtls"
})
public class CommonTradeDataReport37 {

    @XmlElement(name = "CtrctData")
    protected ContractType8 ctrctData;
    @XmlElement(name = "TxData", required = true)
    protected TradeTransaction25 txData;
    @XmlElement(name = "ActnTpDtls")
    protected String actnTpDtls;

    /**
     * Gets the value of the ctrctData property.
     * 
     * @return
     *     possible object is
     *     {@link ContractType8 }
     *     
     */
    public ContractType8 getCtrctData() {
        return ctrctData;
    }

    /**
     * Sets the value of the ctrctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType8 }
     *     
     */
    public CommonTradeDataReport37 setCtrctData(ContractType8 value) {
        this.ctrctData = value;
        return this;
    }

    /**
     * Gets the value of the txData property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransaction25 }
     *     
     */
    public TradeTransaction25 getTxData() {
        return txData;
    }

    /**
     * Sets the value of the txData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransaction25 }
     *     
     */
    public CommonTradeDataReport37 setTxData(TradeTransaction25 value) {
        this.txData = value;
        return this;
    }

    /**
     * Gets the value of the actnTpDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActnTpDtls() {
        return actnTpDtls;
    }

    /**
     * Sets the value of the actnTpDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommonTradeDataReport37 setActnTpDtls(String value) {
        this.actnTpDtls = value;
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
