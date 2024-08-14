
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
 * Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversion21", propOrder = {
    "accptdByCrdhldr",
    "convs"
})
public class CurrencyConversion21 {

    @XmlElement(name = "AccptdByCrdhldr")
    protected Boolean accptdByCrdhldr;
    @XmlElement(name = "Convs")
    protected CurrencyConversion20 convs;

    /**
     * Gets the value of the accptdByCrdhldr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccptdByCrdhldr() {
        return accptdByCrdhldr;
    }

    /**
     * Sets the value of the accptdByCrdhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CurrencyConversion21 setAccptdByCrdhldr(Boolean value) {
        this.accptdByCrdhldr = value;
        return this;
    }

    /**
     * Gets the value of the convs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion20 }
     *     
     */
    public CurrencyConversion20 getConvs() {
        return convs;
    }

    /**
     * Sets the value of the convs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion20 }
     *     
     */
    public CurrencyConversion21 setConvs(CurrencyConversion20 value) {
        this.convs = value;
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
