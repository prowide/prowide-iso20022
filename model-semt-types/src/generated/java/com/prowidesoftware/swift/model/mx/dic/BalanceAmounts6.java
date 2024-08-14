
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
 * Amounts linked to a securities balance, for example, holding value.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceAmounts6", propOrder = {
    "hldgVal",
    "bookVal",
    "urlsdGnLoss"
})
public class BalanceAmounts6 {

    @XmlElement(name = "HldgVal", required = true)
    protected AmountAndDirection14 hldgVal;
    @XmlElement(name = "BookVal")
    protected AmountAndDirection14 bookVal;
    @XmlElement(name = "UrlsdGnLoss")
    protected AmountAndDirection14 urlsdGnLoss;

    /**
     * Gets the value of the hldgVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getHldgVal() {
        return hldgVal;
    }

    /**
     * Sets the value of the hldgVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public BalanceAmounts6 setHldgVal(AmountAndDirection14 value) {
        this.hldgVal = value;
        return this;
    }

    /**
     * Gets the value of the bookVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getBookVal() {
        return bookVal;
    }

    /**
     * Sets the value of the bookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public BalanceAmounts6 setBookVal(AmountAndDirection14 value) {
        this.bookVal = value;
        return this;
    }

    /**
     * Gets the value of the urlsdGnLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getUrlsdGnLoss() {
        return urlsdGnLoss;
    }

    /**
     * Sets the value of the urlsdGnLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public BalanceAmounts6 setUrlsdGnLoss(AmountAndDirection14 value) {
        this.urlsdGnLoss = value;
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
