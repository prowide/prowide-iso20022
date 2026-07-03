
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
 * The ATMInquiryResponse message is sent by an ATM manager or its agent to the ATM to provide the information and the outcome of the verifications requested in the ATMInquiryRequest.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMInquiryResponseV01", propOrder = {
    "hdr",
    "prtctdATMNqryRspn",
    "atmNqryRspn",
    "sctyTrlr"
})
public class ATMInquiryResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header20 hdr;
    @XmlElement(name = "PrtctdATMNqryRspn")
    protected ContentInformationType10 prtctdATMNqryRspn;
    @XmlElement(name = "ATMNqryRspn")
    protected ATMInquiryResponse1 atmNqryRspn;
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
    public ATMInquiryResponseV01 setHdr(Header20 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMNqryRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMNqryRspn() {
        return prtctdATMNqryRspn;
    }

    /**
     * Sets the value of the prtctdATMNqryRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMInquiryResponseV01 setPrtctdATMNqryRspn(ContentInformationType10 value) {
        this.prtctdATMNqryRspn = value;
        return this;
    }

    /**
     * Gets the value of the atmNqryRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMInquiryResponse1 }
     *     
     */
    public ATMInquiryResponse1 getATMNqryRspn() {
        return atmNqryRspn;
    }

    /**
     * Sets the value of the atmNqryRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMInquiryResponse1 }
     *     
     */
    public ATMInquiryResponseV01 setATMNqryRspn(ATMInquiryResponse1 value) {
        this.atmNqryRspn = value;
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
    public ATMInquiryResponseV01 setSctyTrlr(ContentInformationType15 value) {
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
