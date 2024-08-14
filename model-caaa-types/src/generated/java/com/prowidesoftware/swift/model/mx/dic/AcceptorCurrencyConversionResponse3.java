
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
 * Currency conversion outcome from the service provider.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCurrencyConversionResponse3", propOrder = {
    "envt",
    "tx",
    "ccyConvsRslt"
})
public class AcceptorCurrencyConversionResponse3 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment46 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction53 tx;
    @XmlElement(name = "CcyConvsRslt", required = true)
    protected CurrencyConversion7 ccyConvsRslt;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment46 }
     *     
     */
    public CardPaymentEnvironment46 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment46 }
     *     
     */
    public AcceptorCurrencyConversionResponse3 setEnvt(CardPaymentEnvironment46 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction53 }
     *     
     */
    public CardPaymentTransaction53 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction53 }
     *     
     */
    public AcceptorCurrencyConversionResponse3 setTx(CardPaymentTransaction53 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvsRslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion7 }
     *     
     */
    public CurrencyConversion7 getCcyConvsRslt() {
        return ccyConvsRslt;
    }

    /**
     * Sets the value of the ccyConvsRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion7 }
     *     
     */
    public AcceptorCurrencyConversionResponse3 setCcyConvsRslt(CurrencyConversion7 value) {
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
