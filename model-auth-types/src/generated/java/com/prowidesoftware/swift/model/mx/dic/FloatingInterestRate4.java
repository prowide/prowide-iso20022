
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the index used to define the rate and optionally the basis point spread.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingInterestRate4", propOrder = {
    "refRate",
    "term",
    "bsisPtSprd"
})
public class FloatingInterestRate4 {

    @XmlElement(name = "RefRate", required = true)
    protected BenchmarkCurveName4Choice refRate;
    @XmlElement(name = "Term", required = true)
    protected InterestRateContractTerm1 term;
    @XmlElement(name = "BsisPtSprd", required = true)
    protected BigDecimal bsisPtSprd;

    /**
     * Gets the value of the refRate property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName4Choice }
     *     
     */
    public BenchmarkCurveName4Choice getRefRate() {
        return refRate;
    }

    /**
     * Sets the value of the refRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName4Choice }
     *     
     */
    public FloatingInterestRate4 setRefRate(BenchmarkCurveName4Choice value) {
        this.refRate = value;
        return this;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateContractTerm1 }
     *     
     */
    public InterestRateContractTerm1 getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateContractTerm1 }
     *     
     */
    public FloatingInterestRate4 setTerm(InterestRateContractTerm1 value) {
        this.term = value;
        return this;
    }

    /**
     * Gets the value of the bsisPtSprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBsisPtSprd() {
        return bsisPtSprd;
    }

    /**
     * Sets the value of the bsisPtSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FloatingInterestRate4 setBsisPtSprd(BigDecimal value) {
        this.bsisPtSprd = value;
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
