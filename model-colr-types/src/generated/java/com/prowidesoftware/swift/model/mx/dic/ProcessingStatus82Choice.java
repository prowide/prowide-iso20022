
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
 * Provides the status of an instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus82Choice", propOrder = {
    "prcd",
    "futr",
    "rjctd",
    "canc",
    "pdgCxl",
    "cxlReq",
    "prtry"
})
public class ProcessingStatus82Choice {

    @XmlElement(name = "Prcd")
    protected ProprietaryReason4 prcd;
    @XmlElement(name = "Futr")
    protected ProprietaryReason4 futr;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus33Choice rjctd;
    @XmlElement(name = "Canc")
    protected CancellationStatus29Choice canc;
    @XmlElement(name = "PdgCxl")
    protected PendingStatus56Choice pdgCxl;
    @XmlElement(name = "CxlReq")
    protected ProprietaryReason4 cxlReq;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;

    /**
     * Gets the value of the prcd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getPrcd() {
        return prcd;
    }

    /**
     * Sets the value of the prcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus82Choice setPrcd(ProprietaryReason4 value) {
        this.prcd = value;
        return this;
    }

    /**
     * Gets the value of the futr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getFutr() {
        return futr;
    }

    /**
     * Sets the value of the futr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus82Choice setFutr(ProprietaryReason4 value) {
        this.futr = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus33Choice }
     *     
     */
    public RejectionStatus33Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus33Choice }
     *     
     */
    public ProcessingStatus82Choice setRjctd(RejectionStatus33Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus29Choice }
     *     
     */
    public CancellationStatus29Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus29Choice }
     *     
     */
    public ProcessingStatus82Choice setCanc(CancellationStatus29Choice value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus56Choice }
     *     
     */
    public PendingStatus56Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus56Choice }
     *     
     */
    public ProcessingStatus82Choice setPdgCxl(PendingStatus56Choice value) {
        this.pdgCxl = value;
        return this;
    }

    /**
     * Gets the value of the cxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getCxlReq() {
        return cxlReq;
    }

    /**
     * Sets the value of the cxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProcessingStatus82Choice setCxlReq(ProprietaryReason4 value) {
        this.cxlReq = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProcessingStatus82Choice setPrtry(ProprietaryStatusAndReason6 value) {
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
