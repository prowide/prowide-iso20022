
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
 * The SaleToPOIAbort message is sent by a sale system to abort process on POI.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIAbortV03", propOrder = {
    "hdr",
    "abrt",
    "sctyTrlr"
})
public class SaleToPOIAbortV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header41 hdr;
    @XmlElement(name = "Abrt", required = true)
    protected SystemAbort4 abrt;
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
    public SaleToPOIAbortV03 setHdr(Header41 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the abrt property.
     * 
     * @return
     *     possible object is
     *     {@link SystemAbort4 }
     *     
     */
    public SystemAbort4 getAbrt() {
        return abrt;
    }

    /**
     * Sets the value of the abrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemAbort4 }
     *     
     */
    public SaleToPOIAbortV03 setAbrt(SystemAbort4 value) {
        this.abrt = value;
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
    public SaleToPOIAbortV03 setSctyTrlr(ContentInformationType25 value) {
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
