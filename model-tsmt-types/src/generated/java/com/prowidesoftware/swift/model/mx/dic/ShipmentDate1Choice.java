
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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

    @XmlElement(name = "PropsdShipmntDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate propsdShipmntDt;
    @XmlElement(name = "ActlShipmntDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate actlShipmntDt;

    /**
     * Gets the value of the propsdShipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getPropsdShipmntDt() {
        return propsdShipmntDt;
    }

    /**
     * Sets the value of the propsdShipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShipmentDate1Choice setPropsdShipmntDt(LocalDate value) {
        this.propsdShipmntDt = value;
        return this;
    }

    /**
     * Gets the value of the actlShipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getActlShipmntDt() {
        return actlShipmntDt;
    }

    /**
     * Sets the value of the actlShipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShipmentDate1Choice setActlShipmntDt(LocalDate value) {
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
