
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
 * Choice between ways of identifying a payment instruction by its references and business identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentIdentification5Choice", propOrder = {
    "txId",
    "qId",
    "lngBizId",
    "shrtBizId",
    "prtryId"
})
public class PaymentIdentification5Choice {

    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "QId")
    protected QueueTransactionIdentification1 qId;
    @XmlElement(name = "LngBizId")
    protected LongPaymentIdentification1 lngBizId;
    @XmlElement(name = "ShrtBizId")
    protected ShortPaymentIdentification1 shrtBizId;
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
    public PaymentIdentification5Choice setTxId(String value) {
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
    public PaymentIdentification5Choice setQId(QueueTransactionIdentification1 value) {
        this.qId = value;
        return this;
    }

    /**
     * Gets the value of the lngBizId property.
     * 
     * @return
     *     possible object is
     *     {@link LongPaymentIdentification1 }
     *     
     */
    public LongPaymentIdentification1 getLngBizId() {
        return lngBizId;
    }

    /**
     * Sets the value of the lngBizId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongPaymentIdentification1 }
     *     
     */
    public PaymentIdentification5Choice setLngBizId(LongPaymentIdentification1 value) {
        this.lngBizId = value;
        return this;
    }

    /**
     * Gets the value of the shrtBizId property.
     * 
     * @return
     *     possible object is
     *     {@link ShortPaymentIdentification1 }
     *     
     */
    public ShortPaymentIdentification1 getShrtBizId() {
        return shrtBizId;
    }

    /**
     * Sets the value of the shrtBizId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortPaymentIdentification1 }
     *     
     */
    public PaymentIdentification5Choice setShrtBizId(ShortPaymentIdentification1 value) {
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
    public PaymentIdentification5Choice setPrtryId(String value) {
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
