
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
 * Choice for identifying the underlying instruments that a derivative can consist of.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentIdentification5Choice", propOrder = {
    "sngl",
    "bskt"
})
public class FinancialInstrumentIdentification5Choice {

    @XmlElement(name = "Sngl")
    protected FinancialInstrument48Choice sngl;
    @XmlElement(name = "Bskt")
    protected FinancialInstrument53 bskt;

    /**
     * Gets the value of the sngl property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument48Choice }
     *     
     */
    public FinancialInstrument48Choice getSngl() {
        return sngl;
    }

    /**
     * Sets the value of the sngl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument48Choice }
     *     
     */
    public FinancialInstrumentIdentification5Choice setSngl(FinancialInstrument48Choice value) {
        this.sngl = value;
        return this;
    }

    /**
     * Gets the value of the bskt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument53 }
     *     
     */
    public FinancialInstrument53 getBskt() {
        return bskt;
    }

    /**
     * Sets the value of the bskt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument53 }
     *     
     */
    public FinancialInstrumentIdentification5Choice setBskt(FinancialInstrument53 value) {
        this.bskt = value;
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
