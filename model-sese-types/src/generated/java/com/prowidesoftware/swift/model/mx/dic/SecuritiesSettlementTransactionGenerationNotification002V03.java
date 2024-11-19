
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
 * An account servicer sends a SecuritiesSettlementTransactionGenerationNotification to an account owner to advise the account owner of a securities settlement transaction that has been generated/created by the account servicer for the account owner. The reason for creation can range from the automatic transformation of pending settlement instructions following a corporate event to the recovery of an account owner transactions' database initiated by its account servicer.
 * The account servicer/owner relationship may be:
 * - a central securities depository or another settlement market infrastructure acting on behalf of their participants
 * - an agent (sub-custodian) acting on behalf of their global custodian customer, or
 * - a custodian acting on behalf of an investment management institution or a broker/dealer.
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
@XmlType(name = "SecuritiesSettlementTransactionGenerationNotification002V03", propOrder = {
    "txIdDtls",
    "nbCounts",
    "lnkgs",
    "tradDtls",
    "finInstrmId",
    "finInstrmAttrbts",
    "qtyAndAcctDtls",
    "sttlmParams",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "cshPties",
    "sttlmAmt",
    "othrAmts",
    "othrBizPties",
    "addtlPhysOrRegnDtls",
    "gnrtdRsn",
    "stsAndRsn",
    "splmtryData"
})
public class SecuritiesSettlementTransactionGenerationNotification002V03 {

    @XmlElement(name = "TxIdDtls", required = true)
    protected SettlementTypeAndIdentification17 txIdDtls;
    @XmlElement(name = "NbCounts")
    protected NumberCount1Choice nbCounts;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages24> lnkgs;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails15 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification15 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes41 finInstrmAttrbts;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected List<QuantityAndAccount34> qtyAndAcctDtls;
    @XmlElement(name = "SttlmParams", required = true)
    protected SettlementDetails52 sttlmParams;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties18 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties18 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties14 cshPties;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection16 sttlmAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts20 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties24 othrBizPties;
    @XmlElement(name = "AddtlPhysOrRegnDtls")
    protected RegistrationParameters2 addtlPhysOrRegnDtls;
    @XmlElement(name = "GnrtdRsn")
    protected List<GeneratedReason2> gnrtdRsn;
    @XmlElement(name = "StsAndRsn")
    protected StatusAndReason14 stsAndRsn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txIdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification17 }
     *     
     */
    public SettlementTypeAndIdentification17 getTxIdDtls() {
        return txIdDtls;
    }

    /**
     * Sets the value of the txIdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification17 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotification002V03 setTxIdDtls(SettlementTypeAndIdentification17 value) {
        this.txIdDtls = value;
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
    public SecuritiesSettlementTransactionGenerationNotification002V03 setNbCounts(NumberCount1Choice value) {
        this.nbCounts = value;
        return this;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lnkgs property.
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
     * {@link Linkages24 }
     * 
     * 
     * @return
     *     The value of the lnkgs property.
     */
    public List<Linkages24> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<>();
        }
        return this.lnkgs;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails15 }
     *     
     */
    public SecuritiesTradeDetails15 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails15 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotification002V03 setTradDtls(SecuritiesTradeDetails15 value) {
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
    public SecuritiesSettlementTransactionGenerationNotification002V03 setFinInstrmId(SecurityIdentification15 value) {
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
    public SecuritiesSettlementTransactionGenerationNotification002V03 setFinInstrmAttrbts(FinancialInstrumentAttributes41 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qtyAndAcctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtyAndAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityAndAccount34 }
     * 
     * 
     * @return
     *     The value of the qtyAndAcctDtls property.
     */
    public List<QuantityAndAccount34> getQtyAndAcctDtls() {
        if (qtyAndAcctDtls == null) {
            qtyAndAcctDtls = new ArrayList<>();
        }
        return this.qtyAndAcctDtls;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails52 }
     *     
     */
    public SettlementDetails52 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails52 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotification002V03 setSttlmParams(SettlementDetails52 value) {
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
    public SecuritiesSettlementTransactionGenerationNotification002V03 setDlvrgSttlmPties(SettlementParties18 value) {
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
    public SecuritiesSettlementTransactionGenerationNotification002V03 setRcvgSttlmPties(SettlementParties18 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties14 }
     *     
     */
    public CashParties14 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties14 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotification002V03 setCshPties(CashParties14 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection16 }
     *     
     */
    public AmountAndDirection16 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection16 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotification002V03 setSttlmAmt(AmountAndDirection16 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts20 }
     *     
     */
    public OtherAmounts20 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts20 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotification002V03 setOthrAmts(OtherAmounts20 value) {
        this.othrAmts = value;
        return this;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties24 }
     *     
     */
    public OtherParties24 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties24 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotification002V03 setOthrBizPties(OtherParties24 value) {
        this.othrBizPties = value;
        return this;
    }

    /**
     * Gets the value of the addtlPhysOrRegnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationParameters2 }
     *     
     */
    public RegistrationParameters2 getAddtlPhysOrRegnDtls() {
        return addtlPhysOrRegnDtls;
    }

    /**
     * Sets the value of the addtlPhysOrRegnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationParameters2 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotification002V03 setAddtlPhysOrRegnDtls(RegistrationParameters2 value) {
        this.addtlPhysOrRegnDtls = value;
        return this;
    }

    /**
     * Gets the value of the gnrtdRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the gnrtdRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGnrtdRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneratedReason2 }
     * 
     * 
     * @return
     *     The value of the gnrtdRsn property.
     */
    public List<GeneratedReason2> getGnrtdRsn() {
        if (gnrtdRsn == null) {
            gnrtdRsn = new ArrayList<>();
        }
        return this.gnrtdRsn;
    }

    /**
     * Gets the value of the stsAndRsn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusAndReason14 }
     *     
     */
    public StatusAndReason14 getStsAndRsn() {
        return stsAndRsn;
    }

    /**
     * Sets the value of the stsAndRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusAndReason14 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotification002V03 setStsAndRsn(StatusAndReason14 value) {
        this.stsAndRsn = value;
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
     * Adds a new item to the lnkgs list.
     * @see #getLnkgs()
     * 
     */
    public SecuritiesSettlementTransactionGenerationNotification002V03 addLnkgs(Linkages24 lnkgs) {
        getLnkgs().add(lnkgs);
        return this;
    }

    /**
     * Adds a new item to the qtyAndAcctDtls list.
     * @see #getQtyAndAcctDtls()
     * 
     */
    public SecuritiesSettlementTransactionGenerationNotification002V03 addQtyAndAcctDtls(QuantityAndAccount34 qtyAndAcctDtls) {
        getQtyAndAcctDtls().add(qtyAndAcctDtls);
        return this;
    }

    /**
     * Adds a new item to the gnrtdRsn list.
     * @see #getGnrtdRsn()
     * 
     */
    public SecuritiesSettlementTransactionGenerationNotification002V03 addGnrtdRsn(GeneratedReason2 gnrtdRsn) {
        getGnrtdRsn().add(gnrtdRsn);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesSettlementTransactionGenerationNotification002V03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
