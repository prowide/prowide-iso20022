
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
@XmlType(name = "SecuritiesFinancingTransactionDetails57", propOrder = {
    "sctiesFincgTradId",
    "sctiesFincgUnqTxIdr",
    "clsgLegId",
    "poolId",
    "corpActnEvtId",
    "trptyAgtSvcPrvdrCollTxId",
    "clntTrptyCollTxId",
    "acctOwnr",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
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
public class SecuritiesFinancingTransactionDetails57 {

    @XmlElement(name = "SctiesFincgTradId")
    protected String sctiesFincgTradId;
    @XmlElement(name = "SctiesFincgUnqTxIdr")
    protected String sctiesFincgUnqTxIdr;
    @XmlElement(name = "ClsgLegId")
    protected String clsgLegId;
    @XmlElement(name = "PoolId")
    protected String poolId;
    @XmlElement(name = "CorpActnEvtId")
    protected String corpActnEvtId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollTxId")
    protected String trptyAgtSvcPrvdrCollTxId;
    @XmlElement(name = "ClntTrptyCollTxId")
    protected String clntTrptyCollTxId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification144 acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace5 sfkpgPlc;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification1 plcOfTrad;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "SttlmQty", required = true)
    protected Quantity51Choice sttlmQty;
    @XmlElement(name = "OpngSttlmAmt")
    protected AmountAndDirection51 opngSttlmAmt;
    @XmlElement(name = "TermntnTxAmt")
    protected AmountAndDirection21 termntnTxAmt;
    @XmlElement(name = "OpngSttlmDt", required = true)
    protected SettlementDate19Choice opngSttlmDt;
    @XmlElement(name = "TermntnDt")
    protected TerminationDate6Choice termntnDt;
    @XmlElement(name = "TradDt")
    protected TradeDate8Choice tradDt;
    @XmlElement(name = "XpctdSttlmDt")
    protected DateAndDateTime2Choice xpctdSttlmDt;
    @XmlElement(name = "XpctdValDt")
    protected DateAndDateTime2Choice xpctdValDt;
    @XmlElement(name = "LateDlvryDt")
    protected DateAndDateTime2Choice lateDlvryDt;
    @XmlElement(name = "RateChngDt")
    protected DateAndDateTime2Choice rateChngDt;
    @XmlElement(name = "SctiesFincgTxTp", required = true)
    @XmlSchemaType(name = "string")
    protected SecuritiesFinancingTransactionType2Code sctiesFincgTxTp;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails170 sttlmParams;
    @XmlElement(name = "RateTp")
    protected RateType35Choice rateTp;
    @XmlElement(name = "VarblRateSpprt")
    protected RateName1 varblRateSpprt;
    @XmlElement(name = "RpRate")
    protected Rate2 rpRate;
    @XmlElement(name = "StockLnMrgn")
    protected Rate2 stockLnMrgn;
    @XmlElement(name = "SctiesHrcut")
    protected Rate2 sctiesHrcut;
    @XmlElement(name = "PricgRate")
    protected RateOrName1Choice pricgRate;
    @XmlElement(name = "Sprd")
    protected Rate2 sprd;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties127 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties127 rcvgSttlmPties;
    @XmlElement(name = "Invstr")
    protected PartyIdentification149 invstr;
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
    public SecuritiesFinancingTransactionDetails57 setSctiesFincgTradId(String value) {
        this.sctiesFincgTradId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgUnqTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesFincgUnqTxIdr() {
        return sctiesFincgUnqTxIdr;
    }

    /**
     * Sets the value of the sctiesFincgUnqTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setSctiesFincgUnqTxIdr(String value) {
        this.sctiesFincgUnqTxIdr = value;
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
    public SecuritiesFinancingTransactionDetails57 setClsgLegId(String value) {
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
    public SecuritiesFinancingTransactionDetails57 setPoolId(String value) {
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
    public SecuritiesFinancingTransactionDetails57 setCorpActnEvtId(String value) {
        this.corpActnEvtId = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollTxId() {
        return trptyAgtSvcPrvdrCollTxId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setTrptyAgtSvcPrvdrCollTxId(String value) {
        this.trptyAgtSvcPrvdrCollTxId = value;
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
    public SecuritiesFinancingTransactionDetails57 setClntTrptyCollTxId(String value) {
        this.clntTrptyCollTxId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification144 }
     *     
     */
    public PartyIdentification144 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification144 }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setAcctOwnr(PartyIdentification144 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public BlockChainAddressWallet3 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace5 }
     *     
     */
    public SafeKeepingPlace5 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace5 }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setSfkpgPlc(SafeKeepingPlace5 value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification1 }
     *     
     */
    public PlaceOfTradeIdentification1 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification1 }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setPlcOfTrad(PlaceOfTradeIdentification1 value) {
        this.plcOfTrad = value;
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
    public SecuritiesFinancingTransactionDetails57 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setSttlmQty(Quantity51Choice value) {
        this.sttlmQty = value;
        return this;
    }

    /**
     * Gets the value of the opngSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection51 }
     *     
     */
    public AmountAndDirection51 getOpngSttlmAmt() {
        return opngSttlmAmt;
    }

    /**
     * Sets the value of the opngSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection51 }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setOpngSttlmAmt(AmountAndDirection51 value) {
        this.opngSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the termntnTxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getTermntnTxAmt() {
        return termntnTxAmt;
    }

    /**
     * Sets the value of the termntnTxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setTermntnTxAmt(AmountAndDirection21 value) {
        this.termntnTxAmt = value;
        return this;
    }

    /**
     * Gets the value of the opngSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate19Choice }
     *     
     */
    public SettlementDate19Choice getOpngSttlmDt() {
        return opngSttlmDt;
    }

    /**
     * Sets the value of the opngSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate19Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setOpngSttlmDt(SettlementDate19Choice value) {
        this.opngSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link TerminationDate6Choice }
     *     
     */
    public TerminationDate6Choice getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationDate6Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setTermntnDt(TerminationDate6Choice value) {
        this.termntnDt = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate8Choice }
     *     
     */
    public TradeDate8Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate8Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setTradDt(TradeDate8Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the xpctdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getXpctdSttlmDt() {
        return xpctdSttlmDt;
    }

    /**
     * Sets the value of the xpctdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setXpctdSttlmDt(DateAndDateTime2Choice value) {
        this.xpctdSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the xpctdValDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getXpctdValDt() {
        return xpctdValDt;
    }

    /**
     * Sets the value of the xpctdValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setXpctdValDt(DateAndDateTime2Choice value) {
        this.xpctdValDt = value;
        return this;
    }

    /**
     * Gets the value of the lateDlvryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getLateDlvryDt() {
        return lateDlvryDt;
    }

    /**
     * Sets the value of the lateDlvryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setLateDlvryDt(DateAndDateTime2Choice value) {
        this.lateDlvryDt = value;
        return this;
    }

    /**
     * Gets the value of the rateChngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getRateChngDt() {
        return rateChngDt;
    }

    /**
     * Sets the value of the rateChngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setRateChngDt(DateAndDateTime2Choice value) {
        this.rateChngDt = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionType2Code }
     *     
     */
    public SecuritiesFinancingTransactionType2Code getSctiesFincgTxTp() {
        return sctiesFincgTxTp;
    }

    /**
     * Sets the value of the sctiesFincgTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionType2Code }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setSctiesFincgTxTp(SecuritiesFinancingTransactionType2Code value) {
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
    public SecuritiesFinancingTransactionDetails57 setSctiesMvmntTp(ReceiveDelivery1Code value) {
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
    public SecuritiesFinancingTransactionDetails57 setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails170 }
     *     
     */
    public SettlementDetails170 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails170 }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setSttlmParams(SettlementDetails170 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link RateType35Choice }
     *     
     */
    public RateType35Choice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType35Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setRateTp(RateType35Choice value) {
        this.rateTp = value;
        return this;
    }

    /**
     * Gets the value of the varblRateSpprt property.
     * 
     * @return
     *     possible object is
     *     {@link RateName1 }
     *     
     */
    public RateName1 getVarblRateSpprt() {
        return varblRateSpprt;
    }

    /**
     * Sets the value of the varblRateSpprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateName1 }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setVarblRateSpprt(RateName1 value) {
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
    public SecuritiesFinancingTransactionDetails57 setRpRate(Rate2 value) {
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
    public SecuritiesFinancingTransactionDetails57 setStockLnMrgn(Rate2 value) {
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
    public SecuritiesFinancingTransactionDetails57 setSctiesHrcut(Rate2 value) {
        this.sctiesHrcut = value;
        return this;
    }

    /**
     * Gets the value of the pricgRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrName1Choice }
     *     
     */
    public RateOrName1Choice getPricgRate() {
        return pricgRate;
    }

    /**
     * Sets the value of the pricgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrName1Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setPricgRate(RateOrName1Choice value) {
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
    public SecuritiesFinancingTransactionDetails57 setSprd(Rate2 value) {
        this.sprd = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties127 }
     *     
     */
    public SettlementParties127 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties127 }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setDlvrgSttlmPties(SettlementParties127 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties127 }
     *     
     */
    public SettlementParties127 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties127 }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setRcvgSttlmPties(SettlementParties127 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the invstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification149 }
     *     
     */
    public PartyIdentification149 getInvstr() {
        return invstr;
    }

    /**
     * Sets the value of the invstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification149 }
     *     
     */
    public SecuritiesFinancingTransactionDetails57 setInvstr(PartyIdentification149 value) {
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
    public SecuritiesFinancingTransactionDetails57 setSttlmInstrPrcgAddtlDtls(String value) {
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
