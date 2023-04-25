
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
 * An account owner, for example, an investor or its designated agent, sends the AccountModificationInstruction message to the account servicer, for example, a registrar, transfer agent, custodian bank or securities depository to modify, that is, create, update or delete specific details of an existing account.
 * Usage
 * The AccountModificationInstruction message is used to modify the details of an existing account.
 * The AccountModificationInstruction message has three specific uses:
 * - to maintain/update any of the existing account details, for example, to update the address of the beneficiary or modify the preference to income from distribution to capitalisation, or,
 * - to add/create specific details to the existing account when these details were not yet recorded at the time of account creation, for example, to add a second address or to establish new cash settlement standing instructions, or,
 * - to delete specific account details, for example, delete cash standing instructions.
 * This message cannot be used to delete an entire account, as institution specific and regulatory rules pertaining to account deletion are diverse.
 * The usage of this message may be subject to service level agreement (SLA) between the counterparties.
 * Execution of the AccountModificationInstruction is confirmed via an AccountDetailsConfirmation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountModificationInstructionV06", propOrder = {
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
public class AccountModificationInstructionV06 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference6 prvsRef;
    @XmlElement(name = "InstrDtls")
    protected InvestmentAccountModification2 instrDtls;
    @XmlElement(name = "InvstmtAcctSelctn", required = true)
    protected AccountSelection1Choice invstmtAcctSelctn;
    @XmlElement(name = "ModfdInvstmtAcct")
    protected InvestmentAccount51 modfdInvstmtAcct;
    @XmlElement(name = "ModfdAcctPties")
    protected List<AccountParties14> modfdAcctPties;
    @XmlElement(name = "ModfdIntrmies")
    protected List<ModificationScope26> modfdIntrmies;
    @XmlElement(name = "ModfdPlcmnt")
    protected ModificationScope33 modfdPlcmnt;
    @XmlElement(name = "ModfdIsseAllcn")
    protected ModificationScope21 modfdIsseAllcn;
    @XmlElement(name = "ModfdSvgsInvstmtPlan")
    protected List<ModificationScope28> modfdSvgsInvstmtPlan;
    @XmlElement(name = "ModfdWdrwlInvstmtPlan")
    protected List<ModificationScope28> modfdWdrwlInvstmtPlan;
    @XmlElement(name = "ModfdCshSttlm")
    protected List<CashSettlement2> modfdCshSttlm;
    @XmlElement(name = "ModfdSvcLvlAgrmt")
    protected List<ModificationScope31> modfdSvcLvlAgrmt;
    @XmlElement(name = "ModfdAddtlInf")
    protected List<ModificationScope30> modfdAddtlInf;
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
    public AccountModificationInstructionV06 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference6 }
     *     
     */
    public AdditionalReference6 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference6 }
     *     
     */
    public AccountModificationInstructionV06 setPrvsRef(AdditionalReference6 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the instrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountModification2 }
     *     
     */
    public InvestmentAccountModification2 getInstrDtls() {
        return instrDtls;
    }

    /**
     * Sets the value of the instrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountModification2 }
     *     
     */
    public AccountModificationInstructionV06 setInstrDtls(InvestmentAccountModification2 value) {
        this.instrDtls = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctSelctn property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSelection1Choice }
     *     
     */
    public AccountSelection1Choice getInvstmtAcctSelctn() {
        return invstmtAcctSelctn;
    }

    /**
     * Sets the value of the invstmtAcctSelctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSelection1Choice }
     *     
     */
    public AccountModificationInstructionV06 setInvstmtAcctSelctn(AccountSelection1Choice value) {
        this.invstmtAcctSelctn = value;
        return this;
    }

    /**
     * Gets the value of the modfdInvstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount51 }
     *     
     */
    public InvestmentAccount51 getModfdInvstmtAcct() {
        return modfdInvstmtAcct;
    }

    /**
     * Sets the value of the modfdInvstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount51 }
     *     
     */
    public AccountModificationInstructionV06 setModfdInvstmtAcct(InvestmentAccount51 value) {
        this.modfdInvstmtAcct = value;
        return this;
    }

    /**
     * Gets the value of the modfdAcctPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdAcctPties property.
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
     * {@link AccountParties14 }
     * 
     * 
     * @return
     *     The value of the modfdAcctPties property.
     */
    public List<AccountParties14> getModfdAcctPties() {
        if (modfdAcctPties == null) {
            modfdAcctPties = new ArrayList<>();
        }
        return this.modfdAcctPties;
    }

    /**
     * Gets the value of the modfdIntrmies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdIntrmies property.
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
     * {@link ModificationScope26 }
     * 
     * 
     * @return
     *     The value of the modfdIntrmies property.
     */
    public List<ModificationScope26> getModfdIntrmies() {
        if (modfdIntrmies == null) {
            modfdIntrmies = new ArrayList<>();
        }
        return this.modfdIntrmies;
    }

    /**
     * Gets the value of the modfdPlcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationScope33 }
     *     
     */
    public ModificationScope33 getModfdPlcmnt() {
        return modfdPlcmnt;
    }

    /**
     * Sets the value of the modfdPlcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationScope33 }
     *     
     */
    public AccountModificationInstructionV06 setModfdPlcmnt(ModificationScope33 value) {
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
    public AccountModificationInstructionV06 setModfdIsseAllcn(ModificationScope21 value) {
        this.modfdIsseAllcn = value;
        return this;
    }

    /**
     * Gets the value of the modfdSvgsInvstmtPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdSvgsInvstmtPlan property.
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
     * {@link ModificationScope28 }
     * 
     * 
     * @return
     *     The value of the modfdSvgsInvstmtPlan property.
     */
    public List<ModificationScope28> getModfdSvgsInvstmtPlan() {
        if (modfdSvgsInvstmtPlan == null) {
            modfdSvgsInvstmtPlan = new ArrayList<>();
        }
        return this.modfdSvgsInvstmtPlan;
    }

    /**
     * Gets the value of the modfdWdrwlInvstmtPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdWdrwlInvstmtPlan property.
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
     * {@link ModificationScope28 }
     * 
     * 
     * @return
     *     The value of the modfdWdrwlInvstmtPlan property.
     */
    public List<ModificationScope28> getModfdWdrwlInvstmtPlan() {
        if (modfdWdrwlInvstmtPlan == null) {
            modfdWdrwlInvstmtPlan = new ArrayList<>();
        }
        return this.modfdWdrwlInvstmtPlan;
    }

    /**
     * Gets the value of the modfdCshSttlm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdCshSttlm property.
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
     * {@link CashSettlement2 }
     * 
     * 
     * @return
     *     The value of the modfdCshSttlm property.
     */
    public List<CashSettlement2> getModfdCshSttlm() {
        if (modfdCshSttlm == null) {
            modfdCshSttlm = new ArrayList<>();
        }
        return this.modfdCshSttlm;
    }

    /**
     * Gets the value of the modfdSvcLvlAgrmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdSvcLvlAgrmt property.
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
     * {@link ModificationScope31 }
     * 
     * 
     * @return
     *     The value of the modfdSvcLvlAgrmt property.
     */
    public List<ModificationScope31> getModfdSvcLvlAgrmt() {
        if (modfdSvcLvlAgrmt == null) {
            modfdSvcLvlAgrmt = new ArrayList<>();
        }
        return this.modfdSvcLvlAgrmt;
    }

    /**
     * Gets the value of the modfdAddtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdAddtlInf property.
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
     * {@link ModificationScope30 }
     * 
     * 
     * @return
     *     The value of the modfdAddtlInf property.
     */
    public List<ModificationScope30> getModfdAddtlInf() {
        if (modfdAddtlInf == null) {
            modfdAddtlInf = new ArrayList<>();
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
    public AccountModificationInstructionV06 setMktPrctcVrsn(MarketPracticeVersion1 value) {
        this.mktPrctcVrsn = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
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
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
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
    public AccountModificationInstructionV06 addModfdAcctPties(AccountParties14 modfdAcctPties) {
        getModfdAcctPties().add(modfdAcctPties);
        return this;
    }

    /**
     * Adds a new item to the modfdIntrmies list.
     * @see #getModfdIntrmies()
     * 
     */
    public AccountModificationInstructionV06 addModfdIntrmies(ModificationScope26 modfdIntrmies) {
        getModfdIntrmies().add(modfdIntrmies);
        return this;
    }

    /**
     * Adds a new item to the modfdSvgsInvstmtPlan list.
     * @see #getModfdSvgsInvstmtPlan()
     * 
     */
    public AccountModificationInstructionV06 addModfdSvgsInvstmtPlan(ModificationScope28 modfdSvgsInvstmtPlan) {
        getModfdSvgsInvstmtPlan().add(modfdSvgsInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the modfdWdrwlInvstmtPlan list.
     * @see #getModfdWdrwlInvstmtPlan()
     * 
     */
    public AccountModificationInstructionV06 addModfdWdrwlInvstmtPlan(ModificationScope28 modfdWdrwlInvstmtPlan) {
        getModfdWdrwlInvstmtPlan().add(modfdWdrwlInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the modfdCshSttlm list.
     * @see #getModfdCshSttlm()
     * 
     */
    public AccountModificationInstructionV06 addModfdCshSttlm(CashSettlement2 modfdCshSttlm) {
        getModfdCshSttlm().add(modfdCshSttlm);
        return this;
    }

    /**
     * Adds a new item to the modfdSvcLvlAgrmt list.
     * @see #getModfdSvcLvlAgrmt()
     * 
     */
    public AccountModificationInstructionV06 addModfdSvcLvlAgrmt(ModificationScope31 modfdSvcLvlAgrmt) {
        getModfdSvcLvlAgrmt().add(modfdSvcLvlAgrmt);
        return this;
    }

    /**
     * Adds a new item to the modfdAddtlInf list.
     * @see #getModfdAddtlInf()
     * 
     */
    public AccountModificationInstructionV06 addModfdAddtlInf(ModificationScope30 modfdAddtlInf) {
        getModfdAddtlInf().add(modfdAddtlInf);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public AccountModificationInstructionV06 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
