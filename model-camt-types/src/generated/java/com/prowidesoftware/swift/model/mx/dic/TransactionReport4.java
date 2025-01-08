
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
 * Provides details on the payment transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReport4", propOrder = {
    "pmtId",
    "txOrErr"
})
public class TransactionReport4 {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification5Choice pmtId;
    @XmlElement(name = "TxOrErr", required = true)
    protected TransactionOrError3Choice txOrErr;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification5Choice }
     *     
     */
    public PaymentIdentification5Choice getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification5Choice }
     *     
     */
    public TransactionReport4 setPmtId(PaymentIdentification5Choice value) {
        this.pmtId = value;
        return this;
    }

    /**
     * Gets the value of the txOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionOrError3Choice }
     *     
     */
    public TransactionOrError3Choice getTxOrErr() {
        return txOrErr;
    }

    /**
     * Sets the value of the txOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionOrError3Choice }
     *     
     */
    public TransactionReport4 setTxOrErr(TransactionOrError3Choice value) {
        this.txOrErr = value;
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
