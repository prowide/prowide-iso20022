
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
 * Settlement transaction numbering information
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalNumber1", propOrder = {
    "curInstrNb",
    "ttlOfLkdInstrs"
})
public class TotalNumber1 {

    @XmlElement(name = "CurInstrNb", required = true)
    protected String curInstrNb;
    @XmlElement(name = "TtlOfLkdInstrs", required = true)
    protected String ttlOfLkdInstrs;

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
    public TotalNumber1 setCurInstrNb(String value) {
        this.curInstrNb = value;
        return this;
    }

    /**
     * Gets the value of the ttlOfLkdInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlOfLkdInstrs() {
        return ttlOfLkdInstrs;
    }

    /**
     * Sets the value of the ttlOfLkdInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TotalNumber1 setTtlOfLkdInstrs(String value) {
        this.ttlOfLkdInstrs = value;
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
