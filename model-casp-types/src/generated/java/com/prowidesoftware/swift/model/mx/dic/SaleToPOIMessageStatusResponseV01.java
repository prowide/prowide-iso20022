
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
 * This message is a system message sent by the POI system to respond to the Sale system at a previous message status request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIMessageStatusResponseV01", propOrder = {
    "hdr",
    "stsRspn",
    "sctyTrlr"
})
public class SaleToPOIMessageStatusResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header37 hdr;
    @XmlElement(name = "StsRspn", required = true)
    protected MessageStatusResponse2 stsRspn;
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
    public SaleToPOIMessageStatusResponseV01 setHdr(Header37 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the stsRspn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageStatusResponse2 }
     *     
     */
    public MessageStatusResponse2 getStsRspn() {
        return stsRspn;
    }

    /**
     * Sets the value of the stsRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatusResponse2 }
     *     
     */
    public SaleToPOIMessageStatusResponseV01 setStsRspn(MessageStatusResponse2 value) {
        this.stsRspn = value;
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
    public SaleToPOIMessageStatusResponseV01 setSctyTrlr(ContentInformationType18 value) {
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
