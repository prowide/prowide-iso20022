
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
 * Market maker profile.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketMakerProfile1", propOrder = {
    "ctrctPrd",
    "cmplc",
    "maxSprd",
    "dscnt"
})
public class MarketMakerProfile1 {

    @XmlElement(name = "CtrctPrd")
    protected DateTimePeriodDetails1 ctrctPrd;
    @XmlElement(name = "Cmplc")
    protected Boolean cmplc;
    @XmlElement(name = "MaxSprd")
    protected BigDecimal maxSprd;
    @XmlElement(name = "Dscnt")
    protected BigDecimal dscnt;

    /**
     * Gets the value of the ctrctPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetails1 }
     *     
     */
    public DateTimePeriodDetails1 getCtrctPrd() {
        return ctrctPrd;
    }

    /**
     * Sets the value of the ctrctPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails1 }
     *     
     */
    public MarketMakerProfile1 setCtrctPrd(DateTimePeriodDetails1 value) {
        this.ctrctPrd = value;
        return this;
    }

    /**
     * Gets the value of the cmplc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCmplc() {
        return cmplc;
    }

    /**
     * Sets the value of the cmplc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MarketMakerProfile1 setCmplc(Boolean value) {
        this.cmplc = value;
        return this;
    }

    /**
     * Gets the value of the maxSprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxSprd() {
        return maxSprd;
    }

    /**
     * Sets the value of the maxSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MarketMakerProfile1 setMaxSprd(BigDecimal value) {
        this.maxSprd = value;
        return this;
    }

    /**
     * Gets the value of the dscnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDscnt() {
        return dscnt;
    }

    /**
     * Sets the value of the dscnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MarketMakerProfile1 setDscnt(BigDecimal value) {
        this.dscnt = value;
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
