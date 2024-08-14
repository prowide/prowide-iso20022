
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Account to or from which a cash entry is made.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount33", propOrder = {
    "sttlmCcy",
    "id",
    "acctOwnr",
    "acctSvcr",
    "acctSvcrBrnch",
    "acctOwnrOthrId",
    "invstmtAcctTp",
    "cdtDbt",
    "sttlmInstrRsn",
    "cshAcctPurp",
    "cshAcctDsgnt",
    "dvddPctg"
})
public class CashAccount33 {

    @XmlElement(name = "SttlmCcy", required = true)
    protected String sttlmCcy;
    @XmlElement(name = "Id", required = true)
    protected AccountIdentificationAndName5 id;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification70Choice acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected FinancialInstitutionIdentification7Choice acctSvcr;
    @XmlElement(name = "AcctSvcrBrnch")
    protected BranchData acctSvcrBrnch;
    @XmlElement(name = "AcctOwnrOthrId")
    protected List<GenericIdentification82> acctOwnrOthrId;
    @XmlElement(name = "InvstmtAcctTp")
    protected AccountType2Choice invstmtAcctTp;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;
    @XmlElement(name = "SttlmInstrRsn")
    protected SettlementInstructionReason1Choice sttlmInstrRsn;
    @XmlElement(name = "CshAcctPurp")
    protected CashAccountType3Choice cshAcctPurp;
    @XmlElement(name = "CshAcctDsgnt")
    protected AccountDesignation1Choice cshAcctDsgnt;
    @XmlElement(name = "DvddPctg")
    protected BigDecimal dvddPctg;

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccount33 setSttlmCcy(String value) {
        this.sttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public AccountIdentificationAndName5 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public CashAccount33 setId(AccountIdentificationAndName5 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public PartyIdentification70Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public CashAccount33 setAcctOwnr(PartyIdentification70Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification7Choice }
     *     
     */
    public FinancialInstitutionIdentification7Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification7Choice }
     *     
     */
    public CashAccount33 setAcctSvcr(FinancialInstitutionIdentification7Choice value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrBrnch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchData }
     *     
     */
    public BranchData getAcctSvcrBrnch() {
        return acctSvcrBrnch;
    }

    /**
     * Sets the value of the acctSvcrBrnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData }
     *     
     */
    public CashAccount33 setAcctSvcrBrnch(BranchData value) {
        this.acctSvcrBrnch = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnrOthrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctOwnrOthrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctOwnrOthrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification82 }
     * 
     * 
     * @return
     *     The value of the acctOwnrOthrId property.
     */
    public List<GenericIdentification82> getAcctOwnrOthrId() {
        if (acctOwnrOthrId == null) {
            acctOwnrOthrId = new ArrayList<>();
        }
        return this.acctOwnrOthrId;
    }

    /**
     * Gets the value of the invstmtAcctTp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType2Choice }
     *     
     */
    public AccountType2Choice getInvstmtAcctTp() {
        return invstmtAcctTp;
    }

    /**
     * Sets the value of the invstmtAcctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType2Choice }
     *     
     */
    public CashAccount33 setInvstmtAcctTp(AccountType2Choice value) {
        this.invstmtAcctTp = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Sets the value of the cdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CashAccount33 setCdtDbt(CreditDebit3Code value) {
        this.cdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmInstrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstructionReason1Choice }
     *     
     */
    public SettlementInstructionReason1Choice getSttlmInstrRsn() {
        return sttlmInstrRsn;
    }

    /**
     * Sets the value of the sttlmInstrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstructionReason1Choice }
     *     
     */
    public CashAccount33 setSttlmInstrRsn(SettlementInstructionReason1Choice value) {
        this.sttlmInstrRsn = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctPurp property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType3Choice }
     *     
     */
    public CashAccountType3Choice getCshAcctPurp() {
        return cshAcctPurp;
    }

    /**
     * Sets the value of the cshAcctPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType3Choice }
     *     
     */
    public CashAccount33 setCshAcctPurp(CashAccountType3Choice value) {
        this.cshAcctPurp = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctDsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDesignation1Choice }
     *     
     */
    public AccountDesignation1Choice getCshAcctDsgnt() {
        return cshAcctDsgnt;
    }

    /**
     * Sets the value of the cshAcctDsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDesignation1Choice }
     *     
     */
    public CashAccount33 setCshAcctDsgnt(AccountDesignation1Choice value) {
        this.cshAcctDsgnt = value;
        return this;
    }

    /**
     * Gets the value of the dvddPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDvddPctg() {
        return dvddPctg;
    }

    /**
     * Sets the value of the dvddPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CashAccount33 setDvddPctg(BigDecimal value) {
        this.dvddPctg = value;
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
     * Adds a new item to the acctOwnrOthrId list.
     * @see #getAcctOwnrOthrId()
     * 
     */
    public CashAccount33 addAcctOwnrOthrId(GenericIdentification82 acctOwnrOthrId) {
        getAcctOwnrOthrId().add(acctOwnrOthrId);
        return this;
    }

}
