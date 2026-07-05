
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "TrackerData8", propOrder = {
    "confdDt",
    "confdAmt",
    "rtrdConfdDt",
    "rtrdConfdAmt",
    "rmngToBeConfdAmt",
    "prevslyConfdAmt",
    "prevslyConfdDt"
})
public class TrackerData8 {

    @XmlElement(name = "ConfdDt")
    protected DateAndDateTime2Choice confdDt;
    @XmlElement(name = "ConfdAmt")
    protected ActiveCurrencyAndAmount confdAmt;
    @XmlElement(name = "RtrdConfdDt")
    protected DateAndDateTime2Choice rtrdConfdDt;
    @XmlElement(name = "RtrdConfdAmt")
    protected ActiveCurrencyAndAmount rtrdConfdAmt;
    @XmlElement(name = "RmngToBeConfdAmt")
    protected ActiveCurrencyAndAmount rmngToBeConfdAmt;
    @XmlElement(name = "PrevslyConfdAmt")
    protected ActiveCurrencyAndAmount prevslyConfdAmt;
    @XmlElement(name = "PrevslyConfdDt")
    protected DateAndDateTime2Choice prevslyConfdDt;

    /**
     * Gets the value of the confdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getConfdDt() {
        return confdDt;
    }

    /**
     * Sets the value of the confdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TrackerData8 setConfdDt(DateAndDateTime2Choice value) {
        this.confdDt = value;
        return this;
    }

    /**
     * Gets the value of the confdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getConfdAmt() {
        return confdAmt;
    }

    /**
     * Sets the value of the confdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TrackerData8 setConfdAmt(ActiveCurrencyAndAmount value) {
        this.confdAmt = value;
        return this;
    }

    /**
     * Gets the value of the rtrdConfdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getRtrdConfdDt() {
        return rtrdConfdDt;
    }

    /**
     * Sets the value of the rtrdConfdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TrackerData8 setRtrdConfdDt(DateAndDateTime2Choice value) {
        this.rtrdConfdDt = value;
        return this;
    }

    /**
     * Gets the value of the rtrdConfdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRtrdConfdAmt() {
        return rtrdConfdAmt;
    }

    /**
     * Sets the value of the rtrdConfdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TrackerData8 setRtrdConfdAmt(ActiveCurrencyAndAmount value) {
        this.rtrdConfdAmt = value;
        return this;
    }

    /**
     * Gets the value of the rmngToBeConfdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRmngToBeConfdAmt() {
        return rmngToBeConfdAmt;
    }

    /**
     * Sets the value of the rmngToBeConfdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TrackerData8 setRmngToBeConfdAmt(ActiveCurrencyAndAmount value) {
        this.rmngToBeConfdAmt = value;
        return this;
    }

    /**
     * Gets the value of the prevslyConfdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrevslyConfdAmt() {
        return prevslyConfdAmt;
    }

    /**
     * Sets the value of the prevslyConfdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TrackerData8 setPrevslyConfdAmt(ActiveCurrencyAndAmount value) {
        this.prevslyConfdAmt = value;
        return this;
    }

    /**
     * Gets the value of the prevslyConfdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getPrevslyConfdDt() {
        return prevslyConfdDt;
    }

    /**
     * Sets the value of the prevslyConfdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TrackerData8 setPrevslyConfdDt(DateAndDateTime2Choice value) {
        this.prevslyConfdDt = value;
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
