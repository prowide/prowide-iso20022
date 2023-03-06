
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
 * The AccountModificationInstruction message is sent by an account owner, for example, an investor or its designated agent to the account servicer, for example, a registrar, transfer agent, custodian bank or securities depository to modify, that is, create, update or delete specific details of an existing account.
 * Usage
 * The AccountModificationInstruction message is used to modify the details of an existing account.
 * The AccountModificationInstruction message can be used to:
 * - maintain/update any of the existing account details, for example, to update the address of the beneficiary or modify the preference to income from distribution to capitalisation, or,
 * - add/create specific details to the existing account when these details were not yet recorded at the time of account creation, for example, to add a second address or to establish new cash settlement standing instructions, or,
 * - delete specific account details, for example, delete cash standing instructions, or,
 * - instruct a change to the status of the account, for example, instruct the closure of the account.
 * The usage of this message may be subject to service level agreement (SLA) between the counterparties.
 * Execution of the AccountModificationInstruction is confirmed via an AccountDetailsConfirmation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountModificationInstructionV08", propOrder = {
    "msgId",
    "prvsRef",
    "instrDtls",
    "invstmtAcctSelctn",
    "modfdInvstmtAcct",
    "modfdAcctPties",
    "modfdIntrmies",
    "modfdPlcmnt",
    "modfdIsseAllcn",
    "modfdSvgsInvstmtPlan",
    "modfdWdrwlInvstmtPlan",
    "modfdCshSttlm",
    "modfdSvcLvlAgrmt",
    "modfdAddtlInf",
    "mktPrctcVrsn",
    "xtnsn"
})
public class AccountModificationInstructionV08 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference13 prvsRef;
    @XmlElement(name = "InstrDtls")
    protected InvestmentAccountModification4 instrDtls;
    @XmlElement(name = "InvstmtAcctSelctn", required = true)
    protected AccountSelection3Choice invstmtAcctSelctn;
    @XmlElement(name = "ModfdInvstmtAcct")
    protected InvestmentAccount75 modfdInvstmtAcct;
    @XmlElement(name = "ModfdAcctPties")
    protected List<AccountParties18> modfdAcctPties;
    @XmlElement(name = "ModfdIntrmies")
    protected List<ModificationScope40> modfdIntrmies;
    @XmlElement(name = "ModfdPlcmnt")
    protected ModificationScope43 modfdPlcmnt;
    @XmlElement(name = "ModfdIsseAllcn")
    protected ModificationScope21 modfdIsseAllcn;
    @XmlElement(name = "ModfdSvgsInvstmtPlan")
    protected List<ModificationScope41> modfdSvgsInvstmtPlan;
    @XmlElement(name = "ModfdWdrwlInvstmtPlan")
    protected List<ModificationScope41> modfdWdrwlInvstmtPlan;
    @XmlElement(name = "ModfdCshSttlm")
    protected List<CashSettlement4> modfdCshSttlm;
    @XmlElement(name = "ModfdSvcLvlAgrmt")
    protected List<ModificationScope44> modfdSvcLvlAgrmt;
    @XmlElement(name = "ModfdAddtlInf")
    protected List<ModificationScope45> modfdAddtlInf;
    @XmlElement(name = "MktPrctcVrsn")
    protected MarketPracticeVersion1 mktPrctcVrsn;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public AccountModificationInstructionV08 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference13 }
     *     
     */
    public AdditionalReference13 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference13 }
     *     
     */
    public AccountModificationInstructionV08 setPrvsRef(AdditionalReference13 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the instrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountModification4 }
     *     
     */
    public InvestmentAccountModification4 getInstrDtls() {
        return instrDtls;
    }

    /**
     * Sets the value of the instrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountModification4 }
     *     
     */
    public AccountModificationInstructionV08 setInstrDtls(InvestmentAccountModification4 value) {
        this.instrDtls = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctSelctn property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSelection3Choice }
     *     
     */
    public AccountSelection3Choice getInvstmtAcctSelctn() {
        return invstmtAcctSelctn;
    }

    /**
     * Sets the value of the invstmtAcctSelctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSelection3Choice }
     *     
     */
    public AccountModificationInstructionV08 setInvstmtAcctSelctn(AccountSelection3Choice value) {
        this.invstmtAcctSelctn = value;
        return this;
    }

    /**
     * Gets the value of the modfdInvstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount75 }
     *     
     */
    public InvestmentAccount75 getModfdInvstmtAcct() {
        return modfdInvstmtAcct;
    }

    /**
     * Sets the value of the modfdInvstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount75 }
     *     
     */
    public AccountModificationInstructionV08 setModfdInvstmtAcct(InvestmentAccount75 value) {
        this.modfdInvstmtAcct = value;
        return this;
    }

    /**
     * Gets the value of the modfdAcctPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modfdAcctPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdAcctPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountParties18 }
     * 
     * 
     */
    public List<AccountParties18> getModfdAcctPties() {
        if (modfdAcctPties == null) {
            modfdAcctPties = new ArrayList<AccountParties18>();
        }
        return this.modfdAcctPties;
    }

    /**
     * Gets the value of the modfdIntrmies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modfdIntrmies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdIntrmies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope40 }
     * 
     * 
     */
    public List<ModificationScope40> getModfdIntrmies() {
        if (modfdIntrmies == null) {
            modfdIntrmies = new ArrayList<ModificationScope40>();
        }
        return this.modfdIntrmies;
    }

    /**
     * Gets the value of the modfdPlcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationScope43 }
     *     
     */
    public ModificationScope43 getModfdPlcmnt() {
        return modfdPlcmnt;
    }

    /**
     * Sets the value of the modfdPlcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationScope43 }
     *     
     */
    public AccountModificationInstructionV08 setModfdPlcmnt(ModificationScope43 value) {
        this.modfdPlcmnt = value;
        return this;
    }

    /**
     * Gets the value of the modfdIsseAllcn property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationScope21 }
     *     
     */
    public ModificationScope21 getModfdIsseAllcn() {
        return modfdIsseAllcn;
    }

    /**
     * Sets the value of the modfdIsseAllcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationScope21 }
     *     
     */
    public AccountModificationInstructionV08 setModfdIsseAllcn(ModificationScope21 value) {
        this.modfdIsseAllcn = value;
        return this;
    }

    /**
     * Gets the value of the modfdSvgsInvstmtPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modfdSvgsInvstmtPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdSvgsInvstmtPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope41 }
     * 
     * 
     */
    public List<ModificationScope41> getModfdSvgsInvstmtPlan() {
        if (modfdSvgsInvstmtPlan == null) {
            modfdSvgsInvstmtPlan = new ArrayList<ModificationScope41>();
        }
        return this.modfdSvgsInvstmtPlan;
    }

    /**
     * Gets the value of the modfdWdrwlInvstmtPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modfdWdrwlInvstmtPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdWdrwlInvstmtPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope41 }
     * 
     * 
     */
    public List<ModificationScope41> getModfdWdrwlInvstmtPlan() {
        if (modfdWdrwlInvstmtPlan == null) {
            modfdWdrwlInvstmtPlan = new ArrayList<ModificationScope41>();
        }
        return this.modfdWdrwlInvstmtPlan;
    }

    /**
     * Gets the value of the modfdCshSttlm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modfdCshSttlm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdCshSttlm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashSettlement4 }
     * 
     * 
     */
    public List<CashSettlement4> getModfdCshSttlm() {
        if (modfdCshSttlm == null) {
            modfdCshSttlm = new ArrayList<CashSettlement4>();
        }
        return this.modfdCshSttlm;
    }

    /**
     * Gets the value of the modfdSvcLvlAgrmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modfdSvcLvlAgrmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdSvcLvlAgrmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope44 }
     * 
     * 
     */
    public List<ModificationScope44> getModfdSvcLvlAgrmt() {
        if (modfdSvcLvlAgrmt == null) {
            modfdSvcLvlAgrmt = new ArrayList<ModificationScope44>();
        }
        return this.modfdSvcLvlAgrmt;
    }

    /**
     * Gets the value of the modfdAddtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modfdAddtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope45 }
     * 
     * 
     */
    public List<ModificationScope45> getModfdAddtlInf() {
        if (modfdAddtlInf == null) {
            modfdAddtlInf = new ArrayList<ModificationScope45>();
        }
        return this.modfdAddtlInf;
    }

    /**
     * Gets the value of the mktPrctcVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link MarketPracticeVersion1 }
     *     
     */
    public MarketPracticeVersion1 getMktPrctcVrsn() {
        return mktPrctcVrsn;
    }

    /**
     * Sets the value of the mktPrctcVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketPracticeVersion1 }
     *     
     */
    public AccountModificationInstructionV08 setMktPrctcVrsn(MarketPracticeVersion1 value) {
        this.mktPrctcVrsn = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension1>();
        }
        return this.xtnsn;
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
     * Adds a new item to the modfdAcctPties list.
     * @see #getModfdAcctPties()
     * 
     */
    public AccountModificationInstructionV08 addModfdAcctPties(AccountParties18 modfdAcctPties) {
        getModfdAcctPties().add(modfdAcctPties);
        return this;
    }

    /**
     * Adds a new item to the modfdIntrmies list.
     * @see #getModfdIntrmies()
     * 
     */
    public AccountModificationInstructionV08 addModfdIntrmies(ModificationScope40 modfdIntrmies) {
        getModfdIntrmies().add(modfdIntrmies);
        return this;
    }

    /**
     * Adds a new item to the modfdSvgsInvstmtPlan list.
     * @see #getModfdSvgsInvstmtPlan()
     * 
     */
    public AccountModificationInstructionV08 addModfdSvgsInvstmtPlan(ModificationScope41 modfdSvgsInvstmtPlan) {
        getModfdSvgsInvstmtPlan().add(modfdSvgsInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the modfdWdrwlInvstmtPlan list.
     * @see #getModfdWdrwlInvstmtPlan()
     * 
     */
    public AccountModificationInstructionV08 addModfdWdrwlInvstmtPlan(ModificationScope41 modfdWdrwlInvstmtPlan) {
        getModfdWdrwlInvstmtPlan().add(modfdWdrwlInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the modfdCshSttlm list.
     * @see #getModfdCshSttlm()
     * 
     */
    public AccountModificationInstructionV08 addModfdCshSttlm(CashSettlement4 modfdCshSttlm) {
        getModfdCshSttlm().add(modfdCshSttlm);
        return this;
    }

    /**
     * Adds a new item to the modfdSvcLvlAgrmt list.
     * @see #getModfdSvcLvlAgrmt()
     * 
     */
    public AccountModificationInstructionV08 addModfdSvcLvlAgrmt(ModificationScope44 modfdSvcLvlAgrmt) {
        getModfdSvcLvlAgrmt().add(modfdSvcLvlAgrmt);
        return this;
    }

    /**
     * Adds a new item to the modfdAddtlInf list.
     * @see #getModfdAddtlInf()
     * 
     */
    public AccountModificationInstructionV08 addModfdAddtlInf(ModificationScope45 modfdAddtlInf) {
        getModfdAddtlInf().add(modfdAddtlInf);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public AccountModificationInstructionV08 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
