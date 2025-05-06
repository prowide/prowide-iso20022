
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Response to the withdrawal transaction request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction49", propOrder = {
    "txId",
    "rcncltnId",
    "cmpltnReqrd",
    "acctData",
    "prtctdAcctData",
    "ttlAuthrsdAmt",
    "ttlReqdAmt",
    "dtldReqdAmt",
    "ccyConvsElgblty",
    "addtlChrg",
    "lmts",
    "mixTp",
    "mix",
    "authstnRslt",
    "iccRltdData",
    "cmd",
    "acctInf"
})
public class ATMTransaction49 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier3 txId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "CmpltnReqrd")
    protected Boolean cmpltnReqrd;
    @XmlElement(name = "AcctData")
    protected CardAccount22 acctData;
    @XmlElement(name = "PrtctdAcctData")
    protected ContentInformationType10 prtctdAcctData;
    @XmlElement(name = "TtlAuthrsdAmt", required = true)
    protected AmountAndCurrency1 ttlAuthrsdAmt;
    @XmlElement(name = "TtlReqdAmt")
    protected BigDecimal ttlReqdAmt;
    @XmlElement(name = "DtldReqdAmt")
    protected DetailedAmount12 dtldReqdAmt;
    @XmlElement(name = "CcyConvsElgblty")
    protected CurrencyConversion32 ccyConvsElgblty;
    @XmlElement(name = "AddtlChrg")
    protected List<DetailedAmount13> addtlChrg;
    @XmlElement(name = "Lmts")
    protected ATMTransactionAmounts6 lmts;
    @XmlElement(name = "MixTp")
    protected String mixTp;
    @XmlElement(name = "Mix")
    protected List<ATMMediaMix1> mix;
    @XmlElement(name = "AuthstnRslt", required = true)
    protected AuthorisationResult20 authstnRslt;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand7> cmd;
    @XmlElement(name = "AcctInf")
    protected List<CardAccount18> acctInf;

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
    public ATMTransaction49 setTxId(TransactionIdentifier3 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnId() {
        return rcncltnId;
    }

    /**
     * Sets the value of the rcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransaction49 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the cmpltnReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCmpltnReqrd() {
        return cmpltnReqrd;
    }

    /**
     * Sets the value of the cmpltnReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMTransaction49 setCmpltnReqrd(Boolean value) {
        this.cmpltnReqrd = value;
        return this;
    }

    /**
     * Gets the value of the acctData property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount22 }
     *     
     */
    public CardAccount22 getAcctData() {
        return acctData;
    }

    /**
     * Sets the value of the acctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount22 }
     *     
     */
    public ATMTransaction49 setAcctData(CardAccount22 value) {
        this.acctData = value;
        return this;
    }

    /**
     * Gets the value of the prtctdAcctData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdAcctData() {
        return prtctdAcctData;
    }

    /**
     * Sets the value of the prtctdAcctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ATMTransaction49 setPrtctdAcctData(ContentInformationType10 value) {
        this.prtctdAcctData = value;
        return this;
    }

    /**
     * Gets the value of the ttlAuthrsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public AmountAndCurrency1 getTtlAuthrsdAmt() {
        return ttlAuthrsdAmt;
    }

    /**
     * Sets the value of the ttlAuthrsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public ATMTransaction49 setTtlAuthrsdAmt(AmountAndCurrency1 value) {
        this.ttlAuthrsdAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlReqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlReqdAmt() {
        return ttlReqdAmt;
    }

    /**
     * Sets the value of the ttlReqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTransaction49 setTtlReqdAmt(BigDecimal value) {
        this.ttlReqdAmt = value;
        return this;
    }

    /**
     * Gets the value of the dtldReqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount12 }
     *     
     */
    public DetailedAmount12 getDtldReqdAmt() {
        return dtldReqdAmt;
    }

    /**
     * Sets the value of the dtldReqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount12 }
     *     
     */
    public ATMTransaction49 setDtldReqdAmt(DetailedAmount12 value) {
        this.dtldReqdAmt = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvsElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion32 }
     *     
     */
    public CurrencyConversion32 getCcyConvsElgblty() {
        return ccyConvsElgblty;
    }

    /**
     * Sets the value of the ccyConvsElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion32 }
     *     
     */
    public ATMTransaction49 setCcyConvsElgblty(CurrencyConversion32 value) {
        this.ccyConvsElgblty = value;
        return this;
    }

    /**
     * Gets the value of the addtlChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlChrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount13 }
     * 
     * 
     * @return
     *     The value of the addtlChrg property.
     */
    public List<DetailedAmount13> getAddtlChrg() {
        if (addtlChrg == null) {
            addtlChrg = new ArrayList<>();
        }
        return this.addtlChrg;
    }

    /**
     * Gets the value of the lmts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransactionAmounts6 }
     *     
     */
    public ATMTransactionAmounts6 getLmts() {
        return lmts;
    }

    /**
     * Sets the value of the lmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransactionAmounts6 }
     *     
     */
    public ATMTransaction49 setLmts(ATMTransactionAmounts6 value) {
        this.lmts = value;
        return this;
    }

    /**
     * Gets the value of the mixTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMixTp() {
        return mixTp;
    }

    /**
     * Sets the value of the mixTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransaction49 setMixTp(String value) {
        this.mixTp = value;
        return this;
    }

    /**
     * Gets the value of the mix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMMediaMix1 }
     * 
     * 
     * @return
     *     The value of the mix property.
     */
    public List<ATMMediaMix1> getMix() {
        if (mix == null) {
            mix = new ArrayList<>();
        }
        return this.mix;
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
    public ATMTransaction49 setAuthstnRslt(AuthorisationResult20 value) {
        this.authstnRslt = value;
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
    public ATMTransaction49 setICCRltdData(byte[] value) {
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
     * Adds a new item to the addtlChrg list.
     * @see #getAddtlChrg()
     * 
     */
    public ATMTransaction49 addAddtlChrg(DetailedAmount13 addtlChrg) {
        getAddtlChrg().add(addtlChrg);
        return this;
    }

    /**
     * Adds a new item to the mix list.
     * @see #getMix()
     * 
     */
    public ATMTransaction49 addMix(ATMMediaMix1 mix) {
        getMix().add(mix);
        return this;
    }

    /**
     * Adds a new item to the cmd list.
     * @see #getCmd()
     * 
     */
    public ATMTransaction49 addCmd(ATMCommand7 cmd) {
        getCmd().add(cmd);
        return this;
    }

    /**
     * Adds a new item to the acctInf list.
     * @see #getAcctInf()
     * 
     */
    public ATMTransaction49 addAcctInf(CardAccount18 acctInf) {
        getAcctInf().add(acctInf);
        return this;
    }

}
