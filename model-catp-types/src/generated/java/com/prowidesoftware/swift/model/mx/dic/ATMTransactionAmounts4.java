
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Withdrawal limits for the account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransactionAmounts4", propOrder = {
    "dispFlg",
    "avlblAmt",
    "dalyBal",
    "wklyBal",
    "mnthlyBal"
})
public class ATMTransactionAmounts4 {

    @XmlElement(name = "DispFlg")
    protected Boolean dispFlg;
    @XmlElement(name = "AvlblAmt")
    protected BigDecimal avlblAmt;
    @XmlElement(name = "DalyBal")
    protected DetailedAmount4 dalyBal;
    @XmlElement(name = "WklyBal")
    protected DetailedAmount4 wklyBal;
    @XmlElement(name = "MnthlyBal")
    protected DetailedAmount4 mnthlyBal;

    /**
     * Gets the value of the dispFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDispFlg() {
        return dispFlg;
    }

    /**
     * Sets the value of the dispFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMTransactionAmounts4 setDispFlg(Boolean value) {
        this.dispFlg = value;
        return this;
    }

    /**
     * Gets the value of the avlblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvlblAmt() {
        return avlblAmt;
    }

    /**
     * Sets the value of the avlblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTransactionAmounts4 setAvlblAmt(BigDecimal value) {
        this.avlblAmt = value;
        return this;
    }

    /**
     * Gets the value of the dalyBal property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount4 }
     *     
     */
    public DetailedAmount4 getDalyBal() {
        return dalyBal;
    }

    /**
     * Sets the value of the dalyBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount4 }
     *     
     */
    public ATMTransactionAmounts4 setDalyBal(DetailedAmount4 value) {
        this.dalyBal = value;
        return this;
    }

    /**
     * Gets the value of the wklyBal property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount4 }
     *     
     */
    public DetailedAmount4 getWklyBal() {
        return wklyBal;
    }

    /**
     * Sets the value of the wklyBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount4 }
     *     
     */
    public ATMTransactionAmounts4 setWklyBal(DetailedAmount4 value) {
        this.wklyBal = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyBal property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount4 }
     *     
     */
    public DetailedAmount4 getMnthlyBal() {
        return mnthlyBal;
    }

    /**
     * Sets the value of the mnthlyBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount4 }
     *     
     */
    public ATMTransactionAmounts4 setMnthlyBal(DetailedAmount4 value) {
        this.mnthlyBal = value;
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
