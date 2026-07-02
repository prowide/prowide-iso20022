
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
 * Amounts linked to a securities balance, for example, holding value.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceAmounts2", propOrder = {
    "hldgVal",
    "bookVal",
    "urlsdGnLoss"
})
public class BalanceAmounts2 {

    @XmlElement(name = "HldgVal", required = true)
    protected AmountAndDirection6 hldgVal;
    @XmlElement(name = "BookVal")
    protected AmountAndDirection6 bookVal;
    @XmlElement(name = "UrlsdGnLoss")
    protected AmountAndDirection6 urlsdGnLoss;

    /**
     * Gets the value of the hldgVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public AmountAndDirection6 getHldgVal() {
        return hldgVal;
    }

    /**
     * Sets the value of the hldgVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public BalanceAmounts2 setHldgVal(AmountAndDirection6 value) {
        this.hldgVal = value;
        return this;
    }

    /**
     * Gets the value of the bookVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public AmountAndDirection6 getBookVal() {
        return bookVal;
    }

    /**
     * Sets the value of the bookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public BalanceAmounts2 setBookVal(AmountAndDirection6 value) {
        this.bookVal = value;
        return this;
    }

    /**
     * Gets the value of the urlsdGnLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public AmountAndDirection6 getUrlsdGnLoss() {
        return urlsdGnLoss;
    }

    /**
     * Sets the value of the urlsdGnLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public BalanceAmounts2 setUrlsdGnLoss(AmountAndDirection6 value) {
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
