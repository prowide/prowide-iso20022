
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
 * The AccountSwitchInformationRequest message is sent by the new account servicer to the account servicer which previously held the account to initiate the account switch process. It provides information sufficient for the old account servicer to identify the old account and validate the account parties. The new account servicer is able to inform the old bank of the maximum funding the new account will provide to settle a negative closing balance and the proposed balance transfer window.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSwitchInformationRequestV01", propOrder = {
    "msgId",
    "acctSwtchDtls",
    "newAcct",
    "odAcct",
    "balTrf",
    "splmtryData"
})
public class AccountSwitchInformationRequestV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "AcctSwtchDtls", required = true)
    protected AccountSwitchDetails1 acctSwtchDtls;
    @XmlElement(name = "NewAcct", required = true)
    protected NewAccount1 newAcct;
    @XmlElement(name = "OdAcct", required = true)
    protected CashAccount36 odAcct;
    @XmlElement(name = "BalTrf")
    protected List<BalanceTransfer1> balTrf;
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
    public AccountSwitchInformationRequestV01 setMsgId(MessageIdentification1 value) {
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
    public AccountSwitchInformationRequestV01 setAcctSwtchDtls(AccountSwitchDetails1 value) {
        this.acctSwtchDtls = value;
        return this;
    }

    /**
     * Gets the value of the newAcct property.
     * 
     * @return
     *     possible object is
     *     {@link NewAccount1 }
     *     
     */
    public NewAccount1 getNewAcct() {
        return newAcct;
    }

    /**
     * Sets the value of the newAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewAccount1 }
     *     
     */
    public AccountSwitchInformationRequestV01 setNewAcct(NewAccount1 value) {
        this.newAcct = value;
        return this;
    }

    /**
     * Gets the value of the odAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount36 }
     *     
     */
    public CashAccount36 getOdAcct() {
        return odAcct;
    }

    /**
     * Sets the value of the odAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount36 }
     *     
     */
    public AccountSwitchInformationRequestV01 setOdAcct(CashAccount36 value) {
        this.odAcct = value;
        return this;
    }

    /**
     * Gets the value of the balTrf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balTrf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalTrf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceTransfer1 }
     * 
     * 
     */
    public List<BalanceTransfer1> getBalTrf() {
        if (balTrf == null) {
            balTrf = new ArrayList<BalanceTransfer1>();
        }
        return this.balTrf;
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
     * Adds a new item to the balTrf list.
     * @see #getBalTrf()
     * 
     */
    public AccountSwitchInformationRequestV01 addBalTrf(BalanceTransfer1 balTrf) {
        getBalTrf().add(balTrf);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AccountSwitchInformationRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
