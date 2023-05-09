
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about the tax voucher.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxVoucher1", propOrder = {
    "taxVchrRate",
    "taxCdt",
    "taxDdctn",
    "grssAmt",
    "netAmt",
    "rcrdDtHldg",
    "taxCdtRate",
    "whldgTaxAmt",
    "whldgTaxRate",
    "scripDvddRinvstmtPricPerShr",
    "cshAmtBrghtFwd",
    "alltdShrsCost",
    "cshAmtCrrdFwd",
    "ntnlTax",
    "ntnlDvddPybl",
    "brgnDt",
    "brgnSttlmDt",
    "stmpDtyAmt",
    "chrgAmt",
    "comssnAmt",
    "fxDtls"
})
public class TaxVoucher1 {

    @XmlElement(name = "TaxVchrRate", required = true)
    protected BigDecimal taxVchrRate;
    @XmlElement(name = "TaxCdt")
    protected ActiveCurrencyAndAmount taxCdt;
    @XmlElement(name = "TaxDdctn")
    protected ActiveCurrencyAndAmount taxDdctn;
    @XmlElement(name = "GrssAmt", required = true)
    protected ActiveCurrencyAndAmount grssAmt;
    @XmlElement(name = "NetAmt", required = true)
    protected ActiveCurrencyAndAmount netAmt;
    @XmlElement(name = "RcrdDtHldg", required = true)
    protected UnitOrFaceAmount1Choice rcrdDtHldg;
    @XmlElement(name = "TaxCdtRate")
    protected BigDecimal taxCdtRate;
    @XmlElement(name = "WhldgTaxAmt")
    protected ActiveCurrencyAndAmount whldgTaxAmt;
    @XmlElement(name = "WhldgTaxRate")
    protected BigDecimal whldgTaxRate;
    @XmlElement(name = "ScripDvddRinvstmtPricPerShr")
    protected PriceValue1 scripDvddRinvstmtPricPerShr;
    @XmlElement(name = "CshAmtBrghtFwd")
    protected ActiveCurrencyAndAmount cshAmtBrghtFwd;
    @XmlElement(name = "AlltdShrsCost")
    protected PriceValue1 alltdShrsCost;
    @XmlElement(name = "CshAmtCrrdFwd")
    protected ActiveCurrencyAndAmount cshAmtCrrdFwd;
    @XmlElement(name = "NtnlTax")
    protected ActiveCurrencyAndAmount ntnlTax;
    @XmlElement(name = "NtnlDvddPybl")
    protected ActiveCurrencyAndAmount ntnlDvddPybl;
    @XmlElement(name = "BrgnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate brgnDt;
    @XmlElement(name = "BrgnSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate brgnSttlmDt;
    @XmlElement(name = "StmpDtyAmt")
    protected ActiveCurrencyAndAmount stmpDtyAmt;
    @XmlElement(name = "ChrgAmt")
    protected ActiveCurrencyAndAmount chrgAmt;
    @XmlElement(name = "ComssnAmt")
    protected ActiveCurrencyAndAmount comssnAmt;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms9 fxDtls;

    /**
     * Gets the value of the taxVchrRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxVchrRate() {
        return taxVchrRate;
    }

    /**
     * Sets the value of the taxVchrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TaxVoucher1 setTaxVchrRate(BigDecimal value) {
        this.taxVchrRate = value;
        return this;
    }

    /**
     * Gets the value of the taxCdt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxCdt() {
        return taxCdt;
    }

    /**
     * Sets the value of the taxCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxVoucher1 setTaxCdt(ActiveCurrencyAndAmount value) {
        this.taxCdt = value;
        return this;
    }

    /**
     * Gets the value of the taxDdctn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxDdctn() {
        return taxDdctn;
    }

    /**
     * Sets the value of the taxDdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxVoucher1 setTaxDdctn(ActiveCurrencyAndAmount value) {
        this.taxDdctn = value;
        return this;
    }

    /**
     * Gets the value of the grssAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssAmt() {
        return grssAmt;
    }

    /**
     * Sets the value of the grssAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxVoucher1 setGrssAmt(ActiveCurrencyAndAmount value) {
        this.grssAmt = value;
        return this;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxVoucher1 setNetAmt(ActiveCurrencyAndAmount value) {
        this.netAmt = value;
        return this;
    }

    /**
     * Gets the value of the rcrdDtHldg property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getRcrdDtHldg() {
        return rcrdDtHldg;
    }

    /**
     * Sets the value of the rcrdDtHldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public TaxVoucher1 setRcrdDtHldg(UnitOrFaceAmount1Choice value) {
        this.rcrdDtHldg = value;
        return this;
    }

    /**
     * Gets the value of the taxCdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxCdtRate() {
        return taxCdtRate;
    }

    /**
     * Sets the value of the taxCdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TaxVoucher1 setTaxCdtRate(BigDecimal value) {
        this.taxCdtRate = value;
        return this;
    }

    /**
     * Gets the value of the whldgTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getWhldgTaxAmt() {
        return whldgTaxAmt;
    }

    /**
     * Sets the value of the whldgTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxVoucher1 setWhldgTaxAmt(ActiveCurrencyAndAmount value) {
        this.whldgTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the whldgTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWhldgTaxRate() {
        return whldgTaxRate;
    }

    /**
     * Sets the value of the whldgTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TaxVoucher1 setWhldgTaxRate(BigDecimal value) {
        this.whldgTaxRate = value;
        return this;
    }

    /**
     * Gets the value of the scripDvddRinvstmtPricPerShr property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue1 }
     *     
     */
    public PriceValue1 getScripDvddRinvstmtPricPerShr() {
        return scripDvddRinvstmtPricPerShr;
    }

    /**
     * Sets the value of the scripDvddRinvstmtPricPerShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue1 }
     *     
     */
    public TaxVoucher1 setScripDvddRinvstmtPricPerShr(PriceValue1 value) {
        this.scripDvddRinvstmtPricPerShr = value;
        return this;
    }

    /**
     * Gets the value of the cshAmtBrghtFwd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshAmtBrghtFwd() {
        return cshAmtBrghtFwd;
    }

    /**
     * Sets the value of the cshAmtBrghtFwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxVoucher1 setCshAmtBrghtFwd(ActiveCurrencyAndAmount value) {
        this.cshAmtBrghtFwd = value;
        return this;
    }

    /**
     * Gets the value of the alltdShrsCost property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue1 }
     *     
     */
    public PriceValue1 getAlltdShrsCost() {
        return alltdShrsCost;
    }

    /**
     * Sets the value of the alltdShrsCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue1 }
     *     
     */
    public TaxVoucher1 setAlltdShrsCost(PriceValue1 value) {
        this.alltdShrsCost = value;
        return this;
    }

    /**
     * Gets the value of the cshAmtCrrdFwd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshAmtCrrdFwd() {
        return cshAmtCrrdFwd;
    }

    /**
     * Sets the value of the cshAmtCrrdFwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxVoucher1 setCshAmtCrrdFwd(ActiveCurrencyAndAmount value) {
        this.cshAmtCrrdFwd = value;
        return this;
    }

    /**
     * Gets the value of the ntnlTax property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNtnlTax() {
        return ntnlTax;
    }

    /**
     * Sets the value of the ntnlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxVoucher1 setNtnlTax(ActiveCurrencyAndAmount value) {
        this.ntnlTax = value;
        return this;
    }

    /**
     * Gets the value of the ntnlDvddPybl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNtnlDvddPybl() {
        return ntnlDvddPybl;
    }

    /**
     * Sets the value of the ntnlDvddPybl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxVoucher1 setNtnlDvddPybl(ActiveCurrencyAndAmount value) {
        this.ntnlDvddPybl = value;
        return this;
    }

    /**
     * Gets the value of the brgnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getBrgnDt() {
        return brgnDt;
    }

    /**
     * Sets the value of the brgnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxVoucher1 setBrgnDt(LocalDate value) {
        this.brgnDt = value;
        return this;
    }

    /**
     * Gets the value of the brgnSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getBrgnSttlmDt() {
        return brgnSttlmDt;
    }

    /**
     * Sets the value of the brgnSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxVoucher1 setBrgnSttlmDt(LocalDate value) {
        this.brgnSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the stmpDtyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getStmpDtyAmt() {
        return stmpDtyAmt;
    }

    /**
     * Sets the value of the stmpDtyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxVoucher1 setStmpDtyAmt(ActiveCurrencyAndAmount value) {
        this.stmpDtyAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getChrgAmt() {
        return chrgAmt;
    }

    /**
     * Sets the value of the chrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxVoucher1 setChrgAmt(ActiveCurrencyAndAmount value) {
        this.chrgAmt = value;
        return this;
    }

    /**
     * Gets the value of the comssnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getComssnAmt() {
        return comssnAmt;
    }

    /**
     * Sets the value of the comssnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxVoucher1 setComssnAmt(ActiveCurrencyAndAmount value) {
        this.comssnAmt = value;
        return this;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms9 }
     *     
     */
    public ForeignExchangeTerms9 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms9 }
     *     
     */
    public TaxVoucher1 setFXDtls(ForeignExchangeTerms9 value) {
        this.fxDtls = value;
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
