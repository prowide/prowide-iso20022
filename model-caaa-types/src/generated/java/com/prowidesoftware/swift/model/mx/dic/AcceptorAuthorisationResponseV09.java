
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
 * The AcceptorAuthorisationResponse message is sent by the acquirer (or its agent) to an acceptor (or its agent), to return the result of the validation made by issuer about the payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorAuthorisationResponseV09", propOrder = {
    "hdr",
    "authstnRspn",
    "sctyTrlr"
})
public class AcceptorAuthorisationResponseV09 {

    @XmlElement(name = "Hdr", required = true)
    protected Header58 hdr;
    @XmlElement(name = "AuthstnRspn", required = true)
    protected AcceptorAuthorisationResponse9 authstnRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType24 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header58 }
     *     
     */
    public Header58 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header58 }
     *     
     */
    public AcceptorAuthorisationResponseV09 setHdr(Header58 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorAuthorisationResponse9 }
     *     
     */
    public AcceptorAuthorisationResponse9 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorAuthorisationResponse9 }
     *     
     */
    public AcceptorAuthorisationResponseV09 setAuthstnRspn(AcceptorAuthorisationResponse9 value) {
        this.authstnRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType24 }
     *     
     */
    public ContentInformationType24 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType24 }
     *     
     */
    public AcceptorAuthorisationResponseV09 setSctyTrlr(ContentInformationType24 value) {
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