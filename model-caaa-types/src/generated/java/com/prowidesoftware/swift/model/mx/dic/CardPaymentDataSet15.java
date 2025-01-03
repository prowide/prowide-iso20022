
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
 * Transaction for whose batch capture has been rejected.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentDataSet15", propOrder = {
    "txSeqCntr",
    "txRspn",
    "envt",
    "tx"
})
public class CardPaymentDataSet15 {

    @XmlElement(name = "TxSeqCntr", required = true)
    protected String txSeqCntr;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType1 txRspn;
    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment46 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransactionAdviceResponse5 tx;

    /**
     * Gets the value of the txSeqCntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxSeqCntr() {
        return txSeqCntr;
    }

    /**
     * Sets the value of the txSeqCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentDataSet15 setTxSeqCntr(String value) {
        this.txSeqCntr = value;
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
    public CardPaymentDataSet15 setTxRspn(ResponseType1 value) {
        this.txRspn = value;
        return this;
    }

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment46 }
     *     
     */
    public CardPaymentEnvironment46 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment46 }
     *     
     */
    public CardPaymentDataSet15 setEnvt(CardPaymentEnvironment46 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransactionAdviceResponse5 }
     *     
     */
    public CardPaymentTransactionAdviceResponse5 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransactionAdviceResponse5 }
     *     
     */
    public CardPaymentDataSet15 setTx(CardPaymentTransactionAdviceResponse5 value) {
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
