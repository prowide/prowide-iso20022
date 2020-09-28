
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the closing of the securities financing transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingTransactionDetails1", propOrder = {
    "sctiesFincgTradId",
    "clsgLegId",
    "termntnDt",
    "rateChngDt",
    "rateTp",
    "rvaltn",
    "lglFrmwk",
    "intrstCmptnMtd",
    "mtrtyDtMod",
    "intrstPmt",
    "varblRateSpprt",
    "rpRate",
    "stockLnMrgn",
    "sctiesHrcut",
    "pricgRate",
    "sprd",
    "txCallDely",
    "ttlNbOfCollInstrs",
    "dealAmt",
    "acrdIntrstAmt",
    "frftAmt",
    "prmAmt",
    "termntnAmtPerPcOfColl",
    "termntnTxAmt",
    "scndLegNrrtv"
})
public class SecuritiesFinancingTransactionDetails1 {

    @XmlElement(name = "SctiesFincgTradId")
    protected String sctiesFincgTradId;
    @XmlElement(name = "ClsgLegId")
    protected String clsgLegId;
    @XmlElement(name = "TermntnDt")
    protected TerminationDate2Choice termntnDt;
    @XmlElement(name = "RateChngDt")
    protected DateAndDateTimeChoice rateChngDt;
    @XmlElement(name = "RateTp")
    protected RateType5Choice rateTp;
    @XmlElement(name = "Rvaltn")
    protected RevaluationIndicator1Choice rvaltn;
    @XmlElement(name = "LglFrmwk")
    protected LegalFramework1Choice lglFrmwk;
    @XmlElement(name = "IntrstCmptnMtd")
    protected InterestComputationMethodFormat1Choice intrstCmptnMtd;
    @XmlElement(name = "MtrtyDtMod")
    protected Boolean mtrtyDtMod;
    @XmlElement(name = "IntrstPmt")
    protected Boolean intrstPmt;
    @XmlElement(name = "VarblRateSpprt")
    protected RateName1 varblRateSpprt;
    @XmlElement(name = "RpRate")
    protected Rate2 rpRate;
    @XmlElement(name = "StockLnMrgn")
    protected Rate2 stockLnMrgn;
    @XmlElement(name = "SctiesHrcut")
    protected Rate2 sctiesHrcut;
    @XmlElement(name = "PricgRate")
    protected RateOrName1Choice pricgRate;
    @XmlElement(name = "Sprd")
    protected Rate2 sprd;
    @XmlElement(name = "TxCallDely")
    protected String txCallDely;
    @XmlElement(name = "TtlNbOfCollInstrs")
    protected String ttlNbOfCollInstrs;
    @XmlElement(name = "DealAmt")
    protected AmountAndDirection4 dealAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection4 acrdIntrstAmt;
    @XmlElement(name = "FrftAmt")
    protected AmountAndDirection4 frftAmt;
    @XmlElement(name = "PrmAmt")
    protected AmountAndDirection4 prmAmt;
    @XmlElement(name = "TermntnAmtPerPcOfColl")
    protected AmountAndDirection4 termntnAmtPerPcOfColl;
    @XmlElement(name = "TermntnTxAmt")
    protected AmountAndDirection4 termntnTxAmt;
    @XmlElement(name = "ScndLegNrrtv")
    protected String scndLegNrrtv;

    /**
     * Gets the value of the sctiesFincgTradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesFincgTradId() {
        return sctiesFincgTradId;
    }

    /**
     * Sets the value of the sctiesFincgTradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setSctiesFincgTradId(String value) {
        this.sctiesFincgTradId = value;
        return this;
    }

    /**
     * Gets the value of the clsgLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClsgLegId() {
        return clsgLegId;
    }

    /**
     * Sets the value of the clsgLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setClsgLegId(String value) {
        this.clsgLegId = value;
        return this;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link TerminationDate2Choice }
     *     
     */
    public TerminationDate2Choice getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationDate2Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setTermntnDt(TerminationDate2Choice value) {
        this.termntnDt = value;
        return this;
    }

    /**
     * Gets the value of the rateChngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getRateChngDt() {
        return rateChngDt;
    }

    /**
     * Sets the value of the rateChngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setRateChngDt(DateAndDateTimeChoice value) {
        this.rateChngDt = value;
        return this;
    }

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link RateType5Choice }
     *     
     */
    public RateType5Choice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType5Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setRateTp(RateType5Choice value) {
        this.rateTp = value;
        return this;
    }

    /**
     * Gets the value of the rvaltn property.
     * 
     * @return
     *     possible object is
     *     {@link RevaluationIndicator1Choice }
     *     
     */
    public RevaluationIndicator1Choice getRvaltn() {
        return rvaltn;
    }

    /**
     * Sets the value of the rvaltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevaluationIndicator1Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setRvaltn(RevaluationIndicator1Choice value) {
        this.rvaltn = value;
        return this;
    }

    /**
     * Gets the value of the lglFrmwk property.
     * 
     * @return
     *     possible object is
     *     {@link LegalFramework1Choice }
     *     
     */
    public LegalFramework1Choice getLglFrmwk() {
        return lglFrmwk;
    }

