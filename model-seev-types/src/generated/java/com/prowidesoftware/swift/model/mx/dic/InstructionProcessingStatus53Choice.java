
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
 * Choice between different instruction processing statuses.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionProcessingStatus53Choice", propOrder = {
    "accptd",
    "canc",
    "accptdForFrthrPrcg",
    "rjctd",
    "pdg",
    "pdgCxl",
    "cvrd",
    "ucvrd"
})
public class InstructionProcessingStatus53Choice {

    @XmlElement(name = "Accptd")
    protected NoSpecifiedReason1 accptd;
    @XmlElement(name = "Canc")
    protected CancelledStatus15Choice canc;
    @XmlElement(name = "AccptdForFrthrPrcg")
    protected NoSpecifiedReason1 accptdForFrthrPrcg;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus59Choice rjctd;
    @XmlElement(name = "Pdg")
    protected PendingStatus72Choice pdg;
    @XmlElement(name = "PdgCxl")
    protected PendingCancellationStatus9Choice pdgCxl;
    @XmlElement(name = "Cvrd")
    protected NoSpecifiedReason1 cvrd;
    @XmlElement(name = "Ucvrd")
    protected NoSpecifiedReason1 ucvrd;

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
    public InstructionProcessingStatus53Choice setAccptd(NoSpecifiedReason1 value) {
        this.accptd = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus15Choice }
     *     
     */
    public CancelledStatus15Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus15Choice }
     *     
     */
    public InstructionProcessingStatus53Choice setCanc(CancelledStatus15Choice value) {
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
    public InstructionProcessingStatus53Choice setAccptdForFrthrPrcg(NoSpecifiedReason1 value) {
        this.accptdForFrthrPrcg = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus59Choice }
     *     
     */
    public RejectedStatus59Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus59Choice }
     *     
     */
    public InstructionProcessingStatus53Choice setRjctd(RejectedStatus59Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus72Choice }
     *     
     */
    public PendingStatus72Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus72Choice }
     *     
     */
    public InstructionProcessingStatus53Choice setPdg(PendingStatus72Choice value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCancellationStatus9Choice }
     *     
     */
    public PendingCancellationStatus9Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCancellationStatus9Choice }
     *     
     */
    public InstructionProcessingStatus53Choice setPdgCxl(PendingCancellationStatus9Choice value) {
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
    public InstructionProcessingStatus53Choice setCvrd(NoSpecifiedReason1 value) {
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
    public InstructionProcessingStatus53Choice setUcvrd(NoSpecifiedReason1 value) {
        this.ucvrd = value;
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
