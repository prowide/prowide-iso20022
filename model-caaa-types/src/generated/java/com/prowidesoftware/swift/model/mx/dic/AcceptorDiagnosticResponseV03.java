
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
 * The AcceptorDiagnosticResponse message is sent by the acquirer (or its agent) to provide to the acceptor the result of the diagnostic request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorDiagnosticResponseV03", propOrder = {
    "hdr",
    "dgnstcRspn",
    "sctyTrlr"
})
public class AcceptorDiagnosticResponseV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header7 hdr;
    @XmlElement(name = "DgnstcRspn", required = true)
    protected AcceptorDiagnosticResponse3 dgnstcRspn;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType8 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header7 }
     *     
     */
    public Header7 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header7 }
     *     
     */
    public AcceptorDiagnosticResponseV03 setHdr(Header7 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the dgnstcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorDiagnosticResponse3 }
     *     
     */
    public AcceptorDiagnosticResponse3 getDgnstcRspn() {
        return dgnstcRspn;
    }

    /**
     * Sets the value of the dgnstcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorDiagnosticResponse3 }
     *     
     */
    public AcceptorDiagnosticResponseV03 setDgnstcRspn(AcceptorDiagnosticResponse3 value) {
        this.dgnstcRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType8 }
     *     
     */
    public ContentInformationType8 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType8 }
     *     
     */
    public AcceptorDiagnosticResponseV03 setSctyTrlr(ContentInformationType8 value) {
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
