
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
@XmlType(name = "UnitPrice24", propOrder = {
    "pricTp",
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
    "taxblIncmPerDvdd",
    "euDvddSts",
    "chrgDtls",
    "taxLbltyDtls",
    "taxRfndDtls"
})
public class UnitPrice24 {

    @XmlElement(name = "PricTp", required = true)
    protected PriceType6Choice pricTp;
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
    protected TaxableIncomePerShareCalculated3Choice taxblIncmPerShrClctd;
    @XmlElement(name = "TaxblIncmPerDvdd")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount taxblIncmPerDvdd;
    @XmlElement(name = "EUDvddSts")
    protected EUDividendStatusType3Choice euDvddSts;
    @XmlElement(name = "ChrgDtls")
    protected List<Charge33> chrgDtls;
    @XmlElement(name = "TaxLbltyDtls")
    protected List<Tax43> taxLbltyDtls;
    @XmlElement(name = "TaxRfndDtls")
    protected List<Tax43> taxRfndDtls;

    /**
     * Gets the value of the pricTp property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType6Choice }
     *     
     */
    public PriceType6Choice getPricTp() {
        return pricTp;
    }

    /**
     * Sets the value of the pricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType6Choice }
     *     
     */
    public UnitPrice24 setPricTp(PriceType6Choice value) {
        this.pricTp = value;
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
    public UnitPrice24 setPricMtd(PriceMethod1Code value) {
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
    public UnitPrice24 setForExctnInd(boolean value) {
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
    public UnitPrice24 setCumDvddInd(boolean value) {
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
    public UnitPrice24 setClctnBsis(BigDecimal value) {
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
    public UnitPrice24 setEstmtdPricInd(boolean value) {
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
    public UnitPrice24 setNbOfDaysAcrd(BigDecimal value) {
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
    public UnitPrice24 setTaxblIncmPerShr(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.taxblIncmPerShr = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerShrClctd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableIncomePerShareCalculated3Choice }
     *     
     */
    public TaxableIncomePerShareCalculated3Choice getTaxblIncmPerShrClctd() {
        return taxblIncmPerShrClctd;
    }

    /**
     * Sets the value of the taxblIncmPerShrClctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableIncomePerShareCalculated3Choice }
     *     
     */
    public UnitPrice24 setTaxblIncmPerShrClctd(TaxableIncomePerShareCalculated3Choice value) {
        this.taxblIncmPerShrClctd = value;
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
    public UnitPrice24 setTaxblIncmPerDvdd(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.taxblIncmPerDvdd = value;
        return this;
    }

    /**
     * Gets the value of the euDvddSts property.
     * 
     * @return
     *     possible object is
     *     {@link EUDividendStatusType3Choice }
     *     
     */
    public EUDividendStatusType3Choice getEUDvddSts() {
        return euDvddSts;
    }

    /**
     * Sets the value of the euDvddSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUDividendStatusType3Choice }
     *     
     */
    public UnitPrice24 setEUDvddSts(EUDividendStatusType3Choice value) {
        this.euDvddSts = value;
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
     * {@link Charge33 }
     * 
     * 
     * @return
     *     The value of the chrgDtls property.
     */
    public List<Charge33> getChrgDtls() {
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
     * {@link Tax43 }
     * 
     * 
     * @return
     *     The value of the taxLbltyDtls property.
     */
    public List<Tax43> getTaxLbltyDtls() {
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
     * {@link Tax43 }
     * 
     * 
     * @return
     *     The value of the taxRfndDtls property.
     */
    public List<Tax43> getTaxRfndDtls() {
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
    public UnitPrice24 addValInInvstmtCcy(PriceValue1 valInInvstmtCcy) {
        getValInInvstmtCcy().add(valInInvstmtCcy);
        return this;
    }

    /**
     * Adds a new item to the valInAltrntvCcy list.
     * @see #getValInAltrntvCcy()
     * 
     */
    public UnitPrice24 addValInAltrntvCcy(PriceValue1 valInAltrntvCcy) {
        getValInAltrntvCcy().add(valInAltrntvCcy);
        return this;
    }

    /**
     * Adds a new item to the chrgDtls list.
     * @see #getChrgDtls()
     * 
     */
    public UnitPrice24 addChrgDtls(Charge33 chrgDtls) {
        getChrgDtls().add(chrgDtls);
        return this;
    }

    /**
     * Adds a new item to the taxLbltyDtls list.
     * @see #getTaxLbltyDtls()
     * 
     */
    public UnitPrice24 addTaxLbltyDtls(Tax43 taxLbltyDtls) {
        getTaxLbltyDtls().add(taxLbltyDtls);
        return this;
    }

    /**
     * Adds a new item to the taxRfndDtls list.
     * @see #getTaxRfndDtls()
     * 
     */
    public UnitPrice24 addTaxRfndDtls(Tax43 taxRfndDtls) {
        getTaxRfndDtls().add(taxRfndDtls);
        return this;
    }

}
