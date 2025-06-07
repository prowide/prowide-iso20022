
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Opening balance for the statement period (first opening balance) or of this page (intermediary opening balance).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpeningBalance5", propOrder = {
    "shrtLngInd",
    "opngBal"
})
public class OpeningBalance5 {

    @XmlElement(name = "ShrtLngInd", required = true)
    @XmlSchemaType(name = "string")
    protected ShortLong1Code shrtLngInd;
    @XmlElement(name = "OpngBal", required = true)
    protected OpeningBalance6Choice opngBal;

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
    public OpeningBalance5 setShrtLngInd(ShortLong1Code value) {
        this.shrtLngInd = value;
        return this;
    }

    /**
     * Gets the value of the opngBal property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningBalance6Choice }
     *     
     */
    public OpeningBalance6Choice getOpngBal() {
        return opngBal;
    }

    /**
     * Sets the value of the opngBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningBalance6Choice }
     *     
     */
    public OpeningBalance5 setOpngBal(OpeningBalance6Choice value) {
        this.opngBal = value;
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
