
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
 * Choice of price type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType2Choice", propOrder = {
    "mkt",
    "indctv"
})
public class PriceType2Choice {

    @XmlElement(name = "Mkt")
    protected Price3 mkt;
    @XmlElement(name = "Indctv")
    protected Price3 indctv;

    /**
     * Gets the value of the mkt property.
     * 
     * @return
     *     possible object is
     *     {@link Price3 }
     *     
     */
    public Price3 getMkt() {
        return mkt;
    }

    /**
     * Sets the value of the mkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price3 }
     *     
     */
    public PriceType2Choice setMkt(Price3 value) {
        this.mkt = value;
        return this;
    }

    /**
     * Gets the value of the indctv property.
     * 
     * @return
     *     possible object is
     *     {@link Price3 }
     *     
     */
    public Price3 getIndctv() {
        return indctv;
    }

    /**
     * Sets the value of the indctv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price3 }
     *     
     */
    public PriceType2Choice setIndctv(Price3 value) {
        this.indctv = value;
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
