
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
 * Variables used to quantify the different calculations for position sets.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetMetrics11", propOrder = {
    "volMtrcs",
    "cshRinvstmtRate"
})
public class PositionSetMetrics11 {

    @XmlElement(name = "VolMtrcs")
    protected VolumeMetrics4 volMtrcs;
    @XmlElement(name = "CshRinvstmtRate")
    protected BigDecimal cshRinvstmtRate;

    /**
     * Gets the value of the volMtrcs property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMetrics4 }
     *     
     */
    public VolumeMetrics4 getVolMtrcs() {
        return volMtrcs;
    }

    /**
     * Sets the value of the volMtrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMetrics4 }
     *     
     */
    public PositionSetMetrics11 setVolMtrcs(VolumeMetrics4 value) {
        this.volMtrcs = value;
        return this;
    }

    /**
     * Gets the value of the cshRinvstmtRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCshRinvstmtRate() {
        return cshRinvstmtRate;
    }

    /**
     * Sets the value of the cshRinvstmtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PositionSetMetrics11 setCshRinvstmtRate(BigDecimal value) {
        this.cshRinvstmtRate = value;
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
