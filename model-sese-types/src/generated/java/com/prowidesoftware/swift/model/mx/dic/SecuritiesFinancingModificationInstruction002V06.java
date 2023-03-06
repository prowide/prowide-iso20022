
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
 * 
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent,
 * - provide a third party with a copy of a message for information,
 * - re-send to a third party a copy of a message for information
 * using the relevant elements in the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingModificationInstruction002V06", propOrder = {
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
public class SecuritiesFinancingModificationInstruction002V06 {

    @XmlElement(name = "TxTpAndModAddtlParams", required = true)
    protected TransactionTypeAndAdditionalParameters20 txTpAndModAddtlParams;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails12 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount61 qtyAndAcctDtls;
    @XmlElement(name = "SctiesFincgAddtlDtls", required = true)
    protected SecuritiesFinancingTransactionDetails32 sctiesFincgAddtlDtls;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails106 sttlmParams;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties44 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties44 rcvgSttlmPties;
    @XmlElement(name = "OpngSttlmAmt")
    protected AmountAndDirection66 opngSttlmAmt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txTpAndModAddtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTypeAndAdditionalParameters20 }
     *     
     */
    public TransactionTypeAndAdditionalParameters20 getTxTpAndModAddtlParams() {
        return txTpAndModAddtlParams;
    }

    /**
     * Sets the value of the txTpAndModAddtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeAndAdditionalParameters20 }
     *     
     */
    public SecuritiesFinancingModificationInstruction002V06 setTxTpAndModAddtlParams(TransactionTypeAndAdditionalParameters20 value) {
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
    public SecuritiesFinancingModificationInstruction002V06 setTradDtls(SecuritiesTradeDetails12 value) {
        this.tradDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecuritiesFinancingModificationInstruction002V06 setFinInstrmId(SecurityIdentification20 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount61 }
     *     
     */
    public QuantityAndAccount61 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount61 }
     *     
     */
    public SecuritiesFinancingModificationInstruction002V06 setQtyAndAcctDtls(QuantityAndAccount61 value) {
        this.qtyAndAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionDetails32 }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 getSctiesFincgAddtlDtls() {
        return sctiesFincgAddtlDtls;
    }

    /**
     * Sets the value of the sctiesFincgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionDetails32 }
     *     
     */
    public SecuritiesFinancingModificationInstruction002V06 setSctiesFincgAddtlDtls(SecuritiesFinancingTransactionDetails32 value) {
        this.sctiesFincgAddtlDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails106 }
     *     
     */
    public SettlementDetails106 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails106 }
     *     
     */
    public SecuritiesFinancingModificationInstruction002V06 setSttlmParams(SettlementDetails106 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties44 }
     *     
     */
    public SettlementParties44 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties44 }
     *     
     */
    public SecuritiesFinancingModificationInstruction002V06 setDlvrgSttlmPties(SettlementParties44 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties44 }
     *     
     */
    public SettlementParties44 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties44 }
     *     
     */
    public SecuritiesFinancingModificationInstruction002V06 setRcvgSttlmPties(SettlementParties44 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the opngSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection66 }
     *     
     */
    public AmountAndDirection66 getOpngSttlmAmt() {
        return opngSttlmAmt;
    }

    /**
     * Sets the value of the opngSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection66 }
     *     
     */
    public SecuritiesFinancingModificationInstruction002V06 setOpngSttlmAmt(AmountAndDirection66 value) {
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
    public SecuritiesFinancingModificationInstruction002V06 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
