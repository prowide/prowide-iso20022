
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
 * Settlement totals or the report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTotals1", propOrder = {
    "acqrrTtls",
    "issrTtls",
    "othrTtls",
    "ttlSttlmAmt"
})
public class SettlementTotals1 {

    @XmlElement(name = "AcqrrTtls")
    protected SettlementCategoryTotal1 acqrrTtls;
    @XmlElement(name = "IssrTtls")
    protected SettlementCategoryTotal1 issrTtls;
    @XmlElement(name = "OthrTtls")
    protected SettlementCategoryTotal1 othrTtls;
    @XmlElement(name = "TtlSttlmAmt")
    protected SettlementCategoryTotal1 ttlSttlmAmt;

    /**
     * Gets the value of the acqrrTtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal1 }
     *     
     */
    public SettlementCategoryTotal1 getAcqrrTtls() {
        return acqrrTtls;
    }

    /**
     * Sets the value of the acqrrTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal1 }
     *     
     */
    public SettlementTotals1 setAcqrrTtls(SettlementCategoryTotal1 value) {
        this.acqrrTtls = value;
        return this;
    }

    /**
     * Gets the value of the issrTtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal1 }
     *     
     */
    public SettlementCategoryTotal1 getIssrTtls() {
        return issrTtls;
    }

    /**
     * Sets the value of the issrTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal1 }
     *     
     */
    public SettlementTotals1 setIssrTtls(SettlementCategoryTotal1 value) {
        this.issrTtls = value;
        return this;
    }

    /**
     * Gets the value of the othrTtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal1 }
     *     
     */
    public SettlementCategoryTotal1 getOthrTtls() {
        return othrTtls;
    }

    /**
     * Sets the value of the othrTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal1 }
     *     
     */
    public SettlementTotals1 setOthrTtls(SettlementCategoryTotal1 value) {
        this.othrTtls = value;
        return this;
    }

    /**
     * Gets the value of the ttlSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal1 }
     *     
     */
    public SettlementCategoryTotal1 getTtlSttlmAmt() {
        return ttlSttlmAmt;
    }

    /**
     * Sets the value of the ttlSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal1 }
     *     
     */
    public SettlementTotals1 setTtlSttlmAmt(SettlementCategoryTotal1 value) {
        this.ttlSttlmAmt = value;
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
