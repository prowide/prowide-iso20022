
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
@XmlType(name = "ProcessingStatus2Choice", propOrder = {
    "pdgCxl",
    "rjctd",
    "rpr",
    "ackdAccptd",
    "prtry",
    "dnd",
    "canc"
})
public class ProcessingStatus2Choice {

    @XmlElement(name = "PdgCxl")
    protected PendingStatus4Choice pdgCxl;
    @XmlElement(name = "Rjctd")
    protected RejectionOrRepairStatus6Choice rjctd;
    @XmlElement(name = "Rpr")
    protected RejectionOrRepairStatus6Choice rpr;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus1Choice ackdAccptd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason1 prtry;
    @XmlElement(name = "Dnd")
    protected DeniedStatus2Choice dnd;
    @XmlElement(name = "Canc")
    protected CancellationStatus3Choice canc;

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus4Choice }
     *     
     */
    public PendingStatus4Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus4Choice }
     *     
     */
    public ProcessingStatus2Choice setPdgCxl(PendingStatus4Choice value) {
        this.pdgCxl = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus6Choice }
     *     
     */
    public RejectionOrRepairStatus6Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus6Choice }
     *     
     */
    public ProcessingStatus2Choice setRjctd(RejectionOrRepairStatus6Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus6Choice }
     *     
     */
    public RejectionOrRepairStatus6Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus6Choice }
     *     
     */
    public ProcessingStatus2Choice setRpr(RejectionOrRepairStatus6Choice value) {
        this.rpr = value;
        return this;
    }

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus1Choice }
     *     
     */
    public AcknowledgedAcceptedStatus1Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus1Choice }
     *     
     */
    public ProcessingStatus2Choice setAckdAccptd(AcknowledgedAcceptedStatus1Choice value) {
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
    public ProcessingStatus2Choice setPrtry(ProprietaryStatusAndReason1 value) {
        this.prtry = value;
        return this;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus2Choice }
     *     
     */
    public DeniedStatus2Choice getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus2Choice }
     *     
     */
    public ProcessingStatus2Choice setDnd(DeniedStatus2Choice value) {
        this.dnd = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus3Choice }
     *     
     */
    public CancellationStatus3Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus3Choice }
     *     
     */
    public ProcessingStatus2Choice setCanc(CancellationStatus3Choice value) {
        this.canc = value;
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
