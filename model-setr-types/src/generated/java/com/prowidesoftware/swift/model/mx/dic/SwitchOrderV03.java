
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
 * An instructing party, for example, an investment manager or its authorised representative, sends the SwitchOrder message to the executing party, for example, a transfer agent, to instruct a switch transaction from a financial instrument or multiple financial instruments to a different specified financial instrument or instruments for a specified amount/quantity.
 * Usage
 * The SwitchOrder message is used to either:
 * - instruct one switch transaction comprising one or more redemption legs and one or more subscription legs, that is, a single switch transaction that can be a one to one, many to one, many to many or one to many switch transaction, or,
 * - instruct one or many switch transactions each comprising one redemption leg and one subscription leg, that is, multiple simple switch transactions.
 * The SwitchOrder message may be used to either:
 * - instruct a switch transaction for one investment account, or,
 * - instruct a switch transaction for separate accounts at the redemption and subscription leg levels.
 * The message caters for a switch from one financial instrument to another financial instrument (within the same fund family), many to one, many to many and one to many.
 * The message caters for switch transactions that result in an additional cash payment from the investor or a transaction that results in a net payment to the investor. Not all institutions or funds permit this type of switch and acceptance is therefore not automatic. 
 * There is no limitation on the number of switch legs in a switch message. The number allowed is defined by the fund prospectus or by the service level agreement (SLA) in place between the two parties. However, if the SwitchOrderDetails sequence is present more than once, then the RedemptionLegDetails and SubscriptionLegDetails sequences may only be present once.
 * If SwitchOrderDetails\InvestmentAccount is used, then the InvestmentAccountDetails sequences in SubscriptionLegDetails and RedemptionLegDetails are not allowed. This functionality is to be used by institutions that set up two accounts per investor, rather than one investment account.
 * There is no switch driver type in the message to indicate whether the switch is buy or sell driven. A driver is not needed since it is possible to indicate the total subscription amount or the total redemption amount. Only one of these two amounts should be used. 
 * The subscription quantity can be expressed in one of the following ways:
 * - Amount: the monetary value (either GROSS or NET) of the financial instrument to be subscribed to, eg, the subscription of EUR 1,000 of financial instrument ISIN LU1234567890 or 
 * - Unit: the number of units of the financial instrument to be subscribed to, eg, the subscription of 10 units of financial instrument ISIN LU1234567890 or 
 * - Percentage of the total redemption amount: when the switch transaction is redemption driven, it is the part of the redemption amount that must be switched to a specific financial instrument, for example, the subscription quantity of financial instrument ISIN LU1234567890 represents 50% of the redemption amount of the financial instrument ISIN LU4444444444.
 * The redemption quantity can be expressed in one of the following ways:
 * - Amount: the monetary value (either GROSS or NET) of the financial instrument to be redeemed, eg, the redemption of EUR 1,000 of financial instrument ISIN LU1234567890, or 
 * - Unit: the number of units of financial instrument to be redeemed, eg, the redemption of 10 units of financial instrument ISIN LU1234567890, or
 * - Rate: the part of the portfolio to be redeemed, eg, the redemption of 10% of the holdings in financial instrument ISIN LU1234567890, or
 * - Percentage of the total subscription amount: when the switch transaction is subscription driven, it is the part of the subscription amount that must be the result of the redemption of a specific financial instrument, for example, the redemption quantity in financial instrument ABC represents 50% of the subscription amount of the financial instrument ISIN LU4444444444
 * .
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchOrderV03", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "msgPgntn",
    "swtchOrdrDtls",
    "cpyDtls",
    "xtnsn"
})
public class SwitchOrderV03 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference3 poolRef;
    @XmlElement(name = "PrvsRef")
    protected List<AdditionalReference3> prvsRef;
    @XmlElement(name = "MsgPgntn")
    protected Pagination msgPgntn;
    @XmlElement(name = "SwtchOrdrDtls", required = true)
    protected List<SwitchOrder4> swtchOrdrDtls;
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
    public SwitchOrderV03 setMsgId(MessageIdentification1 value) {
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
    public SwitchOrderV03 setPoolRef(AdditionalReference3 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prvsRef property.
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
     */
    public List<AdditionalReference3> getPrvsRef() {
        if (prvsRef == null) {
            prvsRef = new ArrayList<AdditionalReference3>();
        }
        return this.prvsRef;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public SwitchOrderV03 setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
        return this;
    }

    /**
     * Gets the value of the swtchOrdrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swtchOrdrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwtchOrdrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchOrder4 }
     * 
     * 
     */
    public List<SwitchOrder4> getSwtchOrdrDtls() {
        if (swtchOrdrDtls == null) {
            swtchOrdrDtls = new ArrayList<SwitchOrder4>();
        }
        return this.swtchOrdrDtls;
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
    public SwitchOrderV03 setCpyDtls(CopyInformation2 value) {
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
     * Adds a new item to the prvsRef list.
     * @see #getPrvsRef()
     * 
     */
    public SwitchOrderV03 addPrvsRef(AdditionalReference3 prvsRef) {
        getPrvsRef().add(prvsRef);
        return this;
    }

    /**
     * Adds a new item to the swtchOrdrDtls list.
     * @see #getSwtchOrdrDtls()
     * 
     */
    public SwitchOrderV03 addSwtchOrdrDtls(SwitchOrder4 swtchOrdrDtls) {
        getSwtchOrdrDtls().add(swtchOrdrDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public SwitchOrderV03 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
