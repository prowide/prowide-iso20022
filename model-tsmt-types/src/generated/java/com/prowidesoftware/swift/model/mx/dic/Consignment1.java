
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Physical packaging of goods for transport.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consignment1", propOrder = {
    "ttlQty",
    "ttlVol",
    "ttlWght"
})
public class Consignment1 {

    @XmlElement(name = "TtlQty")
    protected Quantity3 ttlQty;
    @XmlElement(name = "TtlVol")
    protected Quantity3 ttlVol;
    @XmlElement(name = "TtlWght")
    protected Quantity3 ttlWght;

    /**
     * Gets the value of the ttlQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity3 }
     *     
     */
    public Quantity3 getTtlQty() {
        return ttlQty;
    }

    /**
     * Sets the value of the ttlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity3 }
     *     
     */
    public Consignment1 setTtlQty(Quantity3 value) {
        this.ttlQty = value;
        return this;
    }

    /**
     * Gets the value of the ttlVol property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity3 }
     *     
     */
    public Quantity3 getTtlVol() {
        return ttlVol;
    }

    /**
     * Sets the value of the ttlVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity3 }
     *     
     */
    public Consignment1 setTtlVol(Quantity3 value) {
        this.ttlVol = value;
        return this;
    }

    /**
     * Gets the value of the ttlWght property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity3 }
     *     
     */
    public Quantity3 getTtlWght() {
        return ttlWght;
    }

    /**
     * Sets the value of the ttlWght property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity3 }
     *     
     */
    public Consignment1 setTtlWght(Quantity3 value) {
        this.ttlWght = value;
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
