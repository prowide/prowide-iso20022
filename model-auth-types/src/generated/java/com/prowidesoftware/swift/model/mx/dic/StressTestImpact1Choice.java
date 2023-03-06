
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Quantitative results of the stress testing.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StressTestImpact1Choice", propOrder = {
    "netAsstValImpct",
    "outflwImpct",
    "notAvlblVal"
})
public class StressTestImpact1Choice {

    @XmlElement(name = "NetAsstValImpct")
    protected BigDecimal netAsstValImpct;
    @XmlElement(name = "OutflwImpct")
    protected OutflowImpact1 outflwImpct;
    @XmlElement(name = "NotAvlblVal")
    @XmlSchemaType(name = "string")
    protected NotAvailable1Code notAvlblVal;

    /**
     * Gets the value of the netAsstValImpct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAsstValImpct() {
        return netAsstValImpct;
    }

    /**
     * Sets the value of the netAsstValImpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public StressTestImpact1Choice setNetAsstValImpct(BigDecimal value) {
        this.netAsstValImpct = value;
        return this;
    }

    /**
     * Gets the value of the outflwImpct property.
     * 
     * @return
     *     possible object is
     *     {@link OutflowImpact1 }
     *     
     */
    public OutflowImpact1 getOutflwImpct() {
        return outflwImpct;
    }

    /**
     * Sets the value of the outflwImpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutflowImpact1 }
     *     
     */
    public StressTestImpact1Choice setOutflwImpct(OutflowImpact1 value) {
        this.outflwImpct = value;
        return this;
    }

    /**
     * Gets the value of the notAvlblVal property.
     * 
     * @return
     *     possible object is
     *     {@link NotAvailable1Code }
     *     
     */
    public NotAvailable1Code getNotAvlblVal() {
        return notAvlblVal;
    }

    /**
     * Sets the value of the notAvlblVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotAvailable1Code }
     *     
     */
    public StressTestImpact1Choice setNotAvlblVal(NotAvailable1Code value) {
        this.notAvlblVal = value;
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
