
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
 * Type of order in financial instruments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderClassification2", propOrder = {
    "ordrTp",
    "ordrTpClssfctn"
})
public class OrderClassification2 {

    @XmlElement(name = "OrdrTp")
    protected String ordrTp;
    @XmlElement(name = "OrdrTpClssfctn")
    @XmlSchemaType(name = "string")
    protected OrderType3Code ordrTpClssfctn;

    /**
     * Gets the value of the ordrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrTp() {
        return ordrTp;
    }

    /**
     * Sets the value of the ordrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderClassification2 setOrdrTp(String value) {
        this.ordrTp = value;
        return this;
    }

    /**
     * Gets the value of the ordrTpClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType3Code }
     *     
     */
    public OrderType3Code getOrdrTpClssfctn() {
        return ordrTpClssfctn;
    }

    /**
     * Sets the value of the ordrTpClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType3Code }
     *     
     */
    public OrderClassification2 setOrdrTpClssfctn(OrderType3Code value) {
        this.ordrTpClssfctn = value;
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
