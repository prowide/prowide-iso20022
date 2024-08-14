
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
 * Notification to the acquirer of the completion of the card payment at the acceptor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCompletionAdvice3", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class AcceptorCompletionAdvice3 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment22 envt;
    @XmlElement(name = "Cntxt")
    protected CardPaymentContext6 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction25 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment22 }
     *     
     */
    public CardPaymentEnvironment22 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment22 }
     *     
     */
    public AcceptorCompletionAdvice3 setEnvt(CardPaymentEnvironment22 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext6 }
     *     
     */
    public CardPaymentContext6 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext6 }
     *     
     */
    public AcceptorCompletionAdvice3 setCntxt(CardPaymentContext6 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction25 }
     *     
     */
    public CardPaymentTransaction25 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction25 }
     *     
     */
    public AcceptorCompletionAdvice3 setTx(CardPaymentTransaction25 value) {
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
