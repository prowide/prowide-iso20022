
package com.prowidesoftware.swift.model.mx.dic;

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
 * Specifies the status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status28Choice", propOrder = {
    "cd",
    "prtry"
})
public class Status28Choice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected TradeStatus7Code cd;
    @XmlElement(name = "Prtry")
    protected String prtry;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeStatus7Code }
     *     
     */
    public TradeStatus7Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeStatus7Code }
     *     
     */
    public Status28Choice setCd(TradeStatus7Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Status28Choice setPrtry(String value) {
        this.prtry = value;
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
