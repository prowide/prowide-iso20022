
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
 * Information related to the currency conversion request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCurrencyConversionRequest2", propOrder = {
    "envt",
    "tx"
})
public class AcceptorCurrencyConversionRequest2 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment44 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction49 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment44 }
     *     
     */
    public CardPaymentEnvironment44 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment44 }
     *     
     */
    public AcceptorCurrencyConversionRequest2 setEnvt(CardPaymentEnvironment44 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction49 }
     *     
     */
    public CardPaymentTransaction49 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction49 }
     *     
     */
    public AcceptorCurrencyConversionRequest2 setTx(CardPaymentTransaction49 value) {
        this.tx = value;
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
