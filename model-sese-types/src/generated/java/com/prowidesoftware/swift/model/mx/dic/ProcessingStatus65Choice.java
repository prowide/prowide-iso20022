
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
@XmlType(name = "ProcessingStatus65Choice", propOrder = {
    "pdgCxl",
    "rjctd",
    "rpr",
    "ackdAccptd",
    "prtry",
    "dnd",
    "canc"
})
public class ProcessingStatus65Choice {

    @XmlElement(name = "PdgCxl")
    protected PendingStatus51Choice pdgCxl;
    @XmlElement(name = "Rjctd")
    protected RejectionOrRepairStatus35Choice rjctd;
    @XmlElement(name = "Rpr")
    protected RejectionOrRepairStatus34Choice rpr;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus31Choice ackdAccptd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason7 prtry;
    @XmlElement(name = "Dnd")
    protected DeniedStatus19Choice dnd;
    @XmlElement(name = "Canc")
    protected CancellationStatus20Choice canc;

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus51Choice }
     *     
     */
    public PendingStatus51Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus51Choice }
     *     
     */
    public ProcessingStatus65Choice setPdgCxl(PendingStatus51Choice value) {
        this.pdgCxl = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus35Choice }
     *     
     */
    public RejectionOrRepairStatus35Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus35Choice }
     *     
     */
    public ProcessingStatus65Choice setRjctd(RejectionOrRepairStatus35Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus34Choice }
     *     
     */
    public RejectionOrRepairStatus34Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus34Choice }
     *     
     */
    public ProcessingStatus65Choice setRpr(RejectionOrRepairStatus34Choice value) {
        this.rpr = value;
        return this;
    }

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus31Choice }
     *     
     */
    public AcknowledgedAcceptedStatus31Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus31Choice }
     *     
     */
    public ProcessingStatus65Choice setAckdAccptd(AcknowledgedAcceptedStatus31Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public ProprietaryStatusAndReason7 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public ProcessingStatus65Choice setPrtry(ProprietaryStatusAndReason7 value) {
        this.prtry = value;
        return this;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus19Choice }
     *     
     */
    public DeniedStatus19Choice getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus19Choice }
     *     
     */
    public ProcessingStatus65Choice setDnd(DeniedStatus19Choice value) {
        this.dnd = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus20Choice }
     *     
     */
    public CancellationStatus20Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus20Choice }
     *     
     */
    public ProcessingStatus65Choice setCanc(CancellationStatus20Choice value) {
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
