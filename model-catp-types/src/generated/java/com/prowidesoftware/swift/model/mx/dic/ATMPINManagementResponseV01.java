
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
 * The ATMPINManagementResponse message is sent by an ATM manager or its agent to the ATM to provide the information and the outcome of the cardholder PIN operation requested in the ATMPINManagementRequest.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMPINManagementResponseV01", propOrder = {
    "hdr",
    "prtctdATMPINMgmtRspn",
    "atmpinMgmtRspn",
    "sctyTrlr"
})
public class ATMPINManagementResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header20 hdr;
    @XmlElement(name = "PrtctdATMPINMgmtRspn")
    protected ContentInformationType10 prtctdATMPINMgmtRspn;
    @XmlElement(name = "ATMPINMgmtRspn")
    protected ATMPINManagementResponse1 atmpinMgmtRspn;
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
    public ATMPINManagementResponseV01 setHdr(Header20 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMPINMgmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMPINMgmtRspn() {
        return prtctdATMPINMgmtRspn;
    }

    /**
     * Sets the value of the prtctdATMPINMgmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMPINManagementResponseV01 setPrtctdATMPINMgmtRspn(ContentInformationType10 value) {
        this.prtctdATMPINMgmtRspn = value;
        return this;
    }

    /**
     * Gets the value of the atmpinMgmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMPINManagementResponse1 }
     *     
     */
    public ATMPINManagementResponse1 getATMPINMgmtRspn() {
        return atmpinMgmtRspn;
    }

    /**
     * Sets the value of the atmpinMgmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMPINManagementResponse1 }
     *     
     */
    public ATMPINManagementResponseV01 setATMPINMgmtRspn(ATMPINManagementResponse1 value) {
        this.atmpinMgmtRspn = value;
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
    public ATMPINManagementResponseV01 setSctyTrlr(ContentInformationType15 value) {
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
