
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
@XmlType(name = "SecuritiesTradeDetails62", propOrder = {
    "tradId",
    "collTxId",
    "plcOfTrad",
    "plcOfClr",
    "tradDt",
    "sttlmDt",
    "fctvSttlmDt",
    "dealPric",
    "nbOfDaysAcrd",
    "opngClsg",
    "rptg",
    "tradTxCond",
    "invstrCpcty",
    "tradOrgtrRole",
    "tpOfPric",
    "fxAddtlDtls",
    "sttlmInstrPrcgAddtlDtls"
})
public class SecuritiesTradeDetails62 {

    @XmlElement(name = "TradId")
    protected List<String> tradId;
    @XmlElement(name = "CollTxId")
    protected List<String> collTxId;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification2 plcOfTrad;
    @XmlElement(name = "PlcOfClr")
    protected PlaceOfClearingIdentification1 plcOfClr;
    @XmlElement(name = "TradDt")
    protected TradeDate6Choice tradDt;
    @XmlElement(name = "SttlmDt")
    protected SettlementDate12Choice sttlmDt;
    @XmlElement(name = "FctvSttlmDt", required = true)
    protected SettlementDate14Choice fctvSttlmDt;
    @XmlElement(name = "DealPric")
    protected Price3 dealPric;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "OpngClsg")
    protected OpeningClosing4Choice opngClsg;
    @XmlElement(name = "Rptg")
    protected List<Reporting9Choice> rptg;
    @XmlElement(name = "TradTxCond")
    protected List<TradeTransactionCondition6Choice> tradTxCond;
    @XmlElement(name = "InvstrCpcty")
    protected InvestorCapacity5Choice invstrCpcty;
    @XmlElement(name = "TradOrgtrRole")
    protected TradeOriginator4Choice tradOrgtrRole;
    @XmlElement(name = "TpOfPric")
    protected TypeOfPrice32Choice tpOfPric;
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
    public SecuritiesTradeDetails62 setPlcOfTrad(PlaceOfTradeIdentification2 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the plcOfClr property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfClearingIdentification1 }
     *     
     */
    public PlaceOfClearingIdentification1 getPlcOfClr() {
        return plcOfClr;
    }

    /**
     * Sets the value of the plcOfClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfClearingIdentification1 }
     *     
     */
    public SecuritiesTradeDetails62 setPlcOfClr(PlaceOfClearingIdentification1 value) {
        this.plcOfClr = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate6Choice }
     *     
     */
    public TradeDate6Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate6Choice }
     *     
     */
    public SecuritiesTradeDetails62 setTradDt(TradeDate6Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate12Choice }
     *     
     */
    public SettlementDate12Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate12Choice }
     *     
     */
    public SecuritiesTradeDetails62 setSttlmDt(SettlementDate12Choice value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate14Choice }
     *     
     */
    public SettlementDate14Choice getFctvSttlmDt() {
        return fctvSttlmDt;
    }

    /**
     * Sets the value of the fctvSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate14Choice }
     *     
     */
    public SecuritiesTradeDetails62 setFctvSttlmDt(SettlementDate14Choice value) {
        this.fctvSttlmDt = value;
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
    public SecuritiesTradeDetails62 setDealPric(Price3 value) {
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
    public SecuritiesTradeDetails62 setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the opngClsg property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningClosing4Choice }
     *     
     */
    public OpeningClosing4Choice getOpngClsg() {
        return opngClsg;
    }

    /**
     * Sets the value of the opngClsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningClosing4Choice }
     *     
     */
    public SecuritiesTradeDetails62 setOpngClsg(OpeningClosing4Choice value) {
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
    public SecuritiesTradeDetails62 setInvstrCpcty(InvestorCapacity5Choice value) {
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
    public SecuritiesTradeDetails62 setTradOrgtrRole(TradeOriginator4Choice value) {
        this.tradOrgtrRole = value;
        return this;
    }

    /**
     * Gets the value of the tpOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice32Choice }
     *     
     */
    public TypeOfPrice32Choice getTpOfPric() {
        return tpOfPric;
    }

    /**
     * Sets the value of the tpOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice32Choice }
     *     
     */
    public SecuritiesTradeDetails62 setTpOfPric(TypeOfPrice32Choice value) {
        this.tpOfPric = value;
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
    public SecuritiesTradeDetails62 setFxAddtlDtls(String value) {
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
    public SecuritiesTradeDetails62 setSttlmInstrPrcgAddtlDtls(String value) {
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
    public SecuritiesTradeDetails62 addTradId(String tradId) {
        getTradId().add(tradId);
        return this;
    }

    /**
     * Adds a new item to the collTxId list.
     * @see #getCollTxId()
     * 
     */
    public SecuritiesTradeDetails62 addCollTxId(String collTxId) {
        getCollTxId().add(collTxId);
        return this;
    }

    /**
     * Adds a new item to the rptg list.
     * @see #getRptg()
     * 
     */
    public SecuritiesTradeDetails62 addRptg(Reporting9Choice rptg) {
        getRptg().add(rptg);
        return this;
    }

    /**
     * Adds a new item to the tradTxCond list.
     * @see #getTradTxCond()
     * 
     */
    public SecuritiesTradeDetails62 addTradTxCond(TradeTransactionCondition6Choice tradTxCond) {
        getTradTxCond().add(tradTxCond);
        return this;
    }

}
