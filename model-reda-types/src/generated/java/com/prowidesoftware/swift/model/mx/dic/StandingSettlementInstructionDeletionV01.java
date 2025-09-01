
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
 * An instructing party sends the StandingSettlementInstructionDeletion message to the receiver to delete a previously sent StandingSettlementInstruction message. The message can also be used to notify a counterparty of the deletion of a standing settlement information.
 * 
 * Usage
 * The instructing party (initiator) is:
 * • An account servicer, for example, a global custodian or prime broker
 * • A counterparty in a transaction, for example:
 * 	- an investment manager (executing broker),
 * 	- a global custodian (executing broker, prime broker)
 * • A vendor's application communicating on behalf of an account servicer or counterparty
 * The receiver is:
 * • An account owner, for example, an investment manager, hedge fund administrator or a party to which SSI operations have been outsourced
 * • A counterparty, for example:
 * 	- an investment manager (executing broker)
 * 	- a global custodian (executing broker, prime broker)
 * • A vendor's application communicating on behalf of the account owner or counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingSettlementInstructionDeletionV01", propOrder = {
    "msgRefId",
    "fctvDtDtls",
    "acctId",
    "mktId",
    "sttlmDtls",
    "splmtryData"
})
public class StandingSettlementInstructionDeletionV01 {

    @XmlElement(name = "MsgRefId", required = true)
    protected String msgRefId;
    @XmlElement(name = "FctvDtDtls")
    protected EffectiveDate1 fctvDtDtls;
    @XmlElement(name = "AcctId", required = true)
    protected List<AccountIdentification26> acctId;
    @XmlElement(name = "MktId", required = true)
    protected MarketIdentificationOrCashPurpose1Choice mktId;
    @XmlElement(name = "SttlmDtls", required = true)
    protected PartyOrCurrency1Choice sttlmDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgRefId() {
        return msgRefId;
    }

    /**
     * Sets the value of the msgRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StandingSettlementInstructionDeletionV01 setMsgRefId(String value) {
        this.msgRefId = value;
        return this;
    }

    /**
     * Gets the value of the fctvDtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveDate1 }
     *     
     */
    public EffectiveDate1 getFctvDtDtls() {
        return fctvDtDtls;
    }

    /**
     * Sets the value of the fctvDtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveDate1 }
     *     
     */
    public StandingSettlementInstructionDeletionV01 setFctvDtDtls(EffectiveDate1 value) {
        this.fctvDtDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentification26 }
     * 
     * 
     */
    public List<AccountIdentification26> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<AccountIdentification26>();
        }
        return this.acctId;
    }

    /**
     * Gets the value of the mktId property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentificationOrCashPurpose1Choice }
     *     
     */
    public MarketIdentificationOrCashPurpose1Choice getMktId() {
        return mktId;
    }

    /**
     * Sets the value of the mktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentificationOrCashPurpose1Choice }
     *     
     */
    public StandingSettlementInstructionDeletionV01 setMktId(MarketIdentificationOrCashPurpose1Choice value) {
        this.mktId = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyOrCurrency1Choice }
     *     
     */
    public PartyOrCurrency1Choice getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyOrCurrency1Choice }
     *     
     */
    public StandingSettlementInstructionDeletionV01 setSttlmDtls(PartyOrCurrency1Choice value) {
        this.sttlmDtls = value;
        return this;
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
     * Adds a new item to the acctId list.
     * @see #getAcctId()
     * 
     */
    public StandingSettlementInstructionDeletionV01 addAcctId(AccountIdentification26 acctId) {
        getAcctId().add(acctId);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public StandingSettlementInstructionDeletionV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
