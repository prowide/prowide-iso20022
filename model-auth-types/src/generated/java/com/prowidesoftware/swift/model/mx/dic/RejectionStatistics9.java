
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "RejectionStatistics9", propOrder = {
    "ctrPtyId",
    "rptSttstcs",
    "derivSttstcs"
})
public class RejectionStatistics9 {

    @XmlElement(name = "CtrPtyId", required = true)
    protected CounterpartyData92 ctrPtyId;
    @XmlElement(name = "RptSttstcs", required = true)
    protected DetailedReportStatistics7 rptSttstcs;
    @XmlElement(name = "DerivSttstcs", required = true)
    protected DetailedTransactionStatistics7Choice derivSttstcs;

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
    public RejectionStatistics9 setCtrPtyId(CounterpartyData92 value) {
        this.ctrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the rptSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedReportStatistics7 }
     *     
     */
    public DetailedReportStatistics7 getRptSttstcs() {
        return rptSttstcs;
    }

    /**
     * Sets the value of the rptSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedReportStatistics7 }
     *     
     */
    public RejectionStatistics9 setRptSttstcs(DetailedReportStatistics7 value) {
        this.rptSttstcs = value;
        return this;
    }

    /**
     * Gets the value of the derivSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedTransactionStatistics7Choice }
     *     
     */
    public DetailedTransactionStatistics7Choice getDerivSttstcs() {
        return derivSttstcs;
    }

    /**
     * Sets the value of the derivSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedTransactionStatistics7Choice }
     *     
     */
    public RejectionStatistics9 setDerivSttstcs(DetailedTransactionStatistics7Choice value) {
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
