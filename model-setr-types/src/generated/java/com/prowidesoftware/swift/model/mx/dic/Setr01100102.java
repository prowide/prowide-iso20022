
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
 * The SubscriptionMultipleOrderCancellationInstruction message is sent by an instructing party, eg, an investment manager or its authorised representative , to an executing party, eg, a transfer agent. There may be one or more intermediary parties between the instructing party and the executing party. The intermediary party is, for example, an intermediary or a concentrator.
 * This message is sent to cancel a previously sent SubscriptionMultipleOrder instruction.
 * Usage
 * The SubscriptionMultipleOrderCancellationInstruction message is used to cancel the entire previously sent SubscriptionMultipleOrder message and all the individual orders that it contained. There is no amendment, but a cancellation and re-instruct policy.
 * This message must contain the reference of the message to be cancelled. This message may also contain all the details of the message to be cancelled, but this is not recommended.
 * The deadline and acceptance of a cancellation instruction is subject to a service level agreement (SLA). This cancellation message is a cancellation instruction. There is no automatic acceptance of the cancellation instruction.
 * The rejection or acceptance of a cancellation message instruction is made using an OrderCancellationStatusReport message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setr.011.001.02", propOrder = {
    "mstrRef",
    "poolRef",
    "prvsRef",
    "ordrToBeCanc"
})
public class Setr01100102 {

    @XmlElement(name = "MstrRef")
    protected AdditionalReference3 mstrRef;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference3 poolRef;
    @XmlElement(name = "PrvsRef", required = true)
    protected AdditionalReference3 prvsRef;
    @XmlElement(name = "OrdrToBeCanc")
    protected SubscriptionMultipleOrderInstruction1 ordrToBeCanc;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public Setr01100102 setMstrRef(AdditionalReference3 value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public Setr01100102 setPoolRef(AdditionalReference3 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public Setr01100102 setPrvsRef(AdditionalReference3 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrToBeCanc property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionMultipleOrderInstruction1 }
     *     
     */
    public SubscriptionMultipleOrderInstruction1 getOrdrToBeCanc() {
        return ordrToBeCanc;
    }

    /**
     * Sets the value of the ordrToBeCanc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionMultipleOrderInstruction1 }
     *     
     */
    public Setr01100102 setOrdrToBeCanc(SubscriptionMultipleOrderInstruction1 value) {
        this.ordrToBeCanc = value;
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
