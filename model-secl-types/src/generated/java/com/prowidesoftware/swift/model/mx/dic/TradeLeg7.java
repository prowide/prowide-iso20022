
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "TradeLeg7", propOrder = {
    "tradLegId",
    "tradId",
    "tradExctnId",
    "tradDt",
    "sttlmDt",
    "tradgCcy",
    "buySellInd",
    "tradQty",
    "dealPric",
    "plcOfTrad",
    "plcOfListg",
    "tradTp",
    "derivRltdTrad",
    "tradgPty",
    "tradgPtyAcct",
    "tradgCpcty",
    "tradPstngCd"
})
public class TradeLeg7 {

    @XmlElement(name = "TradLegId", required = true)
    protected String tradLegId;
    @XmlElement(name = "TradId")
    protected String tradId;
    @XmlElement(name = "TradExctnId", required = true)
    protected String tradExctnId;
    @XmlElement(name = "TradDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate tradDt;
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
    @XmlElement(name = "PlcOfTrad", required = true)
    protected MarketIdentification20 plcOfTrad;
    @XmlElement(name = "PlcOfListg")
    protected MarketIdentification21 plcOfListg;
    @XmlElement(name = "TradTp", required = true)
    @XmlSchemaType(name = "string")
    protected TradeType1Code tradTp;
    @XmlElement(name = "DerivRltdTrad")
    protected Boolean derivRltdTrad;
    @XmlElement(name = "TradgPty", required = true)
    protected PartyIdentification35Choice tradgPty;
    @XmlElement(name = "TradgPtyAcct")
    protected SecuritiesAccount19 tradgPtyAcct;
    @XmlElement(name = "TradgCpcty", required = true)
    @XmlSchemaType(name = "string")
    protected TradingCapacity5Code tradgCpcty;
    @XmlElement(name = "TradPstngCd")
    @XmlSchemaType(name = "string")
    protected TradePosting1Code tradPstngCd;

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
    public TradeLeg7 setTradLegId(String value) {
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
    public TradeLeg7 setTradId(String value) {
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
    public TradeLeg7 setTradExctnId(String value) {
        this.tradExctnId = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeLeg7 setTradDt(LocalDate value) {
        this.tradDt = value;
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
    public TradeLeg7 setSttlmDt(DateFormat15Choice value) {
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
    public TradeLeg7 setTradgCcy(String value) {
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
    public TradeLeg7 setBuySellInd(Side1Code value) {
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
    public TradeLeg7 setTradQty(FinancialInstrumentQuantity1Choice value) {
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
    public TradeLeg7 setDealPric(Price4 value) {
        this.dealPric = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification20 }
     *     
     */
    public MarketIdentification20 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification20 }
     *     
     */
    public TradeLeg7 setPlcOfTrad(MarketIdentification20 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the plcOfListg property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification21 }
     *     
     */
    public MarketIdentification21 getPlcOfListg() {
        return plcOfListg;
    }

    /**
     * Sets the value of the plcOfListg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification21 }
     *     
     */
    public TradeLeg7 setPlcOfListg(MarketIdentification21 value) {
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
    public TradeLeg7 setTradTp(TradeType1Code value) {
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
    public TradeLeg7 setDerivRltdTrad(Boolean value) {
        this.derivRltdTrad = value;
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
    public TradeLeg7 setTradgPty(PartyIdentification35Choice value) {
        this.tradgPty = value;
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
    public TradeLeg7 setTradgPtyAcct(SecuritiesAccount19 value) {
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
    public TradeLeg7 setTradgCpcty(TradingCapacity5Code value) {
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
    public TradeLeg7 setTradPstngCd(TradePosting1Code value) {
        this.tradPstngCd = value;
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
