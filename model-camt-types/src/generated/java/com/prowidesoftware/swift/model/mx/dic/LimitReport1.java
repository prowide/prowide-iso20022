
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
 * Reports either on the risk management limit or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitReport1", propOrder = {
    "lmtId",
    "lmt",
    "bizErr"
})
public class LimitReport1 {

    @XmlElement(name = "LmtId", required = true)
    protected LimitIdentificationDetails1 lmtId;
    @XmlElement(name = "Lmt")
    protected LimitDetails3 lmt;
    @XmlElement(name = "BizErr")
    protected ErrorHandling2 bizErr;

    /**
     * Gets the value of the lmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentificationDetails1 }
     *     
     */
    public LimitIdentificationDetails1 getLmtId() {
        return lmtId;
    }

    /**
     * Sets the value of the lmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentificationDetails1 }
     *     
     */
    public LimitReport1 setLmtId(LimitIdentificationDetails1 value) {
        this.lmtId = value;
        return this;
    }

    /**
     * Gets the value of the lmt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitDetails3 }
     *     
     */
    public LimitDetails3 getLmt() {
        return lmt;
    }

    /**
     * Sets the value of the lmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitDetails3 }
     *     
     */
    public LimitReport1 setLmt(LimitDetails3 value) {
        this.lmt = value;
        return this;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling2 }
     *     
     */
    public ErrorHandling2 getBizErr() {
        return bizErr;
    }

    /**
     * Sets the value of the bizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling2 }
     *     
     */
    public LimitReport1 setBizErr(ErrorHandling2 value) {
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
