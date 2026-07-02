
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
 * This AcceptorTransactionLogReportResponse message is sent by an Acquirer or its IntermediaryAgent to provide the report previously expected by a POI.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorTransactionLogReportResponseV02", propOrder = {
    "hdr",
    "rptRspn",
    "sctyTrlr"
})
public class AcceptorTransactionLogReportResponseV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header59 hdr;
    @XmlElement(name = "RptRspn", required = true)
    protected ReportResponse5 rptRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType31 sctyTrlr;

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
    public AcceptorTransactionLogReportResponseV02 setHdr(Header59 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the rptRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportResponse5 }
     *     
     */
    public ReportResponse5 getRptRspn() {
        return rptRspn;
    }

    /**
     * Sets the value of the rptRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportResponse5 }
     *     
     */
    public AcceptorTransactionLogReportResponseV02 setRptRspn(ReportResponse5 value) {
        this.rptRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType31 }
     *     
     */
    public ContentInformationType31 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType31 }
     *     
     */
    public AcceptorTransactionLogReportResponseV02 setSctyTrlr(ContentInformationType31 value) {
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
