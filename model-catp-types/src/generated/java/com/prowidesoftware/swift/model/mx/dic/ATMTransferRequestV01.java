
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
 * The ATMTransferRequest message is sent by an ATM to an ATM manager to request the approval of a fund transfer at the ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransferRequestV01", propOrder = {
    "hdr",
    "prtctdATMTrfReq",
    "atmTrfReq",
    "sctyTrlr"
})
public class ATMTransferRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMTrfReq")
    protected ContentInformationType10 prtctdATMTrfReq;
    @XmlElement(name = "ATMTrfReq")
    protected ATMTransferRequest1 atmTrfReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

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
    public ATMTransferRequestV01 setHdr(Header31 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMTrfReq property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMTrfReq() {
        return prtctdATMTrfReq;
    }

    /**
     * Sets the value of the prtctdATMTrfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMTransferRequestV01 setPrtctdATMTrfReq(ContentInformationType10 value) {
        this.prtctdATMTrfReq = value;
        return this;
    }

    /**
     * Gets the value of the atmTrfReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransferRequest1 }
     *     
     */
    public ATMTransferRequest1 getATMTrfReq() {
        return atmTrfReq;
    }

    /**
     * Sets the value of the atmTrfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransferRequest1 }
     *     
     */
    public ATMTransferRequestV01 setATMTrfReq(ATMTransferRequest1 value) {
        this.atmTrfReq = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType15 }
     *     
     */
    public ContentInformationType15 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType15 }
     *     
     */
    public ATMTransferRequestV01 setSctyTrlr(ContentInformationType15 value) {
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
