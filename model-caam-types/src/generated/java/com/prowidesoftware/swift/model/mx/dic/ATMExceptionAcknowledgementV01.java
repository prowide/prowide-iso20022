
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
 * The ATMExceptionAcknowledgement message is sent by an acquirer or its agent to an ATM to acknowledge the receipt of an ATMExceptionAdvice message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMExceptionAcknowledgementV01", propOrder = {
    "hdr",
    "prtctdATMXcptnAck",
    "atmXcptnAck",
    "sctyTrlr"
})
public class ATMExceptionAcknowledgementV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header32 hdr;
    @XmlElement(name = "PrtctdATMXcptnAck")
    protected ContentInformationType10 prtctdATMXcptnAck;
    @XmlElement(name = "ATMXcptnAck")
    protected ATMExceptionAcknowledgement1 atmXcptnAck;
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
    public ATMExceptionAcknowledgementV01 setHdr(Header32 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMXcptnAck property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMXcptnAck() {
        return prtctdATMXcptnAck;
    }

    /**
     * Sets the value of the prtctdATMXcptnAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMExceptionAcknowledgementV01 setPrtctdATMXcptnAck(ContentInformationType10 value) {
        this.prtctdATMXcptnAck = value;
        return this;
    }

    /**
     * Gets the value of the atmXcptnAck property.
     * 
     * @return
     *     possible object is
     *     {@link ATMExceptionAcknowledgement1 }
     *     
     */
    public ATMExceptionAcknowledgement1 getATMXcptnAck() {
        return atmXcptnAck;
    }

    /**
     * Sets the value of the atmXcptnAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMExceptionAcknowledgement1 }
     *     
     */
    public ATMExceptionAcknowledgementV01 setATMXcptnAck(ATMExceptionAcknowledgement1 value) {
        this.atmXcptnAck = value;
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
    public ATMExceptionAcknowledgementV01 setSctyTrlr(ContentInformationType15 value) {
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
