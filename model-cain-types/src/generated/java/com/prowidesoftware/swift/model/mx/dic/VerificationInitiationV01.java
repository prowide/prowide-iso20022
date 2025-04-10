
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
 * The VerificationInitiation message can be initiated by any party and received by any party (acquirer, agent or issuer). It conveys information to a receiver requiring verification or authentication. 
 * 
 * Examples of usages are: authentication of certificates, assurance levels of tokens, certificate management, address verification, account verification and cheque verification. It is also used to inform the receiver of a verification that has been completed on its behalf.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationInitiationV01", propOrder = {
    "hdr",
    "body",
    "sctyTrlr"
})
public class VerificationInitiationV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header39 hdr;
    @XmlElement(name = "Body", required = true)
    protected VerificationInitiation1 body;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType20 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header39 }
     *     
     */
    public Header39 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header39 }
     *     
     */
    public VerificationInitiationV01 setHdr(Header39 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationInitiation1 }
     *     
     */
    public VerificationInitiation1 getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationInitiation1 }
     *     
     */
    public VerificationInitiationV01 setBody(VerificationInitiation1 value) {
        this.body = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType20 }
     *     
     */
    public ContentInformationType20 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType20 }
     *     
     */
    public VerificationInitiationV01 setSctyTrlr(ContentInformationType20 value) {
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
