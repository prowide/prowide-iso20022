
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
 * The AccountSwitchInformationResponse message is sent by the account servicer that previously held the account to the new account servicer to signal whether the account owner's account can be switched and to pass details of payment arrangements to be transferred to the new account servicer if the account may be switched. Confirmation of the balance transfer window is permitted by the old account servicer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSwitchInformationResponseV04", propOrder = {
    "msgId",
    "acctSwtchDtls",
    "newAcct",
    "odAcct",
    "pmtInstr",
    "drctDbtInstr",
    "splmtryData"
})
public class AccountSwitchInformationResponseV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "AcctSwtchDtls", required = true)
    protected AccountSwitchDetails1 acctSwtchDtls;
    @XmlElement(name = "NewAcct", required = true)
    protected CashAccount41 newAcct;
    @XmlElement(name = "OdAcct", required = true)
    protected CashAccount41 odAcct;
    @XmlElement(name = "PmtInstr")
    protected List<PaymentInstruction38> pmtInstr;
    @XmlElement(name = "DrctDbtInstr")
    protected List<DirectDebitInstructionDetails2> drctDbtInstr;
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
    public AccountSwitchInformationResponseV04 setMsgId(MessageIdentification1 value) {
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
    public AccountSwitchInformationResponseV04 setAcctSwtchDtls(AccountSwitchDetails1 value) {
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
    public AccountSwitchInformationResponseV04 setNewAcct(CashAccount41 value) {
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
    public AccountSwitchInformationResponseV04 setOdAcct(CashAccount41 value) {
        this.odAcct = value;
        return this;
    }

    /**
     * Gets the value of the pmtInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtInstr property.
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
     * {@link PaymentInstruction38 }
     * 
     * 
     * @return
     *     The value of the pmtInstr property.
     */
    public List<PaymentInstruction38> getPmtInstr() {
        if (pmtInstr == null) {
            pmtInstr = new ArrayList<>();
        }
        return this.pmtInstr;
    }

    /**
     * Gets the value of the drctDbtInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the drctDbtInstr property.
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
     * {@link DirectDebitInstructionDetails2 }
     * 
     * 
     * @return
     *     The value of the drctDbtInstr property.
     */
    public List<DirectDebitInstructionDetails2> getDrctDbtInstr() {
        if (drctDbtInstr == null) {
            drctDbtInstr = new ArrayList<>();
        }
        return this.drctDbtInstr;
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
     * Adds a new item to the pmtInstr list.
     * @see #getPmtInstr()
     * 
     */
    public AccountSwitchInformationResponseV04 addPmtInstr(PaymentInstruction38 pmtInstr) {
        getPmtInstr().add(pmtInstr);
        return this;
    }

    /**
     * Adds a new item to the drctDbtInstr list.
     * @see #getDrctDbtInstr()
     * 
     */
    public AccountSwitchInformationResponseV04 addDrctDbtInstr(DirectDebitInstructionDetails2 drctDbtInstr) {
        getDrctDbtInstr().add(drctDbtInstr);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AccountSwitchInformationResponseV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
