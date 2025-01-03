
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
 * Reports either on the reservation or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationReport2", propOrder = {
    "rsvatnId",
    "rsvatn",
    "bizErr"
})
public class ReservationReport2 {

    @XmlElement(name = "RsvatnId", required = true)
    protected ReservationIdentificationDetails1 rsvatnId;
    @XmlElement(name = "Rsvatn")
    protected ReservationDetails1 rsvatn;
    @XmlElement(name = "BizErr")
    protected ErrorHandling3 bizErr;

    /**
     * Gets the value of the rsvatnId property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationIdentificationDetails1 }
     *     
     */
    public ReservationIdentificationDetails1 getRsvatnId() {
        return rsvatnId;
    }

    /**
     * Sets the value of the rsvatnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationIdentificationDetails1 }
     *     
     */
    public ReservationReport2 setRsvatnId(ReservationIdentificationDetails1 value) {
        this.rsvatnId = value;
        return this;
    }

    /**
     * Gets the value of the rsvatn property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationDetails1 }
     *     
     */
    public ReservationDetails1 getRsvatn() {
        return rsvatn;
    }

    /**
     * Sets the value of the rsvatn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationDetails1 }
     *     
     */
    public ReservationReport2 setRsvatn(ReservationDetails1 value) {
        this.rsvatn = value;
        return this;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ErrorHandling3 getBizErr() {
        return bizErr;
    }

    /**
     * Sets the value of the bizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ReservationReport2 setBizErr(ErrorHandling3 value) {
        this.bizErr = value;
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
