
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
 * Status information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountManagementStatusAndReason4", propOrder = {
    "sts",
    "acctApplId",
    "exstgAcctId"
})
public class AccountManagementStatusAndReason4 {

    @XmlElement(name = "Sts", required = true)
    protected Status20Choice sts;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;
    @XmlElement(name = "ExstgAcctId")
    protected String exstgAcctId;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link Status20Choice }
     *     
     */
    public Status20Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status20Choice }
     *     
     */
    public AccountManagementStatusAndReason4 setSts(Status20Choice value) {
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
    public AccountManagementStatusAndReason4 setAcctApplId(String value) {
        this.acctApplId = value;
        return this;
    }

    /**
     * Gets the value of the exstgAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExstgAcctId() {
        return exstgAcctId;
    }

    /**
     * Sets the value of the exstgAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountManagementStatusAndReason4 setExstgAcctId(String value) {
        this.exstgAcctId = value;
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
