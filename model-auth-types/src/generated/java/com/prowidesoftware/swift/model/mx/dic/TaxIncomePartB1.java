
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
 * Specifies the tax income part B report details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIncomePartB1", propOrder = {
    "cptlGnDscntMtd",
    "cptlGnOthrMtd",
    "anlCptlGnTtl",
    "cptlGnTaxCncssn",
    "taxDfrrd"
})
public class TaxIncomePartB1 {

    @XmlElement(name = "CptlGnDscntMtd")
    protected ActiveCurrencyAndAmount cptlGnDscntMtd;
    @XmlElement(name = "CptlGnOthrMtd")
    protected ActiveCurrencyAndAmount cptlGnOthrMtd;
    @XmlElement(name = "AnlCptlGnTtl")
    protected ActiveCurrencyAndAmount anlCptlGnTtl;
    @XmlElement(name = "CptlGnTaxCncssn")
    protected ActiveCurrencyAndAmount cptlGnTaxCncssn;
    @XmlElement(name = "TaxDfrrd")
    protected ActiveCurrencyAndAmount taxDfrrd;

    /**
     * Gets the value of the cptlGnDscntMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCptlGnDscntMtd() {
        return cptlGnDscntMtd;
    }

    /**
     * Sets the value of the cptlGnDscntMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomePartB1 setCptlGnDscntMtd(ActiveCurrencyAndAmount value) {
        this.cptlGnDscntMtd = value;
        return this;
    }

    /**
     * Gets the value of the cptlGnOthrMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCptlGnOthrMtd() {
        return cptlGnOthrMtd;
    }

    /**
     * Sets the value of the cptlGnOthrMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomePartB1 setCptlGnOthrMtd(ActiveCurrencyAndAmount value) {
        this.cptlGnOthrMtd = value;
        return this;
    }

    /**
     * Gets the value of the anlCptlGnTtl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAnlCptlGnTtl() {
        return anlCptlGnTtl;
    }

    /**
     * Sets the value of the anlCptlGnTtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomePartB1 setAnlCptlGnTtl(ActiveCurrencyAndAmount value) {
        this.anlCptlGnTtl = value;
        return this;
    }

    /**
     * Gets the value of the cptlGnTaxCncssn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCptlGnTaxCncssn() {
        return cptlGnTaxCncssn;
    }

    /**
     * Sets the value of the cptlGnTaxCncssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomePartB1 setCptlGnTaxCncssn(ActiveCurrencyAndAmount value) {
        this.cptlGnTaxCncssn = value;
        return this;
    }

    /**
     * Gets the value of the taxDfrrd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxDfrrd() {
        return taxDfrrd;
    }

    /**
     * Sets the value of the taxDfrrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomePartB1 setTaxDfrrd(ActiveCurrencyAndAmount value) {
        this.taxDfrrd = value;
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
