
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
 * Fixed rate related information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedRate10", propOrder = {
    "rate",
    "dayCnt",
    "pmtFrqcy"
})
public class FixedRate10 {

    @XmlElement(name = "Rate")
    protected SecuritiesTransactionPrice14Choice rate;
    @XmlElement(name = "DayCnt")
    protected InterestComputationMethodFormat7 dayCnt;
    @XmlElement(name = "PmtFrqcy")
    protected InterestRateFrequency3Choice pmtFrqcy;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice14Choice }
     *     
     */
    public SecuritiesTransactionPrice14Choice getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice14Choice }
     *     
     */
    public FixedRate10 setRate(SecuritiesTransactionPrice14Choice value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the dayCnt property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat7 }
     *     
     */
    public InterestComputationMethodFormat7 getDayCnt() {
        return dayCnt;
    }

    /**
     * Sets the value of the dayCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat7 }
     *     
     */
    public FixedRate10 setDayCnt(InterestComputationMethodFormat7 value) {
        this.dayCnt = value;
        return this;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateFrequency3Choice }
     *     
     */
    public InterestRateFrequency3Choice getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateFrequency3Choice }
     *     
     */
    public FixedRate10 setPmtFrqcy(InterestRateFrequency3Choice value) {
        this.pmtFrqcy = value;
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
