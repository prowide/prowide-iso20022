
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
 * Non-enforcement of the right to all or part of a commission by the party entitled to the commission.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionWaiver2", propOrder = {
    "instrBsis",
    "wvdRate"
})
public class CommissionWaiver2 {

    @XmlElement(name = "InstrBsis", required = true)
    protected WaivingType1 instrBsis;
    @XmlElement(name = "WvdRate", required = true)
    protected BigDecimal wvdRate;

    /**
     * Gets the value of the instrBsis property.
     * 
     * @return
     *     possible object is
     *     {@link WaivingType1 }
     *     
     */
    public WaivingType1 getInstrBsis() {
        return instrBsis;
    }

    /**
     * Sets the value of the instrBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaivingType1 }
     *     
     */
    public CommissionWaiver2 setInstrBsis(WaivingType1 value) {
        this.instrBsis = value;
        return this;
    }

    /**
     * Gets the value of the wvdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWvdRate() {
        return wvdRate;
    }

    /**
     * Sets the value of the wvdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CommissionWaiver2 setWvdRate(BigDecimal value) {
        this.wvdRate = value;
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
