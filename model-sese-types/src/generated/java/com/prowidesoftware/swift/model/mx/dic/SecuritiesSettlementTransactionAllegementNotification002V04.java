
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
 * 
 * The account servicer/owner relationship may be:
 * - a central securities depository or another settlement market infrastructure acting on behalf of their participants
 * - an agent (sub-custodian) acting on behalf of their global custodian customer, or
 * - a custodian acting on behalf of an investment management institution or a broker/dealer.
 * 
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent,
 * - provide a third party with a copy of a message for information,
 * - re-send to a third party a copy of a message for information
 * using the relevant elements in the Business Application Header.
 * 
 * ISO 15022 - 20022 Coexistence Subset
 * This message definition is a subset of an ISO 20022 message that was reversed engineered from ISO 15022. A subset is a message definition that is compatible with another definition, but is more restrictive.
 * The ISO 15022 and ISO 20022 standards will coexist for a number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. These restrictions, which are described by textual usage rules in the ISO 20022 message, have been made mandatory in this subset.
 * 
 * NOTE: The ISO 20022 message coexistence textual rules have been kept in the subset to explain why specific data types have been restricted. These textual rules are identified as follows: CoexistenceXxxxRule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionAllegementNotification002V04", propOrder = {
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
public class SecuritiesSettlementTransactionAllegementNotification002V04 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "SttlmTpAndAddtlParams", required = true)
    protected SettlementTypeAndAdditionalParameters3 sttlmTpAndAddtlParams;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected Identification4 mktInfrstrctrTxId;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails41 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification15 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes41 finInstrmAttrbts;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount36 qtyAndAcctDtls;
    @XmlElement(name = "SctiesFincgDtls")
    protected SecuritiesFinancingTransactionDetails9 sctiesFincgDtls;
    @XmlElement(name = "SttlmParams", required = true)
    protected SettlementDetails58 sttlmParams;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties18 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties18 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties15 cshPties;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection25 sttlmAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts11 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties16 othrBizPties;
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
    public SecuritiesSettlementTransactionAllegementNotification002V04 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTpAndAddtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndAdditionalParameters3 }
     *     
     */
    public SettlementTypeAndAdditionalParameters3 getSttlmTpAndAddtlParams() {
        return sttlmTpAndAddtlParams;
    }

    /**
     * Sets the value of the sttlmTpAndAddtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndAdditionalParameters3 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V04 setSttlmTpAndAddtlParams(SettlementTypeAndAdditionalParameters3 value) {
        this.sttlmTpAndAddtlParams = value;
        return this;
    }

    /**
     * Gets the value of the mktInfrstrctrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link Identification4 }
     *     
     */
    public Identification4 getMktInfrstrctrTxId() {
        return mktInfrstrctrTxId;
    }

    /**
     * Sets the value of the mktInfrstrctrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification4 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V04 setMktInfrstrctrTxId(Identification4 value) {
        this.mktInfrstrctrTxId = value;
        return this;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails41 }
     *     
     */
    public SecuritiesTradeDetails41 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails41 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V04 setTradDtls(SecuritiesTradeDetails41 value) {
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
    public SecuritiesSettlementTransactionAllegementNotification002V04 setFinInstrmId(SecurityIdentification15 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes41 }
     *     
     */
    public FinancialInstrumentAttributes41 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes41 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V04 setFinInstrmAttrbts(FinancialInstrumentAttributes41 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount36 }
     *     
     */
    public QuantityAndAccount36 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount36 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V04 setQtyAndAcctDtls(QuantityAndAccount36 value) {
        this.qtyAndAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionDetails9 }
     *     
     */
    public SecuritiesFinancingTransactionDetails9 getSctiesFincgDtls() {
        return sctiesFincgDtls;
    }

    /**
     * Sets the value of the sctiesFincgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionDetails9 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V04 setSctiesFincgDtls(SecuritiesFinancingTransactionDetails9 value) {
        this.sctiesFincgDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails58 }
     *     
     */
    public SettlementDetails58 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails58 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V04 setSttlmParams(SettlementDetails58 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties18 }
     *     
     */
    public SettlementParties18 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties18 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V04 setDlvrgSttlmPties(SettlementParties18 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties18 }
     *     
     */
    public SettlementParties18 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties18 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V04 setRcvgSttlmPties(SettlementParties18 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties15 }
     *     
     */
    public CashParties15 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties15 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V04 setCshPties(CashParties15 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection25 }
     *     
     */
    public AmountAndDirection25 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection25 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V04 setSttlmAmt(AmountAndDirection25 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts11 }
     *     
     */
    public OtherAmounts11 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts11 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V04 setOthrAmts(OtherAmounts11 value) {
        this.othrAmts = value;
        return this;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties16 }
     *     
     */
    public OtherParties16 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties16 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V04 setOthrBizPties(OtherParties16 value) {
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
    public SecuritiesSettlementTransactionAllegementNotification002V04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
