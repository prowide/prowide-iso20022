
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
 * The ATMCompletionAcknowledgement message is sent by an acquirer or its agent to an ATM to acknowledge the receipt of an ATMCompletionAdvice message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCompletionAcknowledgementV01", propOrder = {
    "hdr",
    "prtctdATMCmpltnAck",
    "atmCmpltnAck",
    "sctyTrlr"
})
public class ATMCompletionAcknowledgementV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header21 hdr;
    @XmlElement(name = "PrtctdATMCmpltnAck")
    protected ContentInformationType10 prtctdATMCmpltnAck;
    @XmlElement(name = "ATMCmpltnAck")
    protected ATMCompletionAcknowledgement1 atmCmpltnAck;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header21 }
     *     
     */
    public Header21 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header21 }
     *     
     */
    public ATMCompletionAcknowledgementV01 setHdr(Header21 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMCmpltnAck property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMCmpltnAck() {
        return prtctdATMCmpltnAck;
    }

    /**
     * Sets the value of the prtctdATMCmpltnAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMCompletionAcknowledgementV01 setPrtctdATMCmpltnAck(ContentInformationType10 value) {
        this.prtctdATMCmpltnAck = value;
        return this;
    }

    /**
     * Gets the value of the atmCmpltnAck property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCompletionAcknowledgement1 }
     *     
     */
    public ATMCompletionAcknowledgement1 getATMCmpltnAck() {
        return atmCmpltnAck;
    }

    /**
     * Sets the value of the atmCmpltnAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCompletionAcknowledgement1 }
     *     
     */
    public ATMCompletionAcknowledgementV01 setATMCmpltnAck(ATMCompletionAcknowledgement1 value) {
        this.atmCmpltnAck = value;
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
    public ATMCompletionAcknowledgementV01 setSctyTrlr(ContentInformationType15 value) {
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
