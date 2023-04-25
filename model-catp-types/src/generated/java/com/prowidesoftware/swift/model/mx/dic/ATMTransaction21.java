
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
@XmlType(name = "ATMTransaction21", propOrder = {
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
public class ATMTransaction21 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType7 txRspn;
    @XmlElement(name = "Actn")
    protected List<Action7> actn;
    @XmlElement(name = "CstmrSvcPrfl")
    protected ATMCustomerProfile5 cstmrSvcPrfl;
    @XmlElement(name = "CcyConvs")
    protected CurrencyConversion10 ccyConvs;
    @XmlElement(name = "AcctInf")
    protected List<CardAccount12> acctInf;
    @XmlElement(name = "AcctStmtData")
    protected List<ATMAccountStatement1> acctStmtData;
    @XmlElement(name = "CcyXchg")
    protected CurrencyConversion5 ccyXchg;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand7> cmd;

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
    public ATMTransaction21 setTxId(TransactionIdentifier1 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType7 }
     *     
     */
    public ResponseType7 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType7 }
     *     
     */
    public ATMTransaction21 setTxRspn(ResponseType7 value) {
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
     * {@link Action7 }
     * 
     * 
     * @return
     *     The value of the actn property.
     */
    public List<Action7> getActn() {
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
     *     {@link ATMCustomerProfile5 }
     *     
     */
    public ATMCustomerProfile5 getCstmrSvcPrfl() {
        return cstmrSvcPrfl;
    }

    /**
     * Sets the value of the cstmrSvcPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCustomerProfile5 }
     *     
     */
    public ATMTransaction21 setCstmrSvcPrfl(ATMCustomerProfile5 value) {
        this.cstmrSvcPrfl = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion10 }
     *     
     */
    public CurrencyConversion10 getCcyConvs() {
        return ccyConvs;
    }

    /**
     * Sets the value of the ccyConvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion10 }
     *     
     */
    public ATMTransaction21 setCcyConvs(CurrencyConversion10 value) {
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
     * {@link CardAccount12 }
     * 
     * 
     * @return
     *     The value of the acctInf property.
     */
    public List<CardAccount12> getAcctInf() {
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
    public ATMTransaction21 setCcyXchg(CurrencyConversion5 value) {
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
    public ATMTransaction21 setICCRltdData(byte[] value) {
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
     * {@link ATMCommand7 }
     * 
     * 
     * @return
     *     The value of the cmd property.
     */
    public List<ATMCommand7> getCmd() {
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
    public ATMTransaction21 addActn(Action7 actn) {
        getActn().add(actn);
        return this;
    }

    /**
     * Adds a new item to the acctInf list.
     * @see #getAcctInf()
     * 
     */
    public ATMTransaction21 addAcctInf(CardAccount12 acctInf) {
        getAcctInf().add(acctInf);
        return this;
    }

    /**
     * Adds a new item to the acctStmtData list.
     * @see #getAcctStmtData()
     * 
     */
    public ATMTransaction21 addAcctStmtData(ATMAccountStatement1 acctStmtData) {
        getAcctStmtData().add(acctStmtData);
        return this;
    }

    /**
     * Adds a new item to the cmd list.
     * @see #getCmd()
     * 
     */
    public ATMTransaction21 addCmd(ATMCommand7 cmd) {
        getCmd().add(cmd);
        return this;
    }

}
