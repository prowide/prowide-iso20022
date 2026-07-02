
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of format for the settlement date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDate8Choice", propOrder = {
    "dt",
    "cd"
})
public class SettlementDate8Choice {

    @XmlElement(name = "Dt")
    protected DateAndDateTime1Choice dt;
    @XmlElement(name = "Cd")
    protected SettlementDateCode5Choice cd;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public SettlementDate8Choice setDt(DateAndDateTime1Choice value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDateCode5Choice }
     *     
     */
    public SettlementDateCode5Choice getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDateCode5Choice }
     *     
     */
    public SettlementDate8Choice setCd(SettlementDateCode5Choice value) {
        this.cd = value;
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
