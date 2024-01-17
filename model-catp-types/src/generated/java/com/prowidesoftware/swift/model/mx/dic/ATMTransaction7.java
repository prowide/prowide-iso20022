
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
 * Inquiry information for the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction7", propOrder = {
    "txId",
    "txRspn",
    "actn",
    "cstmrSvcPrfl",
    "ccyConvs",
    "acctInf",
    "acctStmtData",
    "ccyXchg",
    "iccRltdData",
    "cmd"
})
public class ATMTransaction7 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType3 txRspn;
    @XmlElement(name = "Actn")
    protected List<Action5> actn;
    @XmlElement(name = "CstmrSvcPrfl")
    protected ATMCustomerProfile3 cstmrSvcPrfl;
    @XmlElement(name = "CcyConvs")
    protected CurrencyConversion3 ccyConvs;
    @XmlElement(name = "AcctInf")
    protected List<CardAccount6> acctInf;
    @XmlElement(name = "AcctStmtData")
    protected List<ATMAccountStatement1> acctStmtData;
    @XmlElement(name = "CcyXchg")
    protected CurrencyConversion5 ccyXchg;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand1> cmd;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public ATMTransaction7 setTxId(TransactionIdentifier1 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType3 }
     *     
     */
    public ResponseType3 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType3 }
     *     
     */
    public ATMTransaction7 setTxRspn(ResponseType3 value) {
        this.txRspn = value;
        return this;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action5 }
     * 
     * 
     * @return
     *     The value of the actn property.
     */
    public List<Action5> getActn() {
        if (actn == null) {
            actn = new ArrayList<>();
        }
        return this.actn;
    }

    /**
     * Gets the value of the cstmrSvcPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCustomerProfile3 }
     *     
     */
    public ATMCustomerProfile3 getCstmrSvcPrfl() {
        return cstmrSvcPrfl;
    }

    /**
     * Sets the value of the cstmrSvcPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCustomerProfile3 }
     *     
     */
    public ATMTransaction7 setCstmrSvcPrfl(ATMCustomerProfile3 value) {
        this.cstmrSvcPrfl = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion3 }
     *     
     */
    public CurrencyConversion3 getCcyConvs() {
        return ccyConvs;
    }

    /**
     * Sets the value of the ccyConvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion3 }
     *     
     */
    public ATMTransaction7 setCcyConvs(CurrencyConversion3 value) {
        this.ccyConvs = value;
        return this;
    }

    /**
     * Gets the value of the acctInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardAccount6 }
     * 
     * 
     * @return
     *     The value of the acctInf property.
     */
    public List<CardAccount6> getAcctInf() {
        if (acctInf == null) {
            acctInf = new ArrayList<>();
        }
        return this.acctInf;
    }

    /**
     * Gets the value of the acctStmtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctStmtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctStmtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMAccountStatement1 }
     * 
     * 
     * @return
     *     The value of the acctStmtData property.
     */
    public List<ATMAccountStatement1> getAcctStmtData() {
        if (acctStmtData == null) {
            acctStmtData = new ArrayList<>();
        }
        return this.acctStmtData;
    }

    /**
     * Gets the value of the ccyXchg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion5 }
     *     
     */
    public CurrencyConversion5 getCcyXchg() {
        return ccyXchg;
    }

    /**
     * Sets the value of the ccyXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion5 }
     *     
     */
    public ATMTransaction7 setCcyXchg(CurrencyConversion5 value) {
        this.ccyXchg = value;
        return this;
    }

    /**
     * Gets the value of the iccRltdData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public ATMTransaction7 setICCRltdData(byte[] value) {
        this.iccRltdData = value;
        return this;
    }

    /**
     * Gets the value of the cmd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommand1 }
     * 
     * 
     * @return
     *     The value of the cmd property.
     */
    public List<ATMCommand1> getCmd() {
        if (cmd == null) {
            cmd = new ArrayList<>();
        }
        return this.cmd;
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
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public ATMTransaction7 addActn(Action5 actn) {
        getActn().add(actn);
        return this;
    }

    /**
     * Adds a new item to the acctInf list.
     * @see #getAcctInf()
     * 
     */
    public ATMTransaction7 addAcctInf(CardAccount6 acctInf) {
        getAcctInf().add(acctInf);
        return this;
    }

    /**
     * Adds a new item to the acctStmtData list.
     * @see #getAcctStmtData()
     * 
     */
    public ATMTransaction7 addAcctStmtData(ATMAccountStatement1 acctStmtData) {
        getAcctStmtData().add(acctStmtData);
        return this;
    }

    /**
     * Adds a new item to the cmd list.
     * @see #getCmd()
     * 
     */
    public ATMTransaction7 addCmd(ATMCommand1 cmd) {
        getCmd().add(cmd);
        return this;
    }

}
