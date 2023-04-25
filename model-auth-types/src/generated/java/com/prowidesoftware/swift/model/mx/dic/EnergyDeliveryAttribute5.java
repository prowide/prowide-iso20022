
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "EnergyDeliveryAttribute5", propOrder = {
    "dlvryIntrvl",
    "dlvryPrd",
    "dlvryTm",
    "drtn",
    "wkDay",
    "dlvryCpcty",
    "qtyUnit",
    "pricTmIntrvlQty"
})
public class EnergyDeliveryAttribute5 {

    @XmlElement(name = "DlvryIntrvl", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected Calendar dlvryIntrvl;
    @XmlElement(name = "DlvryPrd")
    protected DateTimePeriod1 dlvryPrd;
    @XmlElement(name = "DlvryTm")
    protected List<TimePeriodDetails1> dlvryTm;
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
    protected BigDecimal pricTmIntrvlQty;

    /**
     * Gets the value of the dlvryIntrvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDlvryIntrvl() {
        return dlvryIntrvl;
    }

    /**
     * Sets the value of the dlvryIntrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EnergyDeliveryAttribute5 setDlvryIntrvl(Calendar value) {
        this.dlvryIntrvl = value;
        return this;
    }

    /**
     * Gets the value of the dlvryPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getDlvryPrd() {
        return dlvryPrd;
    }

    /**
     * Sets the value of the dlvryPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public EnergyDeliveryAttribute5 setDlvryPrd(DateTimePeriod1 value) {
        this.dlvryPrd = value;
        return this;
    }

    /**
     * Gets the value of the dlvryTm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dlvryTm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryTm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodDetails1 }
     * 
     * 
     * @return
     *     The value of the dlvryTm property.
     */
    public List<TimePeriodDetails1> getDlvryTm() {
        if (dlvryTm == null) {
            dlvryTm = new ArrayList<>();
        }
        return this.dlvryTm;
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
    public EnergyDeliveryAttribute5 setDrtn(DurationType1Code value) {
        this.drtn = value;
        return this;
    }

    /**
     * Gets the value of the wkDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wkDay property.
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
     * @return
     *     The value of the wkDay property.
     */
    public List<WeekDay3Code> getWkDay() {
        if (wkDay == null) {
            wkDay = new ArrayList<>();
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
    public EnergyDeliveryAttribute5 setDlvryCpcty(Quantity47Choice value) {
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
    public EnergyDeliveryAttribute5 setQtyUnit(EnergyQuantityUnit2Choice value) {
        this.qtyUnit = value;
        return this;
    }

    /**
     * Gets the value of the pricTmIntrvlQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricTmIntrvlQty() {
        return pricTmIntrvlQty;
    }

    /**
     * Sets the value of the pricTmIntrvlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public EnergyDeliveryAttribute5 setPricTmIntrvlQty(BigDecimal value) {
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
     * Adds a new item to the dlvryTm list.
     * @see #getDlvryTm()
     * 
     */
    public EnergyDeliveryAttribute5 addDlvryTm(TimePeriodDetails1 dlvryTm) {
        getDlvryTm().add(dlvryTm);
        return this;
    }

    /**
     * Adds a new item to the wkDay list.
     * @see #getWkDay()
     * 
     */
    public EnergyDeliveryAttribute5 addWkDay(WeekDay3Code wkDay) {
        getWkDay().add(wkDay);
        return this;
    }

}
