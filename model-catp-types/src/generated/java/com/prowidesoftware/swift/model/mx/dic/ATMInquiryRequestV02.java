
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
 * The ATMInquiryRequest message is sent by an ATM to an ATM manager to request information about a customer (for example card, account).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMInquiryRequestV02", propOrder = {
    "hdr",
    "prtctdATMNqryReq",
    "atmNqryReq",
    "sctyTrlr"
})
public class ATMInquiryRequestV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMNqryReq")
    protected ContentInformationType10 prtctdATMNqryReq;
    @XmlElement(name = "ATMNqryReq")
    protected ATMInquiryRequest2 atmNqryReq;
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
    public ATMInquiryRequestV02 setHdr(Header31 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMNqryReq property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMNqryReq() {
        return prtctdATMNqryReq;
    }

    /**
     * Sets the value of the prtctdATMNqryReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMInquiryRequestV02 setPrtctdATMNqryReq(ContentInformationType10 value) {
        this.prtctdATMNqryReq = value;
        return this;
    }

    /**
     * Gets the value of the atmNqryReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMInquiryRequest2 }
     *     
     */
    public ATMInquiryRequest2 getATMNqryReq() {
        return atmNqryReq;
    }

    /**
     * Sets the value of the atmNqryReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMInquiryRequest2 }
     *     
     */
    public ATMInquiryRequestV02 setATMNqryReq(ATMInquiryRequest2 value) {
        this.atmNqryReq = value;
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
    public ATMInquiryRequestV02 setSctyTrlr(ContentInformationType15 value) {
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
