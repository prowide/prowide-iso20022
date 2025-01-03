
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
@XmlType(name = "SecuritiesOption16", propOrder = {
    "maxExrcblQty",
    "minExrcblQty",
    "minExrcblMltplQty",
    "newBrdLotQty",
    "newDnmtnQty",
    "frntEndOddLotQty",
    "bckEndOddLotQty"
})
public class SecuritiesOption16 {

    @XmlElement(name = "MaxExrcblQty")
    protected FinancialInstrumentQuantity15Choice maxExrcblQty;
    @XmlElement(name = "MinExrcblQty")
    protected FinancialInstrumentQuantity15Choice minExrcblQty;
    @XmlElement(name = "MinExrcblMltplQty")
    protected FinancialInstrumentQuantity15Choice minExrcblMltplQty;
    @XmlElement(name = "NewBrdLotQty")
    protected FinancialInstrumentQuantity15Choice newBrdLotQty;
    @XmlElement(name = "NewDnmtnQty")
    protected FinancialInstrumentQuantity15Choice newDnmtnQty;
    @XmlElement(name = "FrntEndOddLotQty")
    protected FinancialInstrumentQuantity17Choice frntEndOddLotQty;
    @XmlElement(name = "BckEndOddLotQty")
    protected FinancialInstrumentQuantity17Choice bckEndOddLotQty;

    /**
     * Gets the value of the maxExrcblQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getMaxExrcblQty() {
        return maxExrcblQty;
    }

    /**
     * Sets the value of the maxExrcblQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public SecuritiesOption16 setMaxExrcblQty(FinancialInstrumentQuantity15Choice value) {
        this.maxExrcblQty = value;
        return this;
    }

    /**
     * Gets the value of the minExrcblQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getMinExrcblQty() {
        return minExrcblQty;
    }

    /**
     * Sets the value of the minExrcblQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public SecuritiesOption16 setMinExrcblQty(FinancialInstrumentQuantity15Choice value) {
        this.minExrcblQty = value;
        return this;
    }

    /**
     * Gets the value of the minExrcblMltplQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getMinExrcblMltplQty() {
        return minExrcblMltplQty;
    }

    /**
     * Sets the value of the minExrcblMltplQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public SecuritiesOption16 setMinExrcblMltplQty(FinancialInstrumentQuantity15Choice value) {
        this.minExrcblMltplQty = value;
        return this;
    }

    /**
     * Gets the value of the newBrdLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getNewBrdLotQty() {
        return newBrdLotQty;
    }

    /**
     * Sets the value of the newBrdLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public SecuritiesOption16 setNewBrdLotQty(FinancialInstrumentQuantity15Choice value) {
        this.newBrdLotQty = value;
        return this;
    }

    /**
     * Gets the value of the newDnmtnQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getNewDnmtnQty() {
        return newDnmtnQty;
    }

    /**
     * Sets the value of the newDnmtnQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public SecuritiesOption16 setNewDnmtnQty(FinancialInstrumentQuantity15Choice value) {
        this.newDnmtnQty = value;
        return this;
    }

    /**
     * Gets the value of the frntEndOddLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity17Choice }
     *     
     */
    public FinancialInstrumentQuantity17Choice getFrntEndOddLotQty() {
        return frntEndOddLotQty;
    }

    /**
     * Sets the value of the frntEndOddLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity17Choice }
     *     
     */
    public SecuritiesOption16 setFrntEndOddLotQty(FinancialInstrumentQuantity17Choice value) {
        this.frntEndOddLotQty = value;
        return this;
    }

    /**
     * Gets the value of the bckEndOddLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity17Choice }
     *     
     */
    public FinancialInstrumentQuantity17Choice getBckEndOddLotQty() {
        return bckEndOddLotQty;
    }

    /**
     * Sets the value of the bckEndOddLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity17Choice }
     *     
     */
    public SecuritiesOption16 setBckEndOddLotQty(FinancialInstrumentQuantity17Choice value) {
        this.bckEndOddLotQty = value;
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
