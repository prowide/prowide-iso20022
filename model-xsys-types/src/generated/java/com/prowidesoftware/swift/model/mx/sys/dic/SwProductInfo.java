
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for ProductInfo complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInfo", propOrder = {
    "vendorName",
    "productName",
    "productVersion",
    "reportItem"
})
public class SwProductInfo {

    @XmlElement(name = "VendorName")
    protected String vendorName;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "ProductVersion")
    protected String productVersion;
    @XmlElement(name = "ReportItem")
    protected String reportItem;

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwProductInfo setVendorName(String value) {
        this.vendorName = value;
        return this;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwProductInfo setProductName(String value) {
        this.productName = value;
        return this;
    }

    /**
     * Gets the value of the productVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductVersion() {
        return productVersion;
    }

    /**
     * Sets the value of the productVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwProductInfo setProductVersion(String value) {
        this.productVersion = value;
        return this;
    }

    /**
     * Gets the value of the reportItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportItem() {
        return reportItem;
    }

    /**
     * Sets the value of the reportItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwProductInfo setReportItem(String value) {
        this.reportItem = value;
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
