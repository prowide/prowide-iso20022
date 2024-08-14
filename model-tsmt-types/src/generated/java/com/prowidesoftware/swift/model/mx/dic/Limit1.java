
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
 * Specifies the number of occurrences of a particular event and the maximum number of times this event may occur.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Limit1", propOrder = {
    "cur",
    "lmt"
})
public class Limit1 {

    @XmlElement(name = "Cur", required = true)
    protected String cur;
    @XmlElement(name = "Lmt", required = true)
    protected String lmt;

    /**
     * Gets the value of the cur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCur() {
        return cur;
    }

    /**
     * Sets the value of the cur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Limit1 setCur(String value) {
        this.cur = value;
        return this;
    }

    /**
     * Gets the value of the lmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLmt() {
        return lmt;
    }

    /**
     * Sets the value of the lmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Limit1 setLmt(String value) {
        this.lmt = value;
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
