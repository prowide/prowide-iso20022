
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
 * Choice of format for the priority.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorityNumeric3Choice", propOrder = {
    "nmrc",
    "prtry"
})
public class PriorityNumeric3Choice {

    @XmlElement(name = "Nmrc")
    protected String nmrc;
    @XmlElement(name = "Prtry")
    protected GenericIdentification38 prtry;

    /**
     * Gets the value of the nmrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmrc() {
        return nmrc;
    }

    /**
     * Sets the value of the nmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PriorityNumeric3Choice setNmrc(String value) {
        this.nmrc = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification38 }
     *     
     */
    public GenericIdentification38 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification38 }
     *     
     */
    public PriorityNumeric3Choice setPrtry(GenericIdentification38 value) {
        this.prtry = value;
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
