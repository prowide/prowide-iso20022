
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
 * A securities financing transaction account servicer sends a SecuritiesFinancingConfirmation to an account owner to confirm or advise of the partial or full settlement of the opening or closing leg of a securities financing transaction. 
 * 
 * The account servicer/owner relationship may be:
 * - a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants
 * - an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or 
 * - a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.
 * 
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
@XmlType(name = "SecuritiesFinancingConfirmationV11", propOrder = {
    "txIdDtls",
    "addtlParams",
    "tradDtls",
    "finInstrmId",
    "finInstrmAttrbts",
    "qtyAndAcctDtls",
    "sctiesFincgDtls",
    "stgSttlmInstrDtls",
    "sttlmParams",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "cshPties",
    "sttldAmt",
    "othrAmts",
    "othrBizPties",
    "splmtryData"
})
public class SecuritiesFinancingConfirmationV11 {

    @XmlElement(name = "TxIdDtls", required = true)
    protected TransactionTypeAndAdditionalParameters16 txIdDtls;
    @XmlElement(name = "AddtlParams")
    protected AdditionalParameters24 addtlParams;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails115 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes111 finInstrmAttrbts;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount97 qtyAndAcctDtls;
    @XmlElement(name = "SctiesFincgDtls")
    protected SecuritiesFinancingTransactionDetails43 sctiesFincgDtls;
    @XmlElement(name = "StgSttlmInstrDtls")
    protected StandingSettlementInstruction18 stgSttlmInstrDtls;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails147 sttlmParams;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties100 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties100 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties36 cshPties;
    @XmlElement(name = "SttldAmt")
    protected AmountAndDirection94 sttldAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts41 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties43 othrBizPties;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txIdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTypeAndAdditionalParameters16 }
     *     
     */
    public TransactionTypeAndAdditionalParameters16 getTxIdDtls() {
        return txIdDtls;
    }

    /**
     * Sets the value of the txIdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeAndAdditionalParameters16 }
     *     
     */
    public SecuritiesFinancingConfirmationV11 setTxIdDtls(TransactionTypeAndAdditionalParameters16 value) {
        this.txIdDtls = value;
        return this;
    }

    /**
     * Gets the value of the addtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalParameters24 }
     *     
     */
    public AdditionalParameters24 getAddtlParams() {
        return addtlParams;
    }

    /**
     * Sets the value of the addtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalParameters24 }
     *     
     */
    public SecuritiesFinancingConfirmationV11 setAddtlParams(AdditionalParameters24 value) {
        this.addtlParams = value;
        return this;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails115 }
     *     
     */
    public SecuritiesTradeDetails115 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails115 }
     *     
     */
    public SecuritiesFinancingConfirmationV11 setTradDtls(SecuritiesTradeDetails115 value) {
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
    public SecuritiesFinancingConfirmationV11 setFinInstrmId(SecurityIdentification19 value) {
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
    public SecuritiesFinancingConfirmationV11 setFinInstrmAttrbts(FinancialInstrumentAttributes111 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount97 }
     *     
     */
    public QuantityAndAccount97 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount97 }
     *     
     */
    public SecuritiesFinancingConfirmationV11 setQtyAndAcctDtls(QuantityAndAccount97 value) {
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
    public SecuritiesFinancingConfirmationV11 setSctiesFincgDtls(SecuritiesFinancingTransactionDetails43 value) {
        this.sctiesFincgDtls = value;
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
    public SecuritiesFinancingConfirmationV11 setStgSttlmInstrDtls(StandingSettlementInstruction18 value) {
        this.stgSttlmInstrDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails147 }
     *     
     */
    public SettlementDetails147 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails147 }
     *     
     */
    public SecuritiesFinancingConfirmationV11 setSttlmParams(SettlementDetails147 value) {
        this.sttlmParams = value;
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
    public SecuritiesFinancingConfirmationV11 setDlvrgSttlmPties(SettlementParties100 value) {
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
    public SecuritiesFinancingConfirmationV11 setRcvgSttlmPties(SettlementParties100 value) {
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
    public SecuritiesFinancingConfirmationV11 setCshPties(CashParties36 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the sttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection94 }
     *     
     */
    public AmountAndDirection94 getSttldAmt() {
        return sttldAmt;
    }

    /**
     * Sets the value of the sttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection94 }
     *     
     */
    public SecuritiesFinancingConfirmationV11 setSttldAmt(AmountAndDirection94 value) {
        this.sttldAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts41 }
     *     
     */
    public OtherAmounts41 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts41 }
     *     
     */
    public SecuritiesFinancingConfirmationV11 setOthrAmts(OtherAmounts41 value) {
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
    public SecuritiesFinancingConfirmationV11 setOthrBizPties(OtherParties43 value) {
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesFinancingConfirmationV11 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
