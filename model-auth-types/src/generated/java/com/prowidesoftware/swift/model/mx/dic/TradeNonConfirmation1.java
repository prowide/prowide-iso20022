
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
 * Identifies contract that is not confirmed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeNonConfirmation1", propOrder = {
    "tp"
})
public class TradeNonConfirmation1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TradeConfirmationType2Code tp;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeConfirmationType2Code }
     *     
     */
    public TradeConfirmationType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeConfirmationType2Code }
     *     
     */
    public TradeNonConfirmation1 setTp(TradeConfirmationType2Code value) {
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
