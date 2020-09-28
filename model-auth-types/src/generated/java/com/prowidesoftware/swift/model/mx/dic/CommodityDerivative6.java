
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
 * Transparency calculation specific details for an energy commodity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityDerivative6", propOrder = {
    "sttlmLctn"
})
public class CommodityDerivative6 {

    @XmlElement(name = "SttlmLctn", required = true)
    protected String sttlmLctn;

    /**
     * Gets the value of the sttlmLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmLctn() {
        return sttlmLctn;
    }

    /**
     * Sets the value of the sttlmLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommodityDerivative6 setSttlmLctn(String value) {
        this.sttlmLctn = value;
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
