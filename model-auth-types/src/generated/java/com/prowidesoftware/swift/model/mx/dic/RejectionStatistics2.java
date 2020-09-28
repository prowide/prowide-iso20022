
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
 * Detailed information on rejections for derivatives submitted to trade repositiories and failed to pass validations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionStatistics2", propOrder = {
    "ttlNbOfTechRjctns",
    "derivsSttstcs"
})
public class RejectionStatistics2 {

    @XmlElement(name = "TtlNbOfTechRjctns", required = true)
    protected BigDecimal ttlNbOfTechRjctns;
    @XmlElement(name = "DerivsSttstcs", required = true)
    protected DerivativesStatistics2 derivsSttstcs;

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
    public RejectionStatistics2 setTtlNbOfTechRjctns(BigDecimal value) {
        this.ttlNbOfTechRjctns = value;
        return this;
    }

    /**
     * Gets the value of the derivsSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesStatistics2 }
     *     
     */
    public DerivativesStatistics2 getDerivsSttstcs() {
        return derivsSttstcs;
    }

    /**
     * Sets the value of the derivsSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesStatistics2 }
     *     
     */
    public RejectionStatistics2 setDerivsSttstcs(DerivativesStatistics2 value) {
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
