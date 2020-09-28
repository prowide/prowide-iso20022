
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
 * Java class for InputChannelReport complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputChannelReport", propOrder = {
    "reqRef",
    "rptInf",
    "inptChanlList"
})
public class InputChannelReport {

    @XmlElement(name = "ReqRef", required = true)
    protected RequestReference reqRef;
    @XmlElement(name = "RptInf", required = true)
    protected ReportInfo rptInf;
    @XmlElement(name = "InptChanlList")
    protected InputChannelList inptChanlList;

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
    public InputChannelReport setReqRef(RequestReference value) {
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
    public InputChannelReport setRptInf(ReportInfo value) {
        this.rptInf = value;
        return this;
    }

    /**
     * Gets the value of the inptChanlList property.
     * 
     * @return
     *     possible object is
     *     {@link InputChannelList }
     *     
     */
    public InputChannelList getInptChanlList() {
        return inptChanlList;
    }

    /**
     * Sets the value of the inptChanlList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputChannelList }
     *     
     */
    public InputChannelReport setInptChanlList(InputChannelList value) {
        this.inptChanlList = value;
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
