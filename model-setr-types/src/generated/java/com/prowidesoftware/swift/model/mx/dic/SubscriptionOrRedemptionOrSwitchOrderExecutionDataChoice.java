
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
 * Choice of subscription details executed, or redemption details executed, or switch order details executed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice", propOrder = {
    "sbcptDtls",
    "redDtls",
    "swtchDtls"
})
public class SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice {

    @XmlElement(name = "SbcptDtls")
    protected SubscriptionExecution8 sbcptDtls;
    @XmlElement(name = "RedDtls")
    protected RedemptionExecution11 redDtls;
    @XmlElement(name = "SwtchDtls")
    protected SwitchExecution5 swtchDtls;

    /**
     * Gets the value of the sbcptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionExecution8 }
     *     
     */
    public SubscriptionExecution8 getSbcptDtls() {
        return sbcptDtls;
    }

    /**
     * Sets the value of the sbcptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionExecution8 }
     *     
     */
    public SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice setSbcptDtls(SubscriptionExecution8 value) {
        this.sbcptDtls = value;
        return this;
    }

    /**
     * Gets the value of the redDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionExecution11 }
     *     
     */
    public RedemptionExecution11 getRedDtls() {
        return redDtls;
    }

    /**
     * Sets the value of the redDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionExecution11 }
     *     
     */
    public SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice setRedDtls(RedemptionExecution11 value) {
        this.redDtls = value;
        return this;
    }

    /**
     * Gets the value of the swtchDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchExecution5 }
     *     
     */
    public SwitchExecution5 getSwtchDtls() {
        return swtchDtls;
    }

    /**
     * Sets the value of the swtchDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchExecution5 }
     *     
     */
    public SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice setSwtchDtls(SwitchExecution5 value) {
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
