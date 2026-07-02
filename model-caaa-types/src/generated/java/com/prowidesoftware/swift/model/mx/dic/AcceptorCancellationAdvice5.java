
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
 * Cancellation transaction between an acceptor and an acquirer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCancellationAdvice5", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class AcceptorCancellationAdvice5 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment49 envt;
    @XmlElement(name = "Cntxt")
    protected CardPaymentContext17 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction59 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment49 }
     *     
     */
    public CardPaymentEnvironment49 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment49 }
     *     
     */
    public AcceptorCancellationAdvice5 setEnvt(CardPaymentEnvironment49 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext17 }
     *     
     */
    public CardPaymentContext17 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext17 }
     *     
     */
    public AcceptorCancellationAdvice5 setCntxt(CardPaymentContext17 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction59 }
     *     
     */
    public CardPaymentTransaction59 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction59 }
     *     
     */
    public AcceptorCancellationAdvice5 setTx(CardPaymentTransaction59 value) {
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
