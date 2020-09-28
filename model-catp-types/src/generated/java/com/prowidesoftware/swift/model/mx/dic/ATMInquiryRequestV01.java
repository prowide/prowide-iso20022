
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
 * The ATMInquiryRequest message is sent by an ATM to an ATM manager to request information about a customer (for example card, account).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMInquiryRequestV01", propOrder = {
    "hdr",
    "prtctdATMNqryReq",
    "atmNqryReq",
    "sctyTrlr"
})
public class ATMInquiryRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header20 hdr;
    @XmlElement(name = "PrtctdATMNqryReq")
    protected ContentInformationType10 prtctdATMNqryReq;
    @XmlElement(name = "ATMNqryReq")
    protected ATMInquiryRequest1 atmNqryReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header20 }
     *     
     */
    public Header20 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header20 }
     *     
     */
    public ATMInquiryRequestV01 setHdr(Header20 value) {
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
    public ATMInquiryRequestV01 setPrtctdATMNqryReq(ContentInformationType10 value) {
        this.prtctdATMNqryReq = value;
        return this;
    }

    /**
     * Gets the value of the atmNqryReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMInquiryRequest1 }
     *     
     */
    public ATMInquiryRequest1 getATMNqryReq() {
        return atmNqryReq;
    }

    /**
     * Sets the value of the atmNqryReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMInquiryRequest1 }
     *     
     */
    public ATMInquiryRequestV01 setATMNqryReq(ATMInquiryRequest1 value) {
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
    public ATMInquiryRequestV01 setSctyTrlr(ContentInformationType15 value) {
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
