
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the tax income part A report details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIncomePartA1", propOrder = {
    "nonPmryIncm",
    "trstFrnkdDstrbtn",
    "frnkgCdt",
    "whldgAmt",
    "anlCptlGn",
    "netCptlGn",
    "assessblFrgnIncm",
    "othrFrgnIncm",
    "frgnIncmTaxOffset",
    "nonPmryDstrbtnDdctn"
})
public class TaxIncomePartA1 {

    @XmlElement(name = "NonPmryIncm")
    protected ActiveCurrencyAndAmount nonPmryIncm;
    @XmlElement(name = "TrstFrnkdDstrbtn")
    protected ActiveCurrencyAndAmount trstFrnkdDstrbtn;
    @XmlElement(name = "FrnkgCdt")
    protected ActiveCurrencyAndAmount frnkgCdt;
    @XmlElement(name = "WhldgAmt")
    protected ActiveCurrencyAndAmount whldgAmt;
    @XmlElement(name = "AnlCptlGn")
    protected ActiveCurrencyAndAmount anlCptlGn;
    @XmlElement(name = "NetCptlGn")
    protected ActiveCurrencyAndAmount netCptlGn;
    @XmlElement(name = "AssessblFrgnIncm")
    protected ActiveCurrencyAndAmount assessblFrgnIncm;
    @XmlElement(name = "OthrFrgnIncm")
    protected ActiveCurrencyAndAmount othrFrgnIncm;
    @XmlElement(name = "FrgnIncmTaxOffset")
    protected ActiveCurrencyAndAmount frgnIncmTaxOffset;
    @XmlElement(name = "NonPmryDstrbtnDdctn")
    protected ActiveCurrencyAndAmount nonPmryDstrbtnDdctn;

    /**
     * Gets the value of the nonPmryIncm property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNonPmryIncm() {
        return nonPmryIncm;
    }

    /**
     * Sets the value of the nonPmryIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomePartA1 setNonPmryIncm(ActiveCurrencyAndAmount value) {
        this.nonPmryIncm = value;
        return this;
    }

    /**
     * Gets the value of the trstFrnkdDstrbtn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTrstFrnkdDstrbtn() {
        return trstFrnkdDstrbtn;
    }

    /**
     * Sets the value of the trstFrnkdDstrbtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomePartA1 setTrstFrnkdDstrbtn(ActiveCurrencyAndAmount value) {
        this.trstFrnkdDstrbtn = value;
        return this;
    }

    /**
     * Gets the value of the frnkgCdt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFrnkgCdt() {
        return frnkgCdt;
    }

    /**
     * Sets the value of the frnkgCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomePartA1 setFrnkgCdt(ActiveCurrencyAndAmount value) {
        this.frnkgCdt = value;
        return this;
    }

    /**
     * Gets the value of the whldgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getWhldgAmt() {
        return whldgAmt;
    }

    /**
     * Sets the value of the whldgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomePartA1 setWhldgAmt(ActiveCurrencyAndAmount value) {
        this.whldgAmt = value;
        return this;
    }

    /**
     * Gets the value of the anlCptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAnlCptlGn() {
        return anlCptlGn;
    }

    /**
     * Sets the value of the anlCptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomePartA1 setAnlCptlGn(ActiveCurrencyAndAmount value) {
        this.anlCptlGn = value;
        return this;
    }

    /**
     * Gets the value of the netCptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetCptlGn() {
        return netCptlGn;
    }

    /**
     * Sets the value of the netCptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomePartA1 setNetCptlGn(ActiveCurrencyAndAmount value) {
        this.netCptlGn = value;
        return this;
    }

    /**
     * Gets the value of the assessblFrgnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAssessblFrgnIncm() {
        return assessblFrgnIncm;
    }

    /**
     * Sets the value of the assessblFrgnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomePartA1 setAssessblFrgnIncm(ActiveCurrencyAndAmount value) {
        this.assessblFrgnIncm = value;
        return this;
    }

    /**
     * Gets the value of the othrFrgnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOthrFrgnIncm() {
        return othrFrgnIncm;
    }

    /**
     * Sets the value of the othrFrgnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomePartA1 setOthrFrgnIncm(ActiveCurrencyAndAmount value) {
        this.othrFrgnIncm = value;
        return this;
    }

    /**
     * Gets the value of the frgnIncmTaxOffset property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFrgnIncmTaxOffset() {
        return frgnIncmTaxOffset;
    }

    /**
     * Sets the value of the frgnIncmTaxOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomePartA1 setFrgnIncmTaxOffset(ActiveCurrencyAndAmount value) {
        this.frgnIncmTaxOffset = value;
        return this;
    }

    /**
     * Gets the value of the nonPmryDstrbtnDdctn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNonPmryDstrbtnDdctn() {
        return nonPmryDstrbtnDdctn;
    }

    /**
     * Sets the value of the nonPmryDstrbtnDdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomePartA1 setNonPmryDstrbtnDdctn(ActiveCurrencyAndAmount value) {
        this.nonPmryDstrbtnDdctn = value;
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
