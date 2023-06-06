
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
 * Market maker profile.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketMakerProfile2", propOrder = {
    "ctrctPrd",
    "cmplc",
    "maxSprd",
    "dscnt"
})
public class MarketMakerProfile2 {

    @XmlElement(name = "CtrctPrd")
    protected DateTimePeriod2 ctrctPrd;
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
     *     {@link DateTimePeriod2 }
     *     
     */
    public DateTimePeriod2 getCtrctPrd() {
        return ctrctPrd;
    }

    /**
     * Sets the value of the ctrctPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod2 }
     *     
     */
    public MarketMakerProfile2 setCtrctPrd(DateTimePeriod2 value) {
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
    public MarketMakerProfile2 setCmplc(Boolean value) {
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
    public MarketMakerProfile2 setMaxSprd(BigDecimal value) {
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
    public MarketMakerProfile2 setDscnt(BigDecimal value) {
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
