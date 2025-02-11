
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
 * Choice of number count type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberCount1Choice", propOrder = {
    "curInstrNb",
    "ttlNb"
})
public class NumberCount1Choice {

    @XmlElement(name = "CurInstrNb")
    protected String curInstrNb;
    @XmlElement(name = "TtlNb")
    protected TotalNumber1 ttlNb;

    /**
     * Gets the value of the curInstrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurInstrNb() {
        return curInstrNb;
    }

    /**
     * Sets the value of the curInstrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NumberCount1Choice setCurInstrNb(String value) {
        this.curInstrNb = value;
        return this;
    }

    /**
     * Gets the value of the ttlNb property.
     * 
     * @return
     *     possible object is
     *     {@link TotalNumber1 }
     *     
     */
    public TotalNumber1 getTtlNb() {
        return ttlNb;
    }

    /**
     * Sets the value of the ttlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalNumber1 }
     *     
     */
    public NumberCount1Choice setTtlNb(TotalNumber1 value) {
        this.ttlNb = value;
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
