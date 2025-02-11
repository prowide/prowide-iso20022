
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
 * The ATMWithdrawalCompletionAcknowledgement message is sent by an acquirer or its agent to an ATM to acknowledge the receipt of an ATMWithdrawalCompletionAdvice message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMWithdrawalCompletionAcknowledgementV02", propOrder = {
    "hdr",
    "prtctdATMWdrwlCmpltnAck",
    "atmWdrwlCmpltnAck",
    "sctyTrlr"
})
public class ATMWithdrawalCompletionAcknowledgementV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header32 hdr;
    @XmlElement(name = "PrtctdATMWdrwlCmpltnAck")
    protected ContentInformationType10 prtctdATMWdrwlCmpltnAck;
    @XmlElement(name = "ATMWdrwlCmpltnAck")
    protected ATMWithdrawalCompletionAcknowledgement2 atmWdrwlCmpltnAck;
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
    public ATMWithdrawalCompletionAcknowledgementV02 setHdr(Header32 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMWdrwlCmpltnAck property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMWdrwlCmpltnAck() {
        return prtctdATMWdrwlCmpltnAck;
    }

    /**
     * Sets the value of the prtctdATMWdrwlCmpltnAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMWithdrawalCompletionAcknowledgementV02 setPrtctdATMWdrwlCmpltnAck(ContentInformationType10 value) {
        this.prtctdATMWdrwlCmpltnAck = value;
        return this;
    }

    /**
     * Gets the value of the atmWdrwlCmpltnAck property.
     * 
     * @return
     *     possible object is
     *     {@link ATMWithdrawalCompletionAcknowledgement2 }
     *     
     */
    public ATMWithdrawalCompletionAcknowledgement2 getATMWdrwlCmpltnAck() {
        return atmWdrwlCmpltnAck;
    }

    /**
     * Sets the value of the atmWdrwlCmpltnAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMWithdrawalCompletionAcknowledgement2 }
     *     
     */
    public ATMWithdrawalCompletionAcknowledgementV02 setATMWdrwlCmpltnAck(ATMWithdrawalCompletionAcknowledgement2 value) {
        this.atmWdrwlCmpltnAck = value;
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
    public ATMWithdrawalCompletionAcknowledgementV02 setSctyTrlr(ContentInformationType15 value) {
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
