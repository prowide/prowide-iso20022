
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
@XmlType(name = "RateDetails25", propOrder = {
    "addtlTax",
    "grssDvddRate",
    "intrstRateUsdForPmt",
    "whldgTaxRate",
    "scndLvlTax",
    "chrgsFees",
    "earlySlctnFeeRate",
    "fsclStmp",
    "fullyFrnkdRate",
    "thrdPtyIncntivRate",
    "netDvddRate",
    "nonResdtRate",
    "aplblRate",
    "slctnFeeRate",
    "taxCdtRate",
    "taxOnIncm",
    "taxOnPrfts",
    "taxRclmRate",
    "equlstnRate"
})
public class RateDetails25 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat46Choice addtlTax;
    @XmlElement(name = "GrssDvddRate")
    protected List<GrossDividendRateFormat26Choice> grssDvddRate;
    @XmlElement(name = "IntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat10Choice> intrstRateUsdForPmt;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat47Choice> whldgTaxRate;
    @XmlElement(name = "ScndLvlTax")
    protected List<RateAndAmountFormat47Choice> scndLvlTax;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat46Choice chrgsFees;
    @XmlElement(name = "EarlySlctnFeeRate")
    protected SolicitationFeeRateFormat10Choice earlySlctnFeeRate;
    @XmlElement(name = "FsclStmp")
    protected RateFormat3Choice fsclStmp;
    @XmlElement(name = "FullyFrnkdRate")
    protected RateAndAmountFormat46Choice fullyFrnkdRate;
    @XmlElement(name = "ThrdPtyIncntivRate")
    protected RateFormat21Choice thrdPtyIncntivRate;
    @XmlElement(name = "NetDvddRate")
    protected List<NetDividendRateFormat28Choice> netDvddRate;
    @XmlElement(name = "NonResdtRate")
    protected RateAndAmountFormat46Choice nonResdtRate;
    @XmlElement(name = "AplblRate")
    protected RateFormat3Choice aplblRate;
    @XmlElement(name = "SlctnFeeRate")
    protected SolicitationFeeRateFormat10Choice slctnFeeRate;
    @XmlElement(name = "TaxCdtRate")
    protected List<TaxCreditRateFormat10Choice> taxCdtRate;
    @XmlElement(name = "TaxOnIncm")
    protected RateAndAmountFormat46Choice taxOnIncm;
    @XmlElement(name = "TaxOnPrfts")
    protected RateFormat3Choice taxOnPrfts;
    @XmlElement(name = "TaxRclmRate")
    protected RateFormat3Choice taxRclmRate;
    @XmlElement(name = "EqulstnRate")
    protected RateAndAmountFormat48Choice equlstnRate;

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public RateAndAmountFormat46Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public RateDetails25 setAddtlTax(RateAndAmountFormat46Choice value) {
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
     * {@link GrossDividendRateFormat26Choice }
     * 
     * 
     * @return
     *     The value of the grssDvddRate property.
     */
    public List<GrossDividendRateFormat26Choice> getGrssDvddRate() {
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
     * {@link InterestRateUsedForPaymentFormat10Choice }
     * 
     * 
     * @return
     *     The value of the intrstRateUsdForPmt property.
     */
    public List<InterestRateUsedForPaymentFormat10Choice> getIntrstRateUsdForPmt() {
        if (intrstRateUsdForPmt == null) {
            intrstRateUsdForPmt = new ArrayList<>();
        }
        return this.intrstRateUsdForPmt;
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
     * {@link RateAndAmountFormat47Choice }
     * 
     * 
     * @return
     *     The value of the whldgTaxRate property.
     */
    public List<RateAndAmountFormat47Choice> getWhldgTaxRate() {
        if (whldgTaxRate == null) {
            whldgTaxRate = new ArrayList<>();
        }
        return this.whldgTaxRate;
    }

    /**
     * Gets the value of the scndLvlTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scndLvlTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScndLvlTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat47Choice }
     * 
     * 
     * @return
     *     The value of the scndLvlTax property.
     */
    public List<RateAndAmountFormat47Choice> getScndLvlTax() {
        if (scndLvlTax == null) {
            scndLvlTax = new ArrayList<>();
        }
        return this.scndLvlTax;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public RateAndAmountFormat46Choice getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public RateDetails25 setChrgsFees(RateAndAmountFormat46Choice value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the earlySlctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat10Choice }
     *     
     */
    public SolicitationFeeRateFormat10Choice getEarlySlctnFeeRate() {
        return earlySlctnFeeRate;
    }

    /**
     * Sets the value of the earlySlctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat10Choice }
     *     
     */
    public RateDetails25 setEarlySlctnFeeRate(SolicitationFeeRateFormat10Choice value) {
        this.earlySlctnFeeRate = value;
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
    public RateDetails25 setFsclStmp(RateFormat3Choice value) {
        this.fsclStmp = value;
        return this;
    }

    /**
     * Gets the value of the fullyFrnkdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public RateAndAmountFormat46Choice getFullyFrnkdRate() {
        return fullyFrnkdRate;
    }

    /**
     * Sets the value of the fullyFrnkdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public RateDetails25 setFullyFrnkdRate(RateAndAmountFormat46Choice value) {
        this.fullyFrnkdRate = value;
        return this;
    }

    /**
     * Gets the value of the thrdPtyIncntivRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat21Choice }
     *     
     */
    public RateFormat21Choice getThrdPtyIncntivRate() {
        return thrdPtyIncntivRate;
    }

    /**
     * Sets the value of the thrdPtyIncntivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat21Choice }
     *     
     */
    public RateDetails25 setThrdPtyIncntivRate(RateFormat21Choice value) {
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
     * {@link NetDividendRateFormat28Choice }
     * 
     * 
     * @return
     *     The value of the netDvddRate property.
     */
    public List<NetDividendRateFormat28Choice> getNetDvddRate() {
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
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public RateAndAmountFormat46Choice getNonResdtRate() {
        return nonResdtRate;
    }

    /**
     * Sets the value of the nonResdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public RateDetails25 setNonResdtRate(RateAndAmountFormat46Choice value) {
        this.nonResdtRate = value;
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
    public RateDetails25 setAplblRate(RateFormat3Choice value) {
        this.aplblRate = value;
        return this;
    }

    /**
     * Gets the value of the slctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat10Choice }
     *     
     */
    public SolicitationFeeRateFormat10Choice getSlctnFeeRate() {
        return slctnFeeRate;
    }

    /**
     * Sets the value of the slctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat10Choice }
     *     
     */
    public RateDetails25 setSlctnFeeRate(SolicitationFeeRateFormat10Choice value) {
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
     * {@link TaxCreditRateFormat10Choice }
     * 
     * 
     * @return
     *     The value of the taxCdtRate property.
     */
    public List<TaxCreditRateFormat10Choice> getTaxCdtRate() {
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
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public RateAndAmountFormat46Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public RateDetails25 setTaxOnIncm(RateAndAmountFormat46Choice value) {
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
    public RateDetails25 setTaxOnPrfts(RateFormat3Choice value) {
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
    public RateDetails25 setTaxRclmRate(RateFormat3Choice value) {
        this.taxRclmRate = value;
        return this;
    }

    /**
     * Gets the value of the equlstnRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat48Choice }
     *     
     */
    public RateAndAmountFormat48Choice getEqulstnRate() {
        return equlstnRate;
    }

    /**
     * Sets the value of the equlstnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat48Choice }
     *     
     */
    public RateDetails25 setEqulstnRate(RateAndAmountFormat48Choice value) {
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
    public RateDetails25 addGrssDvddRate(GrossDividendRateFormat26Choice grssDvddRate) {
        getGrssDvddRate().add(grssDvddRate);
        return this;
    }

    /**
     * Adds a new item to the intrstRateUsdForPmt list.
     * @see #getIntrstRateUsdForPmt()
     * 
     */
    public RateDetails25 addIntrstRateUsdForPmt(InterestRateUsedForPaymentFormat10Choice intrstRateUsdForPmt) {
        getIntrstRateUsdForPmt().add(intrstRateUsdForPmt);
        return this;
    }

    /**
     * Adds a new item to the whldgTaxRate list.
     * @see #getWhldgTaxRate()
     * 
     */
    public RateDetails25 addWhldgTaxRate(RateAndAmountFormat47Choice whldgTaxRate) {
        getWhldgTaxRate().add(whldgTaxRate);
        return this;
    }

    /**
     * Adds a new item to the scndLvlTax list.
     * @see #getScndLvlTax()
     * 
     */
    public RateDetails25 addScndLvlTax(RateAndAmountFormat47Choice scndLvlTax) {
        getScndLvlTax().add(scndLvlTax);
        return this;
    }

    /**
     * Adds a new item to the netDvddRate list.
     * @see #getNetDvddRate()
     * 
     */
    public RateDetails25 addNetDvddRate(NetDividendRateFormat28Choice netDvddRate) {
        getNetDvddRate().add(netDvddRate);
        return this;
    }

    /**
     * Adds a new item to the taxCdtRate list.
     * @see #getTaxCdtRate()
     * 
     */
    public RateDetails25 addTaxCdtRate(TaxCreditRateFormat10Choice taxCdtRate) {
        getTaxCdtRate().add(taxCdtRate);
        return this;
    }

}
