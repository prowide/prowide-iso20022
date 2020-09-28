
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
 * Provides information about the rates related to securities movement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateDetails12", propOrder = {
    "addtlTax",
    "chrgsFees",
    "fnlDvddRate",
    "fsclStmp",
    "fullyFrnkdRate",
    "grssDvddRate",
    "earlySlctnFeeRate",
    "thrdPtyIncntivRate",
    "intrstRateUsdForPmt",
    "netDvddRate",
    "nonResdtRate",
    "prvsnlDvddRate",
    "aplblRate",
    "slctnFeeRate",
    "taxCdtRate",
    "taxRltdRate",
    "whldgTaxRate",
    "taxOnIncm",
    "taxOnPrfts",
    "taxRclmRate",
    "whldgOfFrgnTax",
    "whldgOfLclTax",
    "equlstnRate"
})
public class RateDetails12 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat6Choice addtlTax;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat6Choice chrgsFees;
    @XmlElement(name = "FnlDvddRate")
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount fnlDvddRate;
    @XmlElement(name = "FsclStmp")
    protected BigDecimal fsclStmp;
    @XmlElement(name = "FullyFrnkdRate")
    protected RateAndAmountFormat6Choice fullyFrnkdRate;
    @XmlElement(name = "GrssDvddRate")
    protected List<GrossDividendRateFormat12Choice> grssDvddRate;
    @XmlElement(name = "EarlySlctnFeeRate")
    protected RateAndAmountFormat18Choice earlySlctnFeeRate;
    @XmlElement(name = "ThrdPtyIncntivRate")
    protected RateAndAmountFormat18Choice thrdPtyIncntivRate;
    @XmlElement(name = "IntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat3Choice> intrstRateUsdForPmt;
    @XmlElement(name = "NetDvddRate")
    protected List<NetDividendRateFormat14Choice> netDvddRate;
    @XmlElement(name = "NonResdtRate")
    protected RateAndAmountFormat6Choice nonResdtRate;
    @XmlElement(name = "PrvsnlDvddRate")
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount prvsnlDvddRate;
    @XmlElement(name = "AplblRate")
    protected BigDecimal aplblRate;
    @XmlElement(name = "SlctnFeeRate")
    protected RateAndAmountFormat18Choice slctnFeeRate;
    @XmlElement(name = "TaxCdtRate")
    protected List<TaxCreditRateFormat3Choice> taxCdtRate;
    @XmlElement(name = "TaxRltdRate")
    protected List<RateTypeAndAmountAndStatus10> taxRltdRate;
    @XmlElement(name = "WhldgTaxRate")
    protected BigDecimal whldgTaxRate;
    @XmlElement(name = "TaxOnIncm")
    protected BigDecimal taxOnIncm;
    @XmlElement(name = "TaxOnPrfts")
    protected BigDecimal taxOnPrfts;
    @XmlElement(name = "TaxRclmRate")
    protected BigDecimal taxRclmRate;
    @XmlElement(name = "WhldgOfFrgnTax")
    protected RateAndAmountFormat6Choice whldgOfFrgnTax;
    @XmlElement(name = "WhldgOfLclTax")
    protected RateAndAmountFormat6Choice whldgOfLclTax;
    @XmlElement(name = "EqulstnRate")
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount equlstnRate;

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public RateAndAmountFormat6Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public RateDetails12 setAddtlTax(RateAndAmountFormat6Choice value) {
        this.addtlTax = value;
        return this;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public RateAndAmountFormat6Choice getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public RateDetails12 setChrgsFees(RateAndAmountFormat6Choice value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the fnlDvddRate property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAnd13DecimalAmount getFnlDvddRate() {
        return fnlDvddRate;
    }

    /**
     * Sets the value of the fnlDvddRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RateDetails12 setFnlDvddRate(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
        this.fnlDvddRate = value;
        return this;
    }

    /**
     * Gets the value of the fsclStmp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFsclStmp() {
        return fsclStmp;
    }

    /**
     * Sets the value of the fsclStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RateDetails12 setFsclStmp(BigDecimal value) {
        this.fsclStmp = value;
        return this;
    }

    /**
     * Gets the value of the fullyFrnkdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public RateAndAmountFormat6Choice getFullyFrnkdRate() {
        return fullyFrnkdRate;
    }

    /**
     * Sets the value of the fullyFrnkdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public RateDetails12 setFullyFrnkdRate(RateAndAmountFormat6Choice value) {
        this.fullyFrnkdRate = value;
        return this;
    }

    /**
     * Gets the value of the grssDvddRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grssDvddRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrssDvddRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrossDividendRateFormat12Choice }
     * 
     * 
     */
    public List<GrossDividendRateFormat12Choice> getGrssDvddRate() {
        if (grssDvddRate == null) {
            grssDvddRate = new ArrayList<GrossDividendRateFormat12Choice>();
        }
        return this.grssDvddRate;
    }

    /**
     * Gets the value of the earlySlctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat18Choice }
     *     
     */
    public RateAndAmountFormat18Choice getEarlySlctnFeeRate() {
        return earlySlctnFeeRate;
    }

    /**
     * Sets the value of the earlySlctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat18Choice }
     *     
     */
    public RateDetails12 setEarlySlctnFeeRate(RateAndAmountFormat18Choice value) {
        this.earlySlctnFeeRate = value;
        return this;
    }

    /**
     * Gets the value of the thrdPtyIncntivRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat18Choice }
     *     
     */
    public RateAndAmountFormat18Choice getThrdPtyIncntivRate() {
        return thrdPtyIncntivRate;
    }

    /**
     * Sets the value of the thrdPtyIncntivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat18Choice }
     *     
     */
    public RateDetails12 setThrdPtyIncntivRate(RateAndAmountFormat18Choice value) {
        this.thrdPtyIncntivRate = value;
        return this;
    }

    /**
     * Gets the value of the intrstRateUsdForPmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrstRateUsdForPmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrstRateUsdForPmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestRateUsedForPaymentFormat3Choice }
     * 
     * 
     */
    public List<InterestRateUsedForPaymentFormat3Choice> getIntrstRateUsdForPmt() {
        if (intrstRateUsdForPmt == null) {
            intrstRateUsdForPmt = new ArrayList<InterestRateUsedForPaymentFormat3Choice>();
        }
        return this.intrstRateUsdForPmt;
    }

    /**
     * Gets the value of the netDvddRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netDvddRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetDvddRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetDividendRateFormat14Choice }
     * 
     * 
     */
    public List<NetDividendRateFormat14Choice> getNetDvddRate() {
        if (netDvddRate == null) {
            netDvddRate = new ArrayList<NetDividendRateFormat14Choice>();
        }
        return this.netDvddRate;
    }

    /**
     * Gets the value of the nonResdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public RateAndAmountFormat6Choice getNonResdtRate() {
        return nonResdtRate;
    }

    /**
     * Sets the value of the nonResdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public RateDetails12 setNonResdtRate(RateAndAmountFormat6Choice value) {
        this.nonResdtRate = value;
        return this;
    }

    /**
     * Gets the value of the prvsnlDvddRate property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAnd13DecimalAmount getPrvsnlDvddRate() {
        return prvsnlDvddRate;
    }

    /**
     * Sets the value of the prvsnlDvddRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RateDetails12 setPrvsnlDvddRate(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
        this.prvsnlDvddRate = value;
        return this;
    }

    /**
     * Gets the value of the aplblRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAplblRate() {
        return aplblRate;
    }

    /**
     * Sets the value of the aplblRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RateDetails12 setAplblRate(BigDecimal value) {
        this.aplblRate = value;
        return this;
    }

    /**
     * Gets the value of the slctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat18Choice }
     *     
     */
    public RateAndAmountFormat18Choice getSlctnFeeRate() {
        return slctnFeeRate;
    }

    /**
     * Sets the value of the slctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat18Choice }
     *     
     */
    public RateDetails12 setSlctnFeeRate(RateAndAmountFormat18Choice value) {
        this.slctnFeeRate = value;
        return this;
    }

    /**
     * Gets the value of the taxCdtRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCdtRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCdtRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCreditRateFormat3Choice }
     * 
     * 
     */
    public List<TaxCreditRateFormat3Choice> getTaxCdtRate() {
        if (taxCdtRate == null) {
            taxCdtRate = new ArrayList<TaxCreditRateFormat3Choice>();
        }
        return this.taxCdtRate;
    }

    /**
     * Gets the value of the taxRltdRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxRltdRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRltdRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateTypeAndAmountAndStatus10 }
     * 
     * 
     */
    public List<RateTypeAndAmountAndStatus10> getTaxRltdRate() {
        if (taxRltdRate == null) {
            taxRltdRate = new ArrayList<RateTypeAndAmountAndStatus10>();
        }
        return this.taxRltdRate;
    }

    /**
     * Gets the value of the whldgTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWhldgTaxRate() {
        return whldgTaxRate;
    }

    /**
     * Sets the value of the whldgTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RateDetails12 setWhldgTaxRate(BigDecimal value) {
        this.whldgTaxRate = value;
        return this;
    }

    /**
     * Gets the value of the taxOnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RateDetails12 setTaxOnIncm(BigDecimal value) {
        this.taxOnIncm = value;
        return this;
    }

    /**
     * Gets the value of the taxOnPrfts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxOnPrfts() {
        return taxOnPrfts;
    }

    /**
     * Sets the value of the taxOnPrfts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RateDetails12 setTaxOnPrfts(BigDecimal value) {
        this.taxOnPrfts = value;
        return this;
    }

    /**
     * Gets the value of the taxRclmRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRclmRate() {
        return taxRclmRate;
    }

    /**
     * Sets the value of the taxRclmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RateDetails12 setTaxRclmRate(BigDecimal value) {
        this.taxRclmRate = value;
        return this;
    }

    /**
     * Gets the value of the whldgOfFrgnTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public RateAndAmountFormat6Choice getWhldgOfFrgnTax() {
        return whldgOfFrgnTax;
    }

    /**
     * Sets the value of the whldgOfFrgnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public RateDetails12 setWhldgOfFrgnTax(RateAndAmountFormat6Choice value) {
        this.whldgOfFrgnTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgOfLclTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public RateAndAmountFormat6Choice getWhldgOfLclTax() {
        return whldgOfLclTax;
    }

    /**
     * Sets the value of the whldgOfLclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat6Choice }
     *     
     */
    public RateDetails12 setWhldgOfLclTax(RateAndAmountFormat6Choice value) {
        this.whldgOfLclTax = value;
        return this;
    }

    /**
     * Gets the value of the equlstnRate property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAnd13DecimalAmount getEqulstnRate() {
        return equlstnRate;
    }

    /**
     * Sets the value of the equlstnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RateDetails12 setEqulstnRate(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
        this.equlstnRate = value;
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
     * Adds a new item to the grssDvddRate list.
     * @see #getGrssDvddRate()
     * 
     */
    public RateDetails12 addGrssDvddRate(GrossDividendRateFormat12Choice grssDvddRate) {
        getGrssDvddRate().add(grssDvddRate);
        return this;
    }

    /**
     * Adds a new item to the intrstRateUsdForPmt list.
     * @see #getIntrstRateUsdForPmt()
     * 
     */
    public RateDetails12 addIntrstRateUsdForPmt(InterestRateUsedForPaymentFormat3Choice intrstRateUsdForPmt) {
        getIntrstRateUsdForPmt().add(intrstRateUsdForPmt);
        return this;
    }

    /**
     * Adds a new item to the netDvddRate list.
     * @see #getNetDvddRate()
     * 
     */
    public RateDetails12 addNetDvddRate(NetDividendRateFormat14Choice netDvddRate) {
        getNetDvddRate().add(netDvddRate);
        return this;
    }

    /**
     * Adds a new item to the taxCdtRate list.
     * @see #getTaxCdtRate()
     * 
     */
    public RateDetails12 addTaxCdtRate(TaxCreditRateFormat3Choice taxCdtRate) {
        getTaxCdtRate().add(taxCdtRate);
        return this;
    }

    /**
     * Adds a new item to the taxRltdRate list.
     * @see #getTaxRltdRate()
     * 
     */
    public RateDetails12 addTaxRltdRate(RateTypeAndAmountAndStatus10 taxRltdRate) {
        getTaxRltdRate().add(taxRltdRate);
        return this;
    }

}
