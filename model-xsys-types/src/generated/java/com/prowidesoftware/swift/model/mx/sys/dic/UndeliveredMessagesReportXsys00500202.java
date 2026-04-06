
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
    "dbIdr",
    "udlvrdMsgList"
})
public class UndeliveredMessagesReportXsys00500202 {

    @XmlElement(name = "RptCrit", required = true)
    protected ReportCriteria rptCrit;
    @XmlElement(name = "RptInf", required = true)
    protected ReportInfo rptInf;
    @XmlElement(name = "DbIdr", required = true)
    protected List<BigDecimal> dbIdr;
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
    public UndeliveredMessagesReportXsys00500202 setRptCrit(ReportCriteria value) {
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
    public UndeliveredMessagesReportXsys00500202 setRptInf(ReportInfo value) {
        this.rptInf = value;
        return this;
    }

    /**
     * Gets the value of the dbIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dbIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDbIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     * @return
     *     The value of the dbIdr property.
     */
    public List<BigDecimal> getDbIdr() {
        if (dbIdr == null) {
            dbIdr = new ArrayList<>();
        }
        return this.dbIdr;
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
    public UndeliveredMessagesReportXsys00500202 setUdlvrdMsgList(UndeliveredMessageList value) {
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

    /**
     * Adds a new item to the dbIdr list.
     * @see #getDbIdr()
     * 
     */
    public UndeliveredMessagesReportXsys00500202 addDbIdr(BigDecimal dbIdr) {
        getDbIdr().add(dbIdr);
        return this;
    }

}
