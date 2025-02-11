
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
@XmlType(name = "CorporateActionDate59", propOrder = {
    "rcrdDt",
    "exDvddDt"
})
public class CorporateActionDate59 {

    @XmlElement(name = "RcrdDt")
    protected DateFormat43Choice rcrdDt;
    @XmlElement(name = "ExDvddDt")
    protected DateFormat43Choice exDvddDt;

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate59 setRcrdDt(DateFormat43Choice value) {
        this.rcrdDt = value;
        return this;
    }

    /**
     * Gets the value of the exDvddDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getExDvddDt() {
        return exDvddDt;
    }

    /**
     * Sets the value of the exDvddDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate59 setExDvddDt(DateFormat43Choice value) {
        this.exDvddDt = value;
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
