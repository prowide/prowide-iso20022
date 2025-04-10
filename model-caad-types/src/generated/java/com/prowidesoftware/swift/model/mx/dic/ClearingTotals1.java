
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
 * Clearing totals of the batch file.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingTotals1", propOrder = {
    "cnt",
    "acmltdAmt"
})
public class ClearingTotals1 {

    @XmlElement(name = "Cnt", required = true)
    protected BigDecimal cnt;
    @XmlElement(name = "AcmltdAmt", required = true)
    protected Amount14 acmltdAmt;

    /**
     * Gets the value of the cnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCnt() {
        return cnt;
    }

    /**
     * Sets the value of the cnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ClearingTotals1 setCnt(BigDecimal value) {
        this.cnt = value;
        return this;
    }

    /**
     * Gets the value of the acmltdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount14 }
     *     
     */
    public Amount14 getAcmltdAmt() {
        return acmltdAmt;
    }

    /**
     * Sets the value of the acmltdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount14 }
     *     
     */
    public ClearingTotals1 setAcmltdAmt(Amount14 value) {
        this.acmltdAmt = value;
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
