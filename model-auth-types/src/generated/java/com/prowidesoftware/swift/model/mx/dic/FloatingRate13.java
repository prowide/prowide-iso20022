
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
@XmlType(name = "FloatingRate13", propOrder = {
    "id",
    "nm",
    "rate",
    "refPrd",
    "sprd",
    "dayCnt",
    "pmtFrqcy",
    "rstFrqcy",
    "nxtFltgRst",
    "lastFltgRst"
})
public class FloatingRate13 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Rate")
    protected FloatingRateIdentification8Choice rate;
    @XmlElement(name = "RefPrd")
    protected InterestRateContractTerm4 refPrd;
    @XmlElement(name = "Sprd")
    protected SecuritiesTransactionPrice20Choice sprd;
    @XmlElement(name = "DayCnt")
    protected InterestComputationMethodFormat7 dayCnt;
    @XmlElement(name = "PmtFrqcy")
    protected InterestRateFrequency3Choice pmtFrqcy;
    @XmlElement(name = "RstFrqcy")
    protected InterestRateFrequency3Choice rstFrqcy;
    @XmlElement(name = "NxtFltgRst")
    protected ResetDateAndValue1 nxtFltgRst;
    @XmlElement(name = "LastFltgRst")
    protected ResetDateAndValue1 lastFltgRst;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FloatingRate13 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FloatingRate13 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateIdentification8Choice }
     *     
     */
    public FloatingRateIdentification8Choice getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateIdentification8Choice }
     *     
     */
    public FloatingRate13 setRate(FloatingRateIdentification8Choice value) {
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
    public FloatingRate13 setRefPrd(InterestRateContractTerm4 value) {
        this.refPrd = value;
        return this;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice20Choice }
     *     
     */
    public SecuritiesTransactionPrice20Choice getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice20Choice }
     *     
     */
    public FloatingRate13 setSprd(SecuritiesTransactionPrice20Choice value) {
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
    public FloatingRate13 setDayCnt(InterestComputationMethodFormat7 value) {
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
    public FloatingRate13 setPmtFrqcy(InterestRateFrequency3Choice value) {
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
    public FloatingRate13 setRstFrqcy(InterestRateFrequency3Choice value) {
        this.rstFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the nxtFltgRst property.
     * 
     * @return
     *     possible object is
     *     {@link ResetDateAndValue1 }
     *     
     */
    public ResetDateAndValue1 getNxtFltgRst() {
        return nxtFltgRst;
    }

    /**
     * Sets the value of the nxtFltgRst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetDateAndValue1 }
     *     
     */
    public FloatingRate13 setNxtFltgRst(ResetDateAndValue1 value) {
        this.nxtFltgRst = value;
        return this;
    }

    /**
     * Gets the value of the lastFltgRst property.
     * 
     * @return
     *     possible object is
     *     {@link ResetDateAndValue1 }
     *     
     */
    public ResetDateAndValue1 getLastFltgRst() {
        return lastFltgRst;
    }

    /**
     * Sets the value of the lastFltgRst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetDateAndValue1 }
     *     
     */
    public FloatingRate13 setLastFltgRst(ResetDateAndValue1 value) {
        this.lastFltgRst = value;
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
