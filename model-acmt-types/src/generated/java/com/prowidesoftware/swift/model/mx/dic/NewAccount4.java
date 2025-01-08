
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
@XmlType(name = "NewAccount4", propOrder = {
    "acct",
    "acctPty",
    "org"
})
public class NewAccount4 {

    @XmlElement(name = "Acct", required = true)
    protected CashAccount43 acct;
    @XmlElement(name = "AcctPty", required = true)
    protected List<IndividualPerson44> acctPty;
    @XmlElement(name = "Org")
    protected Organisation43 org;

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
    public NewAccount4 setAcct(CashAccount43 value) {
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
     * {@link IndividualPerson44 }
     * 
     * 
     * @return
     *     The value of the acctPty property.
     */
    public List<IndividualPerson44> getAcctPty() {
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
     *     {@link Organisation43 }
     *     
     */
    public Organisation43 getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation43 }
     *     
     */
    public NewAccount4 setOrg(Organisation43 value) {
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
    public NewAccount4 addAcctPty(IndividualPerson44 acctPty) {
        getAcctPty().add(acctPty);
        return this;
    }

}
