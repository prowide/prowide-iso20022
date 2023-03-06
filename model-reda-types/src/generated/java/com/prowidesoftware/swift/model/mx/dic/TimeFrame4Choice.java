
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
 * TimeFrame elements that define a period as number of days after an activity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeFrame4Choice", propOrder = {
    "tPlus",
    "rPlus"
})
public class TimeFrame4Choice {

    @XmlElement(name = "TPlus")
    protected BigDecimal tPlus;
    @XmlElement(name = "RPlus")
    protected BigDecimal rPlus;

    /**
     * Gets the value of the tPlus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTPlus() {
        return tPlus;
    }

    /**
     * Sets the value of the tPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TimeFrame4Choice setTPlus(BigDecimal value) {
        this.tPlus = value;
        return this;
    }

    /**
     * Gets the value of the rPlus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRPlus() {
        return rPlus;
    }

    /**
     * Sets the value of the rPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TimeFrame4Choice setRPlus(BigDecimal value) {
        this.rPlus = value;
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
