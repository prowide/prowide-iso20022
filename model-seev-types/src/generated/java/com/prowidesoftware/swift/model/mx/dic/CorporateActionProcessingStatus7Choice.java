
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
 * Specifies the status of the details of the corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionProcessingStatus7Choice", propOrder = {
    "forInfOnly",
    "evtInfSts"
})
public class CorporateActionProcessingStatus7Choice {

    @XmlElement(name = "ForInfOnly")
    protected Boolean forInfOnly;
    @XmlElement(name = "EvtInfSts")
    protected CorporateActionProcessingStatus5Choice evtInfSts;

    /**
     * Gets the value of the forInfOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForInfOnly() {
        return forInfOnly;
    }

    /**
     * Sets the value of the forInfOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionProcessingStatus7Choice setForInfOnly(Boolean value) {
        this.forInfOnly = value;
        return this;
    }

    /**
     * Gets the value of the evtInfSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionProcessingStatus5Choice }
     *     
     */
    public CorporateActionProcessingStatus5Choice getEvtInfSts() {
        return evtInfSts;
    }

    /**
     * Sets the value of the evtInfSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionProcessingStatus5Choice }
     *     
     */
    public CorporateActionProcessingStatus7Choice setEvtInfSts(CorporateActionProcessingStatus5Choice value) {
        this.evtInfSts = value;
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
