
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides the index used to define the rate and the basis point spread.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingInterestRate12", propOrder = {
    "refRate",
    "term",
    "pmtFrqcy",
    "rstFrqcy",
    "bsisPtSprd",
    "rateAdjstmnt",
    "dayCntBsis"
})
public class FloatingInterestRate12 {

    @XmlElement(name = "RefRate", required = true)
    protected BenchmarkCurveName8Choice refRate;
    @XmlElement(name = "Term", required = true)
    protected InterestRateContractTerm2 term;
    @XmlElement(name = "PmtFrqcy", required = true)
    protected InterestRateContractTerm2 pmtFrqcy;
    @XmlElement(name = "RstFrqcy", required = true)
    protected InterestRateContractTerm2 rstFrqcy;
    @XmlElement(name = "BsisPtSprd", required = true)
    protected BigDecimal bsisPtSprd;
    @XmlElement(name = "RateAdjstmnt")
    protected List<RateAdjustment1> rateAdjstmnt;
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
    public FloatingInterestRate12 setRefRate(BenchmarkCurveName8Choice value) {
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
    public FloatingInterestRate12 setTerm(InterestRateContractTerm2 value) {
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
    public FloatingInterestRate12 setPmtFrqcy(InterestRateContractTerm2 value) {
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
    public FloatingInterestRate12 setRstFrqcy(InterestRateContractTerm2 value) {
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
    public FloatingInterestRate12 setBsisPtSprd(BigDecimal value) {
        this.bsisPtSprd = value;
        return this;
    }

    /**
     * Gets the value of the rateAdjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateAdjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAdjustment1 }
     * 
     * 
     */
    public List<RateAdjustment1> getRateAdjstmnt() {
        if (rateAdjstmnt == null) {
            rateAdjstmnt = new ArrayList<RateAdjustment1>();
        }
        return this.rateAdjstmnt;
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
    public FloatingInterestRate12 setDayCntBsis(InterestComputationMethodFormat6Choice value) {
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

    /**
     * Adds a new item to the rateAdjstmnt list.
     * @see #getRateAdjstmnt()
     * 
     */
    public FloatingInterestRate12 addRateAdjstmnt(RateAdjustment1 rateAdjstmnt) {
        getRateAdjstmnt().add(rateAdjstmnt);
        return this;
    }

}
