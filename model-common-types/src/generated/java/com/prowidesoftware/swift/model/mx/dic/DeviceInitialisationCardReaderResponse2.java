
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
 * Content of the Device Initialisation Card Reader Response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInitialisationCardReaderResponse2", propOrder = {
    "cardNtryMd",
    "iccRstData",
    "addtlInf"
})
public class DeviceInitialisationCardReaderResponse2 {

    @XmlElement(name = "CardNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading8Code cardNtryMd;
    @XmlElement(name = "ICCRstData")
    protected ICCResetData1 iccRstData;
    @XmlElement(name = "AddtlInf")
    protected byte[] addtlInf;

    /**
     * Gets the value of the cardNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading8Code }
     *     
     */
    public CardDataReading8Code getCardNtryMd() {
        return cardNtryMd;
    }

    /**
     * Sets the value of the cardNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading8Code }
     *     
     */
    public DeviceInitialisationCardReaderResponse2 setCardNtryMd(CardDataReading8Code value) {
        this.cardNtryMd = value;
        return this;
    }

    /**
     * Gets the value of the iccRstData property.
     * 
     * @return
     *     possible object is
     *     {@link ICCResetData1 }
     *     
     */
    public ICCResetData1 getICCRstData() {
        return iccRstData;
    }

    /**
     * Sets the value of the iccRstData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCResetData1 }
     *     
     */
    public DeviceInitialisationCardReaderResponse2 setICCRstData(ICCResetData1 value) {
        this.iccRstData = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public DeviceInitialisationCardReaderResponse2 setAddtlInf(byte[] value) {
        this.addtlInf = value;
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
