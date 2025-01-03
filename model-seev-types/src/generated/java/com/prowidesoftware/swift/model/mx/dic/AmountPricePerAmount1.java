
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
 * Specifies a ratio: Amount price per amount.
 * 
 * Example:
 * ISIN US629377AS17. Repurchase USD1087.17 cash for every USD1000 stock (NRG Energy Inc 8% Senior Notes 15/12/13).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountPricePerAmount1", propOrder = {
    "amtPricTp",
    "pricVal",
    "amt"
})
public class AmountPricePerAmount1 {

    @XmlElement(name = "AmtPricTp", required = true)
    protected AmountPriceType1FormatChoice amtPricTp;
    @XmlElement(name = "PricVal", required = true)
    protected ActiveCurrencyAnd13DecimalAmount pricVal;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAnd13DecimalAmount amt;

    /**
     * Gets the value of the amtPricTp property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPriceType1FormatChoice }
     *     
     */
    public AmountPriceType1FormatChoice getAmtPricTp() {
        return amtPricTp;
    }

    /**
     * Sets the value of the amtPricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPriceType1FormatChoice }
     *     
     */
    public AmountPricePerAmount1 setAmtPricTp(AmountPriceType1FormatChoice value) {
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
    public AmountPricePerAmount1 setPricVal(ActiveCurrencyAnd13DecimalAmount value) {
        this.pricVal = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public AmountPricePerAmount1 setAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
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
