
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
 * Specifies whether the values defined as part of the Margin Loan Attribute are matching or not.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompareInterestRate1", propOrder = {
    "mrgnLnAmt",
    "fxdIntrstRate",
    "dayCntBsis",
    "fltgIntrstRefRate",
    "fltgIntrstRateTermUnit",
    "fltgIntrstRateTermVal",
    "fltgIntrstRatePmtFrqcyUnit",
    "fltgIntrstRatePmtFrqcyVal",
    "fltgIntrstRateRstFrqcyUnit",
    "fltgIntrstRateRstFrqcyVal",
    "bsisPtSprd"
})
public class CompareInterestRate1 {

    @XmlElement(name = "MrgnLnAmt")
    protected CompareAmountAndDirection1 mrgnLnAmt;
    @XmlElement(name = "FxdIntrstRate")
    protected ComparePercentageRate3 fxdIntrstRate;
    @XmlElement(name = "DayCntBsis")
    protected CompareInterestComputationMethod3 dayCntBsis;
    @XmlElement(name = "FltgIntrstRefRate")
    protected CompareBenchmarkCurveName3 fltgIntrstRefRate;
    @XmlElement(name = "FltgIntrstRateTermUnit")
    protected CompareRateBasis3 fltgIntrstRateTermUnit;
    @XmlElement(name = "FltgIntrstRateTermVal")
    protected CompareNumber5 fltgIntrstRateTermVal;
    @XmlElement(name = "FltgIntrstRatePmtFrqcyUnit")
    protected CompareRateBasis3 fltgIntrstRatePmtFrqcyUnit;
    @XmlElement(name = "FltgIntrstRatePmtFrqcyVal")
    protected CompareNumber5 fltgIntrstRatePmtFrqcyVal;
    @XmlElement(name = "FltgIntrstRateRstFrqcyUnit")
    protected CompareRateBasis3 fltgIntrstRateRstFrqcyUnit;
    @XmlElement(name = "FltgIntrstRateRstFrqcyVal")
    protected CompareNumber6 fltgIntrstRateRstFrqcyVal;
    @XmlElement(name = "BsisPtSprd")
    protected CompareDecimalNumber3 bsisPtSprd;

    /**
     * Gets the value of the mrgnLnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection1 }
     *     
     */
    public CompareAmountAndDirection1 getMrgnLnAmt() {
        return mrgnLnAmt;
    }

    /**
     * Sets the value of the mrgnLnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection1 }
     *     
     */
    public CompareInterestRate1 setMrgnLnAmt(CompareAmountAndDirection1 value) {
        this.mrgnLnAmt = value;
        return this;
    }

    /**
     * Gets the value of the fxdIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public ComparePercentageRate3 getFxdIntrstRate() {
        return fxdIntrstRate;
    }

    /**
     * Sets the value of the fxdIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public CompareInterestRate1 setFxdIntrstRate(ComparePercentageRate3 value) {
        this.fxdIntrstRate = value;
        return this;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link CompareInterestComputationMethod3 }
     *     
     */
    public CompareInterestComputationMethod3 getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareInterestComputationMethod3 }
     *     
     */
    public CompareInterestRate1 setDayCntBsis(CompareInterestComputationMethod3 value) {
        this.dayCntBsis = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRefRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompareBenchmarkCurveName3 }
     *     
     */
    public CompareBenchmarkCurveName3 getFltgIntrstRefRate() {
        return fltgIntrstRefRate;
    }

    /**
     * Sets the value of the fltgIntrstRefRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareBenchmarkCurveName3 }
     *     
     */
    public CompareInterestRate1 setFltgIntrstRefRate(CompareBenchmarkCurveName3 value) {
        this.fltgIntrstRefRate = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgIntrstRateTermUnit() {
        return fltgIntrstRateTermUnit;
    }

    /**
     * Sets the value of the fltgIntrstRateTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareInterestRate1 setFltgIntrstRateTermUnit(CompareRateBasis3 value) {
        this.fltgIntrstRateTermUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateTermVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getFltgIntrstRateTermVal() {
        return fltgIntrstRateTermVal;
    }

    /**
     * Sets the value of the fltgIntrstRateTermVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareInterestRate1 setFltgIntrstRateTermVal(CompareNumber5 value) {
        this.fltgIntrstRateTermVal = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRatePmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgIntrstRatePmtFrqcyUnit() {
        return fltgIntrstRatePmtFrqcyUnit;
    }

    /**
     * Sets the value of the fltgIntrstRatePmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareInterestRate1 setFltgIntrstRatePmtFrqcyUnit(CompareRateBasis3 value) {
        this.fltgIntrstRatePmtFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRatePmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getFltgIntrstRatePmtFrqcyVal() {
        return fltgIntrstRatePmtFrqcyVal;
    }

    /**
     * Sets the value of the fltgIntrstRatePmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareInterestRate1 setFltgIntrstRatePmtFrqcyVal(CompareNumber5 value) {
        this.fltgIntrstRatePmtFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateRstFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgIntrstRateRstFrqcyUnit() {
        return fltgIntrstRateRstFrqcyUnit;
    }

    /**
     * Sets the value of the fltgIntrstRateRstFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareInterestRate1 setFltgIntrstRateRstFrqcyUnit(CompareRateBasis3 value) {
        this.fltgIntrstRateRstFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateRstFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber6 }
     *     
     */
    public CompareNumber6 getFltgIntrstRateRstFrqcyVal() {
        return fltgIntrstRateRstFrqcyVal;
    }

    /**
     * Sets the value of the fltgIntrstRateRstFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber6 }
     *     
     */
    public CompareInterestRate1 setFltgIntrstRateRstFrqcyVal(CompareNumber6 value) {
        this.fltgIntrstRateRstFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the bsisPtSprd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public CompareDecimalNumber3 getBsisPtSprd() {
        return bsisPtSprd;
    }

    /**
     * Sets the value of the bsisPtSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public CompareInterestRate1 setBsisPtSprd(CompareDecimalNumber3 value) {
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
