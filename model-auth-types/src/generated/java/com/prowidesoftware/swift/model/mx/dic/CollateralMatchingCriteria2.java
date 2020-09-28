
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
 * Compares information related to both sides of a collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralMatchingCriteria2", propOrder = {
    "uncollsdFlg",
    "netXpsrCollstnInd",
    "collValDt",
    "cshVal",
    "cmpntTp",
    "sctyId",
    "sctyClssfctn",
    "cmmdtyClssfctn",
    "qty",
    "nmnlVal",
    "cmmdtyUnitOfMeasr",
    "unitPric",
    "mktVal",
    "hrcutOrMrgn",
    "collQlty",
    "sctyMtrty",
    "sctyIssrCtry",
    "sctyIssrLEI",
    "collTp",
    "avlblForReuse",
    "bsktIdr"
})
public class CollateralMatchingCriteria2 {

    @XmlElement(name = "UncollsdFlg")
    protected CompareTrueFalseIndicator1 uncollsdFlg;
    @XmlElement(name = "NetXpsrCollstnInd")
    protected CompareTrueFalseIndicator1 netXpsrCollstnInd;
    @XmlElement(name = "CollValDt")
    protected CompareActiveOrHistoricCurrencyAndAmount1 collValDt;
    @XmlElement(name = "CshVal")
    protected CompareActiveOrHistoricCurrencyAndAmount1 cshVal;
    @XmlElement(name = "CmpntTp")
    protected CompareCollateralType1 cmpntTp;
    @XmlElement(name = "SctyId")
    protected CompareISINIdentifier1 sctyId;
    @XmlElement(name = "SctyClssfctn")
    protected CompareCFIIdentifier1 sctyClssfctn;
    @XmlElement(name = "CmmdtyClssfctn")
    protected CompareCommodityAssetClass1 cmmdtyClssfctn;
    @XmlElement(name = "Qty")
    protected CompareDecimalNumber1 qty;
    @XmlElement(name = "NmnlVal")
    protected CompareActiveOrHistoricCurrencyAndAmount1 nmnlVal;
    @XmlElement(name = "CmmdtyUnitOfMeasr")
    protected CompareUnitOfMeasure1 cmmdtyUnitOfMeasr;
    @XmlElement(name = "UnitPric")
    protected CompareActiveOrHistoricCurrencyAndAmount1 unitPric;
    @XmlElement(name = "MktVal")
    protected CompareActiveOrHistoricCurrencyAndAmount1 mktVal;
    @XmlElement(name = "HrcutOrMrgn")
    protected ComparePercentageRate1 hrcutOrMrgn;
    @XmlElement(name = "CollQlty")
    protected CompareCollateralQualityType1 collQlty;
    @XmlElement(name = "SctyMtrty")
    protected CompareDate1 sctyMtrty;
    @XmlElement(name = "SctyIssrCtry")
    protected CompareCountryCode1 sctyIssrCtry;
    @XmlElement(name = "SctyIssrLEI")
    protected CompareLEIIdentifier1 sctyIssrLEI;
    @XmlElement(name = "CollTp")
    protected CompareSecuritiesLendingType1 collTp;
    @XmlElement(name = "AvlblForReuse")
    protected CompareTrueFalseIndicator1 avlblForReuse;
    @XmlElement(name = "BsktIdr")
    protected CompareSecurityIdentification1 bsktIdr;

    /**
     * Gets the value of the uncollsdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator1 }
     *     
     */
    public CompareTrueFalseIndicator1 getUncollsdFlg() {
        return uncollsdFlg;
    }

    /**
     * Sets the value of the uncollsdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator1 }
     *     
     */
    public CollateralMatchingCriteria2 setUncollsdFlg(CompareTrueFalseIndicator1 value) {
        this.uncollsdFlg = value;
        return this;
    }

    /**
     * Gets the value of the netXpsrCollstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator1 }
     *     
     */
    public CompareTrueFalseIndicator1 getNetXpsrCollstnInd() {
        return netXpsrCollstnInd;
    }

    /**
     * Sets the value of the netXpsrCollstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator1 }
     *     
     */
    public CollateralMatchingCriteria2 setNetXpsrCollstnInd(CompareTrueFalseIndicator1 value) {
        this.netXpsrCollstnInd = value;
        return this;
    }

    /**
     * Gets the value of the collValDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount1 getCollValDt() {
        return collValDt;
    }

    /**
     * Sets the value of the collValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CollateralMatchingCriteria2 setCollValDt(CompareActiveOrHistoricCurrencyAndAmount1 value) {
        this.collValDt = value;
        return this;
    }

    /**
     * Gets the value of the cshVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount1 getCshVal() {
        return cshVal;
    }

    /**
     * Sets the value of the cshVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CollateralMatchingCriteria2 setCshVal(CompareActiveOrHistoricCurrencyAndAmount1 value) {
        this.cshVal = value;
        return this;
    }

    /**
     * Gets the value of the cmpntTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCollateralType1 }
     *     
     */
    public CompareCollateralType1 getCmpntTp() {
        return cmpntTp;
    }

