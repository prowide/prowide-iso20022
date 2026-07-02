
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
 * The GetCurrencyExchangeRate message is sent by a member to the transaction administrator.
 * It is used to request information on static data maintained by the transaction administrator and related to currency exchange details as maintained for the system operations by the transaction administrator.
 * Usage
 * The transaction administrator is in charge of providing the members with business information. The term business information covers all information related to the management of the system, i.e., not related to the transactions created into the system. The type of business information available can vary depending on the system.
 * When a system manages a pool of accounts in various currencies for a member, there is a need to maintain currency exchange details in between the various currencies and the reporting or base currency. The reporting or base currency is used to calculate the actual position of the members in terms of aggregate limits and balances and allow the system to contain risk within the defined and agreed boundaries. The currency exchange details can be fixed for the entire operational day, or regularly updated according to near real time market feeds.
 * At any point in time during operating hours of the system, the member can query the transaction administrator to get information about the static data related to a currency exchange details.
 * The member can request information based on the following elements:
 * - the currency to be converted (source currency)
 * - the currency into which the amount is converted (target currency)
 * This message will be replied to by a ReturnCurrencyExchangeRate message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCurrencyExchangeRateV02", propOrder = {
    "msgId",
    "ccyQryDef"
})
public class GetCurrencyExchangeRateV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "CcyQryDef")
    protected CurrencyQueryDefinition2 ccyQryDef;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification }
     *     
     */
    public MessageIdentification getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification }
     *     
     */
    public GetCurrencyExchangeRateV02 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the ccyQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyQueryDefinition2 }
     *     
     */
    public CurrencyQueryDefinition2 getCcyQryDef() {
        return ccyQryDef;
    }

    /**
     * Sets the value of the ccyQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyQueryDefinition2 }
     *     
     */
    public GetCurrencyExchangeRateV02 setCcyQryDef(CurrencyQueryDefinition2 value) {
        this.ccyQryDef = value;
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
