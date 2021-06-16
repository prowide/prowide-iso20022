
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
 * Details of the intra-balance movement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalance6", propOrder = {
    "sttldAmt",
    "prevslySttldAmt",
    "rmngSttlmAmt",
    "sttlmDt",
    "balFr",
    "balTo",
    "cshSubBalId",
    "instrPrcgAddtlDtls"
})
public class IntraBalance6 {

    @XmlElement(name = "SttldAmt")
    protected Amount2Choice sttldAmt;
    @XmlElement(name = "PrevslySttldAmt")
    protected Amount2Choice prevslySttldAmt;
    @XmlElement(name = "RmngSttlmAmt")
    protected Amount2Choice rmngSttlmAmt;
    @XmlElement(name = "SttlmDt", required = true)
    protected DateAndDateTime2Choice sttlmDt;
    @XmlElement(name = "BalFr", required = true)
    protected CashSubBalanceTypeAndQuantityBreakdown3 balFr;
    @XmlElement(name = "BalTo", required = true)
    protected CashSubBalanceTypeAndQuantityBreakdown3 balTo;
    @XmlElement(name = "CshSubBalId")
    protected GenericIdentification37 cshSubBalId;
    @XmlElement(name = "InstrPrcgAddtlDtls")
    protected String instrPrcgAddtlDtls;

    /**
     * Gets the value of the sttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getSttldAmt() {
        return sttldAmt;
    }

    /**
     * Sets the value of the sttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public IntraBalance6 setSttldAmt(Amount2Choice value) {
        this.sttldAmt = value;
        return this;
    }

    /**
     * Gets the value of the prevslySttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getPrevslySttldAmt() {
        return prevslySttldAmt;
    }

    /**
     * Sets the value of the prevslySttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public IntraBalance6 setPrevslySttldAmt(Amount2Choice value) {
        this.prevslySttldAmt = value;
        return this;
    }

    /**
     * Gets the value of the rmngSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getRmngSttlmAmt() {
        return rmngSttlmAmt;
    }

    /**
     * Sets the value of the rmngSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public IntraBalance6 setRmngSttlmAmt(Amount2Choice value) {
        this.rmngSttlmAmt = value;
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
    public IntraBalance6 setSttlmDt(DateAndDateTime2Choice value) {
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
    public IntraBalance6 setBalFr(CashSubBalanceTypeAndQuantityBreakdown3 value) {
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
    public IntraBalance6 setBalTo(CashSubBalanceTypeAndQuantityBreakdown3 value) {
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
    public IntraBalance6 setCshSubBalId(GenericIdentification37 value) {
        this.cshSubBalId = value;
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
    public IntraBalance6 setInstrPrcgAddtlDtls(String value) {
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
