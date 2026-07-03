
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
 * Specifies the security option of a corporate event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOption81", propOrder = {
    "maxQtyToInst",
    "minQtyToInst",
    "minMltplQtyToInst",
    "newBrdLotQty",
    "newDnmtnQty",
    "frntEndOddLotQty",
    "bckEndOddLotQty"
})
public class SecuritiesOption81 {

    @XmlElement(name = "MaxQtyToInst")
    protected FinancialInstrumentQuantity34Choice maxQtyToInst;
    @XmlElement(name = "MinQtyToInst")
    protected FinancialInstrumentQuantity34Choice minQtyToInst;
    @XmlElement(name = "MinMltplQtyToInst")
    protected FinancialInstrumentQuantity35Choice minMltplQtyToInst;
    @XmlElement(name = "NewBrdLotQty")
    protected FinancialInstrumentQuantity35Choice newBrdLotQty;
    @XmlElement(name = "NewDnmtnQty")
    protected FinancialInstrumentQuantity35Choice newDnmtnQty;
    @XmlElement(name = "FrntEndOddLotQty")
    protected FinancialInstrumentQuantity35Choice frntEndOddLotQty;
    @XmlElement(name = "BckEndOddLotQty")
    protected FinancialInstrumentQuantity35Choice bckEndOddLotQty;

    /**
     * Gets the value of the maxQtyToInst property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public FinancialInstrumentQuantity34Choice getMaxQtyToInst() {
        return maxQtyToInst;
    }

    /**
     * Sets the value of the maxQtyToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public SecuritiesOption81 setMaxQtyToInst(FinancialInstrumentQuantity34Choice value) {
        this.maxQtyToInst = value;
        return this;
    }

    /**
     * Gets the value of the minQtyToInst property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public FinancialInstrumentQuantity34Choice getMinQtyToInst() {
        return minQtyToInst;
    }

    /**
     * Sets the value of the minQtyToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public SecuritiesOption81 setMinQtyToInst(FinancialInstrumentQuantity34Choice value) {
        this.minQtyToInst = value;
        return this;
    }

    /**
     * Gets the value of the minMltplQtyToInst property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getMinMltplQtyToInst() {
        return minMltplQtyToInst;
    }

    /**
     * Sets the value of the minMltplQtyToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public SecuritiesOption81 setMinMltplQtyToInst(FinancialInstrumentQuantity35Choice value) {
        this.minMltplQtyToInst = value;
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
    public SecuritiesOption81 setNewBrdLotQty(FinancialInstrumentQuantity35Choice value) {
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
    public SecuritiesOption81 setNewDnmtnQty(FinancialInstrumentQuantity35Choice value) {
        this.newDnmtnQty = value;
        return this;
    }

    /**
     * Gets the value of the frntEndOddLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getFrntEndOddLotQty() {
        return frntEndOddLotQty;
    }

    /**
     * Sets the value of the frntEndOddLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public SecuritiesOption81 setFrntEndOddLotQty(FinancialInstrumentQuantity35Choice value) {
        this.frntEndOddLotQty = value;
        return this;
    }

    /**
     * Gets the value of the bckEndOddLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getBckEndOddLotQty() {
        return bckEndOddLotQty;
    }

    /**
     * Sets the value of the bckEndOddLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public SecuritiesOption81 setBckEndOddLotQty(FinancialInstrumentQuantity35Choice value) {
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
