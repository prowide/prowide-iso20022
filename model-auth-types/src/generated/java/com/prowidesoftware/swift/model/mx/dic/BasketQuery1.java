
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
 * Identification of constituents for a basket of indexes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketQuery1", propOrder = {
    "strr",
    "idr",
    "isin"
})
public class BasketQuery1 {

    @XmlElement(name = "Strr")
    protected String strr;
    @XmlElement(name = "Idr")
    protected String idr;
    @XmlElement(name = "ISIN")
    protected String isin;

    /**
     * Gets the value of the strr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrr() {
        return strr;
    }

    /**
     * Sets the value of the strr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BasketQuery1 setStrr(String value) {
        this.strr = value;
        return this;
    }

    /**
     * Gets the value of the idr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdr() {
        return idr;
    }

    /**
     * Sets the value of the idr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BasketQuery1 setIdr(String value) {
        this.idr = value;
        return this;
    }

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BasketQuery1 setISIN(String value) {
        this.isin = value;
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
