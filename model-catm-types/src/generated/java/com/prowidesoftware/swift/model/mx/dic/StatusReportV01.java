
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
 * Scope
 * The StatusReport message is sent by the card acceptor to the master terminal manager or delegated terminal manager to inform these entities about the status of the acceptor system.
 * Usage
 * The StatusReport message may embed the information required by the master terminal manager or delegated terminal manager for preparing the needed TMS actions in the management plan to be replaced and the acceptor parameters to be updated.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReportV01", propOrder = {
    "hdr",
    "stsRpt",
    "sctyTrlr"
})
public class StatusReportV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header4 hdr;
    @XmlElement(name = "StsRpt", required = true)
    protected StatusReport1 stsRpt;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType1 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header4 }
     *     
     */
    public Header4 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header4 }
     *     
     */
    public StatusReportV01 setHdr(Header4 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the stsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReport1 }
     *     
     */
    public StatusReport1 getStsRpt() {
        return stsRpt;
    }

    /**
     * Sets the value of the stsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReport1 }
     *     
     */
    public StatusReportV01 setStsRpt(StatusReport1 value) {
        this.stsRpt = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType1 }
     *     
     */
    public ContentInformationType1 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType1 }
     *     
     */
    public StatusReportV01 setSctyTrlr(ContentInformationType1 value) {
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
