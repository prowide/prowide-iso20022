
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
 * The UndertakingTerminationNotification message is sent to the applicant by the party that issued the undertaking to give notification of the termination or cancelation of the referenced undertaking.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingTerminationNotificationV01", propOrder = {
    "udrtkgTermntnNtfctnDtls",
    "dgtlSgntr"
})
public class UndertakingTerminationNotificationV01 {

    @XmlElement(name = "UdrtkgTermntnNtfctnDtls", required = true)
    protected UndertakingTerminationNotice1 udrtkgTermntnNtfctnDtls;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the udrtkgTermntnNtfctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingTerminationNotice1 }
     *     
     */
    public UndertakingTerminationNotice1 getUdrtkgTermntnNtfctnDtls() {
        return udrtkgTermntnNtfctnDtls;
    }

    /**
     * Sets the value of the udrtkgTermntnNtfctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingTerminationNotice1 }
     *     
     */
    public UndertakingTerminationNotificationV01 setUdrtkgTermntnNtfctnDtls(UndertakingTerminationNotice1 value) {
        this.udrtkgTermntnNtfctnDtls = value;
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
    public UndertakingTerminationNotificationV01 setDgtlSgntr(PartyAndSignature2 value) {
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
