
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
 * Choice between different instruction processing statuses.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionProcessingStatus62Choice", propOrder = {
    "accptd",
    "canc",
    "accptdForFrthrPrcg",
    "rjctd",
    "pdg",
    "pdgCxl",
    "cvrd",
    "ucvrd",
    "rtrd"
})
public class InstructionProcessingStatus62Choice {

    @XmlElement(name = "Accptd")
    protected NoSpecifiedReason1 accptd;
    @XmlElement(name = "Canc")
    protected CancelledStatus12Choice canc;
    @XmlElement(name = "AccptdForFrthrPrcg")
    protected NoSpecifiedReason1 accptdForFrthrPrcg;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus58Choice rjctd;
    @XmlElement(name = "Pdg")
    protected PendingStatus85Choice pdg;
    @XmlElement(name = "PdgCxl")
    protected PendingCancellationStatus21Choice pdgCxl;
    @XmlElement(name = "Cvrd")
    protected NoSpecifiedReason1 cvrd;
    @XmlElement(name = "Ucvrd")
    protected NoSpecifiedReason1 ucvrd;
    @XmlElement(name = "Rtrd")
    protected ReturnedStatus2Choice rtrd;

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public InstructionProcessingStatus62Choice setAccptd(NoSpecifiedReason1 value) {
        this.accptd = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus12Choice }
     *     
     */
    public CancelledStatus12Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus12Choice }
     *     
     */
    public InstructionProcessingStatus62Choice setCanc(CancelledStatus12Choice value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the accptdForFrthrPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getAccptdForFrthrPrcg() {
        return accptdForFrthrPrcg;
    }

    /**
     * Sets the value of the accptdForFrthrPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public InstructionProcessingStatus62Choice setAccptdForFrthrPrcg(NoSpecifiedReason1 value) {
        this.accptdForFrthrPrcg = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus58Choice }
     *     
     */
    public RejectedStatus58Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus58Choice }
     *     
     */
    public InstructionProcessingStatus62Choice setRjctd(RejectedStatus58Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus85Choice }
     *     
     */
    public PendingStatus85Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus85Choice }
     *     
     */
    public InstructionProcessingStatus62Choice setPdg(PendingStatus85Choice value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCancellationStatus21Choice }
     *     
     */
    public PendingCancellationStatus21Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCancellationStatus21Choice }
     *     
     */
    public InstructionProcessingStatus62Choice setPdgCxl(PendingCancellationStatus21Choice value) {
        this.pdgCxl = value;
        return this;
    }

    /**
     * Gets the value of the cvrd property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getCvrd() {
        return cvrd;
    }

    /**
     * Sets the value of the cvrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public InstructionProcessingStatus62Choice setCvrd(NoSpecifiedReason1 value) {
        this.cvrd = value;
        return this;
    }

    /**
     * Gets the value of the ucvrd property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getUcvrd() {
        return ucvrd;
    }

    /**
     * Sets the value of the ucvrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public InstructionProcessingStatus62Choice setUcvrd(NoSpecifiedReason1 value) {
        this.ucvrd = value;
        return this;
    }

    /**
     * Gets the value of the rtrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnedStatus2Choice }
     *     
     */
    public ReturnedStatus2Choice getRtrd() {
        return rtrd;
    }

    /**
     * Sets the value of the rtrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnedStatus2Choice }
     *     
     */
    public InstructionProcessingStatus62Choice setRtrd(ReturnedStatus2Choice value) {
        this.rtrd = value;
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
