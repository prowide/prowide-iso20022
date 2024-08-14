
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
 * Deletion of the current element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deletion1", propOrder = {
    "deltdVal"
})
public class Deletion1 {

    @XmlElement(name = "DeltdVal", required = true)
    protected String deltdVal;

    /**
     * Gets the value of the deltdVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeltdVal() {
        return deltdVal;
    }

    /**
     * Sets the value of the deltdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Deletion1 setDeltdVal(String value) {
        this.deltdVal = value;
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
