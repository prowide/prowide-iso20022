
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
 * Details of the intra-balance movement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalance5", propOrder = {
    "sttlmAmt",
    "sttlmDt",
    "balFr",
    "balTo",
    "cshSubBalId",
    "prty",
    "instrPrcgAddtlDtls"
})
public class IntraBalance5 {

    @XmlElement(name = "SttlmAmt", required = true)
    protected Amount2Choice sttlmAmt;
    @XmlElement(name = "SttlmDt", required = true)
    protected DateAndDateTime2Choice sttlmDt;
    @XmlElement(name = "BalFr", required = true)
    protected CashSubBalanceTypeAndQuantityBreakdown3 balFr;
    @XmlElement(name = "BalTo", required = true)
    protected CashSubBalanceTypeAndQuantityBreakdown3 balTo;
    @XmlElement(name = "CshSubBalId")
    protected GenericIdentification37 cshSubBalId;
    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice prty;
    @XmlElement(name = "InstrPrcgAddtlDtls")
    protected String instrPrcgAddtlDtls;

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public IntraBalance5 setSttlmAmt(Amount2Choice value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public IntraBalance5 setSttlmDt(DateAndDateTime2Choice value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the balFr property.
     * 
     * @return
     *     possible object is
     *     {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public CashSubBalanceTypeAndQuantityBreakdown3 getBalFr() {
        return balFr;
    }

    /**
     * Sets the value of the balFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public IntraBalance5 setBalFr(CashSubBalanceTypeAndQuantityBreakdown3 value) {
        this.balFr = value;
        return this;
    }

    /**
     * Gets the value of the balTo property.
     * 
     * @return
     *     possible object is
     *     {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public CashSubBalanceTypeAndQuantityBreakdown3 getBalTo() {
        return balTo;
    }

    /**
     * Sets the value of the balTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public IntraBalance5 setBalTo(CashSubBalanceTypeAndQuantityBreakdown3 value) {
        this.balTo = value;
        return this;
    }

    /**
     * Gets the value of the cshSubBalId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getCshSubBalId() {
        return cshSubBalId;
    }

    /**
     * Sets the value of the cshSubBalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public IntraBalance5 setCshSubBalId(GenericIdentification37 value) {
        this.cshSubBalId = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public PriorityNumeric4Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public IntraBalance5 setPrty(PriorityNumeric4Choice value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the instrPrcgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrPrcgAddtlDtls() {
        return instrPrcgAddtlDtls;
    }

    /**
     * Sets the value of the instrPrcgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IntraBalance5 setInstrPrcgAddtlDtls(String value) {
        this.instrPrcgAddtlDtls = value;
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
