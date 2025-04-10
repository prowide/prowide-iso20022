
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides information about the rates related to securities movement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateDetails18", propOrder = {
    "addtlTax",
    "grssDvddRate",
    "intrstRateUsdForPmt",
    "taxRltdRate",
    "whldgTaxRate",
    "chrgsFees",
    "earlySlctnFeeRate",
    "fnlDvddRate",
    "fsclStmp",
    "fullyFrnkdRate",
    "thrdPtyIncntivRate",
    "netDvddRate",
    "nonResdtRate",
    "prvsnlDvddRate",
    "aplblRate",
    "slctnFeeRate",
    "taxCdtRate",
    "taxOnIncm",
    "taxOnPrfts",
    "taxRclmRate",
    "whldgOfFrgnTax",
    "whldgOfLclTax",
    "equlstnRate"
})
public class RateDetails18 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat16Choice addtlTax;
    @XmlElement(name = "GrssDvddRate")
    protected List<GrossDividendRateFormat14Choice> grssDvddRate;
    @XmlElement(name = "IntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat6Choice> intrstRateUsdForPmt;
    @XmlElement(name = "TaxRltdRate")
    protected List<RateTypeAndAmountAndStatus10> taxRltdRate;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateFormat14Choice> whldgTaxRate;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat16Choice chrgsFees;
    @XmlElement(name = "EarlySlctnFeeRate")
    protected SolicitationFeeRateFormat6Choice earlySlctnFeeRate;
    @XmlElement(name = "FnlDvddRate")
    protected RateAndAmountFormat17Choice fnlDvddRate;
    @XmlElement(name = "FsclStmp")
    protected RateFormat3Choice fsclStmp;
    @XmlElement(name = "FullyFrnkdRate")
    protected RateAndAmountFormat16Choice fullyFrnkdRate;
    @XmlElement(name = "ThrdPtyIncntivRate")
    protected RateFormat9Choice thrdPtyIncntivRate;
    @XmlElement(name = "NetDvddRate")
    protected List<NetDividendRateFormat16Choice> netDvddRate;
    @XmlElement(name = "NonResdtRate")
    protected RateAndAmountFormat16Choice nonResdtRate;
    @XmlElement(name = "PrvsnlDvddRate")
    protected RateAndAmountFormat17Choice prvsnlDvddRate;
    @XmlElement(name = "AplblRate")
    protected RateFormat3Choice aplblRate;
    @XmlElement(name = "SlctnFeeRate")
    protected SolicitationFeeRateFormat6Choice slctnFeeRate;
    @XmlElement(name = "TaxCdtRate")
    protected List<TaxCreditRateFormat6Choice> taxCdtRate;
    @XmlElement(name = "TaxOnIncm")
    protected RateAndAmountFormat16Choice taxOnIncm;
    @XmlElement(name = "TaxOnPrfts")
    protected RateFormat3Choice taxOnPrfts;
    @XmlElement(name = "TaxRclmRate")
    protected RateFormat3Choice taxRclmRate;
    @XmlElement(name = "WhldgOfFrgnTax")
    protected List<RateAndAmountFormat30Choice> whldgOfFrgnTax;
    @XmlElement(name = "WhldgOfLclTax")
    protected List<RateAndAmountFormat30Choice> whldgOfLclTax;
    @XmlElement(name = "EqulstnRate")
    protected RateAndAmountFormat17Choice equlstnRate;

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public RateAndAmountFormat16Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public RateDetails18 setAddtlTax(RateAndAmountFormat16Choice value) {
        this.addtlTax = value;
        return this;
    }

    /**
     * Gets the value of the grssDvddRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the grssDvddRate property.
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
     * {@link GrossDividendRateFormat14Choice }
     * 
     * 
     * @return
     *     The value of the grssDvddRate property.
     */
    public List<GrossDividendRateFormat14Choice> getGrssDvddRate() {
        if (grssDvddRate == null) {
            grssDvddRate = new ArrayList<>();
        }
        return this.grssDvddRate;
    }

    /**
     * Gets the value of the intrstRateUsdForPmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrstRateUsdForPmt property.
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
     * {@link InterestRateUsedForPaymentFormat6Choice }
     * 
     * 
     * @return
     *     The value of the intrstRateUsdForPmt property.
     */
    public List<InterestRateUsedForPaymentFormat6Choice> getIntrstRateUsdForPmt() {
        if (intrstRateUsdForPmt == null) {
            intrstRateUsdForPmt = new ArrayList<>();
        }
        return this.intrstRateUsdForPmt;
    }

    /**
     * Gets the value of the taxRltdRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxRltdRate property.
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
     * @return
     *     The value of the taxRltdRate property.
     */
    public List<RateTypeAndAmountAndStatus10> getTaxRltdRate() {
        if (taxRltdRate == null) {
            taxRltdRate = new ArrayList<>();
        }
        return this.taxRltdRate;
    }

    /**
     * Gets the value of the whldgTaxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the whldgTaxRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhldgTaxRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateFormat14Choice }
     * 
     * 
     * @return
     *     The value of the whldgTaxRate property.
     */
    public List<RateFormat14Choice> getWhldgTaxRate() {
        if (whldgTaxRate == null) {
            whldgTaxRate = new ArrayList<>();
        }
        return this.whldgTaxRate;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public RateAndAmountFormat16Choice getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public RateDetails18 setChrgsFees(RateAndAmountFormat16Choice value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the earlySlctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat6Choice }
     *     
     */
    public SolicitationFeeRateFormat6Choice getEarlySlctnFeeRate() {
        return earlySlctnFeeRate;
    }

    /**
     * Sets the value of the earlySlctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat6Choice }
     *     
     */
    public RateDetails18 setEarlySlctnFeeRate(SolicitationFeeRateFormat6Choice value) {
        this.earlySlctnFeeRate = value;
        return this;
    }

    /**
     * Gets the value of the fnlDvddRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat17Choice }
     *     
     */
    public RateAndAmountFormat17Choice getFnlDvddRate() {
        return fnlDvddRate;
    }

    /**
     * Sets the value of the fnlDvddRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat17Choice }
     *     
     */
    public RateDetails18 setFnlDvddRate(RateAndAmountFormat17Choice value) {
        this.fnlDvddRate = value;
        return this;
    }

    /**
     * Gets the value of the fsclStmp property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getFsclStmp() {
        return fsclStmp;
    }

    /**
     * Sets the value of the fsclStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateDetails18 setFsclStmp(RateFormat3Choice value) {
        this.fsclStmp = value;
        return this;
    }

    /**
     * Gets the value of the fullyFrnkdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public RateAndAmountFormat16Choice getFullyFrnkdRate() {
        return fullyFrnkdRate;
    }

    /**
     * Sets the value of the fullyFrnkdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public RateDetails18 setFullyFrnkdRate(RateAndAmountFormat16Choice value) {
        this.fullyFrnkdRate = value;
        return this;
    }

    /**
     * Gets the value of the thrdPtyIncntivRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat9Choice }
     *     
     */
    public RateFormat9Choice getThrdPtyIncntivRate() {
        return thrdPtyIncntivRate;
    }

    /**
     * Sets the value of the thrdPtyIncntivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat9Choice }
     *     
     */
    public RateDetails18 setThrdPtyIncntivRate(RateFormat9Choice value) {
        this.thrdPtyIncntivRate = value;
        return this;
    }

    /**
     * Gets the value of the netDvddRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the netDvddRate property.
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
     * {@link NetDividendRateFormat16Choice }
     * 
     * 
     * @return
     *     The value of the netDvddRate property.
     */
    public List<NetDividendRateFormat16Choice> getNetDvddRate() {
        if (netDvddRate == null) {
            netDvddRate = new ArrayList<>();
        }
        return this.netDvddRate;
    }

    /**
     * Gets the value of the nonResdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public RateAndAmountFormat16Choice getNonResdtRate() {
        return nonResdtRate;
    }

    /**
     * Sets the value of the nonResdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public RateDetails18 setNonResdtRate(RateAndAmountFormat16Choice value) {
        this.nonResdtRate = value;
        return this;
    }

    /**
     * Gets the value of the prvsnlDvddRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat17Choice }
     *     
     */
    public RateAndAmountFormat17Choice getPrvsnlDvddRate() {
        return prvsnlDvddRate;
    }

    /**
     * Sets the value of the prvsnlDvddRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat17Choice }
     *     
     */
    public RateDetails18 setPrvsnlDvddRate(RateAndAmountFormat17Choice value) {
        this.prvsnlDvddRate = value;
        return this;
    }

    /**
     * Gets the value of the aplblRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getAplblRate() {
        return aplblRate;
    }

    /**
     * Sets the value of the aplblRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateDetails18 setAplblRate(RateFormat3Choice value) {
        this.aplblRate = value;
        return this;
    }

    /**
     * Gets the value of the slctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat6Choice }
     *     
     */
    public SolicitationFeeRateFormat6Choice getSlctnFeeRate() {
        return slctnFeeRate;
    }

    /**
     * Sets the value of the slctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat6Choice }
     *     
     */
    public RateDetails18 setSlctnFeeRate(SolicitationFeeRateFormat6Choice value) {
        this.slctnFeeRate = value;
        return this;
    }

    /**
     * Gets the value of the taxCdtRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxCdtRate property.
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
     * {@link TaxCreditRateFormat6Choice }
     * 
     * 
     * @return
     *     The value of the taxCdtRate property.
     */
    public List<TaxCreditRateFormat6Choice> getTaxCdtRate() {
        if (taxCdtRate == null) {
            taxCdtRate = new ArrayList<>();
        }
        return this.taxCdtRate;
    }

    /**
     * Gets the value of the taxOnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public RateAndAmountFormat16Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public RateDetails18 setTaxOnIncm(RateAndAmountFormat16Choice value) {
        this.taxOnIncm = value;
        return this;
    }

    /**
     * Gets the value of the taxOnPrfts property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getTaxOnPrfts() {
        return taxOnPrfts;
    }

    /**
     * Sets the value of the taxOnPrfts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateDetails18 setTaxOnPrfts(RateFormat3Choice value) {
        this.taxOnPrfts = value;
        return this;
    }

    /**
     * Gets the value of the taxRclmRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getTaxRclmRate() {
        return taxRclmRate;
    }

    /**
     * Sets the value of the taxRclmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateDetails18 setTaxRclmRate(RateFormat3Choice value) {
        this.taxRclmRate = value;
        return this;
    }

    /**
     * Gets the value of the whldgOfFrgnTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the whldgOfFrgnTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhldgOfFrgnTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat30Choice }
     * 
     * 
     * @return
     *     The value of the whldgOfFrgnTax property.
     */
    public List<RateAndAmountFormat30Choice> getWhldgOfFrgnTax() {
        if (whldgOfFrgnTax == null) {
            whldgOfFrgnTax = new ArrayList<>();
        }
        return this.whldgOfFrgnTax;
    }

    /**
     * Gets the value of the whldgOfLclTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the whldgOfLclTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhldgOfLclTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat30Choice }
     * 
     * 
     * @return
     *     The value of the whldgOfLclTax property.
     */
    public List<RateAndAmountFormat30Choice> getWhldgOfLclTax() {
        if (whldgOfLclTax == null) {
            whldgOfLclTax = new ArrayList<>();
        }
        return this.whldgOfLclTax;
    }

    /**
     * Gets the value of the equlstnRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat17Choice }
     *     
     */
    public RateAndAmountFormat17Choice getEqulstnRate() {
        return equlstnRate;
    }

    /**
     * Sets the value of the equlstnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat17Choice }
     *     
     */
    public RateDetails18 setEqulstnRate(RateAndAmountFormat17Choice value) {
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
    public RateDetails18 addGrssDvddRate(GrossDividendRateFormat14Choice grssDvddRate) {
        getGrssDvddRate().add(grssDvddRate);
        return this;
    }

    /**
     * Adds a new item to the intrstRateUsdForPmt list.
     * @see #getIntrstRateUsdForPmt()
     * 
     */
    public RateDetails18 addIntrstRateUsdForPmt(InterestRateUsedForPaymentFormat6Choice intrstRateUsdForPmt) {
        getIntrstRateUsdForPmt().add(intrstRateUsdForPmt);
        return this;
    }

    /**
     * Adds a new item to the taxRltdRate list.
     * @see #getTaxRltdRate()
     * 
     */
    public RateDetails18 addTaxRltdRate(RateTypeAndAmountAndStatus10 taxRltdRate) {
        getTaxRltdRate().add(taxRltdRate);
        return this;
    }

    /**
     * Adds a new item to the whldgTaxRate list.
     * @see #getWhldgTaxRate()
     * 
     */
    public RateDetails18 addWhldgTaxRate(RateFormat14Choice whldgTaxRate) {
        getWhldgTaxRate().add(whldgTaxRate);
        return this;
    }

    /**
     * Adds a new item to the netDvddRate list.
     * @see #getNetDvddRate()
     * 
     */
    public RateDetails18 addNetDvddRate(NetDividendRateFormat16Choice netDvddRate) {
        getNetDvddRate().add(netDvddRate);
        return this;
    }

    /**
     * Adds a new item to the taxCdtRate list.
     * @see #getTaxCdtRate()
     * 
     */
    public RateDetails18 addTaxCdtRate(TaxCreditRateFormat6Choice taxCdtRate) {
        getTaxCdtRate().add(taxCdtRate);
        return this;
    }

    /**
     * Adds a new item to the whldgOfFrgnTax list.
     * @see #getWhldgOfFrgnTax()
     * 
     */
    public RateDetails18 addWhldgOfFrgnTax(RateAndAmountFormat30Choice whldgOfFrgnTax) {
        getWhldgOfFrgnTax().add(whldgOfFrgnTax);
        return this;
    }

    /**
     * Adds a new item to the whldgOfLclTax list.
     * @see #getWhldgOfLclTax()
     * 
     */
    public RateDetails18 addWhldgOfLclTax(RateAndAmountFormat30Choice whldgOfLclTax) {
        getWhldgOfLclTax().add(whldgOfLclTax);
        return this;
    }

}
