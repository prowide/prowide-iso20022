
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
 * Addition of a new element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Addition1", propOrder = {
    "propsdVal"
})
public class Addition1 {

    @XmlElement(name = "PropsdVal", required = true)
    protected String propsdVal;

    /**
     * Gets the value of the propsdVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropsdVal() {
        return propsdVal;
    }

    /**
     * Sets the value of the propsdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Addition1 setPropsdVal(String value) {
        this.propsdVal = value;
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
