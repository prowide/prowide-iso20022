
package com.prowidesoftware.swift.model.mx.dic;

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
@XmlType(name = "RejectionReason45", propOrder = {
    "msgRptId",
    "sts",
    "dtldVldtnRule"
})
public class RejectionReason45 {

    @XmlElement(name = "MsgRptId", required = true)
    protected String msgRptId;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected ReportingMessageStatus1Code sts;
    @XmlElement(name = "DtldVldtnRule")
    protected GenericValidationRuleIdentification1 dtldVldtnRule;

    /**
     * Gets the value of the msgRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgRptId() {
        return msgRptId;
    }

    /**
     * Sets the value of the msgRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RejectionReason45 setMsgRptId(String value) {
        this.msgRptId = value;
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
    public RejectionReason45 setSts(ReportingMessageStatus1Code value) {
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
    public RejectionReason45 setDtldVldtnRule(GenericValidationRuleIdentification1 value) {
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
