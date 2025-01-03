
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
 * The UndertakingAmendmentNotification message is sent by the party that issued the undertaking to the applicant to notify it of the contents of a proposed amendment to the undertaking (issued electronically or on paper). The undertaking could be a demand guarantee, standby letter of credit, counter-undertaking (counter-guarantee or counter-standby), or suretyship undertaking. In addition to providing the proposed terms of the amendment and details on proposed changes to the undertaking, the message may provide other supporting information from the sender. It may also be used to notify the proposed termination or cancellation of the undertaking.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingAmendmentNotificationV01", propOrder = {
    "udrtkgAmdmntNtfctnDtls",
    "dgtlSgntr"
})
public class UndertakingAmendmentNotificationV01 {

    @XmlElement(name = "UdrtkgAmdmntNtfctnDtls", required = true)
    protected Amendment6 udrtkgAmdmntNtfctnDtls;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the udrtkgAmdmntNtfctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Amendment6 }
     *     
     */
    public Amendment6 getUdrtkgAmdmntNtfctnDtls() {
        return udrtkgAmdmntNtfctnDtls;
    }

    /**
     * Sets the value of the udrtkgAmdmntNtfctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amendment6 }
     *     
     */
    public UndertakingAmendmentNotificationV01 setUdrtkgAmdmntNtfctnDtls(Amendment6 value) {
        this.udrtkgAmdmntNtfctnDtls = value;
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
    public UndertakingAmendmentNotificationV01 setDgtlSgntr(PartyAndSignature2 value) {
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
