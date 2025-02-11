
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
 * Provides further details on the underlying statement entry to which the investigation message refers.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingStatementEntry5", propOrder = {
    "orgnlAcct",
    "orgnlGrpInf",
    "orgnlStmtId",
    "orgnlNtryRef",
    "orgnlUETR",
    "orgnlNtryAmt",
    "orgnlNtryValDt"
})
public class UnderlyingStatementEntry5 {

    @XmlElement(name = "OrgnlAcct")
    protected CashAccount40 orgnlAcct;
    @XmlElement(name = "OrgnlGrpInf")
    protected OriginalGroupInformation29 orgnlGrpInf;
    @XmlElement(name = "OrgnlStmtId")
    protected String orgnlStmtId;
    @XmlElement(name = "OrgnlNtryRef")
    protected String orgnlNtryRef;
    @XmlElement(name = "OrgnlUETR")
    protected String orgnlUETR;
    @XmlElement(name = "OrgnlNtryAmt")
    protected ActiveOrHistoricCurrencyAndAmount orgnlNtryAmt;
    @XmlElement(name = "OrgnlNtryValDt")
    protected DateAndDateTime2Choice orgnlNtryValDt;

    /**
     * Gets the value of the orgnlAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getOrgnlAcct() {
        return orgnlAcct;
    }

    /**
     * Sets the value of the orgnlAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public UnderlyingStatementEntry5 setOrgnlAcct(CashAccount40 value) {
        this.orgnlAcct = value;
        return this;
    }

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public OriginalGroupInformation29 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public UnderlyingStatementEntry5 setOrgnlGrpInf(OriginalGroupInformation29 value) {
        this.orgnlGrpInf = value;
        return this;
    }

    /**
     * Gets the value of the orgnlStmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlStmtId() {
        return orgnlStmtId;
    }

    /**
     * Sets the value of the orgnlStmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnderlyingStatementEntry5 setOrgnlStmtId(String value) {
        this.orgnlStmtId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNtryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlNtryRef() {
        return orgnlNtryRef;
    }

    /**
     * Sets the value of the orgnlNtryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnderlyingStatementEntry5 setOrgnlNtryRef(String value) {
        this.orgnlNtryRef = value;
        return this;
    }

    /**
     * Gets the value of the orgnlUETR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlUETR() {
        return orgnlUETR;
    }

    /**
     * Sets the value of the orgnlUETR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnderlyingStatementEntry5 setOrgnlUETR(String value) {
        this.orgnlUETR = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNtryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getOrgnlNtryAmt() {
        return orgnlNtryAmt;
    }

    /**
     * Sets the value of the orgnlNtryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public UnderlyingStatementEntry5 setOrgnlNtryAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.orgnlNtryAmt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNtryValDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getOrgnlNtryValDt() {
        return orgnlNtryValDt;
    }

    /**
     * Sets the value of the orgnlNtryValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public UnderlyingStatementEntry5 setOrgnlNtryValDt(DateAndDateTime2Choice value) {
        this.orgnlNtryValDt = value;
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
