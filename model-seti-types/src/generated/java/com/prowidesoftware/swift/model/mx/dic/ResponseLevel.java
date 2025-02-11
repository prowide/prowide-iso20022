
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
 * Identifies the level of response requested from the receiver of this message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseLevel", propOrder = {
    "rspnLvl"
})
public class ResponseLevel {

    @XmlElement(name = "RspnLvl", required = true)
    @XmlSchemaType(name = "string")
    protected ResponseLevel1Code rspnLvl;

    /**
     * Gets the value of the rspnLvl property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseLevel1Code }
     *     
     */
    public ResponseLevel1Code getRspnLvl() {
        return rspnLvl;
    }

    /**
     * Sets the value of the rspnLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseLevel1Code }
     *     
     */
    public ResponseLevel setRspnLvl(ResponseLevel1Code value) {
        this.rspnLvl = value;
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
