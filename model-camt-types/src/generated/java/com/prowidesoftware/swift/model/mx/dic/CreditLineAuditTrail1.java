
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details on the credit line audit trail.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditLineAuditTrail1", propOrder = {
    "tp",
    "amt",
    "dt"
})
public class CreditLineAuditTrail1 {

    @XmlElement(name = "Tp")
    protected UpdateLogCreditLineType1 tp;
    @XmlElement(name = "Amt")
    protected UpdateLogAmount1Choice amt;
    @XmlElement(name = "Dt")
    protected UpdateLogDateTime1Choice dt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogCreditLineType1 }
     *     
     */
    public UpdateLogCreditLineType1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogCreditLineType1 }
     *     
     */
    public CreditLineAuditTrail1 setTp(UpdateLogCreditLineType1 value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogAmount1Choice }
     *     
     */
    public UpdateLogAmount1Choice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogAmount1Choice }
     *     
     */
    public CreditLineAuditTrail1 setAmt(UpdateLogAmount1Choice value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogDateTime1Choice }
     *     
     */
    public UpdateLogDateTime1Choice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogDateTime1Choice }
     *     
     */
    public CreditLineAuditTrail1 setDt(UpdateLogDateTime1Choice value) {
        this.dt = value;
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
