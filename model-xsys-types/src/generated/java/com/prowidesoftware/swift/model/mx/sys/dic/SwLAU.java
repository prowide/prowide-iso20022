
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for LAU complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LAU", propOrder = {
    "lauVal",
    "lauAlgo"
})
public class SwLAU {

    @XmlElement(name = "LAUVal", required = true)
    protected String lauVal;
    @XmlElement(name = "LAUAlgo")
    protected String lauAlgo;

    /**
     * Gets the value of the lauVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAUVal() {
        return lauVal;
    }

    /**
     * Sets the value of the lauVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwLAU setLAUVal(String value) {
        this.lauVal = value;
        return this;
    }

    /**
     * Gets the value of the lauAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAUAlgo() {
        return lauAlgo;
    }

    /**
     * Sets the value of the lauAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwLAU setLAUAlgo(String value) {
        this.lauAlgo = value;
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
