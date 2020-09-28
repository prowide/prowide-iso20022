
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
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent,
 * - provide a third party with a copy of a message for information,
 * - re-send to a third party a copy of a message for information.
 * using the relevant elements in the Business Application Header.
 * ISO 15022 - 20022 Coexistence Subset
 * This message definition is a subset of an ISO 20022 message that was reversed engineered from ISO 15022. A subset is a message definition that is compatible with another definition, but is more restrictive
 * The ISO 15022 and ISO 20022 standards will coexist for a number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. These restrictions, which are described by textual usage rules in the ISO 20022 message, have been made mandatory in this subset.  
 * NOTE: The ISO 20022 message coexistence textual rules have been kept in the subset to explain why specific data types have been restricted. These textual rules are identified as follows:  CoexistenceXxxxRule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingInstructionV02Subset", propOrder = {
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
public class SecuritiesFinancingInstructionV02Subset {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "TxTpAndAddtlParams", required = true)
    protected TransactionTypeAndAdditionalParameters4 txTpAndAddtlParams;
    @XmlElement(name = "NbCounts")
    protected NumberCount1Choice nbCounts;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages14> lnkgs;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails11 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification15 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes28 finInstrmAttrbts;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount24 qtyAndAcctDtls;
    @XmlElement(name = "SctiesFincgDtls", required = true)
    protected SecuritiesFinancingTransactionDetails4 sctiesFincgDtls;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails40 sttlmParams;
    @XmlElement(name = "StgSttlmInstrDtls")
    protected StandingSettlementInstruction6 stgSttlmInstrDtls;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties17 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties17 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties13 cshPties;
    @XmlElement(name = "OpngSttlmAmt")
    protected AmountAndDirection16 opngSttlmAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts7 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties14 othrBizPties;
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
    public SecuritiesFinancingInstructionV02Subset setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the txTpAndAddtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTypeAndAdditionalParameters4 }
     *     
     */
    public TransactionTypeAndAdditionalParameters4 getTxTpAndAddtlParams() {
        return txTpAndAddtlParams;
    }

    /**
     * Sets the value of the txTpAndAddtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeAndAdditionalParameters4 }
     *     
     */
    public SecuritiesFinancingInstructionV02Subset setTxTpAndAddtlParams(TransactionTypeAndAdditionalParameters4 value) {
        this.txTpAndAddtlParams = value;
        return this;
    }

    /**
     * Gets the value of the nbCounts property.
     * 
     * @return
     *     possible object is
     *     {@link NumberCount1Choice }
     *     
     */
    public NumberCount1Choice getNbCounts() {
        return nbCounts;
    }

    /**
     * Sets the value of the nbCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberCount1Choice }
     *     
     */
    public SecuritiesFinancingInstructionV02Subset setNbCounts(NumberCount1Choice value) {
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
     * {@link Linkages14 }
     * 
     * 
     */
    public List<Linkages14> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<Linkages14>();
        }
        return this.lnkgs;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails11 }
     *     
     */
    public SecuritiesTradeDetails11 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails11 }
     *     
     */
    public SecuritiesFinancingInstructionV02Subset setTradDtls(SecuritiesTradeDetails11 value) {
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
    public SecuritiesFinancingInstructionV02Subset setFinInstrmId(SecurityIdentification15 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes28 }
     *     
     */
    public FinancialInstrumentAttributes28 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes28 }
     *     
     */
    public SecuritiesFinancingInstructionV02Subset setFinInstrmAttrbts(FinancialInstrumentAttributes28 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount24 }
     *     
     */
    public QuantityAndAccount24 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount24 }
     *     
     */
    public SecuritiesFinancingInstructionV02Subset setQtyAndAcctDtls(QuantityAndAccount24 value) {
        this.qtyAndAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionDetails4 }
     *     
     */
    public SecuritiesFinancingTransactionDetails4 getSctiesFincgDtls() {
        return sctiesFincgDtls;
    }

    /**
     * Sets the value of the sctiesFincgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionDetails4 }
     *     
     */
    public SecuritiesFinancingInstructionV02Subset setSctiesFincgDtls(SecuritiesFinancingTransactionDetails4 value) {
        this.sctiesFincgDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails40 }
     *     
     */
    public SettlementDetails40 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails40 }
     *     
     */
    public SecuritiesFinancingInstructionV02Subset setSttlmParams(SettlementDetails40 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the stgSttlmInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StandingSettlementInstruction6 }
     *     
     */
    public StandingSettlementInstruction6 getStgSttlmInstrDtls() {
        return stgSttlmInstrDtls;
    }

    /**
     * Sets the value of the stgSttlmInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingSettlementInstruction6 }
     *     
     */
    public SecuritiesFinancingInstructionV02Subset setStgSttlmInstrDtls(StandingSettlementInstruction6 value) {
        this.stgSttlmInstrDtls = value;
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
    public SecuritiesFinancingInstructionV02Subset setDlvrgSttlmPties(SettlementParties17 value) {
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
    public SecuritiesFinancingInstructionV02Subset setRcvgSttlmPties(SettlementParties17 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties13 }
     *     
     */
    public CashParties13 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties13 }
     *     
     */
    public SecuritiesFinancingInstructionV02Subset setCshPties(CashParties13 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the opngSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection16 }
     *     
     */
    public AmountAndDirection16 getOpngSttlmAmt() {
        return opngSttlmAmt;
    }

    /**
     * Sets the value of the opngSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection16 }
     *     
     */
    public SecuritiesFinancingInstructionV02Subset setOpngSttlmAmt(AmountAndDirection16 value) {
        this.opngSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts7 }
     *     
     */
    public OtherAmounts7 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts7 }
     *     
     */
    public SecuritiesFinancingInstructionV02Subset setOthrAmts(OtherAmounts7 value) {
        this.othrAmts = value;
        return this;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties14 }
     *     
     */
    public OtherParties14 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties14 }
     *     
     */
    public SecuritiesFinancingInstructionV02Subset setOthrBizPties(OtherParties14 value) {
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
    public SecuritiesFinancingInstructionV02Subset addLnkgs(Linkages14 lnkgs) {
        getLnkgs().add(lnkgs);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesFinancingInstructionV02Subset addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
