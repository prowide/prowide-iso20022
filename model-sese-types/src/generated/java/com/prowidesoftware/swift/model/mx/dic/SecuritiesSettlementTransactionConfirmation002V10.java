
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
 * An account servicer sends a SecuritiesSettlementTransactionConfirmation to an account owner to confirm the partial or full delivery or receipt of financial instruments, free or against of payment, physically or by book-entry.
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
@XmlType(name = "SecuritiesSettlementTransactionConfirmation002V10", propOrder = {
    "txIdDtls",
    "lnkgs",
    "addtlParams",
    "tradDtls",
    "finInstrmId",
    "finInstrmAttrbts",
    "qtyAndAcctDtls",
    "sttlmParams",
    "stgSttlmInstrDtls",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "cshPties",
    "sttldAmt",
    "othrAmts",
    "othrBizPties",
    "addtlPhysOrRegnDtls",
    "splmtryData"
})
public class SecuritiesSettlementTransactionConfirmation002V10 {

    @XmlElement(name = "TxIdDtls", required = true)
    protected SettlementTypeAndIdentification24 txIdDtls;
    @XmlElement(name = "Lnkgs")
    protected Linkages50 lnkgs;
    @XmlElement(name = "AddtlParams")
    protected AdditionalParameters31 addtlParams;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails128 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes97 finInstrmAttrbts;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount90 qtyAndAcctDtls;
    @XmlElement(name = "SttlmParams", required = true)
    protected SettlementDetails192 sttlmParams;
    @XmlElement(name = "StgSttlmInstrDtls")
    protected StandingSettlementInstruction17 stgSttlmInstrDtls;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties81 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties81 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties38 cshPties;
    @XmlElement(name = "SttldAmt")
    protected AmountAndDirection96 sttldAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts44 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties35 othrBizPties;
    @XmlElement(name = "AddtlPhysOrRegnDtls")
    protected RegistrationParameters7 addtlPhysOrRegnDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txIdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification24 }
     *     
     */
    public SettlementTypeAndIdentification24 getTxIdDtls() {
        return txIdDtls;
    }

    /**
     * Sets the value of the txIdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification24 }
     *     
     */
    public SecuritiesSettlementTransactionConfirmation002V10 setTxIdDtls(SettlementTypeAndIdentification24 value) {
        this.txIdDtls = value;
        return this;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * @return
     *     possible object is
     *     {@link Linkages50 }
     *     
     */
    public Linkages50 getLnkgs() {
        return lnkgs;
    }

    /**
     * Sets the value of the lnkgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linkages50 }
     *     
     */
    public SecuritiesSettlementTransactionConfirmation002V10 setLnkgs(Linkages50 value) {
        this.lnkgs = value;
        return this;
    }

    /**
     * Gets the value of the addtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalParameters31 }
     *     
     */
    public AdditionalParameters31 getAddtlParams() {
        return addtlParams;
    }

    /**
     * Sets the value of the addtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalParameters31 }
     *     
     */
    public SecuritiesSettlementTransactionConfirmation002V10 setAddtlParams(AdditionalParameters31 value) {
        this.addtlParams = value;
        return this;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails128 }
     *     
     */
    public SecuritiesTradeDetails128 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails128 }
     *     
     */
    public SecuritiesSettlementTransactionConfirmation002V10 setTradDtls(SecuritiesTradeDetails128 value) {
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
    public SecuritiesSettlementTransactionConfirmation002V10 setFinInstrmId(SecurityIdentification20 value) {
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
    public SecuritiesSettlementTransactionConfirmation002V10 setFinInstrmAttrbts(FinancialInstrumentAttributes97 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount90 }
     *     
     */
    public QuantityAndAccount90 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount90 }
     *     
     */
    public SecuritiesSettlementTransactionConfirmation002V10 setQtyAndAcctDtls(QuantityAndAccount90 value) {
        this.qtyAndAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails192 }
     *     
     */
    public SettlementDetails192 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails192 }
     *     
     */
    public SecuritiesSettlementTransactionConfirmation002V10 setSttlmParams(SettlementDetails192 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the stgSttlmInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StandingSettlementInstruction17 }
     *     
     */
    public StandingSettlementInstruction17 getStgSttlmInstrDtls() {
        return stgSttlmInstrDtls;
    }

    /**
     * Sets the value of the stgSttlmInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingSettlementInstruction17 }
     *     
     */
    public SecuritiesSettlementTransactionConfirmation002V10 setStgSttlmInstrDtls(StandingSettlementInstruction17 value) {
        this.stgSttlmInstrDtls = value;
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
    public SecuritiesSettlementTransactionConfirmation002V10 setDlvrgSttlmPties(SettlementParties81 value) {
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
    public SecuritiesSettlementTransactionConfirmation002V10 setRcvgSttlmPties(SettlementParties81 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties38 }
     *     
     */
    public CashParties38 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties38 }
     *     
     */
    public SecuritiesSettlementTransactionConfirmation002V10 setCshPties(CashParties38 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the sttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection96 }
     *     
     */
    public AmountAndDirection96 getSttldAmt() {
        return sttldAmt;
    }

    /**
     * Sets the value of the sttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection96 }
     *     
     */
    public SecuritiesSettlementTransactionConfirmation002V10 setSttldAmt(AmountAndDirection96 value) {
        this.sttldAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts44 }
     *     
     */
    public OtherAmounts44 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts44 }
     *     
     */
    public SecuritiesSettlementTransactionConfirmation002V10 setOthrAmts(OtherAmounts44 value) {
        this.othrAmts = value;
        return this;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties35 }
     *     
     */
    public OtherParties35 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties35 }
     *     
     */
    public SecuritiesSettlementTransactionConfirmation002V10 setOthrBizPties(OtherParties35 value) {
        this.othrBizPties = value;
        return this;
    }

    /**
     * Gets the value of the addtlPhysOrRegnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationParameters7 }
     *     
     */
    public RegistrationParameters7 getAddtlPhysOrRegnDtls() {
        return addtlPhysOrRegnDtls;
    }

    /**
     * Sets the value of the addtlPhysOrRegnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationParameters7 }
     *     
     */
    public SecuritiesSettlementTransactionConfirmation002V10 setAddtlPhysOrRegnDtls(RegistrationParameters7 value) {
        this.addtlPhysOrRegnDtls = value;
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
    public SecuritiesSettlementTransactionConfirmation002V10 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
