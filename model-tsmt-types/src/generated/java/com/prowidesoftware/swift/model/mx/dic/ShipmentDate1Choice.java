
package com.prowidesoftware.swift.model.mx.dic;

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
 * Choice between proposed and actual shipment date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDate1Choice", propOrder = {
    "propsdShipmntDt",
    "actlShipmntDt"
})
public class ShipmentDate1Choice {

    @XmlElement(name = "PropsdShipmntDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar propsdShipmntDt;
    @XmlElement(name = "ActlShipmntDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actlShipmntDt;

    /**
     * Gets the value of the propsdShipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPropsdShipmntDt() {
        return propsdShipmntDt;
    }

    /**
     * Sets the value of the propsdShipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ShipmentDate1Choice setPropsdShipmntDt(XMLGregorianCalendar value) {
        this.propsdShipmntDt = value;
        return this;
    }

    /**
     * Gets the value of the actlShipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActlShipmntDt() {
        return actlShipmntDt;
    }

    /**
     * Sets the value of the actlShipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ShipmentDate1Choice setActlShipmntDt(XMLGregorianCalendar value) {
        this.actlShipmntDt = value;
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
