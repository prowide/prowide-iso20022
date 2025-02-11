
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
 * The SaleToPOIAdministrativeRequest message is sent by a sale system to POI System to request for an Administrative service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIAdministrativeRequestV03", propOrder = {
    "hdr",
    "admstvReq",
    "sctyTrlr"
})
public class SaleToPOIAdministrativeRequestV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header41 hdr;
    @XmlElement(name = "AdmstvReq", required = true)
    protected AdministrativeRequest4 admstvReq;
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
    public SaleToPOIAdministrativeRequestV03 setHdr(Header41 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the admstvReq property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeRequest4 }
     *     
     */
    public AdministrativeRequest4 getAdmstvReq() {
        return admstvReq;
    }

    /**
     * Sets the value of the admstvReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeRequest4 }
     *     
     */
    public SaleToPOIAdministrativeRequestV03 setAdmstvReq(AdministrativeRequest4 value) {
        this.admstvReq = value;
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
    public SaleToPOIAdministrativeRequestV03 setSctyTrlr(ContentInformationType25 value) {
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
