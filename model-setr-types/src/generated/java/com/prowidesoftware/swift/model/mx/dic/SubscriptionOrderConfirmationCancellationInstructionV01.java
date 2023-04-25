
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * An executing party, for example, a transfer agent, sends the SubscriptionOrderConfirmationCancellationInstruction message to the instructing party, for example, an investment manager or its authorised representative to cancel a previously sent SubscriptionOrderConfirmation.
 * Usage
 * The SubscriptionOrderConfirmationCancellationInstruction message is used to cancel one or more previously sent subscription order confirmations. The amendment indicator element is used to specify whether the subscription order confirmation cancellation is to be followed by a SubscriptionOrderConfirmationAmendment.
 * The SubscriptionOrderConfirmationCancellationInstruction message is used to either:
 * - cancel an entire SubscriptionOrderConfirmation message, that is, all the individual order confirmations that it contained, or,
 * - request the cancellation of one or more individual confirmations.
 * There are two ways to use the message.
 * (1) When the SubscriptionOrderConfirmationCancellationInstruction message is used to cancel an entire message, this can be done by either:
 * - quoting the business references, for example, OrderReference, Deal Reference, of all the individual order confirmations listed in the SubscriptionOrderConfirmation message, or,
 * - quoting the details of all the individual order confirmations (this includes the OrderReference and DealReference) listed in SubscriptionOrderConfirmation message but this is not recommended.
 * The message identification of the SubscriptionOrderConfirmation message may also be quoted in PreviousReference.
 * It is also possible to instruct the cancellation of an entire confirmation message by quoting its message identification in PreviousReference.
 * (2) When the SubscriptionOrderConfirmationCancellationInstruction message is used to cancel one or more individual order confirmations, this can be done by either:
 * - quoting the "business" references, for example, OrderReference, Deal Reference, of each individual order confirmation listed in the SubscriptionOrderConfirmation message, or,
 * - quoting the details of each individual order execution (this includes the OrderReference and DealReference) listed in SubscriptionOrderConfirmation message but this is not recommended.
 * The message identification of the SubscriptionOrderConfirmation message in which the individual order confirmation was conveyed may also be quoted in PreviousReference.
 * The rejection or acceptance of a SubscriptionOrderConfirmationCancellationInstruction is made using an OrderConfirmationStatusReport message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionOrderConfirmationCancellationInstructionV01", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "cxlByRef",
    "cxlByOrdrConfDtls",
    "cpyDtls"
})
public class SubscriptionOrderConfirmationCancellationInstructionV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference3 poolRef;
    @XmlElement(name = "PrvsRef")
    protected List<AdditionalReference3> prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference3 rltdRef;
    @XmlElement(name = "CxlByRef")
    protected InvestmentFundOrderExecution1 cxlByRef;
    @XmlElement(name = "CxlByOrdrConfDtls")
    protected SubscriptionOrderConfirmation1 cxlByOrdrConfDtls;
    @XmlElement(name = "CpyDtls")
    protected CopyInformation1 cpyDtls;

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
    public SubscriptionOrderConfirmationCancellationInstructionV01 setMsgId(MessageIdentification1 value) {
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
    public SubscriptionOrderConfirmationCancellationInstructionV01 setPoolRef(AdditionalReference3 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvsRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvsRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReference3 }
     * 
     * 
     * @return
     *     The value of the prvsRef property.
     */
    public List<AdditionalReference3> getPrvsRef() {
        if (prvsRef == null) {
            prvsRef = new ArrayList<>();
        }
        return this.prvsRef;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public SubscriptionOrderConfirmationCancellationInstructionV01 setRltdRef(AdditionalReference3 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlByRef property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundOrderExecution1 }
     *     
     */
    public InvestmentFundOrderExecution1 getCxlByRef() {
        return cxlByRef;
    }

    /**
     * Sets the value of the cxlByRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundOrderExecution1 }
     *     
     */
    public SubscriptionOrderConfirmationCancellationInstructionV01 setCxlByRef(InvestmentFundOrderExecution1 value) {
        this.cxlByRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlByOrdrConfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionOrderConfirmation1 }
     *     
     */
    public SubscriptionOrderConfirmation1 getCxlByOrdrConfDtls() {
        return cxlByOrdrConfDtls;
    }

    /**
     * Sets the value of the cxlByOrdrConfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionOrderConfirmation1 }
     *     
     */
    public SubscriptionOrderConfirmationCancellationInstructionV01 setCxlByOrdrConfDtls(SubscriptionOrderConfirmation1 value) {
        this.cxlByOrdrConfDtls = value;
        return this;
    }

    /**
     * Gets the value of the cpyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CopyInformation1 }
     *     
     */
    public CopyInformation1 getCpyDtls() {
        return cpyDtls;
    }

    /**
     * Sets the value of the cpyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyInformation1 }
     *     
     */
    public SubscriptionOrderConfirmationCancellationInstructionV01 setCpyDtls(CopyInformation1 value) {
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

    /**
     * Adds a new item to the prvsRef list.
     * @see #getPrvsRef()
     * 
     */
    public SubscriptionOrderConfirmationCancellationInstructionV01 addPrvsRef(AdditionalReference3 prvsRef) {
        getPrvsRef().add(prvsRef);
        return this;
    }

}
