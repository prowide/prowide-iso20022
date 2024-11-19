
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
 * The UndertakingNonExtensionNotification message is sent by the party that issued the undertaking to the beneficiary, either directly or via one or more advising parties, to notify it of the non-extension of the referenced undertaking beyond the current expiry date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingNonExtensionNotificationV01", propOrder = {
    "udrtkgNonXtnsnNtfctnDtls",
    "dgtlSgntr"
})
public class UndertakingNonExtensionNotificationV01 {

    @XmlElement(name = "UdrtkgNonXtnsnNtfctnDtls", required = true)
    protected UndertakingNonExtensionStatusAdvice1 udrtkgNonXtnsnNtfctnDtls;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the udrtkgNonXtnsnNtfctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingNonExtensionStatusAdvice1 }
     *     
     */
    public UndertakingNonExtensionStatusAdvice1 getUdrtkgNonXtnsnNtfctnDtls() {
        return udrtkgNonXtnsnNtfctnDtls;
    }

    /**
     * Sets the value of the udrtkgNonXtnsnNtfctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingNonExtensionStatusAdvice1 }
     *     
     */
    public UndertakingNonExtensionNotificationV01 setUdrtkgNonXtnsnNtfctnDtls(UndertakingNonExtensionStatusAdvice1 value) {
        this.udrtkgNonXtnsnNtfctnDtls = value;
        return this;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public PartyAndSignature2 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public UndertakingNonExtensionNotificationV01 setDgtlSgntr(PartyAndSignature2 value) {
        this.dgtlSgntr = value;
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
