
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
 * Provides details of the underlying transaction, on which the investigation is processed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingTransaction5Choice", propOrder = {
    "initn",
    "intrBk",
    "stmtNtry"
})
public class UnderlyingTransaction5Choice {

    @XmlElement(name = "Initn")
    protected UnderlyingPaymentInstruction5 initn;
    @XmlElement(name = "IntrBk")
    protected UnderlyingPaymentTransaction4 intrBk;
    @XmlElement(name = "StmtNtry")
    protected UnderlyingStatementEntry3 stmtNtry;

    /**
     * Gets the value of the initn property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentInstruction5 }
     *     
     */
    public UnderlyingPaymentInstruction5 getInitn() {
        return initn;
    }

    /**
     * Sets the value of the initn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentInstruction5 }
     *     
     */
    public UnderlyingTransaction5Choice setInitn(UnderlyingPaymentInstruction5 value) {
        this.initn = value;
        return this;
    }

    /**
     * Gets the value of the intrBk property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentTransaction4 }
     *     
     */
    public UnderlyingPaymentTransaction4 getIntrBk() {
        return intrBk;
    }

    /**
     * Sets the value of the intrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentTransaction4 }
     *     
     */
    public UnderlyingTransaction5Choice setIntrBk(UnderlyingPaymentTransaction4 value) {
        this.intrBk = value;
        return this;
    }

    /**
     * Gets the value of the stmtNtry property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingStatementEntry3 }
     *     
     */
    public UnderlyingStatementEntry3 getStmtNtry() {
        return stmtNtry;
    }

    /**
     * Sets the value of the stmtNtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingStatementEntry3 }
     *     
     */
    public UnderlyingTransaction5Choice setStmtNtry(UnderlyingStatementEntry3 value) {
        this.stmtNtry = value;
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
