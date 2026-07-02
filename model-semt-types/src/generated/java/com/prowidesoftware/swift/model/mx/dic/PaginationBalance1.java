
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
 * Balance of a financial instrument for a specific statement page.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaginationBalance1", propOrder = {
    "frstOpngBal",
    "intrmyOpngBal",
    "fnlClsgBal",
    "intrmyClsgBal"
})
public class PaginationBalance1 {

    @XmlElement(name = "FrstOpngBal")
    protected FinancialInstrumentQuantity1 frstOpngBal;
    @XmlElement(name = "IntrmyOpngBal")
    protected FinancialInstrumentQuantity1 intrmyOpngBal;
    @XmlElement(name = "FnlClsgBal")
    protected FinancialInstrumentQuantity1 fnlClsgBal;
    @XmlElement(name = "IntrmyClsgBal")
    protected FinancialInstrumentQuantity1 intrmyClsgBal;

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
    public PaginationBalance1 setFrstOpngBal(FinancialInstrumentQuantity1 value) {
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
    public PaginationBalance1 setIntrmyOpngBal(FinancialInstrumentQuantity1 value) {
        this.intrmyOpngBal = value;
        return this;
    }

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
    public PaginationBalance1 setFnlClsgBal(FinancialInstrumentQuantity1 value) {
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
    public PaginationBalance1 setIntrmyClsgBal(FinancialInstrumentQuantity1 value) {
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
