
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
 * Detailed information on rejections for derivatives submitted to trade repositories and failed to pass validations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionStatistics8", propOrder = {
    "ctrPtyId",
    "rptSttstcs",
    "derivSttstcs"
})
public class RejectionStatistics8 {

    @XmlElement(name = "CtrPtyId", required = true)
    protected CounterpartyData92 ctrPtyId;
    @XmlElement(name = "RptSttstcs", required = true)
    protected DetailedReportStatistics6 rptSttstcs;
    @XmlElement(name = "DerivSttstcs", required = true)
    protected DetailedTransactionStatistics6Choice derivSttstcs;

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyData92 }
     *     
     */
    public CounterpartyData92 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyData92 }
     *     
     */
    public RejectionStatistics8 setCtrPtyId(CounterpartyData92 value) {
        this.ctrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the rptSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedReportStatistics6 }
     *     
     */
    public DetailedReportStatistics6 getRptSttstcs() {
        return rptSttstcs;
    }

    /**
     * Sets the value of the rptSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedReportStatistics6 }
     *     
     */
    public RejectionStatistics8 setRptSttstcs(DetailedReportStatistics6 value) {
        this.rptSttstcs = value;
        return this;
    }

    /**
     * Gets the value of the derivSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedTransactionStatistics6Choice }
     *     
     */
    public DetailedTransactionStatistics6Choice getDerivSttstcs() {
        return derivSttstcs;
    }

    /**
     * Sets the value of the derivSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedTransactionStatistics6Choice }
     *     
     */
    public RejectionStatistics8 setDerivSttstcs(DetailedTransactionStatistics6Choice value) {
        this.derivSttstcs = value;
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
