
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies a shipment schedule, ie, quantity that must be shipped no sooner than the earliest shipment date and no later than the latest shipment date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDateRange2", propOrder = {
    "subQtyVal",
    "earlstShipmntDt",
    "latstShipmntDt"
})
public class ShipmentDateRange2 {

    @XmlElement(name = "SubQtyVal", required = true)
    protected BigDecimal subQtyVal;
    @XmlElement(name = "EarlstShipmntDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earlstShipmntDt;
    @XmlElement(name = "LatstShipmntDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar latstShipmntDt;

    /**
     * Gets the value of the subQtyVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubQtyVal() {
        return subQtyVal;
    }

    /**
     * Sets the value of the subQtyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ShipmentDateRange2 setSubQtyVal(BigDecimal value) {
        this.subQtyVal = value;
        return this;
    }

    /**
     * Gets the value of the earlstShipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarlstShipmntDt() {
        return earlstShipmntDt;
    }

    /**
     * Sets the value of the earlstShipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ShipmentDateRange2 setEarlstShipmntDt(XMLGregorianCalendar value) {
        this.earlstShipmntDt = value;
        return this;
    }

    /**
     * Gets the value of the latstShipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatstShipmntDt() {
        return latstShipmntDt;
    }

    /**
     * Sets the value of the latstShipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ShipmentDateRange2 setLatstShipmntDt(XMLGregorianCalendar value) {
        this.latstShipmntDt = value;
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
