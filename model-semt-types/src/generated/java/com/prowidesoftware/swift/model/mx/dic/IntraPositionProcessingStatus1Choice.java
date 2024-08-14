
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
@XmlType(name = "IntraPositionProcessingStatus1Choice", propOrder = {
    "rjctd",
    "rpr",
    "canc",
    "ackdAccptd",
    "prtry"
})
public class IntraPositionProcessingStatus1Choice {

    @XmlElement(name = "Rjctd")
    protected RejectionOrRepairStatus2Choice rjctd;
    @XmlElement(name = "Rpr")
    protected RejectionOrRepairStatus2Choice rpr;
    @XmlElement(name = "Canc")
    protected CancellationStatus4Choice canc;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus3Choice ackdAccptd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason1 prtry;

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus2Choice }
     *     
     */
    public RejectionOrRepairStatus2Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus2Choice }
     *     
     */
    public IntraPositionProcessingStatus1Choice setRjctd(RejectionOrRepairStatus2Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus2Choice }
     *     
     */
    public RejectionOrRepairStatus2Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus2Choice }
     *     
     */
    public IntraPositionProcessingStatus1Choice setRpr(RejectionOrRepairStatus2Choice value) {
        this.rpr = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus4Choice }
     *     
     */
    public CancellationStatus4Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus4Choice }
     *     
     */
    public IntraPositionProcessingStatus1Choice setCanc(CancellationStatus4Choice value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus3Choice }
     *     
     */
    public AcknowledgedAcceptedStatus3Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus3Choice }
     *     
     */
    public IntraPositionProcessingStatus1Choice setAckdAccptd(AcknowledgedAcceptedStatus3Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason1 }
     *     
     */
    public ProprietaryStatusAndReason1 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason1 }
     *     
     */
    public IntraPositionProcessingStatus1Choice setPrtry(ProprietaryStatusAndReason1 value) {
        this.prtry = value;
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
