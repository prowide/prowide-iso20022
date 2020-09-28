
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
 * This message is only suitable for Simple (i.e. not Barrier) Vanilla (i.e. not Binary, Digital, Notouch) Foreign Exchange Options.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trea.011.001.01", propOrder = {
    "tradInf",
    "tradgSdId",
    "ctrPtySdId",
    "optn"
})
public class Trea01100101 {

    @XmlElement(name = "TradInf", required = true)
    protected TradeAgreement2 tradInf;
    @XmlElement(name = "TradgSdId")
    protected TradePartyIdentification2 tradgSdId;
    @XmlElement(name = "CtrPtySdId")
    protected TradePartyIdentification2 ctrPtySdId;
    @XmlElement(name = "Optn")
    protected Option2 optn;

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
    public Trea01100101 setTradInf(TradeAgreement2 value) {
        this.tradInf = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification2 }
     *     
     */
    public TradePartyIdentification2 getTradgSdId() {
        return tradgSdId;
    }

    /**
     * Sets the value of the tradgSdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification2 }
     *     
     */
    public Trea01100101 setTradgSdId(TradePartyIdentification2 value) {
        this.tradgSdId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification2 }
     *     
     */
    public TradePartyIdentification2 getCtrPtySdId() {
        return ctrPtySdId;
    }

    /**
     * Sets the value of the ctrPtySdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification2 }
     *     
     */
    public Trea01100101 setCtrPtySdId(TradePartyIdentification2 value) {
        this.ctrPtySdId = value;
        return this;
    }

    /**
     * Gets the value of the optn property.
     * 
     * @return
     *     possible object is
     *     {@link Option2 }
     *     
     */
    public Option2 getOptn() {
        return optn;
    }

    /**
     * Sets the value of the optn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Option2 }
     *     
     */
    public Trea01100101 setOptn(Option2 value) {
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
