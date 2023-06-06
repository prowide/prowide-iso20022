
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "UnitPrice15", propOrder = {
    "tp",
    "xtndedTp",
    "pricMtd",
    "valInInvstmtCcy",
    "valInAltrntvCcy",
    "forExctnInd",
    "cumDvddInd",
    "clctnBsis",
    "estmtdPricInd",
    "nbOfDaysAcrd",
    "taxblIncmPerShr",
    "taxblIncmPerShrClctd",
    "xtndedTaxblIncmPerShrClctd",
    "taxblIncmPerDvdd",
    "euDvddSts",
    "xtndedEUDvddSts",
    "chrgDtls",
    "taxLbltyDtls",
    "taxRfndDtls"
})
public class UnitPrice15 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TypeOfPrice9Code tp;
    @XmlElement(name = "XtndedTp")
    protected String xtndedTp;
    @XmlElement(name = "PricMtd")
    @XmlSchemaType(name = "string")
    protected PriceMethod1Code pricMtd;
    @XmlElement(name = "ValInInvstmtCcy", required = true)
    protected List<PriceValue1> valInInvstmtCcy;
    @XmlElement(name = "ValInAltrntvCcy")
    protected List<PriceValue1> valInAltrntvCcy;
    @XmlElement(name = "ForExctnInd")
    protected boolean forExctnInd;
    @XmlElement(name = "CumDvddInd")
    protected boolean cumDvddInd;
    @XmlElement(name = "ClctnBsis")
    protected BigDecimal clctnBsis;
    @XmlElement(name = "EstmtdPricInd")
    protected boolean estmtdPricInd;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "TaxblIncmPerShr")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount taxblIncmPerShr;
    @XmlElement(name = "TaxblIncmPerShrClctd")
    @XmlSchemaType(name = "string")
    protected TaxableIncomePerShareCalculated2Code taxblIncmPerShrClctd;
    @XmlElement(name = "XtndedTaxblIncmPerShrClctd")
    protected String xtndedTaxblIncmPerShrClctd;
    @XmlElement(name = "TaxblIncmPerDvdd")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount taxblIncmPerDvdd;
    @XmlElement(name = "EUDvddSts")
    @XmlSchemaType(name = "string")
    protected EUDividendStatus1Code euDvddSts;
    @XmlElement(name = "XtndedEUDvddSts")
    protected String xtndedEUDvddSts;
    @XmlElement(name = "ChrgDtls")
    protected List<Charge15> chrgDtls;
    @XmlElement(name = "TaxLbltyDtls")
    protected List<Tax17> taxLbltyDtls;
    @XmlElement(name = "TaxRfndDtls")
    protected List<Tax17> taxRfndDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice9Code }
     *     
     */
    public TypeOfPrice9Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice9Code }
     *     
     */
    public UnitPrice15 setTp(TypeOfPrice9Code value) {
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
    public UnitPrice15 setXtndedTp(String value) {
        this.xtndedTp = value;
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
    public UnitPrice15 setPricMtd(PriceMethod1Code value) {
        this.pricMtd = value;
        return this;
    }

    /**
     * Gets the value of the valInInvstmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the valInInvstmtCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValInInvstmtCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceValue1 }
     * 
     * 
     * @return
     *     The value of the valInInvstmtCcy property.
     */
    public List<PriceValue1> getValInInvstmtCcy() {
        if (valInInvstmtCcy == null) {
            valInInvstmtCcy = new ArrayList<>();
        }
        return this.valInInvstmtCcy;
    }

    /**
     * Gets the value of the valInAltrntvCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the valInAltrntvCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValInAltrntvCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceValue1 }
     * 
     * 
     * @return
     *     The value of the valInAltrntvCcy property.
     */
    public List<PriceValue1> getValInAltrntvCcy() {
        if (valInAltrntvCcy == null) {
            valInAltrntvCcy = new ArrayList<>();
        }
        return this.valInAltrntvCcy;
    }

    /**
     * Gets the value of the forExctnInd property.
     * 
     */
    public boolean isForExctnInd() {
        return forExctnInd;
    }

    /**
     * Sets the value of the forExctnInd property.
     * 
     */
    public UnitPrice15 setForExctnInd(boolean value) {
        this.forExctnInd = value;
        return this;
    }

    /**
     * Gets the value of the cumDvddInd property.
     * 
     */
    public boolean isCumDvddInd() {
        return cumDvddInd;
    }

    /**
     * Sets the value of the cumDvddInd property.
     * 
     */
    public UnitPrice15 setCumDvddInd(boolean value) {
        this.cumDvddInd = value;
        return this;
    }

    /**
     * Gets the value of the clctnBsis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClctnBsis() {
        return clctnBsis;
    }

    /**
     * Sets the value of the clctnBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public UnitPrice15 setClctnBsis(BigDecimal value) {
        this.clctnBsis = value;
        return this;
    }

    /**
     * Gets the value of the estmtdPricInd property.
     * 
     */
    public boolean isEstmtdPricInd() {
        return estmtdPricInd;
    }

    /**
     * Sets the value of the estmtdPricInd property.
     * 
     */
    public UnitPrice15 setEstmtdPricInd(boolean value) {
        this.estmtdPricInd = value;
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
    public UnitPrice15 setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerShr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getTaxblIncmPerShr() {
        return taxblIncmPerShr;
    }

    /**
     * Sets the value of the taxblIncmPerShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public UnitPrice15 setTaxblIncmPerShr(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
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
    public UnitPrice15 setTaxblIncmPerShrClctd(TaxableIncomePerShareCalculated2Code value) {
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
    public UnitPrice15 setXtndedTaxblIncmPerShrClctd(String value) {
        this.xtndedTaxblIncmPerShrClctd = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerDvdd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getTaxblIncmPerDvdd() {
        return taxblIncmPerDvdd;
    }

    /**
     * Sets the value of the taxblIncmPerDvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public UnitPrice15 setTaxblIncmPerDvdd(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.taxblIncmPerDvdd = value;
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
    public UnitPrice15 setEUDvddSts(EUDividendStatus1Code value) {
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
    public UnitPrice15 setXtndedEUDvddSts(String value) {
        this.xtndedEUDvddSts = value;
        return this;
    }

    /**
     * Gets the value of the chrgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charge15 }
     * 
     * 
     * @return
     *     The value of the chrgDtls property.
     */
    public List<Charge15> getChrgDtls() {
        if (chrgDtls == null) {
            chrgDtls = new ArrayList<>();
        }
        return this.chrgDtls;
    }

    /**
     * Gets the value of the taxLbltyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxLbltyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxLbltyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax17 }
     * 
     * 
     * @return
     *     The value of the taxLbltyDtls property.
     */
    public List<Tax17> getTaxLbltyDtls() {
        if (taxLbltyDtls == null) {
            taxLbltyDtls = new ArrayList<>();
        }
        return this.taxLbltyDtls;
    }

    /**
     * Gets the value of the taxRfndDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxRfndDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRfndDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax17 }
     * 
     * 
     * @return
     *     The value of the taxRfndDtls property.
     */
    public List<Tax17> getTaxRfndDtls() {
        if (taxRfndDtls == null) {
            taxRfndDtls = new ArrayList<>();
        }
        return this.taxRfndDtls;
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
     * Adds a new item to the valInInvstmtCcy list.
     * @see #getValInInvstmtCcy()
     * 
     */
    public UnitPrice15 addValInInvstmtCcy(PriceValue1 valInInvstmtCcy) {
        getValInInvstmtCcy().add(valInInvstmtCcy);
        return this;
    }

    /**
     * Adds a new item to the valInAltrntvCcy list.
     * @see #getValInAltrntvCcy()
     * 
     */
    public UnitPrice15 addValInAltrntvCcy(PriceValue1 valInAltrntvCcy) {
        getValInAltrntvCcy().add(valInAltrntvCcy);
        return this;
    }

    /**
     * Adds a new item to the chrgDtls list.
     * @see #getChrgDtls()
     * 
     */
    public UnitPrice15 addChrgDtls(Charge15 chrgDtls) {
        getChrgDtls().add(chrgDtls);
        return this;
    }

    /**
     * Adds a new item to the taxLbltyDtls list.
     * @see #getTaxLbltyDtls()
     * 
     */
    public UnitPrice15 addTaxLbltyDtls(Tax17 taxLbltyDtls) {
        getTaxLbltyDtls().add(taxLbltyDtls);
        return this;
    }

    /**
     * Adds a new item to the taxRfndDtls list.
     * @see #getTaxRfndDtls()
     * 
     */
    public UnitPrice15 addTaxRfndDtls(Tax17 taxRfndDtls) {
        getTaxRfndDtls().add(taxRfndDtls);
        return this;
    }

}
