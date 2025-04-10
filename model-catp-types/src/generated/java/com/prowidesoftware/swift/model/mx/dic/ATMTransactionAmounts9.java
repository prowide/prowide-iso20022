
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Limit of deposited media for the customer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransactionAmounts9", propOrder = {
    "mdiaTp",
    "ccy",
    "minNb",
    "maxNb",
    "dispFlg"
})
public class ATMTransactionAmounts9 {

    @XmlElement(name = "MdiaTp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMMediaType2Code mdiaTp;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "MinNb")
    protected BigDecimal minNb;
    @XmlElement(name = "MaxNb")
    protected BigDecimal maxNb;
    @XmlElement(name = "DispFlg")
    protected Boolean dispFlg;

    /**
     * Gets the value of the mdiaTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMMediaType2Code }
     *     
     */
    public ATMMediaType2Code getMdiaTp() {
        return mdiaTp;
    }

    /**
     * Sets the value of the mdiaTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMMediaType2Code }
     *     
     */
    public ATMTransactionAmounts9 setMdiaTp(ATMMediaType2Code value) {
        this.mdiaTp = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransactionAmounts9 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the minNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinNb() {
        return minNb;
    }

    /**
     * Sets the value of the minNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTransactionAmounts9 setMinNb(BigDecimal value) {
        this.minNb = value;
        return this;
    }

    /**
     * Gets the value of the maxNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxNb() {
        return maxNb;
    }

    /**
     * Sets the value of the maxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTransactionAmounts9 setMaxNb(BigDecimal value) {
        this.maxNb = value;
        return this;
    }

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
    public ATMTransactionAmounts9 setDispFlg(Boolean value) {
        this.dispFlg = value;
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
