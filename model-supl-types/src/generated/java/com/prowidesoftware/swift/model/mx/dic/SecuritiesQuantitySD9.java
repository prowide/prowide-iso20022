
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
 * Provides information about securities quantity linked to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesQuantitySD9", propOrder = {
    "ttlOvrsbcptQty",
    "intrmCvrdQty",
    "condlQty"
})
public class SecuritiesQuantitySD9 {

    @XmlElement(name = "TtlOvrsbcptQty")
    protected FinancialInstrumentQuantity31Choice ttlOvrsbcptQty;
    @XmlElement(name = "IntrmCvrdQty")
    protected FinancialInstrumentQuantity31Choice intrmCvrdQty;
    @XmlElement(name = "CondlQty")
    protected FinancialInstrumentQuantity15Choice condlQty;

    /**
     * Gets the value of the ttlOvrsbcptQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public FinancialInstrumentQuantity31Choice getTtlOvrsbcptQty() {
        return ttlOvrsbcptQty;
    }

    /**
     * Sets the value of the ttlOvrsbcptQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public SecuritiesQuantitySD9 setTtlOvrsbcptQty(FinancialInstrumentQuantity31Choice value) {
        this.ttlOvrsbcptQty = value;
        return this;
    }

    /**
     * Gets the value of the intrmCvrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public FinancialInstrumentQuantity31Choice getIntrmCvrdQty() {
        return intrmCvrdQty;
    }

    /**
     * Sets the value of the intrmCvrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public SecuritiesQuantitySD9 setIntrmCvrdQty(FinancialInstrumentQuantity31Choice value) {
        this.intrmCvrdQty = value;
        return this;
    }

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
    public SecuritiesQuantitySD9 setCondlQty(FinancialInstrumentQuantity15Choice value) {
        this.condlQty = value;
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
