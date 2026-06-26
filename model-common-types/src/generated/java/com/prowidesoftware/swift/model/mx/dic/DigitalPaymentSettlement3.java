
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
 * Specifies the information related to the digital payment settlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalPaymentSettlement3", propOrder = {
    "finInstrmId",
    "qty",
    "dgtlLdgrId"
})
public class DigitalPaymentSettlement3 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification50 finInstrmId;
    @XmlElement(name = "Qty", required = true)
    protected Quantity48Choice qty;
    @XmlElement(name = "DgtlLdgrId", required = true)
    protected String dgtlLdgrId;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification50 }
     *     
     */
    public SecurityIdentification50 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification50 }
     *     
     */
    public DigitalPaymentSettlement3 setFinInstrmId(SecurityIdentification50 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity48Choice }
     *     
     */
    public Quantity48Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity48Choice }
     *     
     */
    public DigitalPaymentSettlement3 setQty(Quantity48Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the dgtlLdgrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDgtlLdgrId() {
        return dgtlLdgrId;
    }

    /**
     * Sets the value of the dgtlLdgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DigitalPaymentSettlement3 setDgtlLdgrId(String value) {
        this.dgtlLdgrId = value;
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
