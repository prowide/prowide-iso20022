
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
 * The CreateForeignExchangeOption message is sent by a participant to a central system or to a counterparty to confirm a foreign currency option contract.
 * Usage
 * Both trading parties will send a notification to the central settlement system. The central settlement system will then send a ForeignExchangeOptionNotification to both.
 * This message is only suitable for Simple (i.e. not Barrier) Vanilla (i.e. not Binary, Digital, Notouch) Foreign Exchange Options.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateForeignExchangeOptionV03", propOrder = {
    "tradInf",
    "tradgSdId",
    "ctrPtySdId",
    "optn"
})
public class CreateForeignExchangeOptionV03 {

    @XmlElement(name = "TradInf", required = true)
    protected TradeAgreement1 tradInf;
    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification4 tradgSdId;
    @XmlElement(name = "CtrPtySdId", required = true)
    protected TradePartyIdentification4 ctrPtySdId;
    @XmlElement(name = "Optn", required = true)
    protected Option5 optn;

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
    public CreateForeignExchangeOptionV03 setTradInf(TradeAgreement1 value) {
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
    public CreateForeignExchangeOptionV03 setTradgSdId(TradePartyIdentification4 value) {
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
    public CreateForeignExchangeOptionV03 setCtrPtySdId(TradePartyIdentification4 value) {
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
    public CreateForeignExchangeOptionV03 setOptn(Option5 value) {
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
