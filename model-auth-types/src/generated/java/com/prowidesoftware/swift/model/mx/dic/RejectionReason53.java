
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "RejectionReason53", propOrder = {
    "txId",
    "sts",
    "dtldVldtnRule"
})
public class RejectionReason53 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification3Choice txId;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected ReportingMessageStatus1Code sts;
    @XmlElement(name = "DtldVldtnRule")
    protected List<GenericValidationRuleIdentification1> dtldVldtnRule;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification3Choice }
     *     
     */
    public TransactionIdentification3Choice getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification3Choice }
     *     
     */
    public RejectionReason53 setTxId(TransactionIdentification3Choice value) {
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
    public RejectionReason53 setSts(ReportingMessageStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the dtldVldtnRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtldVldtnRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtldVldtnRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericValidationRuleIdentification1 }
     * 
     * 
     */
    public List<GenericValidationRuleIdentification1> getDtldVldtnRule() {
        if (dtldVldtnRule == null) {
            dtldVldtnRule = new ArrayList<GenericValidationRuleIdentification1>();
        }
        return this.dtldVldtnRule;
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

    /**
     * Adds a new item to the dtldVldtnRule list.
     * @see #getDtldVldtnRule()
     * 
     */
    public RejectionReason53 addDtldVldtnRule(GenericValidationRuleIdentification1 dtldVldtnRule) {
        getDtldVldtnRule().add(dtldVldtnRule);
        return this;
    }

}
