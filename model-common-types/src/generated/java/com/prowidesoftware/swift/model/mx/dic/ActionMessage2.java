
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information to display, print or store.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionMessage2", propOrder = {
    "msgDstn",
    "frmt",
    "msgCntt",
    "msgCnttSgntr"
})
public class ActionMessage2 {

    @XmlElement(name = "MsgDstn", required = true)
    @XmlSchemaType(name = "string")
    protected UserInterface4Code msgDstn;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat1Code frmt;
    @XmlElement(name = "MsgCntt", required = true)
    protected String msgCntt;
    @XmlElement(name = "MsgCnttSgntr")
    protected byte[] msgCnttSgntr;

    /**
     * Gets the value of the msgDstn property.
     * 
     * @return
     *     possible object is
     *     {@link UserInterface4Code }
     *     
     */
    public UserInterface4Code getMsgDstn() {
        return msgDstn;
    }

    /**
     * Sets the value of the msgDstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInterface4Code }
     *     
     */
    public ActionMessage2 setMsgDstn(UserInterface4Code value) {
        this.msgDstn = value;
        return this;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat1Code }
     *     
     */
    public OutputFormat1Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat1Code }
     *     
     */
    public ActionMessage2 setFrmt(OutputFormat1Code value) {
        this.frmt = value;
        return this;
    }

    /**
     * Gets the value of the msgCntt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgCntt() {
        return msgCntt;
    }

    /**
     * Sets the value of the msgCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ActionMessage2 setMsgCntt(String value) {
        this.msgCntt = value;
        return this;
    }

    /**
     * Gets the value of the msgCnttSgntr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMsgCnttSgntr() {
        return msgCnttSgntr;
    }

    /**
     * Sets the value of the msgCnttSgntr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public ActionMessage2 setMsgCnttSgntr(byte[] value) {
        this.msgCnttSgntr = value;
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
