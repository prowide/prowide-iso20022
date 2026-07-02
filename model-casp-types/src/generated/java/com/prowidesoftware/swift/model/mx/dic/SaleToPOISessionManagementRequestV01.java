
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
 * This message is a request for several kind of Administrative services related to Session Management ' that the Sale System (Merchant I.S.) can send to the POI system (Card Acceptor system).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOISessionManagementRequestV01", propOrder = {
    "hdr",
    "ssnMgmtReq",
    "sctyTrlr"
})
public class SaleToPOISessionManagementRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header37 hdr;
    @XmlElement(name = "SsnMgmtReq", required = true)
    protected SessionManagementRequest2 ssnMgmtReq;
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
    public SaleToPOISessionManagementRequestV01 setHdr(Header37 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the ssnMgmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link SessionManagementRequest2 }
     *     
     */
    public SessionManagementRequest2 getSsnMgmtReq() {
        return ssnMgmtReq;
    }

    /**
     * Sets the value of the ssnMgmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionManagementRequest2 }
     *     
     */
    public SaleToPOISessionManagementRequestV01 setSsnMgmtReq(SessionManagementRequest2 value) {
        this.ssnMgmtReq = value;
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
    public SaleToPOISessionManagementRequestV01 setSctyTrlr(ContentInformationType18 value) {
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
