
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
 * Specifies securities quantities for corporate action instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOption88", propOrder = {
    "condlQty",
    "instdQty",
    "addtlRndUpQty"
})
public class SecuritiesOption88 {

    @XmlElement(name = "CondlQty")
    protected FinancialInstrumentQuantity36Choice condlQty;
    @XmlElement(name = "InstdQty", required = true)
    protected Quantity55Choice instdQty;
    @XmlElement(name = "AddtlRndUpQty")
    protected FinancialInstrumentQuantity36Choice addtlRndUpQty;

    /**
     * Gets the value of the condlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getCondlQty() {
        return condlQty;
    }

    /**
     * Sets the value of the condlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public SecuritiesOption88 setCondlQty(FinancialInstrumentQuantity36Choice value) {
        this.condlQty = value;
        return this;
    }

    /**
     * Gets the value of the instdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity55Choice }
     *     
     */
    public Quantity55Choice getInstdQty() {
        return instdQty;
    }

    /**
     * Sets the value of the instdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity55Choice }
     *     
     */
    public SecuritiesOption88 setInstdQty(Quantity55Choice value) {
        this.instdQty = value;
        return this;
    }

    /**
     * Gets the value of the addtlRndUpQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getAddtlRndUpQty() {
        return addtlRndUpQty;
    }

    /**
     * Sets the value of the addtlRndUpQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public SecuritiesOption88 setAddtlRndUpQty(FinancialInstrumentQuantity36Choice value) {
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
