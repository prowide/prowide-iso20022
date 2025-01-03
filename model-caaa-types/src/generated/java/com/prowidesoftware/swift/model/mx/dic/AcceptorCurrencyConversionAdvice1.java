
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
 * Information related to the currency conversion advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCurrencyConversionAdvice1", propOrder = {
    "envt",
    "tx",
    "ccyConvsRslt"
})
public class AcceptorCurrencyConversionAdvice1 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment65 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction77 tx;
    @XmlElement(name = "CcyConvsRslt")
    protected CurrencyConversion13 ccyConvsRslt;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment65 }
     *     
     */
    public CardPaymentEnvironment65 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment65 }
     *     
     */
    public AcceptorCurrencyConversionAdvice1 setEnvt(CardPaymentEnvironment65 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction77 }
     *     
     */
    public CardPaymentTransaction77 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction77 }
     *     
     */
    public AcceptorCurrencyConversionAdvice1 setTx(CardPaymentTransaction77 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvsRslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion13 }
     *     
     */
    public CurrencyConversion13 getCcyConvsRslt() {
        return ccyConvsRslt;
    }

    /**
     * Sets the value of the ccyConvsRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion13 }
     *     
     */
    public AcceptorCurrencyConversionAdvice1 setCcyConvsRslt(CurrencyConversion13 value) {
        this.ccyConvsRslt = value;
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
