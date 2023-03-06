
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
 * - re-send a message previously sent,
 * - provide a third party with a copy of a message for information,
 * - re-send to a third party a copy of a message for information.
 * using the relevant elements in the Business Application Header.
 * ISO 15022 - 20022 Coexistence Subset
 * This message definition is a subset of an ISO 20022 message that was reversed engineered from ISO 15022. A subset is a message definition that is compatible with another definition, but is more restrictive
 * The ISO 15022 and ISO 20022 standards will coexist for a number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. These restrictions, which are described by textual usage rules in the ISO 20022 message, have been made mandatory in this subset. 
 * NOTE: The ISO 20022 message coexistence textual rules have been kept in the subset to explain why specific data types have been restricted. These textual rules are identified as follows: CoexistenceXxxxRule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingModificationInstructionV02Subset", propOrder = {
    "txTpAndModAddtlParams",
    "tradDtls",
    "finInstrmId",
    "qtyAndAcctDtls",
    "sctiesFincgAddtlDtls",
    "sttlmParams",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "opngSttlmAmt",
    "splmtryData"
})
public class SecuritiesFinancingModificationInstructionV02Subset {

    @XmlElement(name = "TxTpAndModAddtlParams", required = true)
    protected TransactionTypeAndAdditionalParameters8 txTpAndModAddtlParams;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails12 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification15 finInstrmId;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount21 qtyAndAcctDtls;
    @XmlElement(name = "SctiesFincgAddtlDtls", required = true)
    protected SecuritiesFinancingTransactionDetails4 sctiesFincgAddtlDtls;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails16 sttlmParams;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties17 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties17 rcvgSttlmPties;
    @XmlElement(name = "OpngSttlmAmt")
    protected AmountAndDirection11 opngSttlmAmt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txTpAndModAddtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTypeAndAdditionalParameters8 }
     *     
     */
    public TransactionTypeAndAdditionalParameters8 getTxTpAndModAddtlParams() {
        return txTpAndModAddtlParams;
    }

    /**
     * Sets the value of the txTpAndModAddtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeAndAdditionalParameters8 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV02Subset setTxTpAndModAddtlParams(TransactionTypeAndAdditionalParameters8 value) {
        this.txTpAndModAddtlParams = value;
        return this;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails12 }
     *     
     */
    public SecuritiesTradeDetails12 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails12 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV02Subset setTradDtls(SecuritiesTradeDetails12 value) {
        this.tradDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public SecurityIdentification15 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV02Subset setFinInstrmId(SecurityIdentification15 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount21 }
     *     
     */
    public QuantityAndAccount21 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount21 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV02Subset setQtyAndAcctDtls(QuantityAndAccount21 value) {
        this.qtyAndAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionDetails4 }
     *     
     */
    public SecuritiesFinancingTransactionDetails4 getSctiesFincgAddtlDtls() {
        return sctiesFincgAddtlDtls;
    }

    /**
     * Sets the value of the sctiesFincgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionDetails4 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV02Subset setSctiesFincgAddtlDtls(SecuritiesFinancingTransactionDetails4 value) {
        this.sctiesFincgAddtlDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails16 }
     *     
     */
    public SettlementDetails16 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails16 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV02Subset setSttlmParams(SettlementDetails16 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties17 }
     *     
     */
    public SettlementParties17 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties17 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV02Subset setDlvrgSttlmPties(SettlementParties17 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties17 }
     *     
     */
    public SettlementParties17 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties17 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV02Subset setRcvgSttlmPties(SettlementParties17 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the opngSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection11 }
     *     
     */
    public AmountAndDirection11 getOpngSttlmAmt() {
        return opngSttlmAmt;
    }

    /**
     * Sets the value of the opngSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection11 }
     *     
     */
    public SecuritiesFinancingModificationInstructionV02Subset setOpngSttlmAmt(AmountAndDirection11 value) {
        this.opngSttlmAmt = value;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesFinancingModificationInstructionV02Subset addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
