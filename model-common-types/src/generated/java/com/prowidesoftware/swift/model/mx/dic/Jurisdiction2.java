
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
 * Contains information that identifies or is specific to a transaction jurisdiction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Jurisdiction2", propOrder = {
    "dmstInd",
    "dmstQlfctn"
})
public class Jurisdiction2 {

    @XmlElement(name = "DmstInd")
    protected Boolean dmstInd;
    @XmlElement(name = "DmstQlfctn")
    protected String dmstQlfctn;

    /**
     * Gets the value of the dmstInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDmstInd() {
        return dmstInd;
    }

    /**
     * Sets the value of the dmstInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Jurisdiction2 setDmstInd(Boolean value) {
        this.dmstInd = value;
        return this;
    }

    /**
     * Gets the value of the dmstQlfctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmstQlfctn() {
        return dmstQlfctn;
    }

    /**
     * Sets the value of the dmstQlfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Jurisdiction2 setDmstQlfctn(String value) {
        this.dmstQlfctn = value;
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
