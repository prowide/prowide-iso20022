
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Specifies rates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate108", propOrder = {
    "grssDvddRate",
    "netDvddRate",
    "intrstRateUsdForPmt",
    "maxAllwdOvrsbcptRate",
    "prratnRate",
    "whldgTaxRate",
    "scndLvlTax",
    "addtlTax",
    "taxblIncmPerDvddShr"
})
public class CorporateActionRate108 {

    @XmlElement(name = "GrssDvddRate")
    protected List<GrossDividendRateFormat39Choice> grssDvddRate;
    @XmlElement(name = "NetDvddRate")
    protected List<NetDividendRateFormat41Choice> netDvddRate;
    @XmlElement(name = "IntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat9Choice> intrstRateUsdForPmt;
    @XmlElement(name = "MaxAllwdOvrsbcptRate")
    protected BigDecimal maxAllwdOvrsbcptRate;
    @XmlElement(name = "PrratnRate")
    protected BigDecimal prratnRate;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat45Choice> whldgTaxRate;
    @XmlElement(name = "ScndLvlTax")
    protected List<RateAndAmountFormat45Choice> scndLvlTax;
    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat43Choice addtlTax;
    @XmlElement(name = "TaxblIncmPerDvddShr")
    protected List<RateTypeAndAmountAndStatus33> taxblIncmPerDvddShr;

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
     * {@link GrossDividendRateFormat39Choice }
     * 
     * 
     */
    public List<GrossDividendRateFormat39Choice> getGrssDvddRate() {
        if (grssDvddRate == null) {
            grssDvddRate = new ArrayList<GrossDividendRateFormat39Choice>();
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
     * {@link NetDividendRateFormat41Choice }
     * 
     * 
     */
    public List<NetDividendRateFormat41Choice> getNetDvddRate() {
        if (netDvddRate == null) {
            netDvddRate = new ArrayList<NetDividendRateFormat41Choice>();
        }
        return this.netDvddRate;
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
     * {@link InterestRateUsedForPaymentFormat9Choice }
     * 
     * 
     */
    public List<InterestRateUsedForPaymentFormat9Choice> getIntrstRateUsdForPmt() {
        if (intrstRateUsdForPmt == null) {
            intrstRateUsdForPmt = new ArrayList<InterestRateUsedForPaymentFormat9Choice>();
        }
        return this.intrstRateUsdForPmt;
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
    public CorporateActionRate108 setMaxAllwdOvrsbcptRate(BigDecimal value) {
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
    public CorporateActionRate108 setPrratnRate(BigDecimal value) {
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
     * {@link RateAndAmountFormat45Choice }
     * 
     * 
     */
    public List<RateAndAmountFormat45Choice> getWhldgTaxRate() {
        if (whldgTaxRate == null) {
            whldgTaxRate = new ArrayList<RateAndAmountFormat45Choice>();
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
     * {@link RateAndAmountFormat45Choice }
     * 
     * 
     */
    public List<RateAndAmountFormat45Choice> getScndLvlTax() {
        if (scndLvlTax == null) {
            scndLvlTax = new ArrayList<RateAndAmountFormat45Choice>();
        }
        return this.scndLvlTax;
    }

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public RateAndAmountFormat43Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public CorporateActionRate108 setAddtlTax(RateAndAmountFormat43Choice value) {
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
     * Adds a new item to the grssDvddRate list.
     * @see #getGrssDvddRate()
     * 
     */
    public CorporateActionRate108 addGrssDvddRate(GrossDividendRateFormat39Choice grssDvddRate) {
        getGrssDvddRate().add(grssDvddRate);
        return this;
    }

    /**
     * Adds a new item to the netDvddRate list.
     * @see #getNetDvddRate()
     * 
     */
    public CorporateActionRate108 addNetDvddRate(NetDividendRateFormat41Choice netDvddRate) {
        getNetDvddRate().add(netDvddRate);
        return this;
    }

    /**
     * Adds a new item to the intrstRateUsdForPmt list.
     * @see #getIntrstRateUsdForPmt()
     * 
     */
    public CorporateActionRate108 addIntrstRateUsdForPmt(InterestRateUsedForPaymentFormat9Choice intrstRateUsdForPmt) {
        getIntrstRateUsdForPmt().add(intrstRateUsdForPmt);
        return this;
    }

    /**
     * Adds a new item to the whldgTaxRate list.
     * @see #getWhldgTaxRate()
     * 
     */
    public CorporateActionRate108 addWhldgTaxRate(RateAndAmountFormat45Choice whldgTaxRate) {
        getWhldgTaxRate().add(whldgTaxRate);
        return this;
    }

    /**
     * Adds a new item to the scndLvlTax list.
     * @see #getScndLvlTax()
     * 
     */
    public CorporateActionRate108 addScndLvlTax(RateAndAmountFormat45Choice scndLvlTax) {
        getScndLvlTax().add(scndLvlTax);
        return this;
    }

    /**
     * Adds a new item to the taxblIncmPerDvddShr list.
     * @see #getTaxblIncmPerDvddShr()
     * 
     */
    public CorporateActionRate108 addTaxblIncmPerDvddShr(RateTypeAndAmountAndStatus33 taxblIncmPerDvddShr) {
        getTaxblIncmPerDvddShr().add(taxblIncmPerDvddShr);
        return this;
    }

}
