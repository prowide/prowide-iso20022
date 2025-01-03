
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
 * Scope
 * The AcceptorAuthorisationResponse message is sent by the acquirer to inform the card acceptor of the outcome of the authorisation process. The message can be sent directly to the acceptor or through an agent.
 * Usage
 * The AcceptorAuthorisationResponse message is used to indicate one of the possible outcomes of an authorisation process:
 * - a successful authorisation;
 * - a decline from the acquirer for financial reasons;
 * - a decline from the acquirer for technical reasons (for instance, a timeout).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorAuthorisationResponseV01", propOrder = {
    "hdr",
    "authstnRspn",
    "sctyTrlr"
})
public class AcceptorAuthorisationResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header1 hdr;
    @XmlElement(name = "AuthstnRspn", required = true)
    protected AcceptorAuthorisationResponse1 authstnRspn;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType3 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header1 }
     *     
     */
    public Header1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header1 }
     *     
     */
    public AcceptorAuthorisationResponseV01 setHdr(Header1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorAuthorisationResponse1 }
     *     
     */
    public AcceptorAuthorisationResponse1 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorAuthorisationResponse1 }
     *     
     */
    public AcceptorAuthorisationResponseV01 setAuthstnRspn(AcceptorAuthorisationResponse1 value) {
        this.authstnRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType3 }
     *     
     */
    public ContentInformationType3 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType3 }
     *     
     */
    public AcceptorAuthorisationResponseV01 setSctyTrlr(ContentInformationType3 value) {
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
