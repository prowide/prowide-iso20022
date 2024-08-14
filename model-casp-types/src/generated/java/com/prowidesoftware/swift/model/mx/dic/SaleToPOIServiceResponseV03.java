
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
 * The SaleToPOIServiceResponse message is sent by a POI to provide the outcome of a financial service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIServiceResponseV03", propOrder = {
    "hdr",
    "svcRspn",
    "sctyTrlr"
})
public class SaleToPOIServiceResponseV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header41 hdr;
    @XmlElement(name = "SvcRspn", required = true)
    protected ServiceResponse5 svcRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType25 sctyTrlr;

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
    public SaleToPOIServiceResponseV03 setHdr(Header41 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the svcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResponse5 }
     *     
     */
    public ServiceResponse5 getSvcRspn() {
        return svcRspn;
    }

    /**
     * Sets the value of the svcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResponse5 }
     *     
     */
    public SaleToPOIServiceResponseV03 setSvcRspn(ServiceResponse5 value) {
        this.svcRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType25 }
     *     
     */
    public ContentInformationType25 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType25 }
     *     
     */
    public SaleToPOIServiceResponseV03 setSctyTrlr(ContentInformationType25 value) {
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
