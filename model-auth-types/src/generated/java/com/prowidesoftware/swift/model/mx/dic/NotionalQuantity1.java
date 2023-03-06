
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * Indicates the reference quantity of the transaction and the schedule applicable to the quantity computation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotionalQuantity1", propOrder = {
    "qty",
    "schdl",
    "unitOfMeasr"
})
public class NotionalQuantity1 {

    @XmlElement(name = "Qty", required = true)
    protected BigDecimal qty;
    @XmlElement(name = "Schdl")
    protected List<Schedule2> schdl;
    @XmlElement(name = "UnitOfMeasr", required = true)
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure12Code unitOfMeasr;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public NotionalQuantity1 setQty(BigDecimal value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the schdl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schdl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchdl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule2 }
     * 
     * 
     */
    public List<Schedule2> getSchdl() {
        if (schdl == null) {
            schdl = new ArrayList<Schedule2>();
        }
        return this.schdl;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure12Code }
     *     
     */
    public UnitOfMeasure12Code getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure12Code }
     *     
     */
    public NotionalQuantity1 setUnitOfMeasr(UnitOfMeasure12Code value) {
        this.unitOfMeasr = value;
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
     * Adds a new item to the schdl list.
     * @see #getSchdl()
     * 
     */
    public NotionalQuantity1 addSchdl(Schedule2 schdl) {
        getSchdl().add(schdl);
        return this;
    }

}
