
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
@XmlType(name = "Rate45", propOrder = {
    "addtlTax",
    "chrgsFees",
    "fsclStmp",
    "grssDstrbtnRate",
    "earlySlctnFeeRate",
    "thrdPtyIncntivRate",
    "grssIntrstRateUsdForPmt",
    "netDstrbtnRate",
    "aplblRate",
    "slctnFeeRate",
    "taxCdtRate",
    "whldgTaxRate",
    "scndLvlTax",
    "taxOnIncm",
    "taxOnPrfts",
    "taxRclmRate",
    "equlstnRate",
    "dmdRate"
})
public class Rate45 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat67Choice addtlTax;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat67Choice chrgsFees;
    @XmlElement(name = "FsclStmp")
    protected BigDecimal fsclStmp;
    @XmlElement(name = "GrssDstrbtnRate")
    protected List<GrossDividendRateFormat40Choice> grssDstrbtnRate;
    @XmlElement(name = "EarlySlctnFeeRate")
    protected SolicitationFeeRateFormat13Choice earlySlctnFeeRate;
    @XmlElement(name = "ThrdPtyIncntivRate")
    protected RateAndAmountFormat67Choice thrdPtyIncntivRate;
    @XmlElement(name = "GrssIntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat19Choice> grssIntrstRateUsdForPmt;
    @XmlElement(name = "NetDstrbtnRate")
    protected List<NetDividendRateFormat42Choice> netDstrbtnRate;
    @XmlElement(name = "AplblRate")
    protected BigDecimal aplblRate;
    @XmlElement(name = "SlctnFeeRate")
    protected SolicitationFeeRateFormat13Choice slctnFeeRate;
    @XmlElement(name = "TaxCdtRate")
    protected RateFormat28Choice taxCdtRate;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat66Choice> whldgTaxRate;
    @XmlElement(name = "ScndLvlTax")
    protected List<RateAndAmountFormat66Choice> scndLvlTax;
    @XmlElement(name = "TaxOnIncm")
    protected RateAndAmountFormat67Choice taxOnIncm;
    @XmlElement(name = "TaxOnPrfts")
    protected BigDecimal taxOnPrfts;
    @XmlElement(name = "TaxRclmRate")
    protected BigDecimal taxRclmRate;
    @XmlElement(name = "EqulstnRate")
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount equlstnRate;
    @XmlElement(name = "DmdRate")
    protected List<RateAndAmountFormat68Choice> dmdRate;

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat67Choice }
     *     
     */
    public RateAndAmountFormat67Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat67Choice }
     *     
     */
    public Rate45 setAddtlTax(RateAndAmountFormat67Choice value) {
        this.addtlTax = value;
        return this;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat67Choice }
     *     
     */
    public RateAndAmountFormat67Choice getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat67Choice }
     *     
     */
    public Rate45 setChrgsFees(RateAndAmountFormat67Choice value) {
        this.chrgsFees = value;
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
    public Rate45 setFsclStmp(BigDecimal value) {
        this.fsclStmp = value;
        return this;
    }

    /**
     * Gets the value of the grssDstrbtnRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grssDstrbtnRate property.
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
     * {@link GrossDividendRateFormat40Choice }
     * 
     * 
     */
    public List<GrossDividendRateFormat40Choice> getGrssDstrbtnRate() {
        if (grssDstrbtnRate == null) {
            grssDstrbtnRate = new ArrayList<GrossDividendRateFormat40Choice>();
        }
        return this.grssDstrbtnRate;
    }

    /**
     * Gets the value of the earlySlctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat13Choice }
     *     
     */
    public SolicitationFeeRateFormat13Choice getEarlySlctnFeeRate() {
        return earlySlctnFeeRate;
    }

    /**
     * Sets the value of the earlySlctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat13Choice }
     *     
     */
    public Rate45 setEarlySlctnFeeRate(SolicitationFeeRateFormat13Choice value) {
        this.earlySlctnFeeRate = value;
        return this;
    }

    /**
     * Gets the value of the thrdPtyIncntivRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat67Choice }
     *     
     */
    public RateAndAmountFormat67Choice getThrdPtyIncntivRate() {
        return thrdPtyIncntivRate;
    }

    /**
     * Sets the value of the thrdPtyIncntivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat67Choice }
     *     
     */
    public Rate45 setThrdPtyIncntivRate(RateAndAmountFormat67Choice value) {
        this.thrdPtyIncntivRate = value;
        return this;
    }

    /**
     * Gets the value of the grssIntrstRateUsdForPmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grssIntrstRateUsdForPmt property.
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
     * {@link InterestRateUsedForPaymentFormat19Choice }
     * 
     * 
     */
    public List<InterestRateUsedForPaymentFormat19Choice> getGrssIntrstRateUsdForPmt() {
        if (grssIntrstRateUsdForPmt == null) {
            grssIntrstRateUsdForPmt = new ArrayList<InterestRateUsedForPaymentFormat19Choice>();
        }
        return this.grssIntrstRateUsdForPmt;
    }

    /**
     * Gets the value of the netDstrbtnRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netDstrbtnRate property.
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
     * {@link NetDividendRateFormat42Choice }
     * 
     * 
     */
    public List<NetDividendRateFormat42Choice> getNetDstrbtnRate() {
        if (netDstrbtnRate == null) {
            netDstrbtnRate = new ArrayList<NetDividendRateFormat42Choice>();
        }
        return this.netDstrbtnRate;
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
    public Rate45 setAplblRate(BigDecimal value) {
        this.aplblRate = value;
        return this;
    }

    /**
     * Gets the value of the slctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat13Choice }
     *     
     */
    public SolicitationFeeRateFormat13Choice getSlctnFeeRate() {
        return slctnFeeRate;
    }

    /**
     * Sets the value of the slctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat13Choice }
     *     
     */
    public Rate45 setSlctnFeeRate(SolicitationFeeRateFormat13Choice value) {
        this.slctnFeeRate = value;
        return this;
    }

    /**
     * Gets the value of the taxCdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat28Choice }
     *     
     */
    public RateFormat28Choice getTaxCdtRate() {
        return taxCdtRate;
    }

    /**
     * Sets the value of the taxCdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat28Choice }
     *     
     */
    public Rate45 setTaxCdtRate(RateFormat28Choice value) {
        this.taxCdtRate = value;
        return this;
    }

    /**
     * Gets the value of the whldgTaxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whldgTaxRate property.
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
     * {@link RateAndAmountFormat66Choice }
     * 
     * 
     */
    public List<RateAndAmountFormat66Choice> getWhldgTaxRate() {
        if (whldgTaxRate == null) {
            whldgTaxRate = new ArrayList<RateAndAmountFormat66Choice>();
        }
        return this.whldgTaxRate;
    }

    /**
     * Gets the value of the scndLvlTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scndLvlTax property.
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
     * {@link RateAndAmountFormat66Choice }
     * 
     * 
     */
    public List<RateAndAmountFormat66Choice> getScndLvlTax() {
        if (scndLvlTax == null) {
            scndLvlTax = new ArrayList<RateAndAmountFormat66Choice>();
        }
        return this.scndLvlTax;
    }

    /**
     * Gets the value of the taxOnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat67Choice }
     *     
     */
    public RateAndAmountFormat67Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat67Choice }
     *     
     */
    public Rate45 setTaxOnIncm(RateAndAmountFormat67Choice value) {
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
    public Rate45 setTaxOnPrfts(BigDecimal value) {
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
    public Rate45 setTaxRclmRate(BigDecimal value) {
        this.taxRclmRate = value;
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
    public Rate45 setEqulstnRate(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
        this.equlstnRate = value;
        return this;
    }

    /**
     * Gets the value of the dmdRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmdRate property.
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
     * {@link RateAndAmountFormat68Choice }
     * 
     * 
     */
    public List<RateAndAmountFormat68Choice> getDmdRate() {
        if (dmdRate == null) {
            dmdRate = new ArrayList<RateAndAmountFormat68Choice>();
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
    public Rate45 addGrssDstrbtnRate(GrossDividendRateFormat40Choice grssDstrbtnRate) {
        getGrssDstrbtnRate().add(grssDstrbtnRate);
        return this;
    }

    /**
     * Adds a new item to the grssIntrstRateUsdForPmt list.
     * @see #getGrssIntrstRateUsdForPmt()
     * 
     */
    public Rate45 addGrssIntrstRateUsdForPmt(InterestRateUsedForPaymentFormat19Choice grssIntrstRateUsdForPmt) {
        getGrssIntrstRateUsdForPmt().add(grssIntrstRateUsdForPmt);
        return this;
    }

    /**
     * Adds a new item to the netDstrbtnRate list.
     * @see #getNetDstrbtnRate()
     * 
     */
    public Rate45 addNetDstrbtnRate(NetDividendRateFormat42Choice netDstrbtnRate) {
        getNetDstrbtnRate().add(netDstrbtnRate);
        return this;
    }

    /**
     * Adds a new item to the whldgTaxRate list.
     * @see #getWhldgTaxRate()
     * 
     */
    public Rate45 addWhldgTaxRate(RateAndAmountFormat66Choice whldgTaxRate) {
        getWhldgTaxRate().add(whldgTaxRate);
        return this;
    }

    /**
     * Adds a new item to the scndLvlTax list.
     * @see #getScndLvlTax()
     * 
     */
    public Rate45 addScndLvlTax(RateAndAmountFormat66Choice scndLvlTax) {
        getScndLvlTax().add(scndLvlTax);
        return this;
    }

    /**
     * Adds a new item to the dmdRate list.
     * @see #getDmdRate()
     * 
     */
    public Rate45 addDmdRate(RateAndAmountFormat68Choice dmdRate) {
        getDmdRate().add(dmdRate);
        return this;
    }

}
