
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
 * Association of the TM identifier and the MTM identifier of an entity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceIdentificationAssociation1", propOrder = {
    "mstrTMId",
    "tmId"
})
public class MaintenanceIdentificationAssociation1 {

    @XmlElement(name = "MstrTMId", required = true)
    protected String mstrTMId;
    @XmlElement(name = "TMId", required = true)
    protected String tmId;

    /**
     * Gets the value of the mstrTMId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrTMId() {
        return mstrTMId;
    }

    /**
     * Sets the value of the mstrTMId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MaintenanceIdentificationAssociation1 setMstrTMId(String value) {
        this.mstrTMId = value;
        return this;
    }

    /**
     * Gets the value of the tmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMId() {
        return tmId;
    }

    /**
     * Sets the value of the tmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MaintenanceIdentificationAssociation1 setTMId(String value) {
        this.tmId = value;
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
