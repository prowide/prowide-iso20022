
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
 * Information about account from National BIC directory.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectoryAccountInformation1", propOrder = {
    "acct",
    "acctRstrctns"
})
public class DirectoryAccountInformation1 {

    @XmlElement(name = "Acct", required = true)
    protected CashAccount25 acct;
    @XmlElement(name = "AcctRstrctns")
    protected AccountRestrictions1 acctRstrctns;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount25 }
     *     
     */
    public CashAccount25 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount25 }
     *     
     */
    public DirectoryAccountInformation1 setAcct(CashAccount25 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the acctRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRestrictions1 }
     *     
     */
    public AccountRestrictions1 getAcctRstrctns() {
        return acctRstrctns;
    }

    /**
     * Sets the value of the acctRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRestrictions1 }
     *     
     */
    public DirectoryAccountInformation1 setAcctRstrctns(AccountRestrictions1 value) {
        this.acctRstrctns = value;
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
