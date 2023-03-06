
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
 * Variables used to quantify the different calculations for position sets and currency position sets reports.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetTotal1", propOrder = {
    "nbOfTrds",
    "postv",
    "neg"
})
public class PositionSetTotal1 {

    @XmlElement(name = "NbOfTrds")
    protected BigDecimal nbOfTrds;
    @XmlElement(name = "Postv")
    protected PositionSetValueAndNotional1 postv;
    @XmlElement(name = "Neg")
    protected PositionSetValueAndNotional1 neg;

    /**
     * Gets the value of the nbOfTrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfTrds() {
        return nbOfTrds;
    }

    /**
     * Sets the value of the nbOfTrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PositionSetTotal1 setNbOfTrds(BigDecimal value) {
        this.nbOfTrds = value;
        return this;
    }

    /**
     * Gets the value of the postv property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetValueAndNotional1 }
     *     
     */
    public PositionSetValueAndNotional1 getPostv() {
        return postv;
    }

    /**
     * Sets the value of the postv property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetValueAndNotional1 }
     *     
     */
    public PositionSetTotal1 setPostv(PositionSetValueAndNotional1 value) {
        this.postv = value;
        return this;
    }

    /**
     * Gets the value of the neg property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetValueAndNotional1 }
     *     
     */
    public PositionSetValueAndNotional1 getNeg() {
        return neg;
    }

    /**
     * Sets the value of the neg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetValueAndNotional1 }
     *     
     */
    public PositionSetTotal1 setNeg(PositionSetValueAndNotional1 value) {
        this.neg = value;
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
