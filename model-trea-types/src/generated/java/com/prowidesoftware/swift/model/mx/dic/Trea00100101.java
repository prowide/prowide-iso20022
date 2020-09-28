
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
 * The CreateNonDeliverableForwardOpening message is sent by a participant to a central system or to a counterparty to notify the opening of a non deliverable trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trea.001.001.01", propOrder = {
    "tradInf",
    "tradgSdId",
    "ctrPtySdId",
    "tradAmts",
    "agrdRate",
    "valtnConds"
})
public class Trea00100101 {

    @XmlElement(name = "TradInf", required = true)
    protected TradeAgreement1 tradInf;
    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification1 tradgSdId;
    @XmlElement(name = "CtrPtySdId", required = true)
    protected TradePartyIdentification1 ctrPtySdId;
    @XmlElement(name = "TradAmts", required = true)
    protected AmountsAndValueDate1 tradAmts;
    @XmlElement(name = "AgrdRate", required = true)
    protected AgreedRate1 agrdRate;
    @XmlElement(name = "ValtnConds", required = true)
    protected NonDeliverableForwardValuationConditions1 valtnConds;

    /**
     * Gets the value of the tradInf property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAgreement1 }
     *     
     */
    public TradeAgreement1 getTradInf() {
        return tradInf;
    }

    /**
     * Sets the value of the tradInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAgreement1 }
     *     
     */
    public Trea00100101 setTradInf(TradeAgreement1 value) {
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
    public Trea00100101 setTradgSdId(TradePartyIdentification1 value) {
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
    public Trea00100101 setCtrPtySdId(TradePartyIdentification1 value) {
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
    public Trea00100101 setTradAmts(AmountsAndValueDate1 value) {
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
    public Trea00100101 setAgrdRate(AgreedRate1 value) {
        this.agrdRate = value;
        return this;
    }

    /**
     * Gets the value of the valtnConds property.
     * 
     * @return
     *     possible object is
     *     {@link NonDeliverableForwardValuationConditions1 }
     *     
     */
    public NonDeliverableForwardValuationConditions1 getValtnConds() {
        return valtnConds;
    }

    /**
     * Sets the value of the valtnConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDeliverableForwardValuationConditions1 }
     *     
     */
    public Trea00100101 setValtnConds(NonDeliverableForwardValuationConditions1 value) {
        this.valtnConds = value;
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
