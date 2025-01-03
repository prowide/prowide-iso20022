
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
@XmlType(name = "LimitReport2", propOrder = {
    "lmtId",
    "lmt",
    "bizErr"
})
public class LimitReport2 {

    @XmlElement(name = "LmtId", required = true)
    protected LimitIdentificationDetails2 lmtId;
    @XmlElement(name = "Lmt")
    protected LimitDetails3 lmt;
    @XmlElement(name = "BizErr")
    protected ErrorHandling2 bizErr;

    /**
     * Gets the value of the lmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentificationDetails2 }
     *     
     */
    public LimitIdentificationDetails2 getLmtId() {
        return lmtId;
    }

    /**
     * Sets the value of the lmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentificationDetails2 }
     *     
     */
    public LimitReport2 setLmtId(LimitIdentificationDetails2 value) {
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
    public LimitReport2 setLmt(LimitDetails3 value) {
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
    public LimitReport2 setBizErr(ErrorHandling2 value) {
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
