
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
 * This message is a Administration response by the POI System.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIAdministrativeResponseV01", propOrder = {
    "hdr",
    "admstvRspn",
    "sctyTrlr"
})
public class SaleToPOIAdministrativeResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header37 hdr;
    @XmlElement(name = "AdmstvRspn", required = true)
    protected AdministrativeResponse2 admstvRspn;
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
    public SaleToPOIAdministrativeResponseV01 setHdr(Header37 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the admstvRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeResponse2 }
     *     
     */
    public AdministrativeResponse2 getAdmstvRspn() {
        return admstvRspn;
    }

    /**
     * Sets the value of the admstvRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeResponse2 }
     *     
     */
    public SaleToPOIAdministrativeResponseV01 setAdmstvRspn(AdministrativeResponse2 value) {
        this.admstvRspn = value;
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
    public SaleToPOIAdministrativeResponseV01 setSctyTrlr(ContentInformationType18 value) {
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
