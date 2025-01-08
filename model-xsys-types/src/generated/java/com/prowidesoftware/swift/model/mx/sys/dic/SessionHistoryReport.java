
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
 * Java class for SessionHistoryReport complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionHistoryReport", propOrder = {
    "reqRef",
    "rptInf",
    "inptOutptChnlList"
})
public class SessionHistoryReport {

    @XmlElement(name = "ReqRef", required = true)
    protected RequestReference reqRef;
    @XmlElement(name = "RptInf", required = true)
    protected ReportInformation rptInf;
    @XmlElement(name = "InptOutptChnlList")
    protected InputOutputChannelListXsys01900101 inptOutptChnlList;

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
    public SessionHistoryReport setReqRef(RequestReference value) {
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
    public SessionHistoryReport setRptInf(ReportInformation value) {
        this.rptInf = value;
        return this;
    }

    /**
     * Gets the value of the inptOutptChnlList property.
     * 
     * @return
     *     possible object is
     *     {@link InputOutputChannelListXsys01900101 }
     *     
     */
    public InputOutputChannelListXsys01900101 getInptOutptChnlList() {
        return inptOutptChnlList;
    }

    /**
     * Sets the value of the inptOutptChnlList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputOutputChannelListXsys01900101 }
     *     
     */
    public SessionHistoryReport setInptOutptChnlList(InputOutputChannelListXsys01900101 value) {
        this.inptOutptChnlList = value;
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