    /**
     * Sets the value of the lglFrmwk property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalFramework1Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setLglFrmwk(LegalFramework1Choice value) {
        this.lglFrmwk = value;
        return this;
    }

    /**
     * Gets the value of the intrstCmptnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat1Choice }
     *     
     */
    public InterestComputationMethodFormat1Choice getIntrstCmptnMtd() {
        return intrstCmptnMtd;
    }

    /**
     * Sets the value of the intrstCmptnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat1Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setIntrstCmptnMtd(InterestComputationMethodFormat1Choice value) {
        this.intrstCmptnMtd = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDtMod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMtrtyDtMod() {
        return mtrtyDtMod;
    }

    /**
     * Sets the value of the mtrtyDtMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setMtrtyDtMod(Boolean value) {
        this.mtrtyDtMod = value;
        return this;
    }

    /**
     * Gets the value of the intrstPmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrstPmt() {
        return intrstPmt;
    }

    /**
     * Sets the value of the intrstPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setIntrstPmt(Boolean value) {
        this.intrstPmt = value;
        return this;
    }

    /**
     * Gets the value of the varblRateSpprt property.
     * 
     * @return
     *     possible object is
     *     {@link RateName1 }
     *     
     */
    public RateName1 getVarblRateSpprt() {
        return varblRateSpprt;
    }

    /**
     * Sets the value of the varblRateSpprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateName1 }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setVarblRateSpprt(RateName1 value) {
        this.varblRateSpprt = value;
        return this;
    }

    /**
     * Gets the value of the rpRate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getRpRate() {
        return rpRate;
    }

    /**
     * Sets the value of the rpRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setRpRate(Rate2 value) {
        this.rpRate = value;
        return this;
    }

    /**
     * Gets the value of the stockLnMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getStockLnMrgn() {
        return stockLnMrgn;
    }

    /**
     * Sets the value of the stockLnMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setStockLnMrgn(Rate2 value) {
        this.stockLnMrgn = value;
        return this;
    }

    /**
     * Gets the value of the sctiesHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getSctiesHrcut() {
        return sctiesHrcut;
    }

    /**
     * Sets the value of the sctiesHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setSctiesHrcut(Rate2 value) {
        this.sctiesHrcut = value;
        return this;
    }

    /**
     * Gets the value of the pricgRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrName1Choice }
     *     
     */
    public RateOrName1Choice getPricgRate() {
        return pricgRate;
    }

    /**
     * Sets the value of the pricgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrName1Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setPricgRate(RateOrName1Choice value) {
        this.pricgRate = value;
        return this;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setSprd(Rate2 value) {
        this.sprd = value;
        return this;
    }

    /**
     * Gets the value of the txCallDely property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxCallDely() {
        return txCallDely;
    }

    /**
     * Sets the value of the txCallDely property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setTxCallDely(String value) {
        this.txCallDely = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfCollInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfCollInstrs() {
        return ttlNbOfCollInstrs;
    }

    /**
     * Sets the value of the ttlNbOfCollInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setTtlNbOfCollInstrs(String value) {
        this.ttlNbOfCollInstrs = value;
        return this;
    }

    /**
     * Gets the value of the dealAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection4 }
     *     
     */
    public AmountAndDirection4 getDealAmt() {
        return dealAmt;
    }

    /**
     * Sets the value of the dealAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection4 }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setDealAmt(AmountAndDirection4 value) {
        this.dealAmt = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection4 }
     *     
     */
    public AmountAndDirection4 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection4 }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setAcrdIntrstAmt(AmountAndDirection4 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the frftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection4 }
     *     
     */
    public AmountAndDirection4 getFrftAmt() {
        return frftAmt;
    }

    /**
     * Sets the value of the frftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection4 }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setFrftAmt(AmountAndDirection4 value) {
        this.frftAmt = value;
        return this;
    }

    /**
     * Gets the value of the prmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection4 }
     *     
     */
    public AmountAndDirection4 getPrmAmt() {
        return prmAmt;
    }

    /**
     * Sets the value of the prmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection4 }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setPrmAmt(AmountAndDirection4 value) {
        this.prmAmt = value;
        return this;
    }

    /**
     * Gets the value of the termntnAmtPerPcOfColl property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection4 }
     *     
     */
    public AmountAndDirection4 getTermntnAmtPerPcOfColl() {
        return termntnAmtPerPcOfColl;
    }

    /**
     * Sets the value of the termntnAmtPerPcOfColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection4 }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setTermntnAmtPerPcOfColl(AmountAndDirection4 value) {
        this.termntnAmtPerPcOfColl = value;
        return this;
    }

    /**
     * Gets the value of the termntnTxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection4 }
     *     
     */
    public AmountAndDirection4 getTermntnTxAmt() {
        return termntnTxAmt;
    }

    /**
     * Sets the value of the termntnTxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection4 }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setTermntnTxAmt(AmountAndDirection4 value) {
        this.termntnTxAmt = value;
        return this;
    }

    /**
     * Gets the value of the scndLegNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndLegNrrtv() {
        return scndLegNrrtv;
    }

    /**
     * Sets the value of the scndLegNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancingTransactionDetails1 setScndLegNrrtv(String value) {
        this.scndLegNrrtv = value;
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
