
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
 * Choice of format for the activity indicator.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityIndicator1Choice", propOrder = {
    "isicIdr",
    "prtryInd"
})
public class ActivityIndicator1Choice {

    @XmlElement(name = "ISICIdr")
    protected String isicIdr;
    @XmlElement(name = "PrtryInd")
    protected GenericIdentification36 prtryInd;

    /**
     * Gets the value of the isicIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISICIdr() {
        return isicIdr;
    }

    /**
     * Sets the value of the isicIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ActivityIndicator1Choice setISICIdr(String value) {
        this.isicIdr = value;
        return this;
    }

    /**
     * Gets the value of the prtryInd property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getPrtryInd() {
        return prtryInd;
    }

    /**
     * Sets the value of the prtryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public ActivityIndicator1Choice setPrtryInd(GenericIdentification36 value) {
        this.prtryInd = value;
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
