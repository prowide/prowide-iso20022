
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
 * An account servicer sends a SecuritiesSettlementTransactionReversalAdvice to an account owner to reverse the confirmation of a partial or full delivery or receipt of financial instruments, free or against of payment, physically or by book-entry.
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
 * ISO 15022 - 20022 Coexistence
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionReversalAdviceV04", propOrder = {
    "txIdDtls",
    "confRef",
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
public class SecuritiesSettlementTransactionReversalAdviceV04 {

    @XmlElement(name = "TxIdDtls", required = true)
    protected SettlementTypeAndIdentification15 txIdDtls;
    @XmlElement(name = "ConfRef", required = true)
    protected Identification1 confRef;
    @XmlElement(name = "AddtlParams")
    protected AdditionalParameters14 addtlParams;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails31 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes35 finInstrmAttrbts;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount28 qtyAndAcctDtls;
    @XmlElement(name = "SttlmParams", required = true)
    protected SettlementDetails70 sttlmParams;
    @XmlElement(name = "StgSttlmInstrDtls")
    protected StandingSettlementInstruction5 stgSttlmInstrDtls;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties14 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties14 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties9 cshPties;
    @XmlElement(name = "SttldAmt")
    protected AmountAndDirection36 sttldAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts18 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties19 othrBizPties;
    @XmlElement(name = "AddtlPhysOrRegnDtls")
    protected RegistrationParameters1 addtlPhysOrRegnDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txIdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification15 }
     *     
     */
    public SettlementTypeAndIdentification15 getTxIdDtls() {
        return txIdDtls;
    }

    /**
     * Sets the value of the txIdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification15 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setTxIdDtls(SettlementTypeAndIdentification15 value) {
        this.txIdDtls = value;
        return this;
    }

    /**
     * Gets the value of the confRef property.
     * 
     * @return
     *     possible object is
     *     {@link Identification1 }
     *     
     */
    public Identification1 getConfRef() {
        return confRef;
    }

    /**
     * Sets the value of the confRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification1 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setConfRef(Identification1 value) {
        this.confRef = value;
        return this;
    }

    /**
     * Gets the value of the addtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalParameters14 }
     *     
     */
    public AdditionalParameters14 getAddtlParams() {
        return addtlParams;
    }

    /**
     * Sets the value of the addtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalParameters14 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setAddtlParams(AdditionalParameters14 value) {
        this.addtlParams = value;
        return this;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails31 }
     *     
     */
    public SecuritiesTradeDetails31 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails31 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setTradDtls(SecuritiesTradeDetails31 value) {
        this.tradDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes35 }
     *     
     */
    public FinancialInstrumentAttributes35 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes35 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setFinInstrmAttrbts(FinancialInstrumentAttributes35 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount28 }
     *     
     */
    public QuantityAndAccount28 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount28 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setQtyAndAcctDtls(QuantityAndAccount28 value) {
        this.qtyAndAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails70 }
     *     
     */
    public SettlementDetails70 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails70 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setSttlmParams(SettlementDetails70 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the stgSttlmInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StandingSettlementInstruction5 }
     *     
     */
    public StandingSettlementInstruction5 getStgSttlmInstrDtls() {
        return stgSttlmInstrDtls;
    }

    /**
     * Sets the value of the stgSttlmInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingSettlementInstruction5 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setStgSttlmInstrDtls(StandingSettlementInstruction5 value) {
        this.stgSttlmInstrDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties14 }
     *     
     */
    public SettlementParties14 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties14 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setDlvrgSttlmPties(SettlementParties14 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties14 }
     *     
     */
    public SettlementParties14 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties14 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setRcvgSttlmPties(SettlementParties14 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties9 }
     *     
     */
    public CashParties9 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties9 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setCshPties(CashParties9 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the sttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection36 }
     *     
     */
    public AmountAndDirection36 getSttldAmt() {
        return sttldAmt;
    }

    /**
     * Sets the value of the sttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection36 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setSttldAmt(AmountAndDirection36 value) {
        this.sttldAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts18 }
     *     
     */
    public OtherAmounts18 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts18 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setOthrAmts(OtherAmounts18 value) {
        this.othrAmts = value;
        return this;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties19 }
     *     
     */
    public OtherParties19 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties19 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setOthrBizPties(OtherParties19 value) {
        this.othrBizPties = value;
        return this;
    }

    /**
     * Gets the value of the addtlPhysOrRegnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationParameters1 }
     *     
     */
    public RegistrationParameters1 getAddtlPhysOrRegnDtls() {
        return addtlPhysOrRegnDtls;
    }

    /**
     * Sets the value of the addtlPhysOrRegnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationParameters1 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV04 setAddtlPhysOrRegnDtls(RegistrationParameters1 value) {
        this.addtlPhysOrRegnDtls = value;
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
    public SecuritiesSettlementTransactionReversalAdviceV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
