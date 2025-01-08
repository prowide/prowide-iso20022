
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details about strategy order/Iceberg orders.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayInstruction1", propOrder = {
    "qty",
    "scndryQty",
    "mtd",
    "lwQty",
    "hghQty",
    "minIncrmt",
    "rfrshQty",
    "rfrshTm"
})
public class DisplayInstruction1 {

    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantityChoice qty;
    @XmlElement(name = "ScndryQty")
    protected FinancialInstrumentQuantityChoice scndryQty;
    @XmlElement(name = "Mtd")
    @XmlSchemaType(name = "string")
    protected DisplayMethod1Code mtd;
    @XmlElement(name = "LwQty")
    protected FinancialInstrumentQuantityChoice lwQty;
    @XmlElement(name = "HghQty")
    protected FinancialInstrumentQuantityChoice hghQty;
    @XmlElement(name = "MinIncrmt")
    protected FinancialInstrumentQuantityChoice minIncrmt;
    @XmlElement(name = "RfrshQty")
    protected FinancialInstrumentQuantityChoice rfrshQty;
    @XmlElement(name = "RfrshTm")
    @XmlSchemaType(name = "string")
    protected RefreshTime1Code rfrshTm;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public DisplayInstruction1 setQty(FinancialInstrumentQuantityChoice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the scndryQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getScndryQty() {
        return scndryQty;
    }

    /**
     * Sets the value of the scndryQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public DisplayInstruction1 setScndryQty(FinancialInstrumentQuantityChoice value) {
        this.scndryQty = value;
        return this;
    }

    /**
     * Gets the value of the mtd property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayMethod1Code }
     *     
     */
    public DisplayMethod1Code getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayMethod1Code }
     *     
     */
    public DisplayInstruction1 setMtd(DisplayMethod1Code value) {
        this.mtd = value;
        return this;
    }

    /**
     * Gets the value of the lwQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getLwQty() {
        return lwQty;
    }

    /**
     * Sets the value of the lwQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public DisplayInstruction1 setLwQty(FinancialInstrumentQuantityChoice value) {
        this.lwQty = value;
        return this;
    }

    /**
     * Gets the value of the hghQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getHghQty() {
        return hghQty;
    }

    /**
     * Sets the value of the hghQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public DisplayInstruction1 setHghQty(FinancialInstrumentQuantityChoice value) {
        this.hghQty = value;
        return this;
    }

    /**
     * Gets the value of the minIncrmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getMinIncrmt() {
        return minIncrmt;
    }

    /**
     * Sets the value of the minIncrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public DisplayInstruction1 setMinIncrmt(FinancialInstrumentQuantityChoice value) {
        this.minIncrmt = value;
        return this;
    }

    /**
     * Gets the value of the rfrshQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getRfrshQty() {
        return rfrshQty;
    }

    /**
     * Sets the value of the rfrshQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public DisplayInstruction1 setRfrshQty(FinancialInstrumentQuantityChoice value) {
        this.rfrshQty = value;
        return this;
    }

    /**
     * Gets the value of the rfrshTm property.
     * 
     * @return
     *     possible object is
     *     {@link RefreshTime1Code }
     *     
     */
    public RefreshTime1Code getRfrshTm() {
        return rfrshTm;
    }

    /**
     * Sets the value of the rfrshTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshTime1Code }
     *     
     */
    public DisplayInstruction1 setRfrshTm(RefreshTime1Code value) {
        this.rfrshTm = value;
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
