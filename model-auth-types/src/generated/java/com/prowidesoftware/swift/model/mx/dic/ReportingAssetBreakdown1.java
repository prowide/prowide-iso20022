
package com.prowidesoftware.swift.model.mx.dic;

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
 * Specifies the breakdown of a reported amount that can be split across a range of assets: bonds, cash, equities, or another asset class.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingAssetBreakdown1", propOrder = {
    "rptgAsstTp",
    "id",
    "amt"
})
public class ReportingAssetBreakdown1 {

    @XmlElement(name = "RptgAsstTp", required = true)
    @XmlSchemaType(name = "string")
    protected ProductType6Code rptgAsstTp;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;

    /**
     * Gets the value of the rptgAsstTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType6Code }
     *     
     */
    public ProductType6Code getRptgAsstTp() {
        return rptgAsstTp;
    }

    /**
     * Sets the value of the rptgAsstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType6Code }
     *     
     */
    public ReportingAssetBreakdown1 setRptgAsstTp(ProductType6Code value) {
        this.rptgAsstTp = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportingAssetBreakdown1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ReportingAssetBreakdown1 setAmt(ActiveCurrencyAndAmount value) {
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
