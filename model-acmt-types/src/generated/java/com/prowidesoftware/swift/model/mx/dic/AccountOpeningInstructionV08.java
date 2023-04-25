
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
 * The AccountOpeningInstruction message is sent by an account owner, for example, an investor or its designated agent to the account servicer, for example, a registrar, transfer agent, custodian or securities depository, to instruct the opening of an account or the opening of an account and the establishment of an investment plan.
 * Usage
 * The AccountOpeningInstruction is used to open an account directly or indirectly with the account servicer or an intermediary.
 * In some markets, for example, Australia, and for some products in the United Kingdom, a first order (also known as a deposit instruction) is placed at the same time as the account opening. To cater for this scenario, an order message can be linked (via references in the message) to the AccountOpeningInstruction message when needed.
 * Execution of the AccountOpeningInstruction is confirmed via an AccountDetailsConfirmation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountOpeningInstructionV08", propOrder = {
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
    "addtlInf",
    "mktPrctcVrsn",
    "xtnsn"
})
public class AccountOpeningInstructionV08 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "OrdrRef")
    protected InvestmentFundOrder4 ordrRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference13 prvsRef;
    @XmlElement(name = "InstrDtls", required = true)
    protected InvestmentAccountOpening4 instrDtls;
    @XmlElement(name = "InvstmtAcct", required = true)
    protected InvestmentAccount73 invstmtAcct;
    @XmlElement(name = "AcctPties", required = true)
    protected AccountParties17 acctPties;
    @XmlElement(name = "Intrmies")
    protected List<Intermediary46> intrmies;
    @XmlElement(name = "Plcmnt")
    protected ReferredAgent3 plcmnt;
    @XmlElement(name = "NewIsseAllcn")
    protected NewIssueAllocation2 newIsseAllcn;
    @XmlElement(name = "SvgsInvstmtPlan")
    protected List<InvestmentPlan17> svgsInvstmtPlan;
    @XmlElement(name = "WdrwlInvstmtPlan")
    protected List<InvestmentPlan17> wdrwlInvstmtPlan;
    @XmlElement(name = "CshSttlm")
    protected List<CashSettlement3> cshSttlm;
    @XmlElement(name = "SvcLvlAgrmt")
    protected List<DocumentToSend4> svcLvlAgrmt;
    @XmlElement(name = "AddtlInf")
    protected List<AdditiononalInformation13> addtlInf;
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
    public AccountOpeningInstructionV08 setMsgId(MessageIdentification1 value) {
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
    public AccountOpeningInstructionV08 setOrdrRef(InvestmentFundOrder4 value) {
        this.ordrRef = value;
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
    public AccountOpeningInstructionV08 setPrvsRef(AdditionalReference13 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the instrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOpening4 }
     *     
     */
    public InvestmentAccountOpening4 getInstrDtls() {
        return instrDtls;
    }

    /**
     * Sets the value of the instrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOpening4 }
     *     
     */
    public AccountOpeningInstructionV08 setInstrDtls(InvestmentAccountOpening4 value) {
        this.instrDtls = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount73 }
     *     
     */
    public InvestmentAccount73 getInvstmtAcct() {
        return invstmtAcct;
    }

    /**
     * Sets the value of the invstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount73 }
     *     
     */
    public AccountOpeningInstructionV08 setInvstmtAcct(InvestmentAccount73 value) {
        this.invstmtAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctPties property.
     * 
     * @return
     *     possible object is
     *     {@link AccountParties17 }
     *     
     */
    public AccountParties17 getAcctPties() {
        return acctPties;
    }

    /**
     * Sets the value of the acctPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountParties17 }
     *     
     */
    public AccountOpeningInstructionV08 setAcctPties(AccountParties17 value) {
        this.acctPties = value;
        return this;
    }

    /**
     * Gets the value of the intrmies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrmies property.
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
     * {@link Intermediary46 }
     * 
     * 
     * @return
     *     The value of the intrmies property.
     */
    public List<Intermediary46> getIntrmies() {
        if (intrmies == null) {
            intrmies = new ArrayList<>();
        }
        return this.intrmies;
    }

    /**
     * Gets the value of the plcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredAgent3 }
     *     
     */
    public ReferredAgent3 getPlcmnt() {
        return plcmnt;
    }

    /**
     * Sets the value of the plcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredAgent3 }
     *     
     */
    public AccountOpeningInstructionV08 setPlcmnt(ReferredAgent3 value) {
        this.plcmnt = value;
        return this;
    }

    /**
     * Gets the value of the newIsseAllcn property.
     * 
     * @return
     *     possible object is
     *     {@link NewIssueAllocation2 }
     *     
     */
    public NewIssueAllocation2 getNewIsseAllcn() {
        return newIsseAllcn;
    }

    /**
     * Sets the value of the newIsseAllcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewIssueAllocation2 }
     *     
     */
    public AccountOpeningInstructionV08 setNewIsseAllcn(NewIssueAllocation2 value) {
        this.newIsseAllcn = value;
        return this;
    }

    /**
     * Gets the value of the svgsInvstmtPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svgsInvstmtPlan property.
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
     * {@link InvestmentPlan17 }
     * 
     * 
     * @return
     *     The value of the svgsInvstmtPlan property.
     */
    public List<InvestmentPlan17> getSvgsInvstmtPlan() {
        if (svgsInvstmtPlan == null) {
            svgsInvstmtPlan = new ArrayList<>();
        }
        return this.svgsInvstmtPlan;
    }

    /**
     * Gets the value of the wdrwlInvstmtPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wdrwlInvstmtPlan property.
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
     * {@link InvestmentPlan17 }
     * 
     * 
     * @return
     *     The value of the wdrwlInvstmtPlan property.
     */
    public List<InvestmentPlan17> getWdrwlInvstmtPlan() {
        if (wdrwlInvstmtPlan == null) {
            wdrwlInvstmtPlan = new ArrayList<>();
        }
        return this.wdrwlInvstmtPlan;
    }

    /**
     * Gets the value of the cshSttlm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshSttlm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshSttlm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashSettlement3 }
     * 
     * 
     * @return
     *     The value of the cshSttlm property.
     */
    public List<CashSettlement3> getCshSttlm() {
        if (cshSttlm == null) {
            cshSttlm = new ArrayList<>();
        }
        return this.cshSttlm;
    }

    /**
     * Gets the value of the svcLvlAgrmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcLvlAgrmt property.
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
     * {@link DocumentToSend4 }
     * 
     * 
     * @return
     *     The value of the svcLvlAgrmt property.
     */
    public List<DocumentToSend4> getSvcLvlAgrmt() {
        if (svcLvlAgrmt == null) {
            svcLvlAgrmt = new ArrayList<>();
        }
        return this.svcLvlAgrmt;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditiononalInformation13 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditiononalInformation13> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
    public AccountOpeningInstructionV08 setMktPrctcVrsn(MarketPracticeVersion1 value) {
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
     * Adds a new item to the intrmies list.
     * @see #getIntrmies()
     * 
     */
    public AccountOpeningInstructionV08 addIntrmies(Intermediary46 intrmies) {
        getIntrmies().add(intrmies);
        return this;
    }

    /**
     * Adds a new item to the svgsInvstmtPlan list.
     * @see #getSvgsInvstmtPlan()
     * 
     */
    public AccountOpeningInstructionV08 addSvgsInvstmtPlan(InvestmentPlan17 svgsInvstmtPlan) {
        getSvgsInvstmtPlan().add(svgsInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the wdrwlInvstmtPlan list.
     * @see #getWdrwlInvstmtPlan()
     * 
     */
    public AccountOpeningInstructionV08 addWdrwlInvstmtPlan(InvestmentPlan17 wdrwlInvstmtPlan) {
        getWdrwlInvstmtPlan().add(wdrwlInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the cshSttlm list.
     * @see #getCshSttlm()
     * 
     */
    public AccountOpeningInstructionV08 addCshSttlm(CashSettlement3 cshSttlm) {
        getCshSttlm().add(cshSttlm);
        return this;
    }

    /**
     * Adds a new item to the svcLvlAgrmt list.
     * @see #getSvcLvlAgrmt()
     * 
     */
    public AccountOpeningInstructionV08 addSvcLvlAgrmt(DocumentToSend4 svcLvlAgrmt) {
        getSvcLvlAgrmt().add(svcLvlAgrmt);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public AccountOpeningInstructionV08 addAddtlInf(AdditiononalInformation13 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public AccountOpeningInstructionV08 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
