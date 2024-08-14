
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Message to be displayed to the cardholder or the cashier.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionMessage1", propOrder = {
    "msgDstn",
    "msgCntt",
    "msgCnttSgntr"
})
public class ActionMessage1 {

    @XmlElement(name = "MsgDstn", required = true)
    @XmlSchemaType(name = "string")
    protected UserInterface1Code msgDstn;
    @XmlElement(name = "MsgCntt", required = true)
    protected String msgCntt;
    @XmlElement(name = "MsgCnttSgntr")
    protected String msgCnttSgntr;

    /**
     * Gets the value of the msgDstn property.
     * 
     * @return
     *     possible object is
     *     {@link UserInterface1Code }
     *     
     */
    public UserInterface1Code getMsgDstn() {
        return msgDstn;
    }

    /**
     * Sets the value of the msgDstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInterface1Code }
     *     
     */
    public ActionMessage1 setMsgDstn(UserInterface1Code value) {
        this.msgDstn = value;
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
    public ActionMessage1 setMsgCntt(String value) {
        this.msgCntt = value;
        return this;
    }

    /**
     * Gets the value of the msgCnttSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgCnttSgntr() {
        return msgCnttSgntr;
    }

    /**
     * Sets the value of the msgCnttSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ActionMessage1 setMsgCnttSgntr(String value) {
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
