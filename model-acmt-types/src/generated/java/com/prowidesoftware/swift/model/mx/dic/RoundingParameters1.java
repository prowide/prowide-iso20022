
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
 * Parameters applied to a fractional number.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoundingParameters1", propOrder = {
    "rndgMdlus",
    "rndgDrctn"
})
public class RoundingParameters1 {

    @XmlElement(name = "RndgMdlus")
    protected BigDecimal rndgMdlus;
    @XmlElement(name = "RndgDrctn", required = true)
    @XmlSchemaType(name = "string")
    protected RoundingDirection1Code rndgDrctn;

    /**
     * Gets the value of the rndgMdlus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRndgMdlus() {
        return rndgMdlus;
    }

    /**
     * Sets the value of the rndgMdlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RoundingParameters1 setRndgMdlus(BigDecimal value) {
        this.rndgMdlus = value;
        return this;
    }

    /**
     * Gets the value of the rndgDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingDirection1Code }
     *     
     */
    public RoundingDirection1Code getRndgDrctn() {
        return rndgDrctn;
    }

    /**
     * Sets the value of the rndgDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingDirection1Code }
     *     
     */
    public RoundingParameters1 setRndgDrctn(RoundingDirection1Code value) {
        this.rndgDrctn = value;
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
