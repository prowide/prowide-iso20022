
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
 * The NonDeliverableForwardNotification message is sent by a central system to a participant to provide details of a non deliverable forward trade.
 * Usage
 * The notification is sent by a central settlement system to the two trading parties after it has received create, amend or cancel messages from both. The message may also contain information on the settlement of the trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonDeliverableForwardNotificationV02", propOrder = {
    "tradgSdId",
    "ctrPtySdId",
    "opngData",
    "valtnData",
    "tradInfAndSts",
    "sttlmData"
})
public class NonDeliverableForwardNotificationV02 {

    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification3 tradgSdId;
    @XmlElement(name = "CtrPtySdId", required = true)
    protected TradePartyIdentification3 ctrPtySdId;
    @XmlElement(name = "OpngData")
    protected OpeningData2 opngData;
    @XmlElement(name = "ValtnData")
    protected ClosingData2 valtnData;
    @XmlElement(name = "TradInfAndSts", required = true)
    protected TradeStatus1 tradInfAndSts;
    @XmlElement(name = "SttlmData")
    protected SettlementData2 sttlmData;

    /**
     * Gets the value of the tradgSdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification3 }
     *     
     */
    public TradePartyIdentification3 getTradgSdId() {
        return tradgSdId;
    }

    /**
     * Sets the value of the tradgSdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification3 }
     *     
     */
    public NonDeliverableForwardNotificationV02 setTradgSdId(TradePartyIdentification3 value) {
        this.tradgSdId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification3 }
     *     
     */
    public TradePartyIdentification3 getCtrPtySdId() {
        return ctrPtySdId;
    }

    /**
     * Sets the value of the ctrPtySdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification3 }
     *     
     */
    public NonDeliverableForwardNotificationV02 setCtrPtySdId(TradePartyIdentification3 value) {
        this.ctrPtySdId = value;
        return this;
    }

    /**
     * Gets the value of the opngData property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningData2 }
     *     
     */
    public OpeningData2 getOpngData() {
        return opngData;
    }

    /**
     * Sets the value of the opngData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningData2 }
     *     
     */
    public NonDeliverableForwardNotificationV02 setOpngData(OpeningData2 value) {
        this.opngData = value;
        return this;
    }

    /**
     * Gets the value of the valtnData property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingData2 }
     *     
     */
    public ClosingData2 getValtnData() {
        return valtnData;
    }

    /**
     * Sets the value of the valtnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingData2 }
     *     
     */
    public NonDeliverableForwardNotificationV02 setValtnData(ClosingData2 value) {
        this.valtnData = value;
        return this;
    }

    /**
     * Gets the value of the tradInfAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link TradeStatus1 }
     *     
     */
    public TradeStatus1 getTradInfAndSts() {
        return tradInfAndSts;
    }

    /**
     * Sets the value of the tradInfAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeStatus1 }
     *     
     */
    public NonDeliverableForwardNotificationV02 setTradInfAndSts(TradeStatus1 value) {
        this.tradInfAndSts = value;
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
    public NonDeliverableForwardNotificationV02 setSttlmData(SettlementData2 value) {
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
