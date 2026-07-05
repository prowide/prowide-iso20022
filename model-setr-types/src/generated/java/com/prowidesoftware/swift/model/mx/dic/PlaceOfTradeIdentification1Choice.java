
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
 * Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceOfTradeIdentification1Choice", propOrder = {
    "ctry",
    "xchg",
    "pty",
    "overTheCntr"
})
public class PlaceOfTradeIdentification1Choice {

    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "Xchg")
    protected String xchg;
    @XmlElement(name = "Pty")
    protected String pty;
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
    public PlaceOfTradeIdentification1Choice setCtry(String value) {
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
    public PlaceOfTradeIdentification1Choice setXchg(String value) {
        this.xchg = value;
        return this;
    }

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlaceOfTradeIdentification1Choice setPty(String value) {
        this.pty = value;
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
    public PlaceOfTradeIdentification1Choice setOverTheCntr(String value) {
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
