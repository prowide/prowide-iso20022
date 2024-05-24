
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
 * Detailed information on rejections for derivatives submitted to trade repositories and failed to pass validations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionStatistics3", propOrder = {
    "ttlNbOfTechRjctns",
    "derivsSttstcs"
})
public class RejectionStatistics3 {

    @XmlElement(name = "TtlNbOfTechRjctns", required = true)
    protected BigDecimal ttlNbOfTechRjctns;
    @XmlElement(name = "DerivsSttstcs", required = true)
    protected DerivativesStatistics3 derivsSttstcs;

    /**
     * Gets the value of the ttlNbOfTechRjctns property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfTechRjctns() {
        return ttlNbOfTechRjctns;
    }

    /**
     * Sets the value of the ttlNbOfTechRjctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RejectionStatistics3 setTtlNbOfTechRjctns(BigDecimal value) {
        this.ttlNbOfTechRjctns = value;
        return this;
    }

    /**
     * Gets the value of the derivsSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesStatistics3 }
     *     
     */
    public DerivativesStatistics3 getDerivsSttstcs() {
        return derivsSttstcs;
    }

    /**
     * Sets the value of the derivsSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesStatistics3 }
     *     
     */
    public RejectionStatistics3 setDerivsSttstcs(DerivativesStatistics3 value) {
        this.derivsSttstcs = value;
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
