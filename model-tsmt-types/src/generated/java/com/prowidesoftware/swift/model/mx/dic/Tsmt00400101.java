
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
 * The ActivityReportSetUpRequest message is sent by either party involved in a transaction to the matching application.
 * This message is used to request the reset of the pre-determined time at which an activity report is generated.
 * Usage
 * The ActivityReportSetUpRequest message can be sent to request the reset of the pre-determined time at which the daily production of the activity report should take place.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tsmt.004.001.01", propOrder = {
    "reqId",
    "submitr",
    "utcOffset"
})
public class Tsmt00400101 {

    @XmlElement(name = "ReqId", required = true)
    protected MessageIdentification1 reqId;
    @XmlElement(name = "Submitr", required = true)
    protected BICIdentification1 submitr;
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
    public Tsmt00400101 setReqId(MessageIdentification1 value) {
        this.reqId = value;
        return this;
    }

    /**
     * Gets the value of the submitr property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getSubmitr() {
        return submitr;
    }

    /**
     * Sets the value of the submitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public Tsmt00400101 setSubmitr(BICIdentification1 value) {
        this.submitr = value;
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
    public Tsmt00400101 setUTCOffset(UTCOffset1 value) {
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
