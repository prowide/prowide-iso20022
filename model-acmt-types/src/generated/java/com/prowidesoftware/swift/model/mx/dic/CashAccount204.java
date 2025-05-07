
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Account to or from which a cash entry is made.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount204", propOrder = {
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
public class CashAccount204 {

    @XmlElement(name = "SttlmCcy", required = true)
    protected String sttlmCcy;
    @XmlElement(name = "Id", required = true)
    protected AccountIdentificationAndName5 id;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification125Choice acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected FinancialInstitutionIdentification11Choice acctSvcr;
    @XmlElement(name = "AcctSvcrBrnch")
    protected BranchData4 acctSvcrBrnch;
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
    public CashAccount204 setSttlmCcy(String value) {
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
    public CashAccount204 setId(AccountIdentificationAndName5 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public CashAccount204 setAcctOwnr(PartyIdentification125Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification11Choice }
     *     
     */
    public FinancialInstitutionIdentification11Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification11Choice }
     *     
     */
    public CashAccount204 setAcctSvcr(FinancialInstitutionIdentification11Choice value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrBrnch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchData4 }
     *     
     */
    public BranchData4 getAcctSvcrBrnch() {
        return acctSvcrBrnch;
    }

    /**
     * Sets the value of the acctSvcrBrnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData4 }
     *     
     */
    public CashAccount204 setAcctSvcrBrnch(BranchData4 value) {
        this.acctSvcrBrnch = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnrOthrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctOwnrOthrId property.
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
     */
    public List<GenericIdentification82> getAcctOwnrOthrId() {
        if (acctOwnrOthrId == null) {
            acctOwnrOthrId = new ArrayList<GenericIdentification82>();
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
    public CashAccount204 setInvstmtAcctTp(AccountType2Choice value) {
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
    public CashAccount204 setCdtDbt(CreditDebit3Code value) {
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
    public CashAccount204 setSttlmInstrRsn(SettlementInstructionReason1Choice value) {
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
    public CashAccount204 setCshAcctPurp(CashAccountType3Choice value) {
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
    public CashAccount204 setCshAcctDsgnt(AccountDesignation1Choice value) {
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
    public CashAccount204 setDvddPctg(BigDecimal value) {
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
    public CashAccount204 addAcctOwnrOthrId(GenericIdentification82 acctOwnrOthrId) {
        getAcctOwnrOthrId().add(acctOwnrOthrId);
        return this;
    }

}
