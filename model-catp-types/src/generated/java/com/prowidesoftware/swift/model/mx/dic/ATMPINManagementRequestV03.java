
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
 * The ATMPINManagementRequest message is sent by an ATM to an ATM manager to request an operation on the cardholder PIN.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMPINManagementRequestV03", propOrder = {
    "hdr",
    "prtctdATMPINMgmtReq",
    "atmpinMgmtReq",
    "sctyTrlr"
})
public class ATMPINManagementRequestV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMPINMgmtReq")
    protected ContentInformationType10 prtctdATMPINMgmtReq;
    @XmlElement(name = "ATMPINMgmtReq")
    protected ATMPINManagementRequest3 atmpinMgmtReq;
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
    public ATMPINManagementRequestV03 setHdr(Header31 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMPINMgmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMPINMgmtReq() {
        return prtctdATMPINMgmtReq;
    }

    /**
     * Sets the value of the prtctdATMPINMgmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMPINManagementRequestV03 setPrtctdATMPINMgmtReq(ContentInformationType10 value) {
        this.prtctdATMPINMgmtReq = value;
        return this;
    }

    /**
     * Gets the value of the atmpinMgmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMPINManagementRequest3 }
     *     
     */
    public ATMPINManagementRequest3 getATMPINMgmtReq() {
        return atmpinMgmtReq;
    }

    /**
     * Sets the value of the atmpinMgmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMPINManagementRequest3 }
     *     
     */
    public ATMPINManagementRequestV03 setATMPINMgmtReq(ATMPINManagementRequest3 value) {
        this.atmpinMgmtReq = value;
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
    public ATMPINManagementRequestV03 setSctyTrlr(ContentInformationType15 value) {
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
