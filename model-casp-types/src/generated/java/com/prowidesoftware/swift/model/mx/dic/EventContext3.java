
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Context of the Retailer Event message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventContext3", propOrder = {
    "svcTp",
    "cmpntId",
    "saleId"
})
public class EventContext3 {

    @XmlElement(name = "SvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService1Code svcTp;
    @XmlElement(name = "CmpntId")
    protected PointOfInteractionComponent11 cmpntId;
    @XmlElement(name = "SaleId")
    protected String saleId;

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService1Code }
     *     
     */
    public RetailerService1Code getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService1Code }
     *     
     */
    public EventContext3 setSvcTp(RetailerService1Code value) {
        this.svcTp = value;
        return this;
    }

    /**
     * Gets the value of the cmpntId property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponent11 }
     *     
     */
    public PointOfInteractionComponent11 getCmpntId() {
        return cmpntId;
    }

    /**
     * Sets the value of the cmpntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponent11 }
     *     
     */
    public EventContext3 setCmpntId(PointOfInteractionComponent11 value) {
        this.cmpntId = value;
        return this;
    }

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EventContext3 setSaleId(String value) {
        this.saleId = value;
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
