
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
 * The GetAccount message is sent by a member to the transaction administrator.
 * It is used to request information on the details of one or more accounts held at the transaction administrator, including information on the balances.
 * Usage
 * At any time during the operating hours of the system, the member can query the transaction administrator to get information about the account(s) that the transaction administrator maintains for the member.
 * For example, this may be necessary in order to perform the appropriate liquidity management and the funds transfers between accounts.
 * The member can request information about accounts through a series of criteria, corresponding to the known information stored at the transaction administrator.
 * The query can concern one or more specific accounts, accounts of a particular identification, or a particular type. The purpose of the query may be to obtain one or more types of balance.
 * The member can request information based on the following elements:
 * - account identification
 * - account type (this element can be used to refine the query when the account identification represents, for example, a group of accounts)
 * - balance type (if not present, all balances are requested)
 * - type of counterparty: bilateral or multilateral (note that, by default, a balance is multilateral unless a particular counterparty is specified)
 * - identification of the counterparty when a bilateral balance is requested
 * - balance value date (if not present in the GetAccount message, the ReturnAccount message will contain the latest available balance)
 * This message will be answered by a ReturnAccount message.
 * Additional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountV08", propOrder = {
    "msgHdr",
    "acctQryDef",
    "splmtryData"
})
public class GetAccountV08 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader9 msgHdr;
    @XmlElement(name = "AcctQryDef")
    protected AccountQuery4 acctQryDef;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader9 }
     *     
     */
    public MessageHeader9 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader9 }
     *     
     */
    public GetAccountV08 setMsgHdr(MessageHeader9 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the acctQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link AccountQuery4 }
     *     
     */
    public AccountQuery4 getAcctQryDef() {
        return acctQryDef;
    }

    /**
     * Sets the value of the acctQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountQuery4 }
     *     
     */
    public GetAccountV08 setAcctQryDef(AccountQuery4 value) {
        this.acctQryDef = value;
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
    public GetAccountV08 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
