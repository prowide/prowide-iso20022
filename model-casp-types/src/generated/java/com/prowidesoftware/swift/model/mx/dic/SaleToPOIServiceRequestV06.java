
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
 * This SaleToPOIServiceRequest message is sent by a sale system to trig a financial service on POI system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIServiceRequestV06", propOrder = {
    "hdr",
    "svcReq",
    "sctyTrlr"
})
public class SaleToPOIServiceRequestV06 {

    @XmlElement(name = "Hdr", required = true)
    protected Header41 hdr;
    @XmlElement(name = "SvcReq", required = true)
    protected ServiceRequest7 svcReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType38 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header41 }
     *     
     */
    public Header41 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header41 }
     *     
     */
    public SaleToPOIServiceRequestV06 setHdr(Header41 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the svcReq property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequest7 }
     *     
     */
    public ServiceRequest7 getSvcReq() {
        return svcReq;
    }

    /**
     * Sets the value of the svcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequest7 }
     *     
     */
    public SaleToPOIServiceRequestV06 setSvcReq(ServiceRequest7 value) {
        this.svcReq = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType38 }
     *     
     */
    public ContentInformationType38 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType38 }
     *     
     */
    public SaleToPOIServiceRequestV06 setSctyTrlr(ContentInformationType38 value) {
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
