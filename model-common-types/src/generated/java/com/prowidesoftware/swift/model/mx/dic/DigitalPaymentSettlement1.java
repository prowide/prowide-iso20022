
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
 * Specifies the  information related to the digital payment settlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalPaymentSettlement1", propOrder = {
    "finInstrmId",
    "qty",
    "cshSttlmSysPlc"
})
public class DigitalPaymentSettlement1 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "Qty", required = true)
    protected Quantity83Choice qty;
    @XmlElement(name = "CshSttlmSysPlc")
    protected CashSettlementSystemPlace1Choice cshSttlmSysPlc;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public DigitalPaymentSettlement1 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity83Choice }
     *     
     */
    public Quantity83Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity83Choice }
     *     
     */
    public DigitalPaymentSettlement1 setQty(Quantity83Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlmSysPlc property.
     * 
     * @return
     *     possible object is
     *     {@link CashSettlementSystemPlace1Choice }
     *     
     */
    public CashSettlementSystemPlace1Choice getCshSttlmSysPlc() {
        return cshSttlmSysPlc;
    }

    /**
     * Sets the value of the cshSttlmSysPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSettlementSystemPlace1Choice }
     *     
     */
    public DigitalPaymentSettlement1 setCshSttlmSysPlc(CashSettlementSystemPlace1Choice value) {
        this.cshSttlmSysPlc = value;
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
