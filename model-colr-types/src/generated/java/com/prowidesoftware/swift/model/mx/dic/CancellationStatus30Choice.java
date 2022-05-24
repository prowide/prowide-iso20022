
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
 * Instruction/Request has been cancelled.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationStatus30Choice", propOrder = {
    "canc",
    "prcd",
    "pdg",
    "rjctd",
    "prtry"
})
public class CancellationStatus30Choice {

    @XmlElement(name = "Canc")
    protected CancellationStatus29Choice canc;
    @XmlElement(name = "Prcd")
    protected ProprietaryReason4 prcd;
    @XmlElement(name = "Pdg")
    protected PendingStatus56Choice pdg;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus34Choice rjctd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;

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
    public CancellationStatus30Choice setCanc(CancellationStatus29Choice value) {
        this.canc = value;
        return this;
    }

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
    public CancellationStatus30Choice setPrcd(ProprietaryReason4 value) {
        this.prcd = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus56Choice }
     *     
     */
    public PendingStatus56Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus56Choice }
     *     
     */
    public CancellationStatus30Choice setPdg(PendingStatus56Choice value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus34Choice }
     *     
     */
    public RejectionStatus34Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus34Choice }
     *     
     */
    public CancellationStatus30Choice setRjctd(RejectionStatus34Choice value) {
        this.rjctd = value;
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
    public CancellationStatus30Choice setPrtry(ProprietaryStatusAndReason6 value) {
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
