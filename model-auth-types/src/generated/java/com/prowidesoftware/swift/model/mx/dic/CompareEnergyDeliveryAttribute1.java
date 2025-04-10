
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies two values to compare related energy derivatives attributes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompareEnergyDeliveryAttribute1", propOrder = {
    "nrgyDlvryIntrvl",
    "nrgyDt",
    "nrgyDrtn",
    "nrgyWkDay",
    "nrgyDlvryCpcty",
    "nrgyQtyUnit",
    "nrgyPricTmIntrvlQty"
})
public class CompareEnergyDeliveryAttribute1 {

    @XmlElement(name = "NrgyDlvryIntrvl")
    protected List<CompareTimePeriod2> nrgyDlvryIntrvl;
    @XmlElement(name = "NrgyDt")
    protected CompareDatePeriod2 nrgyDt;
    @XmlElement(name = "NrgyDrtn")
    protected CompareDurationType1 nrgyDrtn;
    @XmlElement(name = "NrgyWkDay")
    protected List<CompareWeekDay1> nrgyWkDay;
    @XmlElement(name = "NrgyDlvryCpcty")
    protected CompareLongFraction19DecimalNumber1 nrgyDlvryCpcty;
    @XmlElement(name = "NrgyQtyUnit")
    protected CompareEnergyQuantityUnit1 nrgyQtyUnit;
    @XmlElement(name = "NrgyPricTmIntrvlQty")
    protected CompareAmountAndDirection3 nrgyPricTmIntrvlQty;

    /**
     * Gets the value of the nrgyDlvryIntrvl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nrgyDlvryIntrvl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNrgyDlvryIntrvl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareTimePeriod2 }
     * 
     * 
     * @return
     *     The value of the nrgyDlvryIntrvl property.
     */
    public List<CompareTimePeriod2> getNrgyDlvryIntrvl() {
        if (nrgyDlvryIntrvl == null) {
            nrgyDlvryIntrvl = new ArrayList<>();
        }
        return this.nrgyDlvryIntrvl;
    }

    /**
     * Gets the value of the nrgyDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDatePeriod2 }
     *     
     */
    public CompareDatePeriod2 getNrgyDt() {
        return nrgyDt;
    }

    /**
     * Sets the value of the nrgyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDatePeriod2 }
     *     
     */
    public CompareEnergyDeliveryAttribute1 setNrgyDt(CompareDatePeriod2 value) {
        this.nrgyDt = value;
        return this;
    }

    /**
     * Gets the value of the nrgyDrtn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDurationType1 }
     *     
     */
    public CompareDurationType1 getNrgyDrtn() {
        return nrgyDrtn;
    }

    /**
     * Sets the value of the nrgyDrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDurationType1 }
     *     
     */
    public CompareEnergyDeliveryAttribute1 setNrgyDrtn(CompareDurationType1 value) {
        this.nrgyDrtn = value;
        return this;
    }

    /**
     * Gets the value of the nrgyWkDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nrgyWkDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNrgyWkDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareWeekDay1 }
     * 
     * 
     * @return
     *     The value of the nrgyWkDay property.
     */
    public List<CompareWeekDay1> getNrgyWkDay() {
        if (nrgyWkDay == null) {
            nrgyWkDay = new ArrayList<>();
        }
        return this.nrgyWkDay;
    }

    /**
     * Gets the value of the nrgyDlvryCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public CompareLongFraction19DecimalNumber1 getNrgyDlvryCpcty() {
        return nrgyDlvryCpcty;
    }

    /**
     * Sets the value of the nrgyDlvryCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public CompareEnergyDeliveryAttribute1 setNrgyDlvryCpcty(CompareLongFraction19DecimalNumber1 value) {
        this.nrgyDlvryCpcty = value;
        return this;
    }

    /**
     * Gets the value of the nrgyQtyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareEnergyQuantityUnit1 }
     *     
     */
    public CompareEnergyQuantityUnit1 getNrgyQtyUnit() {
        return nrgyQtyUnit;
    }

    /**
     * Sets the value of the nrgyQtyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareEnergyQuantityUnit1 }
     *     
     */
    public CompareEnergyDeliveryAttribute1 setNrgyQtyUnit(CompareEnergyQuantityUnit1 value) {
        this.nrgyQtyUnit = value;
        return this;
    }

    /**
     * Gets the value of the nrgyPricTmIntrvlQty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public CompareAmountAndDirection3 getNrgyPricTmIntrvlQty() {
        return nrgyPricTmIntrvlQty;
    }

    /**
     * Sets the value of the nrgyPricTmIntrvlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public CompareEnergyDeliveryAttribute1 setNrgyPricTmIntrvlQty(CompareAmountAndDirection3 value) {
        this.nrgyPricTmIntrvlQty = value;
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

    /**
     * Adds a new item to the nrgyDlvryIntrvl list.
     * @see #getNrgyDlvryIntrvl()
     * 
     */
    public CompareEnergyDeliveryAttribute1 addNrgyDlvryIntrvl(CompareTimePeriod2 nrgyDlvryIntrvl) {
        getNrgyDlvryIntrvl().add(nrgyDlvryIntrvl);
        return this;
    }

    /**
     * Adds a new item to the nrgyWkDay list.
     * @see #getNrgyWkDay()
     * 
     */
    public CompareEnergyDeliveryAttribute1 addNrgyWkDay(CompareWeekDay1 nrgyWkDay) {
        getNrgyWkDay().add(nrgyWkDay);
        return this;
    }

}
