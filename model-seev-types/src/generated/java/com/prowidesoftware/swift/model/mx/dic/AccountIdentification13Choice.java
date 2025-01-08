
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
 * Choice between all accounts (GENR - General in ISO 15022) or one or more selected accounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentification13Choice", propOrder = {
    "forAllAccts",
    "acctsList"
})
public class AccountIdentification13Choice {

    @XmlElement(name = "ForAllAccts")
    protected AccountIdentification10 forAllAccts;
    @XmlElement(name = "AcctsList")
    protected List<AccountIdentification15> acctsList;

    /**
     * Gets the value of the forAllAccts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification10 }
     *     
     */
    public AccountIdentification10 getForAllAccts() {
        return forAllAccts;
    }

    /**
     * Sets the value of the forAllAccts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification10 }
     *     
     */
    public AccountIdentification13Choice setForAllAccts(AccountIdentification10 value) {
        this.forAllAccts = value;
        return this;
    }

    /**
     * Gets the value of the acctsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentification15 }
     * 
     * 
     * @return
     *     The value of the acctsList property.
     */
    public List<AccountIdentification15> getAcctsList() {
        if (acctsList == null) {
            acctsList = new ArrayList<>();
        }
        return this.acctsList;
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
     * Adds a new item to the acctsList list.
     * @see #getAcctsList()
     * 
     */
    public AccountIdentification13Choice addAcctsList(AccountIdentification15 acctsList) {
        getAcctsList().add(acctsList);
        return this;
    }

}
