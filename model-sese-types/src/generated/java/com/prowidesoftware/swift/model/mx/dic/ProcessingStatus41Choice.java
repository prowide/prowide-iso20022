
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
 * Provides the status of a transaction (eg, at a non-matching CSD) as far as the message sender is concerned.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus41Choice", propOrder = {
    "rjctd",
    "canc",
    "accptd"
})
public class ProcessingStatus41Choice {

    @XmlElement(name = "Rjctd")
    protected RejectedStatus12Choice rjctd;
    @XmlElement(name = "Canc")
    protected CancelledStatus6Choice canc;
    @XmlElement(name = "Accptd")
    protected AcceptedStatus6Choice accptd;

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus12Choice }
     *     
     */
    public RejectedStatus12Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus12Choice }
     *     
     */
    public ProcessingStatus41Choice setRjctd(RejectedStatus12Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus6Choice }
     *     
     */
    public CancelledStatus6Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus6Choice }
     *     
     */
    public ProcessingStatus41Choice setCanc(CancelledStatus6Choice value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedStatus6Choice }
     *     
     */
    public AcceptedStatus6Choice getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedStatus6Choice }
     *     
     */
    public ProcessingStatus41Choice setAccptd(AcceptedStatus6Choice value) {
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
