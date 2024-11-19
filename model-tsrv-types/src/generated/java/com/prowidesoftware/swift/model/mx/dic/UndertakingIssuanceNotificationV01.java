
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
 * The UndertakingIssuanceNotification message is sent by the party that issued the undertaking to the applicant to notify it of the contents of an undertaking issued electronically or on paper. The undertaking that is notified could be a demand guarantee, standby letter of credit, counter-undertaking (counter-guarantee or counter-standby), or suretyship undertaking. In addition to containing details on the applicable rules, expiry date, the amount, required documents, and terms and conditions of the undertaking, the message may provide information from the sender such as confirmation details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingIssuanceNotificationV01", propOrder = {
    "udrtkgIssncNtfctnDtls",
    "dgtlSgntr"
})
public class UndertakingIssuanceNotificationV01 {

    @XmlElement(name = "UdrtkgIssncNtfctnDtls", required = true)
    protected UndertakingAdvice2 udrtkgIssncNtfctnDtls;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the udrtkgIssncNtfctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAdvice2 }
     *     
     */
    public UndertakingAdvice2 getUdrtkgIssncNtfctnDtls() {
        return udrtkgIssncNtfctnDtls;
    }

    /**
     * Sets the value of the udrtkgIssncNtfctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAdvice2 }
     *     
     */
    public UndertakingIssuanceNotificationV01 setUdrtkgIssncNtfctnDtls(UndertakingAdvice2 value) {
        this.udrtkgIssncNtfctnDtls = value;
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
    public UndertakingIssuanceNotificationV01 setDgtlSgntr(PartyAndSignature2 value) {
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
