
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to energy derivatives attributes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyDeliveryAttribute10", propOrder = {
    "dlvryIntrvl",
    "dlvryDt",
    "drtn",
    "wkDay",
    "dlvryCpcty",
    "qtyUnit",
    "pricTmIntrvlQty"
})
public class EnergyDeliveryAttribute10 {

    @XmlElement(name = "DlvryIntrvl")
    protected List<TimePeriodDetails1> dlvryIntrvl;
    @XmlElement(name = "DlvryDt")
    protected DatePeriod1 dlvryDt;
    @XmlElement(name = "Drtn")
    @XmlSchemaType(name = "string")
    protected DurationType1Code drtn;
    @XmlElement(name = "WkDay")
    @XmlSchemaType(name = "string")
    protected List<WeekDay3Code> wkDay;
    @XmlElement(name = "DlvryCpcty")
    protected Quantity47Choice dlvryCpcty;
    @XmlElement(name = "QtyUnit")
    protected EnergyQuantityUnit2Choice qtyUnit;
    @XmlElement(name = "PricTmIntrvlQty")
    protected AmountAndDirection106 pricTmIntrvlQty;

    /**
     * Gets the value of the dlvryIntrvl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dlvryIntrvl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryIntrvl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodDetails1 }
     * 
     * 
     */
    public List<TimePeriodDetails1> getDlvryIntrvl() {
        if (dlvryIntrvl == null) {
            dlvryIntrvl = new ArrayList<TimePeriodDetails1>();
        }
        return this.dlvryIntrvl;
    }

    /**
     * Gets the value of the dlvryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod1 }
     *     
     */
    public DatePeriod1 getDlvryDt() {
        return dlvryDt;
    }

    /**
     * Sets the value of the dlvryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod1 }
     *     
     */
    public EnergyDeliveryAttribute10 setDlvryDt(DatePeriod1 value) {
        this.dlvryDt = value;
        return this;
    }

    /**
     * Gets the value of the drtn property.
     * 
     * @return
     *     possible object is
     *     {@link DurationType1Code }
     *     
     */
    public DurationType1Code getDrtn() {
        return drtn;
    }

    /**
     * Sets the value of the drtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType1Code }
     *     
     */
    public EnergyDeliveryAttribute10 setDrtn(DurationType1Code value) {
        this.drtn = value;
        return this;
    }

    /**
     * Gets the value of the wkDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wkDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWkDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeekDay3Code }
     * 
     * 
     */
    public List<WeekDay3Code> getWkDay() {
        if (wkDay == null) {
            wkDay = new ArrayList<WeekDay3Code>();
        }
        return this.wkDay;
    }

    /**
     * Gets the value of the dlvryCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity47Choice }
     *     
     */
    public Quantity47Choice getDlvryCpcty() {
        return dlvryCpcty;
    }

    /**
     * Sets the value of the dlvryCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity47Choice }
     *     
     */
    public EnergyDeliveryAttribute10 setDlvryCpcty(Quantity47Choice value) {
        this.dlvryCpcty = value;
        return this;
    }

    /**
     * Gets the value of the qtyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyQuantityUnit2Choice }
     *     
     */
    public EnergyQuantityUnit2Choice getQtyUnit() {
        return qtyUnit;
    }

    /**
     * Sets the value of the qtyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyQuantityUnit2Choice }
     *     
     */
    public EnergyDeliveryAttribute10 setQtyUnit(EnergyQuantityUnit2Choice value) {
        this.qtyUnit = value;
        return this;
    }

    /**
     * Gets the value of the pricTmIntrvlQty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public AmountAndDirection106 getPricTmIntrvlQty() {
        return pricTmIntrvlQty;
    }

    /**
     * Sets the value of the pricTmIntrvlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public EnergyDeliveryAttribute10 setPricTmIntrvlQty(AmountAndDirection106 value) {
        this.pricTmIntrvlQty = value;
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
     * Adds a new item to the dlvryIntrvl list.
     * @see #getDlvryIntrvl()
     * 
     */
    public EnergyDeliveryAttribute10 addDlvryIntrvl(TimePeriodDetails1 dlvryIntrvl) {
        getDlvryIntrvl().add(dlvryIntrvl);
        return this;
    }

    /**
     * Adds a new item to the wkDay list.
     * @see #getWkDay()
     * 
     */
    public EnergyDeliveryAttribute10 addWkDay(WeekDay3Code wkDay) {
        getWkDay().add(wkDay);
        return this;
    }

}
