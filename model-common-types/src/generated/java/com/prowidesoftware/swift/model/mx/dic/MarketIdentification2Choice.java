
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
 * Choice of market identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketIdentification2Choice", propOrder = {
    "mktIdrCd",
    "desc"
})
public class MarketIdentification2Choice {

    @XmlElement(name = "MktIdrCd")
    protected String mktIdrCd;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the mktIdrCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktIdrCd() {
        return mktIdrCd;
    }

    /**
     * Sets the value of the mktIdrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MarketIdentification2Choice setMktIdrCd(String value) {
        this.mktIdrCd = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MarketIdentification2Choice setDesc(String value) {
        this.desc = value;
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
