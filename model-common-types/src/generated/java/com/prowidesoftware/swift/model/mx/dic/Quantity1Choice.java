
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between the quantity expressed in units or face amounts or amortised amount and a relative size (small, medium or large).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity1Choice", propOrder = {
    "qty",
    "rltvSz"
})
public class Quantity1Choice {

    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantityChoice qty;
    @XmlElement(name = "RltvSz")
    @XmlSchemaType(name = "string")
    protected RelativeSize1Code rltvSz;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public Quantity1Choice setQty(FinancialInstrumentQuantityChoice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the rltvSz property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeSize1Code }
     *     
     */
    public RelativeSize1Code getRltvSz() {
        return rltvSz;
    }

    /**
     * Sets the value of the rltvSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeSize1Code }
     *     
     */
    public Quantity1Choice setRltvSz(RelativeSize1Code value) {
        this.rltvSz = value;
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
