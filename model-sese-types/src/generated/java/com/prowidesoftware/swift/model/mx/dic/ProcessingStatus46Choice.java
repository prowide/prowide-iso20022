
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
@XmlType(name = "ProcessingStatus46Choice", propOrder = {
    "ackdAccptd",
    "rjctd",
    "cmpltd",
    "dnd",
    "pdg",
    "prtry"
})
public class ProcessingStatus46Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus20Choice ackdAccptd;
    @XmlElement(name = "Rjctd")
    protected RejectionOrRepairStatus20Choice rjctd;
    @XmlElement(name = "Cmpltd")
    protected ProprietaryReason2 cmpltd;
    @XmlElement(name = "Dnd")
    protected DeniedStatus11Choice dnd;
    @XmlElement(name = "Pdg")
    protected PendingStatus24Choice pdg;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason2 prtry;

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
    public ProcessingStatus46Choice setAckdAccptd(AcknowledgedAcceptedStatus20Choice value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus20Choice }
     *     
     */
    public RejectionOrRepairStatus20Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus20Choice }
     *     
     */
    public ProcessingStatus46Choice setRjctd(RejectionOrRepairStatus20Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the cmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason2 }
     *     
     */
    public ProprietaryReason2 getCmpltd() {
        return cmpltd;
    }

    /**
     * Sets the value of the cmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason2 }
     *     
     */
    public ProcessingStatus46Choice setCmpltd(ProprietaryReason2 value) {
        this.cmpltd = value;
        return this;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus11Choice }
     *     
     */
    public DeniedStatus11Choice getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus11Choice }
     *     
     */
    public ProcessingStatus46Choice setDnd(DeniedStatus11Choice value) {
        this.dnd = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus24Choice }
     *     
     */
    public PendingStatus24Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus24Choice }
     *     
     */
    public ProcessingStatus46Choice setPdg(PendingStatus24Choice value) {
        this.pdg = value;
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
    public ProcessingStatus46Choice setPrtry(ProprietaryStatusAndReason2 value) {
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
