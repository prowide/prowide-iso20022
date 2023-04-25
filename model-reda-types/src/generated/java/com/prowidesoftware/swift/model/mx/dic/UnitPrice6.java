
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
@XmlType(name = "UnitPrice6", propOrder = {
    "tp",
    "pricMtd",
    "valInInvstmtCcy",
    "valInAltrntvCcy",
    "forExctnInd",
    "cumDvddInd",
    "clctnBsis",
    "nbOfDaysAcrd",
    "taxblIncmPerShr",
    "taxblIncmPerShrClctd",
    "chrgDtls",
    "taxLbltyDtls",
    "taxRfndDtls"
})
public class UnitPrice6 {

    @XmlElement(name = "Tp", required = true)
    protected PriceType2 tp;
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
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "TaxblIncmPerShr")
    protected AmountPrice1Choice taxblIncmPerShr;
    @XmlElement(name = "TaxblIncmPerShrClctd")
    protected TaxableIncomePerShareCalculated1 taxblIncmPerShrClctd;
    @XmlElement(name = "ChrgDtls")
    protected List<Charge9> chrgDtls;
    @XmlElement(name = "TaxLbltyDtls")
    protected List<Tax8> taxLbltyDtls;
    @XmlElement(name = "TaxRfndDtls")
    protected List<Tax8> taxRfndDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType2 }
     *     
     */
    public PriceType2 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType2 }
     *     
     */
    public UnitPrice6 setTp(PriceType2 value) {
        this.tp = value;
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
    public UnitPrice6 setPricMtd(PriceMethod1Code value) {
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
    public UnitPrice6 setForExctnInd(boolean value) {
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
    public UnitPrice6 setCumDvddInd(boolean value) {
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
    public UnitPrice6 setClctnBsis(BigDecimal value) {
        this.clctnBsis = value;
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
    public UnitPrice6 setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerShr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice1Choice }
     *     
     */
    public AmountPrice1Choice getTaxblIncmPerShr() {
        return taxblIncmPerShr;
    }

    /**
     * Sets the value of the taxblIncmPerShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice1Choice }
     *     
     */
    public UnitPrice6 setTaxblIncmPerShr(AmountPrice1Choice value) {
        this.taxblIncmPerShr = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerShrClctd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableIncomePerShareCalculated1 }
     *     
     */
    public TaxableIncomePerShareCalculated1 getTaxblIncmPerShrClctd() {
        return taxblIncmPerShrClctd;
    }

    /**
     * Sets the value of the taxblIncmPerShrClctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableIncomePerShareCalculated1 }
     *     
     */
    public UnitPrice6 setTaxblIncmPerShrClctd(TaxableIncomePerShareCalculated1 value) {
        this.taxblIncmPerShrClctd = value;
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
     * {@link Charge9 }
     * 
     * 
     * @return
     *     The value of the chrgDtls property.
     */
    public List<Charge9> getChrgDtls() {
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
     * {@link Tax8 }
     * 
     * 
     * @return
     *     The value of the taxLbltyDtls property.
     */
    public List<Tax8> getTaxLbltyDtls() {
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
     * {@link Tax8 }
     * 
     * 
     * @return
     *     The value of the taxRfndDtls property.
     */
    public List<Tax8> getTaxRfndDtls() {
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
    public UnitPrice6 addValInInvstmtCcy(PriceValue1 valInInvstmtCcy) {
        getValInInvstmtCcy().add(valInInvstmtCcy);
        return this;
    }

    /**
     * Adds a new item to the valInAltrntvCcy list.
     * @see #getValInAltrntvCcy()
     * 
     */
    public UnitPrice6 addValInAltrntvCcy(PriceValue1 valInAltrntvCcy) {
        getValInAltrntvCcy().add(valInAltrntvCcy);
        return this;
    }

    /**
     * Adds a new item to the chrgDtls list.
     * @see #getChrgDtls()
     * 
     */
    public UnitPrice6 addChrgDtls(Charge9 chrgDtls) {
        getChrgDtls().add(chrgDtls);
        return this;
    }

    /**
     * Adds a new item to the taxLbltyDtls list.
     * @see #getTaxLbltyDtls()
     * 
     */
    public UnitPrice6 addTaxLbltyDtls(Tax8 taxLbltyDtls) {
        getTaxLbltyDtls().add(taxLbltyDtls);
        return this;
    }

    /**
     * Adds a new item to the taxRfndDtls list.
     * @see #getTaxRfndDtls()
     * 
     */
    public UnitPrice6 addTaxRfndDtls(Tax8 taxRfndDtls) {
        getTaxRfndDtls().add(taxRfndDtls);
        return this;
    }

}
