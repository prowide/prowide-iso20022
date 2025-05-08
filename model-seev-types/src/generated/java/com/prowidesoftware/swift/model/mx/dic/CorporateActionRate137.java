
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
@XmlType(name = "CorporateActionRate137", propOrder = {
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
public class CorporateActionRate137 {

    @XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
    protected RatioFormat23Choice addtlQtyForSbcbdRsltntScties;
    @XmlElement(name = "AddtlQtyForExstgScties")
    protected RatioFormat23Choice addtlQtyForExstgScties;
    @XmlElement(name = "NewToOd")
    protected RatioFormat24Choice newToOd;
    @XmlElement(name = "TrfrmatnRate")
    protected BigDecimal trfrmatnRate;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat72Choice chrgsFees;
    @XmlElement(name = "FsclStmp")
    protected RateFormat24Choice fsclStmp;
    @XmlElement(name = "AplblRate")
    protected RateFormat24Choice aplblRate;
    @XmlElement(name = "TaxCdtRate")
    protected RateFormat30Choice taxCdtRate;
    @XmlElement(name = "FinTxTaxRate")
    protected RateFormat24Choice finTxTaxRate;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat76Choice> whldgTaxRate;
    @XmlElement(name = "ScndLvlTax")
    protected List<RateAndAmountFormat76Choice> scndLvlTax;

    /**
     * Gets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat23Choice }
     *     
     */
    public RatioFormat23Choice getAddtlQtyForSbcbdRsltntScties() {
        return addtlQtyForSbcbdRsltntScties;
    }

    /**
     * Sets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat23Choice }
     *     
     */
    public CorporateActionRate137 setAddtlQtyForSbcbdRsltntScties(RatioFormat23Choice value) {
        this.addtlQtyForSbcbdRsltntScties = value;
        return this;
    }

    /**
     * Gets the value of the addtlQtyForExstgScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat23Choice }
     *     
     */
    public RatioFormat23Choice getAddtlQtyForExstgScties() {
        return addtlQtyForExstgScties;
    }

    /**
     * Sets the value of the addtlQtyForExstgScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat23Choice }
     *     
     */
    public CorporateActionRate137 setAddtlQtyForExstgScties(RatioFormat23Choice value) {
        this.addtlQtyForExstgScties = value;
        return this;
    }

    /**
     * Gets the value of the newToOd property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat24Choice }
     *     
     */
    public RatioFormat24Choice getNewToOd() {
        return newToOd;
    }

    /**
     * Sets the value of the newToOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat24Choice }
     *     
     */
    public CorporateActionRate137 setNewToOd(RatioFormat24Choice value) {
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
    public CorporateActionRate137 setTrfrmatnRate(BigDecimal value) {
        this.trfrmatnRate = value;
        return this;
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
    public CorporateActionRate137 setChrgsFees(RateAndAmountFormat72Choice value) {
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
    public CorporateActionRate137 setFsclStmp(RateFormat24Choice value) {
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
    public CorporateActionRate137 setAplblRate(RateFormat24Choice value) {
        this.aplblRate = value;
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
    public CorporateActionRate137 setTaxCdtRate(RateFormat30Choice value) {
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
    public CorporateActionRate137 setFinTxTaxRate(RateFormat24Choice value) {
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
    public CorporateActionRate137 addWhldgTaxRate(RateAndAmountFormat76Choice whldgTaxRate) {
        getWhldgTaxRate().add(whldgTaxRate);
        return this;
    }

    /**
     * Adds a new item to the scndLvlTax list.
     * @see #getScndLvlTax()
     * 
     */
    public CorporateActionRate137 addScndLvlTax(RateAndAmountFormat76Choice scndLvlTax) {
        getScndLvlTax().add(scndLvlTax);
        return this;
    }

}
