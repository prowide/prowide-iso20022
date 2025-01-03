
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
 * The ATMDiagnosticRequest message is sent from an ATM to an acquirer to verify the availability of the acquirer. The acquirer will also validate that this ATM is a valid ATM for its particular network.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDiagnosticRequestV01", propOrder = {
    "hdr",
    "prtctdATMDgnstcReq",
    "atmDgnstcReq",
    "sctyTrlr"
})
public class ATMDiagnosticRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header20 hdr;
    @XmlElement(name = "PrtctdATMDgnstcReq")
    protected ContentInformationType10 prtctdATMDgnstcReq;
    @XmlElement(name = "ATMDgnstcReq")
    protected ATMDiagnosticRequest1 atmDgnstcReq;
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
    public ATMDiagnosticRequestV01 setHdr(Header20 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMDgnstcReq property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMDgnstcReq() {
        return prtctdATMDgnstcReq;
    }

    /**
     * Sets the value of the prtctdATMDgnstcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMDiagnosticRequestV01 setPrtctdATMDgnstcReq(ContentInformationType10 value) {
        this.prtctdATMDgnstcReq = value;
        return this;
    }

    /**
     * Gets the value of the atmDgnstcReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDiagnosticRequest1 }
     *     
     */
    public ATMDiagnosticRequest1 getATMDgnstcReq() {
        return atmDgnstcReq;
    }

    /**
     * Sets the value of the atmDgnstcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDiagnosticRequest1 }
     *     
     */
    public ATMDiagnosticRequestV01 setATMDgnstcReq(ATMDiagnosticRequest1 value) {
        this.atmDgnstcReq = value;
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
    public ATMDiagnosticRequestV01 setSctyTrlr(ContentInformationType15 value) {
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
