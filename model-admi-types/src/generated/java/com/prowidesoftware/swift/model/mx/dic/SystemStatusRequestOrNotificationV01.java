
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
 * The SystemStatusRequestOrNotification message is sent by a central system to the participant, or, by a participant of a central system to the central system to either:
 * - request a system notification response, or
 * - provide a response to a system status request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemStatusRequestOrNotificationV01", propOrder = {
    "gnlInf",
    "rqstrDtls",
    "rspndrDtls"
})
public class SystemStatusRequestOrNotificationV01 {

    @XmlElement(name = "GnlInf", required = true)
    protected GeneralInformation3 gnlInf;
    @XmlElement(name = "RqstrDtls", required = true)
    protected RequestorDetails1 rqstrDtls;
    @XmlElement(name = "RspndrDtls")
    protected ResponderDetails1 rspndrDtls;

    /**
     * Gets the value of the gnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInformation3 }
     *     
     */
    public GeneralInformation3 getGnlInf() {
        return gnlInf;
    }

    /**
     * Sets the value of the gnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInformation3 }
     *     
     */
    public SystemStatusRequestOrNotificationV01 setGnlInf(GeneralInformation3 value) {
        this.gnlInf = value;
        return this;
    }

    /**
     * Gets the value of the rqstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RequestorDetails1 }
     *     
     */
    public RequestorDetails1 getRqstrDtls() {
        return rqstrDtls;
    }

    /**
     * Sets the value of the rqstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestorDetails1 }
     *     
     */
    public SystemStatusRequestOrNotificationV01 setRqstrDtls(RequestorDetails1 value) {
        this.rqstrDtls = value;
        return this;
    }

    /**
     * Gets the value of the rspndrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ResponderDetails1 }
     *     
     */
    public ResponderDetails1 getRspndrDtls() {
        return rspndrDtls;
    }

    /**
     * Sets the value of the rspndrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponderDetails1 }
     *     
     */
    public SystemStatusRequestOrNotificationV01 setRspndrDtls(ResponderDetails1 value) {
        this.rspndrDtls = value;
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
