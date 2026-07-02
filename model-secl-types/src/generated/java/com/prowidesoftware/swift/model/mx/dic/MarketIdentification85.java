
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
@XmlType(name = "MarketIdentification85", propOrder = {
    "id",
    "tp"
})
public class MarketIdentification85 {

    @XmlElement(name = "Id")
    protected MarketIdentification1Choice id;
    @XmlElement(name = "Tp", required = true)
    protected MarketType9Choice tp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification1Choice }
     *     
     */
    public MarketIdentification1Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification1Choice }
     *     
     */
    public MarketIdentification85 setId(MarketIdentification1Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MarketType9Choice }
     *     
     */
    public MarketType9Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketType9Choice }
     *     
     */
    public MarketIdentification85 setTp(MarketType9Choice value) {
        this.tp = value;
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
