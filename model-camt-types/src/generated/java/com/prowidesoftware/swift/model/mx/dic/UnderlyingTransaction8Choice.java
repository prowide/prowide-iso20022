
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
 * Provides details of the underlying transaction, on which the investigation is processed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingTransaction8Choice", propOrder = {
    "initn",
    "intrBk",
    "stmtNtry"
})
public class UnderlyingTransaction8Choice {

    @XmlElement(name = "Initn")
    protected UnderlyingPaymentInstruction9 initn;
    @XmlElement(name = "IntrBk")
    protected UnderlyingPaymentTransaction8 intrBk;
    @XmlElement(name = "StmtNtry")
    protected UnderlyingStatementEntry3 stmtNtry;

    /**
     * Gets the value of the initn property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentInstruction9 }
     *     
     */
    public UnderlyingPaymentInstruction9 getInitn() {
        return initn;
    }

    /**
     * Sets the value of the initn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentInstruction9 }
     *     
     */
    public UnderlyingTransaction8Choice setInitn(UnderlyingPaymentInstruction9 value) {
        this.initn = value;
        return this;
    }

    /**
     * Gets the value of the intrBk property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentTransaction8 }
     *     
     */
    public UnderlyingPaymentTransaction8 getIntrBk() {
        return intrBk;
    }

    /**
     * Sets the value of the intrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentTransaction8 }
     *     
     */
    public UnderlyingTransaction8Choice setIntrBk(UnderlyingPaymentTransaction8 value) {
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
    public UnderlyingTransaction8Choice setStmtNtry(UnderlyingStatementEntry3 value) {
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
