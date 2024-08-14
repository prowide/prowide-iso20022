
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
 * The ATMDepositCompletionAcknowledgement message is sent by an acquirer or its agent to an ATM to acknowledge the receipt of an ATMDepositCompletionAdvice message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDepositCompletionAcknowledgementV01", propOrder = {
    "hdr",
    "prtctdATMDpstCmpltnAck",
    "atmDpstCmpltnAck",
    "sctyTrlr"
})
public class ATMDepositCompletionAcknowledgementV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header32 hdr;
    @XmlElement(name = "PrtctdATMDpstCmpltnAck")
    protected ContentInformationType10 prtctdATMDpstCmpltnAck;
    @XmlElement(name = "ATMDpstCmpltnAck")
    protected ATMDepositCompletionAcknowledgement1 atmDpstCmpltnAck;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header32 }
     *     
     */
    public Header32 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header32 }
     *     
     */
    public ATMDepositCompletionAcknowledgementV01 setHdr(Header32 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMDpstCmpltnAck property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMDpstCmpltnAck() {
        return prtctdATMDpstCmpltnAck;
    }

    /**
     * Sets the value of the prtctdATMDpstCmpltnAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMDepositCompletionAcknowledgementV01 setPrtctdATMDpstCmpltnAck(ContentInformationType10 value) {
        this.prtctdATMDpstCmpltnAck = value;
        return this;
    }

    /**
     * Gets the value of the atmDpstCmpltnAck property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDepositCompletionAcknowledgement1 }
     *     
     */
    public ATMDepositCompletionAcknowledgement1 getATMDpstCmpltnAck() {
        return atmDpstCmpltnAck;
    }

    /**
     * Sets the value of the atmDpstCmpltnAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDepositCompletionAcknowledgement1 }
     *     
     */
    public ATMDepositCompletionAcknowledgementV01 setATMDpstCmpltnAck(ATMDepositCompletionAcknowledgement1 value) {
        this.atmDpstCmpltnAck = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType15 }
     *     
     */
    public ContentInformationType15 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType15 }
     *     
     */
    public ATMDepositCompletionAcknowledgementV01 setSctyTrlr(ContentInformationType15 value) {
        this.sctyTrlr = value;
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
