
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
 * Provides information about the exchange rate basis for a foreign exchange transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateBasis1Choice", propOrder = {
    "ccyPair",
    "prtry"
})
public class ExchangeRateBasis1Choice {

    @XmlElement(name = "CcyPair")
    protected ExchangeRateBasis1 ccyPair;
    @XmlElement(name = "Prtry")
    protected String prtry;

    /**
     * Gets the value of the ccyPair property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateBasis1 }
     *     
     */
    public ExchangeRateBasis1 getCcyPair() {
        return ccyPair;
    }

    /**
     * Sets the value of the ccyPair property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateBasis1 }
     *     
     */
    public ExchangeRateBasis1Choice setCcyPair(ExchangeRateBasis1 value) {
        this.ccyPair = value;
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
    public ExchangeRateBasis1Choice setPrtry(String value) {
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
