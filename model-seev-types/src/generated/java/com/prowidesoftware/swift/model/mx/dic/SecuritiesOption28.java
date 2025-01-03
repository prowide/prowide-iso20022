
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
@XmlType(name = "SecuritiesOption28", propOrder = {
    "maxExrcblQty",
    "minExrcblQty",
    "minExrcblMltplQty",
    "newBrdLotQty",
    "newDnmtnQty",
    "frntEndOddLotQty",
    "bckEndOddLotQty"
})
public class SecuritiesOption28 {

    @XmlElement(name = "MaxExrcblQty")
    protected FinancialInstrumentQuantity21Choice maxExrcblQty;
    @XmlElement(name = "MinExrcblQty")
    protected FinancialInstrumentQuantity21Choice minExrcblQty;
    @XmlElement(name = "MinExrcblMltplQty")
    protected FinancialInstrumentQuantity22Choice minExrcblMltplQty;
    @XmlElement(name = "NewBrdLotQty")
    protected FinancialInstrumentQuantity22Choice newBrdLotQty;
    @XmlElement(name = "NewDnmtnQty")
    protected FinancialInstrumentQuantity22Choice newDnmtnQty;
    @XmlElement(name = "FrntEndOddLotQty")
    protected FinancialInstrumentQuantity22Choice frntEndOddLotQty;
    @XmlElement(name = "BckEndOddLotQty")
    protected FinancialInstrumentQuantity22Choice bckEndOddLotQty;

    /**
     * Gets the value of the maxExrcblQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity21Choice }
     *     
     */
    public FinancialInstrumentQuantity21Choice getMaxExrcblQty() {
        return maxExrcblQty;
    }

    /**
     * Sets the value of the maxExrcblQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity21Choice }
     *     
     */
    public SecuritiesOption28 setMaxExrcblQty(FinancialInstrumentQuantity21Choice value) {
        this.maxExrcblQty = value;
        return this;
    }

    /**
     * Gets the value of the minExrcblQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity21Choice }
     *     
     */
    public FinancialInstrumentQuantity21Choice getMinExrcblQty() {
        return minExrcblQty;
    }

    /**
     * Sets the value of the minExrcblQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity21Choice }
     *     
     */
    public SecuritiesOption28 setMinExrcblQty(FinancialInstrumentQuantity21Choice value) {
        this.minExrcblQty = value;
        return this;
    }

    /**
     * Gets the value of the minExrcblMltplQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public FinancialInstrumentQuantity22Choice getMinExrcblMltplQty() {
        return minExrcblMltplQty;
    }

    /**
     * Sets the value of the minExrcblMltplQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public SecuritiesOption28 setMinExrcblMltplQty(FinancialInstrumentQuantity22Choice value) {
        this.minExrcblMltplQty = value;
        return this;
    }

    /**
     * Gets the value of the newBrdLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public FinancialInstrumentQuantity22Choice getNewBrdLotQty() {
        return newBrdLotQty;
    }

    /**
     * Sets the value of the newBrdLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public SecuritiesOption28 setNewBrdLotQty(FinancialInstrumentQuantity22Choice value) {
        this.newBrdLotQty = value;
        return this;
    }

    /**
     * Gets the value of the newDnmtnQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public FinancialInstrumentQuantity22Choice getNewDnmtnQty() {
        return newDnmtnQty;
    }

    /**
     * Sets the value of the newDnmtnQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public SecuritiesOption28 setNewDnmtnQty(FinancialInstrumentQuantity22Choice value) {
        this.newDnmtnQty = value;
        return this;
    }

    /**
     * Gets the value of the frntEndOddLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public FinancialInstrumentQuantity22Choice getFrntEndOddLotQty() {
        return frntEndOddLotQty;
    }

    /**
     * Sets the value of the frntEndOddLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public SecuritiesOption28 setFrntEndOddLotQty(FinancialInstrumentQuantity22Choice value) {
        this.frntEndOddLotQty = value;
        return this;
    }

    /**
     * Gets the value of the bckEndOddLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public FinancialInstrumentQuantity22Choice getBckEndOddLotQty() {
        return bckEndOddLotQty;
    }

    /**
     * Sets the value of the bckEndOddLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public SecuritiesOption28 setBckEndOddLotQty(FinancialInstrumentQuantity22Choice value) {
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
