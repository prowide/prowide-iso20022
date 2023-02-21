
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
 * The AccountDetailsConfirmation message is sent by an account servicer eg, a registrar, transfer agent, or custodian bank, to an account owner or its designated agent, eg, an investor. There may be one or more intermediary parties, eg, an investment manager or an investment funds hub, between the account owner and the account servicer.
 * This message is used either to confirm the opening of an investment fund account, to confirm the execution of an AccountModificationInstruction, or to return information requested in a GetAccountDetails message.
 * Usage
 * The AccountDetailsConfirmation message is used by an account servicer to confirm the opening of an account. The message contains the detailed information relevant to the opened account.
 * When the AccountDetailsConfirmation is used to confirm execution of an AccountModificationInstruction message, it contains the modified subset(s) of account details that was/were specified in the AccountModificationInstruction.
 * When the AccountDetailsConfirmation is used to reply to a GetAccountDetails message, it returns the selected subset(s) of account details that was/were specified in the GetAccountDetails message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDetailsConfirmation", propOrder = {
    "rltdRef",
    "confDtls",
    "invstmtAcct",
    "acctPties",
    "intrmies",
    "svgsInvstmtPlan",
    "wdrwlInvstmtPlan",
    "cshSttlm",
    "xtnsn"
})
public class AccountDetailsConfirmation {

    @XmlElement(name = "RltdRef", required = true)
    protected AdditionalReference3 rltdRef;
    @XmlElement(name = "ConfDtls", required = true)
    protected AccountManagementConfirmation1 confDtls;
    @XmlElement(name = "InvstmtAcct")
    protected InvestmentAccount17 invstmtAcct;
    @XmlElement(name = "AcctPties")
    protected AccountParties2 acctPties;
    @XmlElement(name = "Intrmies")
    protected List<Intermediary5> intrmies;
    @XmlElement(name = "SvgsInvstmtPlan")
    protected List<InvestmentPlan2> svgsInvstmtPlan;
    @XmlElement(name = "WdrwlInvstmtPlan")
    protected List<InvestmentPlan2> wdrwlInvstmtPlan;
    @XmlElement(name = "CshSttlm")
    protected InvestmentFundCashSettlementInformation1 cshSttlm;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AccountDetailsConfirmation setRltdRef(AdditionalReference3 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the confDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementConfirmation1 }
     *     
     */
    public AccountManagementConfirmation1 getConfDtls() {
        return confDtls;
    }

    /**
     * Sets the value of the confDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementConfirmation1 }
     *     
     */
    public AccountDetailsConfirmation setConfDtls(AccountManagementConfirmation1 value) {
        this.confDtls = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount17 }
     *     
     */
    public InvestmentAccount17 getInvstmtAcct() {
        return invstmtAcct;
    }

    /**
     * Sets the value of the invstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount17 }
     *     
     */
    public AccountDetailsConfirmation setInvstmtAcct(InvestmentAccount17 value) {
        this.invstmtAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctPties property.
     * 
     * @return
     *     possible object is
     *     {@link AccountParties2 }
     *     
     */
    public AccountParties2 getAcctPties() {
        return acctPties;
    }

    /**
     * Sets the value of the acctPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountParties2 }
     *     
     */
    public AccountDetailsConfirmation setAcctPties(AccountParties2 value) {
        this.acctPties = value;
        return this;
    }

    /**
     * Gets the value of the intrmies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrmies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary5 }
     * 
     * 
     */
    public List<Intermediary5> getIntrmies() {
        if (intrmies == null) {
            intrmies = new ArrayList<Intermediary5>();
        }
        return this.intrmies;
    }

    /**
     * Gets the value of the svgsInvstmtPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svgsInvstmtPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvgsInvstmtPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentPlan2 }
     * 
     * 
     */
    public List<InvestmentPlan2> getSvgsInvstmtPlan() {
        if (svgsInvstmtPlan == null) {
            svgsInvstmtPlan = new ArrayList<InvestmentPlan2>();
        }
        return this.svgsInvstmtPlan;
    }

    /**
     * Gets the value of the wdrwlInvstmtPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wdrwlInvstmtPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWdrwlInvstmtPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentPlan2 }
     * 
     * 
     */
    public List<InvestmentPlan2> getWdrwlInvstmtPlan() {
        if (wdrwlInvstmtPlan == null) {
            wdrwlInvstmtPlan = new ArrayList<InvestmentPlan2>();
        }
        return this.wdrwlInvstmtPlan;
    }

    /**
     * Gets the value of the cshSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundCashSettlementInformation1 }
     *     
     */
    public InvestmentFundCashSettlementInformation1 getCshSttlm() {
        return cshSttlm;
    }

    /**
     * Sets the value of the cshSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundCashSettlementInformation1 }
     *     
     */
    public AccountDetailsConfirmation setCshSttlm(InvestmentFundCashSettlementInformation1 value) {
        this.cshSttlm = value;
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
     * Adds a new item to the intrmies list.
     * @see #getIntrmies()
     * 
     */
    public AccountDetailsConfirmation addIntrmies(Intermediary5 intrmies) {
        getIntrmies().add(intrmies);
        return this;
    }

    /**
     * Adds a new item to the svgsInvstmtPlan list.
     * @see #getSvgsInvstmtPlan()
     * 
     */
    public AccountDetailsConfirmation addSvgsInvstmtPlan(InvestmentPlan2 svgsInvstmtPlan) {
        getSvgsInvstmtPlan().add(svgsInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the wdrwlInvstmtPlan list.
     * @see #getWdrwlInvstmtPlan()
     * 
     */
    public AccountDetailsConfirmation addWdrwlInvstmtPlan(InvestmentPlan2 wdrwlInvstmtPlan) {
        getWdrwlInvstmtPlan().add(wdrwlInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public AccountDetailsConfirmation addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
