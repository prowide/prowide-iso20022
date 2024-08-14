
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
@XmlType(name = "ProcessingStatus21Choice", propOrder = {
    "pdgCxl",
    "ackdAccptd",
    "pdgPrcg",
    "rjctd",
    "rpr",
    "canc",
    "prtry",
    "cxlReqd",
    "modReqd"
})
public class ProcessingStatus21Choice {

    @XmlElement(name = "PdgCxl")
    protected PendingStatus13Choice pdgCxl;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus7Choice ackdAccptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus4Choice pdgPrcg;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus6Choice rjctd;
    @XmlElement(name = "Rpr")
    protected RepairStatus6Choice rpr;
    @XmlElement(name = "Canc")
    protected CancellationStatus8Choice canc;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason1 prtry;
    @XmlElement(name = "CxlReqd")
    protected ProprietaryReason1 cxlReqd;
    @XmlElement(name = "ModReqd")
    protected ProprietaryReason1 modReqd;

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus13Choice }
     *     
     */
    public PendingStatus13Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus13Choice }
     *     
     */
    public ProcessingStatus21Choice setPdgCxl(PendingStatus13Choice value) {
        this.pdgCxl = value;
        return this;
    }

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus7Choice }
     *     
     */
    public AcknowledgedAcceptedStatus7Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus7Choice }
     *     
     */
    public ProcessingStatus21Choice setAckdAccptd(AcknowledgedAcceptedStatus7Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatus4Choice }
     *     
     */
    public PendingProcessingStatus4Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus4Choice }
     *     
     */
    public ProcessingStatus21Choice setPdgPrcg(PendingProcessingStatus4Choice value) {
        this.pdgPrcg = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus6Choice }
     *     
     */
    public RejectionStatus6Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus6Choice }
     *     
     */
    public ProcessingStatus21Choice setRjctd(RejectionStatus6Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RepairStatus6Choice }
     *     
     */
    public RepairStatus6Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairStatus6Choice }
     *     
     */
    public ProcessingStatus21Choice setRpr(RepairStatus6Choice value) {
        this.rpr = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus8Choice }
     *     
     */
    public CancellationStatus8Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus8Choice }
     *     
     */
    public ProcessingStatus21Choice setCanc(CancellationStatus8Choice value) {
        this.canc = value;
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
    public ProcessingStatus21Choice setPrtry(ProprietaryStatusAndReason1 value) {
        this.prtry = value;
        return this;
    }

    /**
     * Gets the value of the cxlReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getCxlReqd() {
        return cxlReqd;
    }

    /**
     * Sets the value of the cxlReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus21Choice setCxlReqd(ProprietaryReason1 value) {
        this.cxlReqd = value;
        return this;
    }

    /**
     * Gets the value of the modReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getModReqd() {
        return modReqd;
    }

    /**
     * Sets the value of the modReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus21Choice setModReqd(ProprietaryReason1 value) {
        this.modReqd = value;
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
