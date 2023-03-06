
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
 * An account owner sends a SecuritiesFinancingModificationInstruction to a securities financing transaction account servicer to notify the securities financing transaction account servicer of an update in the details of a repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing transaction that does not impact the original transaction securities quantity.
 * Such a change may be:
 * - the providing of closing details not available at the time of the sending of the Securities Financing Instruction, for example, termination date for an open repo,
 * - the providing of a new rate, for example, a repo rate,
 * - the rollover of a position extending the closing or maturity date.
 * The account owner/servicer relationship may be:
 * - a global custodian which has an account with a local custodian, or
 * - an investment management institution which manage a fund account opened at a custodian, or
 * - a broker which has an account with a custodian, or
 * - a central securities depository participant which has an account with a central securities depository, or
 * - a central securities depository which has an account with a custodian, another central securities depository or another settlement market infrastructure, or
 * - a central counterparty or a stock exchange or a trade matching utility which need to instruct the settlement of securities financing transactions to a central securities depository or another settlement market infrastructure.
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).
 * ISO 15022 - 20022 Coexistence
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingModificationInstructionV01", propOrder = {
    "id",
    "txTpAndModAddtlParams",
    "tradDtls",
    "finInstrmId",
    "qtyAndAcctDtls",
    "sctiesFincgAddtlDtls",
    "sttlmParams",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "opngSttlmAmt",
    "msgOrgtr",
    "msgRcpt",
    "xtnsn"
})
public class SecuritiesFinancingModificationInstructionV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "TxTpAndModAddtlParams", required = true)
    protected TransactionTypeAndAdditionalParameters2 txTpAndModAddtlParams;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails5 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification11 finInstrmId;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount7 qtyAndAcctDtls;
    @XmlElement(name = "SctiesFincgAddtlDtls", required = true)
    protected SecuritiesFinancingTransactionDetails1 sctiesFincgAddtlDtls;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails3 sttlmParams;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties5 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties5 rcvgSttlmPties;
    @XmlElement(name = "OpngSttlmAmt")
    protected AmountAndDirection10 opngSttlmAmt;
    @XmlElement(name = "MsgOrgtr")
    protected PartyIdentification10Choice msgOrgtr;
    @XmlElement(name = "MsgRcpt")
    protected PartyIdentification10Choice msgRcpt;
    @XmlElement(name = "Xtnsn")
    protected List<Extension2> xtnsn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV01 setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the txTpAndModAddtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTypeAndAdditionalParameters2 }
     *     
     */
    public TransactionTypeAndAdditionalParameters2 getTxTpAndModAddtlParams() {
        return txTpAndModAddtlParams;
    }

    /**
     * Sets the value of the txTpAndModAddtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeAndAdditionalParameters2 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV01 setTxTpAndModAddtlParams(TransactionTypeAndAdditionalParameters2 value) {
        this.txTpAndModAddtlParams = value;
        return this;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails5 }
     *     
     */
    public SecuritiesTradeDetails5 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails5 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV01 setTradDtls(SecuritiesTradeDetails5 value) {
        this.tradDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification11 }
     *     
     */
    public SecurityIdentification11 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification11 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV01 setFinInstrmId(SecurityIdentification11 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount7 }
     *     
     */
    public QuantityAndAccount7 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount7 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV01 setQtyAndAcctDtls(QuantityAndAccount7 value) {
        this.qtyAndAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionDetails1 }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 getSctiesFincgAddtlDtls() {
        return sctiesFincgAddtlDtls;
    }

    /**
     * Sets the value of the sctiesFincgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionDetails1 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV01 setSctiesFincgAddtlDtls(SecuritiesFinancingTransactionDetails1 value) {
        this.sctiesFincgAddtlDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails3 }
     *     
     */
    public SettlementDetails3 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails3 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV01 setSttlmParams(SettlementDetails3 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties5 }
     *     
     */
    public SettlementParties5 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties5 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV01 setDlvrgSttlmPties(SettlementParties5 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties5 }
     *     
     */
    public SettlementParties5 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties5 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV01 setRcvgSttlmPties(SettlementParties5 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the opngSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection10 }
     *     
     */
    public AmountAndDirection10 getOpngSttlmAmt() {
        return opngSttlmAmt;
    }

    /**
     * Sets the value of the opngSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection10 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV01 setOpngSttlmAmt(AmountAndDirection10 value) {
        this.opngSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getMsgOrgtr() {
        return msgOrgtr;
    }

    /**
     * Sets the value of the msgOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public SecuritiesFinancingModificationInstructionV01 setMsgOrgtr(PartyIdentification10Choice value) {
        this.msgOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the msgRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getMsgRcpt() {
        return msgRcpt;
    }

    /**
     * Sets the value of the msgRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public SecuritiesFinancingModificationInstructionV01 setMsgRcpt(PartyIdentification10Choice value) {
        this.msgRcpt = value;
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
     * {@link Extension2 }
     * 
     * 
     */
    public List<Extension2> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension2>();
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
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public SecuritiesFinancingModificationInstructionV01 addXtnsn(Extension2 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
