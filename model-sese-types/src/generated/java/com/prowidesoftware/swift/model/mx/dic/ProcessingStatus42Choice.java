
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
@XmlType(name = "ProcessingStatus42Choice", propOrder = {
    "ackdAccptd",
    "pdgPrcg",
    "rjctd",
    "rpr",
    "canc",
    "pdgCxl",
    "prtry",
    "cxlReqd",
    "modReqd"
})
public class ProcessingStatus42Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus20Choice ackdAccptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus9Choice pdgPrcg;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus16Choice rjctd;
    @XmlElement(name = "Rpr")
    protected RepairStatus10Choice rpr;
    @XmlElement(name = "Canc")
    protected CancellationStatus11Choice canc;
    @XmlElement(name = "PdgCxl")
    protected PendingStatus24Choice pdgCxl;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason2 prtry;
    @XmlElement(name = "CxlReqd")
    protected ProprietaryReason2 cxlReqd;
    @XmlElement(name = "ModReqd")
    protected ProprietaryReason2 modReqd;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus20Choice }
     *     
     */
    public AcknowledgedAcceptedStatus20Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus20Choice }
     *     
     */
    public ProcessingStatus42Choice setAckdAccptd(AcknowledgedAcceptedStatus20Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatus9Choice }
     *     
     */
    public PendingProcessingStatus9Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus9Choice }
     *     
     */
    public ProcessingStatus42Choice setPdgPrcg(PendingProcessingStatus9Choice value) {
        this.pdgPrcg = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus16Choice }
     *     
     */
    public RejectionStatus16Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus16Choice }
     *     
     */
    public ProcessingStatus42Choice setRjctd(RejectionStatus16Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RepairStatus10Choice }
     *     
     */
    public RepairStatus10Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairStatus10Choice }
     *     
     */
    public ProcessingStatus42Choice setRpr(RepairStatus10Choice value) {
        this.rpr = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus11Choice }
     *     
     */
    public CancellationStatus11Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus11Choice }
     *     
     */
    public ProcessingStatus42Choice setCanc(CancellationStatus11Choice value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus24Choice }
     *     
     */
    public PendingStatus24Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus24Choice }
     *     
     */
    public ProcessingStatus42Choice setPdgCxl(PendingStatus24Choice value) {
        this.pdgCxl = value;
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
    public ProcessingStatus42Choice setPrtry(ProprietaryStatusAndReason2 value) {
        this.prtry = value;
        return this;
    }

    /**
     * Gets the value of the cxlReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason2 }
     *     
     */
    public ProprietaryReason2 getCxlReqd() {
        return cxlReqd;
    }

    /**
     * Sets the value of the cxlReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason2 }
     *     
     */
    public ProcessingStatus42Choice setCxlReqd(ProprietaryReason2 value) {
        this.cxlReqd = value;
        return this;
    }

    /**
     * Gets the value of the modReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason2 }
     *     
     */
    public ProprietaryReason2 getModReqd() {
        return modReqd;
    }

    /**
     * Sets the value of the modReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason2 }
     *     
     */
    public ProcessingStatus42Choice setModReqd(ProprietaryReason2 value) {
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
