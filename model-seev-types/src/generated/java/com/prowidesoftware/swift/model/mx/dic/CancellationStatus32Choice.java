
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
 * Status applying to the instruction cancellation request received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationStatus32Choice", propOrder = {
    "prcgSts",
    "rjctd",
    "pdgCxl"
})
public class CancellationStatus32Choice {

    @XmlElement(name = "PrcgSts")
    protected CancellationProcessingStatus2 prcgSts;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus31Choice rjctd;
    @XmlElement(name = "PdgCxl")
    protected PendingCancellationStatus12Choice pdgCxl;

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationProcessingStatus2 }
     *     
     */
    public CancellationProcessingStatus2 getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationProcessingStatus2 }
     *     
     */
    public CancellationStatus32Choice setPrcgSts(CancellationProcessingStatus2 value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus31Choice }
     *     
     */
    public RejectedStatus31Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus31Choice }
     *     
     */
    public CancellationStatus32Choice setRjctd(RejectedStatus31Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCancellationStatus12Choice }
     *     
     */
    public PendingCancellationStatus12Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCancellationStatus12Choice }
     *     
     */
    public CancellationStatus32Choice setPdgCxl(PendingCancellationStatus12Choice value) {
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
