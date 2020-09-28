
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
 * Provides details on the payment transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReport1", propOrder = {
    "pmtId",
    "txOrErr"
})
public class TransactionReport1 {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification4Choice pmtId;
    @XmlElement(name = "TxOrErr", required = true)
    protected TransactionOrError1Choice txOrErr;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification4Choice }
     *     
     */
    public PaymentIdentification4Choice getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification4Choice }
     *     
     */
    public TransactionReport1 setPmtId(PaymentIdentification4Choice value) {
        this.pmtId = value;
        return this;
    }

    /**
     * Gets the value of the txOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionOrError1Choice }
     *     
     */
    public TransactionOrError1Choice getTxOrErr() {
        return txOrErr;
    }

    /**
     * Sets the value of the txOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionOrError1Choice }
     *     
     */
    public TransactionReport1 setTxOrErr(TransactionOrError1Choice value) {
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
