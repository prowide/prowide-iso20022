
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
 * Scope
 * The AcceptorDiagnosticResponse message is sent by the acquirer to the card acceptor to confirm the availability of the acquirer. An agent never forwards the message.
 * Usage
 * The AcceptorDiagnosticResponse message is used to:
 * - confirm the availability of the acquirer;
 * - validate the security of the exchanges with the acquirer;
 * - validate the version of the configuration parameters.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorDiagnosticResponseV01", propOrder = {
    "hdr",
    "dgnstcRspn",
    "sctyTrlr"
})
public class AcceptorDiagnosticResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header1 hdr;
    @XmlElement(name = "DgnstcRspn", required = true)
    protected AcceptorDiagnosticResponse1 dgnstcRspn;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType3 sctyTrlr;

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
    public AcceptorDiagnosticResponseV01 setHdr(Header1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the dgnstcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorDiagnosticResponse1 }
     *     
     */
    public AcceptorDiagnosticResponse1 getDgnstcRspn() {
        return dgnstcRspn;
    }

    /**
     * Sets the value of the dgnstcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorDiagnosticResponse1 }
     *     
     */
    public AcceptorDiagnosticResponseV01 setDgnstcRspn(AcceptorDiagnosticResponse1 value) {
        this.dgnstcRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType3 }
     *     
     */
    public ContentInformationType3 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType3 }
     *     
     */
    public AcceptorDiagnosticResponseV01 setSctyTrlr(ContentInformationType3 value) {
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
