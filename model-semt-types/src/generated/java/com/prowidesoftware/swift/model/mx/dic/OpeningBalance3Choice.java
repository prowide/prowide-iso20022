
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
 * Choice of opening and intermediary balances
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpeningBalance3Choice", propOrder = {
    "frstOpngBal",
    "intrmyOpngBal"
})
public class OpeningBalance3Choice {

    @XmlElement(name = "FrstOpngBal")
    protected FinancialInstrumentQuantity1 frstOpngBal;
    @XmlElement(name = "IntrmyOpngBal")
    protected FinancialInstrumentQuantity1 intrmyOpngBal;

    /**
     * Gets the value of the frstOpngBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getFrstOpngBal() {
        return frstOpngBal;
    }

    /**
     * Sets the value of the frstOpngBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public OpeningBalance3Choice setFrstOpngBal(FinancialInstrumentQuantity1 value) {
        this.frstOpngBal = value;
        return this;
    }

    /**
     * Gets the value of the intrmyOpngBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getIntrmyOpngBal() {
        return intrmyOpngBal;
    }

    /**
     * Sets the value of the intrmyOpngBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public OpeningBalance3Choice setIntrmyOpngBal(FinancialInstrumentQuantity1 value) {
        this.intrmyOpngBal = value;
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
