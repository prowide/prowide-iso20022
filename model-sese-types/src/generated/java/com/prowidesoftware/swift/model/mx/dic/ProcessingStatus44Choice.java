
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
@XmlType(name = "ProcessingStatus44Choice", propOrder = {
    "ackdAccptd",
    "rjctd",
    "cmpltd",
    "dnd",
    "pdg",
    "prtry"
})
public class ProcessingStatus44Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus7Choice ackdAccptd;
    @XmlElement(name = "Rjctd")
    protected RejectionOrRepairStatus14Choice rjctd;
    @XmlElement(name = "Cmpltd")
    protected ProprietaryReason1 cmpltd;
    @XmlElement(name = "Dnd")
    protected DeniedStatus10Choice dnd;
    @XmlElement(name = "Pdg")
    protected PendingStatus13Choice pdg;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason1 prtry;

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
    public ProcessingStatus44Choice setAckdAccptd(AcknowledgedAcceptedStatus7Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus14Choice }
     *     
     */
    public RejectionOrRepairStatus14Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus14Choice }
     *     
     */
    public ProcessingStatus44Choice setRjctd(RejectionOrRepairStatus14Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the cmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getCmpltd() {
        return cmpltd;
    }

    /**
     * Sets the value of the cmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProcessingStatus44Choice setCmpltd(ProprietaryReason1 value) {
        this.cmpltd = value;
        return this;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus10Choice }
     *     
     */
    public DeniedStatus10Choice getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus10Choice }
     *     
     */
    public ProcessingStatus44Choice setDnd(DeniedStatus10Choice value) {
        this.dnd = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus13Choice }
     *     
     */
    public PendingStatus13Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus13Choice }
     *     
     */
    public ProcessingStatus44Choice setPdg(PendingStatus13Choice value) {
        this.pdg = value;
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
    public ProcessingStatus44Choice setPrtry(ProprietaryStatusAndReason1 value) {
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
