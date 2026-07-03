
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
@XmlType(name = "TrackerData6", propOrder = {
    "confdDt",
    "confdAmt",
    "rmngToBeConfdAmt",
    "prevslyConfdAmt",
    "prevslyConfdDt"
})
public class TrackerData6 {

    @XmlElement(name = "ConfdDt", required = true)
    protected DateAndDateTime2Choice confdDt;
    @XmlElement(name = "ConfdAmt", required = true)
    protected ActiveCurrencyAndAmount confdAmt;
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
    public TrackerData6 setConfdDt(DateAndDateTime2Choice value) {
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
    public TrackerData6 setConfdAmt(ActiveCurrencyAndAmount value) {
        this.confdAmt = value;
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
    public TrackerData6 setRmngToBeConfdAmt(ActiveCurrencyAndAmount value) {
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
    public TrackerData6 setPrevslyConfdAmt(ActiveCurrencyAndAmount value) {
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
    public TrackerData6 setPrevslyConfdDt(DateAndDateTime2Choice value) {
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
