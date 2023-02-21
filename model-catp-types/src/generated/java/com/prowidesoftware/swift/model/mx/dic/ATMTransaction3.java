
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "ATMTransaction3", propOrder = {
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
    "ccyConvs",
    "addtlChrg",
    "reqdRct",
    "rctPrtd",
    "captrdCard",
    "lmts",
    "authstnRslt",
    "iccRltdData",
    "atmTtls",
    "csstt"
})
public class ATMTransaction3 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
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
    protected List<FailureReason4Code> incdnt;
    @XmlElement(name = "IncdntDtl")
    protected List<String> incdntDtl;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "AcctData")
    protected CardAccount5 acctData;
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
    @XmlElement(name = "CcyConvs")
    protected CurrencyConversion4 ccyConvs;
    @XmlElement(name = "AddtlChrg")
    protected List<DetailedAmount13> addtlChrg;
    @XmlElement(name = "ReqdRct")
    protected Boolean reqdRct;
    @XmlElement(name = "RctPrtd")
    protected Boolean rctPrtd;
    @XmlElement(name = "CaptrdCard")
    protected Boolean captrdCard;
    @XmlElement(name = "Lmts")
    protected ATMTransactionAmounts2 lmts;
    @XmlElement(name = "AuthstnRslt")
    protected AuthorisationResult9 authstnRslt;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;
    @XmlElement(name = "ATMTtls")
    protected List<ATMTotals1> atmTtls;
    @XmlElement(name = "Csstt")
    protected List<ATMCassette1> csstt;

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
    public ATMTransaction3 setTxId(TransactionIdentifier1 value) {
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
    public ATMTransaction3 setTxSts(ATMTransactionStatus1Code value) {
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
    public ATMTransaction3 setMultiBndl(Boolean value) {
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
    public ATMTransaction3 setPresntdAmtSts(ATMTransactionStatus2Code value) {
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
     * {@link FailureReason4Code }
     * 
     * 
     */
    public List<FailureReason4Code> getIncdnt() {
        if (incdnt == null) {
            incdnt = new ArrayList<FailureReason4Code>();
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
    public ATMTransaction3 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the acctData property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount5 }
     *     
     */
    public CardAccount5 getAcctData() {
        return acctData;
    }

    /**
     * Sets the value of the acctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount5 }
     *     
     */
    public ATMTransaction3 setAcctData(CardAccount5 value) {
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
    public ATMTransaction3 setPrtctdAcctData(ContentInformationType10 value) {
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
    public ATMTransaction3 setTtlPresntdAmt(AmountAndCurrency1 value) {
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
    public ATMTransaction3 setTtlAuthrsdAmt(BigDecimal value) {
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
    public ATMTransaction3 setTtlReqdAmt(BigDecimal value) {
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
    public ATMTransaction3 setDtldReqdAmt(DetailedAmount12 value) {
        this.dtldReqdAmt = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion4 }
     *     
     */
    public CurrencyConversion4 getCcyConvs() {
        return ccyConvs;
    }

    /**
     * Sets the value of the ccyConvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion4 }
     *     
     */
    public ATMTransaction3 setCcyConvs(CurrencyConversion4 value) {
        this.ccyConvs = value;
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
    public ATMTransaction3 setReqdRct(Boolean value) {
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
    public ATMTransaction3 setRctPrtd(Boolean value) {
        this.rctPrtd = value;
        return this;
    }

    /**
     * Gets the value of the captrdCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaptrdCard() {
        return captrdCard;
    }

    /**
     * Sets the value of the captrdCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMTransaction3 setCaptrdCard(Boolean value) {
        this.captrdCard = value;
        return this;
    }

    /**
     * Gets the value of the lmts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransactionAmounts2 }
     *     
     */
    public ATMTransactionAmounts2 getLmts() {
        return lmts;
    }

    /**
     * Sets the value of the lmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransactionAmounts2 }
     *     
     */
    public ATMTransaction3 setLmts(ATMTransactionAmounts2 value) {
        this.lmts = value;
        return this;
    }

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult9 }
     *     
     */
    public AuthorisationResult9 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult9 }
     *     
     */
    public ATMTransaction3 setAuthstnRslt(AuthorisationResult9 value) {
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
    public ATMTransaction3 setICCRltdData(byte[] value) {
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
     * {@link ATMTotals1 }
     * 
     * 
     */
    public List<ATMTotals1> getATMTtls() {
        if (atmTtls == null) {
            atmTtls = new ArrayList<ATMTotals1>();
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
     * {@link ATMCassette1 }
     * 
     * 
     */
    public List<ATMCassette1> getCsstt() {
        if (csstt == null) {
            csstt = new ArrayList<ATMCassette1>();
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
    public ATMTransaction3 addBndlPresntdAmt(BigDecimal bndlPresntdAmt) {
        getBndlPresntdAmt().add(bndlPresntdAmt);
        return this;
    }

    /**
     * Adds a new item to the incdnt list.
     * @see #getIncdnt()
     * 
     */
    public ATMTransaction3 addIncdnt(FailureReason4Code incdnt) {
        getIncdnt().add(incdnt);
        return this;
    }

    /**
     * Adds a new item to the incdntDtl list.
     * @see #getIncdntDtl()
     * 
     */
    public ATMTransaction3 addIncdntDtl(String incdntDtl) {
        getIncdntDtl().add(incdntDtl);
        return this;
    }

    /**
     * Adds a new item to the addtlChrg list.
     * @see #getAddtlChrg()
     * 
     */
    public ATMTransaction3 addAddtlChrg(DetailedAmount13 addtlChrg) {
        getAddtlChrg().add(addtlChrg);
        return this;
    }

    /**
     * Adds a new item to the aTMTtls list.
     * @see #getATMTtls()
     * 
     */
    public ATMTransaction3 addATMTtls(ATMTotals1 aTMTtls) {
        getATMTtls().add(aTMTtls);
        return this;
    }

    /**
     * Adds a new item to the csstt list.
     * @see #getCsstt()
     * 
     */
    public ATMTransaction3 addCsstt(ATMCassette1 csstt) {
        getCsstt().add(csstt);
        return this;
    }

}
