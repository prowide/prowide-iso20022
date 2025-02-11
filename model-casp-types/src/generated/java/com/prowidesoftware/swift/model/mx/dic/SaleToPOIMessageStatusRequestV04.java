
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
 * The SaleToPOIMessageStatusRequest message is sent by a sale system when the sale system wants to know the status of previous message that has not be answered.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIMessageStatusRequestV04", propOrder = {
    "hdr",
    "stsReq",
    "sctyTrlr"
})
public class SaleToPOIMessageStatusRequestV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header41 hdr;
    @XmlElement(name = "StsReq", required = true)
    protected MessageStatusRequest5 stsReq;
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
    public SaleToPOIMessageStatusRequestV04 setHdr(Header41 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the stsReq property.
     * 
     * @return
     *     possible object is
     *     {@link MessageStatusRequest5 }
     *     
     */
    public MessageStatusRequest5 getStsReq() {
        return stsReq;
    }

    /**
     * Sets the value of the stsReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatusRequest5 }
     *     
     */
    public SaleToPOIMessageStatusRequestV04 setStsReq(MessageStatusRequest5 value) {
        this.stsReq = value;
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
    public SaleToPOIMessageStatusRequestV04 setSctyTrlr(ContentInformationType29 value) {
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
