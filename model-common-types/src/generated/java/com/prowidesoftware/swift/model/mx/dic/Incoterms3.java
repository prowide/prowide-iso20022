
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
 * Specifies the applicable Incoterm and associated location.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Incoterms3", propOrder = {
    "incotrmsCd",
    "lctn"
})
public class Incoterms3 {

    @XmlElement(name = "IncotrmsCd", required = true)
    protected Incoterms4Choice incotrmsCd;
    @XmlElement(name = "Lctn")
    protected String lctn;

    /**
     * Gets the value of the incotrmsCd property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms4Choice }
     *     
     */
    public Incoterms4Choice getIncotrmsCd() {
        return incotrmsCd;
    }

    /**
     * Sets the value of the incotrmsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms4Choice }
     *     
     */
    public Incoterms3 setIncotrmsCd(Incoterms4Choice value) {
        this.incotrmsCd = value;
        return this;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctn() {
        return lctn;
    }

    /**
     * Sets the value of the lctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Incoterms3 setLctn(String value) {
        this.lctn = value;
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
