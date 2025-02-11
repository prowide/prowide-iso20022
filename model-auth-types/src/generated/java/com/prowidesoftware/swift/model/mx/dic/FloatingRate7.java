
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
 * Floating rate related information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingRate7", propOrder = {
    "rate",
    "refPrd",
    "sprd",
    "dayCnt",
    "pmtFrqcy",
    "rstFrqcy"
})
public class FloatingRate7 {

    @XmlElement(name = "Rate")
    protected FloatingRateIdentification4Choice rate;
    @XmlElement(name = "RefPrd")
    protected InterestRateContractTerm4 refPrd;
    @XmlElement(name = "Sprd")
    protected SecuritiesTransactionPrice13Choice sprd;
    @XmlElement(name = "DayCnt")
    protected InterestComputationMethodFormat7 dayCnt;
    @XmlElement(name = "PmtFrqcy")
    protected InterestRateFrequency3Choice pmtFrqcy;
    @XmlElement(name = "RstFrqcy")
    protected InterestRateFrequency3Choice rstFrqcy;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateIdentification4Choice }
     *     
     */
    public FloatingRateIdentification4Choice getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateIdentification4Choice }
     *     
     */
    public FloatingRate7 setRate(FloatingRateIdentification4Choice value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the refPrd property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateContractTerm4 }
     *     
     */
    public InterestRateContractTerm4 getRefPrd() {
        return refPrd;
    }

    /**
     * Sets the value of the refPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateContractTerm4 }
     *     
     */
    public FloatingRate7 setRefPrd(InterestRateContractTerm4 value) {
        this.refPrd = value;
        return this;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice13Choice }
     *     
     */
    public SecuritiesTransactionPrice13Choice getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice13Choice }
     *     
     */
    public FloatingRate7 setSprd(SecuritiesTransactionPrice13Choice value) {
        this.sprd = value;
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
    public FloatingRate7 setDayCnt(InterestComputationMethodFormat7 value) {
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
    public FloatingRate7 setPmtFrqcy(InterestRateFrequency3Choice value) {
        this.pmtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the rstFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateFrequency3Choice }
     *     
     */
    public InterestRateFrequency3Choice getRstFrqcy() {
        return rstFrqcy;
    }

    /**
     * Sets the value of the rstFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateFrequency3Choice }
     *     
     */
    public FloatingRate7 setRstFrqcy(InterestRateFrequency3Choice value) {
        this.rstFrqcy = value;
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
