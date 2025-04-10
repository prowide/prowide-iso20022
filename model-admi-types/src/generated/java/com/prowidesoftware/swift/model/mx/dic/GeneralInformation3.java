
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
 * General Information, indicating the function of the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralInformation3", propOrder = {
    "msgId",
    "msgFctn",
    "reqRef"
})
public class GeneralInformation3 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "MsgFctn", required = true)
    @XmlSchemaType(name = "string")
    protected MessageFunction2Code msgFctn;
    @XmlElement(name = "ReqRef")
    protected String reqRef;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeneralInformation3 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the msgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunction2Code }
     *     
     */
    public MessageFunction2Code getMsgFctn() {
        return msgFctn;
    }

    /**
     * Sets the value of the msgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunction2Code }
     *     
     */
    public GeneralInformation3 setMsgFctn(MessageFunction2Code value) {
        this.msgFctn = value;
        return this;
    }

    /**
     * Gets the value of the reqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRef() {
        return reqRef;
    }

    /**
     * Sets the value of the reqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeneralInformation3 setReqRef(String value) {
        this.reqRef = value;
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
