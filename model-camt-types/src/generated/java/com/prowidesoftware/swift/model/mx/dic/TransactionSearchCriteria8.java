
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
@XmlType(name = "TransactionSearchCriteria8", propOrder = {
    "pmtTo",
    "pmtFr",
    "pmtSch",
    "acctNtrySch"
})
public class TransactionSearchCriteria8 {

    @XmlElement(name = "PmtTo")
    protected List<SystemSearch4> pmtTo;
    @XmlElement(name = "PmtFr")
    protected List<SystemSearch4> pmtFr;
    @XmlElement(name = "PmtSch")
    protected PaymentSearch8 pmtSch;
    @XmlElement(name = "AcctNtrySch")
    protected CashAccountEntrySearch6 acctNtrySch;

    /**
     * Gets the value of the pmtTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtTo property.
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
     * {@link SystemSearch4 }
     * 
     * 
     * @return
     *     The value of the pmtTo property.
     */
    public List<SystemSearch4> getPmtTo() {
        if (pmtTo == null) {
            pmtTo = new ArrayList<>();
        }
        return this.pmtTo;
    }

    /**
     * Gets the value of the pmtFr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtFr property.
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
     * {@link SystemSearch4 }
     * 
     * 
     * @return
     *     The value of the pmtFr property.
     */
    public List<SystemSearch4> getPmtFr() {
        if (pmtFr == null) {
            pmtFr = new ArrayList<>();
        }
        return this.pmtFr;
    }

    /**
     * Gets the value of the pmtSch property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentSearch8 }
     *     
     */
    public PaymentSearch8 getPmtSch() {
        return pmtSch;
    }

    /**
     * Sets the value of the pmtSch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSearch8 }
     *     
     */
    public TransactionSearchCriteria8 setPmtSch(PaymentSearch8 value) {
        this.pmtSch = value;
        return this;
    }

    /**
     * Gets the value of the acctNtrySch property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountEntrySearch6 }
     *     
     */
    public CashAccountEntrySearch6 getAcctNtrySch() {
        return acctNtrySch;
    }

    /**
     * Sets the value of the acctNtrySch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountEntrySearch6 }
     *     
     */
    public TransactionSearchCriteria8 setAcctNtrySch(CashAccountEntrySearch6 value) {
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
    public TransactionSearchCriteria8 addPmtTo(SystemSearch4 pmtTo) {
        getPmtTo().add(pmtTo);
        return this;
    }

    /**
     * Adds a new item to the pmtFr list.
     * @see #getPmtFr()
     * 
     */
    public TransactionSearchCriteria8 addPmtFr(SystemSearch4 pmtFr) {
        getPmtFr().add(pmtFr);
        return this;
    }

}
