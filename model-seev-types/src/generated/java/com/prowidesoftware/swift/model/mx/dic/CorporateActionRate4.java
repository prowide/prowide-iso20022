
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
 * Specifies rates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate4", propOrder = {
    "chrgsFees",
    "fnlDvddRate",
    "fsclStmp",
    "fullyFrnkdRate",
    "grssDvddRate",
    "cshIncntivRate",
    "indxFctr",
    "intrstRateUsdForPmt",
    "netDvddRate",
    "nonResdtRate",
    "maxAllwdOvrsbcptRate",
    "prvsnlDvddRate",
    "prratnRate",
    "slctnFeeRate",
    "taxCdtRate",
    "taxRltdRate",
    "whldgTaxRate",
    "taxOnIncm",
    "taxOnPrfts",
    "taxRclmRate",
    "whldgOfFrgnTax",
    "whldgOfLclTax",
    "addtlTax",
    "aplblRate"
})
public class CorporateActionRate4 {

    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat5Choice chrgsFees;
    @XmlElement(name = "FnlDvddRate")
    protected ActiveCurrencyAnd13DecimalAmount fnlDvddRate;
    @XmlElement(name = "FsclStmp")
    protected BigDecimal fsclStmp;
    @XmlElement(name = "FullyFrnkdRate")
    protected RateAndAmountFormat5Choice fullyFrnkdRate;
    @XmlElement(name = "GrssDvddRate")
    protected List<GrossDividendRateFormat2Choice> grssDvddRate;
    @XmlElement(name = "CshIncntivRate")
    protected BigDecimal cshIncntivRate;
    @XmlElement(name = "IndxFctr")
    protected RateAndAmountFormat5Choice indxFctr;
    @XmlElement(name = "IntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat2Choice> intrstRateUsdForPmt;
    @XmlElement(name = "NetDvddRate")
    protected List<NetDividendRateFormat2Choice> netDvddRate;
    @XmlElement(name = "NonResdtRate")
    protected RateAndAmountFormat5Choice nonResdtRate;
    @XmlElement(name = "MaxAllwdOvrsbcptRate")
    protected BigDecimal maxAllwdOvrsbcptRate;
    @XmlElement(name = "PrvsnlDvddRate")
    protected ActiveCurrencyAnd13DecimalAmount prvsnlDvddRate;
    @XmlElement(name = "PrratnRate")
    protected BigDecimal prratnRate;
    @XmlElement(name = "SlctnFeeRate")
    protected BigDecimal slctnFeeRate;
    @XmlElement(name = "TaxCdtRate")
    protected List<TaxCreditRateFormat2Choice> taxCdtRate;
    @XmlElement(name = "TaxRltdRate")
    protected List<RateTypeAndAmountAndStatus6> taxRltdRate;
    @XmlElement(name = "WhldgTaxRate")
    protected BigDecimal whldgTaxRate;
    @XmlElement(name = "TaxOnIncm")
    protected BigDecimal taxOnIncm;
    @XmlElement(name = "TaxOnPrfts")
    protected BigDecimal taxOnPrfts;
    @XmlElement(name = "TaxRclmRate")
    protected BigDecimal taxRclmRate;
    @XmlElement(name = "WhldgOfFrgnTax")
    protected RateAndAmountFormat5Choice whldgOfFrgnTax;
    @XmlElement(name = "WhldgOfLclTax")
    protected RateAndAmountFormat5Choice whldgOfLclTax;
    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat5Choice addtlTax;
    @XmlElement(name = "AplblRate")
    protected BigDecimal aplblRate;

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public RateAndAmountFormat5Choice getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public CorporateActionRate4 setChrgsFees(RateAndAmountFormat5Choice value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the fnlDvddRate property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getFnlDvddRate() {
        return fnlDvddRate;
    }

    /**
     * Sets the value of the fnlDvddRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public CorporateActionRate4 setFnlDvddRate(ActiveCurrencyAnd13DecimalAmount value) {
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
    public CorporateActionRate4 setFsclStmp(BigDecimal value) {
        this.fsclStmp = value;
        return this;
    }

    /**
     * Gets the value of the fullyFrnkdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public RateAndAmountFormat5Choice getFullyFrnkdRate() {
        return fullyFrnkdRate;
    }

    /**
     * Sets the value of the fullyFrnkdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public CorporateActionRate4 setFullyFrnkdRate(RateAndAmountFormat5Choice value) {
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
     * {@link GrossDividendRateFormat2Choice }
     * 
     * 
     */
    public List<GrossDividendRateFormat2Choice> getGrssDvddRate() {
        if (grssDvddRate == null) {
            grssDvddRate = new ArrayList<GrossDividendRateFormat2Choice>();
        }
        return this.grssDvddRate;
    }

    /**
     * Gets the value of the cshIncntivRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCshIncntivRate() {
        return cshIncntivRate;
    }

    /**
     * Sets the value of the cshIncntivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRate4 setCshIncntivRate(BigDecimal value) {
        this.cshIncntivRate = value;
        return this;
    }

    /**
     * Gets the value of the indxFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public RateAndAmountFormat5Choice getIndxFctr() {
        return indxFctr;
    }

    /**
     * Sets the value of the indxFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public CorporateActionRate4 setIndxFctr(RateAndAmountFormat5Choice value) {
        this.indxFctr = value;
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
     * {@link InterestRateUsedForPaymentFormat2Choice }
     * 
     * 
     */
    public List<InterestRateUsedForPaymentFormat2Choice> getIntrstRateUsdForPmt() {
        if (intrstRateUsdForPmt == null) {
            intrstRateUsdForPmt = new ArrayList<InterestRateUsedForPaymentFormat2Choice>();
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
     * {@link NetDividendRateFormat2Choice }
     * 
     * 
     */
    public List<NetDividendRateFormat2Choice> getNetDvddRate() {
        if (netDvddRate == null) {
            netDvddRate = new ArrayList<NetDividendRateFormat2Choice>();
        }
        return this.netDvddRate;
    }

    /**
     * Gets the value of the nonResdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public RateAndAmountFormat5Choice getNonResdtRate() {
        return nonResdtRate;
    }

    /**
     * Sets the value of the nonResdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public CorporateActionRate4 setNonResdtRate(RateAndAmountFormat5Choice value) {
        this.nonResdtRate = value;
        return this;
    }

    /**
     * Gets the value of the maxAllwdOvrsbcptRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAllwdOvrsbcptRate() {
        return maxAllwdOvrsbcptRate;
    }

    /**
     * Sets the value of the maxAllwdOvrsbcptRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRate4 setMaxAllwdOvrsbcptRate(BigDecimal value) {
        this.maxAllwdOvrsbcptRate = value;
        return this;
    }

    /**
     * Gets the value of the prvsnlDvddRate property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getPrvsnlDvddRate() {
        return prvsnlDvddRate;
    }

    /**
     * Sets the value of the prvsnlDvddRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public CorporateActionRate4 setPrvsnlDvddRate(ActiveCurrencyAnd13DecimalAmount value) {
        this.prvsnlDvddRate = value;
        return this;
    }

    /**
     * Gets the value of the prratnRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrratnRate() {
        return prratnRate;
    }

    /**
     * Sets the value of the prratnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRate4 setPrratnRate(BigDecimal value) {
        this.prratnRate = value;
        return this;
    }

    /**
     * Gets the value of the slctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSlctnFeeRate() {
        return slctnFeeRate;
    }

    /**
     * Sets the value of the slctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRate4 setSlctnFeeRate(BigDecimal value) {
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
     * {@link TaxCreditRateFormat2Choice }
     * 
     * 
     */
    public List<TaxCreditRateFormat2Choice> getTaxCdtRate() {
        if (taxCdtRate == null) {
            taxCdtRate = new ArrayList<TaxCreditRateFormat2Choice>();
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
     * {@link RateTypeAndAmountAndStatus6 }
     * 
     * 
     */
    public List<RateTypeAndAmountAndStatus6> getTaxRltdRate() {
        if (taxRltdRate == null) {
            taxRltdRate = new ArrayList<RateTypeAndAmountAndStatus6>();
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
    public CorporateActionRate4 setWhldgTaxRate(BigDecimal value) {
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
    public CorporateActionRate4 setTaxOnIncm(BigDecimal value) {
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
    public CorporateActionRate4 setTaxOnPrfts(BigDecimal value) {
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
    public CorporateActionRate4 setTaxRclmRate(BigDecimal value) {
        this.taxRclmRate = value;
        return this;
    }

    /**
     * Gets the value of the whldgOfFrgnTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public RateAndAmountFormat5Choice getWhldgOfFrgnTax() {
        return whldgOfFrgnTax;
    }

    /**
     * Sets the value of the whldgOfFrgnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public CorporateActionRate4 setWhldgOfFrgnTax(RateAndAmountFormat5Choice value) {
        this.whldgOfFrgnTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgOfLclTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public RateAndAmountFormat5Choice getWhldgOfLclTax() {
        return whldgOfLclTax;
    }

    /**
     * Sets the value of the whldgOfLclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public CorporateActionRate4 setWhldgOfLclTax(RateAndAmountFormat5Choice value) {
        this.whldgOfLclTax = value;
        return this;
    }

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public RateAndAmountFormat5Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat5Choice }
     *     
     */
    public CorporateActionRate4 setAddtlTax(RateAndAmountFormat5Choice value) {
        this.addtlTax = value;
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
    public CorporateActionRate4 setAplblRate(BigDecimal value) {
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

    /**
     * Adds a new item to the grssDvddRate list.
     * @see #getGrssDvddRate()
     * 
     */
    public CorporateActionRate4 addGrssDvddRate(GrossDividendRateFormat2Choice grssDvddRate) {
        getGrssDvddRate().add(grssDvddRate);
        return this;
    }

    /**
     * Adds a new item to the intrstRateUsdForPmt list.
     * @see #getIntrstRateUsdForPmt()
     * 
     */
    public CorporateActionRate4 addIntrstRateUsdForPmt(InterestRateUsedForPaymentFormat2Choice intrstRateUsdForPmt) {
        getIntrstRateUsdForPmt().add(intrstRateUsdForPmt);
        return this;
    }

    /**
     * Adds a new item to the netDvddRate list.
     * @see #getNetDvddRate()
     * 
     */
    public CorporateActionRate4 addNetDvddRate(NetDividendRateFormat2Choice netDvddRate) {
        getNetDvddRate().add(netDvddRate);
        return this;
    }

    /**
     * Adds a new item to the taxCdtRate list.
     * @see #getTaxCdtRate()
     * 
     */
    public CorporateActionRate4 addTaxCdtRate(TaxCreditRateFormat2Choice taxCdtRate) {
        getTaxCdtRate().add(taxCdtRate);
        return this;
    }

    /**
     * Adds a new item to the taxRltdRate list.
     * @see #getTaxRltdRate()
     * 
     */
    public CorporateActionRate4 addTaxRltdRate(RateTypeAndAmountAndStatus6 taxRltdRate) {
        getTaxRltdRate().add(taxRltdRate);
        return this;
    }

}
