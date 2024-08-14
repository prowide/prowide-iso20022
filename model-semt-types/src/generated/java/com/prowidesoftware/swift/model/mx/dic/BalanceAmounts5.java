
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
 * Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceAmounts5", propOrder = {
    "hldgVal",
    "prvsHldgVal",
    "bookVal",
    "urlsdGnLoss",
    "acrdIntrstAmt"
})
public class BalanceAmounts5 {

    @XmlElement(name = "HldgVal", required = true)
    protected AmountAndDirection14 hldgVal;
    @XmlElement(name = "PrvsHldgVal")
    protected AmountAndDirection14 prvsHldgVal;
    @XmlElement(name = "BookVal")
    protected AmountAndDirection14 bookVal;
    @XmlElement(name = "UrlsdGnLoss")
    protected AmountAndDirection14 urlsdGnLoss;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection14 acrdIntrstAmt;

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
    public BalanceAmounts5 setHldgVal(AmountAndDirection14 value) {
        this.hldgVal = value;
        return this;
    }

    /**
     * Gets the value of the prvsHldgVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getPrvsHldgVal() {
        return prvsHldgVal;
    }

    /**
     * Sets the value of the prvsHldgVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public BalanceAmounts5 setPrvsHldgVal(AmountAndDirection14 value) {
        this.prvsHldgVal = value;
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
    public BalanceAmounts5 setBookVal(AmountAndDirection14 value) {
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
    public BalanceAmounts5 setUrlsdGnLoss(AmountAndDirection14 value) {
        this.urlsdGnLoss = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public BalanceAmounts5 setAcrdIntrstAmt(AmountAndDirection14 value) {
        this.acrdIntrstAmt = value;
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
