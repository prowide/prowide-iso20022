
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Amount of money for which goods or services are offered, sold, or bought.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitPrice10", propOrder = {
    "tp",
    "xtndedTp",
    "val",
    "pricMtd",
    "nbOfDaysAcrd",
    "taxblIncmPerShr",
    "taxblIncmPerShrClctd",
    "xtndedTaxblIncmPerShrClctd",
    "pricDiffRsn"
})
public class UnitPrice10 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TypeOfPrice10Code tp;
    @XmlElement(name = "XtndedTp")
    protected String xtndedTp;
    @XmlElement(name = "Val", required = true)
    protected PriceValue1 val;
    @XmlElement(name = "PricMtd")
    @XmlSchemaType(name = "string")
    protected PriceMethod1Code pricMtd;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "TaxblIncmPerShr")
    protected ActiveCurrencyAnd13DecimalAmount taxblIncmPerShr;
    @XmlElement(name = "TaxblIncmPerShrClctd")
    @XmlSchemaType(name = "string")
    protected TaxableIncomePerShareCalculated2Code taxblIncmPerShrClctd;
    @XmlElement(name = "XtndedTaxblIncmPerShrClctd")
    protected String xtndedTaxblIncmPerShrClctd;
    @XmlElement(name = "PricDiffRsn")
    protected String pricDiffRsn;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice10Code }
     *     
     */
    public TypeOfPrice10Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice10Code }
     *     
     */
    public UnitPrice10 setTp(TypeOfPrice10Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedTp() {
        return xtndedTp;
    }

    /**
     * Sets the value of the xtndedTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnitPrice10 setXtndedTp(String value) {
        this.xtndedTp = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue1 }
     *     
     */
    public PriceValue1 getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue1 }
     *     
     */
    public UnitPrice10 setVal(PriceValue1 value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the pricMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PriceMethod1Code }
     *     
     */
    public PriceMethod1Code getPricMtd() {
        return pricMtd;
    }

    /**
     * Sets the value of the pricMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceMethod1Code }
     *     
     */
    public UnitPrice10 setPricMtd(PriceMethod1Code value) {
        this.pricMtd = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Sets the value of the nbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public UnitPrice10 setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerShr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTaxblIncmPerShr() {
        return taxblIncmPerShr;
    }

    /**
     * Sets the value of the taxblIncmPerShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public UnitPrice10 setTaxblIncmPerShr(ActiveCurrencyAnd13DecimalAmount value) {
        this.taxblIncmPerShr = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerShrClctd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableIncomePerShareCalculated2Code }
     *     
     */
    public TaxableIncomePerShareCalculated2Code getTaxblIncmPerShrClctd() {
        return taxblIncmPerShrClctd;
    }

    /**
     * Sets the value of the taxblIncmPerShrClctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableIncomePerShareCalculated2Code }
     *     
     */
    public UnitPrice10 setTaxblIncmPerShrClctd(TaxableIncomePerShareCalculated2Code value) {
        this.taxblIncmPerShrClctd = value;
        return this;
    }

    /**
     * Gets the value of the xtndedTaxblIncmPerShrClctd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedTaxblIncmPerShrClctd() {
        return xtndedTaxblIncmPerShrClctd;
    }

    /**
     * Sets the value of the xtndedTaxblIncmPerShrClctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnitPrice10 setXtndedTaxblIncmPerShrClctd(String value) {
        this.xtndedTaxblIncmPerShrClctd = value;
        return this;
    }

    /**
     * Gets the value of the pricDiffRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricDiffRsn() {
        return pricDiffRsn;
    }

    /**
     * Sets the value of the pricDiffRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnitPrice10 setPricDiffRsn(String value) {
        this.pricDiffRsn = value;
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

}
