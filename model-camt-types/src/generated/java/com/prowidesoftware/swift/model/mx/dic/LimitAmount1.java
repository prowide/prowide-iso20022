
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
 * Amount of money characterics used to specify a limit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitAmount1", propOrder = {
    "amt",
    "utlstnAmt",
    "avlblAmt"
})
public class LimitAmount1 {

    @XmlElement(name = "Amt", required = true)
    protected CreditDebitAmount1 amt;
    @XmlElement(name = "UtlstnAmt", required = true)
    protected CreditDebitAmount1 utlstnAmt;
    @XmlElement(name = "AvlblAmt", required = true)
    protected CreditDebitAmount1 avlblAmt;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitAmount1 }
     *     
     */
    public CreditDebitAmount1 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitAmount1 }
     *     
     */
    public LimitAmount1 setAmt(CreditDebitAmount1 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the utlstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitAmount1 }
     *     
     */
    public CreditDebitAmount1 getUtlstnAmt() {
        return utlstnAmt;
    }

    /**
     * Sets the value of the utlstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitAmount1 }
     *     
     */
    public LimitAmount1 setUtlstnAmt(CreditDebitAmount1 value) {
        this.utlstnAmt = value;
        return this;
    }

    /**
     * Gets the value of the avlblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitAmount1 }
     *     
     */
    public CreditDebitAmount1 getAvlblAmt() {
        return avlblAmt;
    }

    /**
     * Sets the value of the avlblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitAmount1 }
     *     
     */
    public LimitAmount1 setAvlblAmt(CreditDebitAmount1 value) {
        this.avlblAmt = value;
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
