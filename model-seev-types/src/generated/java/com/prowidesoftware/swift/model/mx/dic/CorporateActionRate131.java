
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
 * Specifies rates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate131", propOrder = {
    "grssDstrbtnRate",
    "netDstrbtnRate",
    "grssIntrstRateUsdForPmt",
    "maxAllwdOvrsbcptRate",
    "prratnRate",
    "whldgTaxRate",
    "scndLvlTax",
    "addtlTax",
    "taxblIncmPerDvddShr"
})
public class CorporateActionRate131 {

    @XmlElement(name = "GrssDstrbtnRate")
    protected List<GrossDividendRateFormat39Choice> grssDstrbtnRate;
    @XmlElement(name = "NetDstrbtnRate")
    protected List<NetDividendRateFormat41Choice> netDstrbtnRate;
    @XmlElement(name = "GrssIntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat19Choice> grssIntrstRateUsdForPmt;
    @XmlElement(name = "MaxAllwdOvrsbcptRate")
    protected BigDecimal maxAllwdOvrsbcptRate;
    @XmlElement(name = "PrratnRate")
    protected BigDecimal prratnRate;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat66Choice> whldgTaxRate;
    @XmlElement(name = "ScndLvlTax")
    protected List<RateAndAmountFormat66Choice> scndLvlTax;
    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat67Choice addtlTax;
    @XmlElement(name = "TaxblIncmPerDvddShr")
    protected List<RateTypeAndAmountAndStatus33> taxblIncmPerDvddShr;

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
     * {@link GrossDividendRateFormat39Choice }
     * 
     * 
     */
    public List<GrossDividendRateFormat39Choice> getGrssDstrbtnRate() {
        if (grssDstrbtnRate == null) {
            grssDstrbtnRate = new ArrayList<GrossDividendRateFormat39Choice>();
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
     * {@link NetDividendRateFormat41Choice }
     * 
     * 
     */
    public List<NetDividendRateFormat41Choice> getNetDstrbtnRate() {
        if (netDstrbtnRate == null) {
            netDstrbtnRate = new ArrayList<NetDividendRateFormat41Choice>();
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
    public CorporateActionRate131 setMaxAllwdOvrsbcptRate(BigDecimal value) {
        this.maxAllwdOvrsbcptRate = value;
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
    public CorporateActionRate131 setPrratnRate(BigDecimal value) {
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
    public CorporateActionRate131 setAddtlTax(RateAndAmountFormat67Choice value) {
        this.addtlTax = value;
        return this;
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
    public CorporateActionRate131 addGrssDstrbtnRate(GrossDividendRateFormat39Choice grssDstrbtnRate) {
        getGrssDstrbtnRate().add(grssDstrbtnRate);
        return this;
    }

    /**
     * Adds a new item to the netDstrbtnRate list.
     * @see #getNetDstrbtnRate()
     * 
     */
    public CorporateActionRate131 addNetDstrbtnRate(NetDividendRateFormat41Choice netDstrbtnRate) {
        getNetDstrbtnRate().add(netDstrbtnRate);
        return this;
    }

    /**
     * Adds a new item to the grssIntrstRateUsdForPmt list.
     * @see #getGrssIntrstRateUsdForPmt()
     * 
     */
    public CorporateActionRate131 addGrssIntrstRateUsdForPmt(InterestRateUsedForPaymentFormat19Choice grssIntrstRateUsdForPmt) {
        getGrssIntrstRateUsdForPmt().add(grssIntrstRateUsdForPmt);
        return this;
    }

    /**
     * Adds a new item to the whldgTaxRate list.
     * @see #getWhldgTaxRate()
     * 
     */
    public CorporateActionRate131 addWhldgTaxRate(RateAndAmountFormat66Choice whldgTaxRate) {
        getWhldgTaxRate().add(whldgTaxRate);
        return this;
    }

    /**
     * Adds a new item to the scndLvlTax list.
     * @see #getScndLvlTax()
     * 
     */
    public CorporateActionRate131 addScndLvlTax(RateAndAmountFormat66Choice scndLvlTax) {
        getScndLvlTax().add(scndLvlTax);
        return this;
    }

    /**
     * Adds a new item to the taxblIncmPerDvddShr list.
     * @see #getTaxblIncmPerDvddShr()
     * 
     */
    public CorporateActionRate131 addTaxblIncmPerDvddShr(RateTypeAndAmountAndStatus33 taxblIncmPerDvddShr) {
        getTaxblIncmPerDvddShr().add(taxblIncmPerDvddShr);
        return this;
    }

}
