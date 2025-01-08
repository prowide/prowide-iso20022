
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
 * The discount amount that is attached to an item as a rebate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleItemRebate1", propOrder = {
    "saleItm",
    "rbtLabl"
})
public class SaleItemRebate1 {

    @XmlElement(name = "SaleItm", required = true)
    protected Product6 saleItm;
    @XmlElement(name = "RbtLabl")
    protected String rbtLabl;

    /**
     * Gets the value of the saleItm property.
     * 
     * @return
     *     possible object is
     *     {@link Product6 }
     *     
     */
    public Product6 getSaleItm() {
        return saleItm;
    }

    /**
     * Sets the value of the saleItm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product6 }
     *     
     */
    public SaleItemRebate1 setSaleItm(Product6 value) {
        this.saleItm = value;
        return this;
    }

    /**
     * Gets the value of the rbtLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRbtLabl() {
        return rbtLabl;
    }

    /**
     * Sets the value of the rbtLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleItemRebate1 setRbtLabl(String value) {
        this.rbtLabl = value;
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
