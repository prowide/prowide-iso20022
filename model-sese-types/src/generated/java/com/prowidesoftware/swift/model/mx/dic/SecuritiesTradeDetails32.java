
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
@XmlType(name = "SecuritiesTradeDetails32", propOrder = {
    "tradId",
    "collTxId",
    "plcOfTrad",
    "plcOfClr",
    "tradDt",
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
public class SecuritiesTradeDetails32 {

    @XmlElement(name = "TradId")
    protected List<String> tradId;
    @XmlElement(name = "CollTxId")
    protected List<String> collTxId;
    @XmlElement(name = "PlcOfTrad")
    protected MarketIdentification78 plcOfTrad;
    @XmlElement(name = "PlcOfClr")
    protected String plcOfClr;
    @XmlElement(name = "TradDt")
    protected TradeDate1Choice tradDt;
    @XmlElement(name = "LateDlvryDt")
    protected DateAndDateTimeChoice lateDlvryDt;
    @XmlElement(name = "DealPric")
    protected Price2 dealPric;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "OpngClsg")
    protected OpeningClosing1Choice opngClsg;
    @XmlElement(name = "Rptg")
    protected List<Reporting2Choice> rptg;
    @XmlElement(name = "TradTxCond")
    protected List<TradeTransactionCondition1Choice> tradTxCond;
    @XmlElement(name = "InvstrCpcty")
    protected InvestorCapacity1Choice invstrCpcty;
    @XmlElement(name = "TradOrgtrRole")
    protected TradeOriginator1Choice tradOrgtrRole;
    @XmlElement(name = "TpOfPric")
    protected TypeOfPrice3Choice tpOfPric;
    @XmlElement(name = "CcyToBuyOrSell")
    protected CurrencyToBuyOrSell1Choice ccyToBuyOrSell;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus1Choice mtchgSts;
    @XmlElement(name = "AffirmSts")
    protected AffirmationStatus1Choice affirmSts;
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
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradId property.
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
     */
    public List<String> getTradId() {
        if (tradId == null) {
            tradId = new ArrayList<String>();
        }
        return this.tradId;
    }

    /**
     * Gets the value of the collTxId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collTxId property.
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
     */
    public List<String> getCollTxId() {
        if (collTxId == null) {
            collTxId = new ArrayList<String>();
        }
        return this.collTxId;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification78 }
     *     
     */
    public MarketIdentification78 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification78 }
     *     
     */
    public SecuritiesTradeDetails32 setPlcOfTrad(MarketIdentification78 value) {
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
    public SecuritiesTradeDetails32 setPlcOfClr(String value) {
        this.plcOfClr = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate1Choice }
     *     
     */
    public TradeDate1Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate1Choice }
     *     
     */
    public SecuritiesTradeDetails32 setTradDt(TradeDate1Choice value) {
        this.tradDt = value;
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
    public SecuritiesTradeDetails32 setLateDlvryDt(DateAndDateTimeChoice value) {
        this.lateDlvryDt = value;
        return this;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price2 }
     *     
     */
    public Price2 getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price2 }
     *     
     */
    public SecuritiesTradeDetails32 setDealPric(Price2 value) {
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
    public SecuritiesTradeDetails32 setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the opngClsg property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningClosing1Choice }
     *     
     */
    public OpeningClosing1Choice getOpngClsg() {
        return opngClsg;
    }

    /**
     * Sets the value of the opngClsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningClosing1Choice }
     *     
     */
    public SecuritiesTradeDetails32 setOpngClsg(OpeningClosing1Choice value) {
        this.opngClsg = value;
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
     * {@link Reporting2Choice }
     * 
     * 
     */
    public List<Reporting2Choice> getRptg() {
        if (rptg == null) {
            rptg = new ArrayList<Reporting2Choice>();
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
     * {@link TradeTransactionCondition1Choice }
     * 
     * 
     */
    public List<TradeTransactionCondition1Choice> getTradTxCond() {
        if (tradTxCond == null) {
            tradTxCond = new ArrayList<TradeTransactionCondition1Choice>();
        }
        return this.tradTxCond;
    }

    /**
     * Gets the value of the invstrCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorCapacity1Choice }
     *     
     */
    public InvestorCapacity1Choice getInvstrCpcty() {
        return invstrCpcty;
    }

    /**
     * Sets the value of the invstrCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorCapacity1Choice }
     *     
     */
    public SecuritiesTradeDetails32 setInvstrCpcty(InvestorCapacity1Choice value) {
        this.invstrCpcty = value;
        return this;
    }

    /**
     * Gets the value of the tradOrgtrRole property.
     * 
     * @return
     *     possible object is
     *     {@link TradeOriginator1Choice }
     *     
     */
    public TradeOriginator1Choice getTradOrgtrRole() {
        return tradOrgtrRole;
    }

    /**
     * Sets the value of the tradOrgtrRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeOriginator1Choice }
     *     
     */
    public SecuritiesTradeDetails32 setTradOrgtrRole(TradeOriginator1Choice value) {
        this.tradOrgtrRole = value;
        return this;
    }

    /**
     * Gets the value of the tpOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice3Choice }
     *     
     */
    public TypeOfPrice3Choice getTpOfPric() {
        return tpOfPric;
    }

    /**
     * Sets the value of the tpOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice3Choice }
     *     
     */
    public SecuritiesTradeDetails32 setTpOfPric(TypeOfPrice3Choice value) {
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
    public SecuritiesTradeDetails32 setCcyToBuyOrSell(CurrencyToBuyOrSell1Choice value) {
        this.ccyToBuyOrSell = value;
        return this;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus1Choice }
     *     
     */
    public MatchingStatus1Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus1Choice }
     *     
     */
    public SecuritiesTradeDetails32 setMtchgSts(MatchingStatus1Choice value) {
        this.mtchgSts = value;
        return this;
    }

    /**
     * Gets the value of the affirmSts property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationStatus1Choice }
     *     
     */
    public AffirmationStatus1Choice getAffirmSts() {
        return affirmSts;
    }

    /**
     * Sets the value of the affirmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationStatus1Choice }
     *     
     */
    public SecuritiesTradeDetails32 setAffirmSts(AffirmationStatus1Choice value) {
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
    public SecuritiesTradeDetails32 setFxAddtlDtls(String value) {
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
    public SecuritiesTradeDetails32 setSttlmInstrPrcgAddtlDtls(String value) {
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
    public SecuritiesTradeDetails32 addTradId(String tradId) {
        getTradId().add(tradId);
        return this;
    }

    /**
     * Adds a new item to the collTxId list.
     * @see #getCollTxId()
     * 
     */
    public SecuritiesTradeDetails32 addCollTxId(String collTxId) {
        getCollTxId().add(collTxId);
        return this;
    }

    /**
     * Adds a new item to the rptg list.
     * @see #getRptg()
     * 
     */
    public SecuritiesTradeDetails32 addRptg(Reporting2Choice rptg) {
        getRptg().add(rptg);
        return this;
    }

    /**
     * Adds a new item to the tradTxCond list.
     * @see #getTradTxCond()
     * 
     */
    public SecuritiesTradeDetails32 addTradTxCond(TradeTransactionCondition1Choice tradTxCond) {
        getTradTxCond().add(tradTxCond);
        return this;
    }

}
