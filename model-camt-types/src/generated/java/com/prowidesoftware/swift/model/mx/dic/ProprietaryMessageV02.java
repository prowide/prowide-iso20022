
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
 * Scope
 * The ProprietaryMessage is used by financial institutions, with their own offices, and/or with other financial institutions with which they have established bilateral agreements. It is used as an envelope for a specified message included in it.
 * It allows for the definition of a unique format for which another message type is not available or applicable. It also allows financial institutions to use message types which are awaiting live implementation on the SWIFT system.
 * Usage
 * The user should ensure that, at a general level, the Cash Management business area encompasses the business purpose of the message.
 * The type of document agreed by the users of a specific proprietary message, or the message type, assigned to a message format being used before its implementation, shall be identified in the element ProprietaryData/Type of the message being transmitted
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietaryMessageV02", propOrder = {
    "msgId",
    "rltd",
    "prvs",
    "othr",
    "prtryData"
})
public class ProprietaryMessageV02 {

    @XmlElement(name = "MsgId")
    protected MessageReference msgId;
    @XmlElement(name = "Rltd")
    protected MessageReference rltd;
    @XmlElement(name = "Prvs")
    protected MessageReference prvs;
    @XmlElement(name = "Othr")
    protected MessageReference othr;
    @XmlElement(name = "PrtryData", required = true)
    protected ProprietaryData prtryData;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference }
     *     
     */
    public MessageReference getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference }
     *     
     */
    public ProprietaryMessageV02 setMsgId(MessageReference value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the rltd property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference }
     *     
     */
    public MessageReference getRltd() {
        return rltd;
    }

    /**
     * Sets the value of the rltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference }
     *     
     */
    public ProprietaryMessageV02 setRltd(MessageReference value) {
        this.rltd = value;
        return this;
    }

    /**
     * Gets the value of the prvs property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference }
     *     
     */
    public MessageReference getPrvs() {
        return prvs;
    }

    /**
     * Sets the value of the prvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference }
     *     
     */
    public ProprietaryMessageV02 setPrvs(MessageReference value) {
        this.prvs = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference }
     *     
     */
    public MessageReference getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference }
     *     
     */
    public ProprietaryMessageV02 setOthr(MessageReference value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the prtryData property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryData }
     *     
     */
    public ProprietaryData getPrtryData() {
        return prtryData;
    }

    /**
     * Sets the value of the prtryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryData }
     *     
     */
    public ProprietaryMessageV02 setPrtryData(ProprietaryData value) {
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
