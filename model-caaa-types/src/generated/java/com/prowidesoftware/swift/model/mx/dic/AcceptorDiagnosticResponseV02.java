
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
 * The AcceptorDiagnosticResponse message is sent by the acquirer (or its agent) to provide to the acceptor the result of the diagnostic request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorDiagnosticResponseV02", propOrder = {
    "hdr",
    "dgnstcRspn",
    "sctyTrlr"
})
public class AcceptorDiagnosticResponseV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header1 hdr;
    @XmlElement(name = "DgnstcRspn", required = true)
    protected AcceptorDiagnosticResponse2 dgnstcRspn;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType6 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header1 }
     *     
     */
    public Header1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header1 }
     *     
     */
    public AcceptorDiagnosticResponseV02 setHdr(Header1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the dgnstcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorDiagnosticResponse2 }
     *     
     */
    public AcceptorDiagnosticResponse2 getDgnstcRspn() {
        return dgnstcRspn;
    }

    /**
     * Sets the value of the dgnstcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorDiagnosticResponse2 }
     *     
     */
    public AcceptorDiagnosticResponseV02 setDgnstcRspn(AcceptorDiagnosticResponse2 value) {
        this.dgnstcRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType6 }
     *     
     */
    public ContentInformationType6 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType6 }
     *     
     */
    public AcceptorDiagnosticResponseV02 setSctyTrlr(ContentInformationType6 value) {
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
