
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
 * Transaction information in the cancellation advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransaction116", propOrder = {
    "mrchntCtgyCd",
    "cstmrCnsnt",
    "cardPrgrmmPropsd",
    "cardPrgrmmApld",
    "saleRefId",
    "txId",
    "orgnlTx",
    "txSucss",
    "rvsl",
    "failrRsn",
    "initrTxId",
    "rcptTxId",
    "rcncltnId",
    "intrchngData",
    "txDtls",
    "authstnRslt",
    "addtlTxData"
})
public class CardPaymentTransaction116 {

    @XmlElement(name = "MrchntCtgyCd", required = true)
    protected String mrchntCtgyCd;
    @XmlElement(name = "CstmrCnsnt")
    protected Boolean cstmrCnsnt;
    @XmlElement(name = "CardPrgrmmPropsd")
    protected List<String> cardPrgrmmPropsd;
    @XmlElement(name = "CardPrgrmmApld")
    protected String cardPrgrmmApld;
    @XmlElement(name = "SaleRefId")
    protected String saleRefId;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "OrgnlTx")
    protected CardPaymentTransaction122 orgnlTx;
    @XmlElement(name = "TxSucss")
    protected boolean txSucss;
    @XmlElement(name = "Rvsl")
    protected Boolean rvsl;
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
    protected CardPaymentTransactionDetails50 txDtls;
    @XmlElement(name = "AuthstnRslt")
    protected AuthorisationResult19 authstnRslt;
    @XmlElement(name = "AddtlTxData")
    protected List<String> addtlTxData;

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
    public CardPaymentTransaction116 setMrchntCtgyCd(String value) {
        this.mrchntCtgyCd = value;
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
    public CardPaymentTransaction116 setCstmrCnsnt(Boolean value) {
        this.cstmrCnsnt = value;
        return this;
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
    public CardPaymentTransaction116 setCardPrgrmmApld(String value) {
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
    public CardPaymentTransaction116 setSaleRefId(String value) {
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
    public CardPaymentTransaction116 setTxId(TransactionIdentifier1 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction122 }
     *     
     */
    public CardPaymentTransaction122 getOrgnlTx() {
        return orgnlTx;
    }

    /**
     * Sets the value of the orgnlTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction122 }
     *     
     */
    public CardPaymentTransaction116 setOrgnlTx(CardPaymentTransaction122 value) {
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
    public CardPaymentTransaction116 setTxSucss(boolean value) {
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
    public CardPaymentTransaction116 setRvsl(Boolean value) {
        this.rvsl = value;
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
    public CardPaymentTransaction116 setInitrTxId(String value) {
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
    public CardPaymentTransaction116 setRcptTxId(String value) {
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
    public CardPaymentTransaction116 setRcncltnId(String value) {
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
    public CardPaymentTransaction116 setIntrchngData(String value) {
        this.intrchngData = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransactionDetails50 }
     *     
     */
    public CardPaymentTransactionDetails50 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransactionDetails50 }
     *     
     */
    public CardPaymentTransaction116 setTxDtls(CardPaymentTransactionDetails50 value) {
        this.txDtls = value;
        return this;
    }

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult19 }
     *     
     */
    public AuthorisationResult19 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult19 }
     *     
     */
    public CardPaymentTransaction116 setAuthstnRslt(AuthorisationResult19 value) {
        this.authstnRslt = value;
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
     * Adds a new item to the cardPrgrmmPropsd list.
     * @see #getCardPrgrmmPropsd()
     * 
     */
    public CardPaymentTransaction116 addCardPrgrmmPropsd(String cardPrgrmmPropsd) {
        getCardPrgrmmPropsd().add(cardPrgrmmPropsd);
        return this;
    }

    /**
     * Adds a new item to the failrRsn list.
     * @see #getFailrRsn()
     * 
     */
    public CardPaymentTransaction116 addFailrRsn(FailureReason3Code failrRsn) {
        getFailrRsn().add(failrRsn);
        return this;
    }

    /**
     * Adds a new item to the addtlTxData list.
     * @see #getAddtlTxData()
     * 
     */
    public CardPaymentTransaction116 addAddtlTxData(String addtlTxData) {
        getAddtlTxData().add(addtlTxData);
        return this;
    }

}
