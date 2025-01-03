
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
 * Sale context in which the transaction is performed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleContext1", propOrder = {
    "saleId",
    "saleRefNb",
    "saleRcncltnId",
    "cshrId",
    "shftNb",
    "addtlSaleData"
})
public class SaleContext1 {

    @XmlElement(name = "SaleId")
    protected String saleId;
    @XmlElement(name = "SaleRefNb")
    protected String saleRefNb;
    @XmlElement(name = "SaleRcncltnId")
    protected String saleRcncltnId;
    @XmlElement(name = "CshrId")
    protected String cshrId;
    @XmlElement(name = "ShftNb")
    protected String shftNb;
    @XmlElement(name = "AddtlSaleData")
    protected String addtlSaleData;

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext1 setSaleId(String value) {
        this.saleId = value;
        return this;
    }

    /**
     * Gets the value of the saleRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefNb() {
        return saleRefNb;
    }

    /**
     * Sets the value of the saleRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext1 setSaleRefNb(String value) {
        this.saleRefNb = value;
        return this;
    }

    /**
     * Gets the value of the saleRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRcncltnId() {
        return saleRcncltnId;
    }

    /**
     * Sets the value of the saleRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext1 setSaleRcncltnId(String value) {
        this.saleRcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the cshrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshrId() {
        return cshrId;
    }

    /**
     * Sets the value of the cshrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext1 setCshrId(String value) {
        this.cshrId = value;
        return this;
    }

    /**
     * Gets the value of the shftNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShftNb() {
        return shftNb;
    }

    /**
     * Sets the value of the shftNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext1 setShftNb(String value) {
        this.shftNb = value;
        return this;
    }

    /**
     * Gets the value of the addtlSaleData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlSaleData() {
        return addtlSaleData;
    }

    /**
     * Sets the value of the addtlSaleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext1 setAddtlSaleData(String value) {
        this.addtlSaleData = value;
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
