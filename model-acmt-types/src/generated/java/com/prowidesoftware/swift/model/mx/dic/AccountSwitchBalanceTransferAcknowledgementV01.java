
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
 * The AccountSwitchBalanceTransferAcknowledgement message is sent by the previous account servicer to the new account servicer in response to the AccountSwitchRequestBalanceTransfer message. It confirms the status of the old account and the balance of the account on closure. In the case of a negative closing balance, the old account servicer provides details of the nominated account to which payment should be made from the new account servicer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSwitchBalanceTransferAcknowledgementV01", propOrder = {
    "msgId",
    "acctSwtchDtls",
    "odAcct",
    "odAcctBal",
    "balTrf",
    "splmtryData"
})
public class AccountSwitchBalanceTransferAcknowledgementV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "AcctSwtchDtls", required = true)
    protected AccountSwitchDetails1 acctSwtchDtls;
    @XmlElement(name = "OdAcct", required = true)
    protected CashAccount36 odAcct;
    @XmlElement(name = "OdAcctBal", required = true)
    protected AmountAndDirection5 odAcctBal;
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
    public AccountSwitchBalanceTransferAcknowledgementV01 setMsgId(MessageIdentification1 value) {
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
    public AccountSwitchBalanceTransferAcknowledgementV01 setAcctSwtchDtls(AccountSwitchDetails1 value) {
        this.acctSwtchDtls = value;
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
    public AccountSwitchBalanceTransferAcknowledgementV01 setOdAcct(CashAccount36 value) {
        this.odAcct = value;
        return this;
    }

    /**
     * Gets the value of the odAcctBal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getOdAcctBal() {
        return odAcctBal;
    }

    /**
     * Sets the value of the odAcctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AccountSwitchBalanceTransferAcknowledgementV01 setOdAcctBal(AmountAndDirection5 value) {
        this.odAcctBal = value;
        return this;
    }

    /**
     * Gets the value of the balTrf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balTrf property.
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
     * @return
     *     The value of the balTrf property.
     */
    public List<BalanceTransfer1> getBalTrf() {
        if (balTrf == null) {
            balTrf = new ArrayList<>();
        }
        return this.balTrf;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public AccountSwitchBalanceTransferAcknowledgementV01 addBalTrf(BalanceTransfer1 balTrf) {
        getBalTrf().add(balTrf);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AccountSwitchBalanceTransferAcknowledgementV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
