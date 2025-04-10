
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
 * The SubscriptionOrder message is sent by an instructing party, for example, an investment manager or its authorised representative, to the executing party, for example, a transfer agent, to instruct the subscription of one or more financial instruments for one investment fund account.
 * Usage
 * The SubscriptionOrder message is used to instruct single subscription orders, that is, a message containing one order for one financial instrument for one investment account. The SubscriptionOrder message may also be used for multiple orders, that is, a message containing several orders for the same investment account for different financial instruments.
 * For a single subscription order, the SubscriptionOrder message, not the SubscriptionBulkOrder message, must be used.
 * If there are subscription orders for the same financial instrument but for different accounts that are to be communicated in a single message, then the SubscriptionBulkOrder message must be used.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionOrderV04", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "mltplOrdrDtls",
    "cpyDtls",
    "xtnsn"
})
public class SubscriptionOrderV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference9 poolRef;
    @XmlElement(name = "PrvsRef")
    protected List<AdditionalReference8> prvsRef;
    @XmlElement(name = "MltplOrdrDtls", required = true)
    protected SubscriptionMultipleOrder6 mltplOrdrDtls;
    @XmlElement(name = "CpyDtls")
    protected CopyInformation4 cpyDtls;
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
    public SubscriptionOrderV04 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference9 }
     *     
     */
    public AdditionalReference9 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference9 }
     *     
     */
    public SubscriptionOrderV04 setPoolRef(AdditionalReference9 value) {
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
     * {@link AdditionalReference8 }
     * 
     * 
     */
    public List<AdditionalReference8> getPrvsRef() {
        if (prvsRef == null) {
            prvsRef = new ArrayList<AdditionalReference8>();
        }
        return this.prvsRef;
    }

    /**
     * Gets the value of the mltplOrdrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionMultipleOrder6 }
     *     
     */
    public SubscriptionMultipleOrder6 getMltplOrdrDtls() {
        return mltplOrdrDtls;
    }

    /**
     * Sets the value of the mltplOrdrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionMultipleOrder6 }
     *     
     */
    public SubscriptionOrderV04 setMltplOrdrDtls(SubscriptionMultipleOrder6 value) {
        this.mltplOrdrDtls = value;
        return this;
    }

    /**
     * Gets the value of the cpyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CopyInformation4 }
     *     
     */
    public CopyInformation4 getCpyDtls() {
        return cpyDtls;
    }

    /**
     * Sets the value of the cpyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyInformation4 }
     *     
     */
    public SubscriptionOrderV04 setCpyDtls(CopyInformation4 value) {
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
    public SubscriptionOrderV04 addPrvsRef(AdditionalReference8 prvsRef) {
        getPrvsRef().add(prvsRef);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public SubscriptionOrderV04 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
