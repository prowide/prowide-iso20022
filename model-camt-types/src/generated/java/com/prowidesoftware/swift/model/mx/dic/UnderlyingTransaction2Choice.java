
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
 * Specifies the details of the underlying transaction on which the investigation is processed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingTransaction2Choice", propOrder = {
    "initn",
    "intrBk",
    "stmtNtry"
})
public class UnderlyingTransaction2Choice {

    @XmlElement(name = "Initn")
    protected UnderlyingPaymentInstruction2 initn;
    @XmlElement(name = "IntrBk")
    protected UnderlyingPaymentTransaction2 intrBk;
    @XmlElement(name = "StmtNtry")
    protected UnderlyingStatementEntry1 stmtNtry;

    /**
     * Gets the value of the initn property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentInstruction2 }
     *     
     */
    public UnderlyingPaymentInstruction2 getInitn() {
        return initn;
    }

    /**
     * Sets the value of the initn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentInstruction2 }
     *     
     */
    public UnderlyingTransaction2Choice setInitn(UnderlyingPaymentInstruction2 value) {
        this.initn = value;
        return this;
    }

    /**
     * Gets the value of the intrBk property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentTransaction2 }
     *     
     */
    public UnderlyingPaymentTransaction2 getIntrBk() {
        return intrBk;
    }

    /**
     * Sets the value of the intrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentTransaction2 }
     *     
     */
    public UnderlyingTransaction2Choice setIntrBk(UnderlyingPaymentTransaction2 value) {
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
    public UnderlyingTransaction2Choice setStmtNtry(UnderlyingStatementEntry1 value) {
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
