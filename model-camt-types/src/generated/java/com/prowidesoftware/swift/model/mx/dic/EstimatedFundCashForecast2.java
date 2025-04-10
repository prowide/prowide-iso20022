
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
@XmlType(name = "EstimatedFundCashForecast2", propOrder = {
    "tradDtTm",
    "prvsTradDtTm",
    "finInstrmDtls",
    "estmtdTtlNAV",
    "prvsEstmtdTtlNAV",
    "estmtdTtlUnitsNb",
    "prvsEstmtdTtlUnitsNb",
    "estmtdTtlNAVChngRate",
    "invstmtCcy",
    "xcptnlNetCshFlowInd",
    "srtgCritDtls",
    "estmtdNetCshFcstDtls"
})
public class EstimatedFundCashForecast2 {

    @XmlElement(name = "TradDtTm", required = true)
    protected DateAndDateTimeChoice tradDtTm;
    @XmlElement(name = "PrvsTradDtTm", required = true)
    protected DateAndDateTimeChoice prvsTradDtTm;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument5 finInstrmDtls;
    @XmlElement(name = "EstmtdTtlNAV")
    protected ActiveOrHistoricCurrencyAndAmount estmtdTtlNAV;
    @XmlElement(name = "PrvsEstmtdTtlNAV")
    protected ActiveOrHistoricCurrencyAndAmount prvsEstmtdTtlNAV;
    @XmlElement(name = "EstmtdTtlUnitsNb")
    protected FinancialInstrumentQuantity1 estmtdTtlUnitsNb;
    @XmlElement(name = "PrvsEstmtdTtlUnitsNb")
    protected FinancialInstrumentQuantity1 prvsEstmtdTtlUnitsNb;
    @XmlElement(name = "EstmtdTtlNAVChngRate")
    protected BigDecimal estmtdTtlNAVChngRate;
    @XmlElement(name = "InvstmtCcy")
    protected List<String> invstmtCcy;
    @XmlElement(name = "XcptnlNetCshFlowInd")
    protected boolean xcptnlNetCshFlowInd;
    @XmlElement(name = "SrtgCritDtls", required = true)
    protected List<CashSortingCriterion1> srtgCritDtls;
    @XmlElement(name = "EstmtdNetCshFcstDtls")
    protected List<NetCashForecast1> estmtdNetCshFcstDtls;

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
    public EstimatedFundCashForecast2 setTradDtTm(DateAndDateTimeChoice value) {
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
    public EstimatedFundCashForecast2 setPrvsTradDtTm(DateAndDateTimeChoice value) {
        this.prvsTradDtTm = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument5 }
     *     
     */
    public FinancialInstrument5 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument5 }
     *     
     */
    public EstimatedFundCashForecast2 setFinInstrmDtls(FinancialInstrument5 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the estmtdTtlNAV property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getEstmtdTtlNAV() {
        return estmtdTtlNAV;
    }

    /**
     * Sets the value of the estmtdTtlNAV property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public EstimatedFundCashForecast2 setEstmtdTtlNAV(ActiveOrHistoricCurrencyAndAmount value) {
        this.estmtdTtlNAV = value;
        return this;
    }

    /**
     * Gets the value of the prvsEstmtdTtlNAV property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getPrvsEstmtdTtlNAV() {
        return prvsEstmtdTtlNAV;
    }

    /**
     * Sets the value of the prvsEstmtdTtlNAV property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public EstimatedFundCashForecast2 setPrvsEstmtdTtlNAV(ActiveOrHistoricCurrencyAndAmount value) {
        this.prvsEstmtdTtlNAV = value;
        return this;
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
    public EstimatedFundCashForecast2 setEstmtdTtlUnitsNb(FinancialInstrumentQuantity1 value) {
        this.estmtdTtlUnitsNb = value;
        return this;
    }

    /**
     * Gets the value of the prvsEstmtdTtlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getPrvsEstmtdTtlUnitsNb() {
        return prvsEstmtdTtlUnitsNb;
    }

    /**
     * Sets the value of the prvsEstmtdTtlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public EstimatedFundCashForecast2 setPrvsEstmtdTtlUnitsNb(FinancialInstrumentQuantity1 value) {
        this.prvsEstmtdTtlUnitsNb = value;
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
    public EstimatedFundCashForecast2 setEstmtdTtlNAVChngRate(BigDecimal value) {
        this.estmtdTtlNAVChngRate = value;
        return this;
    }

    /**
     * Gets the value of the invstmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstmtCcy property.
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
     * @return
     *     The value of the invstmtCcy property.
     */
    public List<String> getInvstmtCcy() {
        if (invstmtCcy == null) {
            invstmtCcy = new ArrayList<>();
        }
        return this.invstmtCcy;
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
    public EstimatedFundCashForecast2 setXcptnlNetCshFlowInd(boolean value) {
        this.xcptnlNetCshFlowInd = value;
        return this;
    }

    /**
     * Gets the value of the srtgCritDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the srtgCritDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrtgCritDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashSortingCriterion1 }
     * 
     * 
     * @return
     *     The value of the srtgCritDtls property.
     */
    public List<CashSortingCriterion1> getSrtgCritDtls() {
        if (srtgCritDtls == null) {
            srtgCritDtls = new ArrayList<>();
        }
        return this.srtgCritDtls;
    }

    /**
     * Gets the value of the estmtdNetCshFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the estmtdNetCshFcstDtls property.
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
     * {@link NetCashForecast1 }
     * 
     * 
     * @return
     *     The value of the estmtdNetCshFcstDtls property.
     */
    public List<NetCashForecast1> getEstmtdNetCshFcstDtls() {
        if (estmtdNetCshFcstDtls == null) {
            estmtdNetCshFcstDtls = new ArrayList<>();
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
     * Adds a new item to the invstmtCcy list.
     * @see #getInvstmtCcy()
     * 
     */
    public EstimatedFundCashForecast2 addInvstmtCcy(String invstmtCcy) {
        getInvstmtCcy().add(invstmtCcy);
        return this;
    }

    /**
     * Adds a new item to the srtgCritDtls list.
     * @see #getSrtgCritDtls()
     * 
     */
    public EstimatedFundCashForecast2 addSrtgCritDtls(CashSortingCriterion1 srtgCritDtls) {
        getSrtgCritDtls().add(srtgCritDtls);
        return this;
    }

    /**
     * Adds a new item to the estmtdNetCshFcstDtls list.
     * @see #getEstmtdNetCshFcstDtls()
     * 
     */
    public EstimatedFundCashForecast2 addEstmtdNetCshFcstDtls(NetCashForecast1 estmtdNetCshFcstDtls) {
        getEstmtdNetCshFcstDtls().add(estmtdNetCshFcstDtls);
        return this;
    }

}
