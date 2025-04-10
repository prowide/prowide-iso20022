
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * An instructing party, for example, an investment manager, a custodian or its authorised representative, sends the InvestmentFundOrderCancellationRequest to the executing party, for example, the transfer agent or administrator, to request the cancellation of a previously sent investment fund order, such as the SubscriptionOrder, AlternativeFundsSubscriptionOrder, AlternativeFundsRedemptionOrder, etc.
 * There may be one or more parties between the instructing party and the executing party.
 * Usage
 * The InvestmentFundOrderCancellationRequest message is used to request the cancellation of one or more individual orders.
 * There is no amendment, but a cancel and re-instruct policy.
 * When the InvestmentFundOrderCancellationRequest message is used to request the cancellation of one or more orders:
 * - The order reference of each order to be cancelled (as specified in the original order message) is specified.
 * - Elements of the individual order, as listed in the original order message, may also be specified, but this is not recommended.
 * - The message identification of the order message in which the individual order was conveyed may also be quoted in PreviousReference, but this is not recommended.
 * The deadline and acceptance of a cancellation request is subject to a service level agreement (SLA). This cancellation message is a cancellation request. There is no automatic acceptance of the cancellation.
 * The rejection or acceptance of a InvestmentFundOrderCancellationRequest is made using an OrderCancellationStatusReport message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundOrderCancellationRequestV01", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "ordrCxlDtls",
    "cpyDtls",
    "xtnsn"
})
public class InvestmentFundOrderCancellationRequestV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference4 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference4 prvsRef;
    @XmlElement(name = "OrdrCxlDtls", required = true)
    protected List<InvestmentFundOrder6> ordrCxlDtls;
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
    public InvestmentFundOrderCancellationRequestV01 setMsgId(MessageIdentification1 value) {
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
    public InvestmentFundOrderCancellationRequestV01 setPoolRef(AdditionalReference4 value) {
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
    public InvestmentFundOrderCancellationRequestV01 setPrvsRef(AdditionalReference4 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrCxlDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordrCxlDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrCxlDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFundOrder6 }
     * 
     * 
     */
    public List<InvestmentFundOrder6> getOrdrCxlDtls() {
        if (ordrCxlDtls == null) {
            ordrCxlDtls = new ArrayList<InvestmentFundOrder6>();
        }
        return this.ordrCxlDtls;
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
    public InvestmentFundOrderCancellationRequestV01 setCpyDtls(CopyInformation2 value) {
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
     * Adds a new item to the ordrCxlDtls list.
     * @see #getOrdrCxlDtls()
     * 
     */
    public InvestmentFundOrderCancellationRequestV01 addOrdrCxlDtls(InvestmentFundOrder6 ordrCxlDtls) {
        getOrdrCxlDtls().add(ordrCxlDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public InvestmentFundOrderCancellationRequestV01 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
