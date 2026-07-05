
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
 * Choice of format for the instruction processing status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionProcessingStatus17Choice", propOrder = {
    "pdgPrcg",
    "cxlReqd",
    "ackdAccptd",
    "canc",
    "gnrtd",
    "rpr",
    "pdgCxl",
    "modReqd"
})
public class InstructionProcessingStatus17Choice {

    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus9Choice pdgPrcg;
    @XmlElement(name = "CxlReqd")
    protected ProprietaryReason2 cxlReqd;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus20Choice ackdAccptd;
    @XmlElement(name = "Canc")
    protected CancellationStatus11Choice canc;
    @XmlElement(name = "Gnrtd")
    protected GeneratedStatus6Choice gnrtd;
    @XmlElement(name = "Rpr")
    protected RepairStatus10Choice rpr;
    @XmlElement(name = "PdgCxl")
    protected PendingStatus24Choice pdgCxl;
    @XmlElement(name = "ModReqd")
    protected ProprietaryReason2 modReqd;

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
    public InstructionProcessingStatus17Choice setPdgPrcg(PendingProcessingStatus9Choice value) {
        this.pdgPrcg = value;
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
    public InstructionProcessingStatus17Choice setCxlReqd(ProprietaryReason2 value) {
        this.cxlReqd = value;
        return this;
    }

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
    public InstructionProcessingStatus17Choice setAckdAccptd(AcknowledgedAcceptedStatus20Choice value) {
        this.ackdAccptd = value;
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
    public InstructionProcessingStatus17Choice setCanc(CancellationStatus11Choice value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the gnrtd property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratedStatus6Choice }
     *     
     */
    public GeneratedStatus6Choice getGnrtd() {
        return gnrtd;
    }

    /**
     * Sets the value of the gnrtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratedStatus6Choice }
     *     
     */
    public InstructionProcessingStatus17Choice setGnrtd(GeneratedStatus6Choice value) {
        this.gnrtd = value;
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
    public InstructionProcessingStatus17Choice setRpr(RepairStatus10Choice value) {
        this.rpr = value;
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
    public InstructionProcessingStatus17Choice setPdgCxl(PendingStatus24Choice value) {
        this.pdgCxl = value;
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
    public InstructionProcessingStatus17Choice setModReqd(ProprietaryReason2 value) {
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
