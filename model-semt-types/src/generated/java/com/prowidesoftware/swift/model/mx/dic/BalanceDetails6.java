
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
 * Balance related details for a portfolio.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceDetails6", propOrder = {
    "ctgy",
    "tp",
    "urlsd",
    "amt"
})
public class BalanceDetails6 {

    @XmlElement(name = "Ctgy")
    @XmlSchemaType(name = "string")
    protected FinancialAssetTypeCategory1Code ctgy;
    @XmlElement(name = "Tp")
    protected BalanceType7Choice tp;
    @XmlElement(name = "Urlsd")
    @XmlSchemaType(name = "string")
    protected Unrealised1Code urlsd;
    @XmlElement(name = "Amt", required = true)
    protected AmountAndDirection31 amt;

    /**
     * Gets the value of the ctgy property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAssetTypeCategory1Code }
     *     
     */
    public FinancialAssetTypeCategory1Code getCtgy() {
        return ctgy;
    }

    /**
     * Sets the value of the ctgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAssetTypeCategory1Code }
     *     
     */
    public BalanceDetails6 setCtgy(FinancialAssetTypeCategory1Code value) {
        this.ctgy = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceType7Choice }
     *     
     */
    public BalanceType7Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceType7Choice }
     *     
     */
    public BalanceDetails6 setTp(BalanceType7Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the urlsd property.
     * 
     * @return
     *     possible object is
     *     {@link Unrealised1Code }
     *     
     */
    public Unrealised1Code getUrlsd() {
        return urlsd;
    }

    /**
     * Sets the value of the urlsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unrealised1Code }
     *     
     */
    public BalanceDetails6 setUrlsd(Unrealised1Code value) {
        this.urlsd = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection31 }
     *     
     */
    public AmountAndDirection31 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection31 }
     *     
     */
    public BalanceDetails6 setAmt(AmountAndDirection31 value) {
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
