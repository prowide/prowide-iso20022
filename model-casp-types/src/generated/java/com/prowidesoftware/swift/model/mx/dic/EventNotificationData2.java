
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
 * Content of the EventNotification message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventNotificationData2", propOrder = {
    "rtlrEvt",
    "mntncReqrdFlg",
    "cstmrLang",
    "dispOutpt"
})
public class EventNotificationData2 {

    @XmlElement(name = "RtlrEvt", required = true)
    protected RetailerEvent2 rtlrEvt;
    @XmlElement(name = "MntncReqrdFlg")
    protected Boolean mntncReqrdFlg;
    @XmlElement(name = "CstmrLang")
    protected String cstmrLang;
    @XmlElement(name = "DispOutpt")
    protected ActionMessage7 dispOutpt;

    /**
     * Gets the value of the rtlrEvt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerEvent2 }
     *     
     */
    public RetailerEvent2 getRtlrEvt() {
        return rtlrEvt;
    }

    /**
     * Sets the value of the rtlrEvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerEvent2 }
     *     
     */
    public EventNotificationData2 setRtlrEvt(RetailerEvent2 value) {
        this.rtlrEvt = value;
        return this;
    }

    /**
     * Gets the value of the mntncReqrdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMntncReqrdFlg() {
        return mntncReqrdFlg;
    }

    /**
     * Sets the value of the mntncReqrdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public EventNotificationData2 setMntncReqrdFlg(Boolean value) {
        this.mntncReqrdFlg = value;
        return this;
    }

    /**
     * Gets the value of the cstmrLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrLang() {
        return cstmrLang;
    }

    /**
     * Sets the value of the cstmrLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EventNotificationData2 setCstmrLang(String value) {
        this.cstmrLang = value;
        return this;
    }

    /**
     * Gets the value of the dispOutpt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage7 }
     *     
     */
    public ActionMessage7 getDispOutpt() {
        return dispOutpt;
    }

    /**
     * Sets the value of the dispOutpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage7 }
     *     
     */
    public EventNotificationData2 setDispOutpt(ActionMessage7 value) {
        this.dispOutpt = value;
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
