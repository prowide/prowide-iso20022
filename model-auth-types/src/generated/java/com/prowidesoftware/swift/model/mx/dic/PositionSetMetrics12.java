
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
@XmlType(name = "PositionSetMetrics12", propOrder = {
    "volMtrcs",
    "hrcutOrMrgn",
    "qtyOrNmnlAmt"
})
public class PositionSetMetrics12 {

    @XmlElement(name = "VolMtrcs")
    protected VolumeMetrics6 volMtrcs;
    @XmlElement(name = "HrcutOrMrgn")
    protected BigDecimal hrcutOrMrgn;
    @XmlElement(name = "QtyOrNmnlAmt")
    protected QuantityNominalValue2Choice qtyOrNmnlAmt;

    /**
     * Gets the value of the volMtrcs property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMetrics6 }
     *     
     */
    public VolumeMetrics6 getVolMtrcs() {
        return volMtrcs;
    }

    /**
     * Sets the value of the volMtrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMetrics6 }
     *     
     */
    public PositionSetMetrics12 setVolMtrcs(VolumeMetrics6 value) {
        this.volMtrcs = value;
        return this;
    }

    /**
     * Gets the value of the hrcutOrMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcutOrMrgn() {
        return hrcutOrMrgn;
    }

    /**
     * Sets the value of the hrcutOrMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PositionSetMetrics12 setHrcutOrMrgn(BigDecimal value) {
        this.hrcutOrMrgn = value;
        return this;
    }

    /**
     * Gets the value of the qtyOrNmnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityNominalValue2Choice }
     *     
     */
    public QuantityNominalValue2Choice getQtyOrNmnlAmt() {
        return qtyOrNmnlAmt;
    }

    /**
     * Sets the value of the qtyOrNmnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityNominalValue2Choice }
     *     
     */
    public PositionSetMetrics12 setQtyOrNmnlAmt(QuantityNominalValue2Choice value) {
        this.qtyOrNmnlAmt = value;
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
