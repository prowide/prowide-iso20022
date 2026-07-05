
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
 * Scope
 * The ForeignExchangeTradeStatusAndDetails message is sent by a central system to the participant to provide notification of the status and details of a foreign exchange trade.
 * Usage
 * The notification is sent by a central settlement system to the two trading parties after it has received foreign exchange trade instructions from both.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeStatusAndDetailsNotificationV01", propOrder = {
    "stsDtls",
    "tradInf",
    "tradgSdId",
    "cntrPtySdId",
    "tradAmts",
    "agrdRate",
    "tradgSdSttlmInstrs",
    "cntrPtySdSttlmInstrs",
    "gnlInf"
})
public class ForeignExchangeTradeStatusAndDetailsNotificationV01 {

    @XmlElement(name = "StsDtls", required = true)
    protected TradeData3 stsDtls;
    @XmlElement(name = "TradInf", required = true)
    protected TradeAgreement5 tradInf;
    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification5 tradgSdId;
    @XmlElement(name = "CntrPtySdId", required = true)
    protected TradePartyIdentification5 cntrPtySdId;
    @XmlElement(name = "TradAmts", required = true)
    protected AmountsAndValueDate1 tradAmts;
    @XmlElement(name = "AgrdRate", required = true)
    protected AgreedRate1 agrdRate;
    @XmlElement(name = "TradgSdSttlmInstrs")
    protected SettlementParties9 tradgSdSttlmInstrs;
    @XmlElement(name = "CntrPtySdSttlmInstrs")
    protected SettlementParties9 cntrPtySdSttlmInstrs;
    @XmlElement(name = "GnlInf")
    protected GeneralInformation2 gnlInf;

    /**
     * Gets the value of the stsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData3 }
     *     
     */
    public TradeData3 getStsDtls() {
        return stsDtls;
    }

    /**
     * Sets the value of the stsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData3 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV01 setStsDtls(TradeData3 value) {
        this.stsDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradInf property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAgreement5 }
     *     
     */
    public TradeAgreement5 getTradInf() {
        return tradInf;
    }

    /**
     * Sets the value of the tradInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAgreement5 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV01 setTradInf(TradeAgreement5 value) {
        this.tradInf = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification5 }
     *     
     */
    public TradePartyIdentification5 getTradgSdId() {
        return tradgSdId;
    }

    /**
     * Sets the value of the tradgSdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification5 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV01 setTradgSdId(TradePartyIdentification5 value) {
        this.tradgSdId = value;
        return this;
    }

    /**
     * Gets the value of the cntrPtySdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification5 }
     *     
     */
    public TradePartyIdentification5 getCntrPtySdId() {
        return cntrPtySdId;
    }

    /**
     * Sets the value of the cntrPtySdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification5 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV01 setCntrPtySdId(TradePartyIdentification5 value) {
        this.cntrPtySdId = value;
        return this;
    }

    /**
     * Gets the value of the tradAmts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsAndValueDate1 }
     *     
     */
    public AmountsAndValueDate1 getTradAmts() {
        return tradAmts;
    }

    /**
     * Sets the value of the tradAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsAndValueDate1 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV01 setTradAmts(AmountsAndValueDate1 value) {
        this.tradAmts = value;
        return this;
    }

    /**
     * Gets the value of the agrdRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate1 }
     *     
     */
    public AgreedRate1 getAgrdRate() {
        return agrdRate;
    }

    /**
     * Sets the value of the agrdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate1 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV01 setAgrdRate(AgreedRate1 value) {
        this.agrdRate = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdSttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties9 }
     *     
     */
    public SettlementParties9 getTradgSdSttlmInstrs() {
        return tradgSdSttlmInstrs;
    }

    /**
     * Sets the value of the tradgSdSttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties9 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV01 setTradgSdSttlmInstrs(SettlementParties9 value) {
        this.tradgSdSttlmInstrs = value;
        return this;
    }

    /**
     * Gets the value of the cntrPtySdSttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties9 }
     *     
     */
    public SettlementParties9 getCntrPtySdSttlmInstrs() {
        return cntrPtySdSttlmInstrs;
    }

    /**
     * Sets the value of the cntrPtySdSttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties9 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV01 setCntrPtySdSttlmInstrs(SettlementParties9 value) {
        this.cntrPtySdSttlmInstrs = value;
        return this;
    }

    /**
     * Gets the value of the gnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInformation2 }
     *     
     */
    public GeneralInformation2 getGnlInf() {
        return gnlInf;
    }

    /**
     * Sets the value of the gnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInformation2 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV01 setGnlInf(GeneralInformation2 value) {
        this.gnlInf = value;
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
