
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
 * Vehicle rental rate
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RentalRate2", propOrder = {
    "prd",
    "othrPrd",
    "rate",
    "prdCnt"
})
public class RentalRate2 {

    @XmlElement(name = "Prd")
    @XmlSchemaType(name = "string")
    protected PeriodUnit4Code prd;
    @XmlElement(name = "OthrPrd")
    protected String othrPrd;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "PrdCnt")
    protected String prdCnt;

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodUnit4Code }
     *     
     */
    public PeriodUnit4Code getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodUnit4Code }
     *     
     */
    public RentalRate2 setPrd(PeriodUnit4Code value) {
        this.prd = value;
        return this;
    }

    /**
     * Gets the value of the othrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPrd() {
        return othrPrd;
    }

    /**
     * Sets the value of the othrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RentalRate2 setOthrPrd(String value) {
        this.othrPrd = value;
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
    public RentalRate2 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the prdCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdCnt() {
        return prdCnt;
    }

    /**
     * Sets the value of the prdCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RentalRate2 setPrdCnt(String value) {
        this.prdCnt = value;
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
