
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
@XmlType(name = "ATMTransaction48", propOrder = {
    "txId",
    "txRspn",
    "actn",
    "cstmrSvcPrfl",
    "ccyConvs",
    "acctInf",
    "acctStmtData",
    "ccyXchg",
    "iccRltdData",
    "cmd",
    "authstnRslt"
})
public class ATMTransaction48 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier3 txId;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType12 txRspn;
    @XmlElement(name = "Actn")
    protected List<Action7> actn;
    @XmlElement(name = "CstmrSvcPrfl")
    protected ATMCustomerProfile7 cstmrSvcPrfl;
    @XmlElement(name = "CcyConvs")
    protected CurrencyConversion33 ccyConvs;
    @XmlElement(name = "AcctInf")
    protected List<CardAccount18> acctInf;
    @XmlElement(name = "AcctStmtData")
    protected List<ATMAccountStatement3> acctStmtData;
    @XmlElement(name = "CcyXchg")
    protected CurrencyConversion5 ccyXchg;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand7> cmd;
    @XmlElement(name = "AuthstnRslt")
    protected AuthorisationResult20 authstnRslt;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier3 }
     *     
     */
    public TransactionIdentifier3 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier3 }
     *     
     */
    public ATMTransaction48 setTxId(TransactionIdentifier3 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType12 }
     *     
     */
    public ResponseType12 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType12 }
     *     
     */
    public ATMTransaction48 setTxRspn(ResponseType12 value) {
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
     *     {@link ATMCustomerProfile7 }
     *     
     */
    public ATMCustomerProfile7 getCstmrSvcPrfl() {
        return cstmrSvcPrfl;
    }

    /**
     * Sets the value of the cstmrSvcPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCustomerProfile7 }
     *     
     */
    public ATMTransaction48 setCstmrSvcPrfl(ATMCustomerProfile7 value) {
        this.cstmrSvcPrfl = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion33 }
     *     
     */
    public CurrencyConversion33 getCcyConvs() {
        return ccyConvs;
    }

    /**
     * Sets the value of the ccyConvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion33 }
     *     
     */
    public ATMTransaction48 setCcyConvs(CurrencyConversion33 value) {
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
     * {@link CardAccount18 }
     * 
     * 
     * @return
     *     The value of the acctInf property.
     */
    public List<CardAccount18> getAcctInf() {
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
     * {@link ATMAccountStatement3 }
     * 
     * 
     * @return
     *     The value of the acctStmtData property.
     */
    public List<ATMAccountStatement3> getAcctStmtData() {
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
    public ATMTransaction48 setCcyXchg(CurrencyConversion5 value) {
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
    public ATMTransaction48 setICCRltdData(byte[] value) {
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

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult20 }
     *     
     */
    public AuthorisationResult20 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult20 }
     *     
     */
    public ATMTransaction48 setAuthstnRslt(AuthorisationResult20 value) {
        this.authstnRslt = value;
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

    /**
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public ATMTransaction48 addActn(Action7 actn) {
        getActn().add(actn);
        return this;
    }

    /**
     * Adds a new item to the acctInf list.
     * @see #getAcctInf()
     * 
     */
    public ATMTransaction48 addAcctInf(CardAccount18 acctInf) {
        getAcctInf().add(acctInf);
        return this;
    }

    /**
     * Adds a new item to the acctStmtData list.
     * @see #getAcctStmtData()
     * 
     */
    public ATMTransaction48 addAcctStmtData(ATMAccountStatement3 acctStmtData) {
        getAcctStmtData().add(acctStmtData);
        return this;
    }

    /**
     * Adds a new item to the cmd list.
     * @see #getCmd()
     * 
     */
    public ATMTransaction48 addCmd(ATMCommand7 cmd) {
        getCmd().add(cmd);
        return this;
    }

}
