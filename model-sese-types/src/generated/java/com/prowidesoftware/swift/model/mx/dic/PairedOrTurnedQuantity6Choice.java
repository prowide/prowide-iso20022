
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
@XmlType(name = "PairedOrTurnedQuantity6Choice", propOrder = {
    "pairdOffQty",
    "trndQty"
})
public class PairedOrTurnedQuantity6Choice {

    @XmlElement(name = "PairdOffQty")
    protected FinancialInstrumentQuantity36Choice pairdOffQty;
    @XmlElement(name = "TrndQty")
    protected FinancialInstrumentQuantity36Choice trndQty;

    /**
     * Gets the value of the pairdOffQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getPairdOffQty() {
        return pairdOffQty;
    }

    /**
     * Sets the value of the pairdOffQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public PairedOrTurnedQuantity6Choice setPairdOffQty(FinancialInstrumentQuantity36Choice value) {
        this.pairdOffQty = value;
        return this;
    }

    /**
     * Gets the value of the trndQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getTrndQty() {
        return trndQty;
    }

    /**
     * Sets the value of the trndQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public PairedOrTurnedQuantity6Choice setTrndQty(FinancialInstrumentQuantity36Choice value) {
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
