
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
 * Status report of an account opening instruction or account modification instruction that was previously received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountManagementStatusAndReason2", propOrder = {
    "sts",
    "acctApplId"
})
public class AccountManagementStatusAndReason2 {

    @XmlElement(name = "Sts", required = true)
    protected Status12Choice sts;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link Status12Choice }
     *     
     */
    public Status12Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status12Choice }
     *     
     */
    public AccountManagementStatusAndReason2 setSts(Status12Choice value) {
        this.sts = value;
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
    public AccountManagementStatusAndReason2 setAcctApplId(String value) {
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
