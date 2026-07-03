
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
@XmlType(name = "SecuritiesOption84", propOrder = {
    "maxQtyToInst",
    "minQtyToInst",
    "minMltplQtyToInst",
    "newBrdLotQty",
    "newDnmtnQty",
    "frntEndOddLotQty",
    "bckEndOddLotQty"
})
public class SecuritiesOption84 {

    @XmlElement(name = "MaxQtyToInst")
    protected FinancialInstrumentQuantity44Choice maxQtyToInst;
    @XmlElement(name = "MinQtyToInst")
    protected FinancialInstrumentQuantity44Choice minQtyToInst;
    @XmlElement(name = "MinMltplQtyToInst")
    protected FinancialInstrumentQuantity43Choice minMltplQtyToInst;
    @XmlElement(name = "NewBrdLotQty")
    protected FinancialInstrumentQuantity43Choice newBrdLotQty;
    @XmlElement(name = "NewDnmtnQty")
    protected FinancialInstrumentQuantity43Choice newDnmtnQty;
    @XmlElement(name = "FrntEndOddLotQty")
    protected FinancialInstrumentQuantity43Choice frntEndOddLotQty;
    @XmlElement(name = "BckEndOddLotQty")
    protected FinancialInstrumentQuantity43Choice bckEndOddLotQty;

    /**
     * Gets the value of the maxQtyToInst property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity44Choice }
     *     
     */
    public FinancialInstrumentQuantity44Choice getMaxQtyToInst() {
        return maxQtyToInst;
    }

    /**
     * Sets the value of the maxQtyToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity44Choice }
     *     
     */
    public SecuritiesOption84 setMaxQtyToInst(FinancialInstrumentQuantity44Choice value) {
        this.maxQtyToInst = value;
        return this;
    }

    /**
     * Gets the value of the minQtyToInst property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity44Choice }
     *     
     */
    public FinancialInstrumentQuantity44Choice getMinQtyToInst() {
        return minQtyToInst;
    }

    /**
     * Sets the value of the minQtyToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity44Choice }
     *     
     */
    public SecuritiesOption84 setMinQtyToInst(FinancialInstrumentQuantity44Choice value) {
        this.minQtyToInst = value;
        return this;
    }

    /**
     * Gets the value of the minMltplQtyToInst property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity43Choice }
     *     
     */
    public FinancialInstrumentQuantity43Choice getMinMltplQtyToInst() {
        return minMltplQtyToInst;
    }

    /**
     * Sets the value of the minMltplQtyToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity43Choice }
     *     
     */
    public SecuritiesOption84 setMinMltplQtyToInst(FinancialInstrumentQuantity43Choice value) {
        this.minMltplQtyToInst = value;
        return this;
    }

    /**
     * Gets the value of the newBrdLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity43Choice }
     *     
     */
    public FinancialInstrumentQuantity43Choice getNewBrdLotQty() {
        return newBrdLotQty;
    }

    /**
     * Sets the value of the newBrdLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity43Choice }
     *     
     */
    public SecuritiesOption84 setNewBrdLotQty(FinancialInstrumentQuantity43Choice value) {
        this.newBrdLotQty = value;
        return this;
    }

    /**
     * Gets the value of the newDnmtnQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity43Choice }
     *     
     */
    public FinancialInstrumentQuantity43Choice getNewDnmtnQty() {
        return newDnmtnQty;
    }

    /**
     * Sets the value of the newDnmtnQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity43Choice }
     *     
     */
    public SecuritiesOption84 setNewDnmtnQty(FinancialInstrumentQuantity43Choice value) {
        this.newDnmtnQty = value;
        return this;
    }

    /**
     * Gets the value of the frntEndOddLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity43Choice }
     *     
     */
    public FinancialInstrumentQuantity43Choice getFrntEndOddLotQty() {
        return frntEndOddLotQty;
    }

    /**
     * Sets the value of the frntEndOddLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity43Choice }
     *     
     */
    public SecuritiesOption84 setFrntEndOddLotQty(FinancialInstrumentQuantity43Choice value) {
        this.frntEndOddLotQty = value;
        return this;
    }

    /**
     * Gets the value of the bckEndOddLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity43Choice }
     *     
     */
    public FinancialInstrumentQuantity43Choice getBckEndOddLotQty() {
        return bckEndOddLotQty;
    }

    /**
     * Sets the value of the bckEndOddLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity43Choice }
     *     
     */
    public SecuritiesOption84 setBckEndOddLotQty(FinancialInstrumentQuantity43Choice value) {
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
