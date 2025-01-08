
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
 * Scope
 * The ForeignExchangeOptionNotification message is sent by a central system to a participant to provide details of a non deliverable forward trade.
 * Usage
 * The notification is sent by a central settlement system to the two trading parties after it has received Create, Amend or Cancel notifications from both.
 * 
 * This message is obsolete please use ForeignExchangeOptionNotificationV05 - fxtr.012.001.05
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeOptionNotificationV04", propOrder = {
    "tradgSdId",
    "ctrPtySdId",
    "optnData",
    "tradSts",
    "sttlmData"
})
public class ForeignExchangeOptionNotificationV04 {

    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification4 tradgSdId;
    @XmlElement(name = "CtrPtySdId", required = true)
    protected TradePartyIdentification4 ctrPtySdId;
    @XmlElement(name = "OptnData", required = true)
    protected OptionData4 optnData;
    @XmlElement(name = "TradSts", required = true)
    protected TradeStatus1 tradSts;
    @XmlElement(name = "SttlmData")
    protected SettlementData2 sttlmData;

    /**
     * Gets the value of the tradgSdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification4 }
     *     
     */
    public TradePartyIdentification4 getTradgSdId() {
        return tradgSdId;
    }

    /**
     * Sets the value of the tradgSdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification4 }
     *     
     */
    public ForeignExchangeOptionNotificationV04 setTradgSdId(TradePartyIdentification4 value) {
        this.tradgSdId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification4 }
     *     
     */
    public TradePartyIdentification4 getCtrPtySdId() {
        return ctrPtySdId;
    }

    /**
     * Sets the value of the ctrPtySdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification4 }
     *     
     */
    public ForeignExchangeOptionNotificationV04 setCtrPtySdId(TradePartyIdentification4 value) {
        this.ctrPtySdId = value;
        return this;
    }

    /**
     * Gets the value of the optnData property.
     * 
     * @return
     *     possible object is
     *     {@link OptionData4 }
     *     
     */
    public OptionData4 getOptnData() {
        return optnData;
    }

    /**
     * Sets the value of the optnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionData4 }
     *     
     */
    public ForeignExchangeOptionNotificationV04 setOptnData(OptionData4 value) {
        this.optnData = value;
        return this;
    }

    /**
     * Gets the value of the tradSts property.
     * 
     * @return
     *     possible object is
     *     {@link TradeStatus1 }
     *     
     */
    public TradeStatus1 getTradSts() {
        return tradSts;
    }

    /**
     * Sets the value of the tradSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeStatus1 }
     *     
     */
    public ForeignExchangeOptionNotificationV04 setTradSts(TradeStatus1 value) {
        this.tradSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmData property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementData2 }
     *     
     */
    public SettlementData2 getSttlmData() {
        return sttlmData;
    }

    /**
     * Sets the value of the sttlmData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementData2 }
     *     
     */
    public ForeignExchangeOptionNotificationV04 setSttlmData(SettlementData2 value) {
        this.sttlmData = value;
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
