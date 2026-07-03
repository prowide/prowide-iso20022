
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
 * Rating and source of the rating of the financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rating2", propOrder = {
    "ratg",
    "srcOfRatg"
})
public class Rating2 {

    @XmlElement(name = "Ratg", required = true)
    protected String ratg;
    @XmlElement(name = "SrcOfRatg", required = true)
    protected MarketIdentification89 srcOfRatg;

    /**
     * Gets the value of the ratg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatg() {
        return ratg;
    }

    /**
     * Sets the value of the ratg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Rating2 setRatg(String value) {
        this.ratg = value;
        return this;
    }

    /**
     * Gets the value of the srcOfRatg property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification89 }
     *     
     */
    public MarketIdentification89 getSrcOfRatg() {
        return srcOfRatg;
    }

    /**
     * Sets the value of the srcOfRatg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification89 }
     *     
     */
    public Rating2 setSrcOfRatg(MarketIdentification89 value) {
        this.srcOfRatg = value;
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
