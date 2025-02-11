
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
 * Cancellation request from an acceptor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCancellationRequest6", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class AcceptorCancellationRequest6 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment59 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext22 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction74 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment59 }
     *     
     */
    public CardPaymentEnvironment59 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment59 }
     *     
     */
    public AcceptorCancellationRequest6 setEnvt(CardPaymentEnvironment59 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext22 }
     *     
     */
    public CardPaymentContext22 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext22 }
     *     
     */
    public AcceptorCancellationRequest6 setCntxt(CardPaymentContext22 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction74 }
     *     
     */
    public CardPaymentTransaction74 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction74 }
     *     
     */
    public AcceptorCancellationRequest6 setTx(CardPaymentTransaction74 value) {
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
