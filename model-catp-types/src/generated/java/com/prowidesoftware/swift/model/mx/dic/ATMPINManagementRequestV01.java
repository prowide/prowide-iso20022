
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
 * The ATMPINManagementRequest message is sent by an ATM to an ATM manager to request an operation on the cardholder PIN.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMPINManagementRequestV01", propOrder = {
    "hdr",
    "prtctdATMPINMgmtReq",
    "atmpinMgmtReq",
    "sctyTrlr"
})
public class ATMPINManagementRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header20 hdr;
    @XmlElement(name = "PrtctdATMPINMgmtReq")
    protected ContentInformationType10 prtctdATMPINMgmtReq;
    @XmlElement(name = "ATMPINMgmtReq")
    protected ATMPINManagementRequest1 atmpinMgmtReq;
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
    public ATMPINManagementRequestV01 setHdr(Header20 value) {
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
    public ATMPINManagementRequestV01 setPrtctdATMPINMgmtReq(ContentInformationType10 value) {
        this.prtctdATMPINMgmtReq = value;
        return this;
    }

    /**
     * Gets the value of the atmpinMgmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMPINManagementRequest1 }
     *     
     */
    public ATMPINManagementRequest1 getATMPINMgmtReq() {
        return atmpinMgmtReq;
    }

    /**
     * Sets the value of the atmpinMgmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMPINManagementRequest1 }
     *     
     */
    public ATMPINManagementRequestV01 setATMPINMgmtReq(ATMPINManagementRequest1 value) {
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
    public ATMPINManagementRequestV01 setSctyTrlr(ContentInformationType15 value) {
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
