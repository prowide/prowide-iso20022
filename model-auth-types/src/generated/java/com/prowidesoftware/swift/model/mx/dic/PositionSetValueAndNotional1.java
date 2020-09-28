
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
 * Variables used to quantify the different calculations for position sets and currency position sets reports.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetValueAndNotional1", propOrder = {
    "ntnl",
    "val"
})
public class PositionSetValueAndNotional1 {

    @XmlElement(name = "Ntnl")
    protected ActiveOrHistoricCurrencyAnd20Amount ntnl;
    @XmlElement(name = "Val")
    protected ActiveOrHistoricCurrencyAnd20Amount val;

    /**
     * Gets the value of the ntnl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20Amount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20Amount getNtnl() {
        return ntnl;
    }

    /**
     * Sets the value of the ntnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20Amount }
     *     
     */
    public PositionSetValueAndNotional1 setNtnl(ActiveOrHistoricCurrencyAnd20Amount value) {
        this.ntnl = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20Amount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20Amount getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20Amount }
     *     
     */
    public PositionSetValueAndNotional1 setVal(ActiveOrHistoricCurrencyAnd20Amount value) {
        this.val = value;
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
