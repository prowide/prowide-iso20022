
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
 * Data linked to card loyalty during payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyRequestData3", propOrder = {
    "cstmrOrdr",
    "acct",
    "amt"
})
public class LoyaltyRequestData3 {

    @XmlElement(name = "CstmrOrdr")
    protected CustomerOrder1 cstmrOrdr;
    @XmlElement(name = "Acct")
    protected LoyaltyAccount3 acct;
    @XmlElement(name = "Amt")
    protected LoyaltyAmount1 amt;

    /**
     * Gets the value of the cstmrOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrder1 }
     *     
     */
    public CustomerOrder1 getCstmrOrdr() {
        return cstmrOrdr;
    }

    /**
     * Sets the value of the cstmrOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrder1 }
     *     
     */
    public LoyaltyRequestData3 setCstmrOrdr(CustomerOrder1 value) {
        this.cstmrOrdr = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAccount3 }
     *     
     */
    public LoyaltyAccount3 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccount3 }
     *     
     */
    public LoyaltyRequestData3 setAcct(LoyaltyAccount3 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAmount1 }
     *     
     */
    public LoyaltyAmount1 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAmount1 }
     *     
     */
    public LoyaltyRequestData3 setAmt(LoyaltyAmount1 value) {
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
