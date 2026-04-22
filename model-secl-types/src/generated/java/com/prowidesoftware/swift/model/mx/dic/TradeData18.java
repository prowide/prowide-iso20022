
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Provides the trade details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeData18", propOrder = {
    "tradDt",
    "tradExctnTm",
    "sttlmDt",
    "finInstrmId",
    "buySellInd",
    "tradQty",
    "dealPric",
    "plcOfTrad",
    "sttlmAmt",
    "tradRsn",
    "tradTxDt",
    "sctiesTxTp",
    "tradTxCond",
    "sttlmTxCond",
    "nvtnSts",
    "sttlmSts",
    "ordrId",
    "tradCtrPtyClrMmbId",
    "tradCtrPtyMmbId",
    "tradgPty"
})
public class TradeData18 {

    @XmlElement(name = "TradDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate tradDt;
    @XmlElement(name = "TradExctnTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime tradExctnTm;
    @XmlElement(name = "SttlmDt", required = true)
    protected DateAndDateTime2Choice sttlmDt;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "BuySellInd", required = true)
    @XmlSchemaType(name = "string")
    protected Side1Code buySellInd;
    @XmlElement(name = "TradQty", required = true)
    protected FinancialInstrumentQuantity1Choice tradQty;
    @XmlElement(name = "DealPric", required = true)
    protected Price14 dealPric;
    @XmlElement(name = "PlcOfTrad", required = true)
    protected MarketIdentification84 plcOfTrad;
    @XmlElement(name = "SttlmAmt", required = true)
    protected AmountAndDirection27 sttlmAmt;
    @XmlElement(name = "TradRsn", required = true)
    protected GenericIdentification30 tradRsn;
    @XmlElement(name = "TradTxDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate tradTxDt;
    @XmlElement(name = "SctiesTxTp", required = true)
    protected SecuritiesTransactionType47Choice sctiesTxTp;
    @XmlElement(name = "TradTxCond")
    protected List<TradeTransactionCondition5Choice> tradTxCond;
    @XmlElement(name = "SttlmTxCond")
    protected List<SettlementTransactionCondition16Choice> sttlmTxCond;
    @XmlElement(name = "NvtnSts", required = true)
    @XmlSchemaType(name = "string")
    protected NovationStatus1Code nvtnSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus19Choice sttlmSts;
    @XmlElement(name = "OrdrId")
    protected String ordrId;
    @XmlElement(name = "TradCtrPtyClrMmbId", required = true)
    protected PartyIdentification180Choice tradCtrPtyClrMmbId;
    @XmlElement(name = "TradCtrPtyMmbId")
    protected PartyIdentification180Choice tradCtrPtyMmbId;
    @XmlElement(name = "TradgPty", required = true)
    protected PartyIdentification180Choice tradgPty;

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
    public TradeData18 setTradDt(LocalDate value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the tradExctnTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTradExctnTm() {
        return tradExctnTm;
    }

    /**
     * Sets the value of the tradExctnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData18 setTradExctnTm(OffsetDateTime value) {
        this.tradExctnTm = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TradeData18 setSttlmDt(DateAndDateTime2Choice value) {
        this.sttlmDt = value;
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
    public TradeData18 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
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
    public TradeData18 setBuySellInd(Side1Code value) {
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
    public TradeData18 setTradQty(FinancialInstrumentQuantity1Choice value) {
        this.tradQty = value;
        return this;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public TradeData18 setDealPric(Price14 value) {
        this.dealPric = value;
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
    public TradeData18 setPlcOfTrad(MarketIdentification84 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection27 }
     *     
     */
    public AmountAndDirection27 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection27 }
     *     
     */
    public TradeData18 setSttlmAmt(AmountAndDirection27 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the tradRsn property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getTradRsn() {
        return tradRsn;
    }

    /**
     * Sets the value of the tradRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public TradeData18 setTradRsn(GenericIdentification30 value) {
        this.tradRsn = value;
        return this;
    }

    /**
     * Gets the value of the tradTxDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTradTxDt() {
        return tradTxDt;
    }

    /**
     * Sets the value of the tradTxDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeData18 setTradTxDt(LocalDate value) {
        this.tradTxDt = value;
        return this;
    }

    /**
     * Gets the value of the sctiesTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionType47Choice }
     *     
     */
    public SecuritiesTransactionType47Choice getSctiesTxTp() {
        return sctiesTxTp;
    }

    /**
     * Sets the value of the sctiesTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionType47Choice }
     *     
     */
    public TradeData18 setSctiesTxTp(SecuritiesTransactionType47Choice value) {
        this.sctiesTxTp = value;
        return this;
    }

    /**
     * Gets the value of the tradTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeTransactionCondition5Choice }
     * 
     * 
     * @return
     *     The value of the tradTxCond property.
     */
    public List<TradeTransactionCondition5Choice> getTradTxCond() {
        if (tradTxCond == null) {
            tradTxCond = new ArrayList<>();
        }
        return this.tradTxCond;
    }

    /**
     * Gets the value of the sttlmTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementTransactionCondition16Choice }
     * 
     * 
     * @return
     *     The value of the sttlmTxCond property.
     */
    public List<SettlementTransactionCondition16Choice> getSttlmTxCond() {
        if (sttlmTxCond == null) {
            sttlmTxCond = new ArrayList<>();
        }
        return this.sttlmTxCond;
    }

    /**
     * Gets the value of the nvtnSts property.
     * 
     * @return
     *     possible object is
     *     {@link NovationStatus1Code }
     *     
     */
    public NovationStatus1Code getNvtnSts() {
        return nvtnSts;
    }

    /**
     * Sets the value of the nvtnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NovationStatus1Code }
     *     
     */
    public TradeData18 setNvtnSts(NovationStatus1Code value) {
        this.nvtnSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus19Choice }
     *     
     */
    public SettlementStatus19Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus19Choice }
     *     
     */
    public TradeData18 setSttlmSts(SettlementStatus19Choice value) {
        this.sttlmSts = value;
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
    public TradeData18 setOrdrId(String value) {
        this.ordrId = value;
        return this;
    }

    /**
     * Gets the value of the tradCtrPtyClrMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification180Choice }
     *     
     */
    public PartyIdentification180Choice getTradCtrPtyClrMmbId() {
        return tradCtrPtyClrMmbId;
    }

    /**
     * Sets the value of the tradCtrPtyClrMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification180Choice }
     *     
     */
    public TradeData18 setTradCtrPtyClrMmbId(PartyIdentification180Choice value) {
        this.tradCtrPtyClrMmbId = value;
        return this;
    }

    /**
     * Gets the value of the tradCtrPtyMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification180Choice }
     *     
     */
    public PartyIdentification180Choice getTradCtrPtyMmbId() {
        return tradCtrPtyMmbId;
    }

    /**
     * Sets the value of the tradCtrPtyMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification180Choice }
     *     
     */
    public TradeData18 setTradCtrPtyMmbId(PartyIdentification180Choice value) {
        this.tradCtrPtyMmbId = value;
        return this;
    }

    /**
     * Gets the value of the tradgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification180Choice }
     *     
     */
    public PartyIdentification180Choice getTradgPty() {
        return tradgPty;
    }

    /**
     * Sets the value of the tradgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification180Choice }
     *     
     */
    public TradeData18 setTradgPty(PartyIdentification180Choice value) {
        this.tradgPty = value;
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

    /**
     * Adds a new item to the tradTxCond list.
     * @see #getTradTxCond()
     * 
     */
    public TradeData18 addTradTxCond(TradeTransactionCondition5Choice tradTxCond) {
        getTradTxCond().add(tradTxCond);
        return this;
    }

    /**
     * Adds a new item to the sttlmTxCond list.
     * @see #getSttlmTxCond()
     * 
     */
    public TradeData18 addSttlmTxCond(SettlementTransactionCondition16Choice sttlmTxCond) {
        getSttlmTxCond().add(sttlmTxCond);
        return this;
    }

}
