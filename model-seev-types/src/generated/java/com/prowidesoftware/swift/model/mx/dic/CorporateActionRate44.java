
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
@XmlType(name = "CorporateActionRate44", propOrder = {
    "addtlTax",
    "grssDvddRate",
    "netDvddRate",
    "indxFctr",
    "intrstRateUsdForPmt",
    "maxAllwdOvrsbcptRate",
    "prratnRate",
    "whldgTaxRate",
    "whldgOfFrgnTax",
    "taxRltdRate",
    "taxblIncmPerDvddShr",
    "issrDclrdXchgRate",
    "taxOnIncm"
})
public class CorporateActionRate44 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat14Choice addtlTax;
    @XmlElement(name = "GrssDvddRate")
    protected List<GrossDividendRateFormat9Choice> grssDvddRate;
    @XmlElement(name = "NetDvddRate")
    protected List<NetDividendRateFormat11Choice> netDvddRate;
    @XmlElement(name = "IndxFctr")
    protected RateAndAmountFormat14Choice indxFctr;
    @XmlElement(name = "IntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat5Choice> intrstRateUsdForPmt;
    @XmlElement(name = "MaxAllwdOvrsbcptRate")
    protected RateFormat3Choice maxAllwdOvrsbcptRate;
    @XmlElement(name = "PrratnRate")
    protected RateFormat3Choice prratnRate;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateFormat10Choice> whldgTaxRate;
    @XmlElement(name = "WhldgOfFrgnTax")
    protected List<RateAndAmountFormat20Choice> whldgOfFrgnTax;
    @XmlElement(name = "TaxRltdRate")
    protected List<RateTypeAndAmountAndStatus6> taxRltdRate;
    @XmlElement(name = "TaxblIncmPerDvddShr")
    protected List<RateTypeAndAmountAndStatus11> taxblIncmPerDvddShr;
    @XmlElement(name = "IssrDclrdXchgRate")
    protected ForeignExchangeTerms19 issrDclrdXchgRate;
    @XmlElement(name = "TaxOnIncm")
    protected RateAndAmountFormat14Choice taxOnIncm;

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public RateAndAmountFormat14Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public CorporateActionRate44 setAddtlTax(RateAndAmountFormat14Choice value) {
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
     * {@link GrossDividendRateFormat9Choice }
     * 
     * 
     */
    public List<GrossDividendRateFormat9Choice> getGrssDvddRate() {
        if (grssDvddRate == null) {
            grssDvddRate = new ArrayList<GrossDividendRateFormat9Choice>();
        }
        return this.grssDvddRate;
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
     * {@link NetDividendRateFormat11Choice }
     * 
     * 
     */
    public List<NetDividendRateFormat11Choice> getNetDvddRate() {
        if (netDvddRate == null) {
            netDvddRate = new ArrayList<NetDividendRateFormat11Choice>();
        }
        return this.netDvddRate;
    }

    /**
     * Gets the value of the indxFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public RateAndAmountFormat14Choice getIndxFctr() {
        return indxFctr;
    }

    /**
     * Sets the value of the indxFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public CorporateActionRate44 setIndxFctr(RateAndAmountFormat14Choice value) {
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
     * {@link InterestRateUsedForPaymentFormat5Choice }
     * 
     * 
     */
    public List<InterestRateUsedForPaymentFormat5Choice> getIntrstRateUsdForPmt() {
        if (intrstRateUsdForPmt == null) {
            intrstRateUsdForPmt = new ArrayList<InterestRateUsedForPaymentFormat5Choice>();
        }
        return this.intrstRateUsdForPmt;
    }

    /**
     * Gets the value of the maxAllwdOvrsbcptRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getMaxAllwdOvrsbcptRate() {
        return maxAllwdOvrsbcptRate;
    }

    /**
     * Sets the value of the maxAllwdOvrsbcptRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public CorporateActionRate44 setMaxAllwdOvrsbcptRate(RateFormat3Choice value) {
        this.maxAllwdOvrsbcptRate = value;
        return this;
    }

    /**
     * Gets the value of the prratnRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getPrratnRate() {
        return prratnRate;
    }

    /**
     * Sets the value of the prratnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public CorporateActionRate44 setPrratnRate(RateFormat3Choice value) {
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
     * {@link RateFormat10Choice }
     * 
     * 
     */
    public List<RateFormat10Choice> getWhldgTaxRate() {
        if (whldgTaxRate == null) {
            whldgTaxRate = new ArrayList<RateFormat10Choice>();
        }
        return this.whldgTaxRate;
    }

    /**
     * Gets the value of the whldgOfFrgnTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whldgOfFrgnTax property.
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
     * {@link RateAndAmountFormat20Choice }
     * 
     * 
     */
    public List<RateAndAmountFormat20Choice> getWhldgOfFrgnTax() {
        if (whldgOfFrgnTax == null) {
            whldgOfFrgnTax = new ArrayList<RateAndAmountFormat20Choice>();
        }
        return this.whldgOfFrgnTax;
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
     * {@link RateTypeAndAmountAndStatus11 }
     * 
     * 
     */
    public List<RateTypeAndAmountAndStatus11> getTaxblIncmPerDvddShr() {
        if (taxblIncmPerDvddShr == null) {
            taxblIncmPerDvddShr = new ArrayList<RateTypeAndAmountAndStatus11>();
        }
        return this.taxblIncmPerDvddShr;
    }

    /**
     * Gets the value of the issrDclrdXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms19 }
     *     
     */
    public ForeignExchangeTerms19 getIssrDclrdXchgRate() {
        return issrDclrdXchgRate;
    }

    /**
     * Sets the value of the issrDclrdXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms19 }
     *     
     */
    public CorporateActionRate44 setIssrDclrdXchgRate(ForeignExchangeTerms19 value) {
        this.issrDclrdXchgRate = value;
        return this;
    }

    /**
     * Gets the value of the taxOnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public RateAndAmountFormat14Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public CorporateActionRate44 setTaxOnIncm(RateAndAmountFormat14Choice value) {
        this.taxOnIncm = value;
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
    public CorporateActionRate44 addGrssDvddRate(GrossDividendRateFormat9Choice grssDvddRate) {
        getGrssDvddRate().add(grssDvddRate);
        return this;
    }

    /**
     * Adds a new item to the netDvddRate list.
     * @see #getNetDvddRate()
     * 
     */
    public CorporateActionRate44 addNetDvddRate(NetDividendRateFormat11Choice netDvddRate) {
        getNetDvddRate().add(netDvddRate);
        return this;
    }

    /**
     * Adds a new item to the intrstRateUsdForPmt list.
     * @see #getIntrstRateUsdForPmt()
     * 
     */
    public CorporateActionRate44 addIntrstRateUsdForPmt(InterestRateUsedForPaymentFormat5Choice intrstRateUsdForPmt) {
        getIntrstRateUsdForPmt().add(intrstRateUsdForPmt);
        return this;
    }

    /**
     * Adds a new item to the whldgTaxRate list.
     * @see #getWhldgTaxRate()
     * 
     */
    public CorporateActionRate44 addWhldgTaxRate(RateFormat10Choice whldgTaxRate) {
        getWhldgTaxRate().add(whldgTaxRate);
        return this;
    }

    /**
     * Adds a new item to the whldgOfFrgnTax list.
     * @see #getWhldgOfFrgnTax()
     * 
     */
    public CorporateActionRate44 addWhldgOfFrgnTax(RateAndAmountFormat20Choice whldgOfFrgnTax) {
        getWhldgOfFrgnTax().add(whldgOfFrgnTax);
        return this;
    }

    /**
     * Adds a new item to the taxRltdRate list.
     * @see #getTaxRltdRate()
     * 
     */
    public CorporateActionRate44 addTaxRltdRate(RateTypeAndAmountAndStatus6 taxRltdRate) {
        getTaxRltdRate().add(taxRltdRate);
        return this;
    }

    /**
     * Adds a new item to the taxblIncmPerDvddShr list.
     * @see #getTaxblIncmPerDvddShr()
     * 
     */
    public CorporateActionRate44 addTaxblIncmPerDvddShr(RateTypeAndAmountAndStatus11 taxblIncmPerDvddShr) {
        getTaxblIncmPerDvddShr().add(taxblIncmPerDvddShr);
        return this;
    }

}
