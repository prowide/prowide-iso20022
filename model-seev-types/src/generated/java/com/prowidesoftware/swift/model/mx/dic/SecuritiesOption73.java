
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
@XmlType(name = "SecuritiesOption73", propOrder = {
    "condlQty",
    "instdQty",
    "addtlRndUpQty"
})
public class SecuritiesOption73 {

    @XmlElement(name = "CondlQty")
    protected FinancialInstrumentQuantity15Choice condlQty;
    @XmlElement(name = "InstdQty", required = true)
    protected Quantity40Choice instdQty;
    @XmlElement(name = "AddtlRndUpQty")
    protected FinancialInstrumentQuantity15Choice addtlRndUpQty;

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
    public SecuritiesOption73 setCondlQty(FinancialInstrumentQuantity15Choice value) {
        this.condlQty = value;
        return this;
    }

    /**
     * Gets the value of the instdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity40Choice }
     *     
     */
    public Quantity40Choice getInstdQty() {
        return instdQty;
    }

    /**
     * Sets the value of the instdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity40Choice }
     *     
     */
    public SecuritiesOption73 setInstdQty(Quantity40Choice value) {
        this.instdQty = value;
        return this;
    }

    /**
     * Gets the value of the addtlRndUpQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getAddtlRndUpQty() {
        return addtlRndUpQty;
    }

    /**
     * Sets the value of the addtlRndUpQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public SecuritiesOption73 setAddtlRndUpQty(FinancialInstrumentQuantity15Choice value) {
        this.addtlRndUpQty = value;
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
