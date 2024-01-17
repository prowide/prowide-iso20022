
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
@XmlType(name = "SecuritiesOption72", propOrder = {
    "condlQty",
    "instdQty",
    "addtlRndUpQty"
})
public class SecuritiesOption72 {

    @XmlElement(name = "CondlQty")
    protected FinancialInstrumentQuantity1Choice condlQty;
    @XmlElement(name = "InstdQty", required = true)
    protected Quantity20Choice instdQty;
    @XmlElement(name = "AddtlRndUpQty")
    protected FinancialInstrumentQuantity1Choice addtlRndUpQty;

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
    public SecuritiesOption72 setCondlQty(FinancialInstrumentQuantity1Choice value) {
        this.condlQty = value;
        return this;
    }

    /**
     * Gets the value of the instdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity20Choice }
     *     
     */
    public Quantity20Choice getInstdQty() {
        return instdQty;
    }

    /**
     * Sets the value of the instdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity20Choice }
     *     
     */
    public SecuritiesOption72 setInstdQty(Quantity20Choice value) {
        this.instdQty = value;
        return this;
    }

    /**
     * Gets the value of the addtlRndUpQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getAddtlRndUpQty() {
        return addtlRndUpQty;
    }

    /**
     * Sets the value of the addtlRndUpQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public SecuritiesOption72 setAddtlRndUpQty(FinancialInstrumentQuantity1Choice value) {
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
