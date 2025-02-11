
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the pricing expressed as a rate type or a rate name complemented with lookback and crystallization days.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateTypeAndLookback2", propOrder = {
    "tp",
    "lookBckDays",
    "crstllstnDt",
    "tnr",
    "ccy"
})
public class RateTypeAndLookback2 {

    @XmlElement(name = "Tp", required = true)
    protected BenchmarkCurveName13Choice tp;
    @XmlElement(name = "LookBckDays")
    protected String lookBckDays;
    @XmlElement(name = "CrstllstnDt")
    protected CrystallisationDay1 crstllstnDt;
    @XmlElement(name = "Tnr")
    @XmlSchemaType(name = "string")
    protected InterestRateIndexTenor2Code tnr;
    @XmlElement(name = "Ccy")
    protected String ccy;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName13Choice }
     *     
     */
    public BenchmarkCurveName13Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName13Choice }
     *     
     */
    public RateTypeAndLookback2 setTp(BenchmarkCurveName13Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the lookBckDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookBckDays() {
        return lookBckDays;
    }

    /**
     * Sets the value of the lookBckDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RateTypeAndLookback2 setLookBckDays(String value) {
        this.lookBckDays = value;
        return this;
    }

    /**
     * Gets the value of the crstllstnDt property.
     * 
     * @return
     *     possible object is
     *     {@link CrystallisationDay1 }
     *     
     */
    public CrystallisationDay1 getCrstllstnDt() {
        return crstllstnDt;
    }

    /**
     * Sets the value of the crstllstnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrystallisationDay1 }
     *     
     */
    public RateTypeAndLookback2 setCrstllstnDt(CrystallisationDay1 value) {
        this.crstllstnDt = value;
        return this;
    }

    /**
     * Gets the value of the tnr property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateIndexTenor2Code }
     *     
     */
    public InterestRateIndexTenor2Code getTnr() {
        return tnr;
    }

    /**
     * Sets the value of the tnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateIndexTenor2Code }
     *     
     */
    public RateTypeAndLookback2 setTnr(InterestRateIndexTenor2Code value) {
        this.tnr = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RateTypeAndLookback2 setCcy(String value) {
        this.ccy = value;
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
