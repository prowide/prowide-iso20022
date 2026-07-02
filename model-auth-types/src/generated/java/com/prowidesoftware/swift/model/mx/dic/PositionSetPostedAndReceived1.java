
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
@XmlType(name = "PositionSetPostedAndReceived1", propOrder = {
    "pstd",
    "rcvd"
})
public class PositionSetPostedAndReceived1 {

    @XmlElement(name = "Pstd")
    protected ActiveOrHistoricCurrencyAnd20Amount pstd;
    @XmlElement(name = "Rcvd")
    protected ActiveOrHistoricCurrencyAnd20Amount rcvd;

    /**
     * Gets the value of the pstd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20Amount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20Amount getPstd() {
        return pstd;
    }

    /**
     * Sets the value of the pstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20Amount }
     *     
     */
    public PositionSetPostedAndReceived1 setPstd(ActiveOrHistoricCurrencyAnd20Amount value) {
        this.pstd = value;
        return this;
    }

    /**
     * Gets the value of the rcvd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20Amount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20Amount getRcvd() {
        return rcvd;
    }

    /**
     * Sets the value of the rcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20Amount }
     *     
     */
    public PositionSetPostedAndReceived1 setRcvd(ActiveOrHistoricCurrencyAnd20Amount value) {
        this.rcvd = value;
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
