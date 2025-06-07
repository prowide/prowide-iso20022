
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
 * Specifies the billing rate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingRate1", propOrder = {
    "id",
    "val",
    "daysInPrd",
    "daysInYr"
})
public class BillingRate1 {

    @XmlElement(name = "Id", required = true)
    protected BillingRateIdentification1Choice id;
    @XmlElement(name = "Val", required = true)
    protected BigDecimal val;
    @XmlElement(name = "DaysInPrd")
    protected BigDecimal daysInPrd;
    @XmlElement(name = "DaysInYr")
    protected BigDecimal daysInYr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BillingRateIdentification1Choice }
     *     
     */
    public BillingRateIdentification1Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingRateIdentification1Choice }
     *     
     */
    public BillingRate1 setId(BillingRateIdentification1Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BillingRate1 setVal(BigDecimal value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the daysInPrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysInPrd() {
        return daysInPrd;
    }

    /**
     * Sets the value of the daysInPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BillingRate1 setDaysInPrd(BigDecimal value) {
        this.daysInPrd = value;
        return this;
    }

    /**
     * Gets the value of the daysInYr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysInYr() {
        return daysInYr;
    }

    /**
     * Sets the value of the daysInYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BillingRate1 setDaysInYr(BigDecimal value) {
        this.daysInYr = value;
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
