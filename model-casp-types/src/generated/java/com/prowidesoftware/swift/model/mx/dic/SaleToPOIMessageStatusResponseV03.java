
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
 * The SaleToPOIMessageStatusResponse message is sent by a POI System to respond to the sale system at a previous message status request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIMessageStatusResponseV03", propOrder = {
    "hdr",
    "stsRspn",
    "sctyTrlr"
})
public class SaleToPOIMessageStatusResponseV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header41 hdr;
    @XmlElement(name = "StsRspn", required = true)
    protected MessageStatusResponse5 stsRspn;
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
    public SaleToPOIMessageStatusResponseV03 setHdr(Header41 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the stsRspn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageStatusResponse5 }
     *     
     */
    public MessageStatusResponse5 getStsRspn() {
        return stsRspn;
    }

    /**
     * Sets the value of the stsRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatusResponse5 }
     *     
     */
    public SaleToPOIMessageStatusResponseV03 setStsRspn(MessageStatusResponse5 value) {
        this.stsRspn = value;
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
    public SaleToPOIMessageStatusResponseV03 setSctyTrlr(ContentInformationType25 value) {
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
