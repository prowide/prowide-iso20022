
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
@XmlType(name = "SecuritiesOption2", propOrder = {
    "condlQty",
    "overAndAbovNrmlNsrdEntitlmntQty",
    "instdOrQtyToRcv"
})
public class SecuritiesOption2 {

    @XmlElement(name = "CondlQty")
    protected FinancialInstrumentQuantity1Choice condlQty;
    @XmlElement(name = "OverAndAbovNrmlNsrdEntitlmntQty")
    protected FinancialInstrumentQuantity1Choice overAndAbovNrmlNsrdEntitlmntQty;
    @XmlElement(name = "InstdOrQtyToRcv", required = true)
    protected InstructedOrQuantityToReceive1Choice instdOrQtyToRcv;

    /**
     * Gets the value of the condlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getCondlQty() {
        return condlQty;
    }

    /**
     * Sets the value of the condlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public SecuritiesOption2 setCondlQty(FinancialInstrumentQuantity1Choice value) {
        this.condlQty = value;
        return this;
    }

    /**
     * Gets the value of the overAndAbovNrmlNsrdEntitlmntQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getOverAndAbovNrmlNsrdEntitlmntQty() {
        return overAndAbovNrmlNsrdEntitlmntQty;
    }

    /**
     * Sets the value of the overAndAbovNrmlNsrdEntitlmntQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public SecuritiesOption2 setOverAndAbovNrmlNsrdEntitlmntQty(FinancialInstrumentQuantity1Choice value) {
        this.overAndAbovNrmlNsrdEntitlmntQty = value;
        return this;
    }

    /**
     * Gets the value of the instdOrQtyToRcv property.
     * 
     * @return
     *     possible object is
     *     {@link InstructedOrQuantityToReceive1Choice }
     *     
     */
    public InstructedOrQuantityToReceive1Choice getInstdOrQtyToRcv() {
        return instdOrQtyToRcv;
    }

    /**
     * Sets the value of the instdOrQtyToRcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructedOrQuantityToReceive1Choice }
     *     
     */
    public SecuritiesOption2 setInstdOrQtyToRcv(InstructedOrQuantityToReceive1Choice value) {
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
