
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
 * Data of a Chip Card related to the reset of the chip.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICCResetData1", propOrder = {
    "atrVal",
    "cardSts"
})
public class ICCResetData1 {

    @XmlElement(name = "ATRVal")
    protected byte[] atrVal;
    @XmlElement(name = "CardSts")
    protected byte[] cardSts;

    /**
     * Gets the value of the atrVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getATRVal() {
        return atrVal;
    }

    /**
     * Sets the value of the atrVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public ICCResetData1 setATRVal(byte[] value) {
        this.atrVal = value;
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
    public ICCResetData1 setCardSts(byte[] value) {
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
