
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
 * Choice of formats for a time horizon.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeHorizon1Choice", propOrder = {
    "nbOfYrs",
    "tmFrame"
})
public class TimeHorizon1Choice {

    @XmlElement(name = "NbOfYrs")
    protected BigDecimal nbOfYrs;
    @XmlElement(name = "TmFrame")
    protected TimeFrame6Choice tmFrame;

    /**
     * Gets the value of the nbOfYrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfYrs() {
        return nbOfYrs;
    }

    /**
     * Sets the value of the nbOfYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TimeHorizon1Choice setNbOfYrs(BigDecimal value) {
        this.nbOfYrs = value;
        return this;
    }

    /**
     * Gets the value of the tmFrame property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrame6Choice }
     *     
     */
    public TimeFrame6Choice getTmFrame() {
        return tmFrame;
    }

    /**
     * Sets the value of the tmFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrame6Choice }
     *     
     */
    public TimeHorizon1Choice setTmFrame(TimeFrame6Choice value) {
        this.tmFrame = value;
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
