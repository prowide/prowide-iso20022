
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
 * The AcceptorDiagnosticRequest message is sent by an acceptor (or its agent) to the acquirer (or its agent), to check the end-to-end communication, to test the availability of this acquirer, or to validate the security environment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorDiagnosticRequestV06", propOrder = {
    "hdr",
    "dgnstcReq",
    "sctyTrlr"
})
public class AcceptorDiagnosticRequestV06 {

    @XmlElement(name = "Hdr", required = true)
    protected Header30 hdr;
    @XmlElement(name = "DgnstcReq", required = true)
    protected AcceptorDiagnosticRequest6 dgnstcReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header30 }
     *     
     */
    public Header30 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header30 }
     *     
     */
    public AcceptorDiagnosticRequestV06 setHdr(Header30 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the dgnstcReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorDiagnosticRequest6 }
     *     
     */
    public AcceptorDiagnosticRequest6 getDgnstcReq() {
        return dgnstcReq;
    }

    /**
     * Sets the value of the dgnstcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorDiagnosticRequest6 }
     *     
     */
    public AcceptorDiagnosticRequestV06 setDgnstcReq(AcceptorDiagnosticRequest6 value) {
        this.dgnstcReq = value;
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
    public AcceptorDiagnosticRequestV06 setSctyTrlr(ContentInformationType15 value) {
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
