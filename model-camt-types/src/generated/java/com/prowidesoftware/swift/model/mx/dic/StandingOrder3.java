
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
@XmlType(name = "StandingOrder3", propOrder = {
    "stgOrdrId",
    "stgOrdrOrErr"
})
public class StandingOrder3 {

    @XmlElement(name = "StgOrdrId", required = true)
    protected StandingOrderIdentification2 stgOrdrId;
    @XmlElement(name = "StgOrdrOrErr", required = true)
    protected StandingOrderOrError2Choice stgOrdrOrErr;

    /**
     * Gets the value of the stgOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderIdentification2 }
     *     
     */
    public StandingOrderIdentification2 getStgOrdrId() {
        return stgOrdrId;
    }

    /**
     * Sets the value of the stgOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderIdentification2 }
     *     
     */
    public StandingOrder3 setStgOrdrId(StandingOrderIdentification2 value) {
        this.stgOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the stgOrdrOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderOrError2Choice }
     *     
     */
    public StandingOrderOrError2Choice getStgOrdrOrErr() {
        return stgOrdrOrErr;
    }

    /**
     * Sets the value of the stgOrdrOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderOrError2Choice }
     *     
     */
    public StandingOrder3 setStgOrdrOrErr(StandingOrderOrError2Choice value) {
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
