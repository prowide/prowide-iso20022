
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Withdrawal transaction for which the completion is sent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction53", propOrder = {
    "txId",
    "txSts",
    "multiBndl",
    "bndlPresntdAmt",
    "presntdAmtSts",
    "incdnt",
    "incdntDtl",
    "rcncltnId",
    "acctData",
    "prtctdAcctData",
    "ttlPresntdAmt",
    "ttlAuthrsdAmt",
    "ttlReqdAmt",
    "dtldReqdAmt",
    "ccyConvsRslt",
    "addtlChrg",
    "reqdRct",
    "rctPrtd",
    "cstmrCnsnt",
    "lmts",
    "authstnRslt",
    "iccRltdData",
    "atmTtls",
    "csstt"
})
public class ATMTransaction53 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier3 txId;
    @XmlElement(name = "TxSts", required = true)
    @XmlSchemaType(name = "string")
    protected ATMTransactionStatus1Code txSts;
    @XmlElement(name = "MultiBndl")
    protected Boolean multiBndl;
    @XmlElement(name = "BndlPresntdAmt")
    protected List<BigDecimal> bndlPresntdAmt;
    @XmlElement(name = "PresntdAmtSts", required = true)
    @XmlSchemaType(name = "string")
    protected ATMTransactionStatus2Code presntdAmtSts;
    @XmlElement(name = "Incdnt")
    @XmlSchemaType(name = "string")
    protected List<FailureReason9Code> incdnt;
    @XmlElement(name = "IncdntDtl")
    protected List<String> incdntDtl;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "AcctData")
    protected CardAccount17 acctData;
    @XmlElement(name = "PrtctdAcctData")
    protected ContentInformationType10 prtctdAcctData;
    @XmlElement(name = "TtlPresntdAmt", required = true)
    protected AmountAndCurrency1 ttlPresntdAmt;
    @XmlElement(name = "TtlAuthrsdAmt")
    protected BigDecimal ttlAuthrsdAmt;
    @XmlElement(name = "TtlReqdAmt")
    protected BigDecimal ttlReqdAmt;
    @XmlElement(name = "DtldReqdAmt")
    protected DetailedAmount12 dtldReqdAmt;
    @XmlElement(name = "CcyConvsRslt")
    protected CurrencyConversion32 ccyConvsRslt;
    @XmlElement(name = "AddtlChrg")
    protected List<DetailedAmount13> addtlChrg;
    @XmlElement(name = "ReqdRct")
    protected Boolean reqdRct;
    @XmlElement(name = "RctPrtd")
    protected Boolean rctPrtd;
    @XmlElement(name = "CstmrCnsnt")
    protected Boolean cstmrCnsnt;
    @XmlElement(name = "Lmts")
    protected ATMTransactionAmounts6 lmts;
    @XmlElement(name = "AuthstnRslt")
    protected AuthorisationResult20 authstnRslt;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;
    @XmlElement(name = "ATMTtls")
    protected List<ATMTotals4> atmTtls;
    @XmlElement(name = "Csstt")
    protected List<ATMCassette3> csstt;

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
    public ATMTransaction53 setTxId(TransactionIdentifier3 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransactionStatus1Code }
     *     
     */
    public ATMTransactionStatus1Code getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransactionStatus1Code }
     *     
     */
    public ATMTransaction53 setTxSts(ATMTransactionStatus1Code value) {
        this.txSts = value;
        return this;
    }

    /**
     * Gets the value of the multiBndl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiBndl() {
        return multiBndl;
    }

    /**
     * Sets the value of the multiBndl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMTransaction53 setMultiBndl(Boolean value) {
        this.multiBndl = value;
        return this;
    }

    /**
     * Gets the value of the bndlPresntdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bndlPresntdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBndlPresntdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getBndlPresntdAmt() {
        if (bndlPresntdAmt == null) {
            bndlPresntdAmt = new ArrayList<BigDecimal>();
        }
        return this.bndlPresntdAmt;
    }

    /**
     * Gets the value of the presntdAmtSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransactionStatus2Code }
     *     
     */
    public ATMTransactionStatus2Code getPresntdAmtSts() {
        return presntdAmtSts;
    }

    /**
     * Sets the value of the presntdAmtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransactionStatus2Code }
     *     
     */
    public ATMTransaction53 setPresntdAmtSts(ATMTransactionStatus2Code value) {
        this.presntdAmtSts = value;
        return this;
    }

    /**
     * Gets the value of the incdnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incdnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncdnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailureReason9Code }
     * 
     * 
     */
    public List<FailureReason9Code> getIncdnt() {
        if (incdnt == null) {
            incdnt = new ArrayList<FailureReason9Code>();
        }
        return this.incdnt;
    }

    /**
     * Gets the value of the incdntDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incdntDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncdntDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncdntDtl() {
        if (incdntDtl == null) {
            incdntDtl = new ArrayList<String>();
        }
        return this.incdntDtl;
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
    public ATMTransaction53 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the acctData property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount17 }
     *     
     */
    public CardAccount17 getAcctData() {
        return acctData;
    }

    /**
     * Sets the value of the acctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount17 }
     *     
     */
    public ATMTransaction53 setAcctData(CardAccount17 value) {
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
    public ATMTransaction53 setPrtctdAcctData(ContentInformationType10 value) {
        this.prtctdAcctData = value;
        return this;
    }

    /**
     * Gets the value of the ttlPresntdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public AmountAndCurrency1 getTtlPresntdAmt() {
        return ttlPresntdAmt;
    }

    /**
     * Sets the value of the ttlPresntdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public ATMTransaction53 setTtlPresntdAmt(AmountAndCurrency1 value) {
        this.ttlPresntdAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlAuthrsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAuthrsdAmt() {
        return ttlAuthrsdAmt;
    }

    /**
     * Sets the value of the ttlAuthrsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTransaction53 setTtlAuthrsdAmt(BigDecimal value) {
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
    public ATMTransaction53 setTtlReqdAmt(BigDecimal value) {
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
    public ATMTransaction53 setDtldReqdAmt(DetailedAmount12 value) {
        this.dtldReqdAmt = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvsRslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion32 }
     *     
     */
    public CurrencyConversion32 getCcyConvsRslt() {
        return ccyConvsRslt;
    }

    /**
     * Sets the value of the ccyConvsRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion32 }
     *     
     */
    public ATMTransaction53 setCcyConvsRslt(CurrencyConversion32 value) {
        this.ccyConvsRslt = value;
        return this;
    }

    /**
     * Gets the value of the addtlChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlChrg property.
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
     */
    public List<DetailedAmount13> getAddtlChrg() {
        if (addtlChrg == null) {
            addtlChrg = new ArrayList<DetailedAmount13>();
        }
        return this.addtlChrg;
    }

    /**
     * Gets the value of the reqdRct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqdRct() {
        return reqdRct;
    }

    /**
     * Sets the value of the reqdRct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMTransaction53 setReqdRct(Boolean value) {
        this.reqdRct = value;
        return this;
    }

    /**
     * Gets the value of the rctPrtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRctPrtd() {
        return rctPrtd;
    }

    /**
     * Sets the value of the rctPrtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMTransaction53 setRctPrtd(Boolean value) {
        this.rctPrtd = value;
        return this;
    }

    /**
     * Gets the value of the cstmrCnsnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCstmrCnsnt() {
        return cstmrCnsnt;
    }

    /**
     * Sets the value of the cstmrCnsnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMTransaction53 setCstmrCnsnt(Boolean value) {
        this.cstmrCnsnt = value;
        return this;
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
    public ATMTransaction53 setLmts(ATMTransactionAmounts6 value) {
        this.lmts = value;
        return this;
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
    public ATMTransaction53 setAuthstnRslt(AuthorisationResult20 value) {
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
    public ATMTransaction53 setICCRltdData(byte[] value) {
        this.iccRltdData = value;
        return this;
    }

    /**
     * Gets the value of the atmTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atmTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATMTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMTotals4 }
     * 
     * 
     */
    public List<ATMTotals4> getATMTtls() {
        if (atmTtls == null) {
            atmTtls = new ArrayList<ATMTotals4>();
        }
        return this.atmTtls;
    }

    /**
     * Gets the value of the csstt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the csstt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCsstt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCassette3 }
     * 
     * 
     */
    public List<ATMCassette3> getCsstt() {
        if (csstt == null) {
            csstt = new ArrayList<ATMCassette3>();
        }
        return this.csstt;
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
     * Adds a new item to the bndlPresntdAmt list.
     * @see #getBndlPresntdAmt()
     * 
     */
    public ATMTransaction53 addBndlPresntdAmt(BigDecimal bndlPresntdAmt) {
        getBndlPresntdAmt().add(bndlPresntdAmt);
        return this;
    }

    /**
     * Adds a new item to the incdnt list.
     * @see #getIncdnt()
     * 
     */
    public ATMTransaction53 addIncdnt(FailureReason9Code incdnt) {
        getIncdnt().add(incdnt);
        return this;
    }

    /**
     * Adds a new item to the incdntDtl list.
     * @see #getIncdntDtl()
     * 
     */
    public ATMTransaction53 addIncdntDtl(String incdntDtl) {
        getIncdntDtl().add(incdntDtl);
        return this;
    }

    /**
     * Adds a new item to the addtlChrg list.
     * @see #getAddtlChrg()
     * 
     */
    public ATMTransaction53 addAddtlChrg(DetailedAmount13 addtlChrg) {
        getAddtlChrg().add(addtlChrg);
        return this;
    }

    /**
     * Adds a new item to the aTMTtls list.
     * @see #getATMTtls()
     * 
     */
    public ATMTransaction53 addATMTtls(ATMTotals4 aTMTtls) {
        getATMTtls().add(aTMTtls);
        return this;
    }

    /**
     * Adds a new item to the csstt list.
     * @see #getCsstt()
     * 
     */
    public ATMTransaction53 addCsstt(ATMCassette3 csstt) {
        getCsstt().add(csstt);
        return this;
    }

}
