
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
@XmlType(name = "ProcessingStatus23Choice", propOrder = {
    "ackdAccptd",
    "pdgPrcg",
    "rpr",
    "pdgCxl",
    "prtry",
    "cxlReqd"
})
public class ProcessingStatus23Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus7Choice ackdAccptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus3Choice pdgPrcg;
    @XmlElement(name = "Rpr")
    protected RepairStatus5Choice rpr;
    @XmlElement(name = "PdgCxl")
    protected PendingStatus13Choice pdgCxl;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason1 prtry;
    @XmlElement(name = "CxlReqd")
    protected ProprietaryReason1 cxlReqd;

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
    public ProcessingStatus23Choice setAckdAccptd(AcknowledgedAcceptedStatus7Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatus3Choice }
     *     
     */
    public PendingProcessingStatus3Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus3Choice }
     *     
     */
    public ProcessingStatus23Choice setPdgPrcg(PendingProcessingStatus3Choice value) {
        this.pdgPrcg = value;
        return this;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RepairStatus5Choice }
     *     
     */
    public RepairStatus5Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairStatus5Choice }
     *     
     */
    public ProcessingStatus23Choice setRpr(RepairStatus5Choice value) {
        this.rpr = value;
        return this;
    }

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
    public ProcessingStatus23Choice setPdgCxl(PendingStatus13Choice value) {
        this.pdgCxl = value;
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
    public ProcessingStatus23Choice setPrtry(ProprietaryStatusAndReason1 value) {
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
    public ProcessingStatus23Choice setCxlReqd(ProprietaryReason1 value) {
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
