
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
 * Specifies security rate details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate128", propOrder = {
    "addtlQtyForSbcbdRsltntScties",
    "addtlQtyForExstgScties",
    "newToOd",
    "trfrmatnRate",
    "chrgsFees",
    "fsclStmp",
    "aplblRate",
    "taxCdtRate",
    "finTxTaxRate",
    "whldgTaxRate",
    "scndLvlTax"
})
public class CorporateActionRate128 {

    @XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
    protected RatioFormat17Choice addtlQtyForSbcbdRsltntScties;
    @XmlElement(name = "AddtlQtyForExstgScties")
    protected RatioFormat17Choice addtlQtyForExstgScties;
    @XmlElement(name = "NewToOd")
    protected RatioFormat18Choice newToOd;
    @XmlElement(name = "TrfrmatnRate")
    protected BigDecimal trfrmatnRate;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat57Choice chrgsFees;
    @XmlElement(name = "FsclStmp")
    protected RateFormat24Choice fsclStmp;
    @XmlElement(name = "AplblRate")
    protected RateFormat24Choice aplblRate;
    @XmlElement(name = "TaxCdtRate")
    protected RateFormat26Choice taxCdtRate;
    @XmlElement(name = "FinTxTaxRate")
    protected RateFormat24Choice finTxTaxRate;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat60Choice> whldgTaxRate;
    @XmlElement(name = "ScndLvlTax")
    protected List<RateAndAmountFormat60Choice> scndLvlTax;

    /**
     * Gets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat17Choice }
     *     
     */
    public RatioFormat17Choice getAddtlQtyForSbcbdRsltntScties() {
        return addtlQtyForSbcbdRsltntScties;
    }

    /**
     * Sets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat17Choice }
     *     
     */
    public CorporateActionRate128 setAddtlQtyForSbcbdRsltntScties(RatioFormat17Choice value) {
        this.addtlQtyForSbcbdRsltntScties = value;
        return this;
    }

    /**
     * Gets the value of the addtlQtyForExstgScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat17Choice }
     *     
     */
    public RatioFormat17Choice getAddtlQtyForExstgScties() {
        return addtlQtyForExstgScties;
    }

    /**
     * Sets the value of the addtlQtyForExstgScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat17Choice }
     *     
     */
    public CorporateActionRate128 setAddtlQtyForExstgScties(RatioFormat17Choice value) {
        this.addtlQtyForExstgScties = value;
        return this;
    }

    /**
     * Gets the value of the newToOd property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat18Choice }
     *     
     */
    public RatioFormat18Choice getNewToOd() {
        return newToOd;
    }

    /**
     * Sets the value of the newToOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat18Choice }
     *     
     */
    public CorporateActionRate128 setNewToOd(RatioFormat18Choice value) {
        this.newToOd = value;
        return this;
    }

    /**
     * Gets the value of the trfrmatnRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrfrmatnRate() {
        return trfrmatnRate;
    }

    /**
     * Sets the value of the trfrmatnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRate128 setTrfrmatnRate(BigDecimal value) {
        this.trfrmatnRate = value;
        return this;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat57Choice }
     *     
     */
    public RateAndAmountFormat57Choice getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat57Choice }
     *     
     */
    public CorporateActionRate128 setChrgsFees(RateAndAmountFormat57Choice value) {
        this.chrgsFees = value;
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
    public CorporateActionRate128 setFsclStmp(RateFormat24Choice value) {
        this.fsclStmp = value;
        return this;
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
    public CorporateActionRate128 setAplblRate(RateFormat24Choice value) {
        this.aplblRate = value;
        return this;
    }

    /**
     * Gets the value of the taxCdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat26Choice }
     *     
     */
    public RateFormat26Choice getTaxCdtRate() {
        return taxCdtRate;
    }

    /**
     * Sets the value of the taxCdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat26Choice }
     *     
     */
    public CorporateActionRate128 setTaxCdtRate(RateFormat26Choice value) {
        this.taxCdtRate = value;
        return this;
    }

    /**
     * Gets the value of the finTxTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat24Choice }
     *     
     */
    public RateFormat24Choice getFinTxTaxRate() {
        return finTxTaxRate;
    }

    /**
     * Sets the value of the finTxTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat24Choice }
     *     
     */
    public CorporateActionRate128 setFinTxTaxRate(RateFormat24Choice value) {
        this.finTxTaxRate = value;
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
     * {@link RateAndAmountFormat60Choice }
     * 
     * 
     * @return
     *     The value of the whldgTaxRate property.
     */
    public List<RateAndAmountFormat60Choice> getWhldgTaxRate() {
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
     * {@link RateAndAmountFormat60Choice }
     * 
     * 
     * @return
     *     The value of the scndLvlTax property.
     */
    public List<RateAndAmountFormat60Choice> getScndLvlTax() {
        if (scndLvlTax == null) {
            scndLvlTax = new ArrayList<>();
        }
        return this.scndLvlTax;
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
     * Adds a new item to the whldgTaxRate list.
     * @see #getWhldgTaxRate()
     * 
     */
    public CorporateActionRate128 addWhldgTaxRate(RateAndAmountFormat60Choice whldgTaxRate) {
        getWhldgTaxRate().add(whldgTaxRate);
        return this;
    }

    /**
     * Adds a new item to the scndLvlTax list.
     * @see #getScndLvlTax()
     * 
     */
    public CorporateActionRate128 addScndLvlTax(RateAndAmountFormat60Choice scndLvlTax) {
        getScndLvlTax().add(scndLvlTax);
        return this;
    }

}
