
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
 * Information to display, print or log.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionMessage4", propOrder = {
    "frmt",
    "msg",
    "ref",
    "dvc",
    "msgCnttSgntr"
})
public class ActionMessage4 {

    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat2Code frmt;
    @XmlElement(name = "Msg")
    protected String msg;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "Dvc")
    @XmlSchemaType(name = "string")
    protected ATMDevice1Code dvc;
    @XmlElement(name = "MsgCnttSgntr")
    protected byte[] msgCnttSgntr;

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat2Code }
     *     
     */
    public OutputFormat2Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat2Code }
     *     
     */
    public ActionMessage4 setFrmt(OutputFormat2Code value) {
        this.frmt = value;
        return this;
    }

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ActionMessage4 setMsg(String value) {
        this.msg = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ActionMessage4 setRef(String value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the dvc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDevice1Code }
     *     
     */
    public ATMDevice1Code getDvc() {
        return dvc;
    }

    /**
     * Sets the value of the dvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDevice1Code }
     *     
     */
    public ActionMessage4 setDvc(ATMDevice1Code value) {
        this.dvc = value;
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
    public ActionMessage4 setMsgCnttSgntr(byte[] value) {
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
