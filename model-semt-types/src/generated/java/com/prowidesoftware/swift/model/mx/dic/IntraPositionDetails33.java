
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
 * Details of the intra-position movement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionDetails33", propOrder = {
    "prty",
    "sttlmQty",
    "sctiesSubBalId",
    "sttlmDt",
    "balFr",
    "balTo",
    "instrPrcgAddtlDtls"
})
public class IntraPositionDetails33 {

    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice prty;
    @XmlElement(name = "SttlmQty", required = true)
    protected FinancialInstrumentQuantity1Choice sttlmQty;
    @XmlElement(name = "SctiesSubBalId")
    protected GenericIdentification37 sctiesSubBalId;
    @XmlElement(name = "SttlmDt", required = true)
    protected DateAndDateTimeChoice sttlmDt;
    @XmlElement(name = "BalFr", required = true)
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown3 balFr;
    @XmlElement(name = "BalTo", required = true)
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown3 balTo;
    @XmlElement(name = "InstrPrcgAddtlDtls")
    protected String instrPrcgAddtlDtls;

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
    public IntraPositionDetails33 setPrty(PriorityNumeric4Choice value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public IntraPositionDetails33 setSttlmQty(FinancialInstrumentQuantity1Choice value) {
        this.sttlmQty = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSubBalId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getSctiesSubBalId() {
        return sctiesSubBalId;
    }

    /**
     * Sets the value of the sctiesSubBalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public IntraPositionDetails33 setSctiesSubBalId(GenericIdentification37 value) {
        this.sctiesSubBalId = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public IntraPositionDetails33 setSttlmDt(DateAndDateTimeChoice value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the balFr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown3 getBalFr() {
        return balFr;
    }

    /**
     * Sets the value of the balFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public IntraPositionDetails33 setBalFr(SecuritiesSubBalanceTypeAndQuantityBreakdown3 value) {
        this.balFr = value;
        return this;
    }

    /**
     * Gets the value of the balTo property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown3 getBalTo() {
        return balTo;
    }

    /**
     * Sets the value of the balTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public IntraPositionDetails33 setBalTo(SecuritiesSubBalanceTypeAndQuantityBreakdown3 value) {
        this.balTo = value;
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
    public IntraPositionDetails33 setInstrPrcgAddtlDtls(String value) {
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
