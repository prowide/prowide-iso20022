
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
 * The ATMReconciliationAcknowledgement message is sent by an acquirer or its agent to an ATM to acknowledge the receipt of an ATMReconciliationAdvice message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMReconciliationAcknowledgementV01", propOrder = {
    "hdr",
    "prtctdATMRcncltnAck",
    "atmRcncltnAck",
    "sctyTrlr"
})
public class ATMReconciliationAcknowledgementV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header21 hdr;
    @XmlElement(name = "PrtctdATMRcncltnAck")
    protected ContentInformationType10 prtctdATMRcncltnAck;
    @XmlElement(name = "ATMRcncltnAck")
    protected ATMReconciliationAcknowledgement1 atmRcncltnAck;
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
    public ATMReconciliationAcknowledgementV01 setHdr(Header21 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdATMRcncltnAck property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMRcncltnAck() {
        return prtctdATMRcncltnAck;
    }

    /**
     * Sets the value of the prtctdATMRcncltnAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMReconciliationAcknowledgementV01 setPrtctdATMRcncltnAck(ContentInformationType10 value) {
        this.prtctdATMRcncltnAck = value;
        return this;
    }

    /**
     * Gets the value of the atmRcncltnAck property.
     * 
     * @return
     *     possible object is
     *     {@link ATMReconciliationAcknowledgement1 }
     *     
     */
    public ATMReconciliationAcknowledgement1 getATMRcncltnAck() {
        return atmRcncltnAck;
    }

    /**
     * Sets the value of the atmRcncltnAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMReconciliationAcknowledgement1 }
     *     
     */
    public ATMReconciliationAcknowledgementV01 setATMRcncltnAck(ATMReconciliationAcknowledgement1 value) {
        this.atmRcncltnAck = value;
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
    public ATMReconciliationAcknowledgementV01 setSctyTrlr(ContentInformationType15 value) {
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
