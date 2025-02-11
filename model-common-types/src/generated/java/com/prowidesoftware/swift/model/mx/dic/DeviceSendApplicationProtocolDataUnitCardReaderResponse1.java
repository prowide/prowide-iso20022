
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
 * Content of the Card Reader Application Protocol Data Unit Response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceSendApplicationProtocolDataUnitCardReaderResponse1", propOrder = {
    "data",
    "cardSts"
})
public class DeviceSendApplicationProtocolDataUnitCardReaderResponse1 {

    @XmlElement(name = "Data")
    protected byte[] data;
    @XmlElement(name = "CardSts", required = true)
    protected byte[] cardSts;

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
    public DeviceSendApplicationProtocolDataUnitCardReaderResponse1 setData(byte[] value) {
        this.data = value;
        return this;
    }

    /**
     * Gets the value of the cardSts property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCardSts() {
        return cardSts;
    }

    /**
     * Sets the value of the cardSts property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public DeviceSendApplicationProtocolDataUnitCardReaderResponse1 setCardSts(byte[] value) {
        this.cardSts = value;
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
