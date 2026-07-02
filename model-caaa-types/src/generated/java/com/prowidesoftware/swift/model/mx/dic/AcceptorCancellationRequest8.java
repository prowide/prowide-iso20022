
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
 * Cancellation request from an acceptor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCancellationRequest8", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class AcceptorCancellationRequest8 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment68 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext27 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction82 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment68 }
     *     
     */
    public CardPaymentEnvironment68 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment68 }
     *     
     */
    public AcceptorCancellationRequest8 setEnvt(CardPaymentEnvironment68 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext27 }
     *     
     */
    public CardPaymentContext27 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext27 }
     *     
     */
    public AcceptorCancellationRequest8 setCntxt(CardPaymentContext27 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction82 }
     *     
     */
    public CardPaymentTransaction82 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction82 }
     *     
     */
    public AcceptorCancellationRequest8 setTx(CardPaymentTransaction82 value) {
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
