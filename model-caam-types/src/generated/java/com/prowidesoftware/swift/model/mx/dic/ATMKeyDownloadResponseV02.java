
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
 * The ATMKeyDownloadResponse message is sent from an acquirer to an ATM in response to an ATMKeyDownloadRequest message, to download of one or several cryptographic keys.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMKeyDownloadResponseV02", propOrder = {
    "hdr",
    "prtctdATMKeyDwnldRspn",
    "atmKeyDwnldRspn",
    "sctyTrlr"
})
public class ATMKeyDownloadResponseV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMKeyDwnldRspn")
    protected ContentInformationType10 prtctdATMKeyDwnldRspn;
    @XmlElement(name = "ATMKeyDwnldRspn")
    protected ATMKeyDownloadResponse2 atmKeyDwnldRspn;
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
    public ATMKeyDownloadResponseV02 setHdr(Header31 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMKeyDwnldRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMKeyDwnldRspn() {
        return prtctdATMKeyDwnldRspn;
    }

    /**
     * Sets the value of the prtctdATMKeyDwnldRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMKeyDownloadResponseV02 setPrtctdATMKeyDwnldRspn(ContentInformationType10 value) {
        this.prtctdATMKeyDwnldRspn = value;
        return this;
    }

    /**
     * Gets the value of the atmKeyDwnldRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMKeyDownloadResponse2 }
     *     
     */
    public ATMKeyDownloadResponse2 getATMKeyDwnldRspn() {
        return atmKeyDwnldRspn;
    }

    /**
     * Sets the value of the atmKeyDwnldRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMKeyDownloadResponse2 }
     *     
     */
    public ATMKeyDownloadResponseV02 setATMKeyDwnldRspn(ATMKeyDownloadResponse2 value) {
        this.atmKeyDwnldRspn = value;
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
    public ATMKeyDownloadResponseV02 setSctyTrlr(ContentInformationType13 value) {
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
