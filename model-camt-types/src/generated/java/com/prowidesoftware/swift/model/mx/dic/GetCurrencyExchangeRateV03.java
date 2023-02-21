
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
@XmlType(name = "GetCurrencyExchangeRateV03", propOrder = {
    "msgHdr",
    "ccyQryDef",
    "splmtryData"
})
public class GetCurrencyExchangeRateV03 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "CcyQryDef")
    protected CurrencyQueryDefinition3 ccyQryDef;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader1 }
     *     
     */
    public MessageHeader1 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader1 }
     *     
     */
    public GetCurrencyExchangeRateV03 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the ccyQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyQueryDefinition3 }
     *     
     */
    public CurrencyQueryDefinition3 getCcyQryDef() {
        return ccyQryDef;
    }

    /**
     * Sets the value of the ccyQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyQueryDefinition3 }
     *     
     */
    public GetCurrencyExchangeRateV03 setCcyQryDef(CurrencyQueryDefinition3 value) {
        this.ccyQryDef = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public GetCurrencyExchangeRateV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
