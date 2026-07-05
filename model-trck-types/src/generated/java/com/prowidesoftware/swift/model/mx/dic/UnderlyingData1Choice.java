
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
 * Specifies the details of an underlying transaction, on which the investigation is processed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingData1Choice", propOrder = {
    "initn",
    "intrBk",
    "stmtNtry",
    "acct",
    "othr"
})
public class UnderlyingData1Choice {

    @XmlElement(name = "Initn")
    protected UnderlyingPaymentInstruction8 initn;
    @XmlElement(name = "IntrBk")
    protected UnderlyingPaymentTransaction7 intrBk;
    @XmlElement(name = "StmtNtry")
    protected UnderlyingStatementEntry4 stmtNtry;
    @XmlElement(name = "Acct")
    protected CashAccount40 acct;
    @XmlElement(name = "Othr")
    protected GenericIdentification1 othr;

    /**
     * Gets the value of the initn property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentInstruction8 }
     *     
     */
    public UnderlyingPaymentInstruction8 getInitn() {
        return initn;
    }

    /**
     * Sets the value of the initn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentInstruction8 }
     *     
     */
    public UnderlyingData1Choice setInitn(UnderlyingPaymentInstruction8 value) {
        this.initn = value;
        return this;
    }

    /**
     * Gets the value of the intrBk property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentTransaction7 }
     *     
     */
    public UnderlyingPaymentTransaction7 getIntrBk() {
        return intrBk;
    }

    /**
     * Sets the value of the intrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentTransaction7 }
     *     
     */
    public UnderlyingData1Choice setIntrBk(UnderlyingPaymentTransaction7 value) {
        this.intrBk = value;
        return this;
    }

    /**
     * Gets the value of the stmtNtry property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingStatementEntry4 }
     *     
     */
    public UnderlyingStatementEntry4 getStmtNtry() {
        return stmtNtry;
    }

    /**
     * Sets the value of the stmtNtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingStatementEntry4 }
     *     
     */
    public UnderlyingData1Choice setStmtNtry(UnderlyingStatementEntry4 value) {
        this.stmtNtry = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public UnderlyingData1Choice setAcct(CashAccount40 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public UnderlyingData1Choice setOthr(GenericIdentification1 value) {
        this.othr = value;
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
