
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
@XmlType(name = "ProcessingStatus15Choice", propOrder = {
    "ackdAccptd",
    "rjctd",
    "cmpltd",
    "dnd",
    "prtry",
    "pdg"
})
public class ProcessingStatus15Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus6Choice ackdAccptd;
    @XmlElement(name = "Rjctd")
    protected RejectionOrRepairStatus12Choice rjctd;
    @XmlElement(name = "Cmpltd")
    protected NoSpecifiedReason1 cmpltd;
    @XmlElement(name = "Dnd")
    protected DeniedStatus4Choice dnd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason2 prtry;
    @XmlElement(name = "Pdg")
    protected PendingStatus7Choice pdg;

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
    public ProcessingStatus15Choice setAckdAccptd(AcknowledgedAcceptedStatus6Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus12Choice }
     *     
     */
    public RejectionOrRepairStatus12Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus12Choice }
     *     
     */
    public ProcessingStatus15Choice setRjctd(RejectionOrRepairStatus12Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the cmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getCmpltd() {
        return cmpltd;
    }

    /**
     * Sets the value of the cmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public ProcessingStatus15Choice setCmpltd(NoSpecifiedReason1 value) {
        this.cmpltd = value;
        return this;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus4Choice }
     *     
     */
    public DeniedStatus4Choice getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus4Choice }
     *     
     */
    public ProcessingStatus15Choice setDnd(DeniedStatus4Choice value) {
        this.dnd = value;
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
    public ProcessingStatus15Choice setPrtry(ProprietaryStatusAndReason2 value) {
        this.prtry = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus7Choice }
     *     
     */
    public PendingStatus7Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus7Choice }
     *     
     */
    public ProcessingStatus15Choice setPdg(PendingStatus7Choice value) {
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
