
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
 * Reconciliation request from an acceptor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorReconciliationRequest1", propOrder = {
    "envt",
    "tx"
})
public class AcceptorReconciliationRequest1 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment7 envt;
    @XmlElement(name = "Tx", required = true)
    protected TransactionReconciliation1 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment7 }
     *     
     */
    public CardPaymentEnvironment7 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment7 }
     *     
     */
    public AcceptorReconciliationRequest1 setEnvt(CardPaymentEnvironment7 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReconciliation1 }
     *     
     */
    public TransactionReconciliation1 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReconciliation1 }
     *     
     */
    public AcceptorReconciliationRequest1 setTx(TransactionReconciliation1 value) {
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
