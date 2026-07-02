
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for DeliveryCtrl complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryCtrl", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "deliveryMode",
    "snlep",
    "directAddressing",
    "notifQueue",
    "deliveryNotif",
    "inputChannelCtrl",
    "overdueWarningDelay",
    "overdueTime",
    "deliveryNotificationViaSystemMessage",
    "copyThirdPartyList"
})
public class SwIntDeliveryCtrl {

    @XmlElement(name = "DeliveryMode")
    protected String deliveryMode;
    @XmlElement(name = "SNLEP")
    protected String snlep;
    @XmlElement(name = "DirectAddressing")
    protected String directAddressing;
    @XmlElement(name = "NotifQueue")
    protected String notifQueue;
    @XmlElement(name = "DeliveryNotif", namespace = "urn:swift:snl:ns.Sw")
    protected String deliveryNotif;
    @XmlElement(name = "InputChannelCtrl", namespace = "urn:swift:snl:ns.Sw")
    protected SwInputChannelCtrl inputChannelCtrl;
    @XmlElement(name = "OverdueWarningDelay", namespace = "urn:swift:snl:ns.Sw")
    protected String overdueWarningDelay;
    @XmlElement(name = "OverdueTime", namespace = "urn:swift:snl:ns.Sw")
    protected String overdueTime;
    @XmlElement(name = "DeliveryNotificationViaSystemMessage", namespace = "urn:swift:snl:ns.Sw")
    protected String deliveryNotificationViaSystemMessage;
    @XmlElement(name = "CopyThirdPartyList", namespace = "urn:swift:snl:ns.Sw")
    protected SwThirdPartyList copyThirdPartyList;

    /**
     * Gets the value of the deliveryMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMode() {
        return deliveryMode;
    }

    /**
     * Sets the value of the deliveryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntDeliveryCtrl setDeliveryMode(String value) {
        this.deliveryMode = value;
        return this;
    }

    /**
     * Gets the value of the snlep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNLEP() {
        return snlep;
    }

    /**
     * Sets the value of the snlep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntDeliveryCtrl setSNLEP(String value) {
        this.snlep = value;
        return this;
    }

    /**
     * Gets the value of the directAddressing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectAddressing() {
        return directAddressing;
    }

    /**
     * Sets the value of the directAddressing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntDeliveryCtrl setDirectAddressing(String value) {
        this.directAddressing = value;
        return this;
    }

    /**
     * Gets the value of the notifQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifQueue() {
        return notifQueue;
    }

    /**
     * Sets the value of the notifQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntDeliveryCtrl setNotifQueue(String value) {
        this.notifQueue = value;
        return this;
    }

    /**
     * Gets the value of the deliveryNotif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryNotif() {
        return deliveryNotif;
    }

    /**
     * Sets the value of the deliveryNotif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntDeliveryCtrl setDeliveryNotif(String value) {
        this.deliveryNotif = value;
        return this;
    }

    /**
     * Gets the value of the inputChannelCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link SwInputChannelCtrl }
     *     
     */
    public SwInputChannelCtrl getInputChannelCtrl() {
        return inputChannelCtrl;
    }

    /**
     * Sets the value of the inputChannelCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwInputChannelCtrl }
     *     
     */
    public SwIntDeliveryCtrl setInputChannelCtrl(SwInputChannelCtrl value) {
        this.inputChannelCtrl = value;
        return this;
    }

    /**
     * Gets the value of the overdueWarningDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueWarningDelay() {
        return overdueWarningDelay;
    }

    /**
     * Sets the value of the overdueWarningDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntDeliveryCtrl setOverdueWarningDelay(String value) {
        this.overdueWarningDelay = value;
        return this;
    }

    /**
     * Gets the value of the overdueTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueTime() {
        return overdueTime;
    }

    /**
     * Sets the value of the overdueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntDeliveryCtrl setOverdueTime(String value) {
        this.overdueTime = value;
        return this;
    }

    /**
     * Gets the value of the deliveryNotificationViaSystemMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryNotificationViaSystemMessage() {
        return deliveryNotificationViaSystemMessage;
    }

    /**
     * Sets the value of the deliveryNotificationViaSystemMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntDeliveryCtrl setDeliveryNotificationViaSystemMessage(String value) {
        this.deliveryNotificationViaSystemMessage = value;
        return this;
    }

    /**
     * Gets the value of the copyThirdPartyList property.
     * 
     * @return
     *     possible object is
     *     {@link SwThirdPartyList }
     *     
     */
    public SwThirdPartyList getCopyThirdPartyList() {
        return copyThirdPartyList;
    }

    /**
     * Sets the value of the copyThirdPartyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwThirdPartyList }
     *     
     */
    public SwIntDeliveryCtrl setCopyThirdPartyList(SwThirdPartyList value) {
        this.copyThirdPartyList = value;
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
