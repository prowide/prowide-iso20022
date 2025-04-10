
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
 * Non-enforcement of the right to all or part of a commission by the party entitled to the commission.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionWaiver4", propOrder = {
    "instrBsis",
    "wvdRate"
})
public class CommissionWaiver4 {

    @XmlElement(name = "InstrBsis", required = true)
    protected WaivingInstruction1Choice instrBsis;
    @XmlElement(name = "WvdRate", required = true)
    protected BigDecimal wvdRate;

    /**
     * Gets the value of the instrBsis property.
     * 
     * @return
     *     possible object is
     *     {@link WaivingInstruction1Choice }
     *     
     */
    public WaivingInstruction1Choice getInstrBsis() {
        return instrBsis;
    }

    /**
     * Sets the value of the instrBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaivingInstruction1Choice }
     *     
     */
    public CommissionWaiver4 setInstrBsis(WaivingInstruction1Choice value) {
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
    public CommissionWaiver4 setWvdRate(BigDecimal value) {
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
