
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
@XmlType(name = "ProcessingStatus45Choice", propOrder = {
    "pdgCxl",
    "rjctd",
    "rpr",
    "ackdAccptd",
    "prtry",
    "dnd",
    "canc"
})
public class ProcessingStatus45Choice {

    @XmlElement(name = "PdgCxl")
    protected PendingStatus11Choice pdgCxl;
    @XmlElement(name = "Rjctd")
    protected RejectionOrRepairStatus25Choice rjctd;
    @XmlElement(name = "Rpr")
    protected RejectionOrRepairStatus14Choice rpr;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus12Choice ackdAccptd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason1 prtry;
    @XmlElement(name = "Dnd")
    protected DeniedStatus10Choice dnd;
    @XmlElement(name = "Canc")
    protected CancellationStatus9Choice canc;

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus11Choice }
     *     
     */
    public PendingStatus11Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus11Choice }
     *     
     */
    public ProcessingStatus45Choice setPdgCxl(PendingStatus11Choice value) {
        this.pdgCxl = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus25Choice }
     *     
     */
    public RejectionOrRepairStatus25Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus25Choice }
     *     
     */
    public ProcessingStatus45Choice setRjctd(RejectionOrRepairStatus25Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus14Choice }
     *     
     */
    public RejectionOrRepairStatus14Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus14Choice }
     *     
     */
    public ProcessingStatus45Choice setRpr(RejectionOrRepairStatus14Choice value) {
        this.rpr = value;
        return this;
    }

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus12Choice }
     *     
     */
    public AcknowledgedAcceptedStatus12Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus12Choice }
     *     
     */
    public ProcessingStatus45Choice setAckdAccptd(AcknowledgedAcceptedStatus12Choice value) {
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
    public ProcessingStatus45Choice setPrtry(ProprietaryStatusAndReason1 value) {
        this.prtry = value;
        return this;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus10Choice }
     *     
     */
    public DeniedStatus10Choice getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus10Choice }
     *     
     */
    public ProcessingStatus45Choice setDnd(DeniedStatus10Choice value) {
        this.dnd = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus9Choice }
     *     
     */
    public CancellationStatus9Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus9Choice }
     *     
     */
    public ProcessingStatus45Choice setCanc(CancellationStatus9Choice value) {
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
