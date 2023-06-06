
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
 * Distance between a start and a return car rental period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Distance1", propOrder = {
    "unitOfMeasr",
    "odmtrStart",
    "odmtrRtr",
    "ttlDstnc",
    "freeDstnc",
    "rate"
})
public class Distance1 {

    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure10Code unitOfMeasr;
    @XmlElement(name = "OdmtrStart")
    protected String odmtrStart;
    @XmlElement(name = "OdmtrRtr")
    protected String odmtrRtr;
    @XmlElement(name = "TtlDstnc")
    protected String ttlDstnc;
    @XmlElement(name = "FreeDstnc")
    protected String freeDstnc;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure10Code }
     *     
     */
    public UnitOfMeasure10Code getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure10Code }
     *     
     */
    public Distance1 setUnitOfMeasr(UnitOfMeasure10Code value) {
        this.unitOfMeasr = value;
        return this;
    }

    /**
     * Gets the value of the odmtrStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdmtrStart() {
        return odmtrStart;
    }

    /**
     * Sets the value of the odmtrStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Distance1 setOdmtrStart(String value) {
        this.odmtrStart = value;
        return this;
    }

    /**
     * Gets the value of the odmtrRtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdmtrRtr() {
        return odmtrRtr;
    }

    /**
     * Sets the value of the odmtrRtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Distance1 setOdmtrRtr(String value) {
        this.odmtrRtr = value;
        return this;
    }

    /**
     * Gets the value of the ttlDstnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlDstnc() {
        return ttlDstnc;
    }

    /**
     * Sets the value of the ttlDstnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Distance1 setTtlDstnc(String value) {
        this.ttlDstnc = value;
        return this;
    }

    /**
     * Gets the value of the freeDstnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeDstnc() {
        return freeDstnc;
    }

    /**
     * Sets the value of the freeDstnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Distance1 setFreeDstnc(String value) {
        this.freeDstnc = value;
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
    public Distance1 setRate(BigDecimal value) {
        this.rate = value;
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
