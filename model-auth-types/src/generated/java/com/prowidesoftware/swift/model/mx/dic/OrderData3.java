
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
 * Order related data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderData3", propOrder = {
    "ordrIdData",
    "auctnData",
    "ordrData"
})
public class OrderData3 {

    @XmlElement(name = "OrdrIdData", required = true)
    protected OrderIdentification2 ordrIdData;
    @XmlElement(name = "AuctnData")
    protected AuctionData2 auctnData;
    @XmlElement(name = "OrdrData")
    protected OrderData4 ordrData;

    /**
     * Gets the value of the ordrIdData property.
     * 
     * @return
     *     possible object is
     *     {@link OrderIdentification2 }
     *     
     */
    public OrderIdentification2 getOrdrIdData() {
        return ordrIdData;
    }

    /**
     * Sets the value of the ordrIdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderIdentification2 }
     *     
     */
    public OrderData3 setOrdrIdData(OrderIdentification2 value) {
        this.ordrIdData = value;
        return this;
    }

    /**
     * Gets the value of the auctnData property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionData2 }
     *     
     */
    public AuctionData2 getAuctnData() {
        return auctnData;
    }

    /**
     * Sets the value of the auctnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionData2 }
     *     
     */
    public OrderData3 setAuctnData(AuctionData2 value) {
        this.auctnData = value;
        return this;
    }

    /**
     * Gets the value of the ordrData property.
     * 
     * @return
     *     possible object is
     *     {@link OrderData4 }
     *     
     */
    public OrderData4 getOrdrData() {
        return ordrData;
    }

    /**
     * Sets the value of the ordrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderData4 }
     *     
     */
    public OrderData3 setOrdrData(OrderData4 value) {
        this.ordrData = value;
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
