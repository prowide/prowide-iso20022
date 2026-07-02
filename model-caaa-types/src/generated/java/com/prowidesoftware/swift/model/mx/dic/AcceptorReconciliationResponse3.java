
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
 * Reconciliation response from the acquirer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorReconciliationResponse3", propOrder = {
    "envt",
    "txRspn",
    "tx"
})
public class AcceptorReconciliationResponse3 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment38 envt;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType1 txRspn;
    @XmlElement(name = "Tx", required = true)
    protected TransactionReconciliation3 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment38 }
     *     
     */
    public CardPaymentEnvironment38 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment38 }
     *     
     */
    public AcceptorReconciliationResponse3 setEnvt(CardPaymentEnvironment38 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType1 }
     *     
     */
    public ResponseType1 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType1 }
     *     
     */
    public AcceptorReconciliationResponse3 setTxRspn(ResponseType1 value) {
        this.txRspn = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReconciliation3 }
     *     
     */
    public TransactionReconciliation3 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReconciliation3 }
     *     
     */
    public AcceptorReconciliationResponse3 setTx(TransactionReconciliation3 value) {
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
