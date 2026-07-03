
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
 * Reports either on the reservation or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationReport4", propOrder = {
    "rsvatnId",
    "rsvatnOrErr"
})
public class ReservationReport4 {

    @XmlElement(name = "RsvatnId", required = true)
    protected ReservationIdentification1 rsvatnId;
    @XmlElement(name = "RsvatnOrErr", required = true)
    protected ReservationOrError5Choice rsvatnOrErr;

    /**
     * Gets the value of the rsvatnId property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationIdentification1 }
     *     
     */
    public ReservationIdentification1 getRsvatnId() {
        return rsvatnId;
    }

    /**
     * Sets the value of the rsvatnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationIdentification1 }
     *     
     */
    public ReservationReport4 setRsvatnId(ReservationIdentification1 value) {
        this.rsvatnId = value;
        return this;
    }

    /**
     * Gets the value of the rsvatnOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationOrError5Choice }
     *     
     */
    public ReservationOrError5Choice getRsvatnOrErr() {
        return rsvatnOrErr;
    }

    /**
     * Sets the value of the rsvatnOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationOrError5Choice }
     *     
     */
    public ReservationReport4 setRsvatnOrErr(ReservationOrError5Choice value) {
        this.rsvatnOrErr = value;
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
