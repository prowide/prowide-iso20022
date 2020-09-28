
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
@XmlType(name = "SecuritiesTradeDetails20", propOrder = {
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
public class SecuritiesTradeDetails20 {

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
    protected TradeDate2Choice tradDt;
    @XmlElement(name = "SttlmDt", required = true)
    protected SettlementDate4Choice sttlmDt;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification15 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes28 finInstrmAttrbts;
    @XmlElement(name = "Rptg")
    protected List<Reporting4Choice> rptg;
    @XmlElement(name = "QtyDtls", required = true)
    protected Quantity6 qtyDtls;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails18 sttlmParams;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties17 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties17 rcvgSttlmPties;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection15 sttlmAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts6 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties13 othrBizPties;
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
    public SecuritiesTradeDetails20 setNtfctnSndrTxId(String value) {
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
    public SecuritiesTradeDetails20 setNtfctnRcvrTxId(String value) {
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
    public SecuritiesTradeDetails20 setCmonId(String value) {
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
    public SecuritiesTradeDetails20 setSctiesMvmntTp(ReceiveDelivery1Code value) {
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
    public SecuritiesTradeDetails20 setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate2Choice }
     *     
     */
    public TradeDate2Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate2Choice }
     *     
     */
    public SecuritiesTradeDetails20 setTradDt(TradeDate2Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate4Choice }
     *     
     */
    public SettlementDate4Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate4Choice }
     *     
     */
    public SecuritiesTradeDetails20 setSttlmDt(SettlementDate4Choice value) {
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
    public SecuritiesTradeDetails20 setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
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
    public SecuritiesTradeDetails20 setFinInstrmId(SecurityIdentification15 value) {
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
    public SecuritiesTradeDetails20 setFinInstrmAttrbts(FinancialInstrumentAttributes28 value) {
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
     * {@link Reporting4Choice }
     * 
     * 
     */
    public List<Reporting4Choice> getRptg() {
        if (rptg == null) {
            rptg = new ArrayList<Reporting4Choice>();
        }
        return this.rptg;
    }

    /**
     * Gets the value of the qtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity6 }
     *     
     */
    public Quantity6 getQtyDtls() {
        return qtyDtls;
    }

    /**
     * Sets the value of the qtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity6 }
     *     
     */
    public SecuritiesTradeDetails20 setQtyDtls(Quantity6 value) {
        this.qtyDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails18 }
     *     
     */
    public SettlementDetails18 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails18 }
     *     
     */
    public SecuritiesTradeDetails20 setSttlmParams(SettlementDetails18 value) {
        this.sttlmParams = value;
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
    public SecuritiesTradeDetails20 setDlvrgSttlmPties(SettlementParties17 value) {
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
    public SecuritiesTradeDetails20 setRcvgSttlmPties(SettlementParties17 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection15 }
     *     
     */
    public AmountAndDirection15 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection15 }
     *     
     */
    public SecuritiesTradeDetails20 setSttlmAmt(AmountAndDirection15 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts6 }
     *     
     */
    public OtherAmounts6 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts6 }
     *     
     */
    public SecuritiesTradeDetails20 setOthrAmts(OtherAmounts6 value) {
        this.othrAmts = value;
        return this;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties13 }
     *     
     */
    public OtherParties13 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties13 }
     *     
     */
    public SecuritiesTradeDetails20 setOthrBizPties(OtherParties13 value) {
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
    public SecuritiesTradeDetails20 addRptg(Reporting4Choice rptg) {
        getRptg().add(rptg);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesTradeDetails20 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
