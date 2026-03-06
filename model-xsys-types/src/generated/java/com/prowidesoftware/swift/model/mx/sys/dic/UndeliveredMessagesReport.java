
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
public class UndeliveredMessagesReport {

    @XmlElement(name = "RptCrit", required = true)
    protected ReportCriteria rptCrit;
    @XmlElement(name = "RptInf", required = true)
    protected ReportInfo rptInf;
    @XmlElement(name = "UdlvrdMsgList")
    protected UndeliveredMessageList udlvrdMsgList;

    /**
     * Gets the value of the rptCrit property.
     * 
     * @return
     *     possible object is
     *     {@link ReportCriteria }
     *     
     */
    public ReportCriteria getRptCrit() {
        return rptCrit;
    }

    /**
     * Sets the value of the rptCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportCriteria }
     *     
     */
    public UndeliveredMessagesReport setRptCrit(ReportCriteria value) {
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
    public UndeliveredMessagesReport setRptInf(ReportInfo value) {
        this.rptInf = value;
        return this;
    }

    /**
     * Gets the value of the udlvrdMsgList property.
     * 
     * @return
     *     possible object is
     *     {@link UndeliveredMessageList }
     *     
     */
    public UndeliveredMessageList getUdlvrdMsgList() {
        return udlvrdMsgList;
    }

    /**
     * Sets the value of the udlvrdMsgList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndeliveredMessageList }
     *     
     */
    public UndeliveredMessagesReport setUdlvrdMsgList(UndeliveredMessageList value) {
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
