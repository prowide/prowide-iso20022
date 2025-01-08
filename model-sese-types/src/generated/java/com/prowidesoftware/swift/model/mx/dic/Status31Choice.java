
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
 * Choice of formats for the specification of the status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status31Choice", propOrder = {
    "sts",
    "rjctd",
    "cmplt",
    "pdg"
})
public class Status31Choice {

    @XmlElement(name = "Sts")
    protected TransferCancellationStatus3 sts;
    @XmlElement(name = "Rjctd")
    protected RejectionReason33 rjctd;
    @XmlElement(name = "Cmplt")
    protected CancelledCompleteReason1 cmplt;
    @XmlElement(name = "Pdg")
    protected TransferCancellationPendingStatus1 pdg;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCancellationStatus3 }
     *     
     */
    public TransferCancellationStatus3 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCancellationStatus3 }
     *     
     */
    public Status31Choice setSts(TransferCancellationStatus3 value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason33 }
     *     
     */
    public RejectionReason33 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason33 }
     *     
     */
    public Status31Choice setRjctd(RejectionReason33 value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the cmplt property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledCompleteReason1 }
     *     
     */
    public CancelledCompleteReason1 getCmplt() {
        return cmplt;
    }

    /**
     * Sets the value of the cmplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledCompleteReason1 }
     *     
     */
    public Status31Choice setCmplt(CancelledCompleteReason1 value) {
        this.cmplt = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCancellationPendingStatus1 }
     *     
     */
    public TransferCancellationPendingStatus1 getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCancellationPendingStatus1 }
     *     
     */
    public Status31Choice setPdg(TransferCancellationPendingStatus1 value) {
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
