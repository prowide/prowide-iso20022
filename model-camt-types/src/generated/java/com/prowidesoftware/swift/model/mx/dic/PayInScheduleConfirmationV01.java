
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
 * The PayInScheduleConfirmation message is sent by a participant of a central system to the central settlement system to confirm a PayInSchedule has been received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayInScheduleConfirmationV01", propOrder = {
    "msgId",
    "confDtls"
})
public class PayInScheduleConfirmationV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "ConfDtls", required = true)
    protected ConfirmationDetails1 confDtls;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification }
     *     
     */
    public MessageIdentification getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification }
     *     
     */
    public PayInScheduleConfirmationV01 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the confDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationDetails1 }
     *     
     */
    public ConfirmationDetails1 getConfDtls() {
        return confDtls;
    }

    /**
     * Sets the value of the confDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationDetails1 }
     *     
     */
    public PayInScheduleConfirmationV01 setConfDtls(ConfirmationDetails1 value) {
        this.confDtls = value;
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
