
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
 * Defines the criteria which are used to search for a payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSearchCriteria3", propOrder = {
    "pmtTo",
    "pmtFr",
    "pmtSch",
    "acctNtrySch"
})
public class TransactionSearchCriteria3 {

    @XmlElement(name = "PmtTo")
    protected List<SystemSearch2> pmtTo;
    @XmlElement(name = "PmtFr")
    protected List<SystemSearch2> pmtFr;
    @XmlElement(name = "PmtSch")
    protected PaymentSearch3 pmtSch;
    @XmlElement(name = "AcctNtrySch")
    protected AccountCashEntrySearch2 acctNtrySch;

    /**
     * Gets the value of the pmtTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemSearch2 }
     * 
     * 
     */
    public List<SystemSearch2> getPmtTo() {
        if (pmtTo == null) {
            pmtTo = new ArrayList<SystemSearch2>();
        }
        return this.pmtTo;
    }

    /**
     * Gets the value of the pmtFr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtFr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtFr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemSearch2 }
     * 
     * 
     */
    public List<SystemSearch2> getPmtFr() {
        if (pmtFr == null) {
            pmtFr = new ArrayList<SystemSearch2>();
        }
        return this.pmtFr;
    }

    /**
     * Gets the value of the pmtSch property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentSearch3 }
     *     
     */
    public PaymentSearch3 getPmtSch() {
        return pmtSch;
    }

    /**
     * Sets the value of the pmtSch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSearch3 }
     *     
     */
    public TransactionSearchCriteria3 setPmtSch(PaymentSearch3 value) {
        this.pmtSch = value;
        return this;
    }

    /**
     * Gets the value of the acctNtrySch property.
     * 
     * @return
     *     possible object is
     *     {@link AccountCashEntrySearch2 }
     *     
     */
    public AccountCashEntrySearch2 getAcctNtrySch() {
        return acctNtrySch;
    }

    /**
     * Sets the value of the acctNtrySch property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCashEntrySearch2 }
     *     
     */
    public TransactionSearchCriteria3 setAcctNtrySch(AccountCashEntrySearch2 value) {
        this.acctNtrySch = value;
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
     * Adds a new item to the pmtTo list.
     * @see #getPmtTo()
     * 
     */
    public TransactionSearchCriteria3 addPmtTo(SystemSearch2 pmtTo) {
        getPmtTo().add(pmtTo);
        return this;
    }

    /**
     * Adds a new item to the pmtFr list.
     * @see #getPmtFr()
     * 
     */
    public TransactionSearchCriteria3 addPmtFr(SystemSearch2 pmtFr) {
        getPmtFr().add(pmtFr);
        return this;
    }

}
