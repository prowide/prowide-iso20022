
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
 * Percentage of ownership or of beneficial ownership of the shares/units in the account. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnershipBeneficiaryRate1", propOrder = {
    "rate",
    "frctn"
})
public class OwnershipBeneficiaryRate1 {

    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "Frctn")
    protected String frctn;

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
    public OwnershipBeneficiaryRate1 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the frctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrctn() {
        return frctn;
    }

    /**
     * Sets the value of the frctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OwnershipBeneficiaryRate1 setFrctn(String value) {
        this.frctn = value;
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
