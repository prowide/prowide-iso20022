
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
 * The KeyExchangeResponse message is sent by an acquirer, an issuer or an agent to answer to a KeyExchangeInitiation message and complete a cryptographic key exchange.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyExchangeResponse", propOrder = {
    "hdr",
    "keyXchgRspn",
    "sctyTrlr"
})
public class KeyExchangeResponse {

    @XmlElement(name = "Hdr", required = true)
    protected Header17 hdr;
    @XmlElement(name = "KeyXchgRspn", required = true)
    protected AcquirerKeyExchangeResponse1 keyXchgRspn;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType12 sctyTrlr;

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
    public KeyExchangeResponse setHdr(Header17 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the keyXchgRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerKeyExchangeResponse1 }
     *     
     */
    public AcquirerKeyExchangeResponse1 getKeyXchgRspn() {
        return keyXchgRspn;
    }

    /**
     * Sets the value of the keyXchgRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerKeyExchangeResponse1 }
     *     
     */
    public KeyExchangeResponse setKeyXchgRspn(AcquirerKeyExchangeResponse1 value) {
        this.keyXchgRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType12 }
     *     
     */
    public ContentInformationType12 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType12 }
     *     
     */
    public KeyExchangeResponse setSctyTrlr(ContentInformationType12 value) {
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
