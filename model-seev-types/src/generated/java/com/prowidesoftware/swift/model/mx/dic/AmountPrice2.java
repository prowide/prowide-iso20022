
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
 * Price expressed as an actual amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountPrice2", propOrder = {
    "amtPricTp",
    "pricVal"
})
public class AmountPrice2 {

    @XmlElement(name = "AmtPricTp", required = true)
    @XmlSchemaType(name = "string")
    protected AmountPriceType2Code amtPricTp;
    @XmlElement(name = "PricVal", required = true)
    protected ActiveCurrencyAnd13DecimalAmount pricVal;

    /**
     * Gets the value of the amtPricTp property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPriceType2Code }
     *     
     */
    public AmountPriceType2Code getAmtPricTp() {
        return amtPricTp;
    }

    /**
     * Sets the value of the amtPricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPriceType2Code }
     *     
     */
    public AmountPrice2 setAmtPricTp(AmountPriceType2Code value) {
        this.amtPricTp = value;
        return this;
    }

    /**
     * Gets the value of the pricVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getPricVal() {
        return pricVal;
    }

    /**
     * Sets the value of the pricVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public AmountPrice2 setPricVal(ActiveCurrencyAnd13DecimalAmount value) {
        this.pricVal = value;
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
