
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
 * The HostToATMRequest message is sent by a host to an ATM to request the ATM to contact a host by sending of a maintenance messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostToATMRequestV01", propOrder = {
    "hdr",
    "prtctdHstToATMReq",
    "hstToATMReq",
    "sctyTrlr"
})
public class HostToATMRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header20 hdr;
    @XmlElement(name = "PrtctdHstToATMReq")
    protected ContentInformationType10 prtctdHstToATMReq;
    @XmlElement(name = "HstToATMReq")
    protected HostToATMRequest1 hstToATMReq;
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
    public HostToATMRequestV01 setHdr(Header20 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdHstToATMReq property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdHstToATMReq() {
        return prtctdHstToATMReq;
    }

    /**
     * Sets the value of the prtctdHstToATMReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public HostToATMRequestV01 setPrtctdHstToATMReq(ContentInformationType10 value) {
        this.prtctdHstToATMReq = value;
        return this;
    }

    /**
     * Gets the value of the hstToATMReq property.
     * 
     * @return
     *     possible object is
     *     {@link HostToATMRequest1 }
     *     
     */
    public HostToATMRequest1 getHstToATMReq() {
        return hstToATMReq;
    }

    /**
     * Sets the value of the hstToATMReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostToATMRequest1 }
     *     
     */
    public HostToATMRequestV01 setHstToATMReq(HostToATMRequest1 value) {
        this.hstToATMReq = value;
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
    public HostToATMRequestV01 setSctyTrlr(ContentInformationType15 value) {
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
