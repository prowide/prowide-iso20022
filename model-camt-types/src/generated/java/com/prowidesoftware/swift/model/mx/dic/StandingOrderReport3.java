
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
 * Defines the detailed attributes of a standing order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderReport3", propOrder = {
    "stgOrdrId",
    "stgOrdrOrErr"
})
public class StandingOrderReport3 {

    @XmlElement(name = "StgOrdrId", required = true)
    protected StandingOrderIdentification8 stgOrdrId;
    @XmlElement(name = "StgOrdrOrErr", required = true)
    protected StandingOrderOrError10Choice stgOrdrOrErr;

    /**
     * Gets the value of the stgOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderIdentification8 }
     *     
     */
    public StandingOrderIdentification8 getStgOrdrId() {
        return stgOrdrId;
    }

    /**
     * Sets the value of the stgOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderIdentification8 }
     *     
     */
    public StandingOrderReport3 setStgOrdrId(StandingOrderIdentification8 value) {
        this.stgOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the stgOrdrOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderOrError10Choice }
     *     
     */
    public StandingOrderOrError10Choice getStgOrdrOrErr() {
        return stgOrdrOrErr;
    }

    /**
     * Sets the value of the stgOrdrOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderOrError10Choice }
     *     
     */
    public StandingOrderReport3 setStgOrdrOrErr(StandingOrderOrError10Choice value) {
        this.stgOrdrOrErr = value;
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
