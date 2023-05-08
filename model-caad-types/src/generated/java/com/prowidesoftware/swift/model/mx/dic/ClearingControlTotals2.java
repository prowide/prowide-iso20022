
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
 * Gross clearing control totals.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingControlTotals2", propOrder = {
    "clrCtrlCnt",
    "clrCtrlAmt"
})
public class ClearingControlTotals2 {

    @XmlElement(name = "ClrCtrlCnt", required = true)
    protected BigDecimal clrCtrlCnt;
    @XmlElement(name = "ClrCtrlAmt", required = true)
    protected Amount17 clrCtrlAmt;

    /**
     * Gets the value of the clrCtrlCnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClrCtrlCnt() {
        return clrCtrlCnt;
    }

    /**
     * Sets the value of the clrCtrlCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ClearingControlTotals2 setClrCtrlCnt(BigDecimal value) {
        this.clrCtrlCnt = value;
        return this;
    }

    /**
     * Gets the value of the clrCtrlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getClrCtrlAmt() {
        return clrCtrlAmt;
    }

    /**
     * Sets the value of the clrCtrlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public ClearingControlTotals2 setClrCtrlAmt(Amount17 value) {
        this.clrCtrlAmt = value;
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
