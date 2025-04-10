
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
 * Choice between a percentage and number for a threshold.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOrPercentage1Choice", propOrder = {
    "thrshldPctg",
    "thrshldNb"
})
public class NumberOrPercentage1Choice {

    @XmlElement(name = "ThrshldPctg")
    protected BigDecimal thrshldPctg;
    @XmlElement(name = "ThrshldNb")
    protected BigDecimal thrshldNb;

    /**
     * Gets the value of the thrshldPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThrshldPctg() {
        return thrshldPctg;
    }

    /**
     * Sets the value of the thrshldPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public NumberOrPercentage1Choice setThrshldPctg(BigDecimal value) {
        this.thrshldPctg = value;
        return this;
    }

    /**
     * Gets the value of the thrshldNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThrshldNb() {
        return thrshldNb;
    }

    /**
     * Sets the value of the thrshldNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public NumberOrPercentage1Choice setThrshldNb(BigDecimal value) {
        this.thrshldNb = value;
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
