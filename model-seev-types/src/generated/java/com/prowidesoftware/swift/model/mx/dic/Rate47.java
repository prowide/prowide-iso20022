
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
@XmlType(name = "Rate47", propOrder = {
    "addtlTax",
    "grssDstrbtnRate",
    "grssIntrstRateUsdForPmt",
    "whldgTaxRate",
    "scndLvlTax",
    "chrgsFees",
    "earlySlctnFeeRate",
    "fsclStmp",
    "thrdPtyIncntivRate",
    "netDstrbtnRate",
    "aplblRate",
    "slctnFeeRate",
    "taxCdtRate",
    "taxOnIncm",
    "taxOnPrfts",
    "taxRclmRate",
    "equlstnRate",
    "dmdRate"
})
public class Rate47 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat72Choice addtlTax;
    @XmlElement(name = "GrssDstrbtnRate")
    protected List<GrossDividendRateFormat41Choice> grssDstrbtnRate;
    @XmlElement(name = "GrssIntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat18Choice> grssIntrstRateUsdForPmt;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat76Choice> whldgTaxRate;
    @XmlElement(name = "ScndLvlTax")
    protected List<RateAndAmountFormat76Choice> scndLvlTax;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat72Choice chrgsFees;
    @XmlElement(name = "EarlySlctnFeeRate")
    protected SolicitationFeeRateFormat15Choice earlySlctnFeeRate;
    @XmlElement(name = "FsclStmp")
    protected RateFormat24Choice fsclStmp;
    @XmlElement(name = "ThrdPtyIncntivRate")
    protected RateFormat30Choice thrdPtyIncntivRate;
    @XmlElement(name = "NetDstrbtnRate")
    protected List<NetDividendRateFormat43Choice> netDstrbtnRate;
    @XmlElement(name = "AplblRate")
    protected RateFormat24Choice aplblRate;
    @XmlElement(name = "SlctnFeeRate")
    protected SolicitationFeeRateFormat15Choice slctnFeeRate;
    @XmlElement(name = "TaxCdtRate")
    protected RateFormat30Choice taxCdtRate;
    @XmlElement(name = "TaxOnIncm")
    protected RateAndAmountFormat72Choice taxOnIncm;
    @XmlElement(name = "TaxOnPrfts")
    protected RateFormat24Choice taxOnPrfts;
    @XmlElement(name = "TaxRclmRate")
    protected RateFormat24Choice taxRclmRate;
    @XmlElement(name = "EqulstnRate")
    protected RateAndAmountFormat48Choice equlstnRate;
    @XmlElement(name = "DmdRate")
    protected List<RateAndAmountFormat77Choice> dmdRate;

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat72Choice }
     *     
     */
    public RateAndAmountFormat72Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat72Choice }
     *     
     */
    public Rate47 setAddtlTax(RateAndAmountFormat72Choice value) {
        this.addtlTax = value;
        return this;
    }

    /**
     * Gets the value of the grssDstrbtnRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the grssDstrbtnRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrssDstrbtnRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrossDividendRateFormat41Choice }
     * 
     * 
     * @return
     *     The value of the grssDstrbtnRate property.
     */
    public List<GrossDividendRateFormat41Choice> getGrssDstrbtnRate() {
        if (grssDstrbtnRate == null) {
            grssDstrbtnRate = new ArrayList<>();
        }
        return this.grssDstrbtnRate;
    }

    /**
     * Gets the value of the grssIntrstRateUsdForPmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the grssIntrstRateUsdForPmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrssIntrstRateUsdForPmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestRateUsedForPaymentFormat18Choice }
     * 
     * 
     * @return
     *     The value of the grssIntrstRateUsdForPmt property.
     */
    public List<InterestRateUsedForPaymentFormat18Choice> getGrssIntrstRateUsdForPmt() {
        if (grssIntrstRateUsdForPmt == null) {
            grssIntrstRateUsdForPmt = new ArrayList<>();
        }
        return this.grssIntrstRateUsdForPmt;
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
     * {@link RateAndAmountFormat76Choice }
     * 
     * 
     * @return
     *     The value of the whldgTaxRate property.
     */
    public List<RateAndAmountFormat76Choice> getWhldgTaxRate() {
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
     * {@link RateAndAmountFormat76Choice }
     * 
     * 
     * @return
     *     The value of the scndLvlTax property.
     */
    public List<RateAndAmountFormat76Choice> getScndLvlTax() {
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
     *     {@link RateAndAmountFormat72Choice }
     *     
     */
    public RateAndAmountFormat72Choice getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat72Choice }
     *     
     */
    public Rate47 setChrgsFees(RateAndAmountFormat72Choice value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the earlySlctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat15Choice }
     *     
     */
    public SolicitationFeeRateFormat15Choice getEarlySlctnFeeRate() {
        return earlySlctnFeeRate;
    }

    /**
     * Sets the value of the earlySlctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat15Choice }
     *     
     */
    public Rate47 setEarlySlctnFeeRate(SolicitationFeeRateFormat15Choice value) {
        this.earlySlctnFeeRate = value;
        return this;
    }

    /**
     * Gets the value of the fsclStmp property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat24Choice }
     *     
     */
    public RateFormat24Choice getFsclStmp() {
        return fsclStmp;
    }

    /**
     * Sets the value of the fsclStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat24Choice }
     *     
     */
    public Rate47 setFsclStmp(RateFormat24Choice value) {
        this.fsclStmp = value;
        return this;
    }

    /**
     * Gets the value of the thrdPtyIncntivRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat30Choice }
     *     
     */
    public RateFormat30Choice getThrdPtyIncntivRate() {
        return thrdPtyIncntivRate;
    }

    /**
     * Sets the value of the thrdPtyIncntivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat30Choice }
     *     
     */
    public Rate47 setThrdPtyIncntivRate(RateFormat30Choice value) {
        this.thrdPtyIncntivRate = value;
        return this;
    }

    /**
     * Gets the value of the netDstrbtnRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the netDstrbtnRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetDstrbtnRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetDividendRateFormat43Choice }
     * 
     * 
     * @return
     *     The value of the netDstrbtnRate property.
     */
    public List<NetDividendRateFormat43Choice> getNetDstrbtnRate() {
        if (netDstrbtnRate == null) {
            netDstrbtnRate = new ArrayList<>();
        }
        return this.netDstrbtnRate;
    }

    /**
     * Gets the value of the aplblRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat24Choice }
     *     
     */
    public RateFormat24Choice getAplblRate() {
        return aplblRate;
    }

    /**
     * Sets the value of the aplblRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat24Choice }
     *     
     */
    public Rate47 setAplblRate(RateFormat24Choice value) {
        this.aplblRate = value;
        return this;
    }

    /**
     * Gets the value of the slctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat15Choice }
     *     
     */
    public SolicitationFeeRateFormat15Choice getSlctnFeeRate() {
        return slctnFeeRate;
    }

    /**
     * Sets the value of the slctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat15Choice }
     *     
     */
    public Rate47 setSlctnFeeRate(SolicitationFeeRateFormat15Choice value) {
        this.slctnFeeRate = value;
        return this;
    }

    /**
     * Gets the value of the taxCdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat30Choice }
     *     
     */
    public RateFormat30Choice getTaxCdtRate() {
        return taxCdtRate;
    }

    /**
     * Sets the value of the taxCdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat30Choice }
     *     
     */
    public Rate47 setTaxCdtRate(RateFormat30Choice value) {
        this.taxCdtRate = value;
        return this;
    }

    /**
     * Gets the value of the taxOnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat72Choice }
     *     
     */
    public RateAndAmountFormat72Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat72Choice }
     *     
     */
    public Rate47 setTaxOnIncm(RateAndAmountFormat72Choice value) {
        this.taxOnIncm = value;
        return this;
    }

    /**
     * Gets the value of the taxOnPrfts property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat24Choice }
     *     
     */
    public RateFormat24Choice getTaxOnPrfts() {
        return taxOnPrfts;
    }

    /**
     * Sets the value of the taxOnPrfts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat24Choice }
     *     
     */
    public Rate47 setTaxOnPrfts(RateFormat24Choice value) {
        this.taxOnPrfts = value;
        return this;
    }

    /**
     * Gets the value of the taxRclmRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat24Choice }
     *     
     */
    public RateFormat24Choice getTaxRclmRate() {
        return taxRclmRate;
    }

    /**
     * Sets the value of the taxRclmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat24Choice }
     *     
     */
    public Rate47 setTaxRclmRate(RateFormat24Choice value) {
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
    public Rate47 setEqulstnRate(RateAndAmountFormat48Choice value) {
        this.equlstnRate = value;
        return this;
    }

    /**
     * Gets the value of the dmdRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dmdRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmdRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat77Choice }
     * 
     * 
     * @return
     *     The value of the dmdRate property.
     */
    public List<RateAndAmountFormat77Choice> getDmdRate() {
        if (dmdRate == null) {
            dmdRate = new ArrayList<>();
        }
        return this.dmdRate;
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
     * Adds a new item to the grssDstrbtnRate list.
     * @see #getGrssDstrbtnRate()
     * 
     */
    public Rate47 addGrssDstrbtnRate(GrossDividendRateFormat41Choice grssDstrbtnRate) {
        getGrssDstrbtnRate().add(grssDstrbtnRate);
        return this;
    }

    /**
     * Adds a new item to the grssIntrstRateUsdForPmt list.
     * @see #getGrssIntrstRateUsdForPmt()
     * 
     */
    public Rate47 addGrssIntrstRateUsdForPmt(InterestRateUsedForPaymentFormat18Choice grssIntrstRateUsdForPmt) {
        getGrssIntrstRateUsdForPmt().add(grssIntrstRateUsdForPmt);
        return this;
    }

    /**
     * Adds a new item to the whldgTaxRate list.
     * @see #getWhldgTaxRate()
     * 
     */
    public Rate47 addWhldgTaxRate(RateAndAmountFormat76Choice whldgTaxRate) {
        getWhldgTaxRate().add(whldgTaxRate);
        return this;
    }

    /**
     * Adds a new item to the scndLvlTax list.
     * @see #getScndLvlTax()
     * 
     */
    public Rate47 addScndLvlTax(RateAndAmountFormat76Choice scndLvlTax) {
        getScndLvlTax().add(scndLvlTax);
        return this;
    }

    /**
     * Adds a new item to the netDstrbtnRate list.
     * @see #getNetDstrbtnRate()
     * 
     */
    public Rate47 addNetDstrbtnRate(NetDividendRateFormat43Choice netDstrbtnRate) {
        getNetDstrbtnRate().add(netDstrbtnRate);
        return this;
    }

    /**
     * Adds a new item to the dmdRate list.
     * @see #getDmdRate()
     * 
     */
    public Rate47 addDmdRate(RateAndAmountFormat77Choice dmdRate) {
        getDmdRate().add(dmdRate);
        return this;
    }

}
