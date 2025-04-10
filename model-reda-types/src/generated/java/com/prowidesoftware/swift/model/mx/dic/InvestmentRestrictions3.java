
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
 * Investment restrictions linked to the trading of an investment fund, or an alternative/hedge fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentRestrictions3", propOrder = {
    "minInitlSbcptAmt",
    "minInitlSbcptUnits",
    "minSbsqntSbcptAmt",
    "minSbsqntSbcptUnits",
    "maxRedAmt",
    "maxRedUnits",
    "minRedPctg",
    "othrRedRstrctns",
    "minSwtchSbcptAmt",
    "minSwtchSbcptUnits",
    "maxSwtchRedAmt",
    "maxSwtchRedUnits",
    "othrSwtchRstrctns",
    "minHldgAmt",
    "minHldgUnits",
    "minHldgPrd",
    "hldgTrfbl",
    "addtlInf"
})
public class InvestmentRestrictions3 {

    @XmlElement(name = "MinInitlSbcptAmt")
    protected ActiveCurrencyAndAmount minInitlSbcptAmt;
    @XmlElement(name = "MinInitlSbcptUnits")
    protected BigDecimal minInitlSbcptUnits;
    @XmlElement(name = "MinSbsqntSbcptAmt")
    protected ActiveCurrencyAndAmount minSbsqntSbcptAmt;
    @XmlElement(name = "MinSbsqntSbcptUnits")
    protected BigDecimal minSbsqntSbcptUnits;
    @XmlElement(name = "MaxRedAmt")
    protected ActiveCurrencyAndAmount maxRedAmt;
    @XmlElement(name = "MaxRedUnits")
    protected BigDecimal maxRedUnits;
    @XmlElement(name = "MinRedPctg")
    protected BigDecimal minRedPctg;
    @XmlElement(name = "OthrRedRstrctns")
    protected String othrRedRstrctns;
    @XmlElement(name = "MinSwtchSbcptAmt")
    protected ActiveCurrencyAndAmount minSwtchSbcptAmt;
    @XmlElement(name = "MinSwtchSbcptUnits")
    protected BigDecimal minSwtchSbcptUnits;
    @XmlElement(name = "MaxSwtchRedAmt")
    protected ActiveCurrencyAndAmount maxSwtchRedAmt;
    @XmlElement(name = "MaxSwtchRedUnits")
    protected BigDecimal maxSwtchRedUnits;
    @XmlElement(name = "OthrSwtchRstrctns")
    protected String othrSwtchRstrctns;
    @XmlElement(name = "MinHldgAmt")
    protected ActiveCurrencyAndAmount minHldgAmt;
    @XmlElement(name = "MinHldgUnits")
    protected BigDecimal minHldgUnits;
    @XmlElement(name = "MinHldgPrd")
    protected String minHldgPrd;
    @XmlElement(name = "HldgTrfbl")
    @XmlSchemaType(name = "string")
    protected HoldingTransferable1Code hldgTrfbl;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the minInitlSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinInitlSbcptAmt() {
        return minInitlSbcptAmt;
    }

