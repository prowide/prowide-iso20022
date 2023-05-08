
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the tax income other deductions details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIncomeOtherDeduction1", propOrder = {
    "netCsh",
    "whldgAmt",
    "othrExpnss"
})
public class TaxIncomeOtherDeduction1 {

    @XmlElement(name = "NetCsh")
    protected ActiveCurrencyAndAmount netCsh;
    @XmlElement(name = "WhldgAmt")
    protected ActiveCurrencyAndAmount whldgAmt;
    @XmlElement(name = "OthrExpnss")
    protected ActiveCurrencyAndAmount othrExpnss;

    /**
     * Gets the value of the netCsh property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetCsh() {
        return netCsh;
    }

    /**
     * Sets the value of the netCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomeOtherDeduction1 setNetCsh(ActiveCurrencyAndAmount value) {
        this.netCsh = value;
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
    public TaxIncomeOtherDeduction1 setWhldgAmt(ActiveCurrencyAndAmount value) {
        this.whldgAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrExpnss property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOthrExpnss() {
        return othrExpnss;
    }

    /**
     * Sets the value of the othrExpnss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomeOtherDeduction1 setOthrExpnss(ActiveCurrencyAndAmount value) {
        this.othrExpnss = value;
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
