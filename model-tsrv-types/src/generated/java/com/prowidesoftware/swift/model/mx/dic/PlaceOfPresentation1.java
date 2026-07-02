
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
 * Location of a presentation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceOfPresentation1", propOrder = {
    "plc",
    "ctry"
})
public class PlaceOfPresentation1 {

    @XmlElement(name = "Plc", required = true)
    protected String plc;
    @XmlElement(name = "Ctry")
    protected String ctry;

    /**
     * Gets the value of the plc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlc() {
        return plc;
    }

    /**
     * Sets the value of the plc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlaceOfPresentation1 setPlc(String value) {
        this.plc = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlaceOfPresentation1 setCtry(String value) {
        this.ctry = value;
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