    /**
     * Sets the value of the minInitlSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvestmentRestrictions3 setMinInitlSbcptAmt(ActiveCurrencyAndAmount value) {
        this.minInitlSbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the minInitlSbcptUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinInitlSbcptUnits() {
        return minInitlSbcptUnits;
    }

    /**
     * Sets the value of the minInitlSbcptUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentRestrictions3 setMinInitlSbcptUnits(BigDecimal value) {
        this.minInitlSbcptUnits = value;
        return this;
    }

    /**
     * Gets the value of the minSbsqntSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinSbsqntSbcptAmt() {
        return minSbsqntSbcptAmt;
    }

    /**
     * Sets the value of the minSbsqntSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvestmentRestrictions3 setMinSbsqntSbcptAmt(ActiveCurrencyAndAmount value) {
        this.minSbsqntSbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the minSbsqntSbcptUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinSbsqntSbcptUnits() {
        return minSbsqntSbcptUnits;
    }

    /**
     * Sets the value of the minSbsqntSbcptUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentRestrictions3 setMinSbsqntSbcptUnits(BigDecimal value) {
        this.minSbsqntSbcptUnits = value;
        return this;
    }

    /**
     * Gets the value of the maxRedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMaxRedAmt() {
        return maxRedAmt;
    }

    /**
     * Sets the value of the maxRedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvestmentRestrictions3 setMaxRedAmt(ActiveCurrencyAndAmount value) {
        this.maxRedAmt = value;
        return this;
    }

    /**
     * Gets the value of the maxRedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxRedUnits() {
        return maxRedUnits;
    }

    /**
     * Sets the value of the maxRedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentRestrictions3 setMaxRedUnits(BigDecimal value) {
        this.maxRedUnits = value;
        return this;
    }

    /**
     * Gets the value of the minRedPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinRedPctg() {
        return minRedPctg;
    }

    /**
     * Sets the value of the minRedPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentRestrictions3 setMinRedPctg(BigDecimal value) {
        this.minRedPctg = value;
        return this;
    }

    /**
     * Gets the value of the othrRedRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRedRstrctns() {
        return othrRedRstrctns;
    }

    /**
     * Sets the value of the othrRedRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentRestrictions3 setOthrRedRstrctns(String value) {
        this.othrRedRstrctns = value;
        return this;
    }

    /**
     * Gets the value of the minSwtchSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinSwtchSbcptAmt() {
        return minSwtchSbcptAmt;
    }

    /**
     * Sets the value of the minSwtchSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvestmentRestrictions3 setMinSwtchSbcptAmt(ActiveCurrencyAndAmount value) {
        this.minSwtchSbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the minSwtchSbcptUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinSwtchSbcptUnits() {
        return minSwtchSbcptUnits;
    }

    /**
     * Sets the value of the minSwtchSbcptUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentRestrictions3 setMinSwtchSbcptUnits(BigDecimal value) {
        this.minSwtchSbcptUnits = value;
        return this;
    }

    /**
     * Gets the value of the maxSwtchRedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMaxSwtchRedAmt() {
        return maxSwtchRedAmt;
    }

    /**
     * Sets the value of the maxSwtchRedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvestmentRestrictions3 setMaxSwtchRedAmt(ActiveCurrencyAndAmount value) {
        this.maxSwtchRedAmt = value;
        return this;
    }

    /**
     * Gets the value of the maxSwtchRedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxSwtchRedUnits() {
        return maxSwtchRedUnits;
    }

    /**
     * Sets the value of the maxSwtchRedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentRestrictions3 setMaxSwtchRedUnits(BigDecimal value) {
        this.maxSwtchRedUnits = value;
        return this;
    }

    /**
     * Gets the value of the othrSwtchRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrSwtchRstrctns() {
        return othrSwtchRstrctns;
    }

    /**
     * Sets the value of the othrSwtchRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentRestrictions3 setOthrSwtchRstrctns(String value) {
        this.othrSwtchRstrctns = value;
        return this;
    }

    /**
     * Gets the value of the minHldgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinHldgAmt() {
        return minHldgAmt;
    }

    /**
     * Sets the value of the minHldgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvestmentRestrictions3 setMinHldgAmt(ActiveCurrencyAndAmount value) {
        this.minHldgAmt = value;
        return this;
    }

    /**
     * Gets the value of the minHldgUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinHldgUnits() {
        return minHldgUnits;
    }

    /**
     * Sets the value of the minHldgUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentRestrictions3 setMinHldgUnits(BigDecimal value) {
        this.minHldgUnits = value;
        return this;
    }

    /**
     * Gets the value of the minHldgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinHldgPrd() {
        return minHldgPrd;
    }

    /**
     * Sets the value of the minHldgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentRestrictions3 setMinHldgPrd(String value) {
        this.minHldgPrd = value;
        return this;
    }

    /**
     * Gets the value of the hldgTrfbl property.
     * 
     * @return
     *     possible object is
     *     {@link HoldingTransferable1Code }
     *     
     */
    public HoldingTransferable1Code getHldgTrfbl() {
        return hldgTrfbl;
    }

    /**
     * Sets the value of the hldgTrfbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingTransferable1Code }
     *     
     */
    public InvestmentRestrictions3 setHldgTrfbl(HoldingTransferable1Code value) {
        this.hldgTrfbl = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public InvestmentRestrictions3 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
