
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
 * Choice between different instruction cancellation request statuses.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionCancellationRequestStatus4Choice", propOrder = {
    "cxlCmpltd",
    "accptd",
    "rjctd",
    "pdgCxl",
    "prtrySts"
})
public class InstructionCancellationRequestStatus4Choice {

    @XmlElement(name = "CxlCmpltd")
    protected CancelledStatus4Choice cxlCmpltd;
    @XmlElement(name = "Accptd")
    protected AcceptedStatus2Choice accptd;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus2Choice rjctd;
    @XmlElement(name = "PdgCxl")
    protected PendingCancellationStatus2Choice pdgCxl;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason2 prtrySts;

    /**
     * Gets the value of the cxlCmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus4Choice }
     *     
     */
    public CancelledStatus4Choice getCxlCmpltd() {
        return cxlCmpltd;
    }

    /**
     * Sets the value of the cxlCmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus4Choice }
     *     
     */
    public InstructionCancellationRequestStatus4Choice setCxlCmpltd(CancelledStatus4Choice value) {
        this.cxlCmpltd = value;
        return this;
    }

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedStatus2Choice }
     *     
     */
    public AcceptedStatus2Choice getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedStatus2Choice }
     *     
     */
    public InstructionCancellationRequestStatus4Choice setAccptd(AcceptedStatus2Choice value) {
        this.accptd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus2Choice }
     *     
     */
    public RejectedStatus2Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus2Choice }
     *     
     */
    public InstructionCancellationRequestStatus4Choice setRjctd(RejectedStatus2Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCancellationStatus2Choice }
     *     
     */
    public PendingCancellationStatus2Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCancellationStatus2Choice }
     *     
     */
    public InstructionCancellationRequestStatus4Choice setPdgCxl(PendingCancellationStatus2Choice value) {
        this.pdgCxl = value;
        return this;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason2 }
     *     
     */
    public ProprietaryStatusAndReason2 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason2 }
     *     
     */
    public InstructionCancellationRequestStatus4Choice setPrtrySts(ProprietaryStatusAndReason2 value) {
        this.prtrySts = value;
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
