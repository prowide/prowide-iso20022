
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "TransactionSearchCriteria9", propOrder = {
    "pmtTo",
    "pmtFr",
    "pmtSch",
    "acctNtrySch"
})
public class TransactionSearchCriteria9 {

    @XmlElement(name = "PmtTo")
    protected List<SystemSearch4> pmtTo;
    @XmlElement(name = "PmtFr")
    protected List<SystemSearch4> pmtFr;
    @XmlElement(name = "PmtSch")
    protected PaymentSearch8 pmtSch;
    @XmlElement(name = "AcctNtrySch")
    protected CashAccountEntrySearch7 acctNtrySch;

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
     * {@link SystemSearch4 }
     * 
     * 
     */
    public List<SystemSearch4> getPmtTo() {
        if (pmtTo == null) {
            pmtTo = new ArrayList<SystemSearch4>();
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
     * {@link SystemSearch4 }
     * 
     * 
     */
    public List<SystemSearch4> getPmtFr() {
        if (pmtFr == null) {
            pmtFr = new ArrayList<SystemSearch4>();
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
    public TransactionSearchCriteria9 setPmtSch(PaymentSearch8 value) {
        this.pmtSch = value;
        return this;
    }

    /**
     * Gets the value of the acctNtrySch property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountEntrySearch7 }
     *     
     */
    public CashAccountEntrySearch7 getAcctNtrySch() {
        return acctNtrySch;
    }

    /**
     * Sets the value of the acctNtrySch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountEntrySearch7 }
     *     
     */
    public TransactionSearchCriteria9 setAcctNtrySch(CashAccountEntrySearch7 value) {
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
    public TransactionSearchCriteria9 addPmtTo(SystemSearch4 pmtTo) {
        getPmtTo().add(pmtTo);
        return this;
    }

    /**
     * Adds a new item to the pmtFr list.
     * @see #getPmtFr()
     * 
     */
    public TransactionSearchCriteria9 addPmtFr(SystemSearch4 pmtFr) {
        getPmtFr().add(pmtFr);
        return this;
    }

}
