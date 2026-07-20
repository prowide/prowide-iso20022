
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
 * Total quantity of securities to be transferred, expressed in a number of units or a percentage rate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity82Choice", propOrder = {
    "ttlUnitsNb",
    "trfRate"
})
public class Quantity82Choice {

    @XmlElement(name = "TtlUnitsNb")
    protected Unit1Choice ttlUnitsNb;
    @XmlElement(name = "TrfRate")
    protected BigDecimal trfRate;

    /**
     * Gets the value of the ttlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link Unit1Choice }
     *     
     */
    public Unit1Choice getTtlUnitsNb() {
        return ttlUnitsNb;
    }

    /**
     * Sets the value of the ttlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unit1Choice }
     *     
     */
    public Quantity82Choice setTtlUnitsNb(Unit1Choice value) {
        this.ttlUnitsNb = value;
        return this;
    }

    /**
     * Gets the value of the trfRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrfRate() {
        return trfRate;
    }

    /**
     * Sets the value of the trfRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Quantity82Choice setTrfRate(BigDecimal value) {
        this.trfRate = value;
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
