
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
 * Scope
 * The Bank-to-Customer Debit/Credit Notification message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It can be used to inform the account owner, or authorised party, of single or multiple debit and/or credit entries reported to the account.
 * Usage
 * The Bank-to-Customer Debit/Credit Notification message can contain reports for more than 1 account. It provides information for cash management and/or reconciliation.
 * It can be used to:
 * - report pending and booked items;
 * - notify one or more debit entries;
 * - notify one or more credit entries;
 * - notify a combination of debit and credit entries
 * It can include underlying details of transactions that have been included in the entry.
 * It is possible that the receiver of the message is not the account owner, but a party entitled by the account owner to receive the account information (also known as recipient).
 * It does not contain balance information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankToCustomerDebitCreditNotificationV01", propOrder = {
    "grpHdr",
    "ntfctn"
})
public class BankToCustomerDebitCreditNotificationV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader23 grpHdr;
    @XmlElement(name = "Ntfctn", required = true)
    protected List<AccountNotification1> ntfctn;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader23 }
     *     
     */
    public GroupHeader23 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader23 }
     *     
     */
    public BankToCustomerDebitCreditNotificationV01 setGrpHdr(GroupHeader23 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the ntfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountNotification1 }
     * 
     * 
     * @return
     *     The value of the ntfctn property.
     */
    public List<AccountNotification1> getNtfctn() {
        if (ntfctn == null) {
            ntfctn = new ArrayList<>();
        }
        return this.ntfctn;
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
     * Adds a new item to the ntfctn list.
     * @see #getNtfctn()
     * 
     */
    public BankToCustomerDebitCreditNotificationV01 addNtfctn(AccountNotification1 ntfctn) {
        getNtfctn().add(ntfctn);
        return this;
    }

}
