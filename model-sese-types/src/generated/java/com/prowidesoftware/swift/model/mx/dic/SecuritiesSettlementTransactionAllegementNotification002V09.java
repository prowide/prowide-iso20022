
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
 * An account servicer sends a SecuritiesSettlementTransactionAllegementNotification to an account owner to advise the account owner that a counterparty has alleged an instruction against the account owner's account at the account servicer and that the account servicer could not find the corresponding instruction of the account owner.
 * The account servicer/owner relationship may be:
 * - a central securities depository or another settlement market infrastructure acting on behalf of their participants
 * - an agent (sub-custodian) acting on behalf of their global custodian customer, or
 * - a custodian acting on behalf of an investment management institution or a broker/dealer.
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
@XmlType(name = "SecuritiesSettlementTransactionAllegementNotification002V09", propOrder = {
    "txId",
    "sttlmTpAndAddtlParams",
    "mktInfrstrctrTxId",
    "tradDtls",
    "finInstrmId",
    "finInstrmAttrbts",
    "qtyAndAcctDtls",
    "sctiesFincgDtls",
    "sttlmParams",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "cshPties",
    "sttlmAmt",
    "othrAmts",
    "othrBizPties",
    "splmtryData"
})
public class SecuritiesSettlementTransactionAllegementNotification002V09 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "SttlmTpAndAddtlParams", required = true)
    protected SettlementTypeAndAdditionalParameters15 sttlmTpAndAddtlParams;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected Identification16 mktInfrstrctrTxId;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails126 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes97 finInstrmAttrbts;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount88 qtyAndAcctDtls;
    @XmlElement(name = "SctiesFincgDtls")
    protected SecuritiesFinancingTransactionDetails50 sctiesFincgDtls;
    @XmlElement(name = "SttlmParams", required = true)
    protected SettlementDetails191 sttlmParams;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties81 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties81 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties40 cshPties;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection92 sttlmAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts36 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties37 othrBizPties;
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
    public SecuritiesSettlementTransactionAllegementNotification002V09 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTpAndAddtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndAdditionalParameters15 }
     *     
     */
    public SettlementTypeAndAdditionalParameters15 getSttlmTpAndAddtlParams() {
        return sttlmTpAndAddtlParams;
    }

    /**
     * Sets the value of the sttlmTpAndAddtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndAdditionalParameters15 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V09 setSttlmTpAndAddtlParams(SettlementTypeAndAdditionalParameters15 value) {
        this.sttlmTpAndAddtlParams = value;
        return this;
    }

    /**
     * Gets the value of the mktInfrstrctrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link Identification16 }
     *     
     */
    public Identification16 getMktInfrstrctrTxId() {
        return mktInfrstrctrTxId;
    }

    /**
     * Sets the value of the mktInfrstrctrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification16 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V09 setMktInfrstrctrTxId(Identification16 value) {
        this.mktInfrstrctrTxId = value;
        return this;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails126 }
     *     
     */
    public SecuritiesTradeDetails126 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails126 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V09 setTradDtls(SecuritiesTradeDetails126 value) {
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
    public SecuritiesSettlementTransactionAllegementNotification002V09 setFinInstrmId(SecurityIdentification20 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes97 }
     *     
     */
    public FinancialInstrumentAttributes97 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes97 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V09 setFinInstrmAttrbts(FinancialInstrumentAttributes97 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount88 }
     *     
     */
    public QuantityAndAccount88 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount88 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V09 setQtyAndAcctDtls(QuantityAndAccount88 value) {
        this.qtyAndAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionDetails50 }
     *     
     */
    public SecuritiesFinancingTransactionDetails50 getSctiesFincgDtls() {
        return sctiesFincgDtls;
    }

    /**
     * Sets the value of the sctiesFincgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionDetails50 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V09 setSctiesFincgDtls(SecuritiesFinancingTransactionDetails50 value) {
        this.sctiesFincgDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails191 }
     *     
     */
    public SettlementDetails191 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails191 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V09 setSttlmParams(SettlementDetails191 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties81 }
     *     
     */
    public SettlementParties81 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties81 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V09 setDlvrgSttlmPties(SettlementParties81 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties81 }
     *     
     */
    public SettlementParties81 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties81 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V09 setRcvgSttlmPties(SettlementParties81 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties40 }
     *     
     */
    public CashParties40 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties40 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V09 setCshPties(CashParties40 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection92 }
     *     
     */
    public AmountAndDirection92 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection92 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V09 setSttlmAmt(AmountAndDirection92 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts36 }
     *     
     */
    public OtherAmounts36 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts36 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V09 setOthrAmts(OtherAmounts36 value) {
        this.othrAmts = value;
        return this;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties37 }
     *     
     */
    public OtherParties37 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties37 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V09 setOthrBizPties(OtherParties37 value) {
        this.othrBizPties = value;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesSettlementTransactionAllegementNotification002V09 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
