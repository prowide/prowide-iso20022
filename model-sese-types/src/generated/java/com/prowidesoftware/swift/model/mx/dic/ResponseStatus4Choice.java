
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
 * Choice of response status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseStatus4Choice", propOrder = {
    "cnsntd",
    "rjctd",
    "pdg"
})
public class ResponseStatus4Choice {

    @XmlElement(name = "Cnsntd")
    protected ConsentStatus3Choice cnsntd;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus9Choice rjctd;
    @XmlElement(name = "Pdg")
    protected PendingStatus20Choice pdg;

    /**
     * Gets the value of the cnsntd property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentStatus3Choice }
     *     
     */
    public ConsentStatus3Choice getCnsntd() {
        return cnsntd;
    }

    /**
     * Sets the value of the cnsntd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentStatus3Choice }
     *     
     */
    public ResponseStatus4Choice setCnsntd(ConsentStatus3Choice value) {
        this.cnsntd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus9Choice }
     *     
     */
    public RejectionStatus9Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus9Choice }
     *     
     */
    public ResponseStatus4Choice setRjctd(RejectionStatus9Choice value) {
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
    public ResponseStatus4Choice setPdg(PendingStatus20Choice value) {
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
