
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identification of the report and information allowing a multi tranches report to be correctly reassembled.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulkReportHeader", propOrder = {
    "rptId",
    "trchNb",
    "lastTrchInd"
})
public class BulkReportHeader {

    @XmlElement(name = "RptId", required = true)
    protected String rptId;
    @XmlElement(name = "TrchNb", required = true)
    protected BigDecimal trchNb;
    @XmlElement(name = "LastTrchInd")
    protected boolean lastTrchInd;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BulkReportHeader setRptId(String value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the trchNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrchNb() {
        return trchNb;
    }

    /**
     * Sets the value of the trchNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BulkReportHeader setTrchNb(BigDecimal value) {
        this.trchNb = value;
        return this;
    }

    /**
     * Gets the value of the lastTrchInd property.
     * 
     */
    public boolean isLastTrchInd() {
        return lastTrchInd;
    }

    /**
     * Sets the value of the lastTrchInd property.
     * 
     */
    public BulkReportHeader setLastTrchInd(boolean value) {
        this.lastTrchInd = value;
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
