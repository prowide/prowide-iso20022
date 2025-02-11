
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
 * Java class for InputChannels complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputChannels", propOrder = {
    "inptChanlPttrn"
})
public class InputChannels {

    @XmlElement(name = "InptChanlPttrn", required = true)
    protected String inptChanlPttrn;

    /**
     * Gets the value of the inptChanlPttrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInptChanlPttrn() {
        return inptChanlPttrn;
    }

    /**
     * Sets the value of the inptChanlPttrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InputChannels setInptChanlPttrn(String value) {
        this.inptChanlPttrn = value;
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
