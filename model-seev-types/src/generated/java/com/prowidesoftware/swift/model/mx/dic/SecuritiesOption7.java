
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
 * Specifies the security option of a corporate event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOption7", propOrder = {
    "condlQty",
    "overAndAbovNrmlNsrdEntitlmntQty",
    "instdOrQtyToRcv"
})
public class SecuritiesOption7 {

    @XmlElement(name = "CondlQty")
    protected FinancialInstrumentQuantity15Choice condlQty;
    @XmlElement(name = "OverAndAbovNrmlNsrdEntitlmntQty")
    protected FinancialInstrumentQuantity15Choice overAndAbovNrmlNsrdEntitlmntQty;
    @XmlElement(name = "InstdOrQtyToRcv", required = true)
    protected InstructedOrQuantityToReceive2Choice instdOrQtyToRcv;

    /**
     * Gets the value of the condlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getCondlQty() {
        return condlQty;
    }

    /**
     * Sets the value of the condlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public SecuritiesOption7 setCondlQty(FinancialInstrumentQuantity15Choice value) {
        this.condlQty = value;
        return this;
    }

    /**
     * Gets the value of the overAndAbovNrmlNsrdEntitlmntQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getOverAndAbovNrmlNsrdEntitlmntQty() {
        return overAndAbovNrmlNsrdEntitlmntQty;
    }

    /**
     * Sets the value of the overAndAbovNrmlNsrdEntitlmntQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public SecuritiesOption7 setOverAndAbovNrmlNsrdEntitlmntQty(FinancialInstrumentQuantity15Choice value) {
        this.overAndAbovNrmlNsrdEntitlmntQty = value;
        return this;
    }

    /**
     * Gets the value of the instdOrQtyToRcv property.
     * 
     * @return
     *     possible object is
     *     {@link InstructedOrQuantityToReceive2Choice }
     *     
     */
    public InstructedOrQuantityToReceive2Choice getInstdOrQtyToRcv() {
        return instdOrQtyToRcv;
    }

    /**
     * Sets the value of the instdOrQtyToRcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructedOrQuantityToReceive2Choice }
     *     
     */
    public SecuritiesOption7 setInstdOrQtyToRcv(InstructedOrQuantityToReceive2Choice value) {
        this.instdOrQtyToRcv = value;
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
