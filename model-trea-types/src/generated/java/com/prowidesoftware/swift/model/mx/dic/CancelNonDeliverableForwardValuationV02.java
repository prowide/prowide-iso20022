
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
 * Usage
 * The message will contain a Related Reference to link it to the previously sent notification. It may contain a reason for cancellation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelNonDeliverableForwardValuationV02", propOrder = {
    "tradInf",
    "tradgSdId",
    "ctrPtySdId",
    "tradAmts",
    "valtnRate",
    "valtnInf"
})
public class CancelNonDeliverableForwardValuationV02 {

    @XmlElement(name = "TradInf", required = true)
    protected TradeAgreement2 tradInf;
    @XmlElement(name = "TradgSdId")
    protected TradePartyIdentification3 tradgSdId;
    @XmlElement(name = "CtrPtySdId")
    protected TradePartyIdentification3 ctrPtySdId;
    @XmlElement(name = "TradAmts")
    protected AmountsAndValueDate1 tradAmts;
    @XmlElement(name = "ValtnRate")
    protected AgreedRate1 valtnRate;
    @XmlElement(name = "ValtnInf")
    protected ValuationData2 valtnInf;

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
    public CancelNonDeliverableForwardValuationV02 setTradInf(TradeAgreement2 value) {
        this.tradInf = value;
        return this;
    }

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
    public CancelNonDeliverableForwardValuationV02 setTradgSdId(TradePartyIdentification3 value) {
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
    public CancelNonDeliverableForwardValuationV02 setCtrPtySdId(TradePartyIdentification3 value) {
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
    public CancelNonDeliverableForwardValuationV02 setTradAmts(AmountsAndValueDate1 value) {
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
    public CancelNonDeliverableForwardValuationV02 setValtnRate(AgreedRate1 value) {
        this.valtnRate = value;
        return this;
    }

    /**
     * Gets the value of the valtnInf property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationData2 }
     *     
     */
    public ValuationData2 getValtnInf() {
        return valtnInf;
    }

    /**
     * Sets the value of the valtnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationData2 }
     *     
     */
    public CancelNonDeliverableForwardValuationV02 setValtnInf(ValuationData2 value) {
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
