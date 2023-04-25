
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
 * An instructing party sends the StandingSettlementInstructionCancellation message to the receiver to cancel a previously sent StandingSettlementInstruction message. The message can also be used to notify a counterparty of the deletion of a standing settlement information.
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
@XmlType(name = "StandingSettlementInstructionCancellationV01", propOrder = {
    "msgRefId",
    "fctvDtDtls",
    "acctId",
    "mktId",
    "sttlmDtls",
    "prvsMsgRef",
    "splmtryData"
})
public class StandingSettlementInstructionCancellationV01 {

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
    @XmlElement(name = "PrvsMsgRef", required = true)
    protected String prvsMsgRef;
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
    public StandingSettlementInstructionCancellationV01 setMsgRefId(String value) {
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
    public StandingSettlementInstructionCancellationV01 setFctvDtDtls(EffectiveDate1 value) {
        this.fctvDtDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctId property.
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
     * @return
     *     The value of the acctId property.
     */
    public List<AccountIdentification26> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<>();
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
    public StandingSettlementInstructionCancellationV01 setMktId(MarketIdentificationOrCashPurpose1Choice value) {
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
    public StandingSettlementInstructionCancellationV01 setSttlmDtls(PartyOrCurrency1Choice value) {
        this.sttlmDtls = value;
        return this;
    }

    /**
     * Gets the value of the prvsMsgRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvsMsgRef() {
        return prvsMsgRef;
    }

    /**
     * Sets the value of the prvsMsgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StandingSettlementInstructionCancellationV01 setPrvsMsgRef(String value) {
        this.prvsMsgRef = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public StandingSettlementInstructionCancellationV01 addAcctId(AccountIdentification26 acctId) {
        getAcctId().add(acctId);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public StandingSettlementInstructionCancellationV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
