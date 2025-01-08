
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
@XmlType(name = "SecuritiesQuantityDetailsSD3", propOrder = {
    "ovrsbcptQty",
    "ttlOvrsbcptQty",
    "instrQty"
})
public class SecuritiesQuantityDetailsSD3 {

    @XmlElement(name = "OvrsbcptQty")
    protected FinancialInstrumentQuantity4 ovrsbcptQty;
    @XmlElement(name = "TtlOvrsbcptQty")
    protected FinancialInstrumentQuantity4 ttlOvrsbcptQty;
    @XmlElement(name = "InstrQty")
    protected FinancialInstrumentQuantity31Choice instrQty;

    /**
     * Gets the value of the ovrsbcptQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity4 }
     *     
     */
    public FinancialInstrumentQuantity4 getOvrsbcptQty() {
        return ovrsbcptQty;
    }

    /**
     * Sets the value of the ovrsbcptQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity4 }
     *     
     */
    public SecuritiesQuantityDetailsSD3 setOvrsbcptQty(FinancialInstrumentQuantity4 value) {
        this.ovrsbcptQty = value;
        return this;
    }

    /**
     * Gets the value of the ttlOvrsbcptQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity4 }
     *     
     */
    public FinancialInstrumentQuantity4 getTtlOvrsbcptQty() {
        return ttlOvrsbcptQty;
    }

    /**
     * Sets the value of the ttlOvrsbcptQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity4 }
     *     
     */
    public SecuritiesQuantityDetailsSD3 setTtlOvrsbcptQty(FinancialInstrumentQuantity4 value) {
        this.ttlOvrsbcptQty = value;
        return this;
    }

    /**
     * Gets the value of the instrQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public FinancialInstrumentQuantity31Choice getInstrQty() {
        return instrQty;
    }

    /**
     * Sets the value of the instrQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity31Choice }
     *     
     */
    public SecuritiesQuantityDetailsSD3 setInstrQty(FinancialInstrumentQuantity31Choice value) {
        this.instrQty = value;
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
