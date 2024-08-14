
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
 * Totals of the reconciliation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTotals4", propOrder = {
    "ttlCdt",
    "ttlDbt",
    "ttlNb"
})
public class TransactionTotals4 {

    @XmlElement(name = "TtlCdt", required = true)
    protected TransactionTotals5 ttlCdt;
    @XmlElement(name = "TtlDbt", required = true)
    protected TransactionTotals5 ttlDbt;
    @XmlElement(name = "TtlNb")
    protected TransactionTotals6 ttlNb;

    /**
     * Gets the value of the ttlCdt property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTotals5 }
     *     
     */
    public TransactionTotals5 getTtlCdt() {
        return ttlCdt;
    }

    /**
     * Sets the value of the ttlCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTotals5 }
     *     
     */
    public TransactionTotals4 setTtlCdt(TransactionTotals5 value) {
        this.ttlCdt = value;
        return this;
    }

    /**
     * Gets the value of the ttlDbt property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTotals5 }
     *     
     */
    public TransactionTotals5 getTtlDbt() {
        return ttlDbt;
    }

    /**
     * Sets the value of the ttlDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTotals5 }
     *     
     */
    public TransactionTotals4 setTtlDbt(TransactionTotals5 value) {
        this.ttlDbt = value;
        return this;
    }

    /**
     * Gets the value of the ttlNb property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTotals6 }
     *     
     */
    public TransactionTotals6 getTtlNb() {
        return ttlNb;
    }

    /**
     * Sets the value of the ttlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTotals6 }
     *     
     */
    public TransactionTotals4 setTtlNb(TransactionTotals6 value) {
        this.ttlNb = value;
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
