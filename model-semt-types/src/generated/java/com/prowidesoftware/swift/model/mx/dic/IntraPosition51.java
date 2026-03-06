
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
@XmlType(name = "IntraPosition5__1", propOrder = {
    "finInstrmId",
    "sttlmQty",
    "sttlmDt",
    "balFr",
    "balTo",
    "sctiesSubBalId",
    "prty"
})
public class IntraPosition51 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification191 finInstrmId;
    @XmlElement(name = "SttlmQty", required = true)
    protected FinancialInstrumentQuantity1Choice1 sttlmQty;
    @XmlElement(name = "SttlmDt", required = true)
    protected DateAndDateTimeChoice2 sttlmDt;
    @XmlElement(name = "BalFr")
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt033Draft balFr;
    @XmlElement(name = "BalTo")
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt033Draft balTo;
    @XmlElement(name = "SctiesSubBalId")
    protected GenericIdentification371 sctiesSubBalId;
    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice1 prty;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification191 }
     *     
     */
    public SecurityIdentification191 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification191 }
     *     
     */
    public IntraPosition51 setFinInstrmId(SecurityIdentification191 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public FinancialInstrumentQuantity1Choice1 getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public IntraPosition51 setSttlmQty(FinancialInstrumentQuantity1Choice1 value) {
        this.sttlmQty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice2 }
     *     
     */
    public DateAndDateTimeChoice2 getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice2 }
     *     
     */
    public IntraPosition51 setSttlmDt(DateAndDateTimeChoice2 value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the balFr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt033Draft }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt033Draft getBalFr() {
        return balFr;
    }

    /**
     * Sets the value of the balFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt033Draft }
     *     
     */
    public IntraPosition51 setBalFr(SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt033Draft value) {
        this.balFr = value;
        return this;
    }

    /**
     * Gets the value of the balTo property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt033Draft }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt033Draft getBalTo() {
        return balTo;
    }

    /**
     * Sets the value of the balTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt033Draft }
     *     
     */
    public IntraPosition51 setBalTo(SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt033Draft value) {
        this.balTo = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSubBalId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification371 }
     *     
     */
    public GenericIdentification371 getSctiesSubBalId() {
        return sctiesSubBalId;
    }

    /**
     * Sets the value of the sctiesSubBalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification371 }
     *     
     */
    public IntraPosition51 setSctiesSubBalId(GenericIdentification371 value) {
        this.sctiesSubBalId = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric4Choice1 }
     *     
     */
    public PriorityNumeric4Choice1 getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric4Choice1 }
     *     
     */
    public IntraPosition51 setPrty(PriorityNumeric4Choice1 value) {
        this.prty = value;
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
