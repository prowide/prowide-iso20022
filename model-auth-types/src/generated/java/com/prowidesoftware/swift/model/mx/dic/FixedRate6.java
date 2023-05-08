
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
 * Fixed rate related information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedRate6", propOrder = {
    "rate",
    "dayCnt",
    "pmtFrqcy"
})
public class FixedRate6 {

    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "DayCnt")
    protected String dayCnt;
    @XmlElement(name = "PmtFrqcy")
    protected InterestRateFrequency2Choice pmtFrqcy;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FixedRate6 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the dayCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayCnt() {
        return dayCnt;
    }

    /**
     * Sets the value of the dayCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FixedRate6 setDayCnt(String value) {
        this.dayCnt = value;
        return this;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateFrequency2Choice }
     *     
     */
    public InterestRateFrequency2Choice getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateFrequency2Choice }
     *     
     */
    public FixedRate6 setPmtFrqcy(InterestRateFrequency2Choice value) {
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
