
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
 * Specifies corporate action dates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate54", propOrder = {
    "rcrdDt",
    "exDvddDt",
    "ltryDt"
})
public class CorporateActionDate54 {

    @XmlElement(name = "RcrdDt")
    protected DateFormat34Choice rcrdDt;
    @XmlElement(name = "ExDvddDt")
    protected DateFormat34Choice exDvddDt;
    @XmlElement(name = "LtryDt")
    protected DateFormat34Choice ltryDt;

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public CorporateActionDate54 setRcrdDt(DateFormat34Choice value) {
        this.rcrdDt = value;
        return this;
    }

    /**
     * Gets the value of the exDvddDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getExDvddDt() {
        return exDvddDt;
    }

    /**
     * Sets the value of the exDvddDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public CorporateActionDate54 setExDvddDt(DateFormat34Choice value) {
        this.exDvddDt = value;
        return this;
    }

    /**
     * Gets the value of the ltryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getLtryDt() {
        return ltryDt;
    }

    /**
     * Sets the value of the ltryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public CorporateActionDate54 setLtryDt(DateFormat34Choice value) {
        this.ltryDt = value;
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
