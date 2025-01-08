
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for RetrievalReport complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievalReport", propOrder = {
    "reqRef",
    "rptInf",
    "rtrvdMsgLst"
})
public class RetrievalReport {

    @XmlElement(name = "ReqRef", required = true)
    protected RequestReferenceXsys01600101 reqRef;
    @XmlElement(name = "RptInf", required = true)
    protected ReportInfo rptInf;
    @XmlElement(name = "RtrvdMsgLst")
    protected RetrievedMessageList rtrvdMsgLst;

    /**
     * Gets the value of the reqRef property.
     * 
     * @return
     *     possible object is
     *     {@link RequestReferenceXsys01600101 }
     *     
     */
    public RequestReferenceXsys01600101 getReqRef() {
        return reqRef;
    }

    /**
     * Sets the value of the reqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestReferenceXsys01600101 }
     *     
     */
    public RetrievalReport setReqRef(RequestReferenceXsys01600101 value) {
        this.reqRef = value;
        return this;
    }

    /**
     * Gets the value of the rptInf property.
     * 
     * @return
     *     possible object is
     *     {@link ReportInfo }
     *     
     */
    public ReportInfo getRptInf() {
        return rptInf;
    }

    /**
     * Sets the value of the rptInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportInfo }
     *     
     */
    public RetrievalReport setRptInf(ReportInfo value) {
        this.rptInf = value;
        return this;
    }

    /**
     * Gets the value of the rtrvdMsgLst property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievedMessageList }
     *     
     */
    public RetrievedMessageList getRtrvdMsgLst() {
        return rtrvdMsgLst;
    }

    /**
     * Sets the value of the rtrvdMsgLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievedMessageList }
     *     
     */
    public RetrievalReport setRtrvdMsgLst(RetrievedMessageList value) {
        this.rtrvdMsgLst = value;
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
