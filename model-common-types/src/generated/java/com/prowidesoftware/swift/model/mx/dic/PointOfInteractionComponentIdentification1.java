
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
 * Identification of a POI (Point of Interaction) component.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponentIdentification1", propOrder = {
    "itmNb",
    "prvdrId",
    "id",
    "srlNb"
})
public class PointOfInteractionComponentIdentification1 {

    @XmlElement(name = "ItmNb")
    protected String itmNb;
    @XmlElement(name = "PrvdrId")
    protected String prvdrId;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "SrlNb")
    protected String srlNb;

    /**
     * Gets the value of the itmNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmNb() {
        return itmNb;
    }

    /**
     * Sets the value of the itmNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteractionComponentIdentification1 setItmNb(String value) {
        this.itmNb = value;
        return this;
    }

    /**
     * Gets the value of the prvdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdrId() {
        return prvdrId;
    }

    /**
     * Sets the value of the prvdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteractionComponentIdentification1 setPrvdrId(String value) {
        this.prvdrId = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteractionComponentIdentification1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the srlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrlNb() {
        return srlNb;
    }

    /**
     * Sets the value of the srlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteractionComponentIdentification1 setSrlNb(String value) {
        this.srlNb = value;
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
