
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
 * Information regarding the total amount of taxes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalTaxes4", propOrder = {
    "ttlAmtOfTaxs",
    "taxblIncmPerDvdd",
    "pctgOfDebtClm",
    "taxDtls"
})
public class TotalTaxes4 {

    @XmlElement(name = "TtlAmtOfTaxs")
    protected ActiveCurrencyAnd13DecimalAmount ttlAmtOfTaxs;
    @XmlElement(name = "TaxblIncmPerDvdd")
    protected ActiveCurrencyAndAmount taxblIncmPerDvdd;
    @XmlElement(name = "PctgOfDebtClm")
    protected BigDecimal pctgOfDebtClm;
    @XmlElement(name = "TaxDtls")
    protected List<Tax18> taxDtls;

    /**
     * Gets the value of the ttlAmtOfTaxs property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTtlAmtOfTaxs() {
        return ttlAmtOfTaxs;
    }

    /**
     * Sets the value of the ttlAmtOfTaxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public TotalTaxes4 setTtlAmtOfTaxs(ActiveCurrencyAnd13DecimalAmount value) {
        this.ttlAmtOfTaxs = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerDvdd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxblIncmPerDvdd() {
        return taxblIncmPerDvdd;
    }

    /**
     * Sets the value of the taxblIncmPerDvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TotalTaxes4 setTaxblIncmPerDvdd(ActiveCurrencyAndAmount value) {
        this.taxblIncmPerDvdd = value;
        return this;
    }

    /**
     * Gets the value of the pctgOfDebtClm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfDebtClm() {
        return pctgOfDebtClm;
    }

    /**
     * Sets the value of the pctgOfDebtClm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TotalTaxes4 setPctgOfDebtClm(BigDecimal value) {
        this.pctgOfDebtClm = value;
        return this;
    }

    /**
     * Gets the value of the taxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax18 }
     * 
     * 
     * @return
     *     The value of the taxDtls property.
     */
    public List<Tax18> getTaxDtls() {
        if (taxDtls == null) {
            taxDtls = new ArrayList<>();
        }
        return this.taxDtls;
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
     * Adds a new item to the taxDtls list.
     * @see #getTaxDtls()
     * 
     */
    public TotalTaxes4 addTaxDtls(Tax18 taxDtls) {
        getTaxDtls().add(taxDtls);
        return this;
    }

}
