
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
 * This message is a request for an Administrative service sent to POI System.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIAdministrativeRequestV01", propOrder = {
    "hdr",
    "admstvReq",
    "sctyTrlr"
})
public class SaleToPOIAdministrativeRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header37 hdr;
    @XmlElement(name = "AdmstvReq", required = true)
    protected AdministrativeRequest2 admstvReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType18 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header37 }
     *     
     */
    public Header37 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header37 }
     *     
     */
    public SaleToPOIAdministrativeRequestV01 setHdr(Header37 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the admstvReq property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeRequest2 }
     *     
     */
    public AdministrativeRequest2 getAdmstvReq() {
        return admstvReq;
    }

    /**
     * Sets the value of the admstvReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeRequest2 }
     *     
     */
    public SaleToPOIAdministrativeRequestV01 setAdmstvReq(AdministrativeRequest2 value) {
        this.admstvReq = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType18 }
     *     
     */
    public ContentInformationType18 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType18 }
     *     
     */
    public SaleToPOIAdministrativeRequestV01 setSctyTrlr(ContentInformationType18 value) {
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
