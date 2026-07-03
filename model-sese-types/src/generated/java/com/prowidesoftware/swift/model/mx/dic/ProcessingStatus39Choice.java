
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
@XmlType(name = "ProcessingStatus39Choice", propOrder = {
    "rjctd",
    "canc",
    "accptd"
})
public class ProcessingStatus39Choice {

    @XmlElement(name = "Rjctd")
    protected RejectedStatus10Choice rjctd;
    @XmlElement(name = "Canc")
    protected CancelledStatus5Choice canc;
    @XmlElement(name = "Accptd")
    protected AcceptedStatus4Choice accptd;

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus10Choice }
     *     
     */
    public RejectedStatus10Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus10Choice }
     *     
     */
    public ProcessingStatus39Choice setRjctd(RejectedStatus10Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus5Choice }
     *     
     */
    public CancelledStatus5Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus5Choice }
     *     
     */
    public ProcessingStatus39Choice setCanc(CancelledStatus5Choice value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedStatus4Choice }
     *     
     */
    public AcceptedStatus4Choice getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedStatus4Choice }
     *     
     */
    public ProcessingStatus39Choice setAccptd(AcceptedStatus4Choice value) {
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
