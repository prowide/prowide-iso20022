
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
 * Specifies rates related to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate5", propOrder = {
    "addtlTax",
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
    "taxCdtRate",
    "prratnRate",
    "slctnFeeRate",
    "earlySlctnFeeRate",
    "whldgTaxRate",
    "taxOnIncm",
    "taxOnPrfts",
    "taxRclmRate",
    "whldgOfFrgnTax",
    "whldgOfLclTax",
    "taxRltdRate",
    "aplblRate"
})
public class CorporateActionRate5 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat3Choice addtlTax;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat3Choice chrgsFees;
    @XmlElement(name = "FnlDvddRate")
    protected RateAndAmountFormat4Choice fnlDvddRate;
    @XmlElement(name = "FsclStmp")
    protected RateFormat2Choice fsclStmp;
    @XmlElement(name = "FullyFrnkdRate")
    protected RateAndAmountFormat3Choice fullyFrnkdRate;
    @XmlElement(name = "GrssDvddRate")
    protected List<GrossDividendRateFormat1Choice> grssDvddRate;
    @XmlElement(name = "CshIncntivRate")
    protected RateFormat2Choice cshIncntivRate;
    @XmlElement(name = "IndxFctr")
    protected RateAndAmountFormat3Choice indxFctr;
    @XmlElement(name = "IntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat1Choice> intrstRateUsdForPmt;
    @XmlElement(name = "NetDvddRate")
    protected List<NetDividendRateFormat1Choice> netDvddRate;
    @XmlElement(name = "NonResdtRate")
    protected RateAndAmountFormat3Choice nonResdtRate;
    @XmlElement(name = "MaxAllwdOvrsbcptRate")
    protected RateFormat2Choice maxAllwdOvrsbcptRate;
    @XmlElement(name = "PrvsnlDvddRate")
    protected RateAndAmountFormat4Choice prvsnlDvddRate;
    @XmlElement(name = "TaxCdtRate")
    protected List<TaxCreditRateFormat1Choice> taxCdtRate;
    @XmlElement(name = "PrratnRate")
    protected RateFormat2Choice prratnRate;
    @XmlElement(name = "SlctnFeeRate")
    protected SolicitationFeeRateFormat1Choice slctnFeeRate;
    @XmlElement(name = "EarlySlctnFeeRate")
    protected SolicitationFeeRateFormat1Choice earlySlctnFeeRate;
    @XmlElement(name = "WhldgTaxRate")
    protected RateFormat2Choice whldgTaxRate;
    @XmlElement(name = "TaxOnIncm")
    protected RateFormat2Choice taxOnIncm;
    @XmlElement(name = "TaxOnPrfts")
    protected RateFormat2Choice taxOnPrfts;
    @XmlElement(name = "TaxRclmRate")
    protected RateFormat2Choice taxRclmRate;
    @XmlElement(name = "WhldgOfFrgnTax")
    protected RateAndAmountFormat3Choice whldgOfFrgnTax;
    @XmlElement(name = "WhldgOfLclTax")
    protected RateAndAmountFormat3Choice whldgOfLclTax;
    @XmlElement(name = "TaxRltdRate")
    protected List<RateTypeAndAmountAndStatus6> taxRltdRate;
    @XmlElement(name = "AplblRate")
    protected RateFormat2Choice aplblRate;

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat3Choice }
     *     
     */
    public RateAndAmountFormat3Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat3Choice }
     *     
     */
    public CorporateActionRate5 setAddtlTax(RateAndAmountFormat3Choice value) {
        this.addtlTax = value;
        return this;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat3Choice }
     *     
     */
    public RateAndAmountFormat3Choice getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat3Choice }
     *     
     */
    public CorporateActionRate5 setChrgsFees(RateAndAmountFormat3Choice value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the fnlDvddRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat4Choice }
     *     
     */
    public RateAndAmountFormat4Choice getFnlDvddRate() {
        return fnlDvddRate;
    }

    /**
     * Sets the value of the fnlDvddRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat4Choice }
     *     
     */
    public CorporateActionRate5 setFnlDvddRate(RateAndAmountFormat4Choice value) {
        this.fnlDvddRate = value;
        return this;
    }

    /**
     * Gets the value of the fsclStmp property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat2Choice }
     *     
     */
    public RateFormat2Choice getFsclStmp() {
        return fsclStmp;
    }

    /**
     * Sets the value of the fsclStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat2Choice }
     *     
     */
    public CorporateActionRate5 setFsclStmp(RateFormat2Choice value) {
        this.fsclStmp = value;
        return this;
    }

    /**
     * Gets the value of the fullyFrnkdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat3Choice }
     *     
     */
    public RateAndAmountFormat3Choice getFullyFrnkdRate() {
        return fullyFrnkdRate;
    }

    /**
     * Sets the value of the fullyFrnkdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat3Choice }
     *     
     */
    public CorporateActionRate5 setFullyFrnkdRate(RateAndAmountFormat3Choice value) {
        this.fullyFrnkdRate = value;
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
     * {@link GrossDividendRateFormat1Choice }
     * 
     * 
     * @return
     *     The value of the grssDvddRate property.
     */
    public List<GrossDividendRateFormat1Choice> getGrssDvddRate() {
        if (grssDvddRate == null) {
            grssDvddRate = new ArrayList<>();
        }
        return this.grssDvddRate;
    }

    /**
     * Gets the value of the cshIncntivRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat2Choice }
     *     
     */
    public RateFormat2Choice getCshIncntivRate() {
        return cshIncntivRate;
    }

    /**
     * Sets the value of the cshIncntivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat2Choice }
     *     
     */
    public CorporateActionRate5 setCshIncntivRate(RateFormat2Choice value) {
        this.cshIncntivRate = value;
        return this;
    }

    /**
     * Gets the value of the indxFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat3Choice }
     *     
     */
    public RateAndAmountFormat3Choice getIndxFctr() {
        return indxFctr;
    }

    /**
     * Sets the value of the indxFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat3Choice }
     *     
     */
    public CorporateActionRate5 setIndxFctr(RateAndAmountFormat3Choice value) {
        this.indxFctr = value;
        return this;
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
     * {@link InterestRateUsedForPaymentFormat1Choice }
     * 
     * 
     * @return
     *     The value of the intrstRateUsdForPmt property.
     */
    public List<InterestRateUsedForPaymentFormat1Choice> getIntrstRateUsdForPmt() {
        if (intrstRateUsdForPmt == null) {
            intrstRateUsdForPmt = new ArrayList<>();
        }
        return this.intrstRateUsdForPmt;
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
     * {@link NetDividendRateFormat1Choice }
     * 
     * 
     * @return
     *     The value of the netDvddRate property.
     */
    public List<NetDividendRateFormat1Choice> getNetDvddRate() {
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
     *     {@link RateAndAmountFormat3Choice }
     *     
     */
    public RateAndAmountFormat3Choice getNonResdtRate() {
        return nonResdtRate;
    }

    /**
     * Sets the value of the nonResdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat3Choice }
     *     
     */
    public CorporateActionRate5 setNonResdtRate(RateAndAmountFormat3Choice value) {
        this.nonResdtRate = value;
        return this;
    }

    /**
     * Gets the value of the maxAllwdOvrsbcptRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat2Choice }
     *     
     */
    public RateFormat2Choice getMaxAllwdOvrsbcptRate() {
        return maxAllwdOvrsbcptRate;
    }

    /**
     * Sets the value of the maxAllwdOvrsbcptRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat2Choice }
     *     
     */
    public CorporateActionRate5 setMaxAllwdOvrsbcptRate(RateFormat2Choice value) {
        this.maxAllwdOvrsbcptRate = value;
        return this;
    }

    /**
     * Gets the value of the prvsnlDvddRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat4Choice }
     *     
     */
    public RateAndAmountFormat4Choice getPrvsnlDvddRate() {
        return prvsnlDvddRate;
    }

    /**
     * Sets the value of the prvsnlDvddRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat4Choice }
     *     
     */
    public CorporateActionRate5 setPrvsnlDvddRate(RateAndAmountFormat4Choice value) {
        this.prvsnlDvddRate = value;
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
     * {@link TaxCreditRateFormat1Choice }
     * 
     * 
     * @return
     *     The value of the taxCdtRate property.
     */
    public List<TaxCreditRateFormat1Choice> getTaxCdtRate() {
        if (taxCdtRate == null) {
            taxCdtRate = new ArrayList<>();
        }
        return this.taxCdtRate;
    }

    /**
     * Gets the value of the prratnRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat2Choice }
     *     
     */
    public RateFormat2Choice getPrratnRate() {
        return prratnRate;
    }

    /**
     * Sets the value of the prratnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat2Choice }
     *     
     */
    public CorporateActionRate5 setPrratnRate(RateFormat2Choice value) {
        this.prratnRate = value;
        return this;
    }

    /**
     * Gets the value of the slctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat1Choice }
     *     
     */
    public SolicitationFeeRateFormat1Choice getSlctnFeeRate() {
        return slctnFeeRate;
    }

    /**
     * Sets the value of the slctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat1Choice }
     *     
     */
    public CorporateActionRate5 setSlctnFeeRate(SolicitationFeeRateFormat1Choice value) {
        this.slctnFeeRate = value;
        return this;
    }

    /**
     * Gets the value of the earlySlctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat1Choice }
     *     
     */
    public SolicitationFeeRateFormat1Choice getEarlySlctnFeeRate() {
        return earlySlctnFeeRate;
    }

    /**
     * Sets the value of the earlySlctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat1Choice }
     *     
     */
    public CorporateActionRate5 setEarlySlctnFeeRate(SolicitationFeeRateFormat1Choice value) {
        this.earlySlctnFeeRate = value;
        return this;
    }

    /**
     * Gets the value of the whldgTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat2Choice }
     *     
     */
    public RateFormat2Choice getWhldgTaxRate() {
        return whldgTaxRate;
    }

    /**
     * Sets the value of the whldgTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat2Choice }
     *     
     */
    public CorporateActionRate5 setWhldgTaxRate(RateFormat2Choice value) {
        this.whldgTaxRate = value;
        return this;
    }

    /**
     * Gets the value of the taxOnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat2Choice }
     *     
     */
    public RateFormat2Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat2Choice }
     *     
     */
    public CorporateActionRate5 setTaxOnIncm(RateFormat2Choice value) {
        this.taxOnIncm = value;
        return this;
    }

    /**
     * Gets the value of the taxOnPrfts property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat2Choice }
     *     
     */
    public RateFormat2Choice getTaxOnPrfts() {
        return taxOnPrfts;
    }

    /**
     * Sets the value of the taxOnPrfts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat2Choice }
     *     
     */
    public CorporateActionRate5 setTaxOnPrfts(RateFormat2Choice value) {
        this.taxOnPrfts = value;
        return this;
    }

    /**
     * Gets the value of the taxRclmRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat2Choice }
     *     
     */
    public RateFormat2Choice getTaxRclmRate() {
        return taxRclmRate;
    }

    /**
     * Sets the value of the taxRclmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat2Choice }
     *     
     */
    public CorporateActionRate5 setTaxRclmRate(RateFormat2Choice value) {
        this.taxRclmRate = value;
        return this;
    }

    /**
     * Gets the value of the whldgOfFrgnTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat3Choice }
     *     
     */
    public RateAndAmountFormat3Choice getWhldgOfFrgnTax() {
        return whldgOfFrgnTax;
    }

    /**
     * Sets the value of the whldgOfFrgnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat3Choice }
     *     
     */
    public CorporateActionRate5 setWhldgOfFrgnTax(RateAndAmountFormat3Choice value) {
        this.whldgOfFrgnTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgOfLclTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat3Choice }
     *     
     */
    public RateAndAmountFormat3Choice getWhldgOfLclTax() {
        return whldgOfLclTax;
    }

    /**
     * Sets the value of the whldgOfLclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat3Choice }
     *     
     */
    public CorporateActionRate5 setWhldgOfLclTax(RateAndAmountFormat3Choice value) {
        this.whldgOfLclTax = value;
        return this;
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
     * {@link RateTypeAndAmountAndStatus6 }
     * 
     * 
     * @return
     *     The value of the taxRltdRate property.
     */
    public List<RateTypeAndAmountAndStatus6> getTaxRltdRate() {
        if (taxRltdRate == null) {
            taxRltdRate = new ArrayList<>();
        }
        return this.taxRltdRate;
    }

    /**
     * Gets the value of the aplblRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat2Choice }
     *     
     */
    public RateFormat2Choice getAplblRate() {
        return aplblRate;
    }

    /**
     * Sets the value of the aplblRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat2Choice }
     *     
     */
    public CorporateActionRate5 setAplblRate(RateFormat2Choice value) {
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
    public CorporateActionRate5 addGrssDvddRate(GrossDividendRateFormat1Choice grssDvddRate) {
        getGrssDvddRate().add(grssDvddRate);
        return this;
    }

    /**
     * Adds a new item to the intrstRateUsdForPmt list.
     * @see #getIntrstRateUsdForPmt()
     * 
     */
    public CorporateActionRate5 addIntrstRateUsdForPmt(InterestRateUsedForPaymentFormat1Choice intrstRateUsdForPmt) {
        getIntrstRateUsdForPmt().add(intrstRateUsdForPmt);
        return this;
    }

    /**
     * Adds a new item to the netDvddRate list.
     * @see #getNetDvddRate()
     * 
     */
    public CorporateActionRate5 addNetDvddRate(NetDividendRateFormat1Choice netDvddRate) {
        getNetDvddRate().add(netDvddRate);
        return this;
    }

    /**
     * Adds a new item to the taxCdtRate list.
     * @see #getTaxCdtRate()
     * 
     */
    public CorporateActionRate5 addTaxCdtRate(TaxCreditRateFormat1Choice taxCdtRate) {
        getTaxCdtRate().add(taxCdtRate);
        return this;
    }

    /**
     * Adds a new item to the taxRltdRate list.
     * @see #getTaxRltdRate()
     * 
     */
    public CorporateActionRate5 addTaxRltdRate(RateTypeAndAmountAndStatus6 taxRltdRate) {
        getTaxRltdRate().add(taxRltdRate);
        return this;
    }

}
