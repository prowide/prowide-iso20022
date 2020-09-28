
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
 * Provides the index used to define the rate and the basis point spread.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingInterestRate16", propOrder = {
    "refRate",
    "term",
    "pmtFrqcy",
    "rstFrqcy",
    "bsisPtSprd",
    "dayCntBsis"
})
public class FloatingInterestRate16 {

    @XmlElement(name = "RefRate")
    protected BenchmarkCurveName8Choice refRate;
    @XmlElement(name = "Term")
    protected InterestRateContractTerm2 term;
    @XmlElement(name = "PmtFrqcy")
    protected InterestRateContractTerm2 pmtFrqcy;
    @XmlElement(name = "RstFrqcy")
    protected InterestRateContractTerm2 rstFrqcy;
    @XmlElement(name = "BsisPtSprd")
    protected BigDecimal bsisPtSprd;
    @XmlElement(name = "DayCntBsis", required = true)
    protected InterestComputationMethodFormat6Choice dayCntBsis;

    /**
     * Gets the value of the refRate property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName8Choice }
     *     
     */
    public BenchmarkCurveName8Choice getRefRate() {
        return refRate;
    }

    /**
     * Sets the value of the refRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName8Choice }
     *     
     */
    public FloatingInterestRate16 setRefRate(BenchmarkCurveName8Choice value) {
        this.refRate = value;
        return this;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public InterestRateContractTerm2 getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public FloatingInterestRate16 setTerm(InterestRateContractTerm2 value) {
        this.term = value;
        return this;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public InterestRateContractTerm2 getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public FloatingInterestRate16 setPmtFrqcy(InterestRateContractTerm2 value) {
        this.pmtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the rstFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public InterestRateContractTerm2 getRstFrqcy() {
        return rstFrqcy;
    }

    /**
     * Sets the value of the rstFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public FloatingInterestRate16 setRstFrqcy(InterestRateContractTerm2 value) {
        this.rstFrqcy = value;
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
    public FloatingInterestRate16 setBsisPtSprd(BigDecimal value) {
        this.bsisPtSprd = value;
        return this;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat6Choice }
     *     
     */
    public InterestComputationMethodFormat6Choice getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat6Choice }
     *     
     */
    public FloatingInterestRate16 setDayCntBsis(InterestComputationMethodFormat6Choice value) {
        this.dayCntBsis = value;
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
