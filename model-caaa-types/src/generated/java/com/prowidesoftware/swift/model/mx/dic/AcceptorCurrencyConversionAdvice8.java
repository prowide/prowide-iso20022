
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
@XmlType(name = "AcceptorCurrencyConversionAdvice8", propOrder = {
    "envt",
    "tx",
    "ccyConvsRslt"
})
public class AcceptorCurrencyConversionAdvice8 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment80 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction137 tx;
    @XmlElement(name = "CcyConvsRslt")
    protected CurrencyConversion30 ccyConvsRslt;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment80 }
     *     
     */
    public CardPaymentEnvironment80 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment80 }
     *     
     */
    public AcceptorCurrencyConversionAdvice8 setEnvt(CardPaymentEnvironment80 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction137 }
     *     
     */
    public CardPaymentTransaction137 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction137 }
     *     
     */
    public AcceptorCurrencyConversionAdvice8 setTx(CardPaymentTransaction137 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvsRslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion30 }
     *     
     */
    public CurrencyConversion30 getCcyConvsRslt() {
        return ccyConvsRslt;
    }

    /**
     * Sets the value of the ccyConvsRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion30 }
     *     
     */
    public AcceptorCurrencyConversionAdvice8 setCcyConvsRslt(CurrencyConversion30 value) {
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
