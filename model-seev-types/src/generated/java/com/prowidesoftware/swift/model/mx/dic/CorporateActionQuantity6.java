
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
 * Specifies corporate action quantities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionQuantity6", propOrder = {
    "minExrcblQty",
    "minExrcblMltplQty",
    "maxQty",
    "minQtySght",
    "newBrdLotQty",
    "newDnmtnQty",
    "baseDnmtn",
    "incrmtlDnmtn"
})
public class CorporateActionQuantity6 {

    @XmlElement(name = "MinExrcblQty")
    protected FinancialInstrumentQuantity21Choice minExrcblQty;
    @XmlElement(name = "MinExrcblMltplQty")
    protected FinancialInstrumentQuantity22Choice minExrcblMltplQty;
    @XmlElement(name = "MaxQty")
    protected FinancialInstrumentQuantity21Choice maxQty;
    @XmlElement(name = "MinQtySght")
    protected FinancialInstrumentQuantity21Choice minQtySght;
    @XmlElement(name = "NewBrdLotQty")
    protected FinancialInstrumentQuantity22Choice newBrdLotQty;
    @XmlElement(name = "NewDnmtnQty")
    protected FinancialInstrumentQuantity22Choice newDnmtnQty;
    @XmlElement(name = "BaseDnmtn")
    protected FinancialInstrumentQuantity22Choice baseDnmtn;
    @XmlElement(name = "IncrmtlDnmtn")
    protected FinancialInstrumentQuantity22Choice incrmtlDnmtn;

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
    public CorporateActionQuantity6 setMinExrcblQty(FinancialInstrumentQuantity21Choice value) {
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
    public CorporateActionQuantity6 setMinExrcblMltplQty(FinancialInstrumentQuantity22Choice value) {
        this.minExrcblMltplQty = value;
        return this;
    }

    /**
     * Gets the value of the maxQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity21Choice }
     *     
     */
    public FinancialInstrumentQuantity21Choice getMaxQty() {
        return maxQty;
    }

    /**
     * Sets the value of the maxQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity21Choice }
     *     
     */
    public CorporateActionQuantity6 setMaxQty(FinancialInstrumentQuantity21Choice value) {
        this.maxQty = value;
        return this;
    }

    /**
     * Gets the value of the minQtySght property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity21Choice }
     *     
     */
    public FinancialInstrumentQuantity21Choice getMinQtySght() {
        return minQtySght;
    }

    /**
     * Sets the value of the minQtySght property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity21Choice }
     *     
     */
    public CorporateActionQuantity6 setMinQtySght(FinancialInstrumentQuantity21Choice value) {
        this.minQtySght = value;
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
    public CorporateActionQuantity6 setNewBrdLotQty(FinancialInstrumentQuantity22Choice value) {
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
    public CorporateActionQuantity6 setNewDnmtnQty(FinancialInstrumentQuantity22Choice value) {
        this.newDnmtnQty = value;
        return this;
    }

    /**
     * Gets the value of the baseDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public FinancialInstrumentQuantity22Choice getBaseDnmtn() {
        return baseDnmtn;
    }

    /**
     * Sets the value of the baseDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public CorporateActionQuantity6 setBaseDnmtn(FinancialInstrumentQuantity22Choice value) {
        this.baseDnmtn = value;
        return this;
    }

    /**
     * Gets the value of the incrmtlDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public FinancialInstrumentQuantity22Choice getIncrmtlDnmtn() {
        return incrmtlDnmtn;
    }

    /**
     * Sets the value of the incrmtlDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public CorporateActionQuantity6 setIncrmtlDnmtn(FinancialInstrumentQuantity22Choice value) {
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
