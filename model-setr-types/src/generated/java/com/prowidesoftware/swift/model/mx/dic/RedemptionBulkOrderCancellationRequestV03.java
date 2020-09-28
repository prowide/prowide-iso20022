
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
 * An instructing party, for example, an investment manager or its authorised representative, sends the RedemptionBulkOrderCancellationRequest message to the executing party, for example, a transfer agent, to request the cancellation of a previously sent RedemptionBulkOrder instruction.
 * Usage
 * The RedemptionBulkOrderCancellationRequest message is used to either:
 * - request the cancellation of an entire RedemptionBulkOrder message, that is, all the individual orders that it contained, or,
 * - request the cancellation of one or more individual orders included in a previously sent RedemptionBulkOrder message. There is no amendment, but a cancellation and re-instruct policy.
 * There are two ways to use the message.
 * (1) When the RedemptionBulkOrderCancellationRequest message is used to request the cancellation of an entire RedemptionBulkOrder message, this can be done by either:
 * - quoting the order references of all the individual orders listed in the RedemptionBulkOrder message, or,
 * - quoting the details of all the individual orders (this includes the OrderReference) listed in RedemptionBulkOrder message, but this is not recommended.
 * The message identification of the RedemptionBulkOrder message may also be quoted in PreviousReference.
 * It is also possible to request the cancellation of an entire RedemptionBulkOrder message by quoting its message identification in PreviousReference, but this is not recommended.
 * (2) When the RedemptionBulkOrderCancellationRequest message is used to request the cancellation of one or more individual orders, this can be done by either:
 * - quoting the OrderReference of each individual order listed in the RedemptionOrder message, or,
 * - quoting the details of each individual order (including the OrderReference) listed in RedemptionOrder message, but this is not recommended.
 * The message identification of the RedemptionBulkOrder message in which the individual order was conveyed may also be quoted in PreviousReference.
 * The deadline and acceptance of a cancellation request is subject to a service level agreement (SLA). This cancellation message is a cancellation request. There is no automatic acceptance of the cancellation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionBulkOrderCancellationRequestV03", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "cxlByRef",
    "cxlByOrdrDtls",
    "cpyDtls"
})
public class RedemptionBulkOrderCancellationRequestV03 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference3 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference3 prvsRef;
    @XmlElement(name = "CxlByRef")
    protected InvestmentFundOrder1 cxlByRef;
    @XmlElement(name = "CxlByOrdrDtls")
    protected RedemptionBulkOrderInstruction2 cxlByOrdrDtls;
    @XmlElement(name = "CpyDtls")
    protected CopyInformation2 cpyDtls;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public RedemptionBulkOrderCancellationRequestV03 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
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
    public RedemptionBulkOrderCancellationRequestV03 setPoolRef(AdditionalReference3 value) {
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
    public RedemptionBulkOrderCancellationRequestV03 setPrvsRef(AdditionalReference3 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlByRef property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundOrder1 }
     *     
     */
    public InvestmentFundOrder1 getCxlByRef() {
        return cxlByRef;
    }

    /**
     * Sets the value of the cxlByRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundOrder1 }
     *     
     */
    public RedemptionBulkOrderCancellationRequestV03 setCxlByRef(InvestmentFundOrder1 value) {
        this.cxlByRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlByOrdrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionBulkOrderInstruction2 }
     *     
     */
    public RedemptionBulkOrderInstruction2 getCxlByOrdrDtls() {
        return cxlByOrdrDtls;
    }

    /**
     * Sets the value of the cxlByOrdrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionBulkOrderInstruction2 }
     *     
     */
    public RedemptionBulkOrderCancellationRequestV03 setCxlByOrdrDtls(RedemptionBulkOrderInstruction2 value) {
        this.cxlByOrdrDtls = value;
        return this;
    }

    /**
     * Gets the value of the cpyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CopyInformation2 }
     *     
     */
    public CopyInformation2 getCpyDtls() {
        return cpyDtls;
    }

    /**
     * Sets the value of the cpyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyInformation2 }
     *     
     */
    public RedemptionBulkOrderCancellationRequestV03 setCpyDtls(CopyInformation2 value) {
        this.cpyDtls = value;
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
