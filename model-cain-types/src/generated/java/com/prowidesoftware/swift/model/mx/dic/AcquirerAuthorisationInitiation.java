
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
 * The AcquirerAuthorisationInitiation message is sent by an acquirer or an agent to an issuer or an agent, to request, advice or notify the approval of a card transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerAuthorisationInitiation", propOrder = {
    "hdr",
    "authstnInitn",
    "sctyTrlr"
})
public class AcquirerAuthorisationInitiation {

    @XmlElement(name = "Hdr", required = true)
    protected Header17 hdr;
    @XmlElement(name = "AuthstnInitn", required = true)
    protected AcquirerAuthorisationInitiation1 authstnInitn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header17 }
     *     
     */
    public Header17 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header17 }
     *     
     */
    public AcquirerAuthorisationInitiation setHdr(Header17 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the authstnInitn property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerAuthorisationInitiation1 }
     *     
     */
    public AcquirerAuthorisationInitiation1 getAuthstnInitn() {
        return authstnInitn;
    }

    /**
     * Sets the value of the authstnInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerAuthorisationInitiation1 }
     *     
     */
    public AcquirerAuthorisationInitiation setAuthstnInitn(AcquirerAuthorisationInitiation1 value) {
        this.authstnInitn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType15 }
     *     
     */
    public ContentInformationType15 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType15 }
     *     
     */
    public AcquirerAuthorisationInitiation setSctyTrlr(ContentInformationType15 value) {
        this.sctyTrlr = value;
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
