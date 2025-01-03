
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
 * Content of the Card Reader Application Protocol Data Unit Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceSendApplicationProtocolDataUnitCardReaderRequest1", propOrder = {
    "clss",
    "instr",
    "param1",
    "param2",
    "data",
    "xpctdLngth"
})
public class DeviceSendApplicationProtocolDataUnitCardReaderRequest1 {

    @XmlElement(name = "Clss", required = true)
    protected byte[] clss;
    @XmlElement(name = "Instr", required = true)
    protected byte[] instr;
    @XmlElement(name = "Param1", required = true)
    protected byte[] param1;
    @XmlElement(name = "Param2", required = true)
    protected byte[] param2;
    @XmlElement(name = "Data")
    protected byte[] data;
    @XmlElement(name = "XpctdLngth")
    protected byte[] xpctdLngth;

    /**
     * Gets the value of the clss property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getClss() {
        return clss;
    }

    /**
     * Sets the value of the clss property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public DeviceSendApplicationProtocolDataUnitCardReaderRequest1 setClss(byte[] value) {
        this.clss = value;
        return this;
    }

    /**
     * Gets the value of the instr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInstr() {
        return instr;
    }

    /**
     * Sets the value of the instr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public DeviceSendApplicationProtocolDataUnitCardReaderRequest1 setInstr(byte[] value) {
        this.instr = value;
        return this;
    }

    /**
     * Gets the value of the param1 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getParam1() {
        return param1;
    }

    /**
     * Sets the value of the param1 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public DeviceSendApplicationProtocolDataUnitCardReaderRequest1 setParam1(byte[] value) {
        this.param1 = value;
        return this;
    }

    /**
     * Gets the value of the param2 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getParam2() {
        return param2;
    }

    /**
     * Sets the value of the param2 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public DeviceSendApplicationProtocolDataUnitCardReaderRequest1 setParam2(byte[] value) {
        this.param2 = value;
        return this;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public DeviceSendApplicationProtocolDataUnitCardReaderRequest1 setData(byte[] value) {
        this.data = value;
        return this;
    }

    /**
     * Gets the value of the xpctdLngth property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getXpctdLngth() {
        return xpctdLngth;
    }

    /**
     * Sets the value of the xpctdLngth property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public DeviceSendApplicationProtocolDataUnitCardReaderRequest1 setXpctdLngth(byte[] value) {
        this.xpctdLngth = value;
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
