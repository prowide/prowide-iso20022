
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
 * Identifies the details of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDetails94__1", propOrder = {
    "finInstrmId",
    "sttlmQty",
    "sttlmAmt",
    "tradDt",
    "sttlmDt",
    "dlvrgSttlmPties",
    "rcvgSttlmPties"
})
public class TransactionDetails941 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification191 finInstrmId;
    @XmlElement(name = "SttlmQty", required = true)
    protected Quantity6Choice1 sttlmQty;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection511 sttlmAmt;
    @XmlElement(name = "TradDt")
    protected TradeDate5Choice1 tradDt;
    @XmlElement(name = "SttlmDt", required = true)
    protected SettlementDate9Choice1 sttlmDt;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties401 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties401 rcvgSttlmPties;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification191 }
     *     
     */
    public SecurityIdentification191 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification191 }
     *     
     */
    public TransactionDetails941 setFinInstrmId(SecurityIdentification191 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity6Choice1 }
     *     
     */
    public Quantity6Choice1 getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity6Choice1 }
     *     
     */
    public TransactionDetails941 setSttlmQty(Quantity6Choice1 value) {
        this.sttlmQty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection511 }
     *     
     */
    public AmountAndDirection511 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection511 }
     *     
     */
    public TransactionDetails941 setSttlmAmt(AmountAndDirection511 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate5Choice1 }
     *     
     */
    public TradeDate5Choice1 getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate5Choice1 }
     *     
     */
    public TransactionDetails941 setTradDt(TradeDate5Choice1 value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate9Choice1 }
     *     
     */
    public SettlementDate9Choice1 getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate9Choice1 }
     *     
     */
    public TransactionDetails941 setSttlmDt(SettlementDate9Choice1 value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties401 }
     *     
     */
    public SettlementParties401 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties401 }
     *     
     */
    public TransactionDetails941 setDlvrgSttlmPties(SettlementParties401 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties401 }
     *     
     */
    public SettlementParties401 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties401 }
     *     
     */
    public TransactionDetails941 setRcvgSttlmPties(SettlementParties401 value) {
        this.rcvgSttlmPties = value;
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
