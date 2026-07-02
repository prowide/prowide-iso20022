
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The AccountOpeningInstruction message is sent by an account owner, eg, an investor or its designated agent, to an account servicer, eg, a registrar, transfer agent, or custodian bank. There may be one or more intermediary parties, eg, an investment manager or an investment funds hub, between the account owner and the account servicer.
 * This message is used to open an account, or to open an account and establish an investment plan. This message may also be used to provide account registration details.
 * Usage
 * The AccountOpeningInstruction message is used by an account owner to open an account directly with an account servicer.
 * or
 * It is used by an investor to open an account with an intermediary which, in turn, opens or has already opened an account with another intermediary or the account servicer.
 * In some markets, eg, Australia, and for some products in the United Kingdom, a first order (also known as a deposit instruction) is placed at the same time as the account opening. To cater for this scenario, an order message can be linked (via references in the message) to the AccountOpeningInstruction message when needed.
 * Execution of the AccountOpeningInstruction is confirmed via an AccountDetailsConfirmation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountOpeningInstruction", propOrder = {
    "prvsRef",
    "instrDtls",
    "invstmtAcct",
    "acctPties",
    "intrmies",
    "svgsInvstmtPlan",
    "wdrwlInvstmtPlan",
    "cshSttlm",
    "xtnsn"
})
public class AccountOpeningInstruction {

    @XmlElement(name = "PrvsRef")
    protected AdditionalReference3 prvsRef;
    @XmlElement(name = "InstrDtls", required = true)
    protected InvestmentAccountOpeningDetails instrDtls;
    @XmlElement(name = "InvstmtAcct", required = true)
    protected InvestmentAccount16 invstmtAcct;
    @XmlElement(name = "AcctPties", required = true)
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
    public AccountOpeningInstruction setPrvsRef(AdditionalReference3 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the instrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOpeningDetails }
     *     
     */
    public InvestmentAccountOpeningDetails getInstrDtls() {
        return instrDtls;
    }

    /**
     * Sets the value of the instrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOpeningDetails }
     *     
     */
    public AccountOpeningInstruction setInstrDtls(InvestmentAccountOpeningDetails value) {
        this.instrDtls = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount16 }
     *     
     */
    public InvestmentAccount16 getInvstmtAcct() {
        return invstmtAcct;
    }

    /**
     * Sets the value of the invstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount16 }
     *     
     */
    public AccountOpeningInstruction setInvstmtAcct(InvestmentAccount16 value) {
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
    public AccountOpeningInstruction setAcctPties(AccountParties2 value) {
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
    public AccountOpeningInstruction setCshSttlm(InvestmentFundCashSettlementInformation1 value) {
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
    public AccountOpeningInstruction addIntrmies(Intermediary5 intrmies) {
        getIntrmies().add(intrmies);
        return this;
    }

    /**
     * Adds a new item to the svgsInvstmtPlan list.
     * @see #getSvgsInvstmtPlan()
     * 
     */
    public AccountOpeningInstruction addSvgsInvstmtPlan(InvestmentPlan2 svgsInvstmtPlan) {
        getSvgsInvstmtPlan().add(svgsInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the wdrwlInvstmtPlan list.
     * @see #getWdrwlInvstmtPlan()
     * 
     */
    public AccountOpeningInstruction addWdrwlInvstmtPlan(InvestmentPlan2 wdrwlInvstmtPlan) {
        getWdrwlInvstmtPlan().add(wdrwlInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public AccountOpeningInstruction addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
