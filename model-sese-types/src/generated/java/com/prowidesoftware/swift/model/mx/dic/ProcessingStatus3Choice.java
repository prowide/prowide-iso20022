
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
@XmlType(name = "ProcessingStatus3Choice", propOrder = {
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
public class ProcessingStatus3Choice {

    @XmlElement(name = "PdgCxl")
    protected PendingStatus4Choice pdgCxl;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus3Choice ackdAccptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus1Choice pdgPrcg;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus3Choice rjctd;
    @XmlElement(name = "Rpr")
    protected RepairStatus3Choice rpr;
    @XmlElement(name = "Canc")
    protected CancellationStatus4Choice canc;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason1 prtry;
    @XmlElement(name = "CxlReqd")
    protected NoSpecifiedReason1 cxlReqd;
    @XmlElement(name = "ModReqd")
    protected NoSpecifiedReason1 modReqd;

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
    public ProcessingStatus3Choice setPdgCxl(PendingStatus4Choice value) {
        this.pdgCxl = value;
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
    public ProcessingStatus3Choice setAckdAccptd(AcknowledgedAcceptedStatus3Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatus1Choice }
     *     
     */
    public PendingProcessingStatus1Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus1Choice }
     *     
     */
    public ProcessingStatus3Choice setPdgPrcg(PendingProcessingStatus1Choice value) {
        this.pdgPrcg = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus3Choice }
     *     
     */
    public RejectionStatus3Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus3Choice }
     *     
     */
    public ProcessingStatus3Choice setRjctd(RejectionStatus3Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RepairStatus3Choice }
     *     
     */
    public RepairStatus3Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairStatus3Choice }
     *     
     */
    public ProcessingStatus3Choice setRpr(RepairStatus3Choice value) {
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
    public ProcessingStatus3Choice setCanc(CancellationStatus4Choice value) {
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
    public ProcessingStatus3Choice setPrtry(ProprietaryStatusAndReason1 value) {
        this.prtry = value;
        return this;
    }

    /**
     * Gets the value of the cxlReqd property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getCxlReqd() {
        return cxlReqd;
    }

    /**
     * Sets the value of the cxlReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public ProcessingStatus3Choice setCxlReqd(NoSpecifiedReason1 value) {
        this.cxlReqd = value;
        return this;
    }

    /**
     * Gets the value of the modReqd property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getModReqd() {
        return modReqd;
    }

    /**
     * Sets the value of the modReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public ProcessingStatus3Choice setModReqd(NoSpecifiedReason1 value) {
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
