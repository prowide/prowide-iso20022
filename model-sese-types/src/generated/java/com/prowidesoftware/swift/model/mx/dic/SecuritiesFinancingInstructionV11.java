
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
 * An account owner sends a SecuritiesFinancingInstruction to a securities financing transaction account servicer to notify the securities financing transaction account servicer of the details of a repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing transaction to allow the account servicer to manage the settlement and follow-up of the opening and closing leg of the transaction.
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
 * - re-send to a third party a copy of a message for information using the relevant elements in the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingInstructionV11", propOrder = {
    "txId",
    "txTpAndAddtlParams",
    "nbCounts",
    "lnkgs",
    "tradDtls",
    "finInstrmId",
    "finInstrmAttrbts",
    "qtyAndAcctDtls",
    "sctiesFincgDtls",
    "sttlmParams",
    "stgSttlmInstrDtls",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "cshPties",
    "opngSttlmAmt",
    "othrAmts",
    "othrBizPties",
    "splmtryData"
})
public class SecuritiesFinancingInstructionV11 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "TxTpAndAddtlParams", required = true)
    protected TransactionTypeAndAdditionalParameters15 txTpAndAddtlParams;
    @XmlElement(name = "NbCounts")
    protected NumberCount2Choice nbCounts;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages64> lnkgs;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails116 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes111 finInstrmAttrbts;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount95 qtyAndAcctDtls;
    @XmlElement(name = "SctiesFincgDtls", required = true)
    protected SecuritiesFinancingTransactionDetails43 sctiesFincgDtls;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails148 sttlmParams;
    @XmlElement(name = "StgSttlmInstrDtls")
    protected StandingSettlementInstruction18 stgSttlmInstrDtls;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties100 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties100 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties36 cshPties;
    @XmlElement(name = "OpngSttlmAmt")
    protected AmountAndDirection94 opngSttlmAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts39 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties43 othrBizPties;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancingInstructionV11 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the txTpAndAddtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTypeAndAdditionalParameters15 }
     *     
     */
    public TransactionTypeAndAdditionalParameters15 getTxTpAndAddtlParams() {
        return txTpAndAddtlParams;
    }

    /**
     * Sets the value of the txTpAndAddtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeAndAdditionalParameters15 }
     *     
     */
    public SecuritiesFinancingInstructionV11 setTxTpAndAddtlParams(TransactionTypeAndAdditionalParameters15 value) {
        this.txTpAndAddtlParams = value;
        return this;
    }

    /**
     * Gets the value of the nbCounts property.
     * 
     * @return
     *     possible object is
     *     {@link NumberCount2Choice }
     *     
     */
    public NumberCount2Choice getNbCounts() {
        return nbCounts;
    }

    /**
     * Sets the value of the nbCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberCount2Choice }
     *     
     */
    public SecuritiesFinancingInstructionV11 setNbCounts(NumberCount2Choice value) {
        this.nbCounts = value;
        return this;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnkgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnkgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages64 }
     * 
     * 
     */
    public List<Linkages64> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<Linkages64>();
        }
        return this.lnkgs;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails116 }
     *     
     */
    public SecuritiesTradeDetails116 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails116 }
     *     
     */
    public SecuritiesFinancingInstructionV11 setTradDtls(SecuritiesTradeDetails116 value) {
        this.tradDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecuritiesFinancingInstructionV11 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes111 }
     *     
     */
    public FinancialInstrumentAttributes111 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes111 }
     *     
     */
    public SecuritiesFinancingInstructionV11 setFinInstrmAttrbts(FinancialInstrumentAttributes111 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount95 }
     *     
     */
    public QuantityAndAccount95 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount95 }
     *     
     */
    public SecuritiesFinancingInstructionV11 setQtyAndAcctDtls(QuantityAndAccount95 value) {
        this.qtyAndAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionDetails43 }
     *     
     */
    public SecuritiesFinancingTransactionDetails43 getSctiesFincgDtls() {
        return sctiesFincgDtls;
    }

    /**
     * Sets the value of the sctiesFincgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionDetails43 }
     *     
     */
    public SecuritiesFinancingInstructionV11 setSctiesFincgDtls(SecuritiesFinancingTransactionDetails43 value) {
        this.sctiesFincgDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails148 }
     *     
     */
    public SettlementDetails148 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails148 }
     *     
     */
    public SecuritiesFinancingInstructionV11 setSttlmParams(SettlementDetails148 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the stgSttlmInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StandingSettlementInstruction18 }
     *     
     */
    public StandingSettlementInstruction18 getStgSttlmInstrDtls() {
        return stgSttlmInstrDtls;
    }

    /**
     * Sets the value of the stgSttlmInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingSettlementInstruction18 }
     *     
     */
    public SecuritiesFinancingInstructionV11 setStgSttlmInstrDtls(StandingSettlementInstruction18 value) {
        this.stgSttlmInstrDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties100 }
     *     
     */
    public SettlementParties100 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties100 }
     *     
     */
    public SecuritiesFinancingInstructionV11 setDlvrgSttlmPties(SettlementParties100 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties100 }
     *     
     */
    public SettlementParties100 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties100 }
     *     
     */
    public SecuritiesFinancingInstructionV11 setRcvgSttlmPties(SettlementParties100 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties36 }
     *     
     */
    public CashParties36 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties36 }
     *     
     */
    public SecuritiesFinancingInstructionV11 setCshPties(CashParties36 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the opngSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection94 }
     *     
     */
    public AmountAndDirection94 getOpngSttlmAmt() {
        return opngSttlmAmt;
    }

    /**
     * Sets the value of the opngSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection94 }
     *     
     */
    public SecuritiesFinancingInstructionV11 setOpngSttlmAmt(AmountAndDirection94 value) {
        this.opngSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts39 }
     *     
     */
    public OtherAmounts39 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts39 }
     *     
     */
    public SecuritiesFinancingInstructionV11 setOthrAmts(OtherAmounts39 value) {
        this.othrAmts = value;
        return this;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties43 }
     *     
     */
    public OtherParties43 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties43 }
     *     
     */
    public SecuritiesFinancingInstructionV11 setOthrBizPties(OtherParties43 value) {
        this.othrBizPties = value;
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
     * Adds a new item to the lnkgs list.
     * @see #getLnkgs()
     * 
     */
    public SecuritiesFinancingInstructionV11 addLnkgs(Linkages64 lnkgs) {
        getLnkgs().add(lnkgs);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesFinancingInstructionV11 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
