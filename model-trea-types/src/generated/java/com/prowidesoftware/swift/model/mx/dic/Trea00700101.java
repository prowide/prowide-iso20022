
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
 * The NonDeliverableForwardNotification message is sent by a central system to a participant to provide details of a non deliverable forward trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trea.007.001.01", propOrder = {
    "tradgSdId",
    "ctrPtySdId",
    "opngData",
    "valtnData",
    "tradInfAndSts",
    "sttlmData"
})
public class Trea00700101 {

    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification1 tradgSdId;
    @XmlElement(name = "CtrPtySdId", required = true)
    protected TradePartyIdentification1 ctrPtySdId;
    @XmlElement(name = "OpngData")
    protected OpeningData1 opngData;
    @XmlElement(name = "ValtnData")
    protected ClosingData1 valtnData;
    @XmlElement(name = "TradInfAndSts", required = true)
    protected TradeStatus1 tradInfAndSts;
    @XmlElement(name = "SttlmData")
    protected SettlementData1 sttlmData;

    /**
     * Gets the value of the tradgSdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification1 }
     *     
     */
    public TradePartyIdentification1 getTradgSdId() {
        return tradgSdId;
    }

    /**
     * Sets the value of the tradgSdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification1 }
     *     
     */
    public Trea00700101 setTradgSdId(TradePartyIdentification1 value) {
        this.tradgSdId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification1 }
     *     
     */
    public TradePartyIdentification1 getCtrPtySdId() {
        return ctrPtySdId;
    }

    /**
     * Sets the value of the ctrPtySdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification1 }
     *     
     */
    public Trea00700101 setCtrPtySdId(TradePartyIdentification1 value) {
        this.ctrPtySdId = value;
        return this;
    }

    /**
     * Gets the value of the opngData property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningData1 }
     *     
     */
    public OpeningData1 getOpngData() {
        return opngData;
    }

    /**
     * Sets the value of the opngData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningData1 }
     *     
     */
    public Trea00700101 setOpngData(OpeningData1 value) {
        this.opngData = value;
        return this;
    }

    /**
     * Gets the value of the valtnData property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingData1 }
     *     
     */
    public ClosingData1 getValtnData() {
        return valtnData;
    }

    /**
     * Sets the value of the valtnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingData1 }
     *     
     */
    public Trea00700101 setValtnData(ClosingData1 value) {
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
    public Trea00700101 setTradInfAndSts(TradeStatus1 value) {
        this.tradInfAndSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmData property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementData1 }
     *     
     */
    public SettlementData1 getSttlmData() {
        return sttlmData;
    }

    /**
     * Sets the value of the sttlmData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementData1 }
     *     
     */
    public Trea00700101 setSttlmData(SettlementData1 value) {
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
