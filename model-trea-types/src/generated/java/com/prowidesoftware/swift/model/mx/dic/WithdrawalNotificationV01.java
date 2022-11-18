
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
 * The WithdrawalNotification message is sent by a central system to notify the withdrawal of a trade which was previously notified to the receiver as an alleged trade.
 * Usage
 * The message is used to confirm the cancellation of a previously notified trade.
 * 
 * This message is obsolete please use WithdrawalNotificationV02 - fxtr.013.001.02
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WithdrawalNotificationV01", propOrder = {
    "mtchgSysUnqRef"
})
public class WithdrawalNotificationV01 {

    @XmlElement(name = "MtchgSysUnqRef", required = true)
    protected MessageReference mtchgSysUnqRef;

    /**
     * Gets the value of the mtchgSysUnqRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference }
     *     
     */
    public MessageReference getMtchgSysUnqRef() {
        return mtchgSysUnqRef;
    }

    /**
     * Sets the value of the mtchgSysUnqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference }
     *     
     */
    public WithdrawalNotificationV01 setMtchgSysUnqRef(MessageReference value) {
        this.mtchgSysUnqRef = value;
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
