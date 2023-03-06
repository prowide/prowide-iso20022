
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
@XmlType(name = "Rate36", propOrder = {
    "addtlTax",
    "grssDvddRate",
    "intrstRateUsdForPmt",
    "whldgTaxRate",
    "scndLvlTax",
    "chrgsFees",
    "earlySlctnFeeRate",
    "fsclStmp",
    "thrdPtyIncntivRate",
    "netDvddRate",
    "aplblRate",
    "slctnFeeRate",
    "taxCdtRate",
    "taxOnIncm",
    "taxOnPrfts",
    "taxRclmRate",
    "equlstnRate",
    "dmdRate"
})
public class Rate36 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat37Choice addtlTax;
    @XmlElement(name = "GrssDvddRate")
    protected List<GrossDividendRateFormat38Choice> grssDvddRate;
    @XmlElement(name = "IntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat8Choice> intrstRateUsdForPmt;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat41Choice> whldgTaxRate;
    @XmlElement(name = "ScndLvlTax")
    protected List<RateAndAmountFormat41Choice> scndLvlTax;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat37Choice chrgsFees;
    @XmlElement(name = "EarlySlctnFeeRate")
    protected SolicitationFeeRateFormat7Choice earlySlctnFeeRate;
    @XmlElement(name = "FsclStmp")
    protected RateFormat3Choice fsclStmp;
    @XmlElement(name = "ThrdPtyIncntivRate")
    protected RateFormat20Choice thrdPtyIncntivRate;
    @XmlElement(name = "NetDvddRate")
    protected List<NetDividendRateFormat39Choice> netDvddRate;
    @XmlElement(name = "AplblRate")
    protected RateFormat3Choice aplblRate;
    @XmlElement(name = "SlctnFeeRate")
    protected SolicitationFeeRateFormat7Choice slctnFeeRate;
    @XmlElement(name = "TaxCdtRate")
    protected RateFormat20Choice taxCdtRate;
    @XmlElement(name = "TaxOnIncm")
    protected RateAndAmountFormat37Choice taxOnIncm;
    @XmlElement(name = "TaxOnPrfts")
    protected RateFormat3Choice taxOnPrfts;
    @XmlElement(name = "TaxRclmRate")
    protected RateFormat3Choice taxRclmRate;
    @XmlElement(name = "EqulstnRate")
    protected RateAndAmountFormat42Choice equlstnRate;
    @XmlElement(name = "DmdRate")
    protected List<RateAndAmountFormat51Choice> dmdRate;

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public RateAndAmountFormat37Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public Rate36 setAddtlTax(RateAndAmountFormat37Choice value) {
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
     * {@link GrossDividendRateFormat38Choice }
     * 
     * 
     */
    public List<GrossDividendRateFormat38Choice> getGrssDvddRate() {
        if (grssDvddRate == null) {
            grssDvddRate = new ArrayList<GrossDividendRateFormat38Choice>();
        }
        return this.grssDvddRate;
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
     * {@link InterestRateUsedForPaymentFormat8Choice }
     * 
     * 
     */
    public List<InterestRateUsedForPaymentFormat8Choice> getIntrstRateUsdForPmt() {
        if (intrstRateUsdForPmt == null) {
            intrstRateUsdForPmt = new ArrayList<InterestRateUsedForPaymentFormat8Choice>();
        }
        return this.intrstRateUsdForPmt;
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
     * {@link RateAndAmountFormat41Choice }
     * 
     * 
     */
    public List<RateAndAmountFormat41Choice> getWhldgTaxRate() {
        if (whldgTaxRate == null) {
            whldgTaxRate = new ArrayList<RateAndAmountFormat41Choice>();
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
     * {@link RateAndAmountFormat41Choice }
     * 
     * 
     */
    public List<RateAndAmountFormat41Choice> getScndLvlTax() {
        if (scndLvlTax == null) {
            scndLvlTax = new ArrayList<RateAndAmountFormat41Choice>();
        }
        return this.scndLvlTax;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public RateAndAmountFormat37Choice getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public Rate36 setChrgsFees(RateAndAmountFormat37Choice value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the earlySlctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat7Choice }
     *     
     */
    public SolicitationFeeRateFormat7Choice getEarlySlctnFeeRate() {
        return earlySlctnFeeRate;
    }

    /**
     * Sets the value of the earlySlctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat7Choice }
     *     
     */
    public Rate36 setEarlySlctnFeeRate(SolicitationFeeRateFormat7Choice value) {
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
    public Rate36 setFsclStmp(RateFormat3Choice value) {
        this.fsclStmp = value;
        return this;
    }

    /**
     * Gets the value of the thrdPtyIncntivRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat20Choice }
     *     
     */
    public RateFormat20Choice getThrdPtyIncntivRate() {
        return thrdPtyIncntivRate;
    }

    /**
     * Sets the value of the thrdPtyIncntivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat20Choice }
     *     
     */
    public Rate36 setThrdPtyIncntivRate(RateFormat20Choice value) {
        this.thrdPtyIncntivRate = value;
        return this;
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
     * {@link NetDividendRateFormat39Choice }
     * 
     * 
     */
    public List<NetDividendRateFormat39Choice> getNetDvddRate() {
        if (netDvddRate == null) {
            netDvddRate = new ArrayList<NetDividendRateFormat39Choice>();
        }
        return this.netDvddRate;
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
    public Rate36 setAplblRate(RateFormat3Choice value) {
        this.aplblRate = value;
        return this;
    }

    /**
     * Gets the value of the slctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat7Choice }
     *     
     */
    public SolicitationFeeRateFormat7Choice getSlctnFeeRate() {
        return slctnFeeRate;
    }

    /**
     * Sets the value of the slctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat7Choice }
     *     
     */
    public Rate36 setSlctnFeeRate(SolicitationFeeRateFormat7Choice value) {
        this.slctnFeeRate = value;
        return this;
    }

    /**
     * Gets the value of the taxCdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat20Choice }
     *     
     */
    public RateFormat20Choice getTaxCdtRate() {
        return taxCdtRate;
    }

    /**
     * Sets the value of the taxCdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat20Choice }
     *     
     */
    public Rate36 setTaxCdtRate(RateFormat20Choice value) {
        this.taxCdtRate = value;
        return this;
    }

    /**
     * Gets the value of the taxOnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public RateAndAmountFormat37Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public Rate36 setTaxOnIncm(RateAndAmountFormat37Choice value) {
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
    public Rate36 setTaxOnPrfts(RateFormat3Choice value) {
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
    public Rate36 setTaxRclmRate(RateFormat3Choice value) {
        this.taxRclmRate = value;
        return this;
    }

    /**
     * Gets the value of the equlstnRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat42Choice }
     *     
     */
    public RateAndAmountFormat42Choice getEqulstnRate() {
        return equlstnRate;
    }

    /**
     * Sets the value of the equlstnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat42Choice }
     *     
     */
    public Rate36 setEqulstnRate(RateAndAmountFormat42Choice value) {
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
     * {@link RateAndAmountFormat51Choice }
     * 
     * 
     */
    public List<RateAndAmountFormat51Choice> getDmdRate() {
        if (dmdRate == null) {
            dmdRate = new ArrayList<RateAndAmountFormat51Choice>();
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
     * Adds a new item to the grssDvddRate list.
     * @see #getGrssDvddRate()
     * 
     */
    public Rate36 addGrssDvddRate(GrossDividendRateFormat38Choice grssDvddRate) {
        getGrssDvddRate().add(grssDvddRate);
        return this;
    }

    /**
     * Adds a new item to the intrstRateUsdForPmt list.
     * @see #getIntrstRateUsdForPmt()
     * 
     */
    public Rate36 addIntrstRateUsdForPmt(InterestRateUsedForPaymentFormat8Choice intrstRateUsdForPmt) {
        getIntrstRateUsdForPmt().add(intrstRateUsdForPmt);
        return this;
    }

    /**
     * Adds a new item to the whldgTaxRate list.
     * @see #getWhldgTaxRate()
     * 
     */
    public Rate36 addWhldgTaxRate(RateAndAmountFormat41Choice whldgTaxRate) {
        getWhldgTaxRate().add(whldgTaxRate);
        return this;
    }

    /**
     * Adds a new item to the scndLvlTax list.
     * @see #getScndLvlTax()
     * 
     */
    public Rate36 addScndLvlTax(RateAndAmountFormat41Choice scndLvlTax) {
        getScndLvlTax().add(scndLvlTax);
        return this;
    }

    /**
     * Adds a new item to the netDvddRate list.
     * @see #getNetDvddRate()
     * 
     */
    public Rate36 addNetDvddRate(NetDividendRateFormat39Choice netDvddRate) {
        getNetDvddRate().add(netDvddRate);
        return this;
    }

    /**
     * Adds a new item to the dmdRate list.
     * @see #getDmdRate()
     * 
     */
    public Rate36 addDmdRate(RateAndAmountFormat51Choice dmdRate) {
        getDmdRate().add(dmdRate);
        return this;
    }

}
