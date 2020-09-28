
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
 * It is used by financial institutions, with their own offices, or with other financial institutions with which they have established bilateral agreements. It is used as an envelope for a specified message included in it.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInitiationProprietaryMessageV03", propOrder = {
    "msgHdr",
    "rltd",
    "prvs",
    "othr",
    "prtryData"
})
public class PaymentInitiationProprietaryMessageV03 {

    @XmlElement(name = "MsgHdr")
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "Rltd")
    protected MessageReference2 rltd;
    @XmlElement(name = "Prvs")
    protected MessageReference2 prvs;
    @XmlElement(name = "Othr")
    protected MessageReference2 othr;
    @XmlElement(name = "PrtryData", required = true)
    protected ProprietaryData5 prtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader1 }
     *     
     */
    public MessageHeader1 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader1 }
     *     
     */
    public PaymentInitiationProprietaryMessageV03 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the rltd property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference2 }
     *     
     */
    public MessageReference2 getRltd() {
        return rltd;
    }

    /**
     * Sets the value of the rltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference2 }
     *     
     */
    public PaymentInitiationProprietaryMessageV03 setRltd(MessageReference2 value) {
        this.rltd = value;
        return this;
    }

    /**
     * Gets the value of the prvs property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference2 }
     *     
     */
    public MessageReference2 getPrvs() {
        return prvs;
    }

    /**
     * Sets the value of the prvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference2 }
     *     
     */
    public PaymentInitiationProprietaryMessageV03 setPrvs(MessageReference2 value) {
        this.prvs = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference2 }
     *     
     */
    public MessageReference2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference2 }
     *     
     */
    public PaymentInitiationProprietaryMessageV03 setOthr(MessageReference2 value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the prtryData property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryData5 }
     *     
     */
    public ProprietaryData5 getPrtryData() {
        return prtryData;
    }

    /**
     * Sets the value of the prtryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryData5 }
     *     
     */
    public PaymentInitiationProprietaryMessageV03 setPrtryData(ProprietaryData5 value) {
        this.prtryData = value;
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
