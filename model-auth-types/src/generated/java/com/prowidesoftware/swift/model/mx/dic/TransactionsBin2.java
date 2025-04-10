
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies aggregated details on transactions within a defined numeric range bin.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionsBin2", propOrder = {
    "nbOfTxs",
    "ttlNtnlAmt",
    "rg"
})
public class TransactionsBin2 {

    @XmlElement(name = "NbOfTxs", required = true)
    protected BigDecimal nbOfTxs;
    @XmlElement(name = "TtlNtnlAmt", required = true)
    protected BigDecimal ttlNtnlAmt;
    @XmlElement(name = "Rg", required = true)
    protected FromToQuantityRange2 rg;

    /**
     * Gets the value of the nbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfTxs() {
        return nbOfTxs;
    }

    /**
     * Sets the value of the nbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionsBin2 setNbOfTxs(BigDecimal value) {
        this.nbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the ttlNtnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNtnlAmt() {
        return ttlNtnlAmt;
    }

    /**
     * Sets the value of the ttlNtnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionsBin2 setTtlNtnlAmt(BigDecimal value) {
        this.ttlNtnlAmt = value;
        return this;
    }

    /**
     * Gets the value of the rg property.
     * 
     * @return
     *     possible object is
     *     {@link FromToQuantityRange2 }
     *     
     */
    public FromToQuantityRange2 getRg() {
        return rg;
    }

    /**
     * Sets the value of the rg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromToQuantityRange2 }
     *     
     */
    public TransactionsBin2 setRg(FromToQuantityRange2 value) {
        this.rg = value;
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
