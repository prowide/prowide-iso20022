
package com.prowidesoftware.swift.model.mx.dic;

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
@XmlType(name = "RateDetails5", propOrder = {
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
    "cshIncntivRate",
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
    "whldgOfLclTax"
})
public class RateDetails5 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat16Choice addtlTax;
    @XmlElement(name = "GrssDvddRate")
    protected List<GrossDividendRateFormat6Choice> grssDvddRate;
    @XmlElement(name = "IntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat6Choice> intrstRateUsdForPmt;
    @XmlElement(name = "TaxRltdRate")
    protected List<RateTypeAndAmountAndStatus10> taxRltdRate;
    @XmlElement(name = "WhldgTaxRate")
    protected RateFormat6Choice whldgTaxRate;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat16Choice chrgsFees;
    @XmlElement(name = "EarlySlctnFeeRate")
    protected SolicitationFeeRateFormat4Choice earlySlctnFeeRate;
    @XmlElement(name = "FnlDvddRate")
    protected RateAndAmountFormat17Choice fnlDvddRate;
    @XmlElement(name = "FsclStmp")
    protected RateFormat6Choice fsclStmp;
    @XmlElement(name = "FullyFrnkdRate")
    protected RateAndAmountFormat16Choice fullyFrnkdRate;
    @XmlElement(name = "CshIncntivRate")
    protected RateFormat6Choice cshIncntivRate;
    @XmlElement(name = "NetDvddRate")
    protected List<NetDividendRateFormat6Choice> netDvddRate;
    @XmlElement(name = "NonResdtRate")
    protected RateAndAmountFormat16Choice nonResdtRate;
    @XmlElement(name = "PrvsnlDvddRate")
    protected RateAndAmountFormat17Choice prvsnlDvddRate;
    @XmlElement(name = "AplblRate")
    protected RateFormat6Choice aplblRate;
    @XmlElement(name = "SlctnFeeRate")
    protected SolicitationFeeRateFormat4Choice slctnFeeRate;
    @XmlElement(name = "TaxCdtRate")
    protected List<TaxCreditRateFormat6Choice> taxCdtRate;
    @XmlElement(name = "TaxOnIncm")
    protected RateFormat6Choice taxOnIncm;
    @XmlElement(name = "TaxOnPrfts")
    protected RateFormat6Choice taxOnPrfts;
    @XmlElement(name = "TaxRclmRate")
    protected RateFormat6Choice taxRclmRate;
    @XmlElement(name = "WhldgOfFrgnTax")
    protected RateAndAmountFormat16Choice whldgOfFrgnTax;
    @XmlElement(name = "WhldgOfLclTax")
    protected RateAndAmountFormat16Choice whldgOfLclTax;

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
    public RateDetails5 setAddtlTax(RateAndAmountFormat16Choice value) {
        this.addtlTax = value;
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
     * {@link GrossDividendRateFormat6Choice }
     * 
     * 
     */
    public List<GrossDividendRateFormat6Choice> getGrssDvddRate() {
        if (grssDvddRate == null) {
            grssDvddRate = new ArrayList<GrossDividendRateFormat6Choice>();
        }
        return this.grssDvddRate;
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
     * {@link InterestRateUsedForPaymentFormat6Choice }
     * 
     * 
     */
    public List<InterestRateUsedForPaymentFormat6Choice> getIntrstRateUsdForPmt() {
        if (intrstRateUsdForPmt == null) {
            intrstRateUsdForPmt = new ArrayList<InterestRateUsedForPaymentFormat6Choice>();
        }
        return this.intrstRateUsdForPmt;
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
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getWhldgTaxRate() {
        return whldgTaxRate;
    }

    /**
     * Sets the value of the whldgTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateDetails5 setWhldgTaxRate(RateFormat6Choice value) {
        this.whldgTaxRate = value;
        return this;
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
    public RateDetails5 setChrgsFees(RateAndAmountFormat16Choice value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the earlySlctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat4Choice }
     *     
     */
    public SolicitationFeeRateFormat4Choice getEarlySlctnFeeRate() {
        return earlySlctnFeeRate;
    }

    /**
     * Sets the value of the earlySlctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat4Choice }
     *     
     */
    public RateDetails5 setEarlySlctnFeeRate(SolicitationFeeRateFormat4Choice value) {
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
    public RateDetails5 setFnlDvddRate(RateAndAmountFormat17Choice value) {
        this.fnlDvddRate = value;
        return this;
    }

    /**
     * Gets the value of the fsclStmp property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getFsclStmp() {
        return fsclStmp;
    }

    /**
     * Sets the value of the fsclStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateDetails5 setFsclStmp(RateFormat6Choice value) {
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
    public RateDetails5 setFullyFrnkdRate(RateAndAmountFormat16Choice value) {
        this.fullyFrnkdRate = value;
        return this;
    }

    /**
     * Gets the value of the cshIncntivRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getCshIncntivRate() {
        return cshIncntivRate;
    }

    /**
     * Sets the value of the cshIncntivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateDetails5 setCshIncntivRate(RateFormat6Choice value) {
        this.cshIncntivRate = value;
        return this;
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
     * {@link NetDividendRateFormat6Choice }
     * 
     * 
     */
    public List<NetDividendRateFormat6Choice> getNetDvddRate() {
        if (netDvddRate == null) {
            netDvddRate = new ArrayList<NetDividendRateFormat6Choice>();
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
    public RateDetails5 setNonResdtRate(RateAndAmountFormat16Choice value) {
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
    public RateDetails5 setPrvsnlDvddRate(RateAndAmountFormat17Choice value) {
        this.prvsnlDvddRate = value;
        return this;
    }

    /**
     * Gets the value of the aplblRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getAplblRate() {
        return aplblRate;
    }

    /**
     * Sets the value of the aplblRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateDetails5 setAplblRate(RateFormat6Choice value) {
        this.aplblRate = value;
        return this;
    }

    /**
     * Gets the value of the slctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat4Choice }
     *     
     */
    public SolicitationFeeRateFormat4Choice getSlctnFeeRate() {
        return slctnFeeRate;
    }

    /**
     * Sets the value of the slctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat4Choice }
     *     
     */
    public RateDetails5 setSlctnFeeRate(SolicitationFeeRateFormat4Choice value) {
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
     * {@link TaxCreditRateFormat6Choice }
     * 
     * 
     */
    public List<TaxCreditRateFormat6Choice> getTaxCdtRate() {
        if (taxCdtRate == null) {
            taxCdtRate = new ArrayList<TaxCreditRateFormat6Choice>();
        }
        return this.taxCdtRate;
    }

    /**
     * Gets the value of the taxOnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateDetails5 setTaxOnIncm(RateFormat6Choice value) {
        this.taxOnIncm = value;
        return this;
    }

    /**
     * Gets the value of the taxOnPrfts property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getTaxOnPrfts() {
        return taxOnPrfts;
    }

    /**
     * Sets the value of the taxOnPrfts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateDetails5 setTaxOnPrfts(RateFormat6Choice value) {
        this.taxOnPrfts = value;
        return this;
    }

    /**
     * Gets the value of the taxRclmRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getTaxRclmRate() {
        return taxRclmRate;
    }

    /**
     * Sets the value of the taxRclmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateDetails5 setTaxRclmRate(RateFormat6Choice value) {
        this.taxRclmRate = value;
        return this;
    }

    /**
     * Gets the value of the whldgOfFrgnTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public RateAndAmountFormat16Choice getWhldgOfFrgnTax() {
        return whldgOfFrgnTax;
    }

    /**
     * Sets the value of the whldgOfFrgnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public RateDetails5 setWhldgOfFrgnTax(RateAndAmountFormat16Choice value) {
        this.whldgOfFrgnTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgOfLclTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public RateAndAmountFormat16Choice getWhldgOfLclTax() {
        return whldgOfLclTax;
    }

    /**
     * Sets the value of the whldgOfLclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat16Choice }
     *     
     */
    public RateDetails5 setWhldgOfLclTax(RateAndAmountFormat16Choice value) {
        this.whldgOfLclTax = value;
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
    public RateDetails5 addGrssDvddRate(GrossDividendRateFormat6Choice grssDvddRate) {
        getGrssDvddRate().add(grssDvddRate);
        return this;
    }

    /**
     * Adds a new item to the intrstRateUsdForPmt list.
     * @see #getIntrstRateUsdForPmt()
     * 
     */
    public RateDetails5 addIntrstRateUsdForPmt(InterestRateUsedForPaymentFormat6Choice intrstRateUsdForPmt) {
        getIntrstRateUsdForPmt().add(intrstRateUsdForPmt);
        return this;
    }

    /**
     * Adds a new item to the taxRltdRate list.
     * @see #getTaxRltdRate()
     * 
     */
    public RateDetails5 addTaxRltdRate(RateTypeAndAmountAndStatus10 taxRltdRate) {
        getTaxRltdRate().add(taxRltdRate);
        return this;
    }

    /**
     * Adds a new item to the netDvddRate list.
     * @see #getNetDvddRate()
     * 
     */
    public RateDetails5 addNetDvddRate(NetDividendRateFormat6Choice netDvddRate) {
        getNetDvddRate().add(netDvddRate);
        return this;
    }

    /**
     * Adds a new item to the taxCdtRate list.
     * @see #getTaxCdtRate()
     * 
     */
    public RateDetails5 addTaxCdtRate(TaxCreditRateFormat6Choice taxCdtRate) {
        getTaxCdtRate().add(taxCdtRate);
        return this;
    }

}
