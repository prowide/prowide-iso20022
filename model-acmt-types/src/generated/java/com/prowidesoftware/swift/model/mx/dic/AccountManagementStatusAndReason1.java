
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
 * Status report of a account opening instruction or account modification instruction that was previously received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountManagementStatusAndReason1", propOrder = {
    "sts",
    "rjctd",
    "acctApplId"
})
public class AccountManagementStatusAndReason1 {

    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected AccountManagementStatus1Code sts;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus5 rjctd;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementStatus1Code }
     *     
     */
    public AccountManagementStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementStatus1Code }
     *     
     */
    public AccountManagementStatusAndReason1 setSts(AccountManagementStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus5 }
     *     
     */
    public RejectedStatus5 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus5 }
     *     
     */
    public AccountManagementStatusAndReason1 setRjctd(RejectedStatus5 value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the acctApplId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctApplId() {
        return acctApplId;
    }

    /**
     * Sets the value of the acctApplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountManagementStatusAndReason1 setAcctApplId(String value) {
        this.acctApplId = value;
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
