
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
 * The NetworkManagementlInitiation message can be initiated by any party and received by any party (acquirer, agent or issuer) connected to a network. It covers the range of activities that control the operating conditions of the network.
 * 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementInitiationV02", propOrder = {
    "hdr",
    "body",
    "sctyTrlr"
})
public class NetworkManagementInitiationV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header43 hdr;
    @XmlElement(name = "Body", required = true)
    protected NetworkManagementInitiation1 body;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType20 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header43 }
     *     
     */
    public Header43 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header43 }
     *     
     */
    public NetworkManagementInitiationV02 setHdr(Header43 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementInitiation1 }
     *     
     */
    public NetworkManagementInitiation1 getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementInitiation1 }
     *     
     */
    public NetworkManagementInitiationV02 setBody(NetworkManagementInitiation1 value) {
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
    public NetworkManagementInitiationV02 setSctyTrlr(ContentInformationType20 value) {
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
