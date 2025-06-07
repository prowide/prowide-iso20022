
package com.prowidesoftware.swift.model.mx.dic;

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
 * Details of the closing of the securities financing transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingTransactionDetails6", propOrder = {
    "sctiesFincgTradId",
    "clsgLegId",
    "poolId",
    "corpActnEvtId",
    "trptyAgtCollTxId",
    "clntTrptyCollTxId",
    "acctOwnr",
    "sfkpgAcct",
    "sfkpgPlc",
    "plcOfTrad",
    "finInstrmId",
    "sttlmQty",
    "opngSttlmAmt",
    "termntnTxAmt",
    "opngSttlmDt",
    "termntnDt",
    "tradDt",
    "xpctdSttlmDt",
    "xpctdValDt",
    "lateDlvryDt",
    "rateChngDt",
    "sctiesFincgTxTp",
    "sctiesMvmntTp",
    "pmt",
    "sttlmParams",
    "rateTp",
    "varblRateSpprt",
    "rpRate",
    "stockLnMrgn",
    "sctiesHrcut",
    "pricgRate",
    "sprd",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "invstr",
    "sttlmInstrPrcgAddtlDtls"
})
public class SecuritiesFinancingTransactionDetails6 {

    @XmlElement(name = "SctiesFincgTradId")
    protected String sctiesFincgTradId;
    @XmlElement(name = "ClsgLegId")
    protected String clsgLegId;
    @XmlElement(name = "PoolId")
    protected String poolId;
    @XmlElement(name = "CorpActnEvtId")
    protected String corpActnEvtId;
    @XmlElement(name = "TrptyAgtCollTxId")
    protected String trptyAgtCollTxId;
    @XmlElement(name = "ClntTrptyCollTxId")
    protected String clntTrptyCollTxId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification18Choice acctOwnr;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount17 sfkpgAcct;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat4Choice sfkpgPlc;
    @XmlElement(name = "PlcOfTrad")
    protected MarketIdentification8 plcOfTrad;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification12 finInstrmId;
    @XmlElement(name = "SttlmQty", required = true)
    protected Quantity10Choice sttlmQty;
    @XmlElement(name = "OpngSttlmAmt")
    protected AmountAndDirection12 opngSttlmAmt;
    @XmlElement(name = "TermntnTxAmt")
    protected AmountAndDirection13 termntnTxAmt;
    @XmlElement(name = "OpngSttlmDt", required = true)
    protected SettlementDate6Choice opngSttlmDt;
    @XmlElement(name = "TermntnDt")
    protected TerminationDate3Choice termntnDt;
    @XmlElement(name = "TradDt")
    protected TradeDate2Choice tradDt;
    @XmlElement(name = "XpctdSttlmDt")
    protected DateAndDateTimeChoice xpctdSttlmDt;
    @XmlElement(name = "XpctdValDt")
    protected DateAndDateTimeChoice xpctdValDt;
    @XmlElement(name = "LateDlvryDt")
    protected DateAndDateTimeChoice lateDlvryDt;
    @XmlElement(name = "RateChngDt")
    protected DateAndDateTimeChoice rateChngDt;
    @XmlElement(name = "SctiesFincgTxTp", required = true)
    @XmlSchemaType(name = "string")
    protected SecuritiesFinancingTransactionType1Code sctiesFincgTxTp;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails14 sttlmParams;
    @XmlElement(name = "RateTp")
    protected RateType8Choice rateTp;
    @XmlElement(name = "VarblRateSpprt")
    protected RateName2 varblRateSpprt;
    @XmlElement(name = "RpRate")
    protected Rate2 rpRate;
    @XmlElement(name = "StockLnMrgn")
    protected Rate2 stockLnMrgn;
    @XmlElement(name = "SctiesHrcut")
    protected Rate2 sctiesHrcut;
    @XmlElement(name = "PricgRate")
    protected RateOrName2Choice pricgRate;
    @XmlElement(name = "Sprd")
    protected Rate2 sprd;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties7 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties7 rcvgSttlmPties;
    @XmlElement(name = "Invstr")
    protected PartyIdentification15Choice invstr;
    @XmlElement(name = "SttlmInstrPrcgAddtlDtls")
    protected String sttlmInstrPrcgAddtlDtls;

