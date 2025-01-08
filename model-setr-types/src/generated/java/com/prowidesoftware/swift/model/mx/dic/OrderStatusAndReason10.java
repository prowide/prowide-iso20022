
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
 * Status report of a bulk or multiple or switch order that was previously received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusAndReason10", propOrder = {
    "mstrRef",
    "ordrSts",
    "stsInitr"
})
public class OrderStatusAndReason10 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "OrdrSts", required = true)
    protected OrderStatus3Choice ordrSts;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification113 stsInitr;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderStatusAndReason10 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrSts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus3Choice }
     *     
     */
    public OrderStatus3Choice getOrdrSts() {
        return ordrSts;
    }

    /**
     * Sets the value of the ordrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus3Choice }
     *     
     */
    public OrderStatusAndReason10 setOrdrSts(OrderStatus3Choice value) {
        this.ordrSts = value;
        return this;
    }

    /**
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public OrderStatusAndReason10 setStsInitr(PartyIdentification113 value) {
        this.stsInitr = value;
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
