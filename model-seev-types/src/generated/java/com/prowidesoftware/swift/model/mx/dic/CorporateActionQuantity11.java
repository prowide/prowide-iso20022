
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
 * Specifies corporate action quantities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionQuantity11", propOrder = {
    "maxQty",
    "minQtySght",
    "newBrdLotQty",
    "newDnmtnQty",
    "baseDnmtn",
    "incrmtlDnmtn"
})
public class CorporateActionQuantity11 {

    @XmlElement(name = "MaxQty")
    protected FinancialInstrumentQuantity34Choice maxQty;
    @XmlElement(name = "MinQtySght")
    protected FinancialInstrumentQuantity34Choice minQtySght;
    @XmlElement(name = "NewBrdLotQty")
    protected FinancialInstrumentQuantity35Choice newBrdLotQty;
    @XmlElement(name = "NewDnmtnQty")
    protected FinancialInstrumentQuantity35Choice newDnmtnQty;
    @XmlElement(name = "BaseDnmtn")
    protected FinancialInstrumentQuantity35Choice baseDnmtn;
    @XmlElement(name = "IncrmtlDnmtn")
    protected FinancialInstrumentQuantity35Choice incrmtlDnmtn;

    /**
     * Gets the value of the maxQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public FinancialInstrumentQuantity34Choice getMaxQty() {
        return maxQty;
    }

    /**
     * Sets the value of the maxQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public CorporateActionQuantity11 setMaxQty(FinancialInstrumentQuantity34Choice value) {
        this.maxQty = value;
        return this;
    }

    /**
     * Gets the value of the minQtySght property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public FinancialInstrumentQuantity34Choice getMinQtySght() {
        return minQtySght;
    }

    /**
     * Sets the value of the minQtySght property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public CorporateActionQuantity11 setMinQtySght(FinancialInstrumentQuantity34Choice value) {
        this.minQtySght = value;
        return this;
    }

    /**
     * Gets the value of the newBrdLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getNewBrdLotQty() {
        return newBrdLotQty;
    }

    /**
     * Sets the value of the newBrdLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public CorporateActionQuantity11 setNewBrdLotQty(FinancialInstrumentQuantity35Choice value) {
        this.newBrdLotQty = value;
        return this;
    }

    /**
     * Gets the value of the newDnmtnQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getNewDnmtnQty() {
        return newDnmtnQty;
    }

    /**
     * Sets the value of the newDnmtnQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public CorporateActionQuantity11 setNewDnmtnQty(FinancialInstrumentQuantity35Choice value) {
        this.newDnmtnQty = value;
        return this;
    }

    /**
     * Gets the value of the baseDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getBaseDnmtn() {
        return baseDnmtn;
    }

    /**
     * Sets the value of the baseDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public CorporateActionQuantity11 setBaseDnmtn(FinancialInstrumentQuantity35Choice value) {
        this.baseDnmtn = value;
        return this;
    }

    /**
     * Gets the value of the incrmtlDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getIncrmtlDnmtn() {
        return incrmtlDnmtn;
    }

    /**
     * Sets the value of the incrmtlDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public CorporateActionQuantity11 setIncrmtlDnmtn(FinancialInstrumentQuantity35Choice value) {
        this.incrmtlDnmtn = value;
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
