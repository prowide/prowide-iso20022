
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
 * Choice of final and intermediary balances.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosingBalance3Choice", propOrder = {
    "fnlClsgBal",
    "intrmyClsgBal"
})
public class ClosingBalance3Choice {

    @XmlElement(name = "FnlClsgBal")
    protected FinancialInstrumentQuantity1 fnlClsgBal;
    @XmlElement(name = "IntrmyClsgBal")
    protected FinancialInstrumentQuantity1 intrmyClsgBal;

    /**
     * Gets the value of the fnlClsgBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getFnlClsgBal() {
        return fnlClsgBal;
    }

    /**
     * Sets the value of the fnlClsgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public ClosingBalance3Choice setFnlClsgBal(FinancialInstrumentQuantity1 value) {
        this.fnlClsgBal = value;
        return this;
    }

    /**
     * Gets the value of the intrmyClsgBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getIntrmyClsgBal() {
        return intrmyClsgBal;
    }

    /**
     * Sets the value of the intrmyClsgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public ClosingBalance3Choice setIntrmyClsgBal(FinancialInstrumentQuantity1 value) {
        this.intrmyClsgBal = value;
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
