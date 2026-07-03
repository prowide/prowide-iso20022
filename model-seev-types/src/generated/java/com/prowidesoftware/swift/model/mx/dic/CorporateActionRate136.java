
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
 * Specifies rates related to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate136", propOrder = {
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
public class CorporateActionRate136 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat72Choice addtlTax;
    @XmlElement(name = "GrssDstrbtnRate")
    protected List<GrossDividendRateFormat41Choice> grssDstrbtnRate;
    @XmlElement(name = "NetDstrbtnRate")
    protected List<NetDividendRateFormat43Choice> netDstrbtnRate;
    @XmlElement(name = "GrssIntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat18Choice> grssIntrstRateUsdForPmt;
    @XmlElement(name = "MaxAllwdOvrsbcptRate")
    protected RateFormat24Choice maxAllwdOvrsbcptRate;
    @XmlElement(name = "PrratnRate")
    protected RateFormat24Choice prratnRate;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat75Choice> whldgTaxRate;
    @XmlElement(name = "ScndLvlTax")
    protected List<RateAndAmountFormat75Choice> scndLvlTax;
    @XmlElement(name = "TaxblIncmPerDvddShr")
    protected List<RateTypeAndAmountAndStatus33> taxblIncmPerDvddShr;
    @XmlElement(name = "IssrDclrdXchgRate")
    protected ForeignExchangeTerms38 issrDclrdXchgRate;
    @XmlElement(name = "TaxOnIncm")
    protected RateAndAmountFormat72Choice taxOnIncm;
    @XmlElement(name = "BidIntrvl")
    protected RateAndAmountFormat73Choice bidIntrvl;

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
    public CorporateActionRate136 setAddtlTax(RateAndAmountFormat72Choice value) {
        this.addtlTax = value;
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
     * {@link GrossDividendRateFormat41Choice }
     * 
     * 
     */
    public List<GrossDividendRateFormat41Choice> getGrssDstrbtnRate() {
        if (grssDstrbtnRate == null) {
            grssDstrbtnRate = new ArrayList<GrossDividendRateFormat41Choice>();
        }
        return this.grssDstrbtnRate;
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
     * {@link NetDividendRateFormat43Choice }
     * 
     * 
     */
    public List<NetDividendRateFormat43Choice> getNetDstrbtnRate() {
        if (netDstrbtnRate == null) {
            netDstrbtnRate = new ArrayList<NetDividendRateFormat43Choice>();
        }
        return this.netDstrbtnRate;
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
     * {@link InterestRateUsedForPaymentFormat18Choice }
     * 
     * 
     */
    public List<InterestRateUsedForPaymentFormat18Choice> getGrssIntrstRateUsdForPmt() {
        if (grssIntrstRateUsdForPmt == null) {
            grssIntrstRateUsdForPmt = new ArrayList<InterestRateUsedForPaymentFormat18Choice>();
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
    public CorporateActionRate136 setMaxAllwdOvrsbcptRate(RateFormat24Choice value) {
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
    public CorporateActionRate136 setPrratnRate(RateFormat24Choice value) {
        this.prratnRate = value;
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
     * {@link RateAndAmountFormat75Choice }
     * 
     * 
     */
    public List<RateAndAmountFormat75Choice> getWhldgTaxRate() {
        if (whldgTaxRate == null) {
            whldgTaxRate = new ArrayList<RateAndAmountFormat75Choice>();
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
     * {@link RateAndAmountFormat75Choice }
     * 
     * 
     */
    public List<RateAndAmountFormat75Choice> getScndLvlTax() {
        if (scndLvlTax == null) {
            scndLvlTax = new ArrayList<RateAndAmountFormat75Choice>();
        }
        return this.scndLvlTax;
    }

    /**
     * Gets the value of the taxblIncmPerDvddShr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxblIncmPerDvddShr property.
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
     * {@link RateTypeAndAmountAndStatus33 }
     * 
     * 
     */
    public List<RateTypeAndAmountAndStatus33> getTaxblIncmPerDvddShr() {
        if (taxblIncmPerDvddShr == null) {
            taxblIncmPerDvddShr = new ArrayList<RateTypeAndAmountAndStatus33>();
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
    public CorporateActionRate136 setIssrDclrdXchgRate(ForeignExchangeTerms38 value) {
        this.issrDclrdXchgRate = value;
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
    public CorporateActionRate136 setTaxOnIncm(RateAndAmountFormat72Choice value) {
        this.taxOnIncm = value;
        return this;
    }

    /**
     * Gets the value of the bidIntrvl property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat73Choice }
     *     
     */
    public RateAndAmountFormat73Choice getBidIntrvl() {
        return bidIntrvl;
    }

    /**
     * Sets the value of the bidIntrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat73Choice }
     *     
     */
    public CorporateActionRate136 setBidIntrvl(RateAndAmountFormat73Choice value) {
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
    public CorporateActionRate136 addGrssDstrbtnRate(GrossDividendRateFormat41Choice grssDstrbtnRate) {
        getGrssDstrbtnRate().add(grssDstrbtnRate);
        return this;
    }

    /**
     * Adds a new item to the netDstrbtnRate list.
     * @see #getNetDstrbtnRate()
     * 
     */
    public CorporateActionRate136 addNetDstrbtnRate(NetDividendRateFormat43Choice netDstrbtnRate) {
        getNetDstrbtnRate().add(netDstrbtnRate);
        return this;
    }

    /**
     * Adds a new item to the grssIntrstRateUsdForPmt list.
     * @see #getGrssIntrstRateUsdForPmt()
     * 
     */
    public CorporateActionRate136 addGrssIntrstRateUsdForPmt(InterestRateUsedForPaymentFormat18Choice grssIntrstRateUsdForPmt) {
        getGrssIntrstRateUsdForPmt().add(grssIntrstRateUsdForPmt);
        return this;
    }

    /**
     * Adds a new item to the whldgTaxRate list.
     * @see #getWhldgTaxRate()
     * 
     */
    public CorporateActionRate136 addWhldgTaxRate(RateAndAmountFormat75Choice whldgTaxRate) {
        getWhldgTaxRate().add(whldgTaxRate);
        return this;
    }

    /**
     * Adds a new item to the scndLvlTax list.
     * @see #getScndLvlTax()
     * 
     */
    public CorporateActionRate136 addScndLvlTax(RateAndAmountFormat75Choice scndLvlTax) {
        getScndLvlTax().add(scndLvlTax);
        return this;
    }

    /**
     * Adds a new item to the taxblIncmPerDvddShr list.
     * @see #getTaxblIncmPerDvddShr()
     * 
     */
    public CorporateActionRate136 addTaxblIncmPerDvddShr(RateTypeAndAmountAndStatus33 taxblIncmPerDvddShr) {
        getTaxblIncmPerDvddShr().add(taxblIncmPerDvddShr);
        return this;
    }

}
