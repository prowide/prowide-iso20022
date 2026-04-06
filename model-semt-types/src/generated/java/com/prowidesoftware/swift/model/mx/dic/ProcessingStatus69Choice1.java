
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
@XmlType(name = "ProcessingStatus69Choice__1", propOrder = {
    "pdgCxl",
    "ackdAccptd",
    "dnd",
    "canc"
})
public class ProcessingStatus69Choice1 {

    @XmlElement(name = "PdgCxl")
    protected PendingStatus39Choice1 pdgCxl;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus24Choice1 ackdAccptd;
    @XmlElement(name = "Dnd")
    protected DeniedStatus16Choice1 dnd;
    @XmlElement(name = "Canc")
    protected CancellationStatus15Choice1 canc;

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus39Choice1 }
     *     
     */
    public PendingStatus39Choice1 getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus39Choice1 }
     *     
     */
    public ProcessingStatus69Choice1 setPdgCxl(PendingStatus39Choice1 value) {
        this.pdgCxl = value;
        return this;
    }

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus24Choice1 }
     *     
     */
    public AcknowledgedAcceptedStatus24Choice1 getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus24Choice1 }
     *     
     */
    public ProcessingStatus69Choice1 setAckdAccptd(AcknowledgedAcceptedStatus24Choice1 value) {
        this.ackdAccptd = value;
        return this;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus16Choice1 }
     *     
     */
    public DeniedStatus16Choice1 getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus16Choice1 }
     *     
     */
    public ProcessingStatus69Choice1 setDnd(DeniedStatus16Choice1 value) {
        this.dnd = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus15Choice1 }
     *     
     */
    public CancellationStatus15Choice1 getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus15Choice1 }
     *     
     */
    public ProcessingStatus69Choice1 setCanc(CancellationStatus15Choice1 value) {
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
