
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
 * Status applying globally to the instruction received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionStatus12Choice", propOrder = {
    "prcgSts",
    "rjctd",
    "pdg"
})
public class InstructionStatus12Choice {

    @XmlElement(name = "PrcgSts")
    protected InstructionProcessingStatus5 prcgSts;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus55Choice rjctd;
    @XmlElement(name = "Pdg")
    protected PendingStatus70Choice pdg;

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus5 }
     *     
     */
    public InstructionProcessingStatus5 getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus5 }
     *     
     */
    public InstructionStatus12Choice setPrcgSts(InstructionProcessingStatus5 value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus55Choice }
     *     
     */
    public RejectedStatus55Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus55Choice }
     *     
     */
    public InstructionStatus12Choice setRjctd(RejectedStatus55Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus70Choice }
     *     
     */
    public PendingStatus70Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus70Choice }
     *     
     */
    public InstructionStatus12Choice setPdg(PendingStatus70Choice value) {
        this.pdg = value;
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
