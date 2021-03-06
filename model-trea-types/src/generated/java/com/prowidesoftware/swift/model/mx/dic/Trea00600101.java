
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
 * The CancelNonDeliverableForwardValuation message is sent by a participant to a central system or to a counterparty to notify the cancellation of the valuation of a non deliverable trade previously confirmed by the sender.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trea.006.001.01", propOrder = {
    "tradInf",
    "tradgSdId",
    "ctrPtySdId",
    "tradAmts",
    "valtnRate",
    "valtnInf"
})
public class Trea00600101 {

    @XmlElement(name = "TradInf", required = true)
    protected TradeAgreement2 tradInf;
    @XmlElement(name = "TradgSdId")
    protected TradePartyIdentification1 tradgSdId;
    @XmlElement(name = "CtrPtySdId")
    protected TradePartyIdentification1 ctrPtySdId;
    @XmlElement(name = "TradAmts")
    protected AmountsAndValueDate1 tradAmts;
    @XmlElement(name = "ValtnRate")
    protected AgreedRate1 valtnRate;
    @XmlElement(name = "ValtnInf")
    protected ValuationData1 valtnInf;

    /**
     * Gets the value of the tradInf property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAgreement2 }
     *     
     */
    public TradeAgreement2 getTradInf() {
        return tradInf;
    }

    /**
     * Sets the value of the tradInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAgreement2 }
     *     
     */
    public Trea00600101 setTradInf(TradeAgreement2 value) {
        this.tradInf = value;
        return this;
    }

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
    public Trea00600101 setTradgSdId(TradePartyIdentification1 value) {
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
    public Trea00600101 setCtrPtySdId(TradePartyIdentification1 value) {
        this.ctrPtySdId = value;
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
    public Trea00600101 setTradAmts(AmountsAndValueDate1 value) {
        this.tradAmts = value;
        return this;
    }

    /**
     * Gets the value of the valtnRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate1 }
     *     
     */
    public AgreedRate1 getValtnRate() {
        return valtnRate;
    }

    /**
     * Sets the value of the valtnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate1 }
     *     
     */
    public Trea00600101 setValtnRate(AgreedRate1 value) {
        this.valtnRate = value;
        return this;
    }

    /**
     * Gets the value of the valtnInf property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationData1 }
     *     
     */
    public ValuationData1 getValtnInf() {
        return valtnInf;
    }

    /**
     * Sets the value of the valtnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationData1 }
     *     
     */
    public Trea00600101 setValtnInf(ValuationData1 value) {
        this.valtnInf = value;
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
