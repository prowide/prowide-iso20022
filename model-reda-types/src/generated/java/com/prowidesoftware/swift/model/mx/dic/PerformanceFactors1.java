
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
 * Performance factors of the investment fund / fund class.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceFactors1", propOrder = {
    "corpActnFctr",
    "cmltvCorpActnFctr",
    "acmltnPrd",
    "nrmlPrfrmnc"
})
public class PerformanceFactors1 {

    @XmlElement(name = "CorpActnFctr")
    protected BigDecimal corpActnFctr;
    @XmlElement(name = "CmltvCorpActnFctr")
    protected BigDecimal cmltvCorpActnFctr;
    @XmlElement(name = "AcmltnPrd")
    protected DatePeriodDetails acmltnPrd;
    @XmlElement(name = "NrmlPrfrmnc")
    protected BigDecimal nrmlPrfrmnc;

    /**
     * Gets the value of the corpActnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCorpActnFctr() {
        return corpActnFctr;
    }

    /**
     * Sets the value of the corpActnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PerformanceFactors1 setCorpActnFctr(BigDecimal value) {
        this.corpActnFctr = value;
        return this;
    }

    /**
     * Gets the value of the cmltvCorpActnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCmltvCorpActnFctr() {
        return cmltvCorpActnFctr;
    }

    /**
     * Sets the value of the cmltvCorpActnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PerformanceFactors1 setCmltvCorpActnFctr(BigDecimal value) {
        this.cmltvCorpActnFctr = value;
        return this;
    }

    /**
     * Gets the value of the acmltnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodDetails }
     *     
     */
    public DatePeriodDetails getAcmltnPrd() {
        return acmltnPrd;
    }

    /**
     * Sets the value of the acmltnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodDetails }
     *     
     */
    public PerformanceFactors1 setAcmltnPrd(DatePeriodDetails value) {
        this.acmltnPrd = value;
        return this;
    }

    /**
     * Gets the value of the nrmlPrfrmnc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNrmlPrfrmnc() {
        return nrmlPrfrmnc;
    }

    /**
     * Sets the value of the nrmlPrfrmnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PerformanceFactors1 setNrmlPrfrmnc(BigDecimal value) {
        this.nrmlPrfrmnc = value;
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
