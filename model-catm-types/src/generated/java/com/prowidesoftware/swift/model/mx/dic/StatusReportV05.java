
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
 * Informs the master terminal manager (MTM) or the terminal manager (TM) about the status of the acceptor system including the identification of the POI, its components and their installed versions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReportV05", propOrder = {
    "hdr",
    "stsRpt",
    "sctyTrlr"
})
public class StatusReportV05 {

    @XmlElement(name = "Hdr", required = true)
    protected Header27 hdr;
    @XmlElement(name = "StsRpt", required = true)
    protected StatusReport5 stsRpt;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType12 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header27 }
     *     
     */
    public Header27 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header27 }
     *     
     */
    public StatusReportV05 setHdr(Header27 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the stsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReport5 }
     *     
     */
    public StatusReport5 getStsRpt() {
        return stsRpt;
    }

    /**
     * Sets the value of the stsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReport5 }
     *     
     */
    public StatusReportV05 setStsRpt(StatusReport5 value) {
        this.stsRpt = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType12 }
     *     
     */
    public ContentInformationType12 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType12 }
     *     
     */
    public StatusReportV05 setSctyTrlr(ContentInformationType12 value) {
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
