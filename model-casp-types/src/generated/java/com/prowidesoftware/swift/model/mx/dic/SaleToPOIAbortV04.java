
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
 * The SaleToPOIAbort message is sent by a sale system to abort process on POI.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIAbortV04", propOrder = {
    "hdr",
    "abrt",
    "sctyTrlr"
})
public class SaleToPOIAbortV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header41 hdr;
    @XmlElement(name = "Abrt", required = true)
    protected SystemAbort5 abrt;
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
    public SaleToPOIAbortV04 setHdr(Header41 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the abrt property.
     * 
     * @return
     *     possible object is
     *     {@link SystemAbort5 }
     *     
     */
    public SystemAbort5 getAbrt() {
        return abrt;
    }

    /**
     * Sets the value of the abrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemAbort5 }
     *     
     */
    public SaleToPOIAbortV04 setAbrt(SystemAbort5 value) {
        this.abrt = value;
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
    public SaleToPOIAbortV04 setSctyTrlr(ContentInformationType29 value) {
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
