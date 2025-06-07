
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
 * An account servicer sends a SecuritiesSettlementTransactionGenerationNotification to an account owner to advise the account owner of a securities settlement transaction that has been generated/created by the account servicer for the account owner. The reason for creation can range from the automatic transformation of pending settlement instructions following a corporate event to the recovery of an account owner transactions' database initiated by its account servicer.
 * The account servicer/owner relationship may be:
 * - a central securities depository or another settlement market infrastructure acting on behalf of their participants
 * - an agent (sub-custodian) acting on behalf of their global custodian customer, or
 * - a custodian acting on behalf of an investment management institution or a broker/dealer
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
@XmlType(name = "SecuritiesSettlementTransactionGenerationNotificationV12", propOrder = {
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
    "dgtlNtwkFee",
    "othrBizPties",
    "addtlPhysOrRegnDtls",
    "gnrtdRsn",
    "stsAndRsn",
    "splmtryData"
})
public class SecuritiesSettlementTransactionGenerationNotificationV12 {

    @XmlElement(name = "TxIdDtls", required = true)
    protected SettlementTypeAndIdentification29 txIdDtls;
    @XmlElement(name = "NbCounts")
    protected NumberCount2Choice nbCounts;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages61> lnkgs;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails145 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes111 finInstrmAttrbts;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected List<QuantityAndAccount117> qtyAndAcctDtls;
    @XmlElement(name = "SttlmParams", required = true)
    protected SettlementDetails217 sttlmParams;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties126 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties126 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties41 cshPties;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection94 sttlmAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts45 othrAmts;
    @XmlElement(name = "DgtlNtwkFee")
    protected NetworkFee1 dgtlNtwkFee;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties43 othrBizPties;
    @XmlElement(name = "AddtlPhysOrRegnDtls")
    protected RegistrationParameters6 addtlPhysOrRegnDtls;
    @XmlElement(name = "GnrtdRsn")
    protected List<GeneratedReason5> gnrtdRsn;
    @XmlElement(name = "StsAndRsn")
    protected StatusAndReason48 stsAndRsn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txIdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification29 }
     *     
     */
    public SettlementTypeAndIdentification29 getTxIdDtls() {
        return txIdDtls;
    }

    /**
     * Sets the value of the txIdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification29 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotificationV12 setTxIdDtls(SettlementTypeAndIdentification29 value) {
        this.txIdDtls = value;
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
    public SecuritiesSettlementTransactionGenerationNotificationV12 setNbCounts(NumberCount2Choice value) {
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
     * {@link Linkages61 }
     * 
     * 
     */
    public List<Linkages61> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<Linkages61>();
        }
        return this.lnkgs;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails145 }
     *     
     */
    public SecuritiesTradeDetails145 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails145 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotificationV12 setTradDtls(SecuritiesTradeDetails145 value) {
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
    public SecuritiesSettlementTransactionGenerationNotificationV12 setFinInstrmId(SecurityIdentification19 value) {
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
    public SecuritiesSettlementTransactionGenerationNotificationV12 setFinInstrmAttrbts(FinancialInstrumentAttributes111 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qtyAndAcctDtls property.
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
     * {@link QuantityAndAccount117 }
     * 
     * 
     */
    public List<QuantityAndAccount117> getQtyAndAcctDtls() {
        if (qtyAndAcctDtls == null) {
            qtyAndAcctDtls = new ArrayList<QuantityAndAccount117>();
        }
        return this.qtyAndAcctDtls;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails217 }
     *     
     */
    public SettlementDetails217 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails217 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotificationV12 setSttlmParams(SettlementDetails217 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties126 }
     *     
     */
    public SettlementParties126 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties126 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotificationV12 setDlvrgSttlmPties(SettlementParties126 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties126 }
     *     
     */
    public SettlementParties126 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties126 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotificationV12 setRcvgSttlmPties(SettlementParties126 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties41 }
     *     
     */
    public CashParties41 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties41 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotificationV12 setCshPties(CashParties41 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection94 }
     *     
     */
    public AmountAndDirection94 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection94 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotificationV12 setSttlmAmt(AmountAndDirection94 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts45 }
     *     
     */
    public OtherAmounts45 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts45 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotificationV12 setOthrAmts(OtherAmounts45 value) {
        this.othrAmts = value;
        return this;
    }

    /**
     * Gets the value of the dgtlNtwkFee property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkFee1 }
     *     
     */
    public NetworkFee1 getDgtlNtwkFee() {
        return dgtlNtwkFee;
    }

    /**
     * Sets the value of the dgtlNtwkFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkFee1 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotificationV12 setDgtlNtwkFee(NetworkFee1 value) {
        this.dgtlNtwkFee = value;
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
    public SecuritiesSettlementTransactionGenerationNotificationV12 setOthrBizPties(OtherParties43 value) {
        this.othrBizPties = value;
        return this;
    }

    /**
     * Gets the value of the addtlPhysOrRegnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationParameters6 }
     *     
     */
    public RegistrationParameters6 getAddtlPhysOrRegnDtls() {
        return addtlPhysOrRegnDtls;
    }

    /**
     * Sets the value of the addtlPhysOrRegnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationParameters6 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotificationV12 setAddtlPhysOrRegnDtls(RegistrationParameters6 value) {
        this.addtlPhysOrRegnDtls = value;
        return this;
    }

    /**
     * Gets the value of the gnrtdRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gnrtdRsn property.
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
     * {@link GeneratedReason5 }
     * 
     * 
     */
    public List<GeneratedReason5> getGnrtdRsn() {
        if (gnrtdRsn == null) {
            gnrtdRsn = new ArrayList<GeneratedReason5>();
        }
        return this.gnrtdRsn;
    }

    /**
     * Gets the value of the stsAndRsn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusAndReason48 }
     *     
     */
    public StatusAndReason48 getStsAndRsn() {
        return stsAndRsn;
    }

    /**
     * Sets the value of the stsAndRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusAndReason48 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotificationV12 setStsAndRsn(StatusAndReason48 value) {
        this.stsAndRsn = value;
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
    public SecuritiesSettlementTransactionGenerationNotificationV12 addLnkgs(Linkages61 lnkgs) {
        getLnkgs().add(lnkgs);
        return this;
    }

    /**
     * Adds a new item to the qtyAndAcctDtls list.
     * @see #getQtyAndAcctDtls()
     * 
     */
    public SecuritiesSettlementTransactionGenerationNotificationV12 addQtyAndAcctDtls(QuantityAndAccount117 qtyAndAcctDtls) {
        getQtyAndAcctDtls().add(qtyAndAcctDtls);
        return this;
    }

    /**
     * Adds a new item to the gnrtdRsn list.
     * @see #getGnrtdRsn()
     * 
     */
    public SecuritiesSettlementTransactionGenerationNotificationV12 addGnrtdRsn(GeneratedReason5 gnrtdRsn) {
        getGnrtdRsn().add(gnrtdRsn);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesSettlementTransactionGenerationNotificationV12 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
