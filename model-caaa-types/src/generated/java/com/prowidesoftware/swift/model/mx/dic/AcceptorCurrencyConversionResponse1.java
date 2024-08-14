
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Currencey conversion outcome from the service provider.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCurrencyConversionResponse1", propOrder = {
    "envt",
    "tx",
    "txRspn",
    "ccyConvs"
})
public class AcceptorCurrencyConversionResponse1 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment21 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction23 tx;
    @XmlElement(name = "TxRspn", required = true)
    @XmlSchemaType(name = "string")
    protected Response1Code txRspn;
    @XmlElement(name = "CcyConvs", required = true)
    protected CurrencyConversion1 ccyConvs;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment21 }
     *     
     */
    public CardPaymentEnvironment21 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment21 }
     *     
     */
    public AcceptorCurrencyConversionResponse1 setEnvt(CardPaymentEnvironment21 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction23 }
     *     
     */
    public CardPaymentTransaction23 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction23 }
     *     
     */
    public AcceptorCurrencyConversionResponse1 setTx(CardPaymentTransaction23 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link Response1Code }
     *     
     */
    public Response1Code getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response1Code }
     *     
     */
    public AcceptorCurrencyConversionResponse1 setTxRspn(Response1Code value) {
        this.txRspn = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion1 }
     *     
     */
    public CurrencyConversion1 getCcyConvs() {
        return ccyConvs;
    }

    /**
     * Sets the value of the ccyConvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion1 }
     *     
     */
    public AcceptorCurrencyConversionResponse1 setCcyConvs(CurrencyConversion1 value) {
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
