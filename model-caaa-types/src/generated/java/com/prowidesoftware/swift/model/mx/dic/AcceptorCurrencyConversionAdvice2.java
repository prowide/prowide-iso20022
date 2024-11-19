
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
@XmlType(name = "AcceptorCurrencyConversionAdvice2", propOrder = {
    "envt",
    "tx",
    "ccyConvsRslt"
})
public class AcceptorCurrencyConversionAdvice2 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment69 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction77 tx;
    @XmlElement(name = "CcyConvsRslt")
    protected CurrencyConversion15 ccyConvsRslt;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment69 }
     *     
     */
    public CardPaymentEnvironment69 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment69 }
     *     
     */
    public AcceptorCurrencyConversionAdvice2 setEnvt(CardPaymentEnvironment69 value) {
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
    public AcceptorCurrencyConversionAdvice2 setTx(CardPaymentTransaction77 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvsRslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion15 }
     *     
     */
    public CurrencyConversion15 getCcyConvsRslt() {
        return ccyConvsRslt;
    }

    /**
     * Sets the value of the ccyConvsRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion15 }
     *     
     */
    public AcceptorCurrencyConversionAdvice2 setCcyConvsRslt(CurrencyConversion15 value) {
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
