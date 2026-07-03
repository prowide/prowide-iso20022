
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
 * Currency conversion outcome from the service provider.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCurrencyConversionResponse2", propOrder = {
    "envt",
    "tx",
    "ccyConvs"
})
public class AcceptorCurrencyConversionResponse2 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment33 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction38 tx;
    @XmlElement(name = "CcyConvs", required = true)
    protected CurrencyConversion3 ccyConvs;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment33 }
     *     
     */
    public CardPaymentEnvironment33 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment33 }
     *     
     */
    public AcceptorCurrencyConversionResponse2 setEnvt(CardPaymentEnvironment33 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction38 }
     *     
     */
    public CardPaymentTransaction38 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction38 }
     *     
     */
    public AcceptorCurrencyConversionResponse2 setTx(CardPaymentTransaction38 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion3 }
     *     
     */
    public CurrencyConversion3 getCcyConvs() {
        return ccyConvs;
    }

    /**
     * Sets the value of the ccyConvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion3 }
     *     
     */
    public AcceptorCurrencyConversionResponse2 setCcyConvs(CurrencyConversion3 value) {
        this.ccyConvs = value;
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
