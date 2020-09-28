
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of formats for the specification of a status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus43Choice", propOrder = {
    "rcvd",
    "accptd",
    "pdgPrcg",
    "rjctd",
    "prtrySts"
})
public class ProcessingStatus43Choice {

    @XmlElement(name = "Rcvd")
    protected ReceivedStatusReason1 rcvd;
    @XmlElement(name = "Accptd")
    protected AcceptedStatusReason7 accptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatusReason1 pdgPrcg;
    @XmlElement(name = "Rjctd")
    protected RejectedStatusReason12 rjctd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason5 prtrySts;

    /**
     * Gets the value of the rcvd property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedStatusReason1 }
     *     
     */
    public ReceivedStatusReason1 getRcvd() {
        return rcvd;
    }

    /**
     * Sets the value of the rcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedStatusReason1 }
     *     
     */
    public ProcessingStatus43Choice setRcvd(ReceivedStatusReason1 value) {
        this.rcvd = value;
        return this;
    }

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedStatusReason7 }
     *     
     */
    public AcceptedStatusReason7 getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedStatusReason7 }
     *     
     */
    public ProcessingStatus43Choice setAccptd(AcceptedStatusReason7 value) {
        this.accptd = value;
        return this;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatusReason1 }
     *     
     */
    public PendingProcessingStatusReason1 getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatusReason1 }
     *     
     */
    public ProcessingStatus43Choice setPdgPrcg(PendingProcessingStatusReason1 value) {
        this.pdgPrcg = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatusReason12 }
     *     
     */
    public RejectedStatusReason12 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatusReason12 }
     *     
     */
    public ProcessingStatus43Choice setRjctd(RejectedStatusReason12 value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason5 }
     *     
     */
    public ProprietaryStatusAndReason5 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason5 }
     *     
     */
    public ProcessingStatus43Choice setPrtrySts(ProprietaryStatusAndReason5 value) {
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
