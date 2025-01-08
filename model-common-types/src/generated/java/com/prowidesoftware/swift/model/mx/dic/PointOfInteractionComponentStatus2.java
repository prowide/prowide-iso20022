
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Status of a POI component (Point of Interaction).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponentStatus2", propOrder = {
    "vrsnNb",
    "sts"
})
public class PointOfInteractionComponentStatus2 {

    @XmlElement(name = "VrsnNb")
    protected String vrsnNb;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected POIComponentStatus1Code sts;

    /**
     * Gets the value of the vrsnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsnNb() {
        return vrsnNb;
    }

    /**
     * Sets the value of the vrsnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteractionComponentStatus2 setVrsnNb(String value) {
        this.vrsnNb = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link POIComponentStatus1Code }
     *     
     */
    public POIComponentStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link POIComponentStatus1Code }
     *     
     */
    public PointOfInteractionComponentStatus2 setSts(POIComponentStatus1Code value) {
        this.sts = value;
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
