
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
 * Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceOfTradeIdentification3Choice", propOrder = {
    "ctry",
    "xchg",
    "overTheCntr"
})
public class PlaceOfTradeIdentification3Choice {

    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "Xchg")
    protected String xchg;
    @XmlElement(name = "OverTheCntr")
    protected String overTheCntr;

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlaceOfTradeIdentification3Choice setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the xchg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchg() {
        return xchg;
    }

    /**
     * Sets the value of the xchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlaceOfTradeIdentification3Choice setXchg(String value) {
        this.xchg = value;
        return this;
    }

    /**
     * Gets the value of the overTheCntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverTheCntr() {
        return overTheCntr;
    }

    /**
     * Sets the value of the overTheCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlaceOfTradeIdentification3Choice setOverTheCntr(String value) {
        this.overTheCntr = value;
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
