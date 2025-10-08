
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
 * Java class for QueueStatusReport complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueStatusReport", propOrder = {
    "reqRef",
    "rptInf",
    "qStsList"
})
public class QueueStatusReport {

    @XmlElement(name = "ReqRef", required = true)
    protected RequestReference reqRef;
    @XmlElement(name = "RptInf", required = true)
    protected ReportInformation rptInf;
    @XmlElement(name = "QStsList")
    protected QueueStatusListXsys00900101 qStsList;

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
    public QueueStatusReport setReqRef(RequestReference value) {
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
    public QueueStatusReport setRptInf(ReportInformation value) {
        this.rptInf = value;
        return this;
    }

    /**
     * Gets the value of the qStsList property.
     * 
     * @return
     *     possible object is
     *     {@link QueueStatusListXsys00900101 }
     *     
     */
    public QueueStatusListXsys00900101 getQStsList() {
        return qStsList;
    }

    /**
     * Sets the value of the qStsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueStatusListXsys00900101 }
     *     
     */
    public QueueStatusReport setQStsList(QueueStatusListXsys00900101 value) {
        this.qStsList = value;
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
