
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
@XmlType(name = "CorporateActionQuantity5", propOrder = {
    "minExrcblQty",
    "minExrcblMltplQty",
    "maxQty",
    "minQtySght",
    "newBrdLotQty",
    "newDnmtnQty",
    "baseDnmtn",
    "incrmtlDnmtn"
})
public class CorporateActionQuantity5 {

    @XmlElement(name = "MinExrcblQty")
    protected FinancialInstrumentQuantity19Choice minExrcblQty;
    @XmlElement(name = "MinExrcblMltplQty")
    protected FinancialInstrumentQuantity20Choice minExrcblMltplQty;
    @XmlElement(name = "MaxQty")
    protected FinancialInstrumentQuantity19Choice maxQty;
    @XmlElement(name = "MinQtySght")
    protected FinancialInstrumentQuantity19Choice minQtySght;
    @XmlElement(name = "NewBrdLotQty")
    protected FinancialInstrumentQuantity20Choice newBrdLotQty;
    @XmlElement(name = "NewDnmtnQty")
    protected FinancialInstrumentQuantity20Choice newDnmtnQty;
    @XmlElement(name = "BaseDnmtn")
    protected FinancialInstrumentQuantity20Choice baseDnmtn;
    @XmlElement(name = "IncrmtlDnmtn")
    protected FinancialInstrumentQuantity20Choice incrmtlDnmtn;

    /**
     * Gets the value of the minExrcblQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity19Choice }
     *     
     */
    public FinancialInstrumentQuantity19Choice getMinExrcblQty() {
        return minExrcblQty;
    }

    /**
     * Sets the value of the minExrcblQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity19Choice }
     *     
     */
    public CorporateActionQuantity5 setMinExrcblQty(FinancialInstrumentQuantity19Choice value) {
        this.minExrcblQty = value;
        return this;
    }

    /**
     * Gets the value of the minExrcblMltplQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public FinancialInstrumentQuantity20Choice getMinExrcblMltplQty() {
        return minExrcblMltplQty;
    }

    /**
     * Sets the value of the minExrcblMltplQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public CorporateActionQuantity5 setMinExrcblMltplQty(FinancialInstrumentQuantity20Choice value) {
        this.minExrcblMltplQty = value;
        return this;
    }

    /**
     * Gets the value of the maxQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity19Choice }
     *     
     */
    public FinancialInstrumentQuantity19Choice getMaxQty() {
        return maxQty;
    }

    /**
     * Sets the value of the maxQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity19Choice }
     *     
     */
    public CorporateActionQuantity5 setMaxQty(FinancialInstrumentQuantity19Choice value) {
        this.maxQty = value;
        return this;
    }

    /**
     * Gets the value of the minQtySght property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity19Choice }
     *     
     */
    public FinancialInstrumentQuantity19Choice getMinQtySght() {
        return minQtySght;
    }

    /**
     * Sets the value of the minQtySght property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity19Choice }
     *     
     */
    public CorporateActionQuantity5 setMinQtySght(FinancialInstrumentQuantity19Choice value) {
        this.minQtySght = value;
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
    public CorporateActionQuantity5 setNewBrdLotQty(FinancialInstrumentQuantity20Choice value) {
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
    public CorporateActionQuantity5 setNewDnmtnQty(FinancialInstrumentQuantity20Choice value) {
        this.newDnmtnQty = value;
        return this;
    }

    /**
     * Gets the value of the baseDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public FinancialInstrumentQuantity20Choice getBaseDnmtn() {
        return baseDnmtn;
    }

    /**
     * Sets the value of the baseDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public CorporateActionQuantity5 setBaseDnmtn(FinancialInstrumentQuantity20Choice value) {
        this.baseDnmtn = value;
        return this;
    }

    /**
     * Gets the value of the incrmtlDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public FinancialInstrumentQuantity20Choice getIncrmtlDnmtn() {
        return incrmtlDnmtn;
    }

    /**
     * Sets the value of the incrmtlDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity20Choice }
     *     
     */
    public CorporateActionQuantity5 setIncrmtlDnmtn(FinancialInstrumentQuantity20Choice value) {
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
