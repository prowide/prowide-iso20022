
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
 * Identifies the specific classification or details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalCharacteristicDetails1", propOrder = {
    "tp",
    "prvddBy"
})
public class AdditionalCharacteristicDetails1 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "PrvddBy")
    protected String prvddBy;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalCharacteristicDetails1 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the prvddBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvddBy() {
        return prvddBy;
    }

    /**
     * Sets the value of the prvddBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalCharacteristicDetails1 setPrvddBy(String value) {
        this.prvddBy = value;
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
