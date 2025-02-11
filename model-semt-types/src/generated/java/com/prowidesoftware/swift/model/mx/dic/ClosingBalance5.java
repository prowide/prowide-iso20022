
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Closing balance for the statement period (final closing balance) or of this page (intermediary closing balance).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosingBalance5", propOrder = {
    "shrtLngInd",
    "clsgBal"
})
public class ClosingBalance5 {

    @XmlElement(name = "ShrtLngInd", required = true)
    @XmlSchemaType(name = "string")
    protected ShortLong1Code shrtLngInd;
    @XmlElement(name = "ClsgBal", required = true)
    protected ClosingBalance6Choice clsgBal;

    /**
     * Gets the value of the shrtLngInd property.
     * 
     * @return
     *     possible object is
     *     {@link ShortLong1Code }
     *     
     */
    public ShortLong1Code getShrtLngInd() {
        return shrtLngInd;
    }

    /**
     * Sets the value of the shrtLngInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortLong1Code }
     *     
     */
    public ClosingBalance5 setShrtLngInd(ShortLong1Code value) {
        this.shrtLngInd = value;
        return this;
    }

    /**
     * Gets the value of the clsgBal property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingBalance6Choice }
     *     
     */
    public ClosingBalance6Choice getClsgBal() {
        return clsgBal;
    }

    /**
     * Sets the value of the clsgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingBalance6Choice }
     *     
     */
    public ClosingBalance5 setClsgBal(ClosingBalance6Choice value) {
        this.clsgBal = value;
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
