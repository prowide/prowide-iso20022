
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
@XmlType(name = "SecuritiesOption51", propOrder = {
    "maxQtyToInst",
    "minQtyToInst",
    "minMltplQtyToInst",
    "newBrdLotQty",
    "newDnmtnQty",
    "frntEndOddLotQty",
    "bckEndOddLotQty"
})
public class SecuritiesOption51 {

    @XmlElement(name = "MaxQtyToInst")
    protected FinancialInstrumentQuantity19Choice maxQtyToInst;
    @XmlElement(name = "MinQtyToInst")
    protected FinancialInstrumentQuantity19Choice minQtyToInst;
    @XmlElement(name = "MinMltplQtyToInst")
    protected FinancialInstrumentQuantity20Choice minMltplQtyToInst;
    @XmlElement(name = "NewBrdLotQty")
    protected FinancialInstrumentQuantity20Choice newBrdLotQty;
    @XmlElement(name = "NewDnmtnQty")
    protected FinancialInstrumentQuantity20Choice newDnmtnQty;
    @XmlElement(name = "FrntEndOddLotQty")
    protected FinancialInstrumentQuantity20Choice frntEndOddLotQty;
    @XmlElement(name = "BckEndOddLotQty")
    protected FinancialInstrumentQuantity20Choice bckEndOddLotQty;

    /**
     * Gets the value of the maxQtyToInst property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity19Choice }
     *     
     */
    public FinancialInstrumentQuantity19Choice getMaxQtyToInst() {
        return maxQtyToInst;
    }

    /**
     * Sets the value of the maxQtyToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity19Choice }
     *     
     */
    public SecuritiesOption51 setMaxQtyToInst(FinancialInstrumentQuantity19Choice value) {
        this.maxQtyToInst = value;
        return this;
    }

    /**
     * Gets the value of the minQtyToInst property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity19Choice }
     *     
     */
    public FinancialInstrumentQuantity19Choice getMinQtyToInst() {
        return minQtyToInst;
    }

    /**
     * Sets the value of the minQtyToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity19Choice }
     *     
     */
    public SecuritiesOption51 setMinQtyToInst(FinancialInstrumentQuantity19Choice value) {
        this.minQtyToInst = value;
        return this;
    }

    /**
     * Gets the value of the minMltplQtyToInst property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public FinancialInstrumentQuantity20Choice getMinMltplQtyToInst() {
        return minMltplQtyToInst;
    }

    /**
     * Sets the value of the minMltplQtyToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public SecuritiesOption51 setMinMltplQtyToInst(FinancialInstrumentQuantity20Choice value) {
        this.minMltplQtyToInst = value;
        return this;
    }

    /**
     * Gets the value of the newBrdLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public FinancialInstrumentQuantity20Choice getNewBrdLotQty() {
        return newBrdLotQty;
    }

    /**
     * Sets the value of the newBrdLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public SecuritiesOption51 setNewBrdLotQty(FinancialInstrumentQuantity20Choice value) {
        this.newBrdLotQty = value;
        return this;
    }

    /**
     * Gets the value of the newDnmtnQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public FinancialInstrumentQuantity20Choice getNewDnmtnQty() {
        return newDnmtnQty;
    }

    /**
     * Sets the value of the newDnmtnQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public SecuritiesOption51 setNewDnmtnQty(FinancialInstrumentQuantity20Choice value) {
        this.newDnmtnQty = value;
        return this;
    }

    /**
     * Gets the value of the frntEndOddLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public FinancialInstrumentQuantity20Choice getFrntEndOddLotQty() {
        return frntEndOddLotQty;
    }

    /**
     * Sets the value of the frntEndOddLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public SecuritiesOption51 setFrntEndOddLotQty(FinancialInstrumentQuantity20Choice value) {
        this.frntEndOddLotQty = value;
        return this;
    }

    /**
     * Gets the value of the bckEndOddLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public FinancialInstrumentQuantity20Choice getBckEndOddLotQty() {
        return bckEndOddLotQty;
    }

    /**
     * Sets the value of the bckEndOddLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public SecuritiesOption51 setBckEndOddLotQty(FinancialInstrumentQuantity20Choice value) {
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
