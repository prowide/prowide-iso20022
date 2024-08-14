
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
 * Authorisation request from an acceptor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorAuthorisationRequest1", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class AcceptorAuthorisationRequest1 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment1 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext1 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction1 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment1 }
     *     
     */
    public CardPaymentEnvironment1 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment1 }
     *     
     */
    public AcceptorAuthorisationRequest1 setEnvt(CardPaymentEnvironment1 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext1 }
     *     
     */
    public CardPaymentContext1 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext1 }
     *     
     */
    public AcceptorAuthorisationRequest1 setCntxt(CardPaymentContext1 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction1 }
     *     
     */
    public CardPaymentTransaction1 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction1 }
     *     
     */
    public AcceptorAuthorisationRequest1 setTx(CardPaymentTransaction1 value) {
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
