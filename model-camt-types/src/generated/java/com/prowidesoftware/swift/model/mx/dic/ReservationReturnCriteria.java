
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
 * Defines the criteria used to report on reservation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationReturnCriteria", propOrder = {
    "startDtTmInd",
    "stsInd"
})
public class ReservationReturnCriteria {

    @XmlElement(name = "StartDtTmInd")
    protected Boolean startDtTmInd;
    @XmlElement(name = "StsInd")
    protected Boolean stsInd;

    /**
     * Gets the value of the startDtTmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartDtTmInd() {
        return startDtTmInd;
    }

    /**
     * Sets the value of the startDtTmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReservationReturnCriteria setStartDtTmInd(Boolean value) {
        this.startDtTmInd = value;
        return this;
    }

    /**
     * Gets the value of the stsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStsInd() {
        return stsInd;
    }

    /**
     * Sets the value of the stsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReservationReturnCriteria setStsInd(Boolean value) {
        this.stsInd = value;
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
