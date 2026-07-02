
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
 * Choice of format for the processing status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionProcessingStatus2Choice", propOrder = {
    "rjctd",
    "rpr",
    "canc",
    "ackdAccptd",
    "prtry"
})
public class IntraPositionProcessingStatus2Choice {

    @XmlElement(name = "Rjctd")
    protected RejectionOrRepairStatus3Choice rjctd;
    @XmlElement(name = "Rpr")
    protected RejectionOrRepairStatus3Choice rpr;
    @XmlElement(name = "Canc")
    protected CancellationStatus6Choice canc;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus6Choice ackdAccptd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason2 prtry;

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus3Choice }
     *     
     */
    public RejectionOrRepairStatus3Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus3Choice }
     *     
     */
    public IntraPositionProcessingStatus2Choice setRjctd(RejectionOrRepairStatus3Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus3Choice }
     *     
     */
    public RejectionOrRepairStatus3Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus3Choice }
     *     
     */
    public IntraPositionProcessingStatus2Choice setRpr(RejectionOrRepairStatus3Choice value) {
        this.rpr = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus6Choice }
     *     
     */
    public CancellationStatus6Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus6Choice }
     *     
     */
    public IntraPositionProcessingStatus2Choice setCanc(CancellationStatus6Choice value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus6Choice }
     *     
     */
    public AcknowledgedAcceptedStatus6Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus6Choice }
     *     
     */
    public IntraPositionProcessingStatus2Choice setAckdAccptd(AcknowledgedAcceptedStatus6Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason2 }
     *     
     */
    public ProprietaryStatusAndReason2 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason2 }
     *     
     */
    public IntraPositionProcessingStatus2Choice setPrtry(ProprietaryStatusAndReason2 value) {
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
