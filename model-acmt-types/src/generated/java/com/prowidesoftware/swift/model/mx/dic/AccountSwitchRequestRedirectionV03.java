
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
 * The AccountSwitchRequestRedirection message is sent by the new account servicer to a central account switch servicer to set up the redirection of payment and collection transactions that are processed after completion of the account switch.  It is routed to the previous account servicer to signal that it should schedule the cancellation of all payment arrangements on the old account. This message may also be used by the new bank to amend the new account details, if the details previously provided were incorrect.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSwitchRequestRedirectionV03", propOrder = {
    "msgId",
    "acctSwtchDtls",
    "newAcct",
    "odAcct",
    "splmtryData"
})
public class AccountSwitchRequestRedirectionV03 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "AcctSwtchDtls", required = true)
    protected AccountSwitchDetails1 acctSwtchDtls;
    @XmlElement(name = "NewAcct", required = true)
    protected CashAccount41 newAcct;
    @XmlElement(name = "OdAcct", required = true)
    protected CashAccount41 odAcct;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
    public AccountSwitchRequestRedirectionV03 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the acctSwtchDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSwitchDetails1 }
     *     
     */
    public AccountSwitchDetails1 getAcctSwtchDtls() {
        return acctSwtchDtls;
    }

    /**
     * Sets the value of the acctSwtchDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSwitchDetails1 }
     *     
     */
    public AccountSwitchRequestRedirectionV03 setAcctSwtchDtls(AccountSwitchDetails1 value) {
        this.acctSwtchDtls = value;
        return this;
    }

    /**
     * Gets the value of the newAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount41 }
     *     
     */
    public CashAccount41 getNewAcct() {
        return newAcct;
    }

    /**
     * Sets the value of the newAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount41 }
     *     
     */
    public AccountSwitchRequestRedirectionV03 setNewAcct(CashAccount41 value) {
        this.newAcct = value;
        return this;
    }

    /**
     * Gets the value of the odAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount41 }
     *     
     */
    public CashAccount41 getOdAcct() {
        return odAcct;
    }

    /**
     * Sets the value of the odAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount41 }
     *     
     */
    public AccountSwitchRequestRedirectionV03 setOdAcct(CashAccount41 value) {
        this.odAcct = value;
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
    public AccountSwitchRequestRedirectionV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
