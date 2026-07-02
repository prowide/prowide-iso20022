
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
 * Specifies corporate action dates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate49", propOrder = {
    "rcrdDt",
    "exDvddDt"
})
public class CorporateActionDate49 {

    @XmlElement(name = "RcrdDt")
    protected DateFormat31Choice rcrdDt;
    @XmlElement(name = "ExDvddDt")
    protected DateFormat31Choice exDvddDt;

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat31Choice }
     *     
     */
    public DateFormat31Choice getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat31Choice }
     *     
     */
    public CorporateActionDate49 setRcrdDt(DateFormat31Choice value) {
        this.rcrdDt = value;
        return this;
    }

    /**
     * Gets the value of the exDvddDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat31Choice }
     *     
     */
    public DateFormat31Choice getExDvddDt() {
        return exDvddDt;
    }

    /**
     * Sets the value of the exDvddDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat31Choice }
     *     
     */
    public CorporateActionDate49 setExDvddDt(DateFormat31Choice value) {
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
