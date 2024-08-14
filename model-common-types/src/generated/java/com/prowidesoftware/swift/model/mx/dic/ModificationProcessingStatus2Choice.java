
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
@XmlType(name = "ModificationProcessingStatus2Choice", propOrder = {
    "ackdAccptd",
    "pdgPrcg",
    "dnd",
    "rjctd",
    "rprd",
    "modfd",
    "prtry"
})
public class ModificationProcessingStatus2Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus14Choice ackdAccptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus7Choice pdgPrcg;
    @XmlElement(name = "Dnd")
    protected DeniedStatus6Choice dnd;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus8Choice rjctd;
    @XmlElement(name = "Rprd")
    protected RepairStatus8Choice rprd;
    @XmlElement(name = "Modfd")
    protected ModificationStatus2Choice modfd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason1 prtry;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus14Choice }
     *     
     */
    public AcknowledgedAcceptedStatus14Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus14Choice }
     *     
     */
    public ModificationProcessingStatus2Choice setAckdAccptd(AcknowledgedAcceptedStatus14Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatus7Choice }
     *     
     */
    public PendingProcessingStatus7Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus7Choice }
     *     
     */
    public ModificationProcessingStatus2Choice setPdgPrcg(PendingProcessingStatus7Choice value) {
        this.pdgPrcg = value;
        return this;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus6Choice }
     *     
     */
    public DeniedStatus6Choice getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus6Choice }
     *     
     */
    public ModificationProcessingStatus2Choice setDnd(DeniedStatus6Choice value) {
        this.dnd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus8Choice }
     *     
     */
    public RejectionStatus8Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus8Choice }
     *     
     */
    public ModificationProcessingStatus2Choice setRjctd(RejectionStatus8Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the rprd property.
     * 
     * @return
     *     possible object is
     *     {@link RepairStatus8Choice }
     *     
     */
    public RepairStatus8Choice getRprd() {
        return rprd;
    }

    /**
     * Sets the value of the rprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairStatus8Choice }
     *     
     */
    public ModificationProcessingStatus2Choice setRprd(RepairStatus8Choice value) {
        this.rprd = value;
        return this;
    }

    /**
     * Gets the value of the modfd property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationStatus2Choice }
     *     
     */
    public ModificationStatus2Choice getModfd() {
        return modfd;
    }

    /**
     * Sets the value of the modfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationStatus2Choice }
     *     
     */
    public ModificationProcessingStatus2Choice setModfd(ModificationStatus2Choice value) {
        this.modfd = value;
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
    public ModificationProcessingStatus2Choice setPrtry(ProprietaryStatusAndReason1 value) {
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
