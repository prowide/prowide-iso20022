
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
 * An account servicer, eg, a registrar, transfer agent or custodian bank sends the AccountDetailsConfirmation message to an account owner, eg, an investor to confirm the opening of an investment fund account, execution of an AccountModificationInstruction or to return information requested in a GetAccountDetails message.
 * Usage
 * The AccountDetailsConfirmation message is used to confirm the opening of an account, modification of an account or the provision of information requested in a previously sent GetAccountDetails message. The message contains detailed information relevant to the opened account.
 * When the AccountDetailsConfirmation is used to confirm execution of an AccountModificationInstruction message, it contains the modified subsets of account details that were specified in the AccountModificationInstruction.
 * When the AccountDetailsConfirmation is used to reply to a GetAccountDetails message, it returns the selected subsets of account details that were specified in the GetAccountDetails message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDetailsConfirmationV02", propOrder = {
    "msgId",
    "ordrRef",
    "rltdRef",
    "confDtls",
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
public class AccountDetailsConfirmationV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "OrdrRef")
    protected InvestmentFundOrder4 ordrRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference3 rltdRef;
    @XmlElement(name = "ConfDtls", required = true)
    protected AccountManagementConfirmation1 confDtls;
    @XmlElement(name = "InvstmtAcct")
    protected InvestmentAccount27 invstmtAcct;
    @XmlElement(name = "AcctPties")
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
    public AccountDetailsConfirmationV02 setMsgId(MessageIdentification1 value) {
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
    public AccountDetailsConfirmationV02 setOrdrRef(InvestmentFundOrder4 value) {
        this.ordrRef = value;
        return this;
    }

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
    public AccountDetailsConfirmationV02 setRltdRef(AdditionalReference3 value) {
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
    public AccountDetailsConfirmationV02 setConfDtls(AccountManagementConfirmation1 value) {
        this.confDtls = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount27 }
     *     
     */
    public InvestmentAccount27 getInvstmtAcct() {
        return invstmtAcct;
    }

    /**
     * Sets the value of the invstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount27 }
     *     
     */
    public AccountDetailsConfirmationV02 setInvstmtAcct(InvestmentAccount27 value) {
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
    public AccountDetailsConfirmationV02 setAcctPties(AccountParties5 value) {
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
    public AccountDetailsConfirmationV02 setPlcmnt(ReferredAgent1 value) {
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
    public AccountDetailsConfirmationV02 setNewIsseAllcn(NewIssueAllocation1 value) {
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
    public AccountDetailsConfirmationV02 setCshSttlm(InvestmentFundCashSettlementInformation3 value) {
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
    public AccountDetailsConfirmationV02 addIntrmies(Intermediary12 intrmies) {
        getIntrmies().add(intrmies);
        return this;
    }

    /**
     * Adds a new item to the svgsInvstmtPlan list.
     * @see #getSvgsInvstmtPlan()
     * 
     */
    public AccountDetailsConfirmationV02 addSvgsInvstmtPlan(InvestmentPlan4 svgsInvstmtPlan) {
        getSvgsInvstmtPlan().add(svgsInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the wdrwlInvstmtPlan list.
     * @see #getWdrwlInvstmtPlan()
     * 
     */
    public AccountDetailsConfirmationV02 addWdrwlInvstmtPlan(InvestmentPlan4 wdrwlInvstmtPlan) {
        getWdrwlInvstmtPlan().add(wdrwlInvstmtPlan);
        return this;
    }

    /**
     * Adds a new item to the svcLvlAgrmt list.
     * @see #getSvcLvlAgrmt()
     * 
     */
    public AccountDetailsConfirmationV02 addSvcLvlAgrmt(DocumentToSend1 svcLvlAgrmt) {
        getSvcLvlAgrmt().add(svcLvlAgrmt);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public AccountDetailsConfirmationV02 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
