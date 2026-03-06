
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
 * Java class for UndeliveredMessagesReport complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndeliveredMessagesReport", propOrder = {
    "rptCrit",
    "rptInf",
    "udlvrdMsgList"
})
public class UndeliveredMessagesReportXsys00500201 {

    @XmlElement(name = "RptCrit", required = true)
    protected ReportCriteriaXsys00500201 rptCrit;
    @XmlElement(name = "RptInf", required = true)
    protected ReportInfo rptInf;
    @XmlElement(name = "UdlvrdMsgList")
    protected UndeliveredMessageListXsys00500201 udlvrdMsgList;

    /**
     * Gets the value of the rptCrit property.
     * 
     * @return
     *     possible object is
     *     {@link ReportCriteriaXsys00500201 }
     *     
     */
    public ReportCriteriaXsys00500201 getRptCrit() {
        return rptCrit;
    }

    /**
     * Sets the value of the rptCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportCriteriaXsys00500201 }
     *     
     */
    public UndeliveredMessagesReportXsys00500201 setRptCrit(ReportCriteriaXsys00500201 value) {
        this.rptCrit = value;
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
    public UndeliveredMessagesReportXsys00500201 setRptInf(ReportInfo value) {
        this.rptInf = value;
        return this;
    }

    /**
     * Gets the value of the udlvrdMsgList property.
     * 
     * @return
     *     possible object is
     *     {@link UndeliveredMessageListXsys00500201 }
     *     
     */
    public UndeliveredMessageListXsys00500201 getUdlvrdMsgList() {
        return udlvrdMsgList;
    }

    /**
     * Sets the value of the udlvrdMsgList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndeliveredMessageListXsys00500201 }
     *     
     */
    public UndeliveredMessagesReportXsys00500201 setUdlvrdMsgList(UndeliveredMessageListXsys00500201 value) {
        this.udlvrdMsgList = value;
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
