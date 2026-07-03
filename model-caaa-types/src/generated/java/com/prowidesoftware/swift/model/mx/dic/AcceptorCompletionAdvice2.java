
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
 * Notification to the acquirer of the completion of the card payment at the acceptor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCompletionAdvice2", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class AcceptorCompletionAdvice2 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment10 envt;
    @XmlElement(name = "Cntxt")
    protected CardPaymentContext2 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction13 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment10 }
     *     
     */
    public CardPaymentEnvironment10 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment10 }
     *     
     */
    public AcceptorCompletionAdvice2 setEnvt(CardPaymentEnvironment10 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext2 }
     *     
     */
    public CardPaymentContext2 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext2 }
     *     
     */
    public AcceptorCompletionAdvice2 setCntxt(CardPaymentContext2 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction13 }
     *     
     */
    public CardPaymentTransaction13 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction13 }
     *     
     */
    public AcceptorCompletionAdvice2 setTx(CardPaymentTransaction13 value) {
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
