
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
 * Transparency calculation specific details for an commodity derivatives.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityDerivative4", propOrder = {
    "clssSpcfc",
    "ntnlCcy"
})
public class CommodityDerivative4 {

    @XmlElement(name = "ClssSpcfc")
    protected CommodityDerivative2Choice clssSpcfc;
    @XmlElement(name = "NtnlCcy", required = true)
    protected String ntnlCcy;

    /**
     * Gets the value of the clssSpcfc property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDerivative2Choice }
     *     
     */
    public CommodityDerivative2Choice getClssSpcfc() {
        return clssSpcfc;
    }

    /**
     * Sets the value of the clssSpcfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDerivative2Choice }
     *     
     */
    public CommodityDerivative4 setClssSpcfc(CommodityDerivative2Choice value) {
        this.clssSpcfc = value;
        return this;
    }

    /**
     * Gets the value of the ntnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcy() {
        return ntnlCcy;
    }

    /**
     * Sets the value of the ntnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommodityDerivative4 setNtnlCcy(String value) {
        this.ntnlCcy = value;
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
