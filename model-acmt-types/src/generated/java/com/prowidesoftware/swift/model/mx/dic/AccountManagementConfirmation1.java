
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
 * Provide information about the type of request or instruction which triggered this confirmation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountManagementConfirmation1", propOrder = {
    "confTp",
    "acctApplId"
})
public class AccountManagementConfirmation1 {

    @XmlElement(name = "ConfTp", required = true)
    @XmlSchemaType(name = "string")
    protected AccountManagementType2Code confTp;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;

    /**
     * Gets the value of the confTp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementType2Code }
     *     
     */
    public AccountManagementType2Code getConfTp() {
        return confTp;
    }

    /**
     * Sets the value of the confTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementType2Code }
     *     
     */
    public AccountManagementConfirmation1 setConfTp(AccountManagementType2Code value) {
        this.confTp = value;
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
    public AccountManagementConfirmation1 setAcctApplId(String value) {
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
