
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
 * Choice between a turnaround and pair-off quantity for instructing a one to many and many to many (partial) pair-off or turnaround.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairedOrTurnedQuantity3Choice", propOrder = {
    "pairdOffQty",
    "trndQty"
})
public class PairedOrTurnedQuantity3Choice {

    @XmlElement(name = "PairdOffQty")
    protected FinancialInstrumentQuantity1Choice pairdOffQty;
    @XmlElement(name = "TrndQty")
    protected FinancialInstrumentQuantity1Choice trndQty;

    /**
     * Gets the value of the pairdOffQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getPairdOffQty() {
        return pairdOffQty;
    }

    /**
     * Sets the value of the pairdOffQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public PairedOrTurnedQuantity3Choice setPairdOffQty(FinancialInstrumentQuantity1Choice value) {
        this.pairdOffQty = value;
        return this;
    }

    /**
     * Gets the value of the trndQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getTrndQty() {
        return trndQty;
    }

    /**
     * Sets the value of the trndQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public PairedOrTurnedQuantity3Choice setTrndQty(FinancialInstrumentQuantity1Choice value) {
        this.trndQty = value;
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
