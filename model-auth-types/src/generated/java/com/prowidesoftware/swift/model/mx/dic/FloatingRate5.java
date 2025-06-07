
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
 * Floating rate related information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingRate5", propOrder = {
    "rate",
    "refPrd",
    "sprd",
    "pmtFrqcy",
    "rstFrqcy"
})
public class FloatingRate5 {

    @XmlElement(name = "Rate")
    protected FloatingRateIdentification3Choice rate;
    @XmlElement(name = "RefPrd")
    protected InterestRateContractTerm3 refPrd;
    @XmlElement(name = "Sprd")
    protected BigDecimal sprd;
    @XmlElement(name = "PmtFrqcy")
    protected InterestRateFrequency2Choice pmtFrqcy;
    @XmlElement(name = "RstFrqcy")
    protected InterestRateFrequency2Choice rstFrqcy;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateIdentification3Choice }
     *     
     */
    public FloatingRateIdentification3Choice getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateIdentification3Choice }
     *     
     */
    public FloatingRate5 setRate(FloatingRateIdentification3Choice value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the refPrd property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateContractTerm3 }
     *     
     */
    public InterestRateContractTerm3 getRefPrd() {
        return refPrd;
    }

    /**
     * Sets the value of the refPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateContractTerm3 }
     *     
     */
    public FloatingRate5 setRefPrd(InterestRateContractTerm3 value) {
        this.refPrd = value;
        return this;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FloatingRate5 setSprd(BigDecimal value) {
        this.sprd = value;
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
    public FloatingRate5 setPmtFrqcy(InterestRateFrequency2Choice value) {
        this.pmtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the rstFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateFrequency2Choice }
     *     
     */
    public InterestRateFrequency2Choice getRstFrqcy() {
        return rstFrqcy;
    }

    /**
     * Sets the value of the rstFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateFrequency2Choice }
     *     
     */
    public FloatingRate5 setRstFrqcy(InterestRateFrequency2Choice value) {
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
