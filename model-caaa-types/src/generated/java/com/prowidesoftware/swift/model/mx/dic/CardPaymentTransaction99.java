
package com.prowidesoftware.swift.model.mx.dic;

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
 * Transaction information in the completion advice message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransaction99", propOrder = {
    "txCaptr",
    "txTp",
    "addtlSvc",
    "svcAttr",
    "lastTxFlg",
    "mrchntCtgyCd",
    "cstmrCnsnt",
    "cardPrgrmmPropsd",
    "cardPrgrmmApld",
    "saleRefId",
    "txId",
    "orgnlTx",
    "txSucss",
    "rvsl",
    "mrchntOvrrd",
    "failrRsn",
    "initrTxId",
    "rcptTxId",
    "rcncltnId",
    "intrchngData",
    "txDtls",
    "authstnRslt",
    "txVrfctnRslt",
    "mrchntRefData",
    "acctFr",
    "acctTo",
    "addtlTxData"
})
public class CardPaymentTransaction99 {

    @XmlElement(name = "TxCaptr")
    protected Boolean txCaptr;
    @XmlElement(name = "TxTp")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType12Code txTp;
    @XmlElement(name = "AddtlSvc")
    @XmlSchemaType(name = "string")
    protected List<CardPaymentServiceType9Code> addtlSvc;
    @XmlElement(name = "SvcAttr")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType3Code svcAttr;
    @XmlElement(name = "LastTxFlg")
    protected Boolean lastTxFlg;
    @XmlElement(name = "MrchntCtgyCd")
    protected String mrchntCtgyCd;
    @XmlElement(name = "CstmrCnsnt", type = Boolean.class)
    protected List<Boolean> cstmrCnsnt;
    @XmlElement(name = "CardPrgrmmPropsd")
    protected List<String> cardPrgrmmPropsd;
    @XmlElement(name = "CardPrgrmmApld")
    protected String cardPrgrmmApld;
    @XmlElement(name = "SaleRefId")
    protected String saleRefId;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "OrgnlTx")
    protected CardPaymentTransaction101 orgnlTx;
    @XmlElement(name = "TxSucss")
    protected boolean txSucss;
    @XmlElement(name = "Rvsl")
    protected Boolean rvsl;
    @XmlElement(name = "MrchntOvrrd")
    protected Boolean mrchntOvrrd;
    @XmlElement(name = "FailrRsn")
    @XmlSchemaType(name = "string")
    protected List<FailureReason3Code> failrRsn;
    @XmlElement(name = "InitrTxId")
    protected String initrTxId;
    @XmlElement(name = "RcptTxId")
    protected String rcptTxId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "IntrchngData")
    protected String intrchngData;
    @XmlElement(name = "TxDtls", required = true)
    protected CardPaymentTransactionDetails48 txDtls;
    @XmlElement(name = "AuthstnRslt")
    protected AuthorisationResult11 authstnRslt;
    @XmlElement(name = "TxVrfctnRslt")
    protected List<TransactionVerificationResult4> txVrfctnRslt;
    @XmlElement(name = "MrchntRefData")
    protected String mrchntRefData;
    @XmlElement(name = "AcctFr")
    protected CardAccount15 acctFr;
    @XmlElement(name = "AcctTo")
    protected CardAccount15 acctTo;
    @XmlElement(name = "AddtlTxData")
    protected List<String> addtlTxData;

    /**
     * Gets the value of the txCaptr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTxCaptr() {
        return txCaptr;
    }

    /**
     * Sets the value of the txCaptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardPaymentTransaction99 setTxCaptr(Boolean value) {
        this.txCaptr = value;
        return this;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType12Code }
     *     
     */
    public CardPaymentServiceType12Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType12Code }
     *     
     */
    public CardPaymentTransaction99 setTxTp(CardPaymentServiceType12Code value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the addtlSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentServiceType9Code }
     * 
     * 
     */
    public List<CardPaymentServiceType9Code> getAddtlSvc() {
        if (addtlSvc == null) {
            addtlSvc = new ArrayList<CardPaymentServiceType9Code>();
        }
        return this.addtlSvc;
    }

    /**
     * Gets the value of the svcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType3Code }
     *     
     */
    public CardPaymentServiceType3Code getSvcAttr() {
        return svcAttr;
    }

    /**
     * Sets the value of the svcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType3Code }
     *     
     */
    public CardPaymentTransaction99 setSvcAttr(CardPaymentServiceType3Code value) {
        this.svcAttr = value;
        return this;
    }

    /**
     * Gets the value of the lastTxFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastTxFlg() {
        return lastTxFlg;
    }

    /**
     * Sets the value of the lastTxFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardPaymentTransaction99 setLastTxFlg(Boolean value) {
        this.lastTxFlg = value;
        return this;
    }

    /**
     * Gets the value of the mrchntCtgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntCtgyCd() {
        return mrchntCtgyCd;
    }

    /**
     * Sets the value of the mrchntCtgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction99 setMrchntCtgyCd(String value) {
        this.mrchntCtgyCd = value;
        return this;
    }

    /**
     * Gets the value of the cstmrCnsnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cstmrCnsnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstmrCnsnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getCstmrCnsnt() {
        if (cstmrCnsnt == null) {
            cstmrCnsnt = new ArrayList<Boolean>();
        }
        return this.cstmrCnsnt;
    }

    /**
     * Gets the value of the cardPrgrmmPropsd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardPrgrmmPropsd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardPrgrmmPropsd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCardPrgrmmPropsd() {
        if (cardPrgrmmPropsd == null) {
            cardPrgrmmPropsd = new ArrayList<String>();
        }
        return this.cardPrgrmmPropsd;
    }

    /**
     * Gets the value of the cardPrgrmmApld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPrgrmmApld() {
        return cardPrgrmmApld;
    }

    /**
     * Sets the value of the cardPrgrmmApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction99 setCardPrgrmmApld(String value) {
        this.cardPrgrmmApld = value;
        return this;
    }

    /**
     * Gets the value of the saleRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefId() {
        return saleRefId;
    }

    /**
     * Sets the value of the saleRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction99 setSaleRefId(String value) {
        this.saleRefId = value;
        return this;
    }

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
    public CardPaymentTransaction99 setTxId(TransactionIdentifier1 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction101 }
     *     
     */
    public CardPaymentTransaction101 getOrgnlTx() {
        return orgnlTx;
    }

    /**
     * Sets the value of the orgnlTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction101 }
     *     
     */
    public CardPaymentTransaction99 setOrgnlTx(CardPaymentTransaction101 value) {
        this.orgnlTx = value;
        return this;
    }

    /**
     * Gets the value of the txSucss property.
     * 
     */
    public boolean isTxSucss() {
        return txSucss;
    }

    /**
     * Sets the value of the txSucss property.
     * 
     */
    public CardPaymentTransaction99 setTxSucss(boolean value) {
        this.txSucss = value;
        return this;
    }

    /**
     * Gets the value of the rvsl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRvsl() {
        return rvsl;
    }

    /**
     * Sets the value of the rvsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardPaymentTransaction99 setRvsl(Boolean value) {
        this.rvsl = value;
        return this;
    }

    /**
     * Gets the value of the mrchntOvrrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMrchntOvrrd() {
        return mrchntOvrrd;
    }

    /**
     * Sets the value of the mrchntOvrrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardPaymentTransaction99 setMrchntOvrrd(Boolean value) {
        this.mrchntOvrrd = value;
        return this;
    }

    /**
     * Gets the value of the failrRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failrRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailrRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailureReason3Code }
     * 
     * 
     */
    public List<FailureReason3Code> getFailrRsn() {
        if (failrRsn == null) {
            failrRsn = new ArrayList<FailureReason3Code>();
        }
        return this.failrRsn;
    }

    /**
     * Gets the value of the initrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitrTxId() {
        return initrTxId;
    }

    /**
     * Sets the value of the initrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction99 setInitrTxId(String value) {
        this.initrTxId = value;
        return this;
    }

    /**
     * Gets the value of the rcptTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptTxId() {
        return rcptTxId;
    }

    /**
     * Sets the value of the rcptTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction99 setRcptTxId(String value) {
        this.rcptTxId = value;
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
    public CardPaymentTransaction99 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the intrchngData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrchngData() {
        return intrchngData;
    }

    /**
     * Sets the value of the intrchngData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction99 setIntrchngData(String value) {
        this.intrchngData = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransactionDetails48 }
     *     
     */
    public CardPaymentTransactionDetails48 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransactionDetails48 }
     *     
     */
    public CardPaymentTransaction99 setTxDtls(CardPaymentTransactionDetails48 value) {
        this.txDtls = value;
        return this;
    }

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult11 }
     *     
     */
    public AuthorisationResult11 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult11 }
     *     
     */
    public CardPaymentTransaction99 setAuthstnRslt(AuthorisationResult11 value) {
        this.authstnRslt = value;
        return this;
    }

    /**
     * Gets the value of the txVrfctnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txVrfctnRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxVrfctnRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionVerificationResult4 }
     * 
     * 
     */
    public List<TransactionVerificationResult4> getTxVrfctnRslt() {
        if (txVrfctnRslt == null) {
            txVrfctnRslt = new ArrayList<TransactionVerificationResult4>();
        }
        return this.txVrfctnRslt;
    }

    /**
     * Gets the value of the mrchntRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntRefData() {
        return mrchntRefData;
    }

    /**
     * Sets the value of the mrchntRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction99 setMrchntRefData(String value) {
        this.mrchntRefData = value;
        return this;
    }

    /**
     * Gets the value of the acctFr property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount15 }
     *     
     */
    public CardAccount15 getAcctFr() {
        return acctFr;
    }

    /**
     * Sets the value of the acctFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount15 }
     *     
     */
    public CardPaymentTransaction99 setAcctFr(CardAccount15 value) {
        this.acctFr = value;
        return this;
    }

    /**
     * Gets the value of the acctTo property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount15 }
     *     
     */
    public CardAccount15 getAcctTo() {
        return acctTo;
    }

    /**
     * Sets the value of the acctTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount15 }
     *     
     */
    public CardPaymentTransaction99 setAcctTo(CardAccount15 value) {
        this.acctTo = value;
        return this;
    }

    /**
     * Gets the value of the addtlTxData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlTxData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlTxData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlTxData() {
        if (addtlTxData == null) {
            addtlTxData = new ArrayList<String>();
        }
        return this.addtlTxData;
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
     * Adds a new item to the addtlSvc list.
     * @see #getAddtlSvc()
     * 
     */
    public CardPaymentTransaction99 addAddtlSvc(CardPaymentServiceType9Code addtlSvc) {
        getAddtlSvc().add(addtlSvc);
        return this;
    }

    /**
     * Adds a new item to the cstmrCnsnt list.
     * @see #getCstmrCnsnt()
     * 
     */
    public CardPaymentTransaction99 addCstmrCnsnt(Boolean cstmrCnsnt) {
        getCstmrCnsnt().add(cstmrCnsnt);
        return this;
    }

    /**
     * Adds a new item to the cardPrgrmmPropsd list.
     * @see #getCardPrgrmmPropsd()
     * 
     */
    public CardPaymentTransaction99 addCardPrgrmmPropsd(String cardPrgrmmPropsd) {
        getCardPrgrmmPropsd().add(cardPrgrmmPropsd);
        return this;
    }

    /**
     * Adds a new item to the failrRsn list.
     * @see #getFailrRsn()
     * 
     */
    public CardPaymentTransaction99 addFailrRsn(FailureReason3Code failrRsn) {
        getFailrRsn().add(failrRsn);
        return this;
    }

    /**
     * Adds a new item to the txVrfctnRslt list.
     * @see #getTxVrfctnRslt()
     * 
     */
    public CardPaymentTransaction99 addTxVrfctnRslt(TransactionVerificationResult4 txVrfctnRslt) {
        getTxVrfctnRslt().add(txVrfctnRslt);
        return this;
    }

    /**
     * Adds a new item to the addtlTxData list.
     * @see #getAddtlTxData()
     * 
     */
    public CardPaymentTransaction99 addAddtlTxData(String addtlTxData) {
        getAddtlTxData().add(addtlTxData);
        return this;
    }

}
