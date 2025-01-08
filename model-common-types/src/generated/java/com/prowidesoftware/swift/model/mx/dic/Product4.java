
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
 * Product to purchase.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product4", propOrder = {
    "pdctCd",
    "addtlPdctCd"
})
public class Product4 {

    @XmlElement(name = "PdctCd", required = true)
    protected String pdctCd;
    @XmlElement(name = "AddtlPdctCd")
    protected String addtlPdctCd;

    /**
     * Gets the value of the pdctCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctCd() {
        return pdctCd;
    }

    /**
     * Sets the value of the pdctCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Product4 setPdctCd(String value) {
        this.pdctCd = value;
        return this;
    }

    /**
     * Gets the value of the addtlPdctCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlPdctCd() {
        return addtlPdctCd;
    }

    /**
     * Sets the value of the addtlPdctCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Product4 setAddtlPdctCd(String value) {
        this.addtlPdctCd = value;
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
