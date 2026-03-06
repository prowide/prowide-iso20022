
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
 * Choice of format for the processing status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus71Choice__1", propOrder = {
    "ackdAccptd",
    "dnd",
    "cmpltd"
})
public class ProcessingStatus71Choice1 {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus21Choice1 ackdAccptd;
    @XmlElement(name = "Dnd")
    protected DeniedStatus16Choice1 dnd;
    @XmlElement(name = "Cmpltd")
    protected ProprietaryReason41 cmpltd;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus21Choice1 }
     *     
     */
    public AcknowledgedAcceptedStatus21Choice1 getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus21Choice1 }
     *     
     */
    public ProcessingStatus71Choice1 setAckdAccptd(AcknowledgedAcceptedStatus21Choice1 value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus16Choice1 }
     *     
     */
    public DeniedStatus16Choice1 getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus16Choice1 }
     *     
     */
    public ProcessingStatus71Choice1 setDnd(DeniedStatus16Choice1 value) {
        this.dnd = value;
        return this;
    }

    /**
     * Gets the value of the cmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason41 }
     *     
     */
    public ProprietaryReason41 getCmpltd() {
        return cmpltd;
    }

    /**
     * Sets the value of the cmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason41 }
     *     
     */
    public ProcessingStatus71Choice1 setCmpltd(ProprietaryReason41 value) {
        this.cmpltd = value;
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
