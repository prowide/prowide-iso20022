
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
 * Deletion of the current element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deletion2", propOrder = {
    "deltdVal"
})
public class Deletion2 {

    @XmlElement(name = "DeltdVal")
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
    public Deletion2 setDeltdVal(String value) {
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
