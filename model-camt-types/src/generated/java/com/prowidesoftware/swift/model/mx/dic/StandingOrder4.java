
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
 * Defines the detailed attributes of a standing order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrder4", propOrder = {
    "stgOrdrId",
    "stgOrdrOrErr"
})
public class StandingOrder4 {

    @XmlElement(name = "StgOrdrId", required = true)
    protected StandingOrderIdentification2 stgOrdrId;
    @XmlElement(name = "StgOrdrOrErr", required = true)
    protected StandingOrderOrError4Choice stgOrdrOrErr;

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
    public StandingOrder4 setStgOrdrId(StandingOrderIdentification2 value) {
        this.stgOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the stgOrdrOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderOrError4Choice }
     *     
     */
    public StandingOrderOrError4Choice getStgOrdrOrErr() {
        return stgOrdrOrErr;
    }

    /**
     * Sets the value of the stgOrdrOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderOrError4Choice }
     *     
     */
    public StandingOrder4 setStgOrdrOrErr(StandingOrderOrError4Choice value) {
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
