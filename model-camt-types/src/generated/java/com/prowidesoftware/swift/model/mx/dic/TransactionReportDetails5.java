
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
 * Reports either on the transaction information or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReportDetails5", propOrder = {
    "instrRef",
    "tx",
    "bizErr"
})
public class TransactionReportDetails5 {

    @XmlElement(name = "InstrRef", required = true)
    protected PaymentIdentification3Choice instrRef;
    @XmlElement(name = "Tx")
    protected Transaction5 tx;
    @XmlElement(name = "BizErr")
    protected ErrorHandling3 bizErr;

    /**
     * Gets the value of the instrRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification3Choice }
     *     
     */
    public PaymentIdentification3Choice getInstrRef() {
        return instrRef;
    }

    /**
     * Sets the value of the instrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification3Choice }
     *     
     */
    public TransactionReportDetails5 setInstrRef(PaymentIdentification3Choice value) {
        this.instrRef = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction5 }
     *     
     */
    public Transaction5 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction5 }
     *     
     */
    public TransactionReportDetails5 setTx(Transaction5 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ErrorHandling3 getBizErr() {
        return bizErr;
    }

    /**
     * Sets the value of the bizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling3 }
     *     
     */
    public TransactionReportDetails5 setBizErr(ErrorHandling3 value) {
        this.bizErr = value;
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
