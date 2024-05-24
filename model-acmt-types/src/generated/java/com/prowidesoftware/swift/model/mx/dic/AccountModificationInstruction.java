
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
 * The AccountModificationInstruction message is sent by an account owner, eg, an investor or its designated agent, to an account servicer, eg, a registrar, transfer agent, or custodian bank. There may be one or more intermediary parties, eg, an investment manager or an investment funds hub, between the account owner and the account servicer.
 * This message is used to modify, ie, create, update or delete, specific details of an existing investment fund account.
 * Usage
 * The AccountModificationInstruction message is used by an account owner during the lifecycle of an account to modify the details of an existing account.
 * The AccountModificationInstruction message has three uses. It is used:
 * - to maintain/update any of the existing account details, eg, to update the address of the beneficiary or modify the preference to income from distribution to capitalisation, or
 * - to add/create specific details to the existing account when these details were not yet recorded at the time of account creation, eg, to add a second address or to establish new cash settlement standing instructions, or
 * - to delete specific account details, eg, delete cash standing instructions.
 * This message cannot be used to delete an entire account, as institution specific, and regulatory rules pertaining to account deletion are diverse.
 * The usage of this message may be subject to service level agreements between the counterparties.
 * Execution of the AccountModificationInstruction is confirmed via an AccountDetailsConfirmation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountModificationInstruction", propOrder = {
    "prvsRef",
    "instrDtls",
    "invstmtAcctSelctn",
    "modfdInvstmtAcct",
    "modfdAcctPties",
    "modfdIntrmies",
    "modfdSvgsInvstmtPlan",
    "modfdWdrwlInvstmtPlan",
    "modfdCshSttlm",
    "xtnsn"
})
public class AccountModificationInstruction {

    @XmlElement(name = "PrvsRef")
    protected AdditionalReference3 prvsRef;
    @XmlElement(name = "InstrDtls")
    protected InvestmentAccountModificationDetails instrDtls;
    @XmlElement(name = "InvstmtAcctSelctn", required = true)
    protected InvestmentAccountSelection1 invstmtAcctSelctn;
    @XmlElement(name = "ModfdInvstmtAcct")
    protected InvestmentAccount18 modfdInvstmtAcct;
    @XmlElement(name = "ModfdAcctPties")
    protected List<AccountParties3> modfdAcctPties;
    @XmlElement(name = "ModfdIntrmies")
    protected List<ModificationScope4> modfdIntrmies;
    @XmlElement(name = "ModfdSvgsInvstmtPlan")
    protected List<ModificationScope5> modfdSvgsInvstmtPlan;
    @XmlElement(name = "ModfdWdrwlInvstmtPlan")
    protected List<ModificationScope5> modfdWdrwlInvstmtPlan;
    @XmlElement(name = "ModfdCshSttlm")
    protected List<InvestmentFundCashSettlementInformation2> modfdCshSttlm;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

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
    public AccountModificationInstruction setPrvsRef(AdditionalReference3 value) {
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
    public AccountModificationInstruction setInstrDtls(InvestmentAccountModificationDetails value) {
        this.instrDtls = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctSelctn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountSelection1 }
     *     
     */
    public InvestmentAccountSelection1 getInvstmtAcctSelctn() {
        return invstmtAcctSelctn;
    }

    /**
     * Sets the value of the invstmtAcctSelctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountSelection1 }
     *     
     */
    public AccountModificationInstruction setInvstmtAcctSelctn(InvestmentAccountSelection1 value) {
        this.invstmtAcctSelctn = value;
        return this;
    }

    /**
     * Gets the value of the modfdInvstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount18 }
     *     
     */
    public InvestmentAccount18 getModfdInvstmtAcct() {
        return modfdInvstmtAcct;
    }

    /**
     * Sets the value of the modfdInvstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount18 }
     *     
     */
    public AccountModificationInstruction setModfdInvstmtAcct(InvestmentAccount18 value) {
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
     * {@link AccountParties3 }
     * 
     * 
     * @return
     *     The value of the modfdAcctPties property.
     */
    public List<AccountParties3> getModfdAcctPties() {
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
     * {@link ModificationScope4 }
     * 
     * 
     * @return
     *     The value of the modfdIntrmies property.
     */
    public List<ModificationScope4> getModfdIntrmies() {
        if (modfdIntrmies == null) {
            modfdIntrmies = new ArrayList<>();
        }
        return this.modfdIntrmies;
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
     * {@link ModificationScope5 }
     * 
     * 
     * @return
     *     The value of the modfdSvgsInvstmtPlan property.
     */
    public List<ModificationScope5> getModfdSvgsInvstmtPlan() {
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
     * {@link ModificationScope5 }
     * 
     * 
     * @return
     *     The value of the modfdWdrwlInvstmtPlan property.
     */
    public List<ModificationScope5> getModfdWdrwlInvstmtPlan() {
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
     * {@link InvestmentFundCashSettlementInformation2 }
     * 
     * 
     * @return
     *     The value of the modfdCshSttlm property.
     */
    public List<InvestmentFundCashSettlementInformation2> getModfdCshSttlm() {
        if (modfdCshSttlm == null) {
            modfdCshSttlm = new ArrayList<>();
        }
        return this.modfdCshSttlm;
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
    public AccountModificationInstruction addModfdAcctPties(AccountParties3 modfdAcctPties) {
        getModfdAcctPties().add(modfdAcctPties);
        return this;
    }

    /**
     * Adds a new item to the modfdIntrmies list.
     * @see #getModfdIntrmies()
     * 
     */
    public AccountModificationInstruction addModfdIntrmies(ModificationScope4 modfdIntrmies) {
        getModfdIntrmies().add(modfdIntrmies);
        return this;
    }

    /**
     * Adds a new item to the modfdSvgsInvstmtPlan list.
     * @see #getModfdSvgsInvstmtPlan()
     * 
     */
    public AccountModificationInstruction addModfdSvgsInvstmtPlan(ModificationScope5 modfdSvgsInvstmtPlan) {
        getModfdSvgsInvstmtPlan().add(modfdSvgsInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the modfdWdrwlInvstmtPlan list.
     * @see #getModfdWdrwlInvstmtPlan()
     * 
     */
    public AccountModificationInstruction addModfdWdrwlInvstmtPlan(ModificationScope5 modfdWdrwlInvstmtPlan) {
        getModfdWdrwlInvstmtPlan().add(modfdWdrwlInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the modfdCshSttlm list.
     * @see #getModfdCshSttlm()
     * 
     */
    public AccountModificationInstruction addModfdCshSttlm(InvestmentFundCashSettlementInformation2 modfdCshSttlm) {
        getModfdCshSttlm().add(modfdCshSttlm);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public AccountModificationInstruction addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
