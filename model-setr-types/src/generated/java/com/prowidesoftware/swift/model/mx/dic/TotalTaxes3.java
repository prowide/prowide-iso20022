
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "TotalTaxes3", propOrder = {
    "ttlAmtOfTaxs",
    "taxblIncmPerDvdd",
    "euCptlGn",
    "xtndedEUCptlGn",
    "euDvddSts",
    "xtndedEUDvddSts",
    "pctgOfDebtClm",
    "taxDtls"
})
public class TotalTaxes3 {

    @XmlElement(name = "TtlAmtOfTaxs")
    protected ActiveCurrencyAnd13DecimalAmount ttlAmtOfTaxs;
    @XmlElement(name = "TaxblIncmPerDvdd")
    protected ActiveCurrencyAndAmount taxblIncmPerDvdd;
    @XmlElement(name = "EUCptlGn")
    @XmlSchemaType(name = "string")
    protected EUCapitalGain2Code euCptlGn;
    @XmlElement(name = "XtndedEUCptlGn")
    protected String xtndedEUCptlGn;
    @XmlElement(name = "EUDvddSts")
    @XmlSchemaType(name = "string")
    protected EUDividendStatus1Code euDvddSts;
    @XmlElement(name = "XtndedEUDvddSts")
    protected String xtndedEUDvddSts;
    @XmlElement(name = "PctgOfDebtClm")
    protected BigDecimal pctgOfDebtClm;
    @XmlElement(name = "TaxDtls")
    protected List<Tax14> taxDtls;

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
    public TotalTaxes3 setTtlAmtOfTaxs(ActiveCurrencyAnd13DecimalAmount value) {
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
    public TotalTaxes3 setTaxblIncmPerDvdd(ActiveCurrencyAndAmount value) {
        this.taxblIncmPerDvdd = value;
        return this;
    }

    /**
     * Gets the value of the euCptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link EUCapitalGain2Code }
     *     
     */
    public EUCapitalGain2Code getEUCptlGn() {
        return euCptlGn;
    }

    /**
     * Sets the value of the euCptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUCapitalGain2Code }
     *     
     */
    public TotalTaxes3 setEUCptlGn(EUCapitalGain2Code value) {
        this.euCptlGn = value;
        return this;
    }

    /**
     * Gets the value of the xtndedEUCptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedEUCptlGn() {
        return xtndedEUCptlGn;
    }

    /**
     * Sets the value of the xtndedEUCptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TotalTaxes3 setXtndedEUCptlGn(String value) {
        this.xtndedEUCptlGn = value;
        return this;
    }

    /**
     * Gets the value of the euDvddSts property.
     * 
     * @return
     *     possible object is
     *     {@link EUDividendStatus1Code }
     *     
     */
    public EUDividendStatus1Code getEUDvddSts() {
        return euDvddSts;
    }

    /**
     * Sets the value of the euDvddSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUDividendStatus1Code }
     *     
     */
    public TotalTaxes3 setEUDvddSts(EUDividendStatus1Code value) {
        this.euDvddSts = value;
        return this;
    }

    /**
     * Gets the value of the xtndedEUDvddSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedEUDvddSts() {
        return xtndedEUDvddSts;
    }

    /**
     * Sets the value of the xtndedEUDvddSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TotalTaxes3 setXtndedEUDvddSts(String value) {
        this.xtndedEUDvddSts = value;
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
    public TotalTaxes3 setPctgOfDebtClm(BigDecimal value) {
        this.pctgOfDebtClm = value;
        return this;
    }

    /**
     * Gets the value of the taxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDtls property.
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
     * {@link Tax14 }
     * 
     * 
     */
    public List<Tax14> getTaxDtls() {
        if (taxDtls == null) {
            taxDtls = new ArrayList<Tax14>();
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
    public TotalTaxes3 addTaxDtls(Tax14 taxDtls) {
        getTaxDtls().add(taxDtls);
        return this;
    }

}
