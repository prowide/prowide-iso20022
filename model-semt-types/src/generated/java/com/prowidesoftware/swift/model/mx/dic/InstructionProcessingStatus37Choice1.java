
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
 * Choice of format for the instruction processing status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionProcessingStatus37Choice__1", propOrder = {
    "cxlReqd",
    "ackdAccptd",
    "canc",
    "pdgCxl"
})
public class InstructionProcessingStatus37Choice1 {

    @XmlElement(name = "CxlReqd")
    protected ProprietaryReason41 cxlReqd;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus21Choice1 ackdAccptd;
    @XmlElement(name = "Canc")
    protected CancellationStatus24Choice1 canc;
    @XmlElement(name = "PdgCxl")
    protected PendingStatus38Choice1 pdgCxl;

    /**
     * Gets the value of the cxlReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason41 }
     *     
     */
    public ProprietaryReason41 getCxlReqd() {
        return cxlReqd;
    }

    /**
     * Sets the value of the cxlReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason41 }
     *     
     */
    public InstructionProcessingStatus37Choice1 setCxlReqd(ProprietaryReason41 value) {
        this.cxlReqd = value;
        return this;
    }

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus21Choice1 }
     *     
     */
    public AcknowledgedAcceptedStatus21Choice1 getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus21Choice1 }
     *     
     */
    public InstructionProcessingStatus37Choice1 setAckdAccptd(AcknowledgedAcceptedStatus21Choice1 value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus24Choice1 }
     *     
     */
    public CancellationStatus24Choice1 getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus24Choice1 }
     *     
     */
    public InstructionProcessingStatus37Choice1 setCanc(CancellationStatus24Choice1 value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus38Choice1 }
     *     
     */
    public PendingStatus38Choice1 getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus38Choice1 }
     *     
     */
    public InstructionProcessingStatus37Choice1 setPdgCxl(PendingStatus38Choice1 value) {
        this.pdgCxl = value;
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
