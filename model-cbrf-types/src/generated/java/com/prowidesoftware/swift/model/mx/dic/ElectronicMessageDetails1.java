
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
 * Summary of electronic message details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicMessageDetails1", propOrder = {
    "elctrncSysInfMsgIdr",
    "elctrncSysInfMsgPacketIdr"
})
public class ElectronicMessageDetails1 {

    @XmlElement(name = "ElctrncSysInfMsgIdr", required = true)
    protected String elctrncSysInfMsgIdr;
    @XmlElement(name = "ElctrncSysInfMsgPacketIdr")
    protected String elctrncSysInfMsgPacketIdr;

    /**
     * Gets the value of the elctrncSysInfMsgIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElctrncSysInfMsgIdr() {
        return elctrncSysInfMsgIdr;
    }

    /**
     * Sets the value of the elctrncSysInfMsgIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ElectronicMessageDetails1 setElctrncSysInfMsgIdr(String value) {
        this.elctrncSysInfMsgIdr = value;
        return this;
    }

    /**
     * Gets the value of the elctrncSysInfMsgPacketIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElctrncSysInfMsgPacketIdr() {
        return elctrncSysInfMsgPacketIdr;
    }

    /**
     * Sets the value of the elctrncSysInfMsgPacketIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ElectronicMessageDetails1 setElctrncSysInfMsgPacketIdr(String value) {
        this.elctrncSysInfMsgPacketIdr = value;
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
