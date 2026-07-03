
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
 * The DemandWithdrawalNotification message is sent by the beneficiary to the party that issued the undertaking, either directly or via a presenting or nominated party, to inform the issuer or nominated party that it has elected to withdraw its demand under the demand guarantee or standby letter of credit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemandWithdrawalNotificationV01", propOrder = {
    "dmndWdrwlNtfctnDtls",
    "dgtlSgntr"
})
public class DemandWithdrawalNotificationV01 {

    @XmlElement(name = "DmndWdrwlNtfctnDtls", required = true)
    protected UndertakingDemandWithdrawal1 dmndWdrwlNtfctnDtls;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the dmndWdrwlNtfctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingDemandWithdrawal1 }
     *     
     */
    public UndertakingDemandWithdrawal1 getDmndWdrwlNtfctnDtls() {
        return dmndWdrwlNtfctnDtls;
    }

    /**
     * Sets the value of the dmndWdrwlNtfctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingDemandWithdrawal1 }
     *     
     */
    public DemandWithdrawalNotificationV01 setDmndWdrwlNtfctnDtls(UndertakingDemandWithdrawal1 value) {
        this.dmndWdrwlNtfctnDtls = value;
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
    public DemandWithdrawalNotificationV01 setDgtlSgntr(PartyAndSignature2 value) {
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
