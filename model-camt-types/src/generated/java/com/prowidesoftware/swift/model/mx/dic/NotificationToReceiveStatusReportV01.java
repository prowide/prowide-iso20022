
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
 * The NotificationToReceiveStatusReport message is sent by an account servicing institution to an account owner or to a party acting on the account owner's behalf. It is used to notify the account owner about the status of one or more expected payments that were advised in a previous NotificationToReceive message.
 * Usage
 * The NotificationToReceiveStatusReport message is sent in response to a NotificationToReceive message and can be used in either a direct or a relay scenario. It is used to advise the account owner of receipt of the funds as expected. It is also used to notify the account owner of non-receipt of funds or of discrepancies in the funds received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationToReceiveStatusReportV01", propOrder = {
    "grpHdr",
    "orgnlNtfctnAndSts"
})
public class NotificationToReceiveStatusReportV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader44 grpHdr;
    @XmlElement(name = "OrgnlNtfctnAndSts", required = true)
    protected OriginalNotification2 orgnlNtfctnAndSts;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader44 }
     *     
     */
    public GroupHeader44 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader44 }
     *     
     */
    public NotificationToReceiveStatusReportV01 setGrpHdr(GroupHeader44 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNtfctnAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalNotification2 }
     *     
     */
    public OriginalNotification2 getOrgnlNtfctnAndSts() {
        return orgnlNtfctnAndSts;
    }

    /**
     * Sets the value of the orgnlNtfctnAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalNotification2 }
     *     
     */
    public NotificationToReceiveStatusReportV01 setOrgnlNtfctnAndSts(OriginalNotification2 value) {
        this.orgnlNtfctnAndSts = value;
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
