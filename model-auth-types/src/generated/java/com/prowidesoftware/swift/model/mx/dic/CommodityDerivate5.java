
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
 * Transparency calculation specific details for a freight commodity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityDerivate5", propOrder = {
    "sz",
    "avrgTmChrtr"
})
public class CommodityDerivate5 {

    @XmlElement(name = "Sz", required = true)
    protected String sz;
    @XmlElement(name = "AvrgTmChrtr", required = true)
    protected String avrgTmChrtr;

    /**
     * Gets the value of the sz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSz() {
        return sz;
    }

    /**
     * Sets the value of the sz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommodityDerivate5 setSz(String value) {
        this.sz = value;
        return this;
    }

    /**
     * Gets the value of the avrgTmChrtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvrgTmChrtr() {
        return avrgTmChrtr;
    }

    /**
     * Sets the value of the avrgTmChrtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommodityDerivate5 setAvrgTmChrtr(String value) {
        this.avrgTmChrtr = value;
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
