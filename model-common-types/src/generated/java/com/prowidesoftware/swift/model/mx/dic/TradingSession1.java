
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
 * The details of a specific trading session.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingSession1", propOrder = {
    "tradgSsnId",
    "tradgSsnSubId"
})
public class TradingSession1 {

    @XmlElement(name = "TradgSsnId")
    protected String tradgSsnId;
    @XmlElement(name = "TradgSsnSubId")
    protected String tradgSsnSubId;

    /**
     * Gets the value of the tradgSsnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgSsnId() {
        return tradgSsnId;
    }

    /**
     * Sets the value of the tradgSsnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradingSession1 setTradgSsnId(String value) {
        this.tradgSsnId = value;
        return this;
    }

    /**
     * Gets the value of the tradgSsnSubId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgSsnSubId() {
        return tradgSsnSubId;
    }

    /**
     * Sets the value of the tradgSsnSubId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradingSession1 setTradgSsnSubId(String value) {
        this.tradgSsnSubId = value;
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
