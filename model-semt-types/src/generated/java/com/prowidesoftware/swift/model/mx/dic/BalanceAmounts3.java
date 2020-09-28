
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
@XmlType(name = "BalanceAmounts3", propOrder = {
    "hldgVal",
    "prvsHldgVal",
    "bookVal",
    "elgblCollVal",
    "acrdIntrstAmt"
})
public class BalanceAmounts3 {

    @XmlElement(name = "HldgVal")
    protected AmountAndDirection6 hldgVal;
    @XmlElement(name = "PrvsHldgVal")
    protected AmountAndDirection6 prvsHldgVal;
    @XmlElement(name = "BookVal")
    protected AmountAndDirection6 bookVal;
    @XmlElement(name = "ElgblCollVal")
    protected AmountAndDirection6 elgblCollVal;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection6 acrdIntrstAmt;

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
    public BalanceAmounts3 setHldgVal(AmountAndDirection6 value) {
        this.hldgVal = value;
        return this;
    }

    /**
     * Gets the value of the prvsHldgVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public AmountAndDirection6 getPrvsHldgVal() {
        return prvsHldgVal;
    }

    /**
     * Sets the value of the prvsHldgVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public BalanceAmounts3 setPrvsHldgVal(AmountAndDirection6 value) {
        this.prvsHldgVal = value;
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
    public BalanceAmounts3 setBookVal(AmountAndDirection6 value) {
        this.bookVal = value;
        return this;
    }

    /**
     * Gets the value of the elgblCollVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public AmountAndDirection6 getElgblCollVal() {
        return elgblCollVal;
    }

    /**
     * Sets the value of the elgblCollVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public BalanceAmounts3 setElgblCollVal(AmountAndDirection6 value) {
        this.elgblCollVal = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public AmountAndDirection6 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public BalanceAmounts3 setAcrdIntrstAmt(AmountAndDirection6 value) {
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
