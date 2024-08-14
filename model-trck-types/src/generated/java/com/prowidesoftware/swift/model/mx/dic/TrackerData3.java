
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
 * Specifies the detailed information as provided by a payment tracking system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerData3", propOrder = {
    "confdDt",
    "confdAmt",
    "trckrRcrd"
})
public class TrackerData3 {

    @XmlElement(name = "ConfdDt", required = true)
    protected DateTime1 confdDt;
    @XmlElement(name = "ConfdAmt", required = true)
    protected RestrictedFINActiveCurrencyAndAmount confdAmt;
    @XmlElement(name = "TrckrRcrd")
    protected TrackerRecord3 trckrRcrd;

    /**
     * Gets the value of the confdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime1 }
     *     
     */
    public DateTime1 getConfdDt() {
        return confdDt;
    }

    /**
     * Sets the value of the confdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime1 }
     *     
     */
    public TrackerData3 setConfdDt(DateTime1 value) {
        this.confdDt = value;
        return this;
    }

    /**
     * Gets the value of the confdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getConfdAmt() {
        return confdAmt;
    }

    /**
     * Sets the value of the confdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public TrackerData3 setConfdAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.confdAmt = value;
        return this;
    }

    /**
     * Gets the value of the trckrRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerRecord3 }
     *     
     */
    public TrackerRecord3 getTrckrRcrd() {
        return trckrRcrd;
    }

    /**
     * Sets the value of the trckrRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerRecord3 }
     *     
     */
    public TrackerData3 setTrckrRcrd(TrackerRecord3 value) {
        this.trckrRcrd = value;
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
