
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
 * An account owner, for example, an investor or its designated agent, sends the AccountModificationInstruction message to the account servicer, for example, a registrar, transfer agent or custodian bank to modify, that is, create, update or delete specific details of an existing investment fund account.
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
@XmlType(name = "AccountModificationInstructionV03", propOrder = {
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
    "xtnsn"
})
public class AccountModificationInstructionV03 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference3 prvsRef;
    @XmlElement(name = "InstrDtls")
    protected InvestmentAccountModificationDetails instrDtls;
    @XmlElement(name = "InvstmtAcctSelctn", required = true)
    protected InvestmentAccountSelection2 invstmtAcctSelctn;
    @XmlElement(name = "ModfdInvstmtAcct")
    protected InvestmentAccount36 modfdInvstmtAcct;
    @XmlElement(name = "ModfdAcctPties")
    protected List<AccountParties7> modfdAcctPties;
    @XmlElement(name = "ModfdIntrmies")
    protected List<ModificationScope7> modfdIntrmies;
    @XmlElement(name = "ModfdPlcmnt")
    protected ReferredAgent1 modfdPlcmnt;
    @XmlElement(name = "ModfdIsseAllcn")
    protected ModificationScope9 modfdIsseAllcn;
    @XmlElement(name = "ModfdSvgsInvstmtPlan")
    protected List<ModificationScope16> modfdSvgsInvstmtPlan;
    @XmlElement(name = "ModfdWdrwlInvstmtPlan")
    protected List<ModificationScope16> modfdWdrwlInvstmtPlan;
    @XmlElement(name = "ModfdCshSttlm")
    protected List<InvestmentFundCashSettlementInformation6> modfdCshSttlm;
    @XmlElement(name = "ModfdSvcLvlAgrmt")
    protected List<ModificationScope10> modfdSvcLvlAgrmt;
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
    public AccountModificationInstructionV03 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AccountModificationInstructionV03 setPrvsRef(AdditionalReference3 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the instrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountModificationDetails }
     *     
     */
    public InvestmentAccountModificationDetails getInstrDtls() {
        return instrDtls;
    }

    /**
     * Sets the value of the instrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountModificationDetails }
     *     
     */
    public AccountModificationInstructionV03 setInstrDtls(InvestmentAccountModificationDetails value) {
        this.instrDtls = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctSelctn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountSelection2 }
     *     
     */
    public InvestmentAccountSelection2 getInvstmtAcctSelctn() {
        return invstmtAcctSelctn;
    }

    /**
     * Sets the value of the invstmtAcctSelctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountSelection2 }
     *     
     */
    public AccountModificationInstructionV03 setInvstmtAcctSelctn(InvestmentAccountSelection2 value) {
        this.invstmtAcctSelctn = value;
        return this;
    }

    /**
     * Gets the value of the modfdInvstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount36 }
     *     
     */
    public InvestmentAccount36 getModfdInvstmtAcct() {
        return modfdInvstmtAcct;
    }

    /**
     * Sets the value of the modfdInvstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount36 }
     *     
     */
    public AccountModificationInstructionV03 setModfdInvstmtAcct(InvestmentAccount36 value) {
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
     * {@link AccountParties7 }
     * 
     * 
     * @return
     *     The value of the modfdAcctPties property.
     */
    public List<AccountParties7> getModfdAcctPties() {
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
     * {@link ModificationScope7 }
     * 
     * 
     * @return
     *     The value of the modfdIntrmies property.
     */
    public List<ModificationScope7> getModfdIntrmies() {
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
     *     {@link ReferredAgent1 }
     *     
     */
    public ReferredAgent1 getModfdPlcmnt() {
        return modfdPlcmnt;
    }

    /**
     * Sets the value of the modfdPlcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredAgent1 }
     *     
     */
    public AccountModificationInstructionV03 setModfdPlcmnt(ReferredAgent1 value) {
        this.modfdPlcmnt = value;
        return this;
    }

    /**
     * Gets the value of the modfdIsseAllcn property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationScope9 }
     *     
     */
    public ModificationScope9 getModfdIsseAllcn() {
        return modfdIsseAllcn;
    }

    /**
     * Sets the value of the modfdIsseAllcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationScope9 }
     *     
     */
    public AccountModificationInstructionV03 setModfdIsseAllcn(ModificationScope9 value) {
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
     * {@link ModificationScope16 }
     * 
     * 
     * @return
     *     The value of the modfdSvgsInvstmtPlan property.
     */
    public List<ModificationScope16> getModfdSvgsInvstmtPlan() {
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
     * {@link ModificationScope16 }
     * 
     * 
     * @return
     *     The value of the modfdWdrwlInvstmtPlan property.
     */
    public List<ModificationScope16> getModfdWdrwlInvstmtPlan() {
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
     * {@link InvestmentFundCashSettlementInformation6 }
     * 
     * 
     * @return
     *     The value of the modfdCshSttlm property.
     */
    public List<InvestmentFundCashSettlementInformation6> getModfdCshSttlm() {
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
     * {@link ModificationScope10 }
     * 
     * 
     * @return
     *     The value of the modfdSvcLvlAgrmt property.
     */
    public List<ModificationScope10> getModfdSvcLvlAgrmt() {
        if (modfdSvcLvlAgrmt == null) {
            modfdSvcLvlAgrmt = new ArrayList<>();
        }
        return this.modfdSvcLvlAgrmt;
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
    public AccountModificationInstructionV03 addModfdAcctPties(AccountParties7 modfdAcctPties) {
        getModfdAcctPties().add(modfdAcctPties);
        return this;
    }

    /**
     * Adds a new item to the modfdIntrmies list.
     * @see #getModfdIntrmies()
     * 
     */
    public AccountModificationInstructionV03 addModfdIntrmies(ModificationScope7 modfdIntrmies) {
        getModfdIntrmies().add(modfdIntrmies);
        return this;
    }

    /**
     * Adds a new item to the modfdSvgsInvstmtPlan list.
     * @see #getModfdSvgsInvstmtPlan()
     * 
     */
    public AccountModificationInstructionV03 addModfdSvgsInvstmtPlan(ModificationScope16 modfdSvgsInvstmtPlan) {
        getModfdSvgsInvstmtPlan().add(modfdSvgsInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the modfdWdrwlInvstmtPlan list.
     * @see #getModfdWdrwlInvstmtPlan()
     * 
     */
    public AccountModificationInstructionV03 addModfdWdrwlInvstmtPlan(ModificationScope16 modfdWdrwlInvstmtPlan) {
        getModfdWdrwlInvstmtPlan().add(modfdWdrwlInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the modfdCshSttlm list.
     * @see #getModfdCshSttlm()
     * 
     */
    public AccountModificationInstructionV03 addModfdCshSttlm(InvestmentFundCashSettlementInformation6 modfdCshSttlm) {
        getModfdCshSttlm().add(modfdCshSttlm);
        return this;
    }

    /**
     * Adds a new item to the modfdSvcLvlAgrmt list.
     * @see #getModfdSvcLvlAgrmt()
     * 
     */
    public AccountModificationInstructionV03 addModfdSvcLvlAgrmt(ModificationScope10 modfdSvcLvlAgrmt) {
        getModfdSvcLvlAgrmt().add(modfdSvcLvlAgrmt);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public AccountModificationInstructionV03 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
