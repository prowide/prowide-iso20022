
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
 * The SecuritiesBalanceTransparencyReport message is sent by an account servicer, such as a custodian, central securities depository or international central securities depository, to the account owner to provide holdings information for the accounts that it services, to disclose underlying details of holdings on an omnibus account that the sender owns or operates at the receiver. The receiver may also be a custodian, central securities depository, international central securities depository, and the ultimate receiver may be a registrar, transfer agent, fund company, official agent of the reported instrument(s) and/or other parties.
 * The SecuritiesBalanceTransparencyReport message provides transparency of holdings through layers of custody chains in a consolidated statement, to allow for an efficient gathering of investor data, which, in turn, may be used to measure marketing effectiveness, validation of compliance with prospectuses and regulatory requirements, and the calculation of trailer fees and other retrocessions.
 * Usage
 * The SecuritiesBalanceTransparencyReport message is used to provide aggregated holdings information and a breakdown of holdings information.
 * A sender of the SecuritiesBalanceTransparencyReport message will identify its own safekeeping account (for example, an omnibus account in the ledger of the receiver) and holdings information at the level of account(s) for which the sender is the account servicer (that is, in the ledger of the sender). When relevant, the sender will aggregate its holdings information with holdings information of one or more sub levels and sub-sub levels of accounts, that is, with holdings information the sender has received from the owner(s) of the account(s) for which the sender is the account servicer.
 * A sender of the SecuritiesBalanceTransparencyReport message may also use it to send statements to its account owning customers, and these can be enrichments of statements that the respective account owners have previously provided to the sender.
 * Ultimately, the statement reaches the relevant fund company, for example, the transfer agent, that may use it for obtaining information about the custodians, distributors and commercial agreement references associated with holdings on an omnibus account at the ultimate place of safekeeping, for example, a central securities depository (CSD) or a register of shareholders.
 * When the message is sent by the owner of the account specified in SafekeepingAccountAndHoldings/AccountIdentification, the message will disclose holding details of the underlying owner(s) of the sender’s holdings with the receiver. This direction is commonly referred to as ‘downstream’. 
 * When the sender is the account servicer of an account owned by the receiver, for example, the account in AccountSubLevel1/AccountIdentification or AccountSubLevel2/AccountIdentification, the message is providing a statement of the receiver’s holdings with sender. This direction is commonly referred to as ‘upstream’, and the safekeeping account should identify the ultimate place of safekeeping (for example, an account in a transfer agent's register of shareholders).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesBalanceTransparencyReportV02", propOrder = {
    "msgId",
    "sndrId",
    "rcvrId",
    "pgntn",
    "stmtGnlDtls",
    "sfkpgAcctAndHldgs",
    "splmtryData"
})
public class SecuritiesBalanceTransparencyReportV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "SndrId", required = true)
    protected PartyIdentification100 sndrId;
    @XmlElement(name = "RcvrId")
    protected PartyIdentification100 rcvrId;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "StmtGnlDtls", required = true)
    protected Statement59 stmtGnlDtls;
    @XmlElement(name = "SfkpgAcctAndHldgs")
    protected List<SafekeepingAccount7> sfkpgAcctAndHldgs;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
    public SecuritiesBalanceTransparencyReportV02 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the sndrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getSndrId() {
        return sndrId;
    }

    /**
     * Sets the value of the sndrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public SecuritiesBalanceTransparencyReportV02 setSndrId(PartyIdentification100 value) {
        this.sndrId = value;
        return this;
    }

    /**
     * Gets the value of the rcvrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getRcvrId() {
        return rcvrId;
    }

    /**
     * Sets the value of the rcvrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public SecuritiesBalanceTransparencyReportV02 setRcvrId(PartyIdentification100 value) {
        this.rcvrId = value;
        return this;
    }

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public SecuritiesBalanceTransparencyReportV02 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement59 }
     *     
     */
    public Statement59 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement59 }
     *     
     */
    public SecuritiesBalanceTransparencyReportV02 setStmtGnlDtls(Statement59 value) {
        this.stmtGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcctAndHldgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sfkpgAcctAndHldgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfkpgAcctAndHldgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SafekeepingAccount7 }
     * 
     * 
     */
    public List<SafekeepingAccount7> getSfkpgAcctAndHldgs() {
        if (sfkpgAcctAndHldgs == null) {
            sfkpgAcctAndHldgs = new ArrayList<SafekeepingAccount7>();
        }
        return this.sfkpgAcctAndHldgs;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the sfkpgAcctAndHldgs list.
     * @see #getSfkpgAcctAndHldgs()
     * 
     */
    public SecuritiesBalanceTransparencyReportV02 addSfkpgAcctAndHldgs(SafekeepingAccount7 sfkpgAcctAndHldgs) {
        getSfkpgAcctAndHldgs().add(sfkpgAcctAndHldgs);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesBalanceTransparencyReportV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
