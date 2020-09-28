
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
 * Choice of format for the processing status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus73Choice", propOrder = {
    "pdgCxl",
    "rjctd",
    "prtry",
    "dnd",
    "canc"
})
public class ProcessingStatus73Choice {

    @XmlElement(name = "PdgCxl")
    protected PendingStatus54Choice pdgCxl;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus28Choice rjctd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;
    @XmlElement(name = "Dnd")
    protected DeniedStatus22Choice dnd;
    @XmlElement(name = "Canc")
    protected CancellationStatus23Choice canc;

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus54Choice }
     *     
     */
    public PendingStatus54Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus54Choice }
     *     
     */
    public ProcessingStatus73Choice setPdgCxl(PendingStatus54Choice value) {
        this.pdgCxl = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus28Choice }
     *     
     */
    public RejectionStatus28Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus28Choice }
     *     
     */
    public ProcessingStatus73Choice setRjctd(RejectionStatus28Choice value) {
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
    public ProcessingStatus73Choice setPrtry(ProprietaryStatusAndReason6 value) {
        this.prtry = value;
        return this;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus22Choice }
     *     
     */
    public DeniedStatus22Choice getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus22Choice }
     *     
     */
    public ProcessingStatus73Choice setDnd(DeniedStatus22Choice value) {
        this.dnd = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus23Choice }
     *     
     */
    public CancellationStatus23Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus23Choice }
     *     
     */
    public ProcessingStatus73Choice setCanc(CancellationStatus23Choice value) {
        this.canc = value;
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
