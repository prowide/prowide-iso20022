
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
 * The AcceptorTransactionLogReportRequest message is sent by an Acceptor to an Acquirer or its IntermediaryAgent to request a report service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorTransactionLogReportRequestV01", propOrder = {
    "hdr",
    "rptReq",
    "sctyTrlr"
})
public class AcceptorTransactionLogReportRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header59 hdr;
    @XmlElement(name = "RptReq", required = true)
    protected ReportRequest4 rptReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType27 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header59 }
     *     
     */
    public Header59 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header59 }
     *     
     */
    public AcceptorTransactionLogReportRequestV01 setHdr(Header59 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the rptReq property.
     * 
     * @return
     *     possible object is
     *     {@link ReportRequest4 }
     *     
     */
    public ReportRequest4 getRptReq() {
        return rptReq;
    }

    /**
     * Sets the value of the rptReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportRequest4 }
     *     
     */
    public AcceptorTransactionLogReportRequestV01 setRptReq(ReportRequest4 value) {
        this.rptReq = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType27 }
     *     
     */
    public ContentInformationType27 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType27 }
     *     
     */
    public AcceptorTransactionLogReportRequestV01 setSctyTrlr(ContentInformationType27 value) {
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
