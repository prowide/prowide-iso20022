
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
 * Choice between ways of identifying a payment instruction by its references and business identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentIdentification6Choice", propOrder = {
    "txId",
    "qId",
    "lngBizId",
    "shrtBizId",
    "prtryId"
})
public class PaymentIdentification6Choice {

    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "QId")
    protected QueueTransactionIdentification1 qId;
    @XmlElement(name = "LngBizId")
    protected LongPaymentIdentification2 lngBizId;
    @XmlElement(name = "ShrtBizId")
    protected ShortPaymentIdentification2 shrtBizId;
    @XmlElement(name = "PrtryId")
    protected String prtryId;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentIdentification6Choice setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the qId property.
     * 
     * @return
     *     possible object is
     *     {@link QueueTransactionIdentification1 }
     *     
     */
    public QueueTransactionIdentification1 getQId() {
        return qId;
    }

    /**
     * Sets the value of the qId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueTransactionIdentification1 }
     *     
     */
    public PaymentIdentification6Choice setQId(QueueTransactionIdentification1 value) {
        this.qId = value;
        return this;
    }

    /**
     * Gets the value of the lngBizId property.
     * 
     * @return
     *     possible object is
     *     {@link LongPaymentIdentification2 }
     *     
     */
    public LongPaymentIdentification2 getLngBizId() {
        return lngBizId;
    }

    /**
     * Sets the value of the lngBizId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongPaymentIdentification2 }
     *     
     */
    public PaymentIdentification6Choice setLngBizId(LongPaymentIdentification2 value) {
        this.lngBizId = value;
        return this;
    }

    /**
     * Gets the value of the shrtBizId property.
     * 
     * @return
     *     possible object is
     *     {@link ShortPaymentIdentification2 }
     *     
     */
    public ShortPaymentIdentification2 getShrtBizId() {
        return shrtBizId;
    }

    /**
     * Sets the value of the shrtBizId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortPaymentIdentification2 }
     *     
     */
    public PaymentIdentification6Choice setShrtBizId(ShortPaymentIdentification2 value) {
        this.shrtBizId = value;
        return this;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentIdentification6Choice setPrtryId(String value) {
        this.prtryId = value;
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
