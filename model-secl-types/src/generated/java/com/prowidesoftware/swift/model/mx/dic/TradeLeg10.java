
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the trade leg details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeLeg10", propOrder = {
    "tradLegId",
    "tradId",
    "tradExctnId",
    "ordrId",
    "allcnId",
    "tradDt",
    "txDtAndTm",
    "sttlmDt",
    "tradgCcy",
    "buySellInd",
    "tradQty",
    "dealPric",
    "grssAmt",
    "plcOfTrad",
    "plcOfListg",
    "tradTp",
    "derivRltdTrad",
    "brkr",
    "tradgPty",
    "tradRegnOrgn",
    "tradgPtyAcct",
    "tradgCpcty",
    "tradPstngCd",
    "sfkpgPlc",
    "sfkpgAcct"
})
public class TradeLeg10 {

    @XmlElement(name = "TradLegId", required = true)
    protected String tradLegId;
    @XmlElement(name = "TradId")
    protected String tradId;
    @XmlElement(name = "TradExctnId", required = true)
    protected String tradExctnId;
    @XmlElement(name = "OrdrId")
    protected String ordrId;
    @XmlElement(name = "AllcnId")
    protected String allcnId;
    @XmlElement(name = "TradDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "TxDtAndTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txDtAndTm;
    @XmlElement(name = "SttlmDt", required = true)
    protected DateFormat15Choice sttlmDt;
    @XmlElement(name = "TradgCcy")
    protected String tradgCcy;
    @XmlElement(name = "BuySellInd", required = true)
    @XmlSchemaType(name = "string")
    protected Side1Code buySellInd;
    @XmlElement(name = "TradQty", required = true)
    protected FinancialInstrumentQuantity1Choice tradQty;
    @XmlElement(name = "DealPric", required = true)
    protected Price4 dealPric;
    @XmlElement(name = "GrssAmt")
    protected AmountAndDirection21 grssAmt;
    @XmlElement(name = "PlcOfTrad", required = true)
    protected MarketIdentification84 plcOfTrad;
    @XmlElement(name = "PlcOfListg")
    protected MarketIdentification85 plcOfListg;
    @XmlElement(name = "TradTp", required = true)
    @XmlSchemaType(name = "string")
    protected TradeType1Code tradTp;
    @XmlElement(name = "DerivRltdTrad")
    protected Boolean derivRltdTrad;
    @XmlElement(name = "Brkr")
    protected PartyIdentificationAndAccount100 brkr;
    @XmlElement(name = "TradgPty", required = true)
    protected PartyIdentification35Choice tradgPty;
    @XmlElement(name = "TradRegnOrgn")
    protected String tradRegnOrgn;
    @XmlElement(name = "TradgPtyAcct")
    protected SecuritiesAccount19 tradgPtyAcct;
    @XmlElement(name = "TradgCpcty", required = true)
    @XmlSchemaType(name = "string")
    protected TradingCapacity5Code tradgCpcty;
    @XmlElement(name = "TradPstngCd")
    @XmlSchemaType(name = "string")
    protected TradePosting1Code tradPstngCd;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat7Choice sfkpgPlc;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;

    /**
     * Gets the value of the tradLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradLegId() {
        return tradLegId;
    }

    /**
     * Sets the value of the tradLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeLeg10 setTradLegId(String value) {
        this.tradLegId = value;
        return this;
    }

    /**
     * Gets the value of the tradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradId() {
        return tradId;
    }

    /**
     * Sets the value of the tradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeLeg10 setTradId(String value) {
        this.tradId = value;
        return this;
    }

    /**
     * Gets the value of the tradExctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradExctnId() {
        return tradExctnId;
    }

    /**
     * Sets the value of the tradExctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeLeg10 setTradExctnId(String value) {
        this.tradExctnId = value;
        return this;
    }

    /**
     * Gets the value of the ordrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrId() {
        return ordrId;
    }

    /**
     * Sets the value of the ordrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeLeg10 setOrdrId(String value) {
        this.ordrId = value;
        return this;
    }

    /**
     * Gets the value of the allcnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllcnId() {
        return allcnId;
    }

    /**
     * Sets the value of the allcnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeLeg10 setAllcnId(String value) {
        this.allcnId = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TradeLeg10 setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the txDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxDtAndTm() {
        return txDtAndTm;
    }

    /**
     * Sets the value of the txDtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TradeLeg10 setTxDtAndTm(XMLGregorianCalendar value) {
        this.txDtAndTm = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat15Choice }
     *     
     */
    public DateFormat15Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat15Choice }
     *     
     */
    public TradeLeg10 setSttlmDt(DateFormat15Choice value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the tradgCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgCcy() {
        return tradgCcy;
    }

    /**
     * Sets the value of the tradgCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeLeg10 setTradgCcy(String value) {
        this.tradgCcy = value;
        return this;
    }

    /**
     * Gets the value of the buySellInd property.
     * 
     * @return
     *     possible object is
     *     {@link Side1Code }
     *     
     */
    public Side1Code getBuySellInd() {
        return buySellInd;
    }

    /**
     * Sets the value of the buySellInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side1Code }
     *     
     */
    public TradeLeg10 setBuySellInd(Side1Code value) {
        this.buySellInd = value;
        return this;
    }

    /**
     * Gets the value of the tradQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getTradQty() {
        return tradQty;
    }

    /**
     * Sets the value of the tradQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public TradeLeg10 setTradQty(FinancialInstrumentQuantity1Choice value) {
        this.tradQty = value;
        return this;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public TradeLeg10 setDealPric(Price4 value) {
        this.dealPric = value;
        return this;
    }

    /**
     * Gets the value of the grssAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getGrssAmt() {
        return grssAmt;
    }

    /**
     * Sets the value of the grssAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public TradeLeg10 setGrssAmt(AmountAndDirection21 value) {
        this.grssAmt = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification84 }
     *     
     */
    public MarketIdentification84 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification84 }
     *     
     */
    public TradeLeg10 setPlcOfTrad(MarketIdentification84 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the plcOfListg property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification85 }
     *     
     */
    public MarketIdentification85 getPlcOfListg() {
        return plcOfListg;
    }

