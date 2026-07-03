
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
@XmlType(name = "SecuritiesFinancingTransactionDetails32", propOrder = {
    "sctiesFincgTradId",
    "clsgLegId",
    "termntnDt",
    "rateChngDt",
    "earlstCallBckDt",
    "comssnClctnDt",
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
    "chrgsRate",
    "pricgRate",
    "sprd",
    "txCallDely",
    "ttlNbOfCollInstrs",
    "lclBrkrComssn",
    "dealAmt",
    "acrdIntrstAmt",
    "frftAmt",
    "prmAmt",
    "termntnAmtPerPcOfColl",
    "termntnTxAmt",
    "scndLegNrrtv"
})
public class SecuritiesFinancingTransactionDetails32 {

    @XmlElement(name = "SctiesFincgTradId")
    protected String sctiesFincgTradId;
    @XmlElement(name = "ClsgLegId")
    protected String clsgLegId;
    @XmlElement(name = "TermntnDt")
    protected TerminationDate5Choice termntnDt;
    @XmlElement(name = "RateChngDt")
    protected DateAndDateTimeChoice rateChngDt;
    @XmlElement(name = "EarlstCallBckDt")
    protected DateAndDateTimeChoice earlstCallBckDt;
    @XmlElement(name = "ComssnClctnDt")
    protected DateAndDateTimeChoice comssnClctnDt;
    @XmlElement(name = "RateTp")
    protected RateType67Choice rateTp;
    @XmlElement(name = "Rvaltn")
    protected RevaluationIndicator4Choice rvaltn;
    @XmlElement(name = "LglFrmwk")
    protected LegalFramework4Choice lglFrmwk;
    @XmlElement(name = "IntrstCmptnMtd")
    protected InterestComputationMethodFormat5Choice intrstCmptnMtd;
    @XmlElement(name = "MtrtyDtMod")
    protected Boolean mtrtyDtMod;
    @XmlElement(name = "IntrstPmt")
    protected Boolean intrstPmt;
    @XmlElement(name = "VarblRateSpprt")
    protected RateName2 varblRateSpprt;
    @XmlElement(name = "RpRate")
    protected Rate2 rpRate;
    @XmlElement(name = "StockLnMrgn")
    protected Rate2 stockLnMrgn;
    @XmlElement(name = "SctiesHrcut")
    protected Rate2 sctiesHrcut;
    @XmlElement(name = "ChrgsRate")
    protected Rate2 chrgsRate;
    @XmlElement(name = "PricgRate")
    protected RateOrName2Choice pricgRate;
    @XmlElement(name = "Sprd")
    protected Rate2 sprd;
    @XmlElement(name = "TxCallDely")
    protected String txCallDely;
    @XmlElement(name = "TtlNbOfCollInstrs")
    protected String ttlNbOfCollInstrs;
    @XmlElement(name = "LclBrkrComssn")
    protected AmountAndDirection59 lclBrkrComssn;
    @XmlElement(name = "DealAmt")
    protected AmountAndDirection59 dealAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection59 acrdIntrstAmt;
    @XmlElement(name = "FrftAmt")
    protected AmountAndDirection59 frftAmt;
    @XmlElement(name = "PrmAmt")
    protected AmountAndDirection59 prmAmt;
    @XmlElement(name = "TermntnAmtPerPcOfColl")
    protected AmountAndDirection59 termntnAmtPerPcOfColl;
    @XmlElement(name = "TermntnTxAmt")
    protected AmountAndDirection59 termntnTxAmt;
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
    public SecuritiesFinancingTransactionDetails32 setSctiesFincgTradId(String value) {
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
    public SecuritiesFinancingTransactionDetails32 setClsgLegId(String value) {
        this.clsgLegId = value;
        return this;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link TerminationDate5Choice }
     *     
     */
    public TerminationDate5Choice getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationDate5Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setTermntnDt(TerminationDate5Choice value) {
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
    public SecuritiesFinancingTransactionDetails32 setRateChngDt(DateAndDateTimeChoice value) {
        this.rateChngDt = value;
        return this;
    }

    /**
     * Gets the value of the earlstCallBckDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getEarlstCallBckDt() {
        return earlstCallBckDt;
    }

    /**
     * Sets the value of the earlstCallBckDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setEarlstCallBckDt(DateAndDateTimeChoice value) {
        this.earlstCallBckDt = value;
        return this;
    }

    /**
     * Gets the value of the comssnClctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getComssnClctnDt() {
        return comssnClctnDt;
    }

    /**
     * Sets the value of the comssnClctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setComssnClctnDt(DateAndDateTimeChoice value) {
        this.comssnClctnDt = value;
        return this;
    }

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link RateType67Choice }
     *     
     */
    public RateType67Choice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType67Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setRateTp(RateType67Choice value) {
        this.rateTp = value;
        return this;
    }

    /**
     * Gets the value of the rvaltn property.
     * 
     * @return
     *     possible object is
     *     {@link RevaluationIndicator4Choice }
     *     
     */
    public RevaluationIndicator4Choice getRvaltn() {
        return rvaltn;
    }

    /**
     * Sets the value of the rvaltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevaluationIndicator4Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setRvaltn(RevaluationIndicator4Choice value) {
        this.rvaltn = value;
        return this;
    }

    /**
     * Gets the value of the lglFrmwk property.
     * 
     * @return
     *     possible object is
     *     {@link LegalFramework4Choice }
     *     
     */
    public LegalFramework4Choice getLglFrmwk() {
        return lglFrmwk;
    }

    /**
     * Sets the value of the lglFrmwk property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalFramework4Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setLglFrmwk(LegalFramework4Choice value) {
        this.lglFrmwk = value;
        return this;
    }

    /**
     * Gets the value of the intrstCmptnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat5Choice }
     *     
     */
    public InterestComputationMethodFormat5Choice getIntrstCmptnMtd() {
        return intrstCmptnMtd;
    }

    /**
     * Sets the value of the intrstCmptnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat5Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setIntrstCmptnMtd(InterestComputationMethodFormat5Choice value) {
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
    public SecuritiesFinancingTransactionDetails32 setMtrtyDtMod(Boolean value) {
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
    public SecuritiesFinancingTransactionDetails32 setIntrstPmt(Boolean value) {
        this.intrstPmt = value;
        return this;
    }

    /**
     * Gets the value of the varblRateSpprt property.
     * 
     * @return
     *     possible object is
     *     {@link RateName2 }
     *     
     */
    public RateName2 getVarblRateSpprt() {
        return varblRateSpprt;
    }

    /**
     * Sets the value of the varblRateSpprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateName2 }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setVarblRateSpprt(RateName2 value) {
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
    public SecuritiesFinancingTransactionDetails32 setRpRate(Rate2 value) {
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
    public SecuritiesFinancingTransactionDetails32 setStockLnMrgn(Rate2 value) {
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
    public SecuritiesFinancingTransactionDetails32 setSctiesHrcut(Rate2 value) {
        this.sctiesHrcut = value;
        return this;
    }

    /**
     * Gets the value of the chrgsRate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getChrgsRate() {
        return chrgsRate;
    }

    /**
     * Sets the value of the chrgsRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setChrgsRate(Rate2 value) {
        this.chrgsRate = value;
        return this;
    }

    /**
     * Gets the value of the pricgRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrName2Choice }
     *     
     */
    public RateOrName2Choice getPricgRate() {
        return pricgRate;
    }

    /**
     * Sets the value of the pricgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrName2Choice }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setPricgRate(RateOrName2Choice value) {
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
    public SecuritiesFinancingTransactionDetails32 setSprd(Rate2 value) {
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
    public SecuritiesFinancingTransactionDetails32 setTxCallDely(String value) {
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
    public SecuritiesFinancingTransactionDetails32 setTtlNbOfCollInstrs(String value) {
        this.ttlNbOfCollInstrs = value;
        return this;
    }

    /**
     * Gets the value of the lclBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public AmountAndDirection59 getLclBrkrComssn() {
        return lclBrkrComssn;
    }

    /**
     * Sets the value of the lclBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setLclBrkrComssn(AmountAndDirection59 value) {
        this.lclBrkrComssn = value;
        return this;
    }

    /**
     * Gets the value of the dealAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public AmountAndDirection59 getDealAmt() {
        return dealAmt;
    }

    /**
     * Sets the value of the dealAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setDealAmt(AmountAndDirection59 value) {
        this.dealAmt = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public AmountAndDirection59 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setAcrdIntrstAmt(AmountAndDirection59 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the frftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public AmountAndDirection59 getFrftAmt() {
        return frftAmt;
    }

    /**
     * Sets the value of the frftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setFrftAmt(AmountAndDirection59 value) {
        this.frftAmt = value;
        return this;
    }

    /**
     * Gets the value of the prmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public AmountAndDirection59 getPrmAmt() {
        return prmAmt;
    }

    /**
     * Sets the value of the prmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setPrmAmt(AmountAndDirection59 value) {
        this.prmAmt = value;
        return this;
    }

    /**
     * Gets the value of the termntnAmtPerPcOfColl property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public AmountAndDirection59 getTermntnAmtPerPcOfColl() {
        return termntnAmtPerPcOfColl;
    }

    /**
     * Sets the value of the termntnAmtPerPcOfColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setTermntnAmtPerPcOfColl(AmountAndDirection59 value) {
        this.termntnAmtPerPcOfColl = value;
        return this;
    }

    /**
     * Gets the value of the termntnTxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public AmountAndDirection59 getTermntnTxAmt() {
        return termntnTxAmt;
    }

    /**
     * Sets the value of the termntnTxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public SecuritiesFinancingTransactionDetails32 setTermntnTxAmt(AmountAndDirection59 value) {
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
    public SecuritiesFinancingTransactionDetails32 setScndLegNrrtv(String value) {
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
