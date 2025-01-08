
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
 * The SaleToPOIServiceResponse message is sent by a POI to provide the outcome of a financial service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIServiceResponseV04", propOrder = {
    "hdr",
    "svcRspn",
    "sctyTrlr"
})
public class SaleToPOIServiceResponseV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header41 hdr;
    @XmlElement(name = "SvcRspn", required = true)
    protected ServiceResponse6 svcRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType29 sctyTrlr;

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
    public SaleToPOIServiceResponseV04 setHdr(Header41 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the svcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResponse6 }
     *     
     */
    public ServiceResponse6 getSvcRspn() {
        return svcRspn;
    }

    /**
     * Sets the value of the svcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResponse6 }
     *     
     */
    public SaleToPOIServiceResponseV04 setSvcRspn(ServiceResponse6 value) {
        this.svcRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType29 }
     *     
     */
    public ContentInformationType29 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType29 }
     *     
     */
    public SaleToPOIServiceResponseV04 setSctyTrlr(ContentInformationType29 value) {
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
