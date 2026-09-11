
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Contains amount details for a specific type of charge in the temproary service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporaryServiceChargeRate1", propOrder = {
    "tp",
    "rate",
    "hrs"
})
public class TemporaryServiceChargeRate1 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TemporaryServicesCharge2Code tp;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "Hrs")
    protected String hrs;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryServicesCharge2Code }
     *     
     */
    public TemporaryServicesCharge2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryServicesCharge2Code }
     *     
     */
    public TemporaryServiceChargeRate1 setTp(TemporaryServicesCharge2Code value) {
        this.tp = value;
        return this;
    }

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
    public TemporaryServiceChargeRate1 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the hrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHrs() {
        return hrs;
    }

    /**
     * Sets the value of the hrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServiceChargeRate1 setHrs(String value) {
        this.hrs = value;
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