    /**
     * Gets the value of the sctiesFincgTradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesFincgTradId() {
        return sctiesFincgTradId;
    }

    /**
     * Sets the value of the sctiesFincgTradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setSctiesFincgTradId(String value) {
        this.sctiesFincgTradId = value;
        return this;
    }

    /**
     * Gets the value of the clsgLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClsgLegId() {
        return clsgLegId;
    }

    /**
     * Sets the value of the clsgLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setClsgLegId(String value) {
        this.clsgLegId = value;
        return this;
    }

    /**
     * Gets the value of the poolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * Sets the value of the poolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setPoolId(String value) {
        this.poolId = value;
        return this;
    }

    /**
     * Gets the value of the corpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpActnEvtId() {
        return corpActnEvtId;
    }

    /**
     * Sets the value of the corpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setCorpActnEvtId(String value) {
        this.corpActnEvtId = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgtCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtCollTxId() {
        return trptyAgtCollTxId;
    }

    /**
     * Sets the value of the trptyAgtCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setTrptyAgtCollTxId(String value) {
        this.trptyAgtCollTxId = value;
        return this;
    }

    /**
     * Gets the value of the clntTrptyCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntTrptyCollTxId() {
        return clntTrptyCollTxId;
    }

    /**
     * Sets the value of the clntTrptyCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setClntTrptyCollTxId(String value) {
        this.clntTrptyCollTxId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification18Choice }
     *     
     */
    public PartyIdentification18Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification18Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setAcctOwnr(PartyIdentification18Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount17 }
     *     
     */
    public SecuritiesAccount17 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount17 }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setSfkpgAcct(SecuritiesAccount17 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat4Choice }
     *     
     */
    public SafekeepingPlaceFormat4Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat4Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setSfkpgPlc(SafekeepingPlaceFormat4Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification8 }
     *     
     */
    public MarketIdentification8 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification8 }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setPlcOfTrad(MarketIdentification8 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification12 }
     *     
     */
    public SecurityIdentification12 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification12 }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setFinInstrmId(SecurityIdentification12 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity10Choice }
     *     
     */
    public Quantity10Choice getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity10Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setSttlmQty(Quantity10Choice value) {
        this.sttlmQty = value;
        return this;
    }

    /**
     * Gets the value of the opngSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection12 }
     *     
     */
    public AmountAndDirection12 getOpngSttlmAmt() {
        return opngSttlmAmt;
    }

    /**
     * Sets the value of the opngSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection12 }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setOpngSttlmAmt(AmountAndDirection12 value) {
        this.opngSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the termntnTxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection13 }
     *     
     */
    public AmountAndDirection13 getTermntnTxAmt() {
        return termntnTxAmt;
    }

    /**
     * Sets the value of the termntnTxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection13 }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setTermntnTxAmt(AmountAndDirection13 value) {
        this.termntnTxAmt = value;
        return this;
    }

    /**
     * Gets the value of the opngSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate6Choice }
     *     
     */
    public SettlementDate6Choice getOpngSttlmDt() {
        return opngSttlmDt;
    }

    /**
     * Sets the value of the opngSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate6Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setOpngSttlmDt(SettlementDate6Choice value) {
        this.opngSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link TerminationDate3Choice }
     *     
     */
    public TerminationDate3Choice getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationDate3Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setTermntnDt(TerminationDate3Choice value) {
        this.termntnDt = value;
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
    public SecuritiesFinancingTransactionDetails6 setTradDt(TradeDate2Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the xpctdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getXpctdSttlmDt() {
        return xpctdSttlmDt;
    }

    /**
     * Sets the value of the xpctdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setXpctdSttlmDt(DateAndDateTimeChoice value) {
        this.xpctdSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the xpctdValDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getXpctdValDt() {
        return xpctdValDt;
    }

    /**
     * Sets the value of the xpctdValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setXpctdValDt(DateAndDateTimeChoice value) {
        this.xpctdValDt = value;
        return this;
    }

    /**
     * Gets the value of the lateDlvryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getLateDlvryDt() {
        return lateDlvryDt;
    }

    /**
     * Sets the value of the lateDlvryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setLateDlvryDt(DateAndDateTimeChoice value) {
        this.lateDlvryDt = value;
        return this;
    }

    /**
     * Gets the value of the rateChngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getRateChngDt() {
        return rateChngDt;
    }

    /**
     * Sets the value of the rateChngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setRateChngDt(DateAndDateTimeChoice value) {
        this.rateChngDt = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionType1Code }
     *     
     */
    public SecuritiesFinancingTransactionType1Code getSctiesFincgTxTp() {
        return sctiesFincgTxTp;
    }

    /**
     * Sets the value of the sctiesFincgTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionType1Code }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setSctiesFincgTxTp(SecuritiesFinancingTransactionType1Code value) {
        this.sctiesFincgTxTp = value;
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
    public SecuritiesFinancingTransactionDetails6 setSctiesMvmntTp(ReceiveDelivery1Code value) {
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
    public SecuritiesFinancingTransactionDetails6 setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails14 }
     *     
     */
    public SettlementDetails14 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails14 }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setSttlmParams(SettlementDetails14 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link RateType8Choice }
     *     
     */
    public RateType8Choice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType8Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setRateTp(RateType8Choice value) {
        this.rateTp = value;
        return this;
    }

    /**
     * Gets the value of the varblRateSpprt property.
     * 
     * @return
     *     possible object is
     *     {@link RateName2 }
     *     
     */
    public RateName2 getVarblRateSpprt() {
        return varblRateSpprt;
    }

    /**
     * Sets the value of the varblRateSpprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateName2 }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setVarblRateSpprt(RateName2 value) {
        this.varblRateSpprt = value;
        return this;
    }

    /**
     * Gets the value of the rpRate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getRpRate() {
        return rpRate;
    }

    /**
     * Sets the value of the rpRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setRpRate(Rate2 value) {
        this.rpRate = value;
        return this;
    }

    /**
     * Gets the value of the stockLnMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getStockLnMrgn() {
        return stockLnMrgn;
    }

    /**
     * Sets the value of the stockLnMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setStockLnMrgn(Rate2 value) {
        this.stockLnMrgn = value;
        return this;
    }

    /**
     * Gets the value of the sctiesHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getSctiesHrcut() {
        return sctiesHrcut;
    }

    /**
     * Sets the value of the sctiesHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setSctiesHrcut(Rate2 value) {
        this.sctiesHrcut = value;
        return this;
    }

    /**
     * Gets the value of the pricgRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrName2Choice }
     *     
     */
    public RateOrName2Choice getPricgRate() {
        return pricgRate;
    }

    /**
     * Sets the value of the pricgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrName2Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setPricgRate(RateOrName2Choice value) {
        this.pricgRate = value;
        return this;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setSprd(Rate2 value) {
        this.sprd = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties7 }
     *     
     */
    public SettlementParties7 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties7 }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setDlvrgSttlmPties(SettlementParties7 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties7 }
     *     
     */
    public SettlementParties7 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties7 }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setRcvgSttlmPties(SettlementParties7 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the invstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification15Choice }
     *     
     */
    public PartyIdentification15Choice getInvstr() {
        return invstr;
    }

    /**
     * Sets the value of the invstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification15Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setInvstr(PartyIdentification15Choice value) {
        this.invstr = value;
        return this;
    }

    /**
     * Gets the value of the sttlmInstrPrcgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmInstrPrcgAddtlDtls() {
        return sttlmInstrPrcgAddtlDtls;
    }

    /**
     * Sets the value of the sttlmInstrPrcgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancingTransactionDetails6 setSttlmInstrPrcgAddtlDtls(String value) {
        this.sttlmInstrPrcgAddtlDtls = value;
        return this;
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

}
