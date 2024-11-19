
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
 * Details of the securities trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeDetails47", propOrder = {
    "tradId",
    "collTxId",
    "plcOfTrad",
    "plcOfClr",
    "tradDt",
    "sttlmDt",
    "lateDlvryDt",
    "dealPric",
    "nbOfDaysAcrd",
    "opngClsg",
    "rptg",
    "tradTxCond",
    "invstrCpcty",
    "tradOrgtrRole",
    "tpOfPric",
    "ccyToBuyOrSell",
    "mtchgSts",
    "affirmSts",
    "fxAddtlDtls",
    "sttlmInstrPrcgAddtlDtls"
})
public class SecuritiesTradeDetails47 {

    @XmlElement(name = "TradId")
    protected List<String> tradId;
    @XmlElement(name = "CollTxId")
    protected List<String> collTxId;
    @XmlElement(name = "PlcOfTrad")
    protected MarketIdentification82 plcOfTrad;
    @XmlElement(name = "PlcOfClr")
    protected String plcOfClr;
    @XmlElement(name = "TradDt")
    protected TradeDate2Choice tradDt;
    @XmlElement(name = "SttlmDt")
    protected SettlementDate4Choice sttlmDt;
    @XmlElement(name = "LateDlvryDt")
    protected DateAndDateTimeChoice lateDlvryDt;
    @XmlElement(name = "DealPric")
    protected Price3 dealPric;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "OpngClsg")
    protected OpeningClosing2Choice opngClsg;
    @XmlElement(name = "Rptg")
    protected List<Reporting3Choice> rptg;
    @XmlElement(name = "TradTxCond")
    protected List<TradeTransactionCondition2Choice> tradTxCond;
    @XmlElement(name = "InvstrCpcty")
    protected InvestorCapacity2Choice invstrCpcty;
    @XmlElement(name = "TradOrgtrRole")
    protected TradeOriginator2Choice tradOrgtrRole;
    @XmlElement(name = "TpOfPric")
    protected TypeOfPrice5Choice tpOfPric;
    @XmlElement(name = "CcyToBuyOrSell")
    protected CurrencyToBuyOrSell1Choice ccyToBuyOrSell;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus5Choice mtchgSts;
    @XmlElement(name = "AffirmSts")
    protected AffirmationStatus2Choice affirmSts;
    @XmlElement(name = "FxAddtlDtls")
    protected String fxAddtlDtls;
    @XmlElement(name = "SttlmInstrPrcgAddtlDtls")
    protected String sttlmInstrPrcgAddtlDtls;

    /**
     * Gets the value of the tradId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the tradId property.
     */
    public List<String> getTradId() {
        if (tradId == null) {
            tradId = new ArrayList<>();
        }
        return this.tradId;
    }

    /**
     * Gets the value of the collTxId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the collTxId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollTxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the collTxId property.
     */
    public List<String> getCollTxId() {
        if (collTxId == null) {
            collTxId = new ArrayList<>();
        }
        return this.collTxId;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification82 }
     *     
     */
    public MarketIdentification82 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification82 }
     *     
     */
    public SecuritiesTradeDetails47 setPlcOfTrad(MarketIdentification82 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the plcOfClr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfClr() {
        return plcOfClr;
    }

    /**
     * Sets the value of the plcOfClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesTradeDetails47 setPlcOfClr(String value) {
        this.plcOfClr = value;
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
    public SecuritiesTradeDetails47 setTradDt(TradeDate2Choice value) {
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
    public SecuritiesTradeDetails47 setSttlmDt(SettlementDate4Choice value) {
        this.sttlmDt = value;
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
    public SecuritiesTradeDetails47 setLateDlvryDt(DateAndDateTimeChoice value) {
        this.lateDlvryDt = value;
        return this;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price3 }
     *     
     */
    public Price3 getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price3 }
     *     
     */
    public SecuritiesTradeDetails47 setDealPric(Price3 value) {
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
    public SecuritiesTradeDetails47 setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the opngClsg property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningClosing2Choice }
     *     
     */
    public OpeningClosing2Choice getOpngClsg() {
        return opngClsg;
    }

    /**
     * Sets the value of the opngClsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningClosing2Choice }
     *     
     */
    public SecuritiesTradeDetails47 setOpngClsg(OpeningClosing2Choice value) {
        this.opngClsg = value;
        return this;
    }

    /**
     * Gets the value of the rptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptg property.
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
     * {@link Reporting3Choice }
     * 
     * 
     * @return
     *     The value of the rptg property.
     */
    public List<Reporting3Choice> getRptg() {
        if (rptg == null) {
            rptg = new ArrayList<>();
        }
        return this.rptg;
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
     * {@link TradeTransactionCondition2Choice }
     * 
     * 
     * @return
     *     The value of the tradTxCond property.
     */
    public List<TradeTransactionCondition2Choice> getTradTxCond() {
        if (tradTxCond == null) {
            tradTxCond = new ArrayList<>();
        }
        return this.tradTxCond;
    }

    /**
     * Gets the value of the invstrCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorCapacity2Choice }
     *     
     */
    public InvestorCapacity2Choice getInvstrCpcty() {
        return invstrCpcty;
    }

    /**
     * Sets the value of the invstrCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorCapacity2Choice }
     *     
     */
    public SecuritiesTradeDetails47 setInvstrCpcty(InvestorCapacity2Choice value) {
        this.invstrCpcty = value;
        return this;
    }

    /**
     * Gets the value of the tradOrgtrRole property.
     * 
     * @return
     *     possible object is
     *     {@link TradeOriginator2Choice }
     *     
     */
    public TradeOriginator2Choice getTradOrgtrRole() {
        return tradOrgtrRole;
    }

    /**
     * Sets the value of the tradOrgtrRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeOriginator2Choice }
     *     
     */
    public SecuritiesTradeDetails47 setTradOrgtrRole(TradeOriginator2Choice value) {
        this.tradOrgtrRole = value;
        return this;
    }

    /**
     * Gets the value of the tpOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice5Choice }
     *     
     */
    public TypeOfPrice5Choice getTpOfPric() {
        return tpOfPric;
    }

    /**
     * Sets the value of the tpOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice5Choice }
     *     
     */
    public SecuritiesTradeDetails47 setTpOfPric(TypeOfPrice5Choice value) {
        this.tpOfPric = value;
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
    public SecuritiesTradeDetails47 setCcyToBuyOrSell(CurrencyToBuyOrSell1Choice value) {
        this.ccyToBuyOrSell = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus5Choice }
     *     
     */
    public MatchingStatus5Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus5Choice }
     *     
     */
    public SecuritiesTradeDetails47 setMtchgSts(MatchingStatus5Choice value) {
        this.mtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the affirmSts property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationStatus2Choice }
     *     
     */
    public AffirmationStatus2Choice getAffirmSts() {
        return affirmSts;
    }

    /**
     * Sets the value of the affirmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationStatus2Choice }
     *     
     */
    public SecuritiesTradeDetails47 setAffirmSts(AffirmationStatus2Choice value) {
        this.affirmSts = value;
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
    public SecuritiesTradeDetails47 setFxAddtlDtls(String value) {
        this.fxAddtlDtls = value;
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
    public SecuritiesTradeDetails47 setSttlmInstrPrcgAddtlDtls(String value) {
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

    /**
     * Adds a new item to the tradId list.
     * @see #getTradId()
     * 
     */
    public SecuritiesTradeDetails47 addTradId(String tradId) {
        getTradId().add(tradId);
        return this;
    }

    /**
     * Adds a new item to the collTxId list.
     * @see #getCollTxId()
     * 
     */
    public SecuritiesTradeDetails47 addCollTxId(String collTxId) {
        getCollTxId().add(collTxId);
        return this;
    }

    /**
     * Adds a new item to the rptg list.
     * @see #getRptg()
     * 
     */
    public SecuritiesTradeDetails47 addRptg(Reporting3Choice rptg) {
        getRptg().add(rptg);
        return this;
    }

    /**
     * Adds a new item to the tradTxCond list.
     * @see #getTradTxCond()
     * 
     */
    public SecuritiesTradeDetails47 addTradTxCond(TradeTransactionCondition2Choice tradTxCond) {
        getTradTxCond().add(tradTxCond);
        return this;
    }

}
