
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
 * Specifies the tax income domestic details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIncomeDomestic1", propOrder = {
    "dvddFrnkdAmt",
    "dvddUfrnkdAmt",
    "intrst",
    "nonPmryIncm",
    "trstDdctn",
    "othrIncm"
})
public class TaxIncomeDomestic1 {

    @XmlElement(name = "DvddFrnkdAmt")
    protected TaxIncomeAmount2 dvddFrnkdAmt;
    @XmlElement(name = "DvddUfrnkdAmt")
    protected TaxIncomeAmount1 dvddUfrnkdAmt;
    @XmlElement(name = "Intrst")
    protected TaxIncomeAmount1 intrst;
    @XmlElement(name = "NonPmryIncm")
    protected TaxIncomeAmount1 nonPmryIncm;
    @XmlElement(name = "TrstDdctn")
    protected TaxIncomeAmount1 trstDdctn;
    @XmlElement(name = "OthrIncm")
    protected TaxIncomeAmount1 othrIncm;

    /**
     * Gets the value of the dvddFrnkdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeAmount2 }
     *     
     */
    public TaxIncomeAmount2 getDvddFrnkdAmt() {
        return dvddFrnkdAmt;
    }

    /**
     * Sets the value of the dvddFrnkdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeAmount2 }
     *     
     */
    public TaxIncomeDomestic1 setDvddFrnkdAmt(TaxIncomeAmount2 value) {
        this.dvddFrnkdAmt = value;
        return this;
    }

    /**
     * Gets the value of the dvddUfrnkdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeAmount1 }
     *     
     */
    public TaxIncomeAmount1 getDvddUfrnkdAmt() {
        return dvddUfrnkdAmt;
    }

    /**
     * Sets the value of the dvddUfrnkdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeAmount1 }
     *     
     */
    public TaxIncomeDomestic1 setDvddUfrnkdAmt(TaxIncomeAmount1 value) {
        this.dvddUfrnkdAmt = value;
        return this;
    }

    /**
     * Gets the value of the intrst property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeAmount1 }
     *     
     */
    public TaxIncomeAmount1 getIntrst() {
        return intrst;
    }

    /**
     * Sets the value of the intrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeAmount1 }
     *     
     */
    public TaxIncomeDomestic1 setIntrst(TaxIncomeAmount1 value) {
        this.intrst = value;
        return this;
    }

    /**
     * Gets the value of the nonPmryIncm property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeAmount1 }
     *     
     */
    public TaxIncomeAmount1 getNonPmryIncm() {
        return nonPmryIncm;
    }

    /**
     * Sets the value of the nonPmryIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeAmount1 }
     *     
     */
    public TaxIncomeDomestic1 setNonPmryIncm(TaxIncomeAmount1 value) {
        this.nonPmryIncm = value;
        return this;
    }

    /**
     * Gets the value of the trstDdctn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeAmount1 }
     *     
     */
    public TaxIncomeAmount1 getTrstDdctn() {
        return trstDdctn;
    }

    /**
     * Sets the value of the trstDdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeAmount1 }
     *     
     */
    public TaxIncomeDomestic1 setTrstDdctn(TaxIncomeAmount1 value) {
        this.trstDdctn = value;
        return this;
    }

    /**
     * Gets the value of the othrIncm property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeAmount1 }
     *     
     */
    public TaxIncomeAmount1 getOthrIncm() {
        return othrIncm;
    }

    /**
     * Sets the value of the othrIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeAmount1 }
     *     
     */
    public TaxIncomeDomestic1 setOthrIncm(TaxIncomeAmount1 value) {
        this.othrIncm = value;
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
