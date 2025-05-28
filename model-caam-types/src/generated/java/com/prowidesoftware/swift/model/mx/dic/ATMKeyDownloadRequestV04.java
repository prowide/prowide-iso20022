
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
 * The ATMKeyDownloadRequest message is sent by an ATM to an ATM manager to initiate the download of one or several cryptographic keys.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMKeyDownloadRequestV04", propOrder = {
    "hdr",
    "prtctdATMKeyDwnldReq",
    "atmKeyDwnldReq",
    "sctyTrlr"
})
public class ATMKeyDownloadRequestV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMKeyDwnldReq")
    protected ContentInformationType10 prtctdATMKeyDwnldReq;
    @XmlElement(name = "ATMKeyDwnldReq")
    protected ATMKeyDownloadRequest5 atmKeyDwnldReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType13 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header31 }
     *     
     */
    public Header31 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header31 }
     *     
     */
    public ATMKeyDownloadRequestV04 setHdr(Header31 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMKeyDwnldReq property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMKeyDwnldReq() {
        return prtctdATMKeyDwnldReq;
    }

    /**
     * Sets the value of the prtctdATMKeyDwnldReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMKeyDownloadRequestV04 setPrtctdATMKeyDwnldReq(ContentInformationType10 value) {
        this.prtctdATMKeyDwnldReq = value;
        return this;
    }

    /**
     * Gets the value of the atmKeyDwnldReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMKeyDownloadRequest5 }
     *     
     */
    public ATMKeyDownloadRequest5 getATMKeyDwnldReq() {
        return atmKeyDwnldReq;
    }

    /**
     * Sets the value of the atmKeyDwnldReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMKeyDownloadRequest5 }
     *     
     */
    public ATMKeyDownloadRequestV04 setATMKeyDwnldReq(ATMKeyDownloadRequest5 value) {
        this.atmKeyDwnldReq = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType13 }
     *     
     */
    public ContentInformationType13 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType13 }
     *     
     */
    public ATMKeyDownloadRequestV04 setSctyTrlr(ContentInformationType13 value) {
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
