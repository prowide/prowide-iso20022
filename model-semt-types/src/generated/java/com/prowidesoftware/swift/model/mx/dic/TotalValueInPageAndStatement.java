
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
 * Value of total holdings reported.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalValueInPageAndStatement", propOrder = {
    "ttlHldgsValOfPg",
    "ttlHldgsValOfStmt"
})
public class TotalValueInPageAndStatement {

    @XmlElement(name = "TtlHldgsValOfPg")
    protected ActiveCurrencyAndAmount ttlHldgsValOfPg;
    @XmlElement(name = "TtlHldgsValOfStmt", required = true)
    protected ActiveCurrencyAndAmount ttlHldgsValOfStmt;

    /**
     * Gets the value of the ttlHldgsValOfPg property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlHldgsValOfPg() {
        return ttlHldgsValOfPg;
    }

    /**
     * Sets the value of the ttlHldgsValOfPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TotalValueInPageAndStatement setTtlHldgsValOfPg(ActiveCurrencyAndAmount value) {
        this.ttlHldgsValOfPg = value;
        return this;
    }

    /**
     * Gets the value of the ttlHldgsValOfStmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlHldgsValOfStmt() {
        return ttlHldgsValOfStmt;
    }

    /**
     * Sets the value of the ttlHldgsValOfStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TotalValueInPageAndStatement setTtlHldgsValOfStmt(ActiveCurrencyAndAmount value) {
        this.ttlHldgsValOfStmt = value;
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
