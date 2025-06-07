
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
 * The AccountSwitchCancelExistingPayment message is sent by the new account servicer to the previous account servicer to identify which payment arrangements are to be cancelled on the account owner's account and when they are to be cancelled. This message is used during a partial switch of the account and may be sent multiple times to allow for the account parties to transfer different payment arrangements at different times during the switch. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSwitchCancelExistingPaymentV05", propOrder = {
    "msgId",
    "acctSwtchDtls",
    "odAcct",
    "pmtInstr",
    "drctDbtInstr",
    "splmtryData"
})
public class AccountSwitchCancelExistingPaymentV05 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "AcctSwtchDtls", required = true)
    protected AccountSwitchDetails1 acctSwtchDtls;
    @XmlElement(name = "OdAcct", required = true)
    protected CashAccount43 odAcct;
    @XmlElement(name = "PmtInstr")
    protected List<PaymentInstruction43> pmtInstr;
    @XmlElement(name = "DrctDbtInstr")
    protected List<DirectDebitInstructionDetails3> drctDbtInstr;
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
    public AccountSwitchCancelExistingPaymentV05 setMsgId(MessageIdentification1 value) {
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
    public AccountSwitchCancelExistingPaymentV05 setAcctSwtchDtls(AccountSwitchDetails1 value) {
        this.acctSwtchDtls = value;
        return this;
    }

    /**
     * Gets the value of the odAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount43 }
     *     
     */
    public CashAccount43 getOdAcct() {
        return odAcct;
    }

    /**
     * Sets the value of the odAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount43 }
     *     
     */
    public AccountSwitchCancelExistingPaymentV05 setOdAcct(CashAccount43 value) {
        this.odAcct = value;
        return this;
    }

    /**
     * Gets the value of the pmtInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtInstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstruction43 }
     * 
     * 
     */
    public List<PaymentInstruction43> getPmtInstr() {
        if (pmtInstr == null) {
            pmtInstr = new ArrayList<PaymentInstruction43>();
        }
        return this.pmtInstr;
    }

    /**
     * Gets the value of the drctDbtInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drctDbtInstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrctDbtInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectDebitInstructionDetails3 }
     * 
     * 
     */
    public List<DirectDebitInstructionDetails3> getDrctDbtInstr() {
        if (drctDbtInstr == null) {
            drctDbtInstr = new ArrayList<DirectDebitInstructionDetails3>();
        }
        return this.drctDbtInstr;
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
     * Adds a new item to the pmtInstr list.
     * @see #getPmtInstr()
     * 
     */
    public AccountSwitchCancelExistingPaymentV05 addPmtInstr(PaymentInstruction43 pmtInstr) {
        getPmtInstr().add(pmtInstr);
        return this;
    }

    /**
     * Adds a new item to the drctDbtInstr list.
     * @see #getDrctDbtInstr()
     * 
     */
    public AccountSwitchCancelExistingPaymentV05 addDrctDbtInstr(DirectDebitInstructionDetails3 drctDbtInstr) {
        getDrctDbtInstr().add(drctDbtInstr);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AccountSwitchCancelExistingPaymentV05 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
