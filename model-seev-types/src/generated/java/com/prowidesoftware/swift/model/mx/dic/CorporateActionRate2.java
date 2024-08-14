
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies rates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate2", propOrder = {
    "whldgTax",
    "whldgOfFrgnTax",
    "whldgOfLclTax",
    "grmnLclTax1",
    "grmnLclTax2",
    "grmnLclTax3",
    "grmnLclTax4",
    "taxOnIncm",
    "taxOnPrft",
    "taxRclm",
    "fsclStmp",
    "prratn",
    "newToOd",
    "newSctiesToUndrlygScties",
    "addtlQtyForExstgScties",
    "addtlQtyForSbcbdRsltntScties",
    "rltdTax",
    "nonResdtRate",
    "chrgs",
    "intrstForUsdPmt",
    "indxFctr",
    "fullyFrnkd",
    "grssDvdd",
    "netDvdd",
    "fnlDvdd",
    "prvsnlDvdd",
    "cshIncntiv",
    "slctnFee",
    "maxAllwdOvrsbcpt",
    "addtlTax",
    "orgnlAmt",
    "xchgRate",
    "aplblRate"
})
public class CorporateActionRate2 {

    @XmlElement(name = "WhldgTax")
    protected RateFormat1Choice whldgTax;
    @XmlElement(name = "WhldgOfFrgnTax")
    protected RateAndAmountFormat1Choice whldgOfFrgnTax;
    @XmlElement(name = "WhldgOfLclTax")
    protected RateAndAmountFormat1Choice whldgOfLclTax;
    @XmlElement(name = "GrmnLclTax1")
    protected RateAndAmountFormat1Choice grmnLclTax1;
    @XmlElement(name = "GrmnLclTax2")
    protected RateAndAmountFormat1Choice grmnLclTax2;
    @XmlElement(name = "GrmnLclTax3")
    protected RateAndAmountFormat1Choice grmnLclTax3;
    @XmlElement(name = "GrmnLclTax4")
    protected RateAndAmountFormat1Choice grmnLclTax4;
    @XmlElement(name = "TaxOnIncm")
    protected RateFormat1Choice taxOnIncm;
    @XmlElement(name = "TaxOnPrft")
    protected RateFormat1Choice taxOnPrft;
    @XmlElement(name = "TaxRclm")
    protected RateFormat1Choice taxRclm;
    @XmlElement(name = "FsclStmp")
    protected RateFormat1Choice fsclStmp;
    @XmlElement(name = "Prratn")
    protected RateFormat1Choice prratn;
    @XmlElement(name = "NewToOd")
    protected RatioFormat2Choice newToOd;
    @XmlElement(name = "NewSctiesToUndrlygScties")
    protected RatioFormat2Choice newSctiesToUndrlygScties;
    @XmlElement(name = "AddtlQtyForExstgScties")
    protected RatioFormat1Choice addtlQtyForExstgScties;
    @XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
    protected RatioFormat1Choice addtlQtyForSbcbdRsltntScties;
    @XmlElement(name = "RltdTax")
    protected RelatedTaxType1 rltdTax;
    @XmlElement(name = "NonResdtRate")
    protected RateAndAmountFormat1Choice nonResdtRate;
    @XmlElement(name = "Chrgs")
    protected RateAndAmountFormat1Choice chrgs;
    @XmlElement(name = "IntrstForUsdPmt")
    protected RateAndAmountFormat1Choice intrstForUsdPmt;
    @XmlElement(name = "IndxFctr")
    protected RateAndAmountFormat1Choice indxFctr;
    @XmlElement(name = "FullyFrnkd")
    protected RateAndAmountFormat1Choice fullyFrnkd;
    @XmlElement(name = "GrssDvdd")
    protected GrossDividendRate1Choice grssDvdd;
    @XmlElement(name = "NetDvdd")
    protected NetDividendRate1Choice netDvdd;
    @XmlElement(name = "FnlDvdd")
    protected AmountAndRateFormat2Choice fnlDvdd;
    @XmlElement(name = "PrvsnlDvdd")
    protected AmountAndRateFormat2Choice prvsnlDvdd;
    @XmlElement(name = "CshIncntiv")
    protected RateFormat1Choice cshIncntiv;
    @XmlElement(name = "SlctnFee")
    protected RateFormat1Choice slctnFee;
    @XmlElement(name = "MaxAllwdOvrsbcpt")
    protected RateFormat1Choice maxAllwdOvrsbcpt;
    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat1Choice addtlTax;
    @XmlElement(name = "OrgnlAmt")
    protected ActiveCurrencyAndAmount orgnlAmt;
    @XmlElement(name = "XchgRate")
    protected ForeignExchangeTerms8 xchgRate;
    @XmlElement(name = "AplblRate")
    protected RateFormat1Choice aplblRate;

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public CorporateActionRate2 setWhldgTax(RateFormat1Choice value) {
        this.whldgTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgOfFrgnTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getWhldgOfFrgnTax() {
        return whldgOfFrgnTax;
    }

    /**
     * Sets the value of the whldgOfFrgnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public CorporateActionRate2 setWhldgOfFrgnTax(RateAndAmountFormat1Choice value) {
        this.whldgOfFrgnTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgOfLclTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getWhldgOfLclTax() {
        return whldgOfLclTax;
    }

    /**
     * Sets the value of the whldgOfLclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public CorporateActionRate2 setWhldgOfLclTax(RateAndAmountFormat1Choice value) {
        this.whldgOfLclTax = value;
        return this;
    }

    /**
     * Gets the value of the grmnLclTax1 property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getGrmnLclTax1() {
        return grmnLclTax1;
    }

    /**
     * Sets the value of the grmnLclTax1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public CorporateActionRate2 setGrmnLclTax1(RateAndAmountFormat1Choice value) {
        this.grmnLclTax1 = value;
        return this;
    }

    /**
     * Gets the value of the grmnLclTax2 property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getGrmnLclTax2() {
        return grmnLclTax2;
    }

    /**
     * Sets the value of the grmnLclTax2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public CorporateActionRate2 setGrmnLclTax2(RateAndAmountFormat1Choice value) {
        this.grmnLclTax2 = value;
        return this;
    }

    /**
     * Gets the value of the grmnLclTax3 property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getGrmnLclTax3() {
        return grmnLclTax3;
    }

    /**
     * Sets the value of the grmnLclTax3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public CorporateActionRate2 setGrmnLclTax3(RateAndAmountFormat1Choice value) {
        this.grmnLclTax3 = value;
        return this;
    }

    /**
     * Gets the value of the grmnLclTax4 property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getGrmnLclTax4() {
        return grmnLclTax4;
    }

    /**
     * Sets the value of the grmnLclTax4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public CorporateActionRate2 setGrmnLclTax4(RateAndAmountFormat1Choice value) {
        this.grmnLclTax4 = value;
        return this;
    }

    /**
     * Gets the value of the taxOnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public CorporateActionRate2 setTaxOnIncm(RateFormat1Choice value) {
        this.taxOnIncm = value;
        return this;
    }

    /**
     * Gets the value of the taxOnPrft property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getTaxOnPrft() {
        return taxOnPrft;
    }

    /**
     * Sets the value of the taxOnPrft property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public CorporateActionRate2 setTaxOnPrft(RateFormat1Choice value) {
        this.taxOnPrft = value;
        return this;
    }

    /**
     * Gets the value of the taxRclm property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getTaxRclm() {
        return taxRclm;
    }

    /**
     * Sets the value of the taxRclm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public CorporateActionRate2 setTaxRclm(RateFormat1Choice value) {
        this.taxRclm = value;
        return this;
    }

    /**
     * Gets the value of the fsclStmp property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getFsclStmp() {
        return fsclStmp;
    }

    /**
     * Sets the value of the fsclStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public CorporateActionRate2 setFsclStmp(RateFormat1Choice value) {
        this.fsclStmp = value;
        return this;
    }

    /**
     * Gets the value of the prratn property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getPrratn() {
        return prratn;
    }

    /**
     * Sets the value of the prratn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public CorporateActionRate2 setPrratn(RateFormat1Choice value) {
        this.prratn = value;
        return this;
    }

    /**
     * Gets the value of the newToOd property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat2Choice }
     *     
     */
    public RatioFormat2Choice getNewToOd() {
        return newToOd;
    }

    /**
     * Sets the value of the newToOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat2Choice }
     *     
     */
    public CorporateActionRate2 setNewToOd(RatioFormat2Choice value) {
        this.newToOd = value;
        return this;
    }

    /**
     * Gets the value of the newSctiesToUndrlygScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat2Choice }
     *     
     */
    public RatioFormat2Choice getNewSctiesToUndrlygScties() {
        return newSctiesToUndrlygScties;
    }

    /**
     * Sets the value of the newSctiesToUndrlygScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat2Choice }
     *     
     */
    public CorporateActionRate2 setNewSctiesToUndrlygScties(RatioFormat2Choice value) {
        this.newSctiesToUndrlygScties = value;
        return this;
    }

    /**
     * Gets the value of the addtlQtyForExstgScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat1Choice }
     *     
     */
    public RatioFormat1Choice getAddtlQtyForExstgScties() {
        return addtlQtyForExstgScties;
    }

    /**
     * Sets the value of the addtlQtyForExstgScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat1Choice }
     *     
     */
    public CorporateActionRate2 setAddtlQtyForExstgScties(RatioFormat1Choice value) {
        this.addtlQtyForExstgScties = value;
        return this;
    }

    /**
     * Gets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat1Choice }
     *     
     */
    public RatioFormat1Choice getAddtlQtyForSbcbdRsltntScties() {
        return addtlQtyForSbcbdRsltntScties;
    }

    /**
     * Sets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat1Choice }
     *     
     */
    public CorporateActionRate2 setAddtlQtyForSbcbdRsltntScties(RatioFormat1Choice value) {
        this.addtlQtyForSbcbdRsltntScties = value;
        return this;
    }

    /**
     * Gets the value of the rltdTax property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedTaxType1 }
     *     
     */
    public RelatedTaxType1 getRltdTax() {
        return rltdTax;
    }

    /**
     * Sets the value of the rltdTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedTaxType1 }
     *     
     */
    public CorporateActionRate2 setRltdTax(RelatedTaxType1 value) {
        this.rltdTax = value;
        return this;
    }

    /**
     * Gets the value of the nonResdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getNonResdtRate() {
        return nonResdtRate;
    }

    /**
     * Sets the value of the nonResdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public CorporateActionRate2 setNonResdtRate(RateAndAmountFormat1Choice value) {
        this.nonResdtRate = value;
        return this;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getChrgs() {
        return chrgs;
    }

    /**
     * Sets the value of the chrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public CorporateActionRate2 setChrgs(RateAndAmountFormat1Choice value) {
        this.chrgs = value;
        return this;
    }

    /**
     * Gets the value of the intrstForUsdPmt property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getIntrstForUsdPmt() {
        return intrstForUsdPmt;
    }

    /**
     * Sets the value of the intrstForUsdPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public CorporateActionRate2 setIntrstForUsdPmt(RateAndAmountFormat1Choice value) {
        this.intrstForUsdPmt = value;
        return this;
    }

    /**
     * Gets the value of the indxFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getIndxFctr() {
        return indxFctr;
    }

    /**
     * Sets the value of the indxFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public CorporateActionRate2 setIndxFctr(RateAndAmountFormat1Choice value) {
        this.indxFctr = value;
        return this;
    }

    /**
     * Gets the value of the fullyFrnkd property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getFullyFrnkd() {
        return fullyFrnkd;
    }

    /**
     * Sets the value of the fullyFrnkd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public CorporateActionRate2 setFullyFrnkd(RateAndAmountFormat1Choice value) {
        this.fullyFrnkd = value;
        return this;
    }

    /**
     * Gets the value of the grssDvdd property.
     * 
     * @return
     *     possible object is
     *     {@link GrossDividendRate1Choice }
     *     
     */
    public GrossDividendRate1Choice getGrssDvdd() {
        return grssDvdd;
    }

    /**
     * Sets the value of the grssDvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossDividendRate1Choice }
     *     
     */
    public CorporateActionRate2 setGrssDvdd(GrossDividendRate1Choice value) {
        this.grssDvdd = value;
        return this;
    }

    /**
     * Gets the value of the netDvdd property.
     * 
     * @return
     *     possible object is
     *     {@link NetDividendRate1Choice }
     *     
     */
    public NetDividendRate1Choice getNetDvdd() {
        return netDvdd;
    }

    /**
     * Sets the value of the netDvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetDividendRate1Choice }
     *     
     */
    public CorporateActionRate2 setNetDvdd(NetDividendRate1Choice value) {
        this.netDvdd = value;
        return this;
    }

    /**
     * Gets the value of the fnlDvdd property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndRateFormat2Choice }
     *     
     */
    public AmountAndRateFormat2Choice getFnlDvdd() {
        return fnlDvdd;
    }

    /**
     * Sets the value of the fnlDvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndRateFormat2Choice }
     *     
     */
    public CorporateActionRate2 setFnlDvdd(AmountAndRateFormat2Choice value) {
        this.fnlDvdd = value;
        return this;
    }

    /**
     * Gets the value of the prvsnlDvdd property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndRateFormat2Choice }
     *     
     */
    public AmountAndRateFormat2Choice getPrvsnlDvdd() {
        return prvsnlDvdd;
    }

    /**
     * Sets the value of the prvsnlDvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndRateFormat2Choice }
     *     
     */
    public CorporateActionRate2 setPrvsnlDvdd(AmountAndRateFormat2Choice value) {
        this.prvsnlDvdd = value;
        return this;
    }

    /**
     * Gets the value of the cshIncntiv property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getCshIncntiv() {
        return cshIncntiv;
    }

    /**
     * Sets the value of the cshIncntiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public CorporateActionRate2 setCshIncntiv(RateFormat1Choice value) {
        this.cshIncntiv = value;
        return this;
    }

    /**
     * Gets the value of the slctnFee property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getSlctnFee() {
        return slctnFee;
    }

    /**
     * Sets the value of the slctnFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public CorporateActionRate2 setSlctnFee(RateFormat1Choice value) {
        this.slctnFee = value;
        return this;
    }

    /**
     * Gets the value of the maxAllwdOvrsbcpt property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getMaxAllwdOvrsbcpt() {
        return maxAllwdOvrsbcpt;
    }

    /**
     * Sets the value of the maxAllwdOvrsbcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public CorporateActionRate2 setMaxAllwdOvrsbcpt(RateFormat1Choice value) {
        this.maxAllwdOvrsbcpt = value;
        return this;
    }

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public CorporateActionRate2 setAddtlTax(RateAndAmountFormat1Choice value) {
        this.addtlTax = value;
        return this;
    }

    /**
     * Gets the value of the orgnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOrgnlAmt() {
        return orgnlAmt;
    }

    /**
     * Sets the value of the orgnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionRate2 setOrgnlAmt(ActiveCurrencyAndAmount value) {
        this.orgnlAmt = value;
        return this;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms8 }
     *     
     */
    public ForeignExchangeTerms8 getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms8 }
     *     
     */
    public CorporateActionRate2 setXchgRate(ForeignExchangeTerms8 value) {
        this.xchgRate = value;
        return this;
    }

    /**
     * Gets the value of the aplblRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getAplblRate() {
        return aplblRate;
    }

    /**
     * Sets the value of the aplblRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public CorporateActionRate2 setAplblRate(RateFormat1Choice value) {
        this.aplblRate = value;
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