    /**
     * Sets the value of the plcOfListg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification85 }
     *     
     */
    public TradeLeg10 setPlcOfListg(MarketIdentification85 value) {
        this.plcOfListg = value;
        return this;
    }

    /**
     * Gets the value of the tradTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeType1Code }
     *     
     */
    public TradeType1Code getTradTp() {
        return tradTp;
    }

    /**
     * Sets the value of the tradTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeType1Code }
     *     
     */
    public TradeLeg10 setTradTp(TradeType1Code value) {
        this.tradTp = value;
        return this;
    }

    /**
     * Gets the value of the derivRltdTrad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDerivRltdTrad() {
        return derivRltdTrad;
    }

    /**
     * Sets the value of the derivRltdTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeLeg10 setDerivRltdTrad(Boolean value) {
        this.derivRltdTrad = value;
        return this;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount100 }
     *     
     */
    public PartyIdentificationAndAccount100 getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount100 }
     *     
     */
    public TradeLeg10 setBrkr(PartyIdentificationAndAccount100 value) {
        this.brkr = value;
        return this;
    }

    /**
     * Gets the value of the tradgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getTradgPty() {
        return tradgPty;
    }

    /**
     * Sets the value of the tradgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public TradeLeg10 setTradgPty(PartyIdentification35Choice value) {
        this.tradgPty = value;
        return this;
    }

    /**
     * Gets the value of the tradRegnOrgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradRegnOrgn() {
        return tradRegnOrgn;
    }

    /**
     * Sets the value of the tradRegnOrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeLeg10 setTradRegnOrgn(String value) {
        this.tradRegnOrgn = value;
        return this;
    }

    /**
     * Gets the value of the tradgPtyAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getTradgPtyAcct() {
        return tradgPtyAcct;
    }

    /**
     * Sets the value of the tradgPtyAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public TradeLeg10 setTradgPtyAcct(SecuritiesAccount19 value) {
        this.tradgPtyAcct = value;
        return this;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity5Code }
     *     
     */
    public TradingCapacity5Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity5Code }
     *     
     */
    public TradeLeg10 setTradgCpcty(TradingCapacity5Code value) {
        this.tradgCpcty = value;
        return this;
    }

    /**
     * Gets the value of the tradPstngCd property.
     * 
     * @return
     *     possible object is
     *     {@link TradePosting1Code }
     *     
     */
    public TradePosting1Code getTradPstngCd() {
        return tradPstngCd;
    }

    /**
     * Sets the value of the tradPstngCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePosting1Code }
     *     
     */
    public TradeLeg10 setTradPstngCd(TradePosting1Code value) {
        this.tradPstngCd = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat7Choice }
     *     
     */
    public SafekeepingPlaceFormat7Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat7Choice }
     *     
     */
    public TradeLeg10 setSfkpgPlc(SafekeepingPlaceFormat7Choice value) {
        this.sfkpgPlc = value;
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
    public TradeLeg10 setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
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
