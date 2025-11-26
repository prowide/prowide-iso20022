
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
 * Choice of an order report either as a new report or as a cancellation report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderReport2Choice", propOrder = {
    "_new",
    "cxl"
})
public class OrderReport2Choice {

    @XmlElement(name = "New")
    protected NewOrderReport2 _new;
    @XmlElement(name = "Cxl")
    protected CancelOrderReport1 cxl;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link NewOrderReport2 }
     *     
     */
    public NewOrderReport2 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewOrderReport2 }
     *     
     */
    public OrderReport2Choice setNew(NewOrderReport2 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link CancelOrderReport1 }
     *     
     */
    public CancelOrderReport1 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelOrderReport1 }
     *     
     */
    public OrderReport2Choice setCxl(CancelOrderReport1 value) {
        this.cxl = value;
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
