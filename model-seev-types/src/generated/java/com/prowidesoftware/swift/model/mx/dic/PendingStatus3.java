
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
 * Status and quantity information related to a pending instruction request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingStatus3", propOrder = {
    "pdgQty",
    "pdgRsn"
})
public class PendingStatus3 {

    @XmlElement(name = "PdgQty")
    protected Quantity51Choice pdgQty;
    @XmlElement(name = "PdgRsn", required = true)
    protected PendingStatus80Choice pdgRsn;

    /**
     * Gets the value of the pdgQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getPdgQty() {
        return pdgQty;
    }

    /**
     * Sets the value of the pdgQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public PendingStatus3 setPdgQty(Quantity51Choice value) {
        this.pdgQty = value;
        return this;
    }

    /**
     * Gets the value of the pdgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus80Choice }
     *     
     */
    public PendingStatus80Choice getPdgRsn() {
        return pdgRsn;
    }

    /**
     * Sets the value of the pdgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus80Choice }
     *     
     */
    public PendingStatus3 setPdgRsn(PendingStatus80Choice value) {
        this.pdgRsn = value;
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
