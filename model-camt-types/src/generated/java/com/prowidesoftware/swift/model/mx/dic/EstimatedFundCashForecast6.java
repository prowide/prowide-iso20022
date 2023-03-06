
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Cash movements from or to a fund as a result of investment funds transactions, eg, subscriptions or redemptions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedFundCashForecast6", propOrder = {
    "id",
    "tradDtTm",
    "prvsTradDtTm",
    "finInstrmDtls",
    "estmtdTtlNAV",
    "prvsTtlNAV",
    "estmtdTtlUnitsNb",
    "prvsTtlUnitsNb",
    "estmtdTtlNAVChngRate",
    "invstmtCcy",
    "ccySts",
    "xcptnlNetCshFlowInd",
    "pric",
    "fxRate",
    "estmtdPctgOfShrClssTtlNAV",
    "estmtdCshInFcstDtls",
    "estmtdCshOutFcstDtls",
    "estmtdNetCshFcstDtls"
})
public class EstimatedFundCashForecast6 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "TradDtTm", required = true)
    protected DateAndDateTimeChoice tradDtTm;
    @XmlElement(name = "PrvsTradDtTm")
    protected DateAndDateTimeChoice prvsTradDtTm;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument9 finInstrmDtls;
    @XmlElement(name = "EstmtdTtlNAV")
    protected List<ActiveOrHistoricCurrencyAndAmount> estmtdTtlNAV;
    @XmlElement(name = "PrvsTtlNAV")
    protected List<ActiveOrHistoricCurrencyAndAmount> prvsTtlNAV;
    @XmlElement(name = "EstmtdTtlUnitsNb")
    protected FinancialInstrumentQuantity1 estmtdTtlUnitsNb;
    @XmlElement(name = "PrvsTtlUnitsNb")
    protected FinancialInstrumentQuantity1 prvsTtlUnitsNb;
    @XmlElement(name = "EstmtdTtlNAVChngRate")
    protected BigDecimal estmtdTtlNAVChngRate;
    @XmlElement(name = "InvstmtCcy")
    protected List<String> invstmtCcy;
    @XmlElement(name = "CcySts")
    protected CurrencyDesignation1 ccySts;
    @XmlElement(name = "XcptnlNetCshFlowInd")
    protected boolean xcptnlNetCshFlowInd;
    @XmlElement(name = "Pric")
    protected UnitPrice19 pric;
    @XmlElement(name = "FXRate")
    protected ForeignExchangeTerms19 fxRate;
    @XmlElement(name = "EstmtdPctgOfShrClssTtlNAV")
    protected BigDecimal estmtdPctgOfShrClssTtlNAV;
    @XmlElement(name = "EstmtdCshInFcstDtls")
    protected List<CashInForecast6> estmtdCshInFcstDtls;
    @XmlElement(name = "EstmtdCshOutFcstDtls")
    protected List<CashOutForecast6> estmtdCshOutFcstDtls;
    @XmlElement(name = "EstmtdNetCshFcstDtls")
    protected List<NetCashForecast4> estmtdNetCshFcstDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EstimatedFundCashForecast6 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the tradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getTradDtTm() {
        return tradDtTm;
    }

    /**
     * Sets the value of the tradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public EstimatedFundCashForecast6 setTradDtTm(DateAndDateTimeChoice value) {
        this.tradDtTm = value;
        return this;
    }

    /**
     * Gets the value of the prvsTradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getPrvsTradDtTm() {
        return prvsTradDtTm;
    }

    /**
     * Sets the value of the prvsTradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public EstimatedFundCashForecast6 setPrvsTradDtTm(DateAndDateTimeChoice value) {
        this.prvsTradDtTm = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument9 }
     *     
     */
    public FinancialInstrument9 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument9 }
     *     
     */
    public EstimatedFundCashForecast6 setFinInstrmDtls(FinancialInstrument9 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the estmtdTtlNAV property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estmtdTtlNAV property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstmtdTtlNAV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     * 
     */
    public List<ActiveOrHistoricCurrencyAndAmount> getEstmtdTtlNAV() {
        if (estmtdTtlNAV == null) {
            estmtdTtlNAV = new ArrayList<ActiveOrHistoricCurrencyAndAmount>();
        }
        return this.estmtdTtlNAV;
    }

    /**
     * Gets the value of the prvsTtlNAV property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prvsTtlNAV property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvsTtlNAV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     * 
     */
    public List<ActiveOrHistoricCurrencyAndAmount> getPrvsTtlNAV() {
        if (prvsTtlNAV == null) {
            prvsTtlNAV = new ArrayList<ActiveOrHistoricCurrencyAndAmount>();
        }
        return this.prvsTtlNAV;
    }

    /**
     * Gets the value of the estmtdTtlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getEstmtdTtlUnitsNb() {
        return estmtdTtlUnitsNb;
    }

    /**
     * Sets the value of the estmtdTtlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public EstimatedFundCashForecast6 setEstmtdTtlUnitsNb(FinancialInstrumentQuantity1 value) {
        this.estmtdTtlUnitsNb = value;
        return this;
    }

    /**
     * Gets the value of the prvsTtlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getPrvsTtlUnitsNb() {
        return prvsTtlUnitsNb;
    }

    /**
     * Sets the value of the prvsTtlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public EstimatedFundCashForecast6 setPrvsTtlUnitsNb(FinancialInstrumentQuantity1 value) {
        this.prvsTtlUnitsNb = value;
        return this;
    }

    /**
     * Gets the value of the estmtdTtlNAVChngRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstmtdTtlNAVChngRate() {
        return estmtdTtlNAVChngRate;
    }

    /**
     * Sets the value of the estmtdTtlNAVChngRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public EstimatedFundCashForecast6 setEstmtdTtlNAVChngRate(BigDecimal value) {
        this.estmtdTtlNAVChngRate = value;
        return this;
    }

    /**
     * Gets the value of the invstmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invstmtCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstmtCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInvstmtCcy() {
        if (invstmtCcy == null) {
            invstmtCcy = new ArrayList<String>();
        }
        return this.invstmtCcy;
    }

    /**
     * Gets the value of the ccySts property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDesignation1 }
     *     
     */
    public CurrencyDesignation1 getCcySts() {
        return ccySts;
    }

    /**
     * Sets the value of the ccySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDesignation1 }
     *     
     */
    public EstimatedFundCashForecast6 setCcySts(CurrencyDesignation1 value) {
        this.ccySts = value;
        return this;
    }

    /**
     * Gets the value of the xcptnlNetCshFlowInd property.
     * 
     */
    public boolean isXcptnlNetCshFlowInd() {
        return xcptnlNetCshFlowInd;
    }

    /**
     * Sets the value of the xcptnlNetCshFlowInd property.
     * 
     */
    public EstimatedFundCashForecast6 setXcptnlNetCshFlowInd(boolean value) {
        this.xcptnlNetCshFlowInd = value;
        return this;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice19 }
     *     
     */
    public UnitPrice19 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice19 }
     *     
     */
    public EstimatedFundCashForecast6 setPric(UnitPrice19 value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the fxRate property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms19 }
     *     
     */
    public ForeignExchangeTerms19 getFXRate() {
        return fxRate;
    }

    /**
     * Sets the value of the fxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms19 }
     *     
     */
    public EstimatedFundCashForecast6 setFXRate(ForeignExchangeTerms19 value) {
        this.fxRate = value;
        return this;
    }

    /**
     * Gets the value of the estmtdPctgOfShrClssTtlNAV property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstmtdPctgOfShrClssTtlNAV() {
        return estmtdPctgOfShrClssTtlNAV;
    }

    /**
     * Sets the value of the estmtdPctgOfShrClssTtlNAV property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public EstimatedFundCashForecast6 setEstmtdPctgOfShrClssTtlNAV(BigDecimal value) {
        this.estmtdPctgOfShrClssTtlNAV = value;
        return this;
    }

    /**
     * Gets the value of the estmtdCshInFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estmtdCshInFcstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstmtdCshInFcstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashInForecast6 }
     * 
     * 
     */
    public List<CashInForecast6> getEstmtdCshInFcstDtls() {
        if (estmtdCshInFcstDtls == null) {
            estmtdCshInFcstDtls = new ArrayList<CashInForecast6>();
        }
        return this.estmtdCshInFcstDtls;
    }

    /**
     * Gets the value of the estmtdCshOutFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estmtdCshOutFcstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstmtdCshOutFcstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOutForecast6 }
     * 
     * 
     */
    public List<CashOutForecast6> getEstmtdCshOutFcstDtls() {
        if (estmtdCshOutFcstDtls == null) {
            estmtdCshOutFcstDtls = new ArrayList<CashOutForecast6>();
        }
        return this.estmtdCshOutFcstDtls;
    }

    /**
     * Gets the value of the estmtdNetCshFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estmtdNetCshFcstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstmtdNetCshFcstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetCashForecast4 }
     * 
     * 
     */
    public List<NetCashForecast4> getEstmtdNetCshFcstDtls() {
        if (estmtdNetCshFcstDtls == null) {
            estmtdNetCshFcstDtls = new ArrayList<NetCashForecast4>();
        }
        return this.estmtdNetCshFcstDtls;
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
     * Adds a new item to the estmtdTtlNAV list.
     * @see #getEstmtdTtlNAV()
     * 
     */
    public EstimatedFundCashForecast6 addEstmtdTtlNAV(ActiveOrHistoricCurrencyAndAmount estmtdTtlNAV) {
        getEstmtdTtlNAV().add(estmtdTtlNAV);
        return this;
    }

    /**
     * Adds a new item to the prvsTtlNAV list.
     * @see #getPrvsTtlNAV()
     * 
     */
    public EstimatedFundCashForecast6 addPrvsTtlNAV(ActiveOrHistoricCurrencyAndAmount prvsTtlNAV) {
        getPrvsTtlNAV().add(prvsTtlNAV);
        return this;
    }

    /**
     * Adds a new item to the invstmtCcy list.
     * @see #getInvstmtCcy()
     * 
     */
    public EstimatedFundCashForecast6 addInvstmtCcy(String invstmtCcy) {
        getInvstmtCcy().add(invstmtCcy);
        return this;
    }

    /**
     * Adds a new item to the estmtdCshInFcstDtls list.
     * @see #getEstmtdCshInFcstDtls()
     * 
     */
    public EstimatedFundCashForecast6 addEstmtdCshInFcstDtls(CashInForecast6 estmtdCshInFcstDtls) {
        getEstmtdCshInFcstDtls().add(estmtdCshInFcstDtls);
        return this;
    }

    /**
     * Adds a new item to the estmtdCshOutFcstDtls list.
     * @see #getEstmtdCshOutFcstDtls()
     * 
     */
    public EstimatedFundCashForecast6 addEstmtdCshOutFcstDtls(CashOutForecast6 estmtdCshOutFcstDtls) {
        getEstmtdCshOutFcstDtls().add(estmtdCshOutFcstDtls);
        return this;
    }

    /**
     * Adds a new item to the estmtdNetCshFcstDtls list.
     * @see #getEstmtdNetCshFcstDtls()
     * 
     */
    public EstimatedFundCashForecast6 addEstmtdNetCshFcstDtls(NetCashForecast4 estmtdNetCshFcstDtls) {
        getEstmtdNetCshFcstDtls().add(estmtdNetCshFcstDtls);
        return this;
    }

}
