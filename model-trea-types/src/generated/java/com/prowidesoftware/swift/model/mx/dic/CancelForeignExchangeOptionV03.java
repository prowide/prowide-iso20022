
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
 * The CancelForeignExchangeOption message is sent by a participant to a central system or to a counterparty to notify the cancellation of a foreign currency option contract.
 * Usage
 * The message will contain a Related Reference to link it to the previously sent notification. It may contain a reason for cancellation.
 * This message is only suitable for Simple (i.e. not Barrier) Vanilla (i.e. not Binary, Digital, Notouch) Foreign Exchange Options.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelForeignExchangeOptionV03", propOrder = {
    "tradInf",
    "tradgSdId",
    "ctrPtySdId",
    "optn"
})
public class CancelForeignExchangeOptionV03 {

    @XmlElement(name = "TradInf", required = true)
    protected TradeAgreement2 tradInf;
    @XmlElement(name = "TradgSdId")
    protected TradePartyIdentification4 tradgSdId;
    @XmlElement(name = "CtrPtySdId")
    protected TradePartyIdentification4 ctrPtySdId;
    @XmlElement(name = "Optn")
    protected Option5 optn;

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
    public CancelForeignExchangeOptionV03 setTradInf(TradeAgreement2 value) {
        this.tradInf = value;
        return this;
    }

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
    public CancelForeignExchangeOptionV03 setTradgSdId(TradePartyIdentification4 value) {
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
    public CancelForeignExchangeOptionV03 setCtrPtySdId(TradePartyIdentification4 value) {
        this.ctrPtySdId = value;
        return this;
    }

    /**
     * Gets the value of the optn property.
     * 
     * @return
     *     possible object is
     *     {@link Option5 }
     *     
     */
    public Option5 getOptn() {
        return optn;
    }

    /**
     * Sets the value of the optn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Option5 }
     *     
     */
    public CancelForeignExchangeOptionV03 setOptn(Option5 value) {
        this.optn = value;
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
