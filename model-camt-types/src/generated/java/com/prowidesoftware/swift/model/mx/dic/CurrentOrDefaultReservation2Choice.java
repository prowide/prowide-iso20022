
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
 * Current or default reservation set by the member and managed by the transaction administrator.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentOrDefaultReservation2Choice", propOrder = {
    "cur",
    "dflt"
})
public class CurrentOrDefaultReservation2Choice {

    @XmlElement(name = "Cur")
    protected ReservationIdentification2 cur;
    @XmlElement(name = "Dflt")
    protected ReservationIdentification2 dflt;

    /**
     * Gets the value of the cur property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationIdentification2 }
     *     
     */
    public ReservationIdentification2 getCur() {
        return cur;
    }

    /**
     * Sets the value of the cur property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationIdentification2 }
     *     
     */
    public CurrentOrDefaultReservation2Choice setCur(ReservationIdentification2 value) {
        this.cur = value;
        return this;
    }

    /**
     * Gets the value of the dflt property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationIdentification2 }
     *     
     */
    public ReservationIdentification2 getDflt() {
        return dflt;
    }

    /**
     * Sets the value of the dflt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationIdentification2 }
     *     
     */
    public CurrentOrDefaultReservation2Choice setDflt(ReservationIdentification2 value) {
        this.dflt = value;
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
