
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
@XmlType(name = "CorporateActionRate124", propOrder = {
    "addtlTax",
    "grssDstrbtnRate",
    "netDstrbtnRate",
    "grssIntrstRateUsdForPmt",
    "maxAllwdOvrsbcptRate",
    "prratnRate",
    "whldgTaxRate",
    "scndLvlTax",
    "taxblIncmPerDvddShr",
    "issrDclrdXchgRate",
    "taxOnIncm",
    "bidIntrvl"
})
public class CorporateActionRate124 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat57Choice addtlTax;
    @XmlElement(name = "GrssDstrbtnRate")
    protected List<GrossDividendRateFormat43Choice> grssDstrbtnRate;
    @XmlElement(name = "NetDstrbtnRate")
    protected List<NetDividendRateFormat38Choice> netDstrbtnRate;
    @XmlElement(name = "GrssIntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat11Choice> grssIntrstRateUsdForPmt;
    @XmlElement(name = "MaxAllwdOvrsbcptRate")
    protected RateFormat24Choice maxAllwdOvrsbcptRate;
    @XmlElement(name = "PrratnRate")
    protected RateFormat24Choice prratnRate;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat56Choice> whldgTaxRate;
    @XmlElement(name = "ScndLvlTax")
    protected List<RateAndAmountFormat56Choice> scndLvlTax;
    @XmlElement(name = "TaxblIncmPerDvddShr")
    protected List<RateTypeAndAmountAndStatus26> taxblIncmPerDvddShr;
    @XmlElement(name = "IssrDclrdXchgRate")
    protected ForeignExchangeTerms38 issrDclrdXchgRate;
    @XmlElement(name = "TaxOnIncm")
    protected RateAndAmountFormat57Choice taxOnIncm;
    @XmlElement(name = "BidIntrvl")
    protected RateAndAmountFormat58Choice bidIntrvl;

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat57Choice }
     *     
     */
    public RateAndAmountFormat57Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat57Choice }
     *     
     */
    public CorporateActionRate124 setAddtlTax(RateAndAmountFormat57Choice value) {
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
     * {@link GrossDividendRateFormat43Choice }
     * 
     * 
     * @return
     *     The value of the grssDstrbtnRate property.
     */
    public List<GrossDividendRateFormat43Choice> getGrssDstrbtnRate() {
        if (grssDstrbtnRate == null) {
            grssDstrbtnRate = new ArrayList<>();
        }
        return this.grssDstrbtnRate;
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
     * {@link NetDividendRateFormat38Choice }
     * 
     * 
     * @return
     *     The value of the netDstrbtnRate property.
     */
    public List<NetDividendRateFormat38Choice> getNetDstrbtnRate() {
        if (netDstrbtnRate == null) {
            netDstrbtnRate = new ArrayList<>();
        }
        return this.netDstrbtnRate;
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
     * {@link InterestRateUsedForPaymentFormat11Choice }
     * 
     * 
     * @return
     *     The value of the grssIntrstRateUsdForPmt property.
     */
    public List<InterestRateUsedForPaymentFormat11Choice> getGrssIntrstRateUsdForPmt() {
        if (grssIntrstRateUsdForPmt == null) {
            grssIntrstRateUsdForPmt = new ArrayList<>();
        }
        return this.grssIntrstRateUsdForPmt;
    }

    /**
     * Gets the value of the maxAllwdOvrsbcptRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat24Choice }
     *     
     */
    public RateFormat24Choice getMaxAllwdOvrsbcptRate() {
        return maxAllwdOvrsbcptRate;
    }

    /**
     * Sets the value of the maxAllwdOvrsbcptRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat24Choice }
     *     
     */
    public CorporateActionRate124 setMaxAllwdOvrsbcptRate(RateFormat24Choice value) {
        this.maxAllwdOvrsbcptRate = value;
        return this;
    }

    /**
     * Gets the value of the prratnRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat24Choice }
     *     
     */
    public RateFormat24Choice getPrratnRate() {
        return prratnRate;
    }

    /**
     * Sets the value of the prratnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat24Choice }
     *     
     */
    public CorporateActionRate124 setPrratnRate(RateFormat24Choice value) {
        this.prratnRate = value;
        return this;
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
     * {@link RateAndAmountFormat56Choice }
     * 
     * 
     * @return
     *     The value of the whldgTaxRate property.
     */
    public List<RateAndAmountFormat56Choice> getWhldgTaxRate() {
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
     * {@link RateAndAmountFormat56Choice }
     * 
     * 
     * @return
     *     The value of the scndLvlTax property.
     */
    public List<RateAndAmountFormat56Choice> getScndLvlTax() {
        if (scndLvlTax == null) {
            scndLvlTax = new ArrayList<>();
        }
        return this.scndLvlTax;
    }

    /**
     * Gets the value of the taxblIncmPerDvddShr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxblIncmPerDvddShr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxblIncmPerDvddShr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateTypeAndAmountAndStatus26 }
     * 
     * 
     * @return
     *     The value of the taxblIncmPerDvddShr property.
     */
    public List<RateTypeAndAmountAndStatus26> getTaxblIncmPerDvddShr() {
        if (taxblIncmPerDvddShr == null) {
            taxblIncmPerDvddShr = new ArrayList<>();
        }
        return this.taxblIncmPerDvddShr;
    }

    /**
     * Gets the value of the issrDclrdXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms38 }
     *     
     */
    public ForeignExchangeTerms38 getIssrDclrdXchgRate() {
        return issrDclrdXchgRate;
    }

    /**
     * Sets the value of the issrDclrdXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms38 }
     *     
     */
    public CorporateActionRate124 setIssrDclrdXchgRate(ForeignExchangeTerms38 value) {
        this.issrDclrdXchgRate = value;
        return this;
    }

    /**
     * Gets the value of the taxOnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat57Choice }
     *     
     */
    public RateAndAmountFormat57Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat57Choice }
     *     
     */
    public CorporateActionRate124 setTaxOnIncm(RateAndAmountFormat57Choice value) {
        this.taxOnIncm = value;
        return this;
    }

    /**
     * Gets the value of the bidIntrvl property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat58Choice }
     *     
     */
    public RateAndAmountFormat58Choice getBidIntrvl() {
        return bidIntrvl;
    }

    /**
     * Sets the value of the bidIntrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat58Choice }
     *     
     */
    public CorporateActionRate124 setBidIntrvl(RateAndAmountFormat58Choice value) {
        this.bidIntrvl = value;
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
     * Adds a new item to the grssDstrbtnRate list.
     * @see #getGrssDstrbtnRate()
     * 
     */
    public CorporateActionRate124 addGrssDstrbtnRate(GrossDividendRateFormat43Choice grssDstrbtnRate) {
        getGrssDstrbtnRate().add(grssDstrbtnRate);
        return this;
    }

    /**
     * Adds a new item to the netDstrbtnRate list.
     * @see #getNetDstrbtnRate()
     * 
     */
    public CorporateActionRate124 addNetDstrbtnRate(NetDividendRateFormat38Choice netDstrbtnRate) {
        getNetDstrbtnRate().add(netDstrbtnRate);
        return this;
    }

    /**
     * Adds a new item to the grssIntrstRateUsdForPmt list.
     * @see #getGrssIntrstRateUsdForPmt()
     * 
     */
    public CorporateActionRate124 addGrssIntrstRateUsdForPmt(InterestRateUsedForPaymentFormat11Choice grssIntrstRateUsdForPmt) {
        getGrssIntrstRateUsdForPmt().add(grssIntrstRateUsdForPmt);
        return this;
    }

    /**
     * Adds a new item to the whldgTaxRate list.
     * @see #getWhldgTaxRate()
     * 
     */
    public CorporateActionRate124 addWhldgTaxRate(RateAndAmountFormat56Choice whldgTaxRate) {
        getWhldgTaxRate().add(whldgTaxRate);
        return this;
    }

    /**
     * Adds a new item to the scndLvlTax list.
     * @see #getScndLvlTax()
     * 
     */
    public CorporateActionRate124 addScndLvlTax(RateAndAmountFormat56Choice scndLvlTax) {
        getScndLvlTax().add(scndLvlTax);
        return this;
    }

    /**
     * Adds a new item to the taxblIncmPerDvddShr list.
     * @see #getTaxblIncmPerDvddShr()
     * 
     */
    public CorporateActionRate124 addTaxblIncmPerDvddShr(RateTypeAndAmountAndStatus26 taxblIncmPerDvddShr) {
        getTaxblIncmPerDvddShr().add(taxblIncmPerDvddShr);
        return this;
    }

}
