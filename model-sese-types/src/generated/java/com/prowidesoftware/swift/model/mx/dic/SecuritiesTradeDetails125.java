
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
 * Details of the securities trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeDetails125", propOrder = {
    "plcOfTrad",
    "plcOfClr",
    "tradDt",
    "opngSttlmDt",
    "dealPric",
    "nbOfDaysAcrd",
    "rptg",
    "tradTxCond",
    "invstrCpcty",
    "tradOrgtrRole",
    "ccyToBuyOrSell",
    "affirmSts",
    "mtchgSts",
    "sttlmInstrPrcgAddtlDtls",
    "fxAddtlDtls"
})
public class SecuritiesTradeDetails125 {

    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification2 plcOfTrad;
    @XmlElement(name = "PlcOfClr")
    protected PlaceOfClearingIdentification2 plcOfClr;
    @XmlElement(name = "TradDt")
    protected TradeDate9Choice tradDt;
    @XmlElement(name = "OpngSttlmDt", required = true)
    protected DateAndDateTime2Choice opngSttlmDt;
    @XmlElement(name = "DealPric")
    protected Price11 dealPric;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "Rptg")
    protected List<Reporting9Choice> rptg;
    @XmlElement(name = "TradTxCond")
    protected List<TradeTransactionCondition6Choice> tradTxCond;
    @XmlElement(name = "InvstrCpcty")
    protected InvestorCapacity5Choice invstrCpcty;
    @XmlElement(name = "TradOrgtrRole")
    protected TradeOriginator4Choice tradOrgtrRole;
    @XmlElement(name = "CcyToBuyOrSell")
    protected CurrencyToBuyOrSell1Choice ccyToBuyOrSell;
    @XmlElement(name = "AffirmSts")
    protected AffirmationStatus9Choice affirmSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus28Choice mtchgSts;
    @XmlElement(name = "SttlmInstrPrcgAddtlDtls")
    protected String sttlmInstrPrcgAddtlDtls;
    @XmlElement(name = "FxAddtlDtls")
    protected String fxAddtlDtls;

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification2 }
     *     
     */
    public PlaceOfTradeIdentification2 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification2 }
     *     
     */
    public SecuritiesTradeDetails125 setPlcOfTrad(PlaceOfTradeIdentification2 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the plcOfClr property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfClearingIdentification2 }
     *     
     */
    public PlaceOfClearingIdentification2 getPlcOfClr() {
        return plcOfClr;
    }

    /**
     * Sets the value of the plcOfClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfClearingIdentification2 }
     *     
     */
    public SecuritiesTradeDetails125 setPlcOfClr(PlaceOfClearingIdentification2 value) {
        this.plcOfClr = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate9Choice }
     *     
     */
    public TradeDate9Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate9Choice }
     *     
     */
    public SecuritiesTradeDetails125 setTradDt(TradeDate9Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the opngSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getOpngSttlmDt() {
        return opngSttlmDt;
    }

    /**
     * Sets the value of the opngSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public SecuritiesTradeDetails125 setOpngSttlmDt(DateAndDateTime2Choice value) {
        this.opngSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price11 }
     *     
     */
    public Price11 getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price11 }
     *     
     */
    public SecuritiesTradeDetails125 setDealPric(Price11 value) {
        this.dealPric = value;
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
    public SecuritiesTradeDetails125 setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
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
     * {@link Reporting9Choice }
     * 
     * 
     */
    public List<Reporting9Choice> getRptg() {
        if (rptg == null) {
            rptg = new ArrayList<Reporting9Choice>();
        }
        return this.rptg;
    }

    /**
     * Gets the value of the tradTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradTxCond property.
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
     * {@link TradeTransactionCondition6Choice }
     * 
     * 
     */
    public List<TradeTransactionCondition6Choice> getTradTxCond() {
        if (tradTxCond == null) {
            tradTxCond = new ArrayList<TradeTransactionCondition6Choice>();
        }
        return this.tradTxCond;
    }

    /**
     * Gets the value of the invstrCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorCapacity5Choice }
     *     
     */
    public InvestorCapacity5Choice getInvstrCpcty() {
        return invstrCpcty;
    }

    /**
     * Sets the value of the invstrCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorCapacity5Choice }
     *     
     */
    public SecuritiesTradeDetails125 setInvstrCpcty(InvestorCapacity5Choice value) {
        this.invstrCpcty = value;
        return this;
    }

    /**
     * Gets the value of the tradOrgtrRole property.
     * 
     * @return
     *     possible object is
     *     {@link TradeOriginator4Choice }
     *     
     */
    public TradeOriginator4Choice getTradOrgtrRole() {
        return tradOrgtrRole;
    }

    /**
     * Sets the value of the tradOrgtrRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeOriginator4Choice }
     *     
     */
    public SecuritiesTradeDetails125 setTradOrgtrRole(TradeOriginator4Choice value) {
        this.tradOrgtrRole = value;
        return this;
    }

    /**
     * Gets the value of the ccyToBuyOrSell property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyToBuyOrSell1Choice }
     *     
     */
    public CurrencyToBuyOrSell1Choice getCcyToBuyOrSell() {
        return ccyToBuyOrSell;
    }

    /**
     * Sets the value of the ccyToBuyOrSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyToBuyOrSell1Choice }
     *     
     */
    public SecuritiesTradeDetails125 setCcyToBuyOrSell(CurrencyToBuyOrSell1Choice value) {
        this.ccyToBuyOrSell = value;
        return this;
    }

    /**
     * Gets the value of the affirmSts property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationStatus9Choice }
     *     
     */
    public AffirmationStatus9Choice getAffirmSts() {
        return affirmSts;
    }

    /**
     * Sets the value of the affirmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationStatus9Choice }
     *     
     */
    public SecuritiesTradeDetails125 setAffirmSts(AffirmationStatus9Choice value) {
        this.affirmSts = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus28Choice }
     *     
     */
    public MatchingStatus28Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus28Choice }
     *     
     */
    public SecuritiesTradeDetails125 setMtchgSts(MatchingStatus28Choice value) {
        this.mtchgSts = value;
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
    public SecuritiesTradeDetails125 setSttlmInstrPrcgAddtlDtls(String value) {
        this.sttlmInstrPrcgAddtlDtls = value;
        return this;
    }

    /**
     * Gets the value of the fxAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxAddtlDtls() {
        return fxAddtlDtls;
    }

    /**
     * Sets the value of the fxAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesTradeDetails125 setFxAddtlDtls(String value) {
        this.fxAddtlDtls = value;
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
     * Adds a new item to the rptg list.
     * @see #getRptg()
     * 
     */
    public SecuritiesTradeDetails125 addRptg(Reporting9Choice rptg) {
        getRptg().add(rptg);
        return this;
    }

    /**
     * Adds a new item to the tradTxCond list.
     * @see #getTradTxCond()
     * 
     */
    public SecuritiesTradeDetails125 addTradTxCond(TradeTransactionCondition6Choice tradTxCond) {
        getTradTxCond().add(tradTxCond);
        return this;
    }

}