    /**
     * Sets the value of the cmpntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCollateralType1 }
     *     
     */
    public CollateralMatchingCriteria2 setCmpntTp(CompareCollateralType1 value) {
        this.cmpntTp = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link CompareISINIdentifier1 }
     *     
     */
    public CompareISINIdentifier1 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareISINIdentifier1 }
     *     
     */
    public CollateralMatchingCriteria2 setSctyId(CompareISINIdentifier1 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the sctyClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCFIIdentifier1 }
     *     
     */
    public CompareCFIIdentifier1 getSctyClssfctn() {
        return sctyClssfctn;
    }

    /**
     * Sets the value of the sctyClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCFIIdentifier1 }
     *     
     */
    public CollateralMatchingCriteria2 setSctyClssfctn(CompareCFIIdentifier1 value) {
        this.sctyClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the cmmdtyClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCommodityAssetClass1 }
     *     
     */
    public CompareCommodityAssetClass1 getCmmdtyClssfctn() {
        return cmmdtyClssfctn;
    }

    /**
     * Sets the value of the cmmdtyClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCommodityAssetClass1 }
     *     
     */
    public CollateralMatchingCriteria2 setCmmdtyClssfctn(CompareCommodityAssetClass1 value) {
        this.cmmdtyClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDecimalNumber1 }
     *     
     */
    public CompareDecimalNumber1 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDecimalNumber1 }
     *     
     */
    public CollateralMatchingCriteria2 setQty(CompareDecimalNumber1 value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the nmnlVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount1 getNmnlVal() {
        return nmnlVal;
    }

    /**
     * Sets the value of the nmnlVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CollateralMatchingCriteria2 setNmnlVal(CompareActiveOrHistoricCurrencyAndAmount1 value) {
        this.nmnlVal = value;
        return this;
    }

    /**
     * Gets the value of the cmmdtyUnitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitOfMeasure1 }
     *     
     */
    public CompareUnitOfMeasure1 getCmmdtyUnitOfMeasr() {
        return cmmdtyUnitOfMeasr;
    }

    /**
     * Sets the value of the cmmdtyUnitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitOfMeasure1 }
     *     
     */
    public CollateralMatchingCriteria2 setCmmdtyUnitOfMeasr(CompareUnitOfMeasure1 value) {
        this.cmmdtyUnitOfMeasr = value;
        return this;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount1 getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CollateralMatchingCriteria2 setUnitPric(CompareActiveOrHistoricCurrencyAndAmount1 value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount1 getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CollateralMatchingCriteria2 setMktVal(CompareActiveOrHistoricCurrencyAndAmount1 value) {
        this.mktVal = value;
        return this;
    }

    /**
     * Gets the value of the hrcutOrMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate1 }
     *     
     */
    public ComparePercentageRate1 getHrcutOrMrgn() {
        return hrcutOrMrgn;
    }

    /**
     * Sets the value of the hrcutOrMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate1 }
     *     
     */
    public CollateralMatchingCriteria2 setHrcutOrMrgn(ComparePercentageRate1 value) {
        this.hrcutOrMrgn = value;
        return this;
    }

    /**
     * Gets the value of the collQlty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCollateralQualityType1 }
     *     
     */
    public CompareCollateralQualityType1 getCollQlty() {
        return collQlty;
    }

    /**
     * Sets the value of the collQlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCollateralQualityType1 }
     *     
     */
    public CollateralMatchingCriteria2 setCollQlty(CompareCollateralQualityType1 value) {
        this.collQlty = value;
        return this;
    }

    /**
     * Gets the value of the sctyMtrty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate1 }
     *     
     */
    public CompareDate1 getSctyMtrty() {
        return sctyMtrty;
    }

    /**
     * Sets the value of the sctyMtrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate1 }
     *     
     */
    public CollateralMatchingCriteria2 setSctyMtrty(CompareDate1 value) {
        this.sctyMtrty = value;
        return this;
    }

    /**
     * Gets the value of the sctyIssrCtry property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCountryCode1 }
     *     
     */
    public CompareCountryCode1 getSctyIssrCtry() {
        return sctyIssrCtry;
    }

    /**
     * Sets the value of the sctyIssrCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCountryCode1 }
     *     
     */
    public CollateralMatchingCriteria2 setSctyIssrCtry(CompareCountryCode1 value) {
        this.sctyIssrCtry = value;
        return this;
    }

    /**
     * Gets the value of the sctyIssrLEI property.
     * 
     * @return
     *     possible object is
     *     {@link CompareLEIIdentifier1 }
     *     
     */
    public CompareLEIIdentifier1 getSctyIssrLEI() {
        return sctyIssrLEI;
    }

    /**
     * Sets the value of the sctyIssrLEI property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareLEIIdentifier1 }
     *     
     */
    public CollateralMatchingCriteria2 setSctyIssrLEI(CompareLEIIdentifier1 value) {
        this.sctyIssrLEI = value;
        return this;
    }

    /**
     * Gets the value of the collTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareSecuritiesLendingType1 }
     *     
     */
    public CompareSecuritiesLendingType1 getCollTp() {
        return collTp;
    }

    /**
     * Sets the value of the collTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareSecuritiesLendingType1 }
     *     
     */
    public CollateralMatchingCriteria2 setCollTp(CompareSecuritiesLendingType1 value) {
        this.collTp = value;
        return this;
    }

    /**
     * Gets the value of the avlblForReuse property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator1 }
     *     
     */
    public CompareTrueFalseIndicator1 getAvlblForReuse() {
        return avlblForReuse;
    }

    /**
     * Sets the value of the avlblForReuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator1 }
     *     
     */
    public CollateralMatchingCriteria2 setAvlblForReuse(CompareTrueFalseIndicator1 value) {
        this.avlblForReuse = value;
        return this;
    }

    /**
     * Gets the value of the bsktIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareSecurityIdentification1 }
     *     
     */
    public CompareSecurityIdentification1 getBsktIdr() {
        return bsktIdr;
    }

    /**
     * Sets the value of the bsktIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareSecurityIdentification1 }
     *     
     */
    public CollateralMatchingCriteria2 setBsktIdr(CompareSecurityIdentification1 value) {
        this.bsktIdr = value;
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
