
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides reasons of rejecting transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionReason47", propOrder = {
    "txId",
    "sts",
    "dtldVldtnRule"
})
public class RejectionReason47 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification1Choice txId;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected ReportingMessageStatus1Code sts;
    @XmlElement(name = "DtldVldtnRule")
    protected GenericValidationRuleIdentification1 dtldVldtnRule;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification1Choice }
     *     
     */
    public TransactionIdentification1Choice getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification1Choice }
     *     
     */
    public RejectionReason47 setTxId(TransactionIdentification1Choice value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingMessageStatus1Code }
     *     
     */
    public ReportingMessageStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingMessageStatus1Code }
     *     
     */
    public RejectionReason47 setSts(ReportingMessageStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the dtldVldtnRule property.
     * 
     * @return
     *     possible object is
     *     {@link GenericValidationRuleIdentification1 }
     *     
     */
    public GenericValidationRuleIdentification1 getDtldVldtnRule() {
        return dtldVldtnRule;
    }

    /**
     * Sets the value of the dtldVldtnRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericValidationRuleIdentification1 }
     *     
     */
    public RejectionReason47 setDtldVldtnRule(GenericValidationRuleIdentification1 value) {
        this.dtldVldtnRule = value;
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
