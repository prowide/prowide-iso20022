
package com.prowidesoftware.swift.model.mx.dic;

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
 * Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax12", propOrder = {
    "tp",
    "othrTaxTp",
    "amt"
})
public class Tax12 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TaxType9Code tp;
    @XmlElement(name = "OthrTaxTp")
    protected String othrTaxTp;
    @XmlElement(name = "Amt", required = true)
    protected CurrencyAndAmount amt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType9Code }
     *     
     */
    public TaxType9Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType9Code }
     *     
     */
    public Tax12 setTp(TaxType9Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTaxTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTaxTp() {
        return othrTaxTp;
    }

    /**
     * Sets the value of the othrTaxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Tax12 setOthrTaxTp(String value) {
        this.othrTaxTp = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public Tax12 setAmt(CurrencyAndAmount value) {
        this.amt = value;
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
