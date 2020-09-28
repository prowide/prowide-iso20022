
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
 * The ActivityReportSetUpRequest message is sent by any party involved in a transaction to the matching application.
 * The ActivityReportSetUpRequest message can be sent to request the reset of the pre-determined time at which the daily production of the activity report should take place.
 * Usage
 * This message is sent to the matching application by a bank, in order to set the UTC offset specifying the hour when the matching application will generate every day an activity report covering the last 24 hours and send it. By default, this offset is equal to 0.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityReportSetUpRequestV02", propOrder = {
    "reqId",
    "utcOffset"
})
public class ActivityReportSetUpRequestV02 {

    @XmlElement(name = "ReqId", required = true)
    protected MessageIdentification1 reqId;
    @XmlElement(name = "UTCOffset", required = true)
    protected UTCOffset1 utcOffset;

    /**
     * Gets the value of the reqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getReqId() {
        return reqId;
    }

    /**
     * Sets the value of the reqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public ActivityReportSetUpRequestV02 setReqId(MessageIdentification1 value) {
        this.reqId = value;
        return this;
    }

    /**
     * Gets the value of the utcOffset property.
     * 
     * @return
     *     possible object is
     *     {@link UTCOffset1 }
     *     
     */
    public UTCOffset1 getUTCOffset() {
        return utcOffset;
    }

    /**
     * Sets the value of the utcOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTCOffset1 }
     *     
     */
    public ActivityReportSetUpRequestV02 setUTCOffset(UTCOffset1 value) {
        this.utcOffset = value;
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
