
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
 * Choice of subscription, redemption or switch order details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionOrRedemptionOrSwitchOrderDataChoice", propOrder = {
    "sbcptDtls",
    "redDtls",
    "swtchDtls"
})
public class SubscriptionOrRedemptionOrSwitchOrderDataChoice {

    @XmlElement(name = "SbcptDtls")
    protected SubscriptionOrder10 sbcptDtls;
    @XmlElement(name = "RedDtls")
    protected RedemptionOrder10 redDtls;
    @XmlElement(name = "SwtchDtls")
    protected SwitchOrder5 swtchDtls;

    /**
     * Gets the value of the sbcptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionOrder10 }
     *     
     */
    public SubscriptionOrder10 getSbcptDtls() {
        return sbcptDtls;
    }

    /**
     * Sets the value of the sbcptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionOrder10 }
     *     
     */
    public SubscriptionOrRedemptionOrSwitchOrderDataChoice setSbcptDtls(SubscriptionOrder10 value) {
        this.sbcptDtls = value;
        return this;
    }

    /**
     * Gets the value of the redDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionOrder10 }
     *     
     */
    public RedemptionOrder10 getRedDtls() {
        return redDtls;
    }

    /**
     * Sets the value of the redDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionOrder10 }
     *     
     */
    public SubscriptionOrRedemptionOrSwitchOrderDataChoice setRedDtls(RedemptionOrder10 value) {
        this.redDtls = value;
        return this;
    }

    /**
     * Gets the value of the swtchDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchOrder5 }
     *     
     */
    public SwitchOrder5 getSwtchDtls() {
        return swtchDtls;
    }

    /**
     * Sets the value of the swtchDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchOrder5 }
     *     
     */
    public SubscriptionOrRedemptionOrSwitchOrderDataChoice setSwtchDtls(SwitchOrder5 value) {
        this.swtchDtls = value;
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
