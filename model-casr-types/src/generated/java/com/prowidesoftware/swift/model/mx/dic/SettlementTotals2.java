
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
 * Settlement totals or the report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTotals2", propOrder = {
    "acqrrTtls",
    "issrTtls",
    "othrTtls",
    "ttlSttlmAmt"
})
public class SettlementTotals2 {

    @XmlElement(name = "AcqrrTtls")
    protected SettlementCategoryTotal2 acqrrTtls;
    @XmlElement(name = "IssrTtls")
    protected SettlementCategoryTotal2 issrTtls;
    @XmlElement(name = "OthrTtls")
    protected SettlementCategoryTotal2 othrTtls;
    @XmlElement(name = "TtlSttlmAmt")
    protected SettlementCategoryTotal2 ttlSttlmAmt;

    /**
     * Gets the value of the acqrrTtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public SettlementCategoryTotal2 getAcqrrTtls() {
        return acqrrTtls;
    }

    /**
     * Sets the value of the acqrrTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public SettlementTotals2 setAcqrrTtls(SettlementCategoryTotal2 value) {
        this.acqrrTtls = value;
        return this;
    }

    /**
     * Gets the value of the issrTtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public SettlementCategoryTotal2 getIssrTtls() {
        return issrTtls;
    }

    /**
     * Sets the value of the issrTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public SettlementTotals2 setIssrTtls(SettlementCategoryTotal2 value) {
        this.issrTtls = value;
        return this;
    }

    /**
     * Gets the value of the othrTtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public SettlementCategoryTotal2 getOthrTtls() {
        return othrTtls;
    }

    /**
     * Sets the value of the othrTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public SettlementTotals2 setOthrTtls(SettlementCategoryTotal2 value) {
        this.othrTtls = value;
        return this;
    }

    /**
     * Gets the value of the ttlSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public SettlementCategoryTotal2 getTtlSttlmAmt() {
        return ttlSttlmAmt;
    }

    /**
     * Sets the value of the ttlSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public SettlementTotals2 setTtlSttlmAmt(SettlementCategoryTotal2 value) {
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
