
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
@XmlType(name = "InstructionCancellationRequestStatus18Choice", propOrder = {
    "cxlCmpltd",
    "accptd",
    "rjctd",
    "pdgCxl",
    "prtrySts"
})
public class InstructionCancellationRequestStatus18Choice {

    @XmlElement(name = "CxlCmpltd")
    protected CancelledStatus14Choice cxlCmpltd;
    @XmlElement(name = "Accptd")
    protected NoSpecifiedReason1 accptd;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus54Choice rjctd;
    @XmlElement(name = "PdgCxl")
    protected PendingCancellationStatus15Choice pdgCxl;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason7 prtrySts;

    /**
     * Gets the value of the cxlCmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus14Choice }
     *     
     */
    public CancelledStatus14Choice getCxlCmpltd() {
        return cxlCmpltd;
    }

    /**
     * Sets the value of the cxlCmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus14Choice }
     *     
     */
    public InstructionCancellationRequestStatus18Choice setCxlCmpltd(CancelledStatus14Choice value) {
        this.cxlCmpltd = value;
        return this;
    }

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
    public InstructionCancellationRequestStatus18Choice setAccptd(NoSpecifiedReason1 value) {
        this.accptd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus54Choice }
     *     
     */
    public RejectedStatus54Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus54Choice }
     *     
     */
    public InstructionCancellationRequestStatus18Choice setRjctd(RejectedStatus54Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCancellationStatus15Choice }
     *     
     */
    public PendingCancellationStatus15Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCancellationStatus15Choice }
     *     
     */
    public InstructionCancellationRequestStatus18Choice setPdgCxl(PendingCancellationStatus15Choice value) {
        this.pdgCxl = value;
        return this;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public ProprietaryStatusAndReason7 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public InstructionCancellationRequestStatus18Choice setPrtrySts(ProprietaryStatusAndReason7 value) {
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
