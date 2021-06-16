
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "CashAccountEntrySearch7", propOrder = {
    "acctId",
    "ntryAmt",
    "ntryAmtCcy",
    "cdtDbtInd",
    "ntrySts",
    "ntryDt",
    "acctOwnr",
    "acctSvcr"
})
public class CashAccountEntrySearch7 {

    @XmlElement(name = "AcctId")
    protected List<AccountIdentificationSearchCriteria2Choice> acctId;
    @XmlElement(name = "NtryAmt")
    protected List<ActiveOrHistoricAmountRange2Choice> ntryAmt;
    @XmlElement(name = "NtryAmtCcy")
    protected List<String> ntryAmtCcy;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "NtrySts")
    @XmlSchemaType(name = "string")
    protected List<EntryStatus1Code> ntrySts;
    @XmlElement(name = "NtryDt")
    protected List<DateAndDateTimeSearch3Choice> ntryDt;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification135 acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected BranchAndFinancialInstitutionIdentification6 acctSvcr;

    /**
     * Gets the value of the acctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctId property.
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
     * {@link AccountIdentificationSearchCriteria2Choice }
     * 
     * 
     */
    public List<AccountIdentificationSearchCriteria2Choice> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<AccountIdentificationSearchCriteria2Choice>();
        }
        return this.acctId;
    }

    /**
     * Gets the value of the ntryAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ntryAmt property.
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
     * {@link ActiveOrHistoricAmountRange2Choice }
     * 
     * 
     */
    public List<ActiveOrHistoricAmountRange2Choice> getNtryAmt() {
        if (ntryAmt == null) {
            ntryAmt = new ArrayList<ActiveOrHistoricAmountRange2Choice>();
        }
        return this.ntryAmt;
    }

    /**
     * Gets the value of the ntryAmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ntryAmtCcy property.
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
     */
    public List<String> getNtryAmtCcy() {
        if (ntryAmtCcy == null) {
            ntryAmtCcy = new ArrayList<String>();
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
    public CashAccountEntrySearch7 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the ntrySts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ntrySts property.
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
     */
    public List<EntryStatus1Code> getNtrySts() {
        if (ntrySts == null) {
            ntrySts = new ArrayList<EntryStatus1Code>();
        }
        return this.ntrySts;
    }

    /**
     * Gets the value of the ntryDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ntryDt property.
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
     * {@link DateAndDateTimeSearch3Choice }
     * 
     * 
     */
    public List<DateAndDateTimeSearch3Choice> getNtryDt() {
        if (ntryDt == null) {
            ntryDt = new ArrayList<DateAndDateTimeSearch3Choice>();
        }
        return this.ntryDt;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public CashAccountEntrySearch7 setAcctOwnr(PartyIdentification135 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public CashAccountEntrySearch7 setAcctSvcr(BranchAndFinancialInstitutionIdentification6 value) {
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
    public CashAccountEntrySearch7 addAcctId(AccountIdentificationSearchCriteria2Choice acctId) {
        getAcctId().add(acctId);
        return this;
    }

    /**
     * Adds a new item to the ntryAmt list.
     * @see #getNtryAmt()
     * 
     */
    public CashAccountEntrySearch7 addNtryAmt(ActiveOrHistoricAmountRange2Choice ntryAmt) {
        getNtryAmt().add(ntryAmt);
        return this;
    }

    /**
     * Adds a new item to the ntryAmtCcy list.
     * @see #getNtryAmtCcy()
     * 
     */
    public CashAccountEntrySearch7 addNtryAmtCcy(String ntryAmtCcy) {
        getNtryAmtCcy().add(ntryAmtCcy);
        return this;
    }

    /**
     * Adds a new item to the ntrySts list.
     * @see #getNtrySts()
     * 
     */
    public CashAccountEntrySearch7 addNtrySts(EntryStatus1Code ntrySts) {
        getNtrySts().add(ntrySts);
        return this;
    }

    /**
     * Adds a new item to the ntryDt list.
     * @see #getNtryDt()
     * 
     */
    public CashAccountEntrySearch7 addNtryDt(DateAndDateTimeSearch3Choice ntryDt) {
        getNtryDt().add(ntryDt);
        return this;
    }

}
