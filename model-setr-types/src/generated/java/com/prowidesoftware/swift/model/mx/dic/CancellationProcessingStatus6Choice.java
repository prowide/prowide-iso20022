
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
 * Choice of status for the cancellation processing.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationProcessingStatus6Choice", propOrder = {
    "cxlPdg",
    "cxlReqd",
    "cxlCmpltd",
    "prtrySts"
})
public class CancellationProcessingStatus6Choice {

    @XmlElement(name = "CxlPdg")
    protected CancellationReason11Choice cxlPdg;
    @XmlElement(name = "CxlReqd")
    protected ProprietaryReason1 cxlReqd;
    @XmlElement(name = "CxlCmpltd")
    protected ProprietaryReason1 cxlCmpltd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason1 prtrySts;

    /**
     * Gets the value of the cxlPdg property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason11Choice }
     *     
     */
    public CancellationReason11Choice getCxlPdg() {
        return cxlPdg;
    }

    /**
     * Sets the value of the cxlPdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason11Choice }
     *     
     */
    public CancellationProcessingStatus6Choice setCxlPdg(CancellationReason11Choice value) {
        this.cxlPdg = value;
        return this;
    }

    /**
     * Gets the value of the cxlReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getCxlReqd() {
        return cxlReqd;
    }

    /**
     * Sets the value of the cxlReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public CancellationProcessingStatus6Choice setCxlReqd(ProprietaryReason1 value) {
        this.cxlReqd = value;
        return this;
    }

    /**
     * Gets the value of the cxlCmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getCxlCmpltd() {
        return cxlCmpltd;
    }

    /**
     * Sets the value of the cxlCmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public CancellationProcessingStatus6Choice setCxlCmpltd(ProprietaryReason1 value) {
        this.cxlCmpltd = value;
        return this;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason1 }
     *     
     */
    public ProprietaryStatusAndReason1 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason1 }
     *     
     */
    public CancellationProcessingStatus6Choice setPrtrySts(ProprietaryStatusAndReason1 value) {
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
