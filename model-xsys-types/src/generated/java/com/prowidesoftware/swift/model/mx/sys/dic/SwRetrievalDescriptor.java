
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for RetrievalDescriptor complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievalDescriptor", propOrder = {
    "deliveryCtrl",
    "copyIndicator",
    "authNotifInd",
    "publicRecipientListInd",
    "deliverySummary",
    "ackDescriptor"
})
public class SwRetrievalDescriptor {

    @XmlElement(name = "DeliveryCtrl", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntDeliveryCtrl deliveryCtrl;
    @XmlElement(name = "CopyIndicator")
    protected String copyIndicator;
    @XmlElement(name = "AuthNotifInd")
    protected String authNotifInd;
    @XmlElement(name = "PublicRecipientListInd")
    protected String publicRecipientListInd;
    @XmlElement(name = "DeliverySummary")
    protected SwDeliverySummary deliverySummary;
    @XmlElement(name = "AckDescriptor")
    protected SwAckDescriptor ackDescriptor;

    /**
     * Gets the value of the deliveryCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntDeliveryCtrl }
     *     
     */
    public SwIntDeliveryCtrl getDeliveryCtrl() {
        return deliveryCtrl;
    }

    /**
     * Sets the value of the deliveryCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntDeliveryCtrl }
     *     
     */
    public SwRetrievalDescriptor setDeliveryCtrl(SwIntDeliveryCtrl value) {
        this.deliveryCtrl = value;
        return this;
    }

    /**
     * Gets the value of the copyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyIndicator() {
        return copyIndicator;
    }

    /**
     * Sets the value of the copyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRetrievalDescriptor setCopyIndicator(String value) {
        this.copyIndicator = value;
        return this;
    }

    /**
     * Gets the value of the authNotifInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthNotifInd() {
        return authNotifInd;
    }

    /**
     * Sets the value of the authNotifInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRetrievalDescriptor setAuthNotifInd(String value) {
        this.authNotifInd = value;
        return this;
    }

    /**
     * Gets the value of the publicRecipientListInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicRecipientListInd() {
        return publicRecipientListInd;
    }

    /**
     * Sets the value of the publicRecipientListInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRetrievalDescriptor setPublicRecipientListInd(String value) {
        this.publicRecipientListInd = value;
        return this;
    }

    /**
     * Gets the value of the deliverySummary property.
     * 
     * @return
     *     possible object is
     *     {@link SwDeliverySummary }
     *     
     */
    public SwDeliverySummary getDeliverySummary() {
        return deliverySummary;
    }

    /**
     * Sets the value of the deliverySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwDeliverySummary }
     *     
     */
    public SwRetrievalDescriptor setDeliverySummary(SwDeliverySummary value) {
        this.deliverySummary = value;
        return this;
    }

    /**
     * Gets the value of the ackDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link SwAckDescriptor }
     *     
     */
    public SwAckDescriptor getAckDescriptor() {
        return ackDescriptor;
    }

    /**
     * Sets the value of the ackDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAckDescriptor }
     *     
     */
    public SwRetrievalDescriptor setAckDescriptor(SwAckDescriptor value) {
        this.ackDescriptor = value;
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
