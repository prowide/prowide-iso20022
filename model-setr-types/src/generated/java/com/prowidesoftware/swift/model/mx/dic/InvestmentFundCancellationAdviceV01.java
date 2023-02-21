
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
 * An executing party/account servicer, for example, a transfer agent or administrator, sends the InvestmentFundCancellationAdvice to the instructing party/account owner, for example, an investment manager, custodian or its authorised representative, to cancel a previously sent investment fund order confirmation or statement message.
 * There may be one or more parties between the executing party/account servicer and the instructing party/account owner.
 * Usage
 * The InvestmentFundCancellationAdvice message is used either to:
 * - cancel one or more previously sent order confirmations, such as the confirmation contained in a SubscriptionOrderConfirmation, AlternativeFundsSubscriptionOrderConfirmation, etc, or,
 * - cancel a previously sent statement message.
 * (1) When the InvestmentFundCancellationAdvice message is used to advise on the cancellation of an order confirmation message:
 * - The business references, for example, the OrderReference or DealReference as specified in the order confirmation message are specified.
 * - The amendment indicator element may be used to specify whether the order confirmation cancellation advice is to be followed by a new order confirmation.
 * - Elements of the individual order confirmation, as listed in the original order confirmation message, may also be specified, but this is not recommended.
 * - The message identification of the order confirmation message may also be quoted in PreviousReference, but this is not recommended.
 * (2) When the InvestmentFundCancellationAdvice message is used to advise on the cancellation of a statement:
 * - The reference of the statement is quoted.
 * - The report number, statement date and the account number, etc, may also be provided.
 * - The amendment indicator element may be used to specify whether the statement cancellation advice is to be followed by a new statement.
 * - The message identification of the original statement message may also be quoted in PreviousReference, but this is not recommended.
 * The rejection of a InvestmentFundCancellationAdvice is made using an OrderConfirmationStatusReport message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundCancellationAdviceV01", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "advcDtls",
    "cpyDtls",
    "xtnsn"
})
public class InvestmentFundCancellationAdviceV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference4 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference4 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference4 rltdRef;
    @XmlElement(name = "AdvcDtls", required = true)
    protected Advice1Choice advcDtls;
    @XmlElement(name = "CpyDtls")
    protected CopyInformation2 cpyDtls;
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
    public InvestmentFundCancellationAdviceV01 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference4 }
     *     
     */
    public AdditionalReference4 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference4 }
     *     
     */
    public InvestmentFundCancellationAdviceV01 setPoolRef(AdditionalReference4 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference4 }
     *     
     */
    public AdditionalReference4 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference4 }
     *     
     */
    public InvestmentFundCancellationAdviceV01 setPrvsRef(AdditionalReference4 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference4 }
     *     
     */
    public AdditionalReference4 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference4 }
     *     
     */
    public InvestmentFundCancellationAdviceV01 setRltdRef(AdditionalReference4 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the advcDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Advice1Choice }
     *     
     */
    public Advice1Choice getAdvcDtls() {
        return advcDtls;
    }

    /**
     * Sets the value of the advcDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Advice1Choice }
     *     
     */
    public InvestmentFundCancellationAdviceV01 setAdvcDtls(Advice1Choice value) {
        this.advcDtls = value;
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
    public InvestmentFundCancellationAdviceV01 setCpyDtls(CopyInformation2 value) {
        this.cpyDtls = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
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
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension1>();
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
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public InvestmentFundCancellationAdviceV01 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
