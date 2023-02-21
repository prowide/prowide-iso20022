
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
@XmlType(name = "ProcessingStatus12Choice", propOrder = {
    "ackdAccptd",
    "pdgPrcg",
    "rpr",
    "pdgCxl",
    "prtry",
    "cxlReqd"
})
public class ProcessingStatus12Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus6Choice ackdAccptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus2Choice pdgPrcg;
    @XmlElement(name = "Rpr")
    protected RepairStatus2Choice rpr;
    @XmlElement(name = "PdgCxl")
    protected PendingStatus7Choice pdgCxl;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason2 prtry;
    @XmlElement(name = "CxlReqd")
    protected NoSpecifiedReason1 cxlReqd;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus6Choice }
     *     
     */
    public AcknowledgedAcceptedStatus6Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus6Choice }
     *     
     */
    public ProcessingStatus12Choice setAckdAccptd(AcknowledgedAcceptedStatus6Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatus2Choice }
     *     
     */
    public PendingProcessingStatus2Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus2Choice }
     *     
     */
    public ProcessingStatus12Choice setPdgPrcg(PendingProcessingStatus2Choice value) {
        this.pdgPrcg = value;
        return this;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RepairStatus2Choice }
     *     
     */
    public RepairStatus2Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairStatus2Choice }
     *     
     */
    public ProcessingStatus12Choice setRpr(RepairStatus2Choice value) {
        this.rpr = value;
        return this;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus7Choice }
     *     
     */
    public PendingStatus7Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus7Choice }
     *     
     */
    public ProcessingStatus12Choice setPdgCxl(PendingStatus7Choice value) {
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
    public ProcessingStatus12Choice setPrtry(ProprietaryStatusAndReason2 value) {
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
    public ProcessingStatus12Choice setCxlReqd(NoSpecifiedReason1 value) {
        this.cxlReqd = value;
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
