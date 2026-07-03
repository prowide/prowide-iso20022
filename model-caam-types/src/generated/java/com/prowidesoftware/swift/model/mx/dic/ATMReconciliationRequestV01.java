
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
 * The ATMReconciliationRequest is sent by an ATM to a maintenance host to notify updates to the reconciliation counts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMReconciliationRequestV01", propOrder = {
    "hdr",
    "prtctdATMRcncltnReq",
    "atmRcncltnReq",
    "sctyTrlr"
})
public class ATMReconciliationRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMRcncltnReq")
    protected ContentInformationType10 prtctdATMRcncltnReq;
    @XmlElement(name = "ATMRcncltnReq")
    protected ATMReconciliationRequestComponent1 atmRcncltnReq;
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
    public ATMReconciliationRequestV01 setHdr(Header31 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMRcncltnReq property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMRcncltnReq() {
        return prtctdATMRcncltnReq;
    }

    /**
     * Sets the value of the prtctdATMRcncltnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMReconciliationRequestV01 setPrtctdATMRcncltnReq(ContentInformationType10 value) {
        this.prtctdATMRcncltnReq = value;
        return this;
    }

    /**
     * Gets the value of the atmRcncltnReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMReconciliationRequestComponent1 }
     *     
     */
    public ATMReconciliationRequestComponent1 getATMRcncltnReq() {
        return atmRcncltnReq;
    }

    /**
     * Sets the value of the atmRcncltnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMReconciliationRequestComponent1 }
     *     
     */
    public ATMReconciliationRequestV01 setATMRcncltnReq(ATMReconciliationRequestComponent1 value) {
        this.atmRcncltnReq = value;
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
    public ATMReconciliationRequestV01 setSctyTrlr(ContentInformationType15 value) {
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
