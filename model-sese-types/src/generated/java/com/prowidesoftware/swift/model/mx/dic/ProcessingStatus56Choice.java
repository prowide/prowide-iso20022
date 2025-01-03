
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
 * Provides the status of a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus56Choice", propOrder = {
    "rjctd",
    "canc",
    "accptd"
})
public class ProcessingStatus56Choice {

    @XmlElement(name = "Rjctd")
    protected RejectedStatus17Choice rjctd;
    @XmlElement(name = "Canc")
    protected CancelledStatus10Choice canc;
    @XmlElement(name = "Accptd")
    protected AcceptedStatus7Choice accptd;

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus17Choice }
     *     
     */
    public RejectedStatus17Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus17Choice }
     *     
     */
    public ProcessingStatus56Choice setRjctd(RejectedStatus17Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus10Choice }
     *     
     */
    public CancelledStatus10Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus10Choice }
     *     
     */
    public ProcessingStatus56Choice setCanc(CancelledStatus10Choice value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedStatus7Choice }
     *     
     */
    public AcceptedStatus7Choice getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedStatus7Choice }
     *     
     */
    public ProcessingStatus56Choice setAccptd(AcceptedStatus7Choice value) {
        this.accptd = value;
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
