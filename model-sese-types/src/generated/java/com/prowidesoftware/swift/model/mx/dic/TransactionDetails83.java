
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
@XmlType(name = "TransactionDetails83", propOrder = {
    "finInstrmId",
    "tradDt",
    "sttlmDt",
    "sttlmQty",
    "sttlmAmt",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "invstr"
})
public class TransactionDetails83 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "TradDt")
    protected TradeDate6Choice tradDt;
    @XmlElement(name = "SttlmDt", required = true)
    protected SettlementDate12Choice sttlmDt;
    @XmlElement(name = "SttlmQty", required = true)
    protected Quantity10Choice sttlmQty;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection67 sttlmAmt;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties49 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties49 rcvgSttlmPties;
    @XmlElement(name = "Invstr")
    protected PartyIdentification110 invstr;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public TransactionDetails83 setFinInstrmId(SecurityIdentification20 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate6Choice }
     *     
     */
    public TradeDate6Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate6Choice }
     *     
     */
    public TransactionDetails83 setTradDt(TradeDate6Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate12Choice }
     *     
     */
    public SettlementDate12Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate12Choice }
     *     
     */
    public TransactionDetails83 setSttlmDt(SettlementDate12Choice value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity10Choice }
     *     
     */
    public Quantity10Choice getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity10Choice }
     *     
     */
    public TransactionDetails83 setSttlmQty(Quantity10Choice value) {
        this.sttlmQty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection67 }
     *     
     */
    public AmountAndDirection67 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection67 }
     *     
     */
    public TransactionDetails83 setSttlmAmt(AmountAndDirection67 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties49 }
     *     
     */
    public SettlementParties49 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties49 }
     *     
     */
    public TransactionDetails83 setDlvrgSttlmPties(SettlementParties49 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties49 }
     *     
     */
    public SettlementParties49 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties49 }
     *     
     */
    public TransactionDetails83 setRcvgSttlmPties(SettlementParties49 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the invstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification110 }
     *     
     */
    public PartyIdentification110 getInvstr() {
        return invstr;
    }

    /**
     * Sets the value of the invstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification110 }
     *     
     */
    public TransactionDetails83 setInvstr(PartyIdentification110 value) {
        this.invstr = value;
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
