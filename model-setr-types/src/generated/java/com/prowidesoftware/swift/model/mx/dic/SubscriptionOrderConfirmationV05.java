
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
 * The SubscriptionOrderConfirmation message is sent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or its authorised representative, to confirm the details of the execution of a SubscriptionOrder instruction.
 * Usage
 * The SubscriptionOrderConfirmation message is used to confirm the execution of one or more individual orders.
 * A SubscriptionOrder message containing more than one individual order may be responded to by more than one SubscriptionOrderConfirmation message, as the valuation cycle of the financial instruments in each individual order may be different. When a SubscriptionOrderConfirmation message contains fewer confirmations that originally instructed in the original SubscriptionOrder message, there is no specification indication in the confirmation for this. Reconciliation must be based on the references.
 * Each individual order confirmation specified is identified in DealReference. The reference of the original individual order is specified in OrderReference. The message identification of the SubscriptionOrder message in which the individual orders was conveyed may also be quoted in RelatedReference but this is not recommended.
 * 
 * A SubscriptionOrder must in all cases be responded to by a SubscriptionOrderConfirmation message and in no circumstances by a SubscriptionBulkOrderConfirmation message.
 * If the executing party needs to confirm one or more subscription orders for the same financial instrument, then a SubscriptionBulkOrderConfirmation message must be used.
 * When the message is used to convey a confirmation amendment/s, the AmendmentIndicator must be present with the value ‘true’ or ‘1’. When this is the case, the message must only contain a confirmation amendment/s and not contain both a confirmation amendment/s and a ‘new’ confirmation/s.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionOrderConfirmationV05", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "mltplExctnDtls",
    "cpyDtls",
    "xtnsn"
})
public class SubscriptionOrderConfirmationV05 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference11 poolRef;
    @XmlElement(name = "PrvsRef")
    protected List<AdditionalReference10> prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference10 rltdRef;
    @XmlElement(name = "MltplExctnDtls", required = true)
    protected SubscriptionMultipleExecution6 mltplExctnDtls;
    @XmlElement(name = "CpyDtls")
    protected CopyInformation5 cpyDtls;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

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
    public SubscriptionOrderConfirmationV05 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference11 }
     *     
     */
    public AdditionalReference11 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference11 }
     *     
     */
    public SubscriptionOrderConfirmationV05 setPoolRef(AdditionalReference11 value) {
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
     * {@link AdditionalReference10 }
     * 
     * 
     * @return
     *     The value of the prvsRef property.
     */
    public List<AdditionalReference10> getPrvsRef() {
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
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public SubscriptionOrderConfirmationV05 setRltdRef(AdditionalReference10 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the mltplExctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionMultipleExecution6 }
     *     
     */
    public SubscriptionMultipleExecution6 getMltplExctnDtls() {
        return mltplExctnDtls;
    }

    /**
     * Sets the value of the mltplExctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionMultipleExecution6 }
     *     
     */
    public SubscriptionOrderConfirmationV05 setMltplExctnDtls(SubscriptionMultipleExecution6 value) {
        this.mltplExctnDtls = value;
        return this;
    }

    /**
     * Gets the value of the cpyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CopyInformation5 }
     *     
     */
    public CopyInformation5 getCpyDtls() {
        return cpyDtls;
    }

    /**
     * Sets the value of the cpyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyInformation5 }
     *     
     */
    public SubscriptionOrderConfirmationV05 setCpyDtls(CopyInformation5 value) {
        this.cpyDtls = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
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
    public SubscriptionOrderConfirmationV05 addPrvsRef(AdditionalReference10 prvsRef) {
        getPrvsRef().add(prvsRef);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public SubscriptionOrderConfirmationV05 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
