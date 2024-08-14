
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
 * The UndertakingAmendmentResponseNotification message is sent by the advising party to the party that issued the undertaking, either directly or via one or more other parties, to notify the recipient of the acceptance or rejection by the beneficiary of the amendment. On receipt of this message or the UndertakingAmendmentResponse message, the issuer may also send the UndertakingAmendmentResponseNotification to the applicant.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingAmendmentResponseNotificationV01", propOrder = {
    "udrtkgAmdmntRspnNtfctnDtls",
    "addtlInf",
    "dgtlSgntr"
})
public class UndertakingAmendmentResponseNotificationV01 {

    @XmlElement(name = "UdrtkgAmdmntRspnNtfctnDtls", required = true)
    protected Amendment9 udrtkgAmdmntRspnNtfctnDtls;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the udrtkgAmdmntRspnNtfctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Amendment9 }
     *     
     */
    public Amendment9 getUdrtkgAmdmntRspnNtfctnDtls() {
        return udrtkgAmdmntRspnNtfctnDtls;
    }

    /**
     * Sets the value of the udrtkgAmdmntRspnNtfctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amendment9 }
     *     
     */
    public UndertakingAmendmentResponseNotificationV01 setUdrtkgAmdmntRspnNtfctnDtls(Amendment9 value) {
        this.udrtkgAmdmntRspnNtfctnDtls = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UndertakingAmendmentResponseNotificationV01 setAddtlInf(String value) {
        this.addtlInf = value;
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
    public UndertakingAmendmentResponseNotificationV01 setDgtlSgntr(PartyAndSignature2 value) {
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
