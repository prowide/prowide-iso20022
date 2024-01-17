
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about the new account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewAccount1", propOrder = {
    "acct",
    "acctPty",
    "org"
})
public class NewAccount1 {

    @XmlElement(name = "Acct", required = true)
    protected CashAccount36 acct;
    @XmlElement(name = "AcctPty", required = true)
    protected List<IndividualPerson19> acctPty;
    @XmlElement(name = "Org")
    protected Organisation20 org;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount36 }
     *     
     */
    public CashAccount36 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount36 }
     *     
     */
    public NewAccount1 setAcct(CashAccount36 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the acctPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPerson19 }
     * 
     * 
     * @return
     *     The value of the acctPty property.
     */
    public List<IndividualPerson19> getAcctPty() {
        if (acctPty == null) {
            acctPty = new ArrayList<>();
        }
        return this.acctPty;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation20 }
     *     
     */
    public Organisation20 getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation20 }
     *     
     */
    public NewAccount1 setOrg(Organisation20 value) {
        this.org = value;
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

    /**
     * Adds a new item to the acctPty list.
     * @see #getAcctPty()
     * 
     */
    public NewAccount1 addAcctPty(IndividualPerson19 acctPty) {
        getAcctPty().add(acctPty);
        return this;
    }

}
