
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
 * Specifies the details of the underlying transaction on which the investigation is processed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingTransaction1Choice", propOrder = {
    "initn",
    "intrBk",
    "stmtNtry"
})
public class UnderlyingTransaction1Choice {

    @XmlElement(name = "Initn")
    protected UnderlyingPaymentInstruction1 initn;
    @XmlElement(name = "IntrBk")
    protected UnderlyingPaymentTransaction1 intrBk;
    @XmlElement(name = "StmtNtry")
    protected UnderlyingStatementEntry1 stmtNtry;

    /**
     * Gets the value of the initn property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentInstruction1 }
     *     
     */
    public UnderlyingPaymentInstruction1 getInitn() {
        return initn;
    }

    /**
     * Sets the value of the initn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentInstruction1 }
     *     
     */
    public UnderlyingTransaction1Choice setInitn(UnderlyingPaymentInstruction1 value) {
        this.initn = value;
        return this;
    }

    /**
     * Gets the value of the intrBk property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentTransaction1 }
     *     
     */
    public UnderlyingPaymentTransaction1 getIntrBk() {
        return intrBk;
    }

    /**
     * Sets the value of the intrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentTransaction1 }
     *     
     */
    public UnderlyingTransaction1Choice setIntrBk(UnderlyingPaymentTransaction1 value) {
        this.intrBk = value;
        return this;
    }

    /**
     * Gets the value of the stmtNtry property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingStatementEntry1 }
     *     
     */
    public UnderlyingStatementEntry1 getStmtNtry() {
        return stmtNtry;
    }

    /**
     * Sets the value of the stmtNtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingStatementEntry1 }
     *     
     */
    public UnderlyingTransaction1Choice setStmtNtry(UnderlyingStatementEntry1 value) {
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
