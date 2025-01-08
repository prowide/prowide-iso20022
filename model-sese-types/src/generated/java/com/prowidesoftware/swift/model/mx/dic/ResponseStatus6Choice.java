
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
 * Choice of response status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseStatus6Choice", propOrder = {
    "cnsntd",
    "rjctd",
    "pdg"
})
public class ResponseStatus6Choice {

    @XmlElement(name = "Cnsntd")
    protected ConsentStatus4Choice cnsntd;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus20Choice rjctd;
    @XmlElement(name = "Pdg")
    protected PendingStatus20Choice pdg;

    /**
     * Gets the value of the cnsntd property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentStatus4Choice }
     *     
     */
    public ConsentStatus4Choice getCnsntd() {
        return cnsntd;
    }

    /**
     * Sets the value of the cnsntd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentStatus4Choice }
     *     
     */
    public ResponseStatus6Choice setCnsntd(ConsentStatus4Choice value) {
        this.cnsntd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus20Choice }
     *     
     */
    public RejectionStatus20Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus20Choice }
     *     
     */
    public ResponseStatus6Choice setRjctd(RejectionStatus20Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus20Choice }
     *     
     */
    public PendingStatus20Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus20Choice }
     *     
     */
    public ResponseStatus6Choice setPdg(PendingStatus20Choice value) {
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
