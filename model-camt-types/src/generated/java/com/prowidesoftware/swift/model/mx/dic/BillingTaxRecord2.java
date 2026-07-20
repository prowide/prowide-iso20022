
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
 * Provides details for taxes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingTaxRecord2", propOrder = {
    "rate",
    "desc",
    "taxblAmt",
    "taxXmptn",
    "amt",
    "chrgsAndFees"
})
public class BillingTaxRecord2 {

    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "TaxblAmt", required = true)
    protected ActiveCurrencyAndAmount taxblAmt;
    @XmlElement(name = "TaxXmptn")
    protected List<TaxExemption1> taxXmptn;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "ChrgsAndFees")
    protected List<BillingFeeRecord1> chrgsAndFees;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BillingTaxRecord2 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingTaxRecord2 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the taxblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxblAmt() {
        return taxblAmt;
    }

    /**
     * Sets the value of the taxblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public BillingTaxRecord2 setTaxblAmt(ActiveCurrencyAndAmount value) {
        this.taxblAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxXmptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxXmptn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxXmptn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxExemption1 }
     * 
     * 
     * @return
     *     The value of the taxXmptn property.
     */
    public List<TaxExemption1> getTaxXmptn() {
        if (taxXmptn == null) {
            taxXmptn = new ArrayList<>();
        }
        return this.taxXmptn;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public BillingTaxRecord2 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAndFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrgsAndFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgsAndFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingFeeRecord1 }
     * 
     * 
     * @return
     *     The value of the chrgsAndFees property.
     */
    public List<BillingFeeRecord1> getChrgsAndFees() {
        if (chrgsAndFees == null) {
            chrgsAndFees = new ArrayList<>();
        }
        return this.chrgsAndFees;
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
     * Adds a new item to the taxXmptn list.
     * @see #getTaxXmptn()
     * 
     */
    public BillingTaxRecord2 addTaxXmptn(TaxExemption1 taxXmptn) {
        getTaxXmptn().add(taxXmptn);
        return this;
    }

    /**
     * Adds a new item to the chrgsAndFees list.
     * @see #getChrgsAndFees()
     * 
     */
    public BillingTaxRecord2 addChrgsAndFees(BillingFeeRecord1 chrgsAndFees) {
        getChrgsAndFees().add(chrgsAndFees);
        return this;
    }

}
