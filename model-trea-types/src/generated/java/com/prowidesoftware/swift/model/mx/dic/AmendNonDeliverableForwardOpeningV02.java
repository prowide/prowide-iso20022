
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
 * The AmendNonDeliverableForwardOpening message is sent by a participant to a central system or to a counterparty to notify the amendment of the opening of a non deliverable trade previously confirmed by the sender.
 * Usage
 * The message is sent from a participant to a central settlement system to advise of the update of a previously sent notification and it contains a "Related Reference" to link it to the previous notification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendNonDeliverableForwardOpeningV02", propOrder = {
    "tradInf",
    "tradgSdId",
    "ctrPtySdId",
    "tradAmts",
    "agrdRate",
    "valtnConds"
})
public class AmendNonDeliverableForwardOpeningV02 {

    @XmlElement(name = "TradInf", required = true)
    protected TradeAgreement2 tradInf;
    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification3 tradgSdId;
    @XmlElement(name = "CtrPtySdId", required = true)
    protected TradePartyIdentification3 ctrPtySdId;
    @XmlElement(name = "TradAmts", required = true)
    protected AmountsAndValueDate1 tradAmts;
    @XmlElement(name = "AgrdRate", required = true)
    protected AgreedRate1 agrdRate;
    @XmlElement(name = "ValtnConds", required = true)
    protected NonDeliverableForwardValuationConditions2 valtnConds;

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
    public AmendNonDeliverableForwardOpeningV02 setTradInf(TradeAgreement2 value) {
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
    public AmendNonDeliverableForwardOpeningV02 setTradgSdId(TradePartyIdentification3 value) {
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
    public AmendNonDeliverableForwardOpeningV02 setCtrPtySdId(TradePartyIdentification3 value) {
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
    public AmendNonDeliverableForwardOpeningV02 setTradAmts(AmountsAndValueDate1 value) {
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
    public AmendNonDeliverableForwardOpeningV02 setAgrdRate(AgreedRate1 value) {
        this.agrdRate = value;
        return this;
    }

    /**
     * Gets the value of the valtnConds property.
     * 
     * @return
     *     possible object is
     *     {@link NonDeliverableForwardValuationConditions2 }
     *     
     */
    public NonDeliverableForwardValuationConditions2 getValtnConds() {
        return valtnConds;
    }

    /**
     * Sets the value of the valtnConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDeliverableForwardValuationConditions2 }
     *     
     */
    public AmendNonDeliverableForwardOpeningV02 setValtnConds(NonDeliverableForwardValuationConditions2 value) {
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
