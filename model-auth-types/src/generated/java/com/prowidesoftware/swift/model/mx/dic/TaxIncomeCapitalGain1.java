
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
 * Specifies the tax income capital gain details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIncomeCapitalGain1", propOrder = {
    "dscntMtd",
    "othrMtd",
    "dstrbtd",
    "netAmt",
    "taxCncssn"
})
public class TaxIncomeCapitalGain1 {

    @XmlElement(name = "DscntMtd")
    protected TaxIncomeAmount2 dscntMtd;
    @XmlElement(name = "OthrMtd")
    protected TaxIncomeAmount2 othrMtd;
    @XmlElement(name = "Dstrbtd")
    protected TaxIncomeAmount2 dstrbtd;
    @XmlElement(name = "NetAmt")
    protected ActiveCurrencyAndAmount netAmt;
    @XmlElement(name = "TaxCncssn")
    protected TaxIncomeAmount1 taxCncssn;

    /**
     * Gets the value of the dscntMtd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeAmount2 }
     *     
     */
    public TaxIncomeAmount2 getDscntMtd() {
        return dscntMtd;
    }

    /**
     * Sets the value of the dscntMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeAmount2 }
     *     
     */
    public TaxIncomeCapitalGain1 setDscntMtd(TaxIncomeAmount2 value) {
        this.dscntMtd = value;
        return this;
    }

    /**
     * Gets the value of the othrMtd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeAmount2 }
     *     
     */
    public TaxIncomeAmount2 getOthrMtd() {
        return othrMtd;
    }

    /**
     * Sets the value of the othrMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeAmount2 }
     *     
     */
    public TaxIncomeCapitalGain1 setOthrMtd(TaxIncomeAmount2 value) {
        this.othrMtd = value;
        return this;
    }

    /**
     * Gets the value of the dstrbtd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeAmount2 }
     *     
     */
    public TaxIncomeAmount2 getDstrbtd() {
        return dstrbtd;
    }

    /**
     * Sets the value of the dstrbtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeAmount2 }
     *     
     */
    public TaxIncomeCapitalGain1 setDstrbtd(TaxIncomeAmount2 value) {
        this.dstrbtd = value;
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
    public TaxIncomeCapitalGain1 setNetAmt(ActiveCurrencyAndAmount value) {
        this.netAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxCncssn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeAmount1 }
     *     
     */
    public TaxIncomeAmount1 getTaxCncssn() {
        return taxCncssn;
    }

    /**
     * Sets the value of the taxCncssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeAmount1 }
     *     
     */
    public TaxIncomeCapitalGain1 setTaxCncssn(TaxIncomeAmount1 value) {
        this.taxCncssn = value;
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
