
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
 * Details of breakdown of a an amount or quantity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndQuantityBreakdown1", propOrder = {
    "lotNb",
    "lotAmt",
    "lotQty",
    "cshSubBalTp"
})
public class AmountAndQuantityBreakdown1 {

    @XmlElement(name = "LotNb")
    protected GenericIdentification37 lotNb;
    @XmlElement(name = "LotAmt")
    protected AmountAndDirection5 lotAmt;
    @XmlElement(name = "LotQty")
    protected FinancialInstrumentQuantity1Choice lotQty;
    @XmlElement(name = "CshSubBalTp")
    protected GenericIdentification30 cshSubBalTp;

    /**
     * Gets the value of the lotNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getLotNb() {
        return lotNb;
    }

    /**
     * Sets the value of the lotNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public AmountAndQuantityBreakdown1 setLotNb(GenericIdentification37 value) {
        this.lotNb = value;
        return this;
    }

    /**
     * Gets the value of the lotAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getLotAmt() {
        return lotAmt;
    }

    /**
     * Sets the value of the lotAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndQuantityBreakdown1 setLotAmt(AmountAndDirection5 value) {
        this.lotAmt = value;
        return this;
    }

    /**
     * Gets the value of the lotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getLotQty() {
        return lotQty;
    }

    /**
     * Sets the value of the lotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public AmountAndQuantityBreakdown1 setLotQty(FinancialInstrumentQuantity1Choice value) {
        this.lotQty = value;
        return this;
    }

    /**
     * Gets the value of the cshSubBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getCshSubBalTp() {
        return cshSubBalTp;
    }

    /**
     * Sets the value of the cshSubBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public AmountAndQuantityBreakdown1 setCshSubBalTp(GenericIdentification30 value) {
        this.cshSubBalTp = value;
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
