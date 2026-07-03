
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
 * Specifies the aggregated data of settlement fails instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsData4", propOrder = {
    "ttl",
    "failrRsn",
    "elgblForDrgtn"
})
public class SettlementFailsData4 {

    @XmlElement(name = "Ttl", required = true)
    protected SettlementTotalData1 ttl;
    @XmlElement(name = "FailrRsn", required = true)
    protected SettlementFailureReason3 failrRsn;
    @XmlElement(name = "ElgblForDrgtn", required = true)
    protected SettlementFailsDerogation1 elgblForDrgtn;

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1 }
     *     
     */
    public SettlementTotalData1 getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1 }
     *     
     */
    public SettlementFailsData4 setTtl(SettlementTotalData1 value) {
        this.ttl = value;
        return this;
    }

    /**
     * Gets the value of the failrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailureReason3 }
     *     
     */
    public SettlementFailureReason3 getFailrRsn() {
        return failrRsn;
    }

    /**
     * Sets the value of the failrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailureReason3 }
     *     
     */
    public SettlementFailsData4 setFailrRsn(SettlementFailureReason3 value) {
        this.failrRsn = value;
        return this;
    }

    /**
     * Gets the value of the elgblForDrgtn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDerogation1 }
     *     
     */
    public SettlementFailsDerogation1 getElgblForDrgtn() {
        return elgblForDrgtn;
    }

    /**
     * Sets the value of the elgblForDrgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDerogation1 }
     *     
     */
    public SettlementFailsData4 setElgblForDrgtn(SettlementFailsDerogation1 value) {
        this.elgblForDrgtn = value;
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
