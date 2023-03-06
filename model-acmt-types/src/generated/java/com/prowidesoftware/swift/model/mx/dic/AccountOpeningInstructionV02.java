
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
 * An account owner, for example, an investor or its designated agent sends the AccountOpeningInstruction message to an account servicer, for example, a registrar, transfer agent or custodian to instruct the opening of an account or the opening of an account and establishing an investment plan.
 * Usage
 * The AccountOpeningInstruction is used to open an account directly or indirectly with the account servicer or an intermediary.
 * In some markets, for example, Australia, and for some products in the United Kingdom, a first order (also known as a deposit instruction) is placed at the same time as the account opening. To cater for this scenario, an order message can be linked (via references in the message) to the AccountOpeningInstruction message when needed.
 * Execution of the AccountOpeningInstruction is confirmed via an AccountDetailsConfirmation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountOpeningInstructionV02", propOrder = {
    "msgId",
    "ordrRef",
    "prvsRef",
    "instrDtls",
    "invstmtAcct",
    "acctPties",
    "intrmies",
    "plcmnt",
    "newIsseAllcn",
    "svgsInvstmtPlan",
    "wdrwlInvstmtPlan",
    "cshSttlm",
    "svcLvlAgrmt",
    "xtnsn"
})
public class AccountOpeningInstructionV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "OrdrRef")
    protected InvestmentFundOrder4 ordrRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference3 prvsRef;
    @XmlElement(name = "InstrDtls", required = true)
    protected InvestmentAccountOpeningDetails instrDtls;
    @XmlElement(name = "InvstmtAcct", required = true)
    protected InvestmentAccount26 invstmtAcct;
    @XmlElement(name = "AcctPties", required = true)
    protected AccountParties5 acctPties;
    @XmlElement(name = "Intrmies")
    protected List<Intermediary12> intrmies;
    @XmlElement(name = "Plcmnt")
    protected ReferredAgent1 plcmnt;
    @XmlElement(name = "NewIsseAllcn")
    protected NewIssueAllocation1 newIsseAllcn;
    @XmlElement(name = "SvgsInvstmtPlan")
    protected List<InvestmentPlan4> svgsInvstmtPlan;
    @XmlElement(name = "WdrwlInvstmtPlan")
    protected List<InvestmentPlan4> wdrwlInvstmtPlan;
    @XmlElement(name = "CshSttlm")
    protected InvestmentFundCashSettlementInformation3 cshSttlm;
    @XmlElement(name = "SvcLvlAgrmt")
    protected List<DocumentToSend1> svcLvlAgrmt;
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
    public AccountOpeningInstructionV02 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundOrder4 }
     *     
     */
    public InvestmentFundOrder4 getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundOrder4 }
     *     
     */
    public AccountOpeningInstructionV02 setOrdrRef(InvestmentFundOrder4 value) {
        this.ordrRef = value;
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
    public AccountOpeningInstructionV02 setPrvsRef(AdditionalReference3 value) {
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
    public AccountOpeningInstructionV02 setInstrDtls(InvestmentAccountOpeningDetails value) {
        this.instrDtls = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount26 }
     *     
     */
    public InvestmentAccount26 getInvstmtAcct() {
        return invstmtAcct;
    }

    /**
     * Sets the value of the invstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount26 }
     *     
     */
    public AccountOpeningInstructionV02 setInvstmtAcct(InvestmentAccount26 value) {
        this.invstmtAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctPties property.
     * 
     * @return
     *     possible object is
     *     {@link AccountParties5 }
     *     
     */
    public AccountParties5 getAcctPties() {
        return acctPties;
    }

    /**
     * Sets the value of the acctPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountParties5 }
     *     
     */
    public AccountOpeningInstructionV02 setAcctPties(AccountParties5 value) {
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
     * {@link Intermediary12 }
     * 
     * 
     */
    public List<Intermediary12> getIntrmies() {
        if (intrmies == null) {
            intrmies = new ArrayList<Intermediary12>();
        }
        return this.intrmies;
    }

    /**
     * Gets the value of the plcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredAgent1 }
     *     
     */
    public ReferredAgent1 getPlcmnt() {
        return plcmnt;
    }

    /**
     * Sets the value of the plcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredAgent1 }
     *     
     */
    public AccountOpeningInstructionV02 setPlcmnt(ReferredAgent1 value) {
        this.plcmnt = value;
        return this;
    }

    /**
     * Gets the value of the newIsseAllcn property.
     * 
     * @return
     *     possible object is
     *     {@link NewIssueAllocation1 }
     *     
     */
    public NewIssueAllocation1 getNewIsseAllcn() {
        return newIsseAllcn;
    }

    /**
     * Sets the value of the newIsseAllcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewIssueAllocation1 }
     *     
     */
    public AccountOpeningInstructionV02 setNewIsseAllcn(NewIssueAllocation1 value) {
        this.newIsseAllcn = value;
        return this;
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
     * {@link InvestmentPlan4 }
     * 
     * 
     */
    public List<InvestmentPlan4> getSvgsInvstmtPlan() {
        if (svgsInvstmtPlan == null) {
            svgsInvstmtPlan = new ArrayList<InvestmentPlan4>();
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
     * {@link InvestmentPlan4 }
     * 
     * 
     */
    public List<InvestmentPlan4> getWdrwlInvstmtPlan() {
        if (wdrwlInvstmtPlan == null) {
            wdrwlInvstmtPlan = new ArrayList<InvestmentPlan4>();
        }
        return this.wdrwlInvstmtPlan;
    }

    /**
     * Gets the value of the cshSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundCashSettlementInformation3 }
     *     
     */
    public InvestmentFundCashSettlementInformation3 getCshSttlm() {
        return cshSttlm;
    }

    /**
     * Sets the value of the cshSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundCashSettlementInformation3 }
     *     
     */
    public AccountOpeningInstructionV02 setCshSttlm(InvestmentFundCashSettlementInformation3 value) {
        this.cshSttlm = value;
        return this;
    }

    /**
     * Gets the value of the svcLvlAgrmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcLvlAgrmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcLvlAgrmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentToSend1 }
     * 
     * 
     */
    public List<DocumentToSend1> getSvcLvlAgrmt() {
        if (svcLvlAgrmt == null) {
            svcLvlAgrmt = new ArrayList<DocumentToSend1>();
        }
        return this.svcLvlAgrmt;
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
    public AccountOpeningInstructionV02 addIntrmies(Intermediary12 intrmies) {
        getIntrmies().add(intrmies);
        return this;
    }

    /**
     * Adds a new item to the svgsInvstmtPlan list.
     * @see #getSvgsInvstmtPlan()
     * 
     */
    public AccountOpeningInstructionV02 addSvgsInvstmtPlan(InvestmentPlan4 svgsInvstmtPlan) {
        getSvgsInvstmtPlan().add(svgsInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the wdrwlInvstmtPlan list.
     * @see #getWdrwlInvstmtPlan()
     * 
     */
    public AccountOpeningInstructionV02 addWdrwlInvstmtPlan(InvestmentPlan4 wdrwlInvstmtPlan) {
        getWdrwlInvstmtPlan().add(wdrwlInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the svcLvlAgrmt list.
     * @see #getSvcLvlAgrmt()
     * 
     */
    public AccountOpeningInstructionV02 addSvcLvlAgrmt(DocumentToSend1 svcLvlAgrmt) {
        getSvcLvlAgrmt().add(svcLvlAgrmt);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public AccountOpeningInstructionV02 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
