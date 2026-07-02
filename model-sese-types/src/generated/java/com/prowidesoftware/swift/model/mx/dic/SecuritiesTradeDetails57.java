
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the securities trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeDetails57", propOrder = {
    "ntfctnSndrTxId",
    "ntfctnRcvrTxId",
    "cmonId",
    "sctiesMvmntTp",
    "pmt",
    "tradDt",
    "sttlmDt",
    "nbOfDaysAcrd",
    "finInstrmId",
    "finInstrmAttrbts",
    "rptg",
    "qtyDtls",
    "sttlmParams",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "sttlmAmt",
    "othrAmts",
    "othrBizPties",
    "splmtryData"
})
public class SecuritiesTradeDetails57 {

    @XmlElement(name = "NtfctnSndrTxId")
    protected String ntfctnSndrTxId;
    @XmlElement(name = "NtfctnRcvrTxId")
    protected String ntfctnRcvrTxId;
    @XmlElement(name = "CmonId")
    protected String cmonId;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "TradDt")
    protected TradeDate6Choice tradDt;
    @XmlElement(name = "SttlmDt", required = true)
    protected SettlementDate12Choice sttlmDt;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes78 finInstrmAttrbts;
    @XmlElement(name = "Rptg")
    protected List<Reporting8Choice> rptg;
    @XmlElement(name = "QtyDtls", required = true)
    protected Quantity12 qtyDtls;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails103 sttlmParams;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties44 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties44 rcvgSttlmPties;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection57 sttlmAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts33 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties30 othrBizPties;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ntfctnSndrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtfctnSndrTxId() {
        return ntfctnSndrTxId;
    }

    /**
     * Sets the value of the ntfctnSndrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesTradeDetails57 setNtfctnSndrTxId(String value) {
        this.ntfctnSndrTxId = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnRcvrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtfctnRcvrTxId() {
        return ntfctnRcvrTxId;
    }

    /**
     * Sets the value of the ntfctnRcvrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesTradeDetails57 setNtfctnRcvrTxId(String value) {
        this.ntfctnRcvrTxId = value;
        return this;
    }

    /**
     * Gets the value of the cmonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonId() {
        return cmonId;
    }

    /**
     * Sets the value of the cmonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesTradeDetails57 setCmonId(String value) {
        this.cmonId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesMvmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public ReceiveDelivery1Code getSctiesMvmntTp() {
        return sctiesMvmntTp;
    }

    /**
     * Sets the value of the sctiesMvmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public SecuritiesTradeDetails57 setSctiesMvmntTp(ReceiveDelivery1Code value) {
        this.sctiesMvmntTp = value;
        return this;
    }

    /**
     * Gets the value of the pmt property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public DeliveryReceiptType2Code getPmt() {
        return pmt;
    }

    /**
     * Sets the value of the pmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public SecuritiesTradeDetails57 setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate6Choice }
     *     
     */
    public TradeDate6Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate6Choice }
     *     
     */
    public SecuritiesTradeDetails57 setTradDt(TradeDate6Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate12Choice }
     *     
     */
    public SettlementDate12Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate12Choice }
     *     
     */
    public SecuritiesTradeDetails57 setSttlmDt(SettlementDate12Choice value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Sets the value of the nbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SecuritiesTradeDetails57 setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
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
    public SecuritiesTradeDetails57 setFinInstrmId(SecurityIdentification20 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes78 }
     *     
     */
    public FinancialInstrumentAttributes78 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes78 }
     *     
     */
    public SecuritiesTradeDetails57 setFinInstrmAttrbts(FinancialInstrumentAttributes78 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the rptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reporting8Choice }
     * 
     * 
     */
    public List<Reporting8Choice> getRptg() {
        if (rptg == null) {
            rptg = new ArrayList<Reporting8Choice>();
        }
        return this.rptg;
    }

    /**
     * Gets the value of the qtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity12 }
     *     
     */
    public Quantity12 getQtyDtls() {
        return qtyDtls;
    }

    /**
     * Sets the value of the qtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity12 }
     *     
     */
    public SecuritiesTradeDetails57 setQtyDtls(Quantity12 value) {
        this.qtyDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails103 }
     *     
     */
    public SettlementDetails103 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails103 }
     *     
     */
    public SecuritiesTradeDetails57 setSttlmParams(SettlementDetails103 value) {
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
    public SecuritiesTradeDetails57 setDlvrgSttlmPties(SettlementParties44 value) {
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
    public SecuritiesTradeDetails57 setRcvgSttlmPties(SettlementParties44 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection57 }
     *     
     */
    public AmountAndDirection57 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection57 }
     *     
     */
    public SecuritiesTradeDetails57 setSttlmAmt(AmountAndDirection57 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts33 }
     *     
     */
    public OtherAmounts33 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts33 }
     *     
     */
    public SecuritiesTradeDetails57 setOthrAmts(OtherAmounts33 value) {
        this.othrAmts = value;
        return this;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties30 }
     *     
     */
    public OtherParties30 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties30 }
     *     
     */
    public SecuritiesTradeDetails57 setOthrBizPties(OtherParties30 value) {
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
     * Adds a new item to the rptg list.
     * @see #getRptg()
     * 
     */
    public SecuritiesTradeDetails57 addRptg(Reporting8Choice rptg) {
        getRptg().add(rptg);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesTradeDetails57 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
