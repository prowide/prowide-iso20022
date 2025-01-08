
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
@XmlType(name = "CurrentOrDefaultReservation3Choice", propOrder = {
    "cur",
    "dflt"
})
public class CurrentOrDefaultReservation3Choice {

    @XmlElement(name = "Cur")
    protected ReservationIdentification3 cur;
    @XmlElement(name = "Dflt")
    protected ReservationIdentification3 dflt;

    /**
     * Gets the value of the cur property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationIdentification3 }
     *     
     */
    public ReservationIdentification3 getCur() {
        return cur;
    }

    /**
     * Sets the value of the cur property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationIdentification3 }
     *     
     */
    public CurrentOrDefaultReservation3Choice setCur(ReservationIdentification3 value) {
        this.cur = value;
        return this;
    }

    /**
     * Gets the value of the dflt property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationIdentification3 }
     *     
     */
    public ReservationIdentification3 getDflt() {
        return dflt;
    }

    /**
     * Sets the value of the dflt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationIdentification3 }
     *     
     */
    public CurrentOrDefaultReservation3Choice setDflt(ReservationIdentification3 value) {
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
