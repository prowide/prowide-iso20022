
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria used to search for a cash entry.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountCashEntrySearch2", propOrder = {
    "acctId",
    "ntryAmt",
    "ntryAmtCcy",
    "cdtDbtInd",
    "ntrySts",
    "ntryDt",
    "acctOwnr",
    "acctSvcr"
})
public class AccountCashEntrySearch2 {

    @XmlElement(name = "AcctId")
    protected List<AccountIdentificationSearchCriteriaChoice> acctId;
    @XmlElement(name = "NtryAmt")
    protected List<AmountRangeChoice> ntryAmt;
    @XmlElement(name = "NtryAmtCcy")
    protected List<String> ntryAmtCcy;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "NtrySts")
    @XmlSchemaType(name = "string")
    protected List<EntryStatus1Code> ntrySts;
    @XmlElement(name = "NtryDt")
    protected List<DateAndDateTimeSearchChoice> ntryDt;
    @XmlElement(name = "AcctOwnr")
    protected String acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected String acctSvcr;

    /**
     * Gets the value of the acctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentificationSearchCriteriaChoice }
     * 
     * 
     * @return
     *     The value of the acctId property.
     */
    public List<AccountIdentificationSearchCriteriaChoice> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<>();
        }
        return this.acctId;
    }

    /**
     * Gets the value of the ntryAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntryAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtryAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountRangeChoice }
     * 
     * 
     * @return
     *     The value of the ntryAmt property.
     */
    public List<AmountRangeChoice> getNtryAmt() {
        if (ntryAmt == null) {
            ntryAmt = new ArrayList<>();
        }
        return this.ntryAmt;
    }

    /**
     * Gets the value of the ntryAmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntryAmtCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtryAmtCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ntryAmtCcy property.
     */
    public List<String> getNtryAmtCcy() {
        if (ntryAmtCcy == null) {
            ntryAmtCcy = new ArrayList<>();
        }
        return this.ntryAmtCcy;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public AccountCashEntrySearch2 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the ntrySts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntrySts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtrySts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryStatus1Code }
     * 
     * 
     * @return
     *     The value of the ntrySts property.
     */
    public List<EntryStatus1Code> getNtrySts() {
        if (ntrySts == null) {
            ntrySts = new ArrayList<>();
        }
        return this.ntrySts;
    }

    /**
     * Gets the value of the ntryDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntryDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtryDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndDateTimeSearchChoice }
     * 
     * 
     * @return
     *     The value of the ntryDt property.
     */
    public List<DateAndDateTimeSearchChoice> getNtryDt() {
        if (ntryDt == null) {
            ntryDt = new ArrayList<>();
        }
        return this.ntryDt;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountCashEntrySearch2 setAcctOwnr(String value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountCashEntrySearch2 setAcctSvcr(String value) {
        this.acctSvcr = value;
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
     * Adds a new item to the acctId list.
     * @see #getAcctId()
     * 
     */
    public AccountCashEntrySearch2 addAcctId(AccountIdentificationSearchCriteriaChoice acctId) {
        getAcctId().add(acctId);
        return this;
    }

    /**
     * Adds a new item to the ntryAmt list.
     * @see #getNtryAmt()
     * 
     */
    public AccountCashEntrySearch2 addNtryAmt(AmountRangeChoice ntryAmt) {
        getNtryAmt().add(ntryAmt);
        return this;
    }

    /**
     * Adds a new item to the ntryAmtCcy list.
     * @see #getNtryAmtCcy()
     * 
     */
    public AccountCashEntrySearch2 addNtryAmtCcy(String ntryAmtCcy) {
        getNtryAmtCcy().add(ntryAmtCcy);
        return this;
    }

    /**
     * Adds a new item to the ntrySts list.
     * @see #getNtrySts()
     * 
     */
    public AccountCashEntrySearch2 addNtrySts(EntryStatus1Code ntrySts) {
        getNtrySts().add(ntrySts);
        return this;
    }

    /**
     * Adds a new item to the ntryDt list.
     * @see #getNtryDt()
     * 
     */
    public AccountCashEntrySearch2 addNtryDt(DateAndDateTimeSearchChoice ntryDt) {
        getNtryDt().add(ntryDt);
        return this;
    }

}
