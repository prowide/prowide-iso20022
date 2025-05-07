
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between earliest/latest shipment date and a shipment schedule per sub quantity of line item quantity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentSchedule1Choice", propOrder = {
    "shipmntDtRg",
    "shipmntSubSchdl"
})
public class ShipmentSchedule1Choice {

    @XmlElement(name = "ShipmntDtRg")
    protected ShipmentDateRange1 shipmntDtRg;
    @XmlElement(name = "ShipmntSubSchdl")
    protected List<ShipmentDateRange2> shipmntSubSchdl;

    /**
     * Gets the value of the shipmntDtRg property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDateRange1 }
     *     
     */
    public ShipmentDateRange1 getShipmntDtRg() {
        return shipmntDtRg;
    }

    /**
     * Sets the value of the shipmntDtRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDateRange1 }
     *     
     */
    public ShipmentSchedule1Choice setShipmntDtRg(ShipmentDateRange1 value) {
        this.shipmntDtRg = value;
        return this;
    }

    /**
     * Gets the value of the shipmntSubSchdl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmntSubSchdl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmntSubSchdl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentDateRange2 }
     * 
     * 
     */
    public List<ShipmentDateRange2> getShipmntSubSchdl() {
        if (shipmntSubSchdl == null) {
            shipmntSubSchdl = new ArrayList<ShipmentDateRange2>();
        }
        return this.shipmntSubSchdl;
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
     * Adds a new item to the shipmntSubSchdl list.
     * @see #getShipmntSubSchdl()
     * 
     */
    public ShipmentSchedule1Choice addShipmntSubSchdl(ShipmentDateRange2 shipmntSubSchdl) {
        getShipmntSubSchdl().add(shipmntSubSchdl);
        return this;
    }

}
