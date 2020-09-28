
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
@XmlType(name = "CorporateActionRate37", propOrder = {
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
    "taxblIncmPerDvddShr"
})
public class CorporateActionRate37 {

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
    protected RateFormat6Choice maxAllwdOvrsbcptRate;
    @XmlElement(name = "PrratnRate")
    protected RateFormat6Choice prratnRate;
    @XmlElement(name = "WhldgTaxRate")
    protected RateFormat6Choice whldgTaxRate;
    @XmlElement(name = "WhldgOfFrgnTax")
    protected RateAndAmountFormat14Choice whldgOfFrgnTax;
    @XmlElement(name = "TaxRltdRate")
    protected List<RateTypeAndAmountAndStatus6> taxRltdRate;
    @XmlElement(name = "TaxblIncmPerDvddShr")
    protected List<RateTypeAndAmountAndStatus11> taxblIncmPerDvddShr;

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
    public CorporateActionRate37 setAddtlTax(RateAndAmountFormat14Choice value) {
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
    public CorporateActionRate37 setIndxFctr(RateAndAmountFormat14Choice value) {
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
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getMaxAllwdOvrsbcptRate() {
        return maxAllwdOvrsbcptRate;
    }

    /**
     * Sets the value of the maxAllwdOvrsbcptRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public CorporateActionRate37 setMaxAllwdOvrsbcptRate(RateFormat6Choice value) {
        this.maxAllwdOvrsbcptRate = value;
        return this;
    }

    /**
     * Gets the value of the prratnRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getPrratnRate() {
        return prratnRate;
    }

    /**
     * Sets the value of the prratnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public CorporateActionRate37 setPrratnRate(RateFormat6Choice value) {
        this.prratnRate = value;
        return this;
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
    public CorporateActionRate37 setWhldgTaxRate(RateFormat6Choice value) {
        this.whldgTaxRate = value;
        return this;
    }

    /**
     * Gets the value of the whldgOfFrgnTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public RateAndAmountFormat14Choice getWhldgOfFrgnTax() {
        return whldgOfFrgnTax;
    }

    /**
     * Sets the value of the whldgOfFrgnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat14Choice }
     *     
     */
    public CorporateActionRate37 setWhldgOfFrgnTax(RateAndAmountFormat14Choice value) {
        this.whldgOfFrgnTax = value;
        return this;
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
    public CorporateActionRate37 addGrssDvddRate(GrossDividendRateFormat9Choice grssDvddRate) {
        getGrssDvddRate().add(grssDvddRate);
        return this;
    }

    /**
     * Adds a new item to the netDvddRate list.
     * @see #getNetDvddRate()
     * 
     */
    public CorporateActionRate37 addNetDvddRate(NetDividendRateFormat11Choice netDvddRate) {
        getNetDvddRate().add(netDvddRate);
        return this;
    }

    /**
     * Adds a new item to the intrstRateUsdForPmt list.
     * @see #getIntrstRateUsdForPmt()
     * 
     */
    public CorporateActionRate37 addIntrstRateUsdForPmt(InterestRateUsedForPaymentFormat5Choice intrstRateUsdForPmt) {
        getIntrstRateUsdForPmt().add(intrstRateUsdForPmt);
        return this;
    }

    /**
     * Adds a new item to the taxRltdRate list.
     * @see #getTaxRltdRate()
     * 
     */
    public CorporateActionRate37 addTaxRltdRate(RateTypeAndAmountAndStatus6 taxRltdRate) {
        getTaxRltdRate().add(taxRltdRate);
        return this;
    }

    /**
     * Adds a new item to the taxblIncmPerDvddShr list.
     * @see #getTaxblIncmPerDvddShr()
     * 
     */
    public CorporateActionRate37 addTaxblIncmPerDvddShr(RateTypeAndAmountAndStatus11 taxblIncmPerDvddShr) {
        getTaxblIncmPerDvddShr().add(taxblIncmPerDvddShr);
        return this;
    }

}
