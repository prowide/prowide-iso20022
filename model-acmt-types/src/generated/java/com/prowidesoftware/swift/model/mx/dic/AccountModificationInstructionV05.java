
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
@XmlType(name = "AccountModificationInstructionV05", propOrder = {
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
    "mktPrctcVrsn",
    "xtnsn"
})
public class AccountModificationInstructionV05 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference3 prvsRef;
    @XmlElement(name = "InstrDtls")
    protected InvestmentAccountModification1 instrDtls;
    @XmlElement(name = "InvstmtAcctSelctn", required = true)
    protected InvestmentAccountSelection2 invstmtAcctSelctn;
    @XmlElement(name = "ModfdInvstmtAcct")
    protected InvestmentAccount47 modfdInvstmtAcct;
    @XmlElement(name = "ModfdAcctPties")
    protected List<AccountParties11> modfdAcctPties;
    @XmlElement(name = "ModfdIntrmies")
    protected List<ModificationScope20> modfdIntrmies;
    @XmlElement(name = "ModfdPlcmnt")
    protected ReferredAgent1 modfdPlcmnt;
    @XmlElement(name = "ModfdIsseAllcn")
    protected ModificationScope21 modfdIsseAllcn;
    @XmlElement(name = "ModfdSvgsInvstmtPlan")
    protected List<ModificationScope25> modfdSvgsInvstmtPlan;
    @XmlElement(name = "ModfdWdrwlInvstmtPlan")
    protected List<ModificationScope25> modfdWdrwlInvstmtPlan;
    @XmlElement(name = "ModfdCshSttlm")
    protected List<InvestmentFundCashSettlementInformation8> modfdCshSttlm;
    @XmlElement(name = "ModfdSvcLvlAgrmt")
    protected List<ModificationScope22> modfdSvcLvlAgrmt;
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
    public AccountModificationInstructionV05 setMsgId(MessageIdentification1 value) {
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
    public AccountModificationInstructionV05 setPrvsRef(AdditionalReference3 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the instrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountModification1 }
     *     
     */
    public InvestmentAccountModification1 getInstrDtls() {
        return instrDtls;
    }

    /**
     * Sets the value of the instrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountModification1 }
     *     
     */
    public AccountModificationInstructionV05 setInstrDtls(InvestmentAccountModification1 value) {
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
    public AccountModificationInstructionV05 setInvstmtAcctSelctn(InvestmentAccountSelection2 value) {
        this.invstmtAcctSelctn = value;
        return this;
    }

    /**
     * Gets the value of the modfdInvstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount47 }
     *     
     */
    public InvestmentAccount47 getModfdInvstmtAcct() {
        return modfdInvstmtAcct;
    }

    /**
     * Sets the value of the modfdInvstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount47 }
     *     
     */
    public AccountModificationInstructionV05 setModfdInvstmtAcct(InvestmentAccount47 value) {
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
     * {@link AccountParties11 }
     * 
     * 
     */
    public List<AccountParties11> getModfdAcctPties() {
        if (modfdAcctPties == null) {
            modfdAcctPties = new ArrayList<AccountParties11>();
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
     * {@link ModificationScope20 }
     * 
     * 
     */
    public List<ModificationScope20> getModfdIntrmies() {
        if (modfdIntrmies == null) {
            modfdIntrmies = new ArrayList<ModificationScope20>();
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
    public AccountModificationInstructionV05 setModfdPlcmnt(ReferredAgent1 value) {
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
    public AccountModificationInstructionV05 setModfdIsseAllcn(ModificationScope21 value) {
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
     * {@link ModificationScope25 }
     * 
     * 
     */
    public List<ModificationScope25> getModfdSvgsInvstmtPlan() {
        if (modfdSvgsInvstmtPlan == null) {
            modfdSvgsInvstmtPlan = new ArrayList<ModificationScope25>();
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
     * {@link ModificationScope25 }
     * 
     * 
     */
    public List<ModificationScope25> getModfdWdrwlInvstmtPlan() {
        if (modfdWdrwlInvstmtPlan == null) {
            modfdWdrwlInvstmtPlan = new ArrayList<ModificationScope25>();
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
     * {@link InvestmentFundCashSettlementInformation8 }
     * 
     * 
     */
    public List<InvestmentFundCashSettlementInformation8> getModfdCshSttlm() {
        if (modfdCshSttlm == null) {
            modfdCshSttlm = new ArrayList<InvestmentFundCashSettlementInformation8>();
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
     * {@link ModificationScope22 }
     * 
     * 
     */
    public List<ModificationScope22> getModfdSvcLvlAgrmt() {
        if (modfdSvcLvlAgrmt == null) {
            modfdSvcLvlAgrmt = new ArrayList<ModificationScope22>();
        }
        return this.modfdSvcLvlAgrmt;
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
    public AccountModificationInstructionV05 setMktPrctcVrsn(MarketPracticeVersion1 value) {
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
    public AccountModificationInstructionV05 addModfdAcctPties(AccountParties11 modfdAcctPties) {
        getModfdAcctPties().add(modfdAcctPties);
        return this;
    }

    /**
     * Adds a new item to the modfdIntrmies list.
     * @see #getModfdIntrmies()
     * 
     */
    public AccountModificationInstructionV05 addModfdIntrmies(ModificationScope20 modfdIntrmies) {
        getModfdIntrmies().add(modfdIntrmies);
        return this;
    }

    /**
     * Adds a new item to the modfdSvgsInvstmtPlan list.
     * @see #getModfdSvgsInvstmtPlan()
     * 
     */
    public AccountModificationInstructionV05 addModfdSvgsInvstmtPlan(ModificationScope25 modfdSvgsInvstmtPlan) {
        getModfdSvgsInvstmtPlan().add(modfdSvgsInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the modfdWdrwlInvstmtPlan list.
     * @see #getModfdWdrwlInvstmtPlan()
     * 
     */
    public AccountModificationInstructionV05 addModfdWdrwlInvstmtPlan(ModificationScope25 modfdWdrwlInvstmtPlan) {
        getModfdWdrwlInvstmtPlan().add(modfdWdrwlInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the modfdCshSttlm list.
     * @see #getModfdCshSttlm()
     * 
     */
    public AccountModificationInstructionV05 addModfdCshSttlm(InvestmentFundCashSettlementInformation8 modfdCshSttlm) {
        getModfdCshSttlm().add(modfdCshSttlm);
        return this;
    }

    /**
     * Adds a new item to the modfdSvcLvlAgrmt list.
     * @see #getModfdSvcLvlAgrmt()
     * 
     */
    public AccountModificationInstructionV05 addModfdSvcLvlAgrmt(ModificationScope22 modfdSvcLvlAgrmt) {
        getModfdSvcLvlAgrmt().add(modfdSvcLvlAgrmt);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public AccountModificationInstructionV05 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
