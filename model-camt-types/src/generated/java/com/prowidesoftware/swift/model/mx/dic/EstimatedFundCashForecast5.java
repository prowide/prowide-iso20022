
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Cash movements from or to a fund as a result of investment funds transactions, eg, subscriptions or redemptions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedFundCashForecast5", propOrder = {
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
    "brkdwnByPty",
    "brkdwnByCtry",
    "brkdwnByCcy",
    "brkdwnByUsrDfndParam",
    "estmtdNetCshFcstDtls"
})
public class EstimatedFundCashForecast5 {

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
    @XmlElement(name = "BrkdwnByPty")
    protected List<BreakdownByParty3> brkdwnByPty;
    @XmlElement(name = "BrkdwnByCtry")
    protected List<BreakdownByCountry2> brkdwnByCtry;
    @XmlElement(name = "BrkdwnByCcy")
    protected List<BreakdownByCurrency2> brkdwnByCcy;
    @XmlElement(name = "BrkdwnByUsrDfndParam")
    protected List<BreakdownByUserDefinedParameter3> brkdwnByUsrDfndParam;
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
    public EstimatedFundCashForecast5 setId(String value) {
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
    public EstimatedFundCashForecast5 setTradDtTm(DateAndDateTimeChoice value) {
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
    public EstimatedFundCashForecast5 setPrvsTradDtTm(DateAndDateTimeChoice value) {
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
    public EstimatedFundCashForecast5 setFinInstrmDtls(FinancialInstrument9 value) {
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
    public EstimatedFundCashForecast5 setEstmtdTtlUnitsNb(FinancialInstrumentQuantity1 value) {
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
    public EstimatedFundCashForecast5 setPrvsTtlUnitsNb(FinancialInstrumentQuantity1 value) {
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
    public EstimatedFundCashForecast5 setEstmtdTtlNAVChngRate(BigDecimal value) {
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
    public EstimatedFundCashForecast5 setCcySts(CurrencyDesignation1 value) {
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
    public EstimatedFundCashForecast5 setXcptnlNetCshFlowInd(boolean value) {
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
    public EstimatedFundCashForecast5 setPric(UnitPrice19 value) {
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
    public EstimatedFundCashForecast5 setFXRate(ForeignExchangeTerms19 value) {
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
    public EstimatedFundCashForecast5 setEstmtdPctgOfShrClssTtlNAV(BigDecimal value) {
        this.estmtdPctgOfShrClssTtlNAV = value;
        return this;
    }

    /**
     * Gets the value of the brkdwnByPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brkdwnByPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrkdwnByPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BreakdownByParty3 }
     * 
     * 
     */
    public List<BreakdownByParty3> getBrkdwnByPty() {
        if (brkdwnByPty == null) {
            brkdwnByPty = new ArrayList<BreakdownByParty3>();
        }
        return this.brkdwnByPty;
    }

    /**
     * Gets the value of the brkdwnByCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brkdwnByCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrkdwnByCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BreakdownByCountry2 }
     * 
     * 
     */
    public List<BreakdownByCountry2> getBrkdwnByCtry() {
        if (brkdwnByCtry == null) {
            brkdwnByCtry = new ArrayList<BreakdownByCountry2>();
        }
        return this.brkdwnByCtry;
    }

    /**
     * Gets the value of the brkdwnByCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brkdwnByCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrkdwnByCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BreakdownByCurrency2 }
     * 
     * 
     */
    public List<BreakdownByCurrency2> getBrkdwnByCcy() {
        if (brkdwnByCcy == null) {
            brkdwnByCcy = new ArrayList<BreakdownByCurrency2>();
        }
        return this.brkdwnByCcy;
    }

    /**
     * Gets the value of the brkdwnByUsrDfndParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brkdwnByUsrDfndParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrkdwnByUsrDfndParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BreakdownByUserDefinedParameter3 }
     * 
     * 
     */
    public List<BreakdownByUserDefinedParameter3> getBrkdwnByUsrDfndParam() {
        if (brkdwnByUsrDfndParam == null) {
            brkdwnByUsrDfndParam = new ArrayList<BreakdownByUserDefinedParameter3>();
        }
        return this.brkdwnByUsrDfndParam;
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
    public EstimatedFundCashForecast5 addEstmtdTtlNAV(ActiveOrHistoricCurrencyAndAmount estmtdTtlNAV) {
        getEstmtdTtlNAV().add(estmtdTtlNAV);
        return this;
    }

    /**
     * Adds a new item to the prvsTtlNAV list.
     * @see #getPrvsTtlNAV()
     * 
     */
    public EstimatedFundCashForecast5 addPrvsTtlNAV(ActiveOrHistoricCurrencyAndAmount prvsTtlNAV) {
        getPrvsTtlNAV().add(prvsTtlNAV);
        return this;
    }

    /**
     * Adds a new item to the invstmtCcy list.
     * @see #getInvstmtCcy()
     * 
     */
    public EstimatedFundCashForecast5 addInvstmtCcy(String invstmtCcy) {
        getInvstmtCcy().add(invstmtCcy);
        return this;
    }

    /**
     * Adds a new item to the brkdwnByPty list.
     * @see #getBrkdwnByPty()
     * 
     */
    public EstimatedFundCashForecast5 addBrkdwnByPty(BreakdownByParty3 brkdwnByPty) {
        getBrkdwnByPty().add(brkdwnByPty);
        return this;
    }

    /**
     * Adds a new item to the brkdwnByCtry list.
     * @see #getBrkdwnByCtry()
     * 
     */
    public EstimatedFundCashForecast5 addBrkdwnByCtry(BreakdownByCountry2 brkdwnByCtry) {
        getBrkdwnByCtry().add(brkdwnByCtry);
        return this;
    }

    /**
     * Adds a new item to the brkdwnByCcy list.
     * @see #getBrkdwnByCcy()
     * 
     */
    public EstimatedFundCashForecast5 addBrkdwnByCcy(BreakdownByCurrency2 brkdwnByCcy) {
        getBrkdwnByCcy().add(brkdwnByCcy);
        return this;
    }

    /**
     * Adds a new item to the brkdwnByUsrDfndParam list.
     * @see #getBrkdwnByUsrDfndParam()
     * 
     */
    public EstimatedFundCashForecast5 addBrkdwnByUsrDfndParam(BreakdownByUserDefinedParameter3 brkdwnByUsrDfndParam) {
        getBrkdwnByUsrDfndParam().add(brkdwnByUsrDfndParam);
        return this;
    }

    /**
     * Adds a new item to the estmtdNetCshFcstDtls list.
     * @see #getEstmtdNetCshFcstDtls()
     * 
     */
    public EstimatedFundCashForecast5 addEstmtdNetCshFcstDtls(NetCashForecast4 estmtdNetCshFcstDtls) {
        getEstmtdNetCshFcstDtls().add(estmtdNetCshFcstDtls);
        return this;
    }

}
