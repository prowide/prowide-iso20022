
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
 * Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccountAndEntry5", propOrder = {
    "acct",
    "ntry"
})
public class CashAccountAndEntry5 {

    @XmlElement(name = "Acct", required = true)
    protected CashAccount43 acct;
    @XmlElement(name = "Ntry")
    protected CashEntry2 ntry;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount43 }
     *     
     */
    public CashAccount43 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount43 }
     *     
     */
    public CashAccountAndEntry5 setAcct(CashAccount43 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the ntry property.
     * 
     * @return
     *     possible object is
     *     {@link CashEntry2 }
     *     
     */
    public CashEntry2 getNtry() {
        return ntry;
    }

    /**
     * Sets the value of the ntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashEntry2 }
     *     
     */
    public CashAccountAndEntry5 setNtry(CashEntry2 value) {
        this.ntry = value;
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
