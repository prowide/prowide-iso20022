
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
 * Scope
 * The ProprietaryMessage is used by financial institutions, with their own offices, and/or with other financial institutions with which they have established bilateral agreements. It is used as an envelope for a specified message included in it.
 * It allows for the definition of a unique format for which another message type is not available or applicable. It also allows financial institutions to use message types which are awaiting live implementation on the SWIFT system.
 * Usage
 * The user should ensure that, at a general level, the Cash Management business area encompasses the business purpose of the message.
 * The type of document agreed by the users of a specific proprietary message, or the message type, assigned to a message format being used before its implementation, shall be identified in the element ProprietaryData/Type of the message being transmitted.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.998.001.01", propOrder = {
    "msgId",
    "rela",
    "prev",
    "othr",
    "prtryDt"
})
public class Camt99800101 {

    @XmlElement(name = "MsgId")
    protected MessageReference msgId;
    @XmlElement(name = "Rela")
    protected MessageReference rela;
    @XmlElement(name = "Prev")
    protected MessageReference prev;
    @XmlElement(name = "Othr")
    protected MessageReference othr;
    @XmlElement(name = "PrtryDt", required = true)
    protected ProprietaryData prtryDt;

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
    public Camt99800101 setMsgId(MessageReference value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the rela property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference }
     *     
     */
    public MessageReference getRela() {
        return rela;
    }

    /**
     * Sets the value of the rela property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference }
     *     
     */
    public Camt99800101 setRela(MessageReference value) {
        this.rela = value;
        return this;
    }

    /**
     * Gets the value of the prev property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference }
     *     
     */
    public MessageReference getPrev() {
        return prev;
    }

    /**
     * Sets the value of the prev property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference }
     *     
     */
    public Camt99800101 setPrev(MessageReference value) {
        this.prev = value;
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
    public Camt99800101 setOthr(MessageReference value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the prtryDt property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryData }
     *     
     */
    public ProprietaryData getPrtryDt() {
        return prtryDt;
    }

    /**
     * Sets the value of the prtryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryData }
     *     
     */
    public Camt99800101 setPrtryDt(ProprietaryData value) {
        this.prtryDt = value;
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
