
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
@XmlType(name = "SecuritiesOption23", propOrder = {
    "maxExrcblQty",
    "minExrcblQty",
    "minExrcblMltplQty",
    "newBrdLotQty",
    "newDnmtnQty",
    "frntEndOddLotQty",
    "bckEndOddLotQty"
})
public class SecuritiesOption23 {

    @XmlElement(name = "MaxExrcblQty")
    protected FinancialInstrumentQuantity19Choice maxExrcblQty;
    @XmlElement(name = "MinExrcblQty")
    protected FinancialInstrumentQuantity19Choice minExrcblQty;
    @XmlElement(name = "MinExrcblMltplQty")
    protected FinancialInstrumentQuantity20Choice minExrcblMltplQty;
    @XmlElement(name = "NewBrdLotQty")
    protected FinancialInstrumentQuantity20Choice newBrdLotQty;
    @XmlElement(name = "NewDnmtnQty")
    protected FinancialInstrumentQuantity20Choice newDnmtnQty;
    @XmlElement(name = "FrntEndOddLotQty")
    protected FinancialInstrumentQuantity20Choice frntEndOddLotQty;
    @XmlElement(name = "BckEndOddLotQty")
    protected FinancialInstrumentQuantity20Choice bckEndOddLotQty;

    /**
     * Gets the value of the maxExrcblQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity19Choice }
     *     
     */
    public FinancialInstrumentQuantity19Choice getMaxExrcblQty() {
        return maxExrcblQty;
    }

    /**
     * Sets the value of the maxExrcblQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity19Choice }
     *     
     */
    public SecuritiesOption23 setMaxExrcblQty(FinancialInstrumentQuantity19Choice value) {
        this.maxExrcblQty = value;
        return this;
    }

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
    public SecuritiesOption23 setMinExrcblQty(FinancialInstrumentQuantity19Choice value) {
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
    public SecuritiesOption23 setMinExrcblMltplQty(FinancialInstrumentQuantity20Choice value) {
        this.minExrcblMltplQty = value;
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
    public SecuritiesOption23 setNewBrdLotQty(FinancialInstrumentQuantity20Choice value) {
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
    public SecuritiesOption23 setNewDnmtnQty(FinancialInstrumentQuantity20Choice value) {
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
    public SecuritiesOption23 setFrntEndOddLotQty(FinancialInstrumentQuantity20Choice value) {
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
    public SecuritiesOption23 setBckEndOddLotQty(FinancialInstrumentQuantity20Choice value) {
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
