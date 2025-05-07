
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for OutputChannelReport complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputChannelReport", propOrder = {
    "reqRef",
    "rptInf",
    "outptChanlList"
})
public class OutputChannelReport {

    @XmlElement(name = "ReqRef", required = true)
    protected RequestReference reqRef;
    @XmlElement(name = "RptInf", required = true)
    protected ReportInformation rptInf;
    @XmlElement(name = "OutptChanlList")
    protected OutputChannelListXsys02700101 outptChanlList;

    /**
     * Gets the value of the reqRef property.
     * 
     * @return
     *     possible object is
     *     {@link RequestReference }
     *     
     */
    public RequestReference getReqRef() {
        return reqRef;
    }

    /**
     * Sets the value of the reqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestReference }
     *     
     */
    public OutputChannelReport setReqRef(RequestReference value) {
        this.reqRef = value;
        return this;
    }

    /**
     * Gets the value of the rptInf property.
     * 
     * @return
     *     possible object is
     *     {@link ReportInformation }
     *     
     */
    public ReportInformation getRptInf() {
        return rptInf;
    }

    /**
     * Sets the value of the rptInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportInformation }
     *     
     */
    public OutputChannelReport setRptInf(ReportInformation value) {
        this.rptInf = value;
        return this;
    }

    /**
     * Gets the value of the outptChanlList property.
     * 
     * @return
     *     possible object is
     *     {@link OutputChannelListXsys02700101 }
     *     
     */
    public OutputChannelListXsys02700101 getOutptChanlList() {
        return outptChanlList;
    }

    /**
     * Sets the value of the outptChanlList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputChannelListXsys02700101 }
     *     
     */
    public OutputChannelReport setOutptChanlList(OutputChannelListXsys02700101 value) {
        this.outptChanlList = value;
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
